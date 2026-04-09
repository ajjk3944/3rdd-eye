.class public final La13;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lb03;


# instance fields
.field public final a:Lyu2;


# direct methods
.method public constructor <init>(Lyu2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La13;->a:Lyu2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)Lc03;
    .locals 2

    .line 1
    iget-object v0, p0, La13;->a:Lyu2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lyu2;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lu83;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    new-instance v0, Lu03;

    .line 8
    .line 9
    invoke-direct {v0}, Ly62;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lc03;

    .line 13
    .line 14
    invoke-direct {v1, p2, v0, p1}, Lc03;-><init>(Ljava/lang/Object;Lhn2;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method
