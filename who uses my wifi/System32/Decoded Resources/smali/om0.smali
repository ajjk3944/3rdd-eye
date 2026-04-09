.class public final Lom0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgt;
.implements Law;


# static fields
.field public static final q:Ljava/lang/String;


# instance fields
.field public f:Landroid/os/PowerManager$WakeLock;

.field public final g:Landroid/content/Context;

.field public final h:Lru0;

.field public final i:Lxb4;

.field public final j:Landroidx/work/impl/WorkDatabase;

.field public final k:Ljava/util/HashMap;

.field public final l:Ljava/util/HashMap;

.field public final m:Ljava/util/List;

.field public final n:Ljava/util/HashSet;

.field public final o:Ljava/util/ArrayList;

.field public final p:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "Processor"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lom0;->q:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lru0;Lxb4;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lom0;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lom0;->h:Lru0;

    .line 7
    .line 8
    iput-object p3, p0, Lom0;->i:Lxb4;

    .line 9
    .line 10
    iput-object p4, p0, Lom0;->j:Landroidx/work/impl/WorkDatabase;

    .line 11
    .line 12
    new-instance p1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lom0;->l:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance p1, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lom0;->k:Ljava/util/HashMap;

    .line 25
    .line 26
    iput-object p5, p0, Lom0;->m:Ljava/util/List;

    .line 27
    .line 28
    new-instance p1, Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lom0;->n:Ljava/util/HashSet;

    .line 34
    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lom0;->o:Ljava/util/ArrayList;

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    iput-object p1, p0, Lom0;->f:Landroid/os/PowerManager$WakeLock;

    .line 44
    .line 45
    new-instance p1, Ljava/lang/Object;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lom0;->p:Ljava/lang/Object;

    .line 51
    .line 52
    return-void
.end method

