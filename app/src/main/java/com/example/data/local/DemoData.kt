package com.example.data.local

import com.example.data.models.*

object DemoData {

    val pharmacies = listOf(
        Pharmacy(
            id = "pharmacy_1",
            name = "صيدلية المركز الرئيسية (صيدلية 1)",
            salesToday = 14500.0,
            salesMonth = 125000.0,
            purchasesMonth = 42000.0,
            profitMonth = 48000.0,
            totalInventoryItems = 380,
            lowStockCount = 4,
            staffCount = 5,
            txCountToday = 82,
            avgTicket = 176.8
        ),
        Pharmacy(
            id = "pharmacy_2",
            name = "صيدلية قسم العيادات (صيدلية 2)",
            salesToday = 9200.0,
            salesMonth = 88000.0,
            purchasesMonth = 31000.0,
            profitMonth = 31500.0,
            totalInventoryItems = 260,
            lowStockCount = 8,
            staffCount = 3,
            txCountToday = 54,
            avgTicket = 170.3
        ),
        Pharmacy(
            id = "pharmacy_3",
            name = "صيدلية الطوارئ - 24 ساعة (صيدلية 3)",
            salesToday = 18900.0,
            salesMonth = 152000.0,
            purchasesMonth = 53000.0,
            profitMonth = 61000.0,
            totalInventoryItems = 410,
            lowStockCount = 2,
            staffCount = 6,
            txCountToday = 114,
            avgTicket = 165.7
        ),
        Pharmacy(
            id = "pharmacy_4",
            name = "صيدلية قسم الأطفال والنساء (صيدلية 4)",
            salesToday = 11300.0,
            salesMonth = 98000.0,
            purchasesMonth = 34000.0,
            profitMonth = 36800.0,
            totalInventoryItems = 290,
            lowStockCount = 5,
            staffCount = 4,
            txCountToday = 68,
            avgTicket = 166.1
        ),
        Pharmacy(
            id = "central_warehouse",
            name = "المستودع المركزي الرئيسي",
            salesToday = 0.0,
            salesMonth = 0.0,
            purchasesMonth = 180000.0,
            profitMonth = 0.0,
            totalInventoryItems = 1200,
            lowStockCount = 12,
            staffCount = 3,
            txCountToday = 0,
            avgTicket = 0.0
        )
    )

