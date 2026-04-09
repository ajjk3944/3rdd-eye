.class public final Liy0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f:Lha1;

.field public final g:Ljava/lang/String;

.field public final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "StopWorkRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lha1;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Liy0;->f:Lha1;

    .line 5
    .line 6
    iput-object p2, p0, Liy0;->g:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Liy0;->h:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Liy0;->f:Lha1;

    .line 2
    .line 3
    iget-object v1, v0, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    iget-object v0, v0, Lha1;->u:Lom0;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1}, Lpq0;->c()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v3, p0, Liy0;->g:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v4, v0, Lom0;->p:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    :try_start_1
    iget-object v0, v0, Lom0;->k:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 26
    :try_start_2
    iget-boolean v3, p0, Liy0;->h:Z

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Liy0;->f:Lha1;

    .line 32
    .line 33
    iget-object v0, v0, Lha1;->u:Lom0;

    .line 34
    .line 35
    iget-object v2, p0, Liy0;->g:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, v0, Lom0;->p:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 40
    :try_start_3
    invoke-static {}, Lh80;->d()Lh80;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    new-array v6, v4, [Ljava/lang/Throwable;

    .line 45
    .line 46
    invoke-virtual {v5, v6}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Lom0;->k:Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lwa1;

    .line 56
    .line 57
    invoke-static {v2, v0}, Lom0;->c(Ljava/lang/String;Lwa1;)Z

    .line 58
    .line 59
    .line 60
    monitor-exit v3

    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 64
    :try_start_4
    throw v0

    .line 65
    :catchall_1
    move-exception v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    if-nez v0, :cond_1

    .line 68
    .line 69
    iget-object v0, p0, Liy0;->g:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v2, v0}, Lh2;->e(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v3, 0x2

    .line 76
    if-ne v0, v3, :cond_1

    .line 77
    .line 78
    iget-object v0, p0, Liy0;->g:Ljava/lang/String;

    .line 79
    .line 80
    filled-new-array {v0}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const/4 v3, 0x1

    .line 85
    invoke-virtual {v2, v3, v0}, Lh2;->n(I[Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    iget-object v0, p0, Liy0;->f:Lha1;

    .line 89
    .line 90
    iget-object v0, v0, Lha1;->u:Lom0;

    .line 91
    .line 92
    iget-object v2, p0, Liy0;->g:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v3, v0, Lom0;->p:Ljava/lang/Object;

    .line 95
    .line 96
    monitor-enter v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 97
    :try_start_5
    invoke-static {}, Lh80;->d()Lh80;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    new-array v6, v4, [Ljava/lang/Throwable;

    .line 102
    .line 103
    invoke-virtual {v5, v6}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v0, Lom0;->l:Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lwa1;

    .line 113
    .line 114
    invoke-static {v2, v0}, Lom0;->c(Ljava/lang/String;Lwa1;)Z

    .line 115
    .line 116
    .line 117
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 118
    :goto_0
    :try_start_6
    invoke-static {}, Lh80;->d()Lh80;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-array v2, v4, [Ljava/lang/Throwable;

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lpq0;->h()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Lpq0;->f()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :catchall_2
    move-exception v0

    .line 135
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 136
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 137
    :catchall_3
    move-exception v0

    .line 138
    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 139
    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 140
    :goto_1
    invoke-virtual {v1}, Lpq0;->f()V

    .line 141
    .line 142
    .line 143
    throw v0
.end method