.method public static c(Ljava/lang/String;Lwa1;)Z
    .locals 3

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p1, Lwa1;->x:Z

    .line 6
    .line 7
    invoke-virtual {p1}, Lwa1;->h()Z

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, Lwa1;->w:Ln70;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p1, Lwa1;->w:Ln70;

    .line 19
    .line 20
    invoke-interface {v2, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, p0

    .line 25
    :goto_0
    iget-object v2, p1, Lwa1;->k:Landroidx/work/ListenableWorker;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->stop()V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p1, p1, Lwa1;->j:Loa1;

    .line 36
    .line 37
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lh80;->d()Lh80;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object v1, Lwa1;->y:Ljava/lang/String;

    .line 45
    .line 46
    new-array v1, p0, [Ljava/lang/Throwable;

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-static {}, Lh80;->d()Lh80;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-array p0, p0, [Ljava/lang/Throwable;

    .line 56
    .line 57
    invoke-virtual {p1, p0}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return v0

    .line 61
    :cond_2
    invoke-static {}, Lh80;->d()Lh80;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-array v0, p0, [Ljava/lang/Throwable;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lom0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lom0;->l:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lh80;->d()Lh80;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v3, v2, [Ljava/lang/Throwable;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lom0;->o:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :goto_0
    if-ge v2, v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    check-cast v4, Lgt;

    .line 34
    .line 35
    invoke-interface {v4, p1, p2}, Lgt;->a(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p1
.end method

.method public final b(Lgt;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lom0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lom0;->o:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lom0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lom0;->l:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lom0;->k:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 26
    :goto_1
    monitor-exit v0

    .line 27
    return p1

    .line 28
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p1
.end method

.method public final e(Lgt;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lom0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lom0;->o:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public final f(Ljava/lang/String;Lyv;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lom0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Lh80;->d()Lh80;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lh80;->e([Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lom0;->l:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lwa1;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v2, p0, Lom0;->f:Landroid/os/PowerManager$WakeLock;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lom0;->g:Landroid/content/Context;

    .line 29
    .line 30
    const-string v3, "ProcessorForegroundLck"

    .line 31
    .line 32
    invoke-static {v2, v3}, Ly71;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iput-object v2, p0, Lom0;->f:Landroid/os/PowerManager$WakeLock;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    iget-object v2, p0, Lom0;->k:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lom0;->g:Landroid/content/Context;

    .line 50
    .line 51
    invoke-static {v1, p1, p2}, Lrz0;->d(Landroid/content/Context;Ljava/lang/String;Lyv;)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p2, p0, Lom0;->g:Landroid/content/Context;

    .line 56
    .line 57
    invoke-static {p2, p1}, Llj;->b(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 58
    .line 59
    .line 60
    :cond_1
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    throw p1
.end method

.method public final g(Ljava/lang/String;Lt83;)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lom0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lom0;->d(Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lh80;->d()Lh80;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-array p2, v2, [Ljava/lang/Throwable;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return v2

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lom0;->g:Landroid/content/Context;

    .line 26
    .line 27
    iget-object v3, p0, Lom0;->h:Lru0;

    .line 28
    .line 29
    iget-object v4, p0, Lom0;->i:Lxb4;

    .line 30
    .line 31
    iget-object v5, p0, Lom0;->j:Landroidx/work/impl/WorkDatabase;

    .line 32
    .line 33
    new-instance v6, Lt83;

    .line 34
    .line 35
    const/16 v7, 0xa

    .line 36
    .line 37
    invoke-direct {v6, v7}, Lt83;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v7, p0, Lom0;->m:Ljava/util/List;

    .line 45
    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object p2, v6

    .line 50
    :goto_0
    new-instance v6, Lwa1;

    .line 51
    .line 52
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v8, Lo70;

    .line 56
    .line 57
    invoke-direct {v8}, Lo70;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v8, v6, Lwa1;->m:Lr70;

    .line 61
    .line 62
    new-instance v8, Lou0;

    .line 63
    .line 64
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v8, v6, Lwa1;->v:Lou0;

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    iput-object v9, v6, Lwa1;->w:Ln70;

    .line 71
    .line 72
    iput-object v1, v6, Lwa1;->f:Landroid/content/Context;

    .line 73
    .line 74
    iput-object v4, v6, Lwa1;->l:Lxb4;

    .line 75
    .line 76
    iput-object p0, v6, Lwa1;->o:Lom0;

    .line 77
    .line 78
    iput-object p1, v6, Lwa1;->g:Ljava/lang/String;

    .line 79
    .line 80
    iput-object v7, v6, Lwa1;->h:Ljava/util/List;

    .line 81
    .line 82
    iput-object p2, v6, Lwa1;->i:Lt83;

    .line 83
    .line 84
    iput-object v9, v6, Lwa1;->k:Landroidx/work/ListenableWorker;

    .line 85
    .line 86
    iput-object v3, v6, Lwa1;->n:Lru0;

    .line 87
    .line 88
    iput-object v5, v6, Lwa1;->p:Landroidx/work/impl/WorkDatabase;

    .line 89
    .line 90
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iput-object p2, v6, Lwa1;->q:Lh2;

    .line 95
    .line 96
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->i()Ll92;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iput-object p2, v6, Lwa1;->r:Ll92;

    .line 101
    .line 102
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->o()Ll92;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    iput-object p2, v6, Lwa1;->s:Ll92;

    .line 107
    .line 108
    new-instance p2, Lgi;

    .line 109
    .line 110
    const/4 v1, 0x2

    .line 111
    invoke-direct {p2, v1}, Lgi;-><init>(I)V

    .line 112
    .line 113
    .line 114
    iput-object p0, p2, Lgi;->g:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object p1, p2, Lgi;->h:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v8, p2, Lgi;->i:Ljava/lang/Object;

    .line 119
    .line 120
    iget-object v1, p0, Lom0;->i:Lxb4;

    .line 121
    .line 122
    iget-object v1, v1, Lxb4;->i:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Lia1;

    .line 125
    .line 126
    invoke-virtual {v8, p2, v1}, Ly;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 127
    .line 128
    .line 129
    iget-object p2, p0, Lom0;->l:Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {p2, p1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    iget-object p1, p0, Lom0;->i:Lxb4;

    .line 136
    .line 137
    iget-object p1, p1, Lxb4;->g:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p1, Llu0;

    .line 140
    .line 141
    invoke-virtual {p1, v6}, Llu0;->execute(Ljava/lang/Runnable;)V

    .line 142
    .line 143
    .line 144
    invoke-static {}, Lh80;->d()Lh80;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-array p2, v2, [Ljava/lang/Throwable;

    .line 149
    .line 150
    invoke-virtual {p1, p2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    const/4 p1, 0x1

    .line 154
    return p1

    .line 155
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 156
    throw p1
.end method

.method public final h()V
    .locals 5

    .line 1
    iget-object v0, p0, Lom0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lom0;->k:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lom0;->g:Landroid/content/Context;

    .line 13
    .line 14
    sget-object v2, Lrz0;->o:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v2, Landroid/content/Intent;

    .line 17
    .line 18
    const-class v3, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 19
    .line 20
    invoke-direct {v2, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    const-string v1, "ACTION_STOP_FOREGROUND"

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    .line 28
    :try_start_1
    iget-object v1, p0, Lom0;->g:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    :try_start_2
    invoke-static {}, Lh80;->d()Lh80;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    sget-object v3, Lom0;->q:Ljava/lang/String;

    .line 40
    .line 41
    const-string v4, "Unable to stop foreground service"

    .line 42
    .line 43
    filled-new-array {v1}, [Ljava/lang/Throwable;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v2, v3, v4, v1}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget-object v1, p0, Lom0;->f:Landroid/os/PowerManager$WakeLock;

    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    iput-object v1, p0, Lom0;->f:Landroid/os/PowerManager$WakeLock;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception v1

    .line 62
    goto :goto_2

    .line 63
    :cond_0
    :goto_1
    monitor-exit v0

    .line 64
    return-void

    .line 65
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    throw v1
.end method
