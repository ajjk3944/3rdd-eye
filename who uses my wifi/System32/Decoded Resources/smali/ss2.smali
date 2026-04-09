.class public final Lss2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldn2;


# instance fields
.field public final f:Ltr2;

.field public final g:Lur2;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ltr2;Lur2;Ljava/util/concurrent/Executor;Lld2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lss2;->f:Ltr2;

    .line 5
    .line 6
    iput-object p2, p0, Lss2;->g:Lur2;

    .line 7
    .line 8
    iput-object p3, p0, Lss2;->h:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    iput-object p4, p0, Lss2;->i:Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lss2;->g:Lur2;

    .line 2
    .line 3
    iget-boolean v0, v0, Lur2;->e:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lss2;->f:Ltr2;

    .line 10
    .line 11
    invoke-virtual {v0}, Ltr2;->k()Lxz2;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v2, v0, Ltr2;->m:Ln70;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    sget-object v2, Lmz1;->N5:Liz1;

    .line 24
    .line 25
    sget-object v3, Ltw1;->e:Ltw1;

    .line 26
    .line 27
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    monitor-enter v0

    .line 42
    :try_start_1
    iget-object v1, v0, Ltr2;->m:Ln70;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    monitor-exit v0

    .line 45
    monitor-enter v0

    .line 46
    :try_start_2
    iget-object v2, v0, Ltr2;->n:Lpd2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    const/4 v0, 0x2

    .line 54
    new-array v0, v0, [Ln70;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    aput-object v1, v0, v3

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    aput-object v2, v0, v1

    .line 61
    .line 62
    new-instance v1, Lzp3;

    .line 63
    .line 64
    invoke-static {v0}, Lxm3;->n([Ljava/lang/Object;)Lsn3;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {v1, v0, v3}, Lzp3;-><init>(Lxm3;Z)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Lkf3;

    .line 72
    .line 73
    const/16 v2, 0x16

    .line 74
    .line 75
    invoke-direct {v0, v2, p0}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v2, p0, Lss2;->i:Ljava/util/concurrent/Executor;

    .line 79
    .line 80
    new-instance v4, Ljq3;

    .line 81
    .line 82
    invoke-direct {v4, v1, v0, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v4, v2}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catchall_0
    move-exception v1

    .line 90
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    throw v1

    .line 92
    :catchall_1
    move-exception v1

    .line 93
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 94
    throw v1

    .line 95
    :catchall_2
    move-exception v1

    .line 96
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 97
    throw v1

    .line 98
    :cond_1
    if-eqz v1, :cond_4

    .line 99
    .line 100
    invoke-virtual {v0}, Ltr2;->j()Lag2;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0}, Ltr2;->h()Lag2;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    if-nez v0, :cond_3

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    goto :goto_0

    .line 115
    :cond_3
    move-object v1, v0

    .line 116
    :goto_0
    if-eqz v1, :cond_4

    .line 117
    .line 118
    new-instance v0, Lig2;

    .line 119
    .line 120
    const/4 v2, 0x5

    .line 121
    invoke-direct {v0, v1, v2}, Lig2;-><init>(Lag2;I)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lss2;->h:Ljava/util/concurrent/Executor;

    .line 125
    .line 126
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    :goto_1
    return-void
.end method
