package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int signerId;
    private int photoId;
    private int replyOwnerId;
    private int replyPostId;
    private int postponedId;
    private int postDate;
    private int createdBy;
    private int friendsOnly;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean saveToFavorites;
    private String postText;
    private String postType;
    private GeoInfo geoInfo;
    private CopyrightInfo copyrightInfo;
    private PostSourceInfo postSourceInfo;
    private CommentsInfo commentsInfo;
    private LikesInfo likeInfo;
    private RepostsInfo repostInfo;
    private ViewsInfo viewInfo;
    private DonutInfo donutInfo;
}

