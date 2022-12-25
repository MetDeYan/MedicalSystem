# ОНЛАЙН МЕДИЦИНСКАЯ СИСТЕМА

## ВВЕДЕНИЕ
Бекэнд приложения, сделанный для пациентов и центров. 

### Использованный стек технологий:
- **Backend:** Java + SpringFramework + SpringBoot + PostgreSQL + Hibernate + JPA Buddy

### Паттерны проектирования:
1) Builder.
2) Factory Method.
3) Abstract Factory.
4) Facade.
5) Decorator.
6) Proxy.

### Платежная система:
Система оплаты(банковские карты) сделана при помощи Stripe.

### Cтатистика:
Мониторинг, графики и метрики представлены с помощью Prometheus и Grafana.


### Детальное описание API(сами API находятся в разделе controller):
# 1. AuthController
1.1) Вход(метод POST).
Входные данные: email/username и пароль.
Выходные данные: успешный/неуспешный вход в систему.
1.2) Регистрация(метод POST).
Входные данные: email, phone, username, password.
Выходные данные: успешная/неуспешная регистрация нового пользователя.
1.3) Подтверждение пароля при регистрации(метод POST).
Входные данные те же, что и в пункте 1.2, но нужно повторно ввести password.
Выходные данные: те же, что и в пункте 1.2).
1.4) Проверка и обновление cозданного аккаунта(метод PUT).
Входные данные: email.
Выходные данные: успешная/неуспешная проверка и обновление.
1.5) Отмена регистрации(метод DELETE).
1.6) Получение и нахождения конкретного пользователя приложения(метод GET).
Входные данные: email.
Выходные данные: пользователь найден/не найден.
1.7) Выход(метод POST).
1.8) Получение всех запросов на регистрацию(метод GET).

# 2. UserController.
2.1) Обновление(добавление, изменение) данных пользователя(метод PUT).
Входные данные: username, email, firstname, lastname, phone, date_of_birth, state, city.
Выходные данные: успешное/неуспешное обновление(добавление, изменение) данных пользователя.
2.2) Обновление(изменение) password(методы PUT).
Входные данные: старый пароль, новый пароль.
Выходные данные: успешное/неуспешное изменение password.
2.3) Получение данных пациентов(метод GET).
Входные данные: email пациентов.
Выходные данные: данные пациентов.
2.4) Получение данных докторов(метод GET).
Входные данные: email докторов.
Выходные данные: данные докторов.
2.5) Получение данных медработников(метод GET).
Входные данные: email медработников.
Выходные данные: данные медработников.
2.6) Получение данных администраторв центров(метод GET).
Входные данные: email администраторов.
Выходные данные: данные администраторов.
2.7) Получение данных обычных пользователей(метод GET).
Входные данные: email.
Выходные данные: данные обычных пользователей.
2.8) Получение профилей пользователей по Id(метод GET).
Входные данные: id.
Выходные данные: данные профилей пользователей.
2.9) Получение всех пользователей по конкретным role(метод GET).
Входные данные: role.
Выходные данные: данные пользователей.
2.10) Получение всех пользователей(метод GET).
2.11) Получение медкарт пациентов(метод GET).
Входные данные: email пациентов.
Выходные данные: медкарты пациентов.
2.12) Обновление(изменение) данных медкарт пациентов(метод PUT).
Входные данные: вес, рост, группа крови(резус-фактор), алергии, диагнозы(болезни).
Выходнные: успешное/неуспешное изменение данных медкарт пациентов.

# 3. DoctorController
3.1) Добавление нового доктора(метод POST).
Входные данные: данные доктора, название центра.
Выходные данные: успешное/неуспешное добавление доктора.
3.2) Добавить отзыв(метод POST).
Входные данные: данные доктора, данные пациента.
Выходные данные: уведомления для докторов об отзывах пациентов(получение баллов рейтинга), уведомления для пациентов о том, что они оценили докторов.
3.3) Получение Центров по работающим в них докторам(метод GET).
Входные данные: данные доктора.
Выходные данные: центр успешно/неуспешно найден.
3.4) Удаление докторов(метод DELETE).
3.5) Получение времени когда доктора заняты(метод GET).
Выходные данные: дата(час, минута, секунда).
3.6) Получение времени когда доктора свободны(метод GET).
Выходные данные: дата(час, минута, секунда).

# 4. CentreController
4.1) Создание центров(метод POST).
Входные данные: название, адрес, страна, город, описание, список докторов, cписок аптек, список отзывов)
Выходные данные: успешные/неуспешные создания центров.
4.2) Поиск центров по работающим в них медработникам(метод POST).
Входные данные: nurseEmail.
Выходные данные: центры успешно/не успешно найдены.
4.3) Поиск всех центров(метод GET).
4.4) Поиск всех центров с фильтрами даты и типа(метод POST).
Входные данные: фильтры даты и типа.
Выходные данные: центры успешно/не успешно найдены.
4.5) Получение пациентов центров по названиям центров(метод GET).
Входные данные: название центров.
Выходные данные: данные лечащихся(вылечившихся) пациентов.
4.6) Получение пациентов центров по названиям центром и фильтрация(метод GET).
Входные данные: название центров.
Выходные данные: данные лечащихся(вылечившихся) пациентов.
4.7) Получение докторов по типам услуг и названиям центров(метод GET).
Входные данные: название центров, типы услуг.
Выходные данные: данные докторов.
4.8) Получение докторов по типам услуг, названиям центров и отпускам(метод GET).
Входные данные: название центров, типы услуг, отпуски.
Выходные данные: данные докторов.