    val medicines = listOf(
        Medicine(
            tradeName = "بنادول إكسترا (Panadol Extra)",
            genericName = "Paracetamol + Caffeine",
            concentration = "500mg / 65mg",
            dosageForm = "أقراص",
            company = "GSK Healthcare",
            stockQuantity = 140,
            costPrice = 12.0,
            sellingPrice = 18.0,
            expiryDate = "2026-12-15",
            batchNumber = "GSK-99812",
            supplier = "شركة الدواء التخصصية",
            storageLocation = "رف A-01",
            pharmacyId = "pharmacy_1",
            minStockAlert = 30
        ),
        Medicine(
            tradeName = "أوجمنتين (Augmentin)",
            genericName = "Amoxicillin + Clavulanic Acid",
            concentration = "1g",
            dosageForm = "أقراص مغلفة",
            company = "GSK Healthcare",
            stockQuantity = 8, // Low Stock Alert!
            costPrice = 45.0,
            sellingPrice = 65.0,
            expiryDate = "2026-08-30", // Near expiry FEFO
            batchNumber = "AUG-4421",
            supplier = "الشركة العربية للأدوية",
            storageLocation = "رف B-04",
            pharmacyId = "pharmacy_1",
            minStockAlert = 20
        ),
        Medicine(
            tradeName = "ليبيتور (Lipitor)",
            genericName = "Atorvastatin",
            concentration = "20mg",
            dosageForm = "أقراص",
            company = "Pfizer",
            stockQuantity = 65,
            costPrice = 80.0,
            sellingPrice = 115.0,
            expiryDate = "2027-03-20",
            batchNumber = "PFZ-1022",
            supplier = "المتحدة للصيدلة",
            storageLocation = "رف C-02",
            pharmacyId = "pharmacy_1"
        ),
        Medicine(
            tradeName = "كونكور (Concor)",
            genericName = "Bisoprolol",
            concentration = "5mg",
            dosageForm = "أقراص",
            company = "Merck",
            stockQuantity = 45,
            costPrice = 30.0,
            sellingPrice = 46.0,
            expiryDate = "2026-09-10",
            batchNumber = "MRC-304",
            supplier = "مستودع الشرق الطبية",
            storageLocation = "رف C-05",
            pharmacyId = "pharmacy_2"
        ),
        Medicine(
            tradeName = "جلوكوفاج (Glucophage)",
            genericName = "Metformin",
            concentration = "1000mg",
            dosageForm = "أقراص ممتدة المفعول",
            company = "Merck",
            stockQuantity = 5, // Low stock
            costPrice = 22.0,
            sellingPrice = 34.0,
            expiryDate = "2026-10-01",
            batchNumber = "MRC-881",
            supplier = "مستودع الشرق الطبية",
            storageLocation = "رف D-01",
            pharmacyId = "pharmacy_2",
            minStockAlert = 25
        ),
        Medicine(
            tradeName = "فنتولين بخاخ (Ventolin Evohaler)",
            genericName = "Salbutamol Inhaler",
            concentration = "100mcg",
            dosageForm = "بخاخ استنشاق",
            company = "GSK",
            stockQuantity = 90,
            costPrice = 18.0,
            sellingPrice = 28.0,
            expiryDate = "2027-06-15",
            batchNumber = "GSK-7711",
            supplier = "الشركة العربية للأدوية",
            storageLocation = "رف E-03",
            pharmacyId = "pharmacy_3"
        ),
        Medicine(
            tradeName = "بروفين (Brufen)",
            genericName = "Ibuprofen",
            concentration = "400mg",
            dosageForm = "أقراص",
            company = "Abbott",
            stockQuantity = 180,
            costPrice = 14.0,
            sellingPrice = 22.0,
            expiryDate = "2026-08-05", // FEFO near expiry
            batchNumber = "ABT-9921",
            supplier = "المتحدة للصيدلة",
            storageLocation = "رف A-08",
            pharmacyId = "pharmacy_3"
        ),
        Medicine(
            tradeName = "نكسيوم (Nexium)",
            genericName = "Esomeprazole",
            concentration = "40mg",
            dosageForm = "كبسولات",
            company = "AstraZeneca",
            stockQuantity = 40,
            costPrice = 75.0,
            sellingPrice = 110.0,
            expiryDate = "2027-01-30",
            batchNumber = "AZ-3301",
            supplier = "الشركة الدولية للأدوية",
            storageLocation = "رف F-02",
            pharmacyId = "pharmacy_4"
        ),
        Medicine(
            tradeName = "شراب أدول للأطفال (Adol Suspension)",
            genericName = "Paracetamol Child",
            concentration = "120mg / 5ml",
            dosageForm = "شراب",
            company = "Julphar",
            stockQuantity = 3, // Low Stock Alert
            costPrice = 8.0,
            sellingPrice = 14.0,
            expiryDate = "2026-09-25",
            batchNumber = "JLP-552",
            supplier = "جلفار للحلول الطبية",
            storageLocation = "رف K-01",
            pharmacyId = "pharmacy_4",
            minStockAlert = 20
        ),
        Medicine(
            tradeName = "مستودع - بنادول باكت (Panadol Bulk Box)",
            genericName = "Paracetamol 500mg",
            concentration = "500mg",
            dosageForm = "صندوق 100 عبوة",
            company = "GSK",
            stockQuantity = 500,
            costPrice = 1000.0,
            sellingPrice = 1500.0,
            expiryDate = "2028-01-01",
            batchNumber = "WH-00192",
            supplier = "GSK Direct",
            storageLocation = "المستودع الرئيسي - M1",
            pharmacyId = "central_warehouse"
        ),
        Medicine(
            tradeName = "مستودع - مضاد كلافوكس (Clavox Powder)",
            genericName = "Amoxicillin powder",
            concentration = "312mg/5ml",
            dosageForm = "مسحوق شراب",
            company = "Spimaco",
            stockQuantity = 350,
            costPrice = 18.0,
            sellingPrice = 28.0,
            expiryDate = "2027-11-20",
            batchNumber = "SPM-4012",
            supplier = "سبيماكو الدوائية",
            storageLocation = "المستودع الرئيسي - M3",
            pharmacyId = "central_warehouse"
        )
    )

