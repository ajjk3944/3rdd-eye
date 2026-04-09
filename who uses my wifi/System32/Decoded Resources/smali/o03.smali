.class public final Lo03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzz2;


# instance fields
.field public final a:Lbi2;

.field public final b:Landroid/content/Context;

.field public final c:Lpu2;

.field public final d:Ll83;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Lzk3;

.field public final g:Ljv2;


# direct methods
.method public constructor <init>(Lbi2;Landroid/content/Context;Ljava/util/concurrent/Executor;Lpu2;Ll83;Lzk3;Ljv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lo03;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p1, p0, Lo03;->a:Lbi2;

    .line 7
    .line 8
    iput-object p3, p0, Lo03;->e:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    iput-object p4, p0, Lo03;->c:Lpu2;

    .line 11
    .line 12
    iput-object p5, p0, Lo03;->d:Ll83;

    .line 13
    .line 14
    iput-object p6, p0, Lo03;->f:Lzk3;

    .line 15
    .line 16
    iput-object p7, p0, Lo03;->g:Ljv2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lh83;La83;)Z
    .locals 0

    .line 1
    iget-object p1, p2, La83;->s:Le83;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Le83;->a:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final b(Lh83;La83;)Ln70;
    .locals 3

    .line 1
    sget-object v0, Llq3;->g:Llq3;

    .line 2
    .line 3
    new-instance v1, Lop1;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    invoke-direct {v1, p0, p1, p2, v2}, Lop1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lo03;->e:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
