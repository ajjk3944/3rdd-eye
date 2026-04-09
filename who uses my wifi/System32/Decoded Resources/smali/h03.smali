.class public final Lh03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzz2;


# instance fields
.field public final a:Lzh2;

.field public final b:Lpu2;

.field public final c:Ll83;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Le51;

.field public final f:Le42;

.field public final g:Z

.field public final h:Lpz2;

.field public final i:Ljv2;

.field public final j:Lmv2;


# direct methods
.method public constructor <init>(Lzh2;Ljava/util/concurrent/Executor;Lpu2;Ll83;Le51;Le42;Lpz2;Ljv2;Lmv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh03;->a:Lzh2;

    .line 5
    .line 6
    iput-object p2, p0, Lh03;->d:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lh03;->b:Lpu2;

    .line 9
    .line 10
    iput-object p4, p0, Lh03;->c:Ll83;

    .line 11
    .line 12
    iput-object p5, p0, Lh03;->e:Le51;

    .line 13
    .line 14
    iput-object p6, p0, Lh03;->f:Le42;

    .line 15
    .line 16
    sget-object p1, Lmz1;->H9:Liz1;

    .line 17
    .line 18
    sget-object p2, Ltw1;->e:Ltw1;

    .line 19
    .line 20
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput-boolean p1, p0, Lh03;->g:Z

    .line 33
    .line 34
    iput-object p7, p0, Lh03;->h:Lpz2;

    .line 35
    .line 36
    iput-object p8, p0, Lh03;->i:Ljv2;

    .line 37
    .line 38
    iput-object p9, p0, Lh03;->j:Lmv2;

    .line 39
    .line 40
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
    .locals 7

    .line 1
    new-instance v4, Lsu2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v4, v0}, Lsu2;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v6, Llq3;->g:Llq3;

    .line 8
    .line 9
    new-instance v0, Lop1;

    .line 10
    .line 11
    const/4 v5, 0x4

    .line 12
    move-object v1, p0

    .line 13
    move-object v3, p1

    .line 14
    move-object v2, p2

    .line 15
    invoke-direct/range {v0 .. v5}, Lop1;-><init>(Lzz2;La83;Lh83;Lsu2;I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v1, Lh03;->d:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    invoke-static {v6, v0, p1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    new-instance v0, Lvr;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    invoke-direct {v0, v2}, Lvr;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0, p1}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 31
    .line 32
    .line 33
    return-object p2
.end method