    val employees = listOf(
        Employee(
            name = "د. خالد السعيد",
            jobTitle = "استشاري أمراض باطنية ومدير طبي",
            role = UserRole.DOCTOR,
            department = "الباطنية",
            branchOrPharmacy = "المركز الرئيسي",
            phone = "+966 50 111 2233",
            hireDate = "2020-01-15",
            monthlySalary = 32000.0,
            attendanceStatus = "حاضر",
            clockInTime = "07:50 ص"
        ),
        Employee(
            name = "د. فاطمة الزهراني",
            jobTitle = "استشارية أطفال",
            role = UserRole.DOCTOR,
            department = "الأطفال",
            branchOrPharmacy = "المركز الرئيسي",
            phone = "+966 50 222 3344",
            hireDate = "2021-03-10",
            monthlySalary = 28000.0,
            attendanceStatus = "حاضر",
            clockInTime = "08:02 ص"
        ),
        Employee(
            name = "د. طارق المنصور",
            jobTitle = "استشاري جراحة عامة",
            role = UserRole.DOCTOR,
            department = "الجراحة",
            branchOrPharmacy = "المركز الرئيسي",
            phone = "+966 50 333 4455",
            hireDate = "2019-06-01",
            monthlySalary = 38000.0,
            attendanceStatus = "حاضر",
            clockInTime = "07:30 ص"
        ),
        Employee(
            name = "د. نورة الشمري",
            jobTitle = "استشارية نساء وولادة",
            role = UserRole.DOCTOR,
            department = "النساء والولادة",
            branchOrPharmacy = "المركز الرئيسي",
            phone = "+966 50 444 5566",
            hireDate = "2021-09-01",
            monthlySalary = 29000.0,
            attendanceStatus = "إجازة",
            clockInTime = "-"
        ),
        Employee(
            name = "د. عمر الحربي",
            jobTitle = "طبيب أخصائي أشعة",
            role = UserRole.RADIOLOGY_TECH,
            department = "الأشعة",
            branchOrPharmacy = "المركز الرئيسي",
            phone = "+966 50 555 6677",
            hireDate = "2022-02-15",
            monthlySalary = 22000.0,
            attendanceStatus = "حاضر",
            clockInTime = "08:10 ص"
        ),
        Employee(
            name = "د. أحمد القحطاني",
            jobTitle = "صيدلي أول - مدير الصيدليات",
            role = UserRole.PHARMACIST,
            department = "الصيدليات",
            branchOrPharmacy = "صيدلية 1",
            phone = "+966 50 666 7788",
            hireDate = "2018-05-20",
            monthlySalary = 18000.0,
            attendanceStatus = "حاضر",
            clockInTime = "07:45 ص"
        ),
        Employee(
            name = "سارة الغامدي",
            jobTitle = "صيدلانية مسؤول صيدلية 2",
            role = UserRole.PHARMACIST,
            department = "الصيدليات",
            branchOrPharmacy = "صيدلية 2",
            phone = "+966 50 777 8899",
            hireDate = "2022-08-01",
            monthlySalary = 14000.0,
            attendanceStatus = "غائب",
            clockInTime = "-"
        ),
        Employee(
            name = "يوسف العتيبي",
            jobTitle = "صيدلي طوارئ - صيدلية 3",
            role = UserRole.PHARMACIST,
            department = "الصيدليات",
            branchOrPharmacy = "صيدلية 3",
            phone = "+966 50 888 9900",
            hireDate = "2023-01-10",
            monthlySalary = 13500.0,
            attendanceStatus = "حاضر",
            clockInTime = "08:00 ص"
        ),
        Employee(
            name = "منى الدوسري",
            jobTitle = "أخصائية تحاليل مخبرية",
            role = UserRole.LAB_TECH,
            department = "المختبر",
            branchOrPharmacy = "المركز الرئيسي",
            phone = "+966 50 999 0011",
            hireDate = "2021-11-15",
            monthlySalary = 16000.0,
            attendanceStatus = "حاضر",
            clockInTime = "07:55 ص"
        ),
        Employee(
            name = "عبدالعزيز المالكي",
            jobTitle = "محاسب رئيسي للمركز",
            role = UserRole.ACCOUNTANT,
            department = "المالية",
            branchOrPharmacy = "الإدارة",
            phone = "+966 50 123 4567",
            hireDate = "2020-04-01",
            monthlySalary = 15000.0,
            attendanceStatus = "حاضر",
            clockInTime = "08:00 ص"
        ),
        Employee(
            name = "ريم المطيري",
            jobTitle = "موظفة استقبال رئيسية",
            role = UserRole.RECEPTIONIST,
            department = "الاستقبال",
            branchOrPharmacy = "الاستقبال العام",
            phone = "+966 50 234 5678",
            hireDate = "2023-05-10",
            monthlySalary = 8500.0,
            attendanceStatus = "حاضر",
            clockInTime = "07:40 ص"
        )
    )

    val patients = listOf(
        Patient(
            fileNumber = "P-1001",
            name = "محمد بن عبدالله الشهري",
            phone = "+966 55 123 9988",
            age = 42,
            gender = "ذكر",
            nationalId = "1098234711",
            bloodType = "O+",
            allergies = "حساسية من البنسلين"
        ),
        Patient(
            fileNumber = "P-1002",
            name = "نورة بنت سعد العلي",
            phone = "+966 55 234 8877",
            age = 29,
            gender = "أنثى",
            nationalId = "1087223344",
            bloodType = "A+",
            allergies = "لا يوجد"
        ),
        Patient(
            fileNumber = "P-1003",
            name = "الطفل راكان أحمد العتيبي",
            phone = "+966 55 345 7766",
            age = 6,
            gender = "ذكر",
            nationalId = "1123998877",
            bloodType = "B+",
            allergies = "لا يوجد"
        ),
        Patient(
            fileNumber = "P-1004",
            name = "سليمان بن إبراهيم الراجحي",
            phone = "+966 55 456 6655",
            age = 61,
            gender = "ذكر",
            nationalId = "1011223344",
            bloodType = "AB+",
            allergies = "حساسية أسبرين"
        ),
        Patient(
            fileNumber = "P-1005",
            name = "مريم بنت فهد الدوسري",
            phone = "+966 55 567 5544",
            age = 34,
            gender = "أنثى",
            nationalId = "1077665544",
            bloodType = "O-",
            allergies = "لا يوجد"
        )
    )

