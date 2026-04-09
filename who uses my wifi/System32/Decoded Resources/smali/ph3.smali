.class public final Lph3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkh3;


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public final b:Lz94;

.field public final c:Lz94;

.field public final d:Lxj3;

.field public final e:Lz94;

.field public final f:Lwf3;

.field public final g:Lvf3;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Lz94;Lz94;Lxj3;Lz94;Lwf3;Lvf3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lph3;->a:Ljava/util/concurrent/ExecutorService;

    .line 5
    .line 6
    iput-object p2, p0, Lph3;->b:Lz94;

    .line 7
    .line 8
    iput-object p3, p0, Lph3;->c:Lz94;

    .line 9
    .line 10
    iput-object p4, p0, Lph3;->d:Lxj3;

    .line 11
    .line 12
    iput-object p5, p0, Lph3;->e:Lz94;

    .line 13
    .line 14
    iput-object p6, p0, Lph3;->f:Lwf3;

    .line 15
    .line 16
    iput-object p7, p0, Lph3;->g:Lvf3;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "1.808261137"

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ln70;
    .locals 2

    .line 1
    iget-object v0, p0, Lph3;->f:Lwf3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lwf3;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lh2;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lh2;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p2, v0, Lh2;->d:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p3, v0, Lh2;->e:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p3, p0, Lph3;->g:Lvf3;

    .line 19
    .line 20
    invoke-virtual {p3}, Lvf3;->H()Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    const/4 v1, 0x1

    .line 25
    if-eq v1, p3, :cond_0

    .line 26
    .line 27
    const-string p3, ""

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p3, 0x0

    .line 31
    :goto_0
    iput-object p3, v0, Lh2;->f:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object p3, p0, Lph3;->d:Lxj3;

    .line 34
    .line 35
    invoke-virtual {p3, p1, p2}, Lxj3;->b(Landroid/content/Context;Landroid/view/View;)Ljava/util/HashMap;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, v0, Lh2;->g:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {}, Lqr1;->C0()Lfr1;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iput-object p1, v0, Lh2;->h:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object p1, Leg3;->g:Leg3;

    .line 51
    .line 52
    iput-object p1, v0, Lh2;->i:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {v0}, Lh2;->o()Lvg0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p1, p1, Lvg0;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lba4;

    .line 61
    .line 62
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lvh3;

    .line 67
    .line 68
    invoke-virtual {p1}, Lvh3;->a()Ln70;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1
.end method

.method public final c(Landroid/view/InputEvent;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/view/MotionEvent;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lph3;->e:Lz94;

    .line 6
    .line 7
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lsh3;

    .line 12
    .line 13
    check-cast p1, Landroid/view/MotionEvent;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, v0, Lsh3;->b:Landroid/view/MotionEvent;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    iget-object v1, v0, Lsh3;->c:Lqh3;

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lqh3;->a(Landroid/view/MotionEvent;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, Lsh3;->a:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x6

    .line 44
    if-lt v2, v3, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_1
    new-instance v2, Lrh3;

    .line 50
    .line 51
    invoke-direct {v2, p1}, Lrh3;-><init>(Landroid/view/MotionEvent;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    throw p1

    .line 61
    :cond_2
    return-void
.end method

.method public final d()Ln70;
    .locals 2

    .line 1
    new-instance v0, Lw53;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1, p0}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lph3;->a:Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lpu1;->D(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lar3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public final f(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ln70;
    .locals 5

    .line 1
    iget-object v0, p0, Lph3;->e:Lz94;

    .line 2
    .line 3
    iget-object v1, p0, Lph3;->d:Lxj3;

    .line 4
    .line 5
    invoke-virtual {v1}, Lxj3;->c()Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lsh3;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v2, v0, Lsh3;->b:Landroid/view/MotionEvent;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    const-string v3, "nv"

    .line 21
    .line 22
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    iget-object v2, v0, Lsh3;->c:Lqh3;

    .line 29
    .line 30
    const-string v3, "oe"

    .line 31
    .line 32
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Lsh3;->a:Ljava/util/ArrayDeque;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-array v3, v3, [Lrh3;

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const-string v4, "ro"

    .line 48
    .line 49
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    new-instance v3, Lqh3;

    .line 53
    .line 54
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v3, v0, Lsh3;->c:Lqh3;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object v2, v0, Lsh3;->b:Landroid/view/MotionEvent;

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 68
    .line 69
    .line 70
    iput-object v3, v0, Lsh3;->b:Landroid/view/MotionEvent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    :cond_1
    monitor-exit v0

    .line 73
    iget-object v0, p0, Lph3;->f:Lwf3;

    .line 74
    .line 75
    invoke-virtual {v0}, Lwf3;->d()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lh2;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iput-object p1, v0, Lh2;->c:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object p3, v0, Lh2;->d:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object v3, v0, Lh2;->e:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object p2, v0, Lh2;->f:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v1, v0, Lh2;->g:Ljava/lang/Object;

    .line 93
    .line 94
    sget-object p1, Leg3;->h:Leg3;

    .line 95
    .line 96
    iput-object p1, v0, Lh2;->i:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static {}, Lqr1;->C0()Lfr1;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iput-object p1, v0, Lh2;->h:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v0}, Lh2;->o()Lvg0;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iget-object p1, p1, Lvg0;->g:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, Lba4;

    .line 114
    .line 115
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Lvh3;

    .line 120
    .line 121
    invoke-virtual {p1}, Lvh3;->a()Ln70;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    return-object p1

    .line 126
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    throw p1
.end method

.method public final h(Landroid/content/Context;)Ln70;
    .locals 1

    .line 1
    iget-object v0, p0, Lph3;->f:Lwf3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lwf3;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lh2;

    .line 8
    .line 9
    iput-object p1, v0, Lh2;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p1, p0, Lph3;->d:Lxj3;

    .line 12
    .line 13
    invoke-virtual {p1}, Lxj3;->a()Ljava/util/HashMap;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, v0, Lh2;->g:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {}, Lqr1;->C0()Lfr1;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iput-object p1, v0, Lh2;->h:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object p1, Leg3;->f:Leg3;

    .line 29
    .line 30
    iput-object p1, v0, Lh2;->i:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {v0}, Lh2;->o()Lvg0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p1, p1, Lvg0;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lba4;

    .line 39
    .line 40
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lvh3;

    .line 45
    .line 46
    invoke-virtual {p1}, Lvh3;->a()Ln70;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method
