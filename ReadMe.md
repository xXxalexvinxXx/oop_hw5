Задача 1 - Data/model

* Создать package-model. Работу продолжаем в нем
* Реализовать абстрактный класс User и его наследников Student и Teacher.
Родитель имеет в себе лбщие данные(пример: ФИО, год рождения, и т.д.), 
а наследники - собственные параметры (какие, по вашему выбору - 
Пример: studentId для Student, teacherId для Teacher)

Задача 2 - Service

* Создать package - service. Работу продолжаем в нем.
* Создать класс DataService с методами по управлению сущностями 
User (create, read) и агрегирующий всех пользователей заведенных в системе
* StudentId должны быть созданы по алгоритму - максимальный id в коллекции +1.
Аналогично для TeacherId. Здесь решение через перебор элементов и instanceOf

Задача 3 - View/Dto

* Создать package - view. Работу продолжать в нем.
* Создаьб класс StudentView, содержащий в себе метод вывода в консоль
данных студента поданых на вход.

Задача 4 -  Controller

* Создать package - controller. Работу продолжать в нем.
* Создать класс Controller агрегирующий в себе наобходимые классы в виде
полей, а инициализируем прямо в поле.
* Создать метод createStudent - реализующий логику, путем вызова соответствующих 
методов интерфейсов:
    * Создание Студента в сервисе
    * Возвращение всех студентов в сервисе
    * Вызов view и передача списка найденных студентов


Задача 5 - Д/З

* Создать класс studyGroup содержащая в себе поля Teacher и lerningGroup
* Создать класс lerningGroupSeervice, в котом реализована функция(входные параметры -
  (Teacher, List<Student>)) формирования из Students и Teacher learningGroup и 
   возвращения его
* Создать метод в Controller, в котором формируется учебная группа, путем вызова
  метода из сервиса
* Вск вышеуказанное создать согласно принципам ООП пройденным на семинаре