    val appointments = listOf(
        Appointment(
            patientName = "محمد بن عبدالله الشهري",
            patientPhone = "+966 55 123 9988",
            doctorName = "د. خالد السعيد",
            department = "الباطنية",
            appointmentDate = "2026-07-22",
            appointmentTime = "09:30 ص",
            status = "جاري",
            type = "طبيب"
        ),
        Appointment(
            patientName = "نورة بنت سعد العلي",
            patientPhone = "+966 55 234 8877",
            doctorName = "د. طارق المنصور",
            department = "الجراحة",
            appointmentDate = "2026-07-22",
            appointmentTime = "10:15 ص",
            status = "انتظار",
            type = "طبيب"
        ),
        Appointment(
            patientName = "الطفل راكان أحمد العتيبي",
            patientPhone = "+966 55 345 7766",
            doctorName = "د. فاطمة الزهراني",
            department = "الأطفال",
            appointmentDate = "2026-07-22",
            appointmentTime = "11:00 ص",
            status = "انتظار",
            type = "طبيب"
        ),
        Appointment(
            patientName = "سليمان بن إبراهيم الراجحي",
            patientPhone = "+966 55 456 6655",
            doctorName = "د. عمر الحربي",
            department = "الأشعة",
            appointmentDate = "2026-07-22",
            appointmentTime = "11:30 ص",
            status = "مكتمل",
            type = "أشعة"
        ),
        Appointment(
            patientName = "مريم بنت فهد الدوسري",
            patientPhone = "+966 55 567 5544",
            doctorName = "د. منى الدوسري",
            department = "المختبر",
            appointmentDate = "2026-07-22",
            appointmentTime = "12:00 م",
            status = "مكتمل",
            type = "مختبر"
        )
    )

    val financialRecords = listOf(
        FinancialRecord(
            type = "إيراد",
            title = "مبيعات صيدلية 3 (الطوارئ)",
            amount = 18900.0,
            category = "صيدليات",
            locationOrDept = "صيدلية 3",
            date = "2026-07-22",
            notes = "مبيعات اليوم للفترة الصباحية"
        ),
        FinancialRecord(
            type = "إيراد",
            title = "رسوم كشوفات قسم الباطنية والجراحة",
            amount = 8400.0,
            category = "عيادات",
            locationOrDept = "العيادات الخارجية",
            date = "2026-07-22",
            notes = "رسوم 28 مريض"
        ),
        FinancialRecord(
            type = "مصروف",
            title = "فاتورة كهرباء وتكييف المركز",
            amount = 4200.0,
            category = "تشغيل وصيانة",
            locationOrDept = "الإدارة العامة",
            date = "2026-07-21",
            notes = "استهلاك الشهر"
        ),
        FinancialRecord(
            type = "مشتريات",
            title = "شراء أدوات جراحة ومستلزمات معقمة",
            amount = 12500.0,
            category = "مستلزمات طبية",
            locationOrDept = "المستودع الرئيسي",
            date = "2026-07-20",
            notes = "مورد الشركة الدولية"
        ),
        FinancialRecord(
            type = "راتب",
            title = "مسير رواتب الأطباء والصيادلة",
            amount = 185000.0,
            category = "رواتب",
            locationOrDept = "المالية",
            date = "2026-07-01",
            notes = "شهر يونيو"
        )
    )

    val surgeries = listOf(
        Surgery(
            patientName = "نورة بنت سعد العلي",
            surgeonName = "د. طارق المنصور",
            surgeryType = "استئصال الزائدة الدودية بالمنظار",
            date = "2026-07-23",
            time = "08:00 ص",
            operatingRoom = "غرفة عمليات 1",
            medicalTeam = "د. طارق (جراح)، د. فهد (تخدير)، ممرض أحمد",
            status = "مجدولة"
        ),
        Surgery(
            patientName = "حسن علي العبيد",
            surgeonName = "د. طارق المنصور",
            surgeryType = "اصلاح فتق إربي",
            date = "2026-07-24",
            time = "10:30 ص",
            operatingRoom = "غرفة عمليات 2",
            medicalTeam = "د. طارق (جراح)، ممرضة سارة",
            status = "مجدولة"
        )
    )

    val labTests = listOf(
        LabTest(
            patientName = "مريم بنت فهد الدوسري",
            doctorName = "د. خالد السعيد",
            testType = "تحليل صورة الدم الكاملة (CBC) + السكر التراكمي",
            date = "2026-07-22",
            status = "مكتمل",
            resultSummary = "الهيموجلوبين: 13.2 | السكر التراكمي: 5.8% (طبيعي)"
        ),
        LabTest(
            patientName = "محمد بن عبدالله الشهري",
            doctorName = "د. خالد السعيد",
            testType = "وظائف الكبد والكلية (LFT & KFT)",
            date = "2026-07-22",
            status = "جاري الفحص",
            resultSummary = "العينة بالمختبر - جاري المعالجة"
        )
    )

    val radiologyScans = listOf(
        RadiologyScan(
            patientName = "سليمان بن إبراهيم الراجحي",
            doctorName = "د. عمر الحربي",
            scanType = "أشعة سينية للصدر (Chest X-Ray)",
            date = "2026-07-22",
            status = "التقرير جاهز",
            reportText = "لا يوجد ارتشاح رئوي، القلب ضمن الحجم الطبيعي"
        )
    )

