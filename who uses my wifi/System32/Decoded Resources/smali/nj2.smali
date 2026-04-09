.class public final Lnj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lum2;
.implements Lrn2;
.implements Ldn2;
.implements Lfd1;
.implements Lbn2;
.implements Ltp2;
.implements Ldo2;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/ScheduledExecutorService;

.field public final j:Lh83;

.field public final k:La83;

.field public final l:Ldb3;

.field public final m:Lq83;

.field public final n:Lvs1;

.field public final o:Lf02;

.field public final p:Ljava/lang/ref/WeakReference;

.field public final q:Ljava/lang/ref/WeakReference;

.field public final r:Lt83;

.field public final s:Lao2;

.field public final t:Lgm2;

.field public u:Z

.field public final v:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lld2;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lh83;La83;Ldb3;Lq83;Landroid/view/View;Lag2;Lvs1;Lf02;Lt83;Lao2;Lgm2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lnj2;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    iput-object p1, p0, Lnj2;->f:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Lnj2;->g:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    iput-object p3, p0, Lnj2;->h:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    iput-object p4, p0, Lnj2;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 18
    .line 19
    iput-object p5, p0, Lnj2;->j:Lh83;

    .line 20
    .line 21
    iput-object p6, p0, Lnj2;->k:La83;

    .line 22
    .line 23
    iput-object p7, p0, Lnj2;->l:Ldb3;

    .line 24
    .line 25
    iput-object p8, p0, Lnj2;->m:Lq83;

    .line 26
    .line 27
    iput-object p11, p0, Lnj2;->n:Lvs1;

    .line 28
    .line 29
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-direct {p1, p9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lnj2;->p:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-direct {p1, p10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lnj2;->q:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    iput-object p12, p0, Lnj2;->o:Lf02;

    .line 44
    .line 45
    iput-object p13, p0, Lnj2;->r:Lt83;

    .line 46
    .line 47
    iput-object p14, p0, Lnj2;->s:Lao2;

    .line 48
    .line 49
    move-object/from16 p1, p15

    .line 50
    .line 51
    iput-object p1, p0, Lnj2;->t:Lgm2;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final C()V
    .locals 5

    .line 1
    sget-object v0, Lmz1;->B0:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lnj2;->j:Lh83;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v1, Lh83;->b:Lp21;

    .line 22
    .line 23
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lc83;

    .line 26
    .line 27
    iget-boolean v0, v0, Lc83;->h:Z

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object v0, Lr02;->d:Lso1;

    .line 33
    .line 34
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, Lnj2;->o:Lf02;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v1, Llq3;->g:Llq3;

    .line 52
    .line 53
    invoke-static {v1}, Lgq3;->r(Ln70;)Lgq3;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v2, Lr02;->c:Lso1;

    .line 58
    .line 59
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/lang/Long;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 70
    .line 71
    iget-object v0, v0, Lf02;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 72
    .line 73
    invoke-static {v1, v2, v3, v4, v0}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lgq3;

    .line 78
    .line 79
    invoke-static {v0}, Lgq3;->r(Ln70;)Lgq3;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v1, Lgj1;->h:Lgj1;

    .line 84
    .line 85
    sget-object v2, Lmd2;->g:Lld2;

    .line 86
    .line 87
    const-class v3, Ljava/lang/Throwable;

    .line 88
    .line 89
    invoke-static {v0, v3, v1, v2}, Lpu1;->J(Ln70;Ljava/lang/Class;Lzk3;Ljava/util/concurrent/Executor;)Lxo3;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v1, Lf20;

    .line 94
    .line 95
    const/16 v2, 0x12

    .line 96
    .line 97
    invoke-direct {v1, v2, p0}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance v2, Ljq3;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-direct {v2, v0, v1, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, Lnj2;->g:Ljava/util/concurrent/Executor;

    .line 107
    .line 108
    invoke-interface {v0, v2, v1}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_1
    :goto_0
    iget-object v0, p0, Lnj2;->k:La83;

    .line 113
    .line 114
    iget-object v2, v0, La83;->c:Ljava/util/List;

    .line 115
    .line 116
    iget-object v3, p0, Lnj2;->l:Ldb3;

    .line 117
    .line 118
    invoke-virtual {v3, v1, v0, v2}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sget-object v1, Lhg4;->C:Lhg4;

    .line 123
    .line 124
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 125
    .line 126
    iget-object v2, p0, Lnj2;->f:Landroid/content/Context;

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Lgd2;->i(Landroid/content/Context;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    const/4 v2, 0x1

    .line 133
    if-eq v2, v1, :cond_2

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    const/4 v2, 0x2

    .line 137
    :goto_1
    iget-object v1, p0, Lnj2;->m:Lq83;

    .line 138
    .line 139
    invoke-virtual {v1, v2, v0}, Lq83;->b(ILjava/util/ArrayList;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final D0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lnj2;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v0, Lmz1;->b4:Liz1;

    .line 13
    .line 14
    sget-object v1, Ltw1;->e:Ltw1;

    .line 15
    .line 16
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 17
    .line 18
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-lez v0, :cond_1

    .line 31
    .line 32
    sget-object v2, Lmz1;->c4:Liz1;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p0, v0, v1}, Lnj2;->h(II)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    sget-object v0, Lmz1;->a4:Liz1;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    new-instance v0, Llj2;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p0, v1}, Llj2;-><init>(Lnj2;I)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lnj2;->h:Ljava/util/concurrent/Executor;

    .line 69
    .line 70
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    invoke-virtual {p0}, Lnj2;->l()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final J(Lka2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 1
    iget-object p2, p0, Lnj2;->k:La83;

    .line 2
    .line 3
    iget-object p3, p2, La83;->h:Ljava/util/List;

    .line 4
    .line 5
    iget-object v0, p0, Lnj2;->l:Ldb3;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v2, v0, Ldb3;->h:Lym;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :try_start_0
    iget-object v4, p1, Lka2;->f:Ljava/lang/String;

    .line 25
    .line 26
    iget p1, p1, Lka2;->g:I

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    sget-object v5, Lmz1;->T3:Liz1;

    .line 33
    .line 34
    sget-object v6, Ltw1;->e:Ltw1;

    .line 35
    .line 36
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 37
    .line 38
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    sget-object v6, Lxk3;->f:Lxk3;

    .line 49
    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    iget-object v5, v0, Ldb3;->g:Lj83;

    .line 53
    .line 54
    if-nez v5, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object v5, v5, Lj83;->a:Li83;

    .line 58
    .line 59
    if-nez v5, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    new-instance v6, Lfl3;

    .line 63
    .line 64
    invoke-direct {v6, v5}, Lfl3;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget-object v5, v0, Ldb3;->f:Li83;

    .line 69
    .line 70
    if-nez v5, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    new-instance v6, Lfl3;

    .line 74
    .line 75
    invoke-direct {v6, v5}, Lfl3;-><init>(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    sget-object v5, Lgj1;->u:Lgj1;

    .line 79
    .line 80
    invoke-virtual {v6, v5}, Ljq0;->c(Lzk3;)Ljq0;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v5}, Ljq0;->b()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    check-cast v5, Ljava/lang/String;

    .line 89
    .line 90
    sget-object v7, Lgj1;->t:Lgj1;

    .line 91
    .line 92
    invoke-virtual {v6, v7}, Ljq0;->c(Lzk3;)Ljq0;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v6}, Ljq0;->b()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    check-cast v6, Ljava/lang/String;

    .line 101
    .line 102
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_4

    .line 111
    .line 112
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    check-cast v7, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v5}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    const-string v9, "@gw_rwd_userid@"

    .line 123
    .line 124
    invoke-static {v7, v9, v8}, Ldb3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-static {v6}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    const-string v9, "@gw_rwd_custom_data@"

    .line 133
    .line 134
    invoke-static {v7, v9, v8}, Ldb3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    const-string v9, "@gw_tmstmp@"

    .line 143
    .line 144
    invoke-static {v7, v9, v8}, Ldb3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-static {v4}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    const-string v9, "@gw_rwd_itm@"

    .line 153
    .line 154
    invoke-static {v7, v9, v8}, Ldb3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    const-string v8, "@gw_rwd_amt@"

    .line 159
    .line 160
    invoke-static {v7, v8, p1}, Ldb3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    iget-object v8, v0, Ldb3;->b:Ljava/lang/String;

    .line 165
    .line 166
    const-string v9, "@gw_sdkver@"

    .line 167
    .line 168
    invoke-static {v7, v9, v8}, Ldb3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    iget-object v8, v0, Ldb3;->e:Landroid/content/Context;

    .line 173
    .line 174
    iget-boolean v9, p2, La83;->W:Z

    .line 175
    .line 176
    iget-object v10, p2, La83;->w0:Ljava/util/HashMap;

    .line 177
    .line 178
    invoke-static {v7, v8, v9, v10}, Lm54;->E(Ljava/lang/String;Landroid/content/Context;ZLjava/util/HashMap;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :catch_0
    move-exception p1

    .line 187
    const-string p2, "Unable to determine award type and amount."

    .line 188
    .line 189
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    :cond_4
    const/4 p1, 0x0

    .line 193
    iget-object p2, p0, Lnj2;->m:Lq83;

    .line 194
    .line 195
    invoke-virtual {p2, v1, p1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public final T()V
    .locals 0

    .line 1
    return-void
.end method

.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lnj2;->k:La83;

    .line 2
    .line 3
    iget-object v1, v0, La83;->g:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lnj2;->l:Ldb3;

    .line 6
    .line 7
    iget-object v3, p0, Lnj2;->j:Lh83;

    .line 8
    .line 9
    invoke-virtual {v2, v3, v0, v1}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    iget-object v2, p0, Lnj2;->m:Lq83;

    .line 15
    .line 16
    invoke-virtual {v2, v0, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lnj2;->k:La83;

    .line 2
    .line 3
    iget-object v1, v0, La83;->i:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lnj2;->l:Ldb3;

    .line 6
    .line 7
    iget-object v3, p0, Lnj2;->j:Lh83;

    .line 8
    .line 9
    invoke-virtual {v2, v3, v0, v1}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    iget-object v2, p0, Lnj2;->m:Lq83;

    .line 15
    .line 16
    invoke-virtual {v2, v0, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final declared-synchronized e()V
    .locals 15

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lnj2;->u:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v8, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0}, Lnj2;->p()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Lnj2;->k:La83;

    .line 17
    .line 18
    iget-object v0, v4, La83;->f:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lnj2;->m:Lq83;

    .line 24
    .line 25
    iget-object v2, p0, Lnj2;->l:Ldb3;

    .line 26
    .line 27
    iget-object v3, p0, Lnj2;->j:Lh83;

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v9, 0x0

    .line 31
    const/4 v5, 0x1

    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-virtual/range {v2 .. v9}, Ldb3;->b(Lh83;La83;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lgm2;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v2, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_0
    iget-object v0, p0, Lnj2;->m:Lq83;

    .line 46
    .line 47
    iget-object v2, p0, Lnj2;->l:Ldb3;

    .line 48
    .line 49
    iget-object v3, p0, Lnj2;->j:Lh83;

    .line 50
    .line 51
    iget-object v4, p0, Lnj2;->k:La83;

    .line 52
    .line 53
    iget-object v5, v4, La83;->m:Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {v2, v3, v4, v5}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v0, v5, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 60
    .line 61
    .line 62
    sget-object v5, Lmz1;->X3:Liz1;

    .line 63
    .line 64
    sget-object v6, Ltw1;->e:Ltw1;

    .line 65
    .line 66
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 67
    .line 68
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_3

    .line 79
    .line 80
    iget-object v5, p0, Lnj2;->r:Lt83;

    .line 81
    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    iget-object v6, v5, Lt83;->h:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v6, La83;

    .line 87
    .line 88
    iget-object v6, v6, La83;->m:Ljava/util/List;

    .line 89
    .line 90
    iget-object v7, v5, Lt83;->i:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v7, Lo13;

    .line 93
    .line 94
    invoke-virtual {v7}, Lo13;->d()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    new-instance v8, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-eqz v9, :cond_1

    .line 112
    .line 113
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    check-cast v9, Ljava/lang/String;

    .line 118
    .line 119
    const-string v10, "@gw_adnetstatus@"

    .line 120
    .line 121
    invoke-static {v9, v10, v7}, Ldb3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_1
    iget-object v6, v5, Lt83;->i:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v6, Lo13;

    .line 132
    .line 133
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    :try_start_1
    iget-wide v9, v6, Lo13;->h:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 135
    .line 136
    :try_start_2
    monitor-exit v6

    .line 137
    new-instance v6, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    const/4 v11, 0x0

    .line 147
    :goto_1
    if-ge v11, v7, :cond_2

    .line 148
    .line 149
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    add-int/lit8 v11, v11, 0x1

    .line 154
    .line 155
    check-cast v12, Ljava/lang/String;

    .line 156
    .line 157
    const/16 v13, 0xa

    .line 158
    .line 159
    invoke-static {v9, v10, v13}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    const-string v14, "@gw_ttr@"

    .line 164
    .line 165
    invoke-static {v12, v14, v13}, Ldb3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v12

    .line 169
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_2
    iget-object v7, v5, Lt83;->g:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v7, Lh83;

    .line 176
    .line 177
    iget-object v5, v5, Lt83;->h:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v5, La83;

    .line 180
    .line 181
    invoke-virtual {v2, v7, v5, v6}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {v0, v5, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :catchall_1
    move-exception v0

    .line 190
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 191
    :try_start_4
    throw v0

    .line 192
    :cond_3
    :goto_2
    iget-object v5, v4, La83;->f:Ljava/util/List;

    .line 193
    .line 194
    invoke-virtual {v2, v3, v4, v5}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v0, v2, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 199
    .line 200
    .line 201
    :goto_3
    const/4 v0, 0x1

    .line 202
    iput-boolean v0, p0, Lnj2;->u:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 203
    .line 204
    monitor-exit p0

    .line 205
    return-void

    .line 206
    :goto_4
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 207
    throw v0
.end method

.method public final h(II)V
    .locals 3

    .line 1
    if-lez p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lnj2;->p:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    new-instance v0, Lmj2;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, p0, p1, p2, v1}, Lmj2;-><init>(Lnj2;III)V

    .line 31
    .line 32
    .line 33
    int-to-long p1, p2

    .line 34
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 35
    .line 36
    iget-object v2, p0, Lnj2;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    invoke-interface {v2, v0, p1, p2, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lnj2;->l()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lnj2;->k:La83;

    .line 2
    .line 3
    iget-object v1, v0, La83;->u0:Ljava/util/AbstractCollection;

    .line 4
    .line 5
    iget-object v2, p0, Lnj2;->l:Ldb3;

    .line 6
    .line 7
    iget-object v3, p0, Lnj2;->j:Lh83;

    .line 8
    .line 9
    invoke-virtual {v2, v3, v0, v1}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    iget-object v2, p0, Lnj2;->m:Lq83;

    .line 15
    .line 16
    invoke-virtual {v2, v0, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lnj2;->k:La83;

    .line 2
    .line 3
    iget v1, v0, La83;->e:I

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lnj2;->j:Lh83;

    .line 9
    .line 10
    iget-object v2, v0, La83;->A0:Ljava/util/AbstractCollection;

    .line 11
    .line 12
    iget-object v3, p0, Lnj2;->l:Ldb3;

    .line 13
    .line 14
    invoke-virtual {v3, v1, v0, v2}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    iget-object v2, p0, Lnj2;->m:Lq83;

    .line 20
    .line 21
    invoke-virtual {v2, v0, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final l()V
    .locals 8

    .line 1
    iget-object v2, p0, Lnj2;->k:La83;

    .line 2
    .line 3
    iget-object v0, v2, La83;->d:Ljava/util/List;

    .line 4
    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lmz1;->S3:Liz1;

    .line 16
    .line 17
    sget-object v1, Ltw1;->e:Ltw1;

    .line 18
    .line 19
    iget-object v3, v1, Ltw1;->c:Lkz1;

    .line 20
    .line 21
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 22
    .line 23
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lnj2;->n:Lvs1;

    .line 37
    .line 38
    iget-object v0, v0, Lvs1;->b:Lrs1;

    .line 39
    .line 40
    iget-object v4, p0, Lnj2;->p:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Landroid/view/View;

    .line 47
    .line 48
    iget-object v5, p0, Lnj2;->f:Landroid/content/Context;

    .line 49
    .line 50
    invoke-interface {v0, v5, v4, v3}, Lrs1;->i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    :cond_1
    move-object v4, v3

    .line 55
    sget-object v0, Lmz1;->B0:Liz1;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    iget-object v0, p0, Lnj2;->j:Lh83;

    .line 70
    .line 71
    iget-object v0, v0, Lh83;->b:Lp21;

    .line 72
    .line 73
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lc83;

    .line 76
    .line 77
    iget-boolean v0, v0, Lc83;->h:Z

    .line 78
    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    :cond_2
    sget-object v0, Lr02;->h:Lso1;

    .line 82
    .line 83
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_4

    .line 94
    .line 95
    :cond_3
    invoke-virtual {p0}, Lnj2;->p()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    iget-object v7, p0, Lnj2;->t:Lgm2;

    .line 100
    .line 101
    iget-object v0, p0, Lnj2;->l:Ldb3;

    .line 102
    .line 103
    iget-object v1, p0, Lnj2;->j:Lh83;

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    const/4 v5, 0x0

    .line 107
    invoke-virtual/range {v0 .. v7}, Ldb3;->b(Lh83;La83;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lgm2;)Ljava/util/ArrayList;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v1, p0, Lnj2;->s:Lao2;

    .line 112
    .line 113
    iget-object v2, p0, Lnj2;->m:Lq83;

    .line 114
    .line 115
    invoke-virtual {v2, v0, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_4
    sget-object v0, Lr02;->g:Lso1;

    .line 120
    .line 121
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_6

    .line 132
    .line 133
    iget v0, v2, La83;->b:I

    .line 134
    .line 135
    const/4 v2, 0x1

    .line 136
    if-eq v0, v2, :cond_5

    .line 137
    .line 138
    const/4 v2, 0x2

    .line 139
    if-eq v0, v2, :cond_5

    .line 140
    .line 141
    const/4 v2, 0x5

    .line 142
    if-ne v0, v2, :cond_6

    .line 143
    .line 144
    :cond_5
    iget-object v0, p0, Lnj2;->q:Ljava/lang/ref/WeakReference;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lag2;

    .line 151
    .line 152
    :cond_6
    sget-object v0, Llq3;->g:Llq3;

    .line 153
    .line 154
    invoke-static {v0}, Lgq3;->r(Ln70;)Lgq3;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    sget-object v2, Lmz1;->e1:Liz1;

    .line 159
    .line 160
    invoke-virtual {v1, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, Ljava/lang/Long;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 167
    .line 168
    .line 169
    move-result-wide v1

    .line 170
    iget-object v3, p0, Lnj2;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 171
    .line 172
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 173
    .line 174
    invoke-static {v0, v1, v2, v5, v3}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Lgq3;

    .line 179
    .line 180
    new-instance v1, Lvq2;

    .line 181
    .line 182
    const/16 v2, 0x1c

    .line 183
    .line 184
    const/4 v3, 0x0

    .line 185
    invoke-direct {v1, p0, v4, v2, v3}, Lvq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 186
    .line 187
    .line 188
    new-instance v2, Ljq3;

    .line 189
    .line 190
    invoke-direct {v2, v0, v1, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 191
    .line 192
    .line 193
    iget-object v1, p0, Lnj2;->g:Ljava/util/concurrent/Executor;

    .line 194
    .line 195
    invoke-interface {v0, v2, v1}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 196
    .line 197
    .line 198
    :cond_7
    :goto_0
    return-void
.end method

.method public final p()Ljava/util/List;
    .locals 6

    .line 1
    sget-object v0, Lmz1;->hc:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lnj2;->k:La83;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    sget-object v0, Lhg4;->C:Lhg4;

    .line 22
    .line 23
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 24
    .line 25
    iget-object v0, p0, Lnj2;->f:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v0}, Llf4;->d(Landroid/content/Context;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    const-string v2, "display"

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    instance-of v2, v0, Landroid/hardware/display/DisplayManager;

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    check-cast v0, Landroid/hardware/display/DisplayManager;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    array-length v0, v0

    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const/4 v0, 0x0

    .line 57
    :goto_0
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/16 v2, 0x14

    .line 64
    .line 65
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    new-instance v2, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v1, v1, La83;->d:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const-string v5, "dspct"

    .line 105
    .line 106
    invoke-virtual {v3, v5, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v3}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    return-object v2

    .line 119
    :cond_3
    :goto_2
    iget-object v0, v1, La83;->d:Ljava/util/List;

    .line 120
    .line 121
    return-object v0
.end method

.method public final r()V
    .locals 0

    .line 1
    return-void
.end method

.method public final s(Lnx2;)V
    .locals 6

    .line 1
    sget-object v0, Lmz1;->D1:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget p1, p1, Lnx2;->f:I

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lnj2;->k:La83;

    .line 27
    .line 28
    iget-object v2, v1, La83;->o:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    new-instance v5, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x2

    .line 57
    .line 58
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 59
    .line 60
    .line 61
    const-string v4, "2."

    .line 62
    .line 63
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v5, "@gw_mpe@"

    .line 74
    .line 75
    invoke-static {v3, v5, v4}, Ldb3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    iget-object p1, p0, Lnj2;->l:Ldb3;

    .line 84
    .line 85
    iget-object v2, p0, Lnj2;->j:Lh83;

    .line 86
    .line 87
    invoke-virtual {p1, v2, v1, v0}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const/4 v0, 0x0

    .line 92
    iget-object v1, p0, Lnj2;->m:Lq83;

    .line 93
    .line 94
    invoke-virtual {v1, p1, v0}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    return-void
.end method
