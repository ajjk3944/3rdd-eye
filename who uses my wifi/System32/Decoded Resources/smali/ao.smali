.class public final Lao;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lu91;
.implements Lgt;
.implements Lra1;


# static fields
.field public static final synthetic o:I


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Lqz0;

.field public final j:Lv91;

.field public final k:Ljava/lang/Object;

.field public l:I

.field public m:Landroid/os/PowerManager$WakeLock;

.field public n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "DelayMetCommandHandler"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;Lqz0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lao;->f:Landroid/content/Context;

    .line 5
    .line 6
    iput p2, p0, Lao;->g:I

    .line 7
    .line 8
    iput-object p4, p0, Lao;->i:Lqz0;

    .line 9
    .line 10
    iput-object p3, p0, Lao;->h:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p2, p4, Lqz0;->g:Ll01;

    .line 13
    .line 14
    new-instance p3, Lv91;

    .line 15
    .line 16
    invoke-direct {p3, p1, p2, p0}, Lv91;-><init>(Landroid/content/Context;Ll01;Lu91;)V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, Lao;->j:Lv91;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, Lao;->n:Z

    .line 23
    .line 24
    iput p1, p0, Lao;->l:I

    .line 25
    .line 26
    new-instance p1, Ljava/lang/Object;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lao;->k:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Z)V
    .locals 4

    .line 1
    invoke-static {}, Lh80;->d()Lh80;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/Throwable;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lao;->b()V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lao;->g:I

    .line 15
    .line 16
    iget-object v0, p0, Lao;->i:Lqz0;

    .line 17
    .line 18
    iget-object v1, p0, Lao;->f:Landroid/content/Context;

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    iget-object p2, p0, Lao;->h:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, p2}, Lkg;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v2, Lk7;

    .line 29
    .line 30
    const/4 v3, 0x3

    .line 31
    invoke-direct {v2, v0, p2, p1, v3}, Lk7;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Lqz0;->e(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-boolean p2, p0, Lao;->n:Z

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    new-instance p2, Landroid/content/Intent;

    .line 42
    .line 43
    const-class v2, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 44
    .line 45
    invoke-direct {p2, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 46
    .line 47
    .line 48
    const-string v1, "ACTION_CONSTRAINTS_CHANGED"

    .line 49
    .line 50
    invoke-virtual {p2, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    new-instance v1, Lk7;

    .line 54
    .line 55
    const/4 v2, 0x3

    .line 56
    invoke-direct {v1, v0, p2, p1, v2}, Lk7;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lqz0;->e(Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lao;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lao;->j:Lv91;

    .line 5
    .line 6
    invoke-virtual {v1}, Lv91;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lao;->i:Lqz0;

    .line 10
    .line 11
    iget-object v1, v1, Lqz0;->h:Lta1;

    .line 12
    .line 13
    iget-object v2, p0, Lao;->h:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lta1;->b(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lao;->m:Landroid/os/PowerManager$WakeLock;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-static {}, Lh80;->d()Lh80;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lao;->m:Landroid/os/PowerManager$WakeLock;

    .line 33
    .line 34
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lao;->m:Landroid/os/PowerManager$WakeLock;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :goto_0
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    throw v1
.end method

.method public final c(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lao;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lao;->h:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v2, " ("

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget v2, p0, Lao;->g:I

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, ")"

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v2, p0, Lao;->f:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {v2, v0}, Ly71;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lao;->m:Landroid/os/PowerManager$WakeLock;

    .line 37
    .line 38
    invoke-static {}, Lh80;->d()Lh80;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v2, p0, Lao;->m:Landroid/os/PowerManager$WakeLock;

    .line 43
    .line 44
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    new-array v3, v2, [Ljava/lang/Throwable;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lao;->m:Landroid/os/PowerManager$WakeLock;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lao;->i:Lqz0;

    .line 59
    .line 60
    iget-object v0, v0, Lqz0;->j:Lha1;

    .line 61
    .line 62
    iget-object v0, v0, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, v1}, Lh2;->h(Ljava/lang/String;)Loa1;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_0

    .line 73
    .line 74
    invoke-virtual {p0}, Lao;->f()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_0
    invoke-virtual {v0}, Loa1;->b()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    iput-boolean v3, p0, Lao;->n:Z

    .line 83
    .line 84
    if-nez v3, :cond_1

    .line 85
    .line 86
    invoke-static {}, Lh80;->d()Lh80;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p0, v0}, Lao;->e(Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_1
    iget-object v1, p0, Lao;->j:Lv91;

    .line 104
    .line 105
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v1, v0}, Lv91;->b(Ljava/util/Collection;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final e(Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lao;->h:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lao;->k:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter p1

    .line 13
    :try_start_0
    iget v0, p0, Lao;->l:I

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput v0, p0, Lao;->l:I

    .line 20
    .line 21
    invoke-static {}, Lh80;->d()Lh80;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lao;->i:Lqz0;

    .line 31
    .line 32
    iget-object v0, v0, Lqz0;->i:Lom0;

    .line 33
    .line 34
    iget-object v1, p0, Lao;->h:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {v0, v1, v2}, Lom0;->g(Ljava/lang/String;Lt83;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Lao;->i:Lqz0;

    .line 44
    .line 45
    iget-object v0, v0, Lqz0;->h:Lta1;

    .line 46
    .line 47
    iget-object v1, p0, Lao;->h:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1, p0}, Lta1;->a(Ljava/lang/String;Lao;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {p0}, Lao;->b()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-static {}, Lh80;->d()Lh80;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    monitor-exit p1

    .line 69
    return-void

    .line 70
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    throw v0
.end method

.method public final f()V
    .locals 7

    .line 1
    iget-object v0, p0, Lao;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lao;->l:I

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    iput v2, p0, Lao;->l:I

    .line 11
    .line 12
    invoke-static {}, Lh80;->d()Lh80;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-array v2, v3, [Ljava/lang/Throwable;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lao;->f:Landroid/content/Context;

    .line 22
    .line 23
    iget-object v2, p0, Lao;->h:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v4, Landroid/content/Intent;

    .line 26
    .line 27
    const-class v5, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 28
    .line 29
    invoke-direct {v4, v1, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    const-string v1, "ACTION_STOP_WORK"

    .line 33
    .line 34
    invoke-virtual {v4, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    const-string v1, "KEY_WORKSPEC_ID"

    .line 38
    .line 39
    invoke-virtual {v4, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lao;->i:Lqz0;

    .line 43
    .line 44
    new-instance v2, Lk7;

    .line 45
    .line 46
    iget v5, p0, Lao;->g:I

    .line 47
    .line 48
    const/4 v6, 0x3

    .line 49
    invoke-direct {v2, v1, v4, v5, v6}, Lk7;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lqz0;->e(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lao;->i:Lqz0;

    .line 56
    .line 57
    iget-object v1, v1, Lqz0;->i:Lom0;

    .line 58
    .line 59
    iget-object v2, p0, Lao;->h:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lom0;->d(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    invoke-static {}, Lh80;->d()Lh80;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-array v2, v3, [Ljava/lang/Throwable;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lao;->f:Landroid/content/Context;

    .line 77
    .line 78
    iget-object v2, p0, Lao;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v1, v2}, Lkg;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object v2, p0, Lao;->i:Lqz0;

    .line 85
    .line 86
    new-instance v3, Lk7;

    .line 87
    .line 88
    iget v4, p0, Lao;->g:I

    .line 89
    .line 90
    const/4 v5, 0x3

    .line 91
    invoke-direct {v3, v2, v1, v4, v5}, Lk7;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v3}, Lqz0;->e(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception v1

    .line 99
    goto :goto_1

    .line 100
    :cond_0
    invoke-static {}, Lh80;->d()Lh80;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    new-array v2, v3, [Ljava/lang/Throwable;

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    invoke-static {}, Lh80;->d()Lh80;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    new-array v2, v3, [Ljava/lang/Throwable;

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    monitor-exit v0

    .line 120
    return-void

    .line 121
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    throw v1
.end method