    val notifications = listOf(
        NotificationItem(
            id = "n1",
            title = "⚠️ تنبيه مخزون منخفض جداً",
            message = "دواء أوجمنتين (Augmentin 1g) بقل المتبقي منه إلى 8 علب في صيدلية 1",
            severity = "عاجل",
            timestamp = "منذ 10 دقائق"
        ),
        NotificationItem(
            id = "n2",
            title = "⏳ أدوية قريبة من الانتهاء (FEFO)",
            message = "دواء بروفين 400 ملجم في صيدلية 3 سينتهي بعد 15 يوماً - يفضل تصريفه أولاً",
            severity = "مهم",
            timestamp = "منذ 30 دقيقة"
        ),
        NotificationItem(
            id = "n3",
            title = "👤 غياب موظف",
            message = "الصيدلانية سارة الغامدي غائبة اليوم في صيدلية 2 - يرجى توجيه تغطية",
            severity = "تنبيه",
            timestamp = "منذ ساعة"
        ),
        NotificationItem(
            id = "n4",
            title = "📅 موعد عملية جراحية غداً",
            message = "عملية استئصال زائدة للمريضة نورة العلي غداً الساعة 08:00 صباحاً",
            severity = "معلومات",
            timestamp = "منذ ساعتين"
        )
    )

    val conversations = listOf(
        Conversation(
            id = "group_management",
            title = "🏥 إدارة المركز والقيادة",
            subtitle = "أ.د. محي الدين الجعفري + رؤساء الأقسام",
            type = "GROUP",
            avatarInitials = "إدارة",
            lastMessage = "أ.د. محي الدين: تم اعتماد جدول المناوبات لشهر أغسطس",
            lastMessageTime = "04:10 م",
            unreadCount = 2,
            isPinned = true,
            isFavorite = true,
            presenceStatus = PresenceStatus.ONLINE,
            members = "مدير المركز, طبيب, صيدلي, محاسب",
            groupAdmin = "أ.د. محي الدين الجعفري",
            pinnedMessage = "📌 تعليمات السياسة المالية والتعامل مع حالات الطوارئ"
        ),
        Conversation(
            id = "conv_pharmacy1_wh",
            title = "💊 صيدلية 1 ↔ المستودع المركزي",
            subtitle = "مناقلات وتزويد أدوية طوارئ",
            type = "INDIVIDUAL",
            avatarInitials = "ص1",
            lastMessage = "صيدلي محمود: هل وصل طرد البنادول والأوجمنتين المطلوب؟",
            lastMessageTime = "03:45 م",
            unreadCount = 1,
            isPinned = true,
            presenceStatus = PresenceStatus.ONLINE
        ),
        Conversation(
            id = "linked_med_augmentin",
            title = "💬 مناقشة دواء: أوجمنتين (Augmentin 1g)",
            subtitle = "مرتبط بالصنـف #93 • المخزون الحرِج",
            type = "LINKED_WORK",
            avatarInitials = "دواء",
            lastMessage = "أ.د. محي الدين: تم اعتماد شراء 50 علبة من مستودع الشرق",
            lastMessageTime = "02:30 م",
            unreadCount = 0,
            isPinned = true,
            presenceStatus = PresenceStatus.ONLINE,
            linkedEntityType = "MEDICINE",
            linkedEntityId = "93",
            pinnedMessage = "📌 الدواء: Augmentin 1g | المخزون: 8 علب | الاستهلاك: 5 أيام"
        ),
        Conversation(
            id = "linked_patient_P8842",
            title = "💬 متابعة حالة المريض: أحمد علي (#P-8842)",
            subtitle = "فريق العيادات + المختبر",
            type = "LINKED_PATIENT",
            avatarInitials = "مريض",
            roleRequired = "DOCTOR",
            lastMessage = "فني المختبر: نتيجة تحليل CBC جاهزة الآن للمراجعة",
            lastMessageTime = "01:15 م",
            unreadCount = 3,
            isPinned = false,
            presenceStatus = PresenceStatus.ONLINE,
            linkedEntityType = "PATIENT",
            linkedEntityId = "P-8842",
            pinnedMessage = "📌 المريض: أحمد علي (#P-8842) | التحليل: CBC | الحالة: جاهز"
        ),
        Conversation(
            id = "group_doctors",
            title = "👨‍⚕️ كادر الأطباء والعيادات",
            subtitle = "الاستشارات والتنسيق المباشر بين الأطباء",
            type = "GROUP",
            avatarInitials = "أطباء",
            lastMessage = "د. خالد: تم تحويل حالة المريض رقم #8842 لقسم الأطفال",
            lastMessageTime = "12:50 م",
            unreadCount = 0,
            presenceStatus = PresenceStatus.ONLINE,
            members = "طبيب"
        ),
        Conversation(
            id = "group_pharmacists",
            title = "💊 فريق الصيدليات الأربع",
            subtitle = "تنسيق المخزون والمبيعات المناوبة",
            type = "GROUP",
            avatarInitials = "صيادلة",
            lastMessage = "صيدلي أحمد: تم فتح صيدلية الطوارئ 3 لنوبة الليل",
            lastMessageTime = "11:20 ص",
            unreadCount = 0,
            presenceStatus = PresenceStatus.ONLINE,
            members = "صيدلي"
        ),
        Conversation(
            id = "group_lab",
            title = "🧪 قسم المختبر والفحوصات",
            subtitle = "نتائج العينات والتحاليل العاجلة",
            type = "GROUP",
            avatarInitials = "مختبر",
            lastMessage = "فني المختبر: تم معايرة جهاز الفحص الآلي بنجاح",
            lastMessageTime = "09:10 ص",
            unreadCount = 0,
            presenceStatus = PresenceStatus.BUSY,
            members = "فني مختبر, طبيب"
        ),
        Conversation(
            id = "group_radiology",
            title = "🩻 قسم الأشعة والتصوير الطبي",
            subtitle = "تقارير الأشعة المقطعية والسونار",
            type = "GROUP",
            avatarInitials = "أشعة",
            lastMessage = "فني الأشعة: جاهزية استلام حالات السونار من العيادات",
            lastMessageTime = "أمس",
            unreadCount = 0,
            presenceStatus = PresenceStatus.OFFLINE,
            members = "فني أشعة, طبيب"
        ),
        Conversation(
            id = "group_warehouse",
            title = "📦 إدارة المستودع والمشتريات",
            subtitle = "طلبيات الموردين والشحنات القادمة",
            type = "GROUP",
            avatarInitials = "مستودع",
            lastMessage = "مسؤول المستودع: وصول شحنة المحاليل الطبية",
            lastMessageTime = "أمس",
            unreadCount = 0,
            presenceStatus = PresenceStatus.ONLINE
        )
    )

