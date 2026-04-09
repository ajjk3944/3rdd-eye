.class public final Leb3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lqq3;

.field public final d:Lug4;

.field public final e:Lbb3;

.field public final f:Lea3;

.field public final g:Lch2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lld2;Lqq3;Lug4;Lbb3;Lea3;Lch2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Leb3;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Leb3;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Leb3;->c:Lqq3;

    .line 9
    .line 10
    iput-object p4, p0, Leb3;->d:Lug4;

    .line 11
    .line 12
    iput-object p5, p0, Leb3;->e:Lbb3;

    .line 13
    .line 14
    iput-object p6, p0, Leb3;->f:Lea3;

    .line 15
    .line 16
    iput-object p7, p0, Leb3;->g:Lch2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lx34;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p0, v0, p2, v1, v1}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;Lx34;Lda3;Lao2;)V
    .locals 12

    .line 1
    invoke-static {}, Lea3;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Ln02;->d:Lso1;

    .line 9
    .line 10
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Leb3;->a:Landroid/content/Context;

    .line 23
    .line 24
    const/16 v1, 0xe

    .line 25
    .line 26
    invoke-static {v0, v1}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Laa3;->a()Laa3;

    .line 31
    .line 32
    .line 33
    :cond_0
    move-object v4, v1

    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    iget-object p2, p2, Lx34;->f:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v6, p2

    .line 39
    check-cast v6, Lcd4;

    .line 40
    .line 41
    new-instance v5, Lg4;

    .line 42
    .line 43
    const/16 v11, 0x10

    .line 44
    .line 45
    iget-object v7, p0, Leb3;->d:Lug4;

    .line 46
    .line 47
    iget-object v8, p0, Leb3;->c:Lqq3;

    .line 48
    .line 49
    iget-object v9, p0, Leb3;->e:Lbb3;

    .line 50
    .line 51
    iget-object v10, p0, Leb3;->g:Lch2;

    .line 52
    .line 53
    invoke-direct/range {v5 .. v11}, Lg4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, p1}, Lg4;->g(Ljava/lang/String;)Ln70;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance p2, Lgs1;

    .line 62
    .line 63
    const/16 v0, 0xb

    .line 64
    .line 65
    invoke-direct {p2, p0, p1, v0}, Lgs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Leb3;->c:Lqq3;

    .line 69
    .line 70
    check-cast p1, Lld2;

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_0
    new-instance v2, Lmc2;

    .line 77
    .line 78
    const/16 v7, 0x15

    .line 79
    .line 80
    move-object v3, p0

    .line 81
    move-object v5, p3

    .line 82
    move-object/from16 v6, p4

    .line 83
    .line 84
    invoke-direct/range {v2 .. v7}, Lmc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    new-instance p2, Ljq3;

    .line 88
    .line 89
    const/4 p3, 0x0

    .line 90
    invoke-direct {p2, p1, v2, p3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 91
    .line 92
    .line 93
    iget-object p3, p0, Leb3;->b:Ljava/util/concurrent/Executor;

    .line 94
    .line 95
    invoke-interface {p1, p2, p3}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method
