.class public final Lf64;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljr3;


# direct methods
.method public constructor <init>(Lj74;Lj74;Lqe3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljr3;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, p1, p2, p3, v1}, Ljr3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lf64;->a:Ljr3;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Lg54;Ljr3;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p1, Ljr3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj74;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {p0, v0, v1, p2}, Lk54;->b(Lg54;Lj74;ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Ljr3;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lj74;

    .line 12
    .line 13
    const/4 p2, 0x2

    .line 14
    invoke-static {p0, p1, p2, p3}, Lk54;->b(Lg54;Lj74;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final b()Ljr3;
    .locals 1

    .line 1
    iget-object v0, p0, Lf64;->a:Ljr3;

    .line 2
    .line 3
    return-object v0
.end method