    val chatMessages = listOf(
        ChatMessage(
            id = 1,
            conversationId = "group_management",
            senderId = "emp_1",
            senderName = "أ.د. محي الدين الجعفري",
            senderRole = "المدير العام",
            messageType = MessageType.TEXT,
            content = "السلام عليكم ورحمة الله وبركاته، أرجو من جميع رؤساء الأقسام مراجعة خطة العمل وتزويدنا باحتياجات المخزون.",
            timestamp = "03:30 م",
            status = DeliveryStatus.READ,
            priority = MessagePriority.IMPORTANT,
            isPinned = true
        ),
        ChatMessage(
            id = 2,
            conversationId = "group_management",
            senderId = "emp_2",
            senderName = "د. سارة الأحمد",
            senderRole = "طبيب أطفال",
            messageType = MessageType.TEXT,
            content = "أهلاً دكتور محي الدين، تم حصر النواقص بقسم الأطفال وهي ممتازة حالياً.",
            timestamp = "03:35 م",
            status = DeliveryStatus.READ
        ),
        ChatMessage(
            id = 3,
            conversationId = "group_management",
            senderId = "emp_1",
            senderName = "أ.د. محي الدين الجعفري",
            senderRole = "المدير العام",
            messageType = MessageType.TEXT,
            content = "ممتاز جداً، تم اعتماد جدول المناوبات لشهر أغسطس @د. سارة @صيدلي محمود",
            timestamp = "04:10 م",
            status = DeliveryStatus.READ,
            mentions = "د. سارة الأحمد, صيدلي محمود"
        ),
        // Messages for conv_pharmacy1_wh
        ChatMessage(
            id = 4,
            conversationId = "conv_pharmacy1_wh",
            senderId = "emp_3",
            senderName = "صيدلي محمود حسن",
            senderRole = "صيدلية 1",
            messageType = MessageType.TEXT,
            content = "السلام عليكم، لدينا نقص حاد في أوجمنتين 1g وبنادول إكسترا في صيدلية 1.",
            timestamp = "03:40 م",
            status = DeliveryStatus.READ
        ),
        ChatMessage(
            id = 5,
            conversationId = "conv_pharmacy1_wh",
            senderId = "emp_wh",
            senderName = "مسؤول المستودع المركزي",
            senderRole = "المستودع",
            messageType = MessageType.LINKED_ENTITY,
            content = "تم تجهيز مناقلة مخزون عاجلة من بنادول إكسترا من المستودع المركزي.",
            linkedEntityType = "MEDICINE",
            linkedEntityId = "77",
            linkedEntityTitle = "بنادول إكسترا (Panadol Extra)",
            linkedEntitySubtitle = "المستودع: 450 علبة • الكمية المنقولة: 30 وحدة",
            timestamp = "03:42 م",
            status = DeliveryStatus.READ
        ),
        ChatMessage(
            id = 6,
            conversationId = "conv_pharmacy1_wh",
            senderId = "emp_3",
            senderName = "صيدلي محمود حسن",
            senderRole = "صيدلية 1",
            messageType = MessageType.TEXT,
            content = "هل وصل طرد البنادول والأوجمنتين المطلوب؟",
            timestamp = "03:45 م",
            status = DeliveryStatus.DELIVERED
        ),
        // Messages for linked_med_augmentin
        ChatMessage(
            id = 7,
            conversationId = "linked_med_augmentin",
            senderId = "emp_3",
            senderName = "صيدلي محمود حسن",
            senderRole = "صيدلي",
            messageType = MessageType.LINKED_ENTITY,
            content = "هل نطلب كمية إضافية من هذا الدواء؟ الكمية المتبقية 8 علب فقط والاستهلاك المتوقع 5 أيام.",
            linkedEntityType = "MEDICINE",
            linkedEntityId = "93",
            linkedEntityTitle = "أوجمنتين (Augmentin 1g)",
            linkedEntitySubtitle = "المخزون الحالي: 8 علب • حد الإنذار: 10 علب",
            timestamp = "02:10 م",
            status = DeliveryStatus.READ
        ),
        ChatMessage(
            id = 8,
            conversationId = "linked_med_augmentin",
            senderId = "emp_1",
            senderName = "أ.د. محي الدين الجعفري",
            senderRole = "المدير العام",
            messageType = MessageType.TASK,
            content = "نعم، أرجو إصدار أمر توريد عاجل بـ 50 علبة من المورد التخصصي.",
            timestamp = "02:30 م",
            status = DeliveryStatus.READ,
            priority = MessagePriority.URGENT
        ),
        // Messages for linked_patient_P8842
        ChatMessage(
            id = 9,
            conversationId = "linked_patient_P8842",
            senderId = "emp_2",
            senderName = "د. سارة الأحمد",
            senderRole = "طبيب",
            messageType = MessageType.LINKED_ENTITY,
            content = "أحتاج مراجعة نتيجة المختبر العاجلة للمريض.",
            linkedEntityType = "PATIENT",
            linkedEntityId = "P-8842",
            linkedEntityTitle = "المريض: أحمد علي (ملف رقم #P-8842)",
            linkedEntitySubtitle = "التحليل المطلوب: صورة دم كاملة (CBC)",
            timestamp = "01:00 م",
            status = DeliveryStatus.READ
        ),
        ChatMessage(
            id = 10,
            conversationId = "linked_patient_P8842",
            senderId = "emp_lab",
            senderName = "فني المختبر علي",
            senderRole = "فني مختبر",
            messageType = MessageType.PATIENT_REPORT,
            content = "نتيجة تحليل CBC جاهزة الآن للمراجعة. الهيموجلوبين: 13.5 - الكريات البيضاء: طبيعية.",
            attachmentName = "تقرير_تحليل_CBC_أحمد_علي.pdf",
            attachmentSize = "1.2 MB",
            timestamp = "01:15 م",
            status = DeliveryStatus.READ
        )
    )

