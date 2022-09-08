public class student {
    private List<subjects> subjectsList;
    private List<users> usersList;
    private List<messages> messagesList;
    private List<rating> ratingList;
}

public class subjects {
    private List<subject> subjectList;
    private int marks-info;
}
public class subject {
    private List<lessonnumberid> lessonnumberidList;
}
public class lessonnumberid {

    private String date;
    private String day;
    private String title;
    private String time;
    private String online-lesson;
    private List<lessonnumberid> videos;
    private List<lessonnumberid> tasks;
}
public class videos {
    private String video;
}
public class tasks {
    private String task;
    private int marks;
}
public class users {
    private List<user> userList;
}
public class user {
    private String user-id;
    private String name;
    private String email;
    private String password;
}
public class messages {
    private List<messageid> messageidList;
}

public class messageid {
    private String date-m;
    private String from;
    private String to;
    private String body;
}
public class rating {
    private List<namestudentid> namestudentidList;
}
public class namestudentid {
    private int score;
}