# 5. CentreAdminController
5.1) Создание администраторов для центров(метод POST).
Входные данные: username, email, firstname, lastname, phone, date_of_birth, state, city, список запросов на отпуски, cписок запросов на назначение, название центра)
Выходные данные: успешное/неуспешное создание админов.
5.2) Поиск центров по Администраторам(метод GET).
Входные данные: email.
Выходные данные: успешно/не успешно найденные центры.

# 6. DiagnosisController
6.1) Добавление диагнозов(метод POST).
Входные данные: название, код, тэг.
Выходные данные: успешные/неуспешные добавления диагнозов.
6.2) Обновление(изменение) диагнозов согласно их кодам(метод PUT).
Входные данные: название, тэг.
Выходные данные: успешное/неуспешное обновление(изменение) диагнозов.
6.3) Получение всех диагнозов(метод GET).
6.4) Удаление диагнозов согласно их кодов(метод DELETE).

# 7. DrugController
7.1) Добавление лекарств(метод POST).
Входные данные: название, код.
Выходные данные: успешные/неуспешные добавления лекарств.
7.2) Обновление(изменение) лекарств согласно их кодам(метод PUT).
Входные данные: название.
Выходные данные: успешные/неуспешные добавления лекарств.
7.3) Получение списка всех доступных лекарств(метод GET).
7.4) Удаление лекарств согласно их кодам(метод DELETE).

# 8. ImageController
8.1) Загрузка фоток для профилей пользователей(метод POST).
Входные данные: файлы.
Выходные данные: добавления фоток к профилям.
8.2) Получение фоток профилей пользователей(метод GET).

# 9. VideoController
9.1) Получение видео для звонка(метод GET).
Входные данные: callId.

# 10. AudioController
10.1) Получение аудио для звонка(метод GET).
Входные данные: callId.

# 11. CallController
11.1) Создание звонков(метод POST).
Входные данные: Id, StartTime, EndTime, Duration, Видео-запись, Аудио-запись.
Выходные данные: звонки созданы успешно.
11.2) Получение  всевозможных звонков(метод GET).
Выходные данные: список звонков.
11.3) Получение всевозможных звонков для конкретного пользователя(метод GET).
Выходные данные: список звонков.
11.4) Удаление звонков(метод DELETE).
Входные данные: callId.
Выходные данные: звонки удалены успешно.

# 12. PrescriptionController
12.1) Получение всех рецептов(метод GET).
Выходные данные: рецепты в виде списков лекарств.
12.2) Подтверждение регистрации(метод PUT).

# 13. VacationController
13.1) Проверка доступности тех или иных медработников по названиям центров(метод POST).
Выходные данные: cписок запросов на отпуски, список запросов на назначения.
13.2) Создание нового запроса на отпуск(метод POST).
Входные данные: startDate, endDate, название центра, email специалиста.
Выходные данные: успешные/неуспешные создания запросов на отпуски.
13.3) Получение всевозможных запросов на отпуски тех или иных медработников(метод GET).
Выходные данные: всевозможные списки запросов на отпуски.

# 14. PatientMedicalReportController
14.1) Cоздание нового медицинского отчета пациента(метод POST).
Входные данные: email пациентов, email докторов, названия центров, описание рецептов с названием лекарств, диагнозы(болезни), дата и время.
Выходные данные: отчеты созданы успешно/не успешно.
14.2) Получение отчета по рецепту согласно его id(метод GET).
Выходные данные: отчеты с рецептами в них.
14.3) Обновление (изменение) отчета по id(метод PUT).
Входные данные: лекарства, диагнозы и рецепты.
Выходные данные: успешные/неуспешные обновления (изменения) отчетов.
14.4) Получение всевозможных отчетов согласно email(метод GET).

# 15. HallController
15.1) Получение максимально-загруженных дней в аптеках(метод GET)
Входные данные: названия центров, номера аптек.
Выходные данные: даты.
15.2) Получение всех аптек(метод GET).
15.3) Поиск всех аптек при помощи фильтра(метод POST).
15.4) Получение всех аптек для центров(метод GET).
Входные данные: названия центров.
Выходные данные: успешно получены все аптеки для каждого конкретного центра.
15.5) Удаление аптек(метод DELETE).
Входные данные: номера, названия.
Выходные данные: успешные удаления конкретных аптек.
15.6) Обновление(изменение) данных аптек(метод PUT).
Входные данные: старые номера, старые названия, названия центров.
Выходные данные: новые номера, новые названия.
15.7) Получение аптек по номерам(метод GET).
Входнные данные: названия центров, номера.
Выходные данные: успешно получены аптеки по конкретным номерам.
15.8) Добавления новых аптек(метод POST).
Входные данные: номера, названия.
Выходные данные: успешные добавления новых аптек.

