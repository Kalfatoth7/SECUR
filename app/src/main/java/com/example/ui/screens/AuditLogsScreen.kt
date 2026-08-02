package com.example.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.models.UserRole
import com.example.ui.theme.*

data class AuditLogEntry(
    val id: Long,
    val userName: String,
    val role: String,
    val action: String,
    val details: String,
    val timestamp: String,
    val isCritical: Boolean = false
)

val sampleAuditLogs = listOf(
    AuditLogEntry(
        id = 101,
        userName = "أ.د. محي الدين الجعفري",
        role = "المدير العام",
        action = "اعتماد مناقلة مخزون",
        details = "تمت الموافقة على نقل 30 وحدة بنادول إكسترا من صيدلية 1 إلى صيدلية 3",
        timestamp = "اليوم 02:15 م",
        isCritical = false
    ),
    AuditLogEntry(
        id = 102,
        userName = "د. سارة الأحمد",
        role = "طبيب أطفال",
        action = "إضافة تشخيص طبي ووصفة",
        details = "تشخيص حالة مريض أحمد علي بملف رقم #P-8842",
        timestamp = "اليوم 01:40 م",
        isCritical = false
    ),
    AuditLogEntry(
        id = 103,
        userName = "أ.د. محي الدين الجعفري",
        role = "المدير العام",
        action = "تعديل تسعير دواء",
        details = "تعديل سعر بيع أوجمنتين 1g من 60 ج.م إلى 65 ج.م",
        timestamp = "اليوم 11:20 ص",
        isCritical = true
    ),
    AuditLogEntry(
        id = 104,
        userName = "صيدلي محمود حسن",
        role = "صيدلية 3",
        action = "إتمام فاتورة مبيعات",
        details = "إصدار فاتورة رقم #INV-9042 بقيمة 420.0 ج.م (نقدي)",
        timestamp = "اليوم 10:15 ص",
        isCritical = false
    ),
    AuditLogEntry(
        id = 105,
        userName = "موظفة الاستقبال فاطمة",
        role = "استقبال",
        action = "تسجيل مريض جديد",
        details = "إضافة ملف مريض جديد: مريم يوسف - رقم الهاتف: 01098765432",
        timestamp = "اليوم 09:30 ص",
        isCritical = false
    )
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuditLogsScreen(
    currentRole: UserRole,
    onRoleSelected: (UserRole) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Header
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "سجل الأمن والتدقيق الحساس (Audit Log)",
                    fontWeight = FontWeight.Black,
                    fontSize = 18.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = "تتبع كافة العمليات الحساسة، التعديلات المالية، وإدارة الصلاحيات",
                    fontSize = 11.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Icon(
                imageVector = Icons.Default.Shield,
                contentDescription = null,
                tint = AlRahmaGoldAccent,
                modifier = Modifier.size(28.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Role Selector Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(14.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text(
                    text = "دورك الحالي في النظام (اختبار الصلاحيات):",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = AlRahmaPrimary
                )
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = currentRole.arabicName,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = AlRahmaGoldContainer
                    ) {
                        Text(
                            text = "صلاحيات كاملة",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = AlRahmaOnGoldContainer,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Audit Log Items
        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(sampleAuditLogs) { entry ->
                AuditLogItemCard(entry = entry)
            }
        }
    }
}

@Composable
fun AuditLogItemCard(entry: AuditLogEntry) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.Top
        ) {
            Surface(
                shape = CircleShape,
                color = if (entry.isCritical) MaterialTheme.colorScheme.error.copy(alpha = 0.15f) else AlRahmaPrimary.copy(alpha = 0.15f),
                modifier = Modifier.size(36.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = if (entry.isCritical) Icons.Default.Warning else Icons.Default.History,
                        contentDescription = null,
                        tint = if (entry.isCritical) MaterialTheme.colorScheme.error else AlRahmaPrimary,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = entry.action, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                    Text(text = entry.timestamp, fontSize = 10.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "${entry.userName} (${entry.role})",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = AlRahmaPrimary
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = entry.details, fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
    }
}
