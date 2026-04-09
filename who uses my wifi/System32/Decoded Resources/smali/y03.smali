.class public final Ly03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzz2;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/Context;

.field public final c:Lpu2;

.field public final d:Ll83;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Le51;

.field public final g:Le42;

.field public final h:Z

.field public final i:Lpz2;

.field public final j:Ljv2;

.field public final k:Lmv2;

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le51;Ll83;Ljava/util/concurrent/Executor;Lei2;Lpu2;Le42;Lpz2;Ljv2;Lmv2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ly03;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly03;->b:Landroid/content/Context;

    iput-object p3, p0, Ly03;->d:Ll83;

    iput-object p5, p0, Ly03;->l:Ljava/lang/Object;

    iput-object p4, p0, Ly03;->e:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ly03;->f:Le51;

    iput-object p6, p0, Ly03;->c:Lpu2;

    iput-object p7, p0, Ly03;->g:Le42;

    sget-object p1, Lmz1;->H9:Liz1;

    .line 2
    sget-object p2, Ltw1;->e:Ltw1;

    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 3
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Ly03;->h:Z

    iput-object p8, p0, Ly03;->i:Lpz2;

    iput-object p9, p0, Ly03;->j:Ljv2;

    iput-object p10, p0, Ly03;->k:Lmv2;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le51;Ll83;Ljava/util/concurrent/Executor;Lji2;Lpu2;Le42;Lpz2;Ljv2;Lmv2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ly03;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly03;->b:Landroid/content/Context;

    iput-object p3, p0, Ly03;->d:Ll83;

    iput-object p5, p0, Ly03;->l:Ljava/lang/Object;

    iput-object p4, p0, Ly03;->e:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ly03;->f:Le51;

    iput-object p6, p0, Ly03;->c:Lpu2;

    iput-object p7, p0, Ly03;->g:Le42;

    sget-object p1, Lmz1;->H9:Liz1;

    .line 6
    sget-object p2, Ltw1;->e:Ltw1;

    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 7
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Ly03;->h:Z

    iput-object p8, p0, Ly03;->i:Lpz2;

    iput-object p9, p0, Ly03;->j:Ljv2;

    iput-object p10, p0, Ly03;->k:Lmv2;

    return-void
.end method


# virtual methods
.method public final a(Lh83;La83;)Z
    .locals 0

    .line 1
    iget p1, p0, Ly03;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p2, La83;->s:Le83;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, Le83;->a:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    return p1

    .line 18
    :pswitch_0
    iget-object p1, p2, La83;->s:Le83;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object p1, p1, Le83;->a:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    :goto_1
    return p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lh83;La83;)Ln70;
    .locals 13

    .line 1
    iget v0, p0, Ly03;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v5, Lsu2;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v5, v0}, Lsu2;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Llq3;->g:Llq3;

    .line 13
    .line 14
    new-instance v1, Lop1;

    .line 15
    .line 16
    const/16 v6, 0xa

    .line 17
    .line 18
    move-object v2, p0

    .line 19
    move-object v4, p1

    .line 20
    move-object v3, p2

    .line 21
    invoke-direct/range {v1 .. v6}, Lop1;-><init>(Lzz2;La83;Lh83;Lsu2;I)V

    .line 22
    .line 23
    .line 24
    iget-object p1, v2, Ly03;->e:Ljava/util/concurrent/Executor;

    .line 25
    .line 26
    invoke-static {v0, v1, p1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    new-instance v0, Lvr;

    .line 31
    .line 32
    const/4 v1, 0x6

    .line 33
    invoke-direct {v0, v1}, Lvr;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v0, p1}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 37
    .line 38
    .line 39
    return-object p2

    .line 40
    :pswitch_0
    move-object v2, p0

    .line 41
    move-object v4, p1

    .line 42
    move-object v3, p2

    .line 43
    new-instance v11, Lsu2;

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-direct {v11, p1}, Lsu2;-><init>(I)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Llq3;->g:Llq3;

    .line 50
    .line 51
    new-instance v7, Lop1;

    .line 52
    .line 53
    const/16 v12, 0x8

    .line 54
    .line 55
    move-object v8, v2

    .line 56
    move-object v9, v3

    .line 57
    move-object v10, v4

    .line 58
    invoke-direct/range {v7 .. v12}, Lop1;-><init>(Lzz2;La83;Lh83;Lsu2;I)V

    .line 59
    .line 60
    .line 61
    iget-object p2, v2, Ly03;->e:Ljava/util/concurrent/Executor;

    .line 62
    .line 63
    invoke-static {p1, v7, p2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v0, Lvr;

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    invoke-direct {v0, v1}, Lvr;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0, p2}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 74
    .line 75
    .line 76
    return-object p1

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