# 16. UtilityController
16.1) Получение информации о неделе(метод GET).
Выходные данные: weekStart, weekEnd.
16.2) Получение информации о месяце(метод GET).
Выходные данные: monthStart, monthEnd.
16.3) Проверка дат(месяц GET).
16.4) Получение времен занятости докторов(метод GET).
Входные данные: email докторов.
Выходные данные: временные интервалы.
16.5) Получение времени загруженности аптек(метод GET).
Входные данные: номера аптек, даты, названия центров.
Выходные данные: временные интервалы.

# 17. ScheduledAppointmentsController
17.1) Обновление(изменение) записи(метод PUT).

# 18. PriceListController.
18.1) Удаление pricelist(метод DELETE).
Входные данные: typeOfExamination, названия центров.
Выходные данные: успешные/неуспешные удаления pricelist.
18.2) Получение всех typeOfExamination по названиям центров(метод GET).
Входные данные: названия центров.
Выходные данные: успешно получены все typeOfExamination по названиям центров.
18.3) Получение всех typeOfExamination(метод GET).
Выходные данные: успешно получены все typeOfExamination.
18.4) Получение конкретных typeOfExamination по названиям центров(метод GET).
Входные данные: названия центров.
Выходнные данные: успешно получены конкретные typeOfExamination по названиям центров.
18.5) Обновление(изменение) typeOfExamination по названиям центров.

# 19. CheckoutController
19.1) Оформление заказов(метод POST).
Входные данные: amount, stripePublicKey, currency.
Выходные данные: успешные оформления заказов.

# 20. СhargeController
20.1) Оформление оплаты заказов(метод POST).
Входные данные: description, currency.
Выходные данные: результаты оплаты.

# 21. AppointmentController
21.1) Записаться на приемы(метод GET).
Выходные данные: названия центров, даты, номера аптек.
21.2) Назначить приемы(метод GET).
Входные данные: email докторов, email пациентов.
Выходные данные: список назначений на приемы.
21.3) Записаться на конкретные приемы(метод GET).
Входные данные: названия центров, даты, номера аптек.
Выходные данные: список записей на конкретные приемы.
21.4) Получение всевозможных назначений на приемы(метод GET).
Выходные данные: списки всевозможных назначений на приемы.
21.5) Получение запросов на приемы(метод GET).
Выходные данные: названия центров, даты, номера аптек.
21.6) Получение всех запросов на приемы(метод GET).
Выходные данные: список всех запросов на приемы.
21.7) Получение всех назначений центров(метод GET).
Входные данные: названия центров.
Выходные данные: список всех назначений центров.
21.8) Получение всех сегодняшних назначений центров(метод GET).
Входные данные: названия центров, дата.
Выходные данные: получение всех сегодняшних назначений центров.
21.9) Еженедельное получение всех назначений центров(метод GET).
Входные данные: weekInfo, названия центров.
Выходные данные: еженедельное получение всех  назначений центров.
21.10) Месячное получение всех назначений центров(метод GET).
Входные данные: monthInfo, названия центров.
Выходные данные: месячное получение всех назначений центров.
21.11) Получение всех записей по аптекам(метод GET).
Входные данные: названия центров, номера аптек.
Выходные данные: список всех назначений по аптекам.
21.12) Получение всех запросов пациентов(метод GET).
Входные данные: email пациентов.
Выходные данные: список всех запросов пациентов.
21.13) Получение всех назначений пациентов(метод GET).
Входные данные: email пациентов.
Выходные данные: список всех назначений пациентов.
21.14) Получение всех заданий(метод GET).
21.15) Получение всех записей на приемы к докторам(метод GET).
Входные данные: email докторов.
Выходные данные: список всех записей на приемы к докторам.
21.16) Получение всех записей на приемы к докторам по дате(метод GET).
Входные данные: email докторов, дата приема.
Выходные данные: список всех записей на приемы к докторам по дате.
21.17) Получение всех записей на приемы к докторам в календаре(метод GET).
Входные данные: календарь, email докторов.
Выходные данные: спсрок всех записей на приемы к докторам в календаре.
21.18) Cоздание заданий(метод POST).
21.19) Подтверждение запросов на приемы(метод POST).
21.20) Подтвердить приемы(метод PUT).
21.21) Удаление записей на приемы(метод DELETE).
21.22) Отклонение запросов на приемы(метод DELETE).
21.23) Добавление новых записей на приемы(метод POST).
21.24) Отмены запросов на приемы(метод DELETE).
Входные данные: role.
Выходные данные: успешное отклонений запросов на приемы.
21.25) Зарезирвировать заранее(метод PUT).
Входные данные: email.
Выходные: успешные бронирования.
21.26) Приемы закончены(метод PUT).

### API также представлены с помощью Swagger UI.
