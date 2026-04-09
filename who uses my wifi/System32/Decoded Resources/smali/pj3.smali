.class public final Lpj3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:Lgk3;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;Lvf3;Lhg3;Lgk3;Lqj3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lpj3;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj3;->b:Landroid/content/Context;

    iput-object p2, p0, Lpj3;->c:Ljava/util/concurrent/ExecutorService;

    iput-object p4, p0, Lpj3;->e:Ljava/lang/Object;

    iput-object p5, p0, Lpj3;->d:Lgk3;

    iput-object p6, p0, Lpj3;->h:Ljava/lang/Object;

    invoke-virtual {p3}, Lvf3;->E()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lpj3;->f:Ljava/lang/Object;

    .line 3
    invoke-virtual {p3}, Lvf3;->K()Lcg3;

    move-result-object p1

    invoke-virtual {p1}, Lcg3;->C()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lpj3;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lz94;Lrj3;Lgk3;Ljava/util/concurrent/ExecutorService;Ljj3;Lgd3;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lpj3;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj3;->b:Landroid/content/Context;

    iput-object p2, p0, Lpj3;->e:Ljava/lang/Object;

    iput-object p3, p0, Lpj3;->f:Ljava/lang/Object;

    iput-object p4, p0, Lpj3;->d:Lgk3;

    iput-object p5, p0, Lpj3;->c:Ljava/util/concurrent/ExecutorService;

    iput-object p6, p0, Lpj3;->g:Ljava/lang/Object;

    iput-object p7, p0, Lpj3;->h:Ljava/lang/Object;

    return-void
.end method

.method public static a(I)Lyg3;
    .locals 2

    .line 1
    invoke-static {}, Lyg3;->D()Lxg3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ln54;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 9
    .line 10
    check-cast v1, Lyg3;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Lyg3;->I(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lyg3;

    .line 20
    .line 21
    return-object p0
.end method

.method public static b(I)Lyg3;
    .locals 2

    .line 1
    invoke-static {}, Lyg3;->D()Lxg3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ln54;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 9
    .line 10
    check-cast v1, Lyg3;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Lyg3;->I(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lyg3;

    .line 20
    .line 21
    return-object p0
.end method