    val announcements = listOf(
        InternalAnnouncement(
            id = 1,
            title = "📢 تعميم إداري: صيانة صيدلية العيادات (صيدلية 2)",
            content = "سيتم إغلاق الصيدلية 2 للصيانة وتحديث الأجهزة غداً من الساعة 9 صباحاً حتى 12 ظهراً. يرجى توجيه المرضى لصيدلية 1 أو 3.",
            senderName = "أ.د. محي الدين الجعفري",
            senderRole = "المدير العام",
            targetAudience = "الجميع",
            date = "اليوم 08:00 ص",
            isUrgent = true
        ),
        InternalAnnouncement(
            id = 2,
            title = "📢 توفر كمية جديدة من خافضات الحرارة والمضادات",
            content = "تم استلام شحنة جديدة بالمستودع المركزي. يمكن لكافة الصيدليات طلب المناقلات عبر النظام الداخلي.",
            senderName = "إدارة المستودع المركزي",
            senderRole = "المستودع",
            targetAudience = "الصيادلة",
            date = "أمس 04:30 م",
            isUrgent = false
        )
    )

    val tasks = listOf(
        TaskItem(
            id = 1,
            sourceMessageId = 5,
            title = "نقل 30 وحدة بنادول إكسترا إلى صيدلية 3",
            description = "مناقلة مخزونية لتغطية صيدلية الطوارئ 24 ساعة",
            assigneeName = "صيدلي محمود حسن",
            assigneeRole = "صيدلية 3",
            creatorName = "أ.د. محي الدين الجعفري",
            priority = "عاجل",
            dueDate = "اليوم 06:00 م",
            status = "قيد التنفيذ"
        ),
        TaskItem(
            id = 2,
            sourceMessageId = 9,
            title = "مراجعة نتيجة تحليل CBC للمريض أحمد علي (#P-8842)",
            description = "اعتماد التقرير الطبي ومتابعة العلاج بقسم الأطفال",
            assigneeName = "د. سارة الأحمد",
            assigneeRole = "طبيب أطفال",
            creatorName = "فني المختبر علي",
            priority = "مهم",
            dueDate = "اليوم 03:00 م",
            status = "جديدة"
        ),
        TaskItem(
            id = 3,
            sourceMessageId = null,
            title = "صيانة جهاز السونار بقسم الأشعة",
            description = "فحص ومعايرة الحساس الصوتي للعيادة 2",
            assigneeName = "مهندس الصيانة",
            assigneeRole = "الصيانة",
            creatorName = "أ.د. محي الدين الجعفري",
            priority = "عادي",
            dueDate = "أمس",
            status = "مكتملة",
            completedBy = "مهندس الصيانة",
            completedAt = "أمس 05:00 م"
        )
    )

