package ch.bbw.m151.youtubers;

import javax.persistence.*;

@Entity
@Table(name="youtubers")
public class Youtubers {

    @Id
    @Column
    private String rank;

    @Column
    private String username;

    @Column
    private String youtubeUrl;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private String subscribers;

    @Column
    private String audience;

    @Column(name="country")
    private String country;


    @Column(name="avg_views")
    private String Avg_Views;


    @Column(name="avg_likes")
    private String Avg_Likes;


    @Column(name="avg_comments")
    private String Avg_Comments;




    // other fields, getters and setters
}
