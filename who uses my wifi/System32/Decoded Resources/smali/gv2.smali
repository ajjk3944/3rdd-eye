.class public final Lgv2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lto2;
.implements Lfd1;
.implements Ldn2;
.implements Lxm2;
.implements Ldo2;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Ls83;

.field public final h:Lmv2;

.field public final i:Lh83;

.field public final j:La83;

.field public final k:Ljz2;

.field public final l:Ljava/lang/String;

.field public m:J

.field public n:Ljava/lang/Boolean;

.field public final o:Z

.field public final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final q:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ls83;Lmv2;Lh83;La83;Ljz2;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lgv2;->m:J

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lgv2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lgv2;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    iput-object p1, p0, Lgv2;->f:Landroid/content/Context;

    .line 24
    .line 25
    iput-object p2, p0, Lgv2;->g:Ls83;

    .line 26
    .line 27
    iput-object p3, p0, Lgv2;->h:Lmv2;

    .line 28
    .line 29
    iput-object p4, p0, Lgv2;->i:Lh83;

    .line 30
    .line 31
    iput-object p5, p0, Lgv2;->j:La83;

    .line 32
    .line 33
    iput-object p6, p0, Lgv2;->k:Ljz2;

    .line 34
    .line 35
    sget-object p1, Lmz1;->g7:Liz1;

    .line 36
    .line 37
    sget-object p2, Ltw1;->e:Ltw1;

    .line 38
    .line 39
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput-boolean p1, p0, Lgv2;->o:Z

    .line 52
    .line 53
    iput-object p7, p0, Lgv2;->l:Ljava/lang/String;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final C()V
    .locals 1

    .line 1
    iget-object v0, p0, Lgv2;->j:La83;

    .line 2
    .line 3
    invoke-virtual {v0}, La83;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, "click"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lgv2;->c(Ljava/lang/String;)Llv2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Lgv2;->e(Llv2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final D0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lgv2;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lgv2;->j:La83;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v1}, La83;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    const-string v0, "impression"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lgv2;->c(Ljava/lang/String;)Llv2;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget v1, v1, La83;->e:I

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "imp_type"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-wide v1, p0, Lgv2;->m:J

    .line 35
    .line 36
    const-wide/16 v3, 0x0

    .line 37
    .line 38
    cmp-long v1, v1, v3

    .line 39
    .line 40
    if-lez v1, :cond_2

    .line 41
    .line 42
    sget-object v1, Lhg4;->C:Lhg4;

    .line 43
    .line 44
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    iget-wide v3, p0, Lgv2;->m:J

    .line 54
    .line 55
    sub-long/2addr v1, v3

    .line 56
    const-string v3, "p_imp_l"

    .line 57
    .line 58
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v3, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    sget-object v1, Lmz1;->je:Liz1;

    .line 66
    .line 67
    sget-object v2, Ltw1;->e:Ltw1;

    .line 68
    .line 69
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0}, Lgv2;->h()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_5

    .line 88
    .line 89
    sget-object v1, Lhg4;->C:Lhg4;

    .line 90
    .line 91
    iget-object v1, v1, Lhg4;->c:Llf4;

    .line 92
    .line 93
    iget-object v1, p0, Lgv2;->f:Landroid/content/Context;

    .line 94
    .line 95
    invoke-static {v1}, Llf4;->g(Landroid/content/Context;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    const-string v2, "0"

    .line 100
    .line 101
    const-string v3, "1"

    .line 102
    .line 103
    const/4 v4, 0x1

    .line 104
    if-eq v4, v1, :cond_3

    .line 105
    .line 106
    move-object v1, v3

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    move-object v1, v2

    .line 109
    :goto_1
    const-string v5, "foreground"

    .line 110
    .line 111
    invoke-virtual {v0, v5, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, Lgv2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eq v4, v1, :cond_4

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    move-object v2, v3

    .line 124
    :goto_2
    const-string v1, "fg_show"

    .line 125
    .line 126
    invoke-virtual {v0, v1, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    invoke-virtual {p0, v0}, Lgv2;->e(Llv2;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final O(Lnx2;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lgv2;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "ifts"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lgv2;->c(Ljava/lang/String;)Llv2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "reason"

    .line 13
    .line 14
    const-string v2, "adapter"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget v1, p1, Lnx2;->f:I

    .line 20
    .line 21
    iget-object v2, p1, Lnx2;->g:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p1, Lnx2;->h:Ljava/lang/String;

    .line 24
    .line 25
    const-string v4, "com.google.android.gms.ads"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    iget-object v3, p1, Lnx2;->i:Lnx2;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    iget-object v3, v3, Lnx2;->h:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    iget-object p1, p1, Lnx2;->i:Lnx2;

    .line 46
    .line 47
    iget v1, p1, Lnx2;->f:I

    .line 48
    .line 49
    iget-object v2, p1, Lnx2;->g:Ljava/lang/String;

    .line 50
    .line 51
    :cond_1
    if-ltz v1, :cond_2

    .line 52
    .line 53
    const-string p1, "arec"

    .line 54
    .line 55
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, p1, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object p1, p0, Lgv2;->g:Ls83;

    .line 63
    .line 64
    iget-object p1, p1, Ls83;->a:Ljava/util/regex/Pattern;

    .line 65
    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    goto :goto_1

    .line 86
    :cond_4
    :goto_0
    const/4 p1, 0x0

    .line 87
    :goto_1
    if-eqz p1, :cond_5

    .line 88
    .line 89
    const-string v1, "areec"

    .line 90
    .line 91
    invoke-virtual {v0, v1, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_5
    invoke-virtual {v0}, Llv2;->m()V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final R(Lpq2;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lgv2;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "ifts"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lgv2;->c(Ljava/lang/String;)Llv2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "reason"

    .line 13
    .line 14
    const-string v2, "exception"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "msg"

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {v0}, Llv2;->m()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final a()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lgv2;->n:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lgv2;->n:Ljava/lang/Boolean;

    .line 7
    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    sget-object v0, Lmz1;->B1:Liz1;

    .line 11
    .line 12
    sget-object v1, Ltw1;->e:Ltw1;

    .line 13
    .line 14
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/String;

    .line 21
    .line 22
    sget-object v1, Lhg4;->C:Lhg4;

    .line 23
    .line 24
    iget-object v1, v1, Lhg4;->c:Llf4;

    .line 25
    .line 26
    iget-object v1, p0, Lgv2;->f:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    :try_start_1
    invoke-static {v1}, Llf4;->M(Landroid/content/Context;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_2

    .line 35
    :catch_0
    const/4 v1, 0x0

    .line 36
    :goto_0
    const/4 v2, 0x0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    :try_start_2
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v2
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    goto :goto_1

    .line 47
    :catch_1
    move-exception v0

    .line 48
    :try_start_3
    sget-object v1, Lhg4;->C:Lhg4;

    .line 49
    .line 50
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 51
    .line 52
    const-string v3, "CsiActionsListener.isPatternMatched"

    .line 53
    .line 54
    invoke-virtual {v1, v3, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lgv2;->n:Ljava/lang/Boolean;

    .line 62
    .line 63
    :cond_2
    monitor-exit p0

    .line 64
    goto :goto_3

    .line 65
    :goto_2
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 66
    throw v0

    .line 67
    :cond_3
    :goto_3
    iget-object v0, p0, Lgv2;->n:Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    return v0
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lgv2;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "ifts"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lgv2;->c(Ljava/lang/String;)Llv2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "reason"

    .line 13
    .line 14
    const-string v2, "blocked"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Llv2;->m()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final c(Ljava/lang/String;)Llv2;
    .locals 7

    .line 1
    iget-object v0, p0, Lgv2;->i:Lh83;

    .line 2
    .line 3
    iget-object v1, v0, Lh83;->b:Lp21;

    .line 4
    .line 5
    iget-object v0, v0, Lh83;->a:Lf20;

    .line 6
    .line 7
    iget-object v2, p0, Lgv2;->h:Lmv2;

    .line 8
    .line 9
    invoke-virtual {v2}, Lmv2;->a()Llv2;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v1, v1, Lp21;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lc83;

    .line 16
    .line 17
    const-string v3, "gqi"

    .line 18
    .line 19
    iget-object v1, v1, Lc83;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v2, v3, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lgv2;->j:La83;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Llv2;->i(La83;)V

    .line 27
    .line 28
    .line 29
    const-string v3, "action"

    .line 30
    .line 31
    invoke-virtual {v2, v3, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lgv2;->l:Ljava/lang/String;

    .line 35
    .line 36
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 37
    .line 38
    invoke-virtual {p1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v3, "ad_format"

    .line 43
    .line 44
    invoke-virtual {v2, v3, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v1, La83;->t:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v4, 0x0

    .line 54
    if-nez v3, :cond_0

    .line 55
    .line 56
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/lang/String;

    .line 61
    .line 62
    const-string v3, "ancn"

    .line 63
    .line 64
    invoke-virtual {v2, v3, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-virtual {v1}, La83;->b()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    const/4 v1, 0x1

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    sget-object p1, Lhg4;->C:Lhg4;

    .line 75
    .line 76
    iget-object v3, p1, Lhg4;->h:Lgd2;

    .line 77
    .line 78
    iget-object v5, p0, Lgv2;->f:Landroid/content/Context;

    .line 79
    .line 80
    invoke-virtual {v3, v5}, Lgd2;->i(Landroid/content/Context;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eq v1, v3, :cond_1

    .line 85
    .line 86
    const-string v3, "offline"

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const-string v3, "online"

    .line 90
    .line 91
    :goto_0
    const-string v5, "device_connectivity"

    .line 92
    .line 93
    invoke-virtual {v2, v5, v3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p1, Lhg4;->k:Lym;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const-string v3, "event_timestamp"

    .line 110
    .line 111
    invoke-virtual {v2, v3, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string p1, "offline_ad"

    .line 115
    .line 116
    const-string v3, "1"

    .line 117
    .line 118
    invoke-virtual {v2, p1, v3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_2
    sget-object p1, Lmz1;->n7:Liz1;

    .line 122
    .line 123
    sget-object v3, Ltw1;->e:Ltw1;

    .line 124
    .line 125
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 126
    .line 127
    invoke-virtual {v3, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_4

    .line 138
    .line 139
    iget-object p1, v0, Lf20;->g:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast p1, Ll83;

    .line 142
    .line 143
    invoke-static {p1}, La30;->D(Ll83;)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eq p1, v1, :cond_3

    .line 148
    .line 149
    move v4, v1

    .line 150
    :cond_3
    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    const-string v1, "scar"

    .line 155
    .line 156
    invoke-virtual {v2, v1, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    if-eqz v4, :cond_4

    .line 160
    .line 161
    iget-object p1, v0, Lf20;->g:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p1, Ll83;

    .line 164
    .line 165
    iget-object p1, p1, Ll83;->d:Lpc4;

    .line 166
    .line 167
    const-string v0, "ragent"

    .line 168
    .line 169
    iget-object v1, p1, Lpc4;->u:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v2, v0, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, La30;->w(Lpc4;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {p1}, La30;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string v0, "rtype"

    .line 183
    .line 184
    invoke-virtual {v2, v0, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :cond_4
    return-object v2
.end method

.method public final e(Llv2;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lgv2;->j:La83;

    .line 2
    .line 3
    invoke-virtual {v0}, La83;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p1, Llv2;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lmv2;

    .line 12
    .line 13
    iget-object v0, v0, Lmv2;->a:Lpv2;

    .line 14
    .line 15
    iget-object p1, p1, Llv2;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    iget-object v0, v0, Lpv2;->f:Lgs3;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lgs3;->a(Ljava/util/Map;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    new-instance v1, Lwo1;

    .line 26
    .line 27
    sget-object p1, Lhg4;->C:Lhg4;

    .line 28
    .line 29
    iget-object p1, p1, Lhg4;->k:Lym;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    iget-object p1, p0, Lgv2;->i:Lh83;

    .line 39
    .line 40
    iget-object p1, p1, Lh83;->b:Lp21;

    .line 41
    .line 42
    iget-object p1, p1, Lp21;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lc83;

    .line 45
    .line 46
    iget-object v4, p1, Lc83;->b:Ljava/lang/String;

    .line 47
    .line 48
    const/4 v6, 0x2

    .line 49
    invoke-direct/range {v1 .. v6}, Lwo1;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lgv2;->k:Ljz2;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v0, Lmr2;

    .line 58
    .line 59
    const/4 v2, 0x4

    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-direct {v0, p1, v1, v2, v3}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljz2;->a(Lo93;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    invoke-virtual {p1}, Llv2;->m()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lgv2;->j:La83;

    .line 2
    .line 3
    iget v0, v0, La83;->b:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x6

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x7

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public final k()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lgv2;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lgv2;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lhg4;->C:Lhg4;

    .line 15
    .line 16
    iget-object v2, v0, Lhg4;->k:Lym;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    iput-wide v2, p0, Lgv2;->m:J

    .line 26
    .line 27
    const-string v2, "presentation"

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Lgv2;->c(Ljava/lang/String;)Llv2;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v3, Lmz1;->je:Liz1;

    .line 34
    .line 35
    sget-object v4, Ltw1;->e:Ltw1;

    .line 36
    .line 37
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 38
    .line 39
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const-string v5, "1"

    .line 50
    .line 51
    const-string v6, "0"

    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0}, Lgv2;->h()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    iget-object v3, p0, Lgv2;->f:Landroid/content/Context;

    .line 62
    .line 63
    invoke-static {v3}, Llf4;->g(Landroid/content/Context;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    xor-int/2addr v3, v1

    .line 68
    iget-object v7, p0, Lgv2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    .line 70
    invoke-virtual {v7, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eq v1, v3, :cond_1

    .line 78
    .line 79
    move-object v3, v6

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move-object v3, v5

    .line 82
    :goto_0
    const-string v7, "foreground"

    .line 83
    .line 84
    invoke-virtual {v2, v7, v3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    sget-object v3, Lmz1;->ke:Liz1;

    .line 88
    .line 89
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    invoke-virtual {p0}, Lgv2;->h()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_4

    .line 108
    .line 109
    iget-object v0, v0, Lhg4;->g:Lwy0;

    .line 110
    .line 111
    invoke-virtual {v0}, Lwy0;->k()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eq v1, v0, :cond_3

    .line 116
    .line 117
    move-object v5, v6

    .line 118
    :cond_3
    const-string v0, "fg_al"

    .line 119
    .line 120
    invoke-virtual {v2, v0, v5}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    invoke-virtual {v2}, Llv2;->m()V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final p()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lgv2;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "adapter_impression"

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lgv2;->c(Ljava/lang/String;)Llv2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lgv2;->j:La83;

    .line 15
    .line 16
    iget v1, v1, La83;->e:I

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "imp_type"

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lgv2;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const-string v2, "po"

    .line 34
    .line 35
    const-string v3, "0"

    .line 36
    .line 37
    const-string v4, "1"

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, v2, v4}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lhg4;->C:Lhg4;

    .line 45
    .line 46
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    iget-wide v5, p0, Lgv2;->m:J

    .line 56
    .line 57
    sub-long/2addr v1, v5

    .line 58
    const-string v5, "pil"

    .line 59
    .line 60
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v5, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {v0, v2, v3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    sget-object v1, Lmz1;->je:Liz1;

    .line 72
    .line 73
    sget-object v2, Ltw1;->e:Ltw1;

    .line 74
    .line 75
    iget-object v5, v2, Ltw1;->c:Lkz1;

    .line 76
    .line 77
    invoke-virtual {v5, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    const/4 v5, 0x1

    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    invoke-virtual {p0}, Lgv2;->h()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    sget-object v1, Lhg4;->C:Lhg4;

    .line 97
    .line 98
    iget-object v1, v1, Lhg4;->c:Llf4;

    .line 99
    .line 100
    iget-object v1, p0, Lgv2;->f:Landroid/content/Context;

    .line 101
    .line 102
    invoke-static {v1}, Llf4;->g(Landroid/content/Context;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eq v5, v1, :cond_2

    .line 107
    .line 108
    move-object v1, v4

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    move-object v1, v3

    .line 111
    :goto_1
    const-string v6, "foreground"

    .line 112
    .line 113
    invoke-virtual {v0, v6, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Lgv2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eq v5, v1, :cond_3

    .line 123
    .line 124
    move-object v1, v3

    .line 125
    goto :goto_2

    .line 126
    :cond_3
    move-object v1, v4

    .line 127
    :goto_2
    const-string v6, "fg_show"

    .line 128
    .line 129
    invoke-virtual {v0, v6, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    sget-object v1, Lmz1;->ke:Liz1;

    .line 133
    .line 134
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 135
    .line 136
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    invoke-virtual {p0}, Lgv2;->h()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_6

    .line 153
    .line 154
    sget-object v1, Lhg4;->C:Lhg4;

    .line 155
    .line 156
    iget-object v1, v1, Lhg4;->g:Lwy0;

    .line 157
    .line 158
    invoke-virtual {v1}, Lwy0;->k()Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eq v5, v1, :cond_5

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    move-object v3, v4

    .line 166
    :goto_3
    const-string v1, "fg_al"

    .line 167
    .line 168
    invoke-virtual {v0, v1, v3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_6
    invoke-virtual {v0}, Llv2;->m()V

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public final w()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgv2;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "adapter_shown"

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lgv2;->c(Ljava/lang/String;)Llv2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Llv2;->m()V

    .line 15
    .line 16
    .line 17
    return-void
.end method