    val medicalHistoryRecords = listOf(
        MedicalHistoryRecord(
            id = 1,
            patientId = 1,
            patientName = "أحمد محمد العتيبي",
            date = "2026-07-20",
            doctorName = "د. خالد منصور",
            department = "الباFormat الباطنية والقلب",
            diagnosisText = "ارتفاع ضغط الدم الشرياني الدرجة الأولى + إجهاد مزمن",
            prescription = "كونكور 5 ملجم قرص صباحاً + أسبرين 81 ملجم",
            notes = "ينصح بضبط الوجبات وتقليل الملح والمتابعة بعد شهر",
            status = "تحت المتابعة"
        ),
        MedicalHistoryRecord(
            id = 2,
            patientId = 1,
            patientName = "أحمد محمد العتيبي",
            date = "2026-05-12",
            doctorName = "د. سارة الأحمد",
            department = "العيادة العامة",
            diagnosisText = "التهاب الشعاب الهوائية الحاد وتعب عام",
            prescription = "أوجمنتين 1 جرام أقراص + بنادول إكسترا عند الحاجة",
            notes = "تماثل للشفاء التام بعد استكمال الجرعة العلاجية",
            status = "مكتمل"
        ),
        MedicalHistoryRecord(
            id = 3,
            patientId = 2,
            patientName = "فاطمة عبد الله الشهري",
            date = "2026-07-15",
            doctorName = "د. طارق الزهراني",
            department = "الغدد الصماء والسكري",
            diagnosisText = "سكري النوع الثاني المنسق بالحمية والدواء",
            prescription = "جلوكوفاج 850 ملجم مرتين يومياً + ليبيتور 20 ملجم",
            notes = "تحليل السكر التراكمي HbA1c 6.8%، حالة مستقرة",
            status = "مزمن"
        ),
        MedicalHistoryRecord(
            id = 4,
            patientId = 3,
            patientName = "عمر فاروق التميمي",
            date = "2026-07-25",
            doctorName = "د. يوسف القحطاني",
            department = "العظام والمفاصل",
            diagnosisText = "التواء الرباط الإنسي للركبة اليمنى من الدرجة الثانية",
            prescription = "مسكن بروفين 400 ملجم عند اللزوم + مشد ركبة طبي",
            notes = "تم توصية جلسات علاج طبيعي 3 مرات أسبوعياً",
            status = "تحت المتابعة"
        )
    )

    val medicationLogs = listOf(
        MedicationLog(
            id = 1,
            patientId = 1,
            patientName = "أحمد محمد العتيبي",
            medicineName = "كونكور 5mg (Concor)",
            dosage = "1 قرص",
            scheduledTime = "08:00 ص",
            status = "تم التناول",
            loggedTime = "08:05 ص",
            date = "2026-07-29"
        ),
        MedicationLog(
            id = 2,
            patientId = 1,
            patientName = "أحمد محمد العتيبي",
            medicineName = "أسبرين 81mg (Aspirin)",
            dosage = "1 قرص",
            scheduledTime = "02:00 م",
            status = "تم التناول",
            loggedTime = "02:15 م",
            date = "2026-07-29"
        ),
        MedicationLog(
            id = 3,
            patientId = 1,
            patientName = "أحمد محمد العتيبي",
            medicineName = "بنادول إكسترا (Panadol)",
            dosage = "1-2 قرص",
            scheduledTime = "09:00 م",
            status = "مجدول",
            loggedTime = "",
            date = "2026-07-29"
        ),
        MedicationLog(
            id = 4,
            patientId = 2,
            patientName = "فاطمة عبد الله الشهري",
            medicineName = "جلوكوفاج 850mg (Glucophage)",
            dosage = "1 قرص بعد الأكل",
            scheduledTime = "09:00 ص",
            status = "تم التناول",
            loggedTime = "09:10 ص",
            date = "2026-07-29"
        ),
        MedicationLog(
            id = 5,
            patientId = 2,
            patientName = "فاطمة عبد الله الشهري",
            medicineName = "ليبيتور 20mg (Lipitor)",
            dosage = "1 قرص قبل النوم",
            scheduledTime = "10:00 م",
            status = "مجدول",
            loggedTime = "",
            date = "2026-07-29"
        ),
        MedicationLog(
            id = 6,
            patientId = 3,
            patientName = "عمر فاروق التميمي",
            medicineName = "بروفين 400mg (Brufen)",
            dosage = "1 قرص عند اللزوم",
            scheduledTime = "01:00 م",
            status = "تم التخطي",
            loggedTime = "",
            date = "2026-07-29"
        )
    )
}


