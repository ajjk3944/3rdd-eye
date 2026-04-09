.class public final Lvz0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Let0;


# static fields
.field public static final j:Ljava/lang/String;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Landroid/app/job/JobScheduler;

.field public final h:Lha1;

.field public final i:Luz0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "SystemJobScheduler"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lvz0;->j:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lha1;)V
    .locals 2

    .line 1
    const-string v0, "jobscheduler"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/job/JobScheduler;

    .line 8
    .line 9
    new-instance v1, Luz0;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Luz0;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lvz0;->f:Landroid/content/Context;

    .line 18
    .line 19
    iput-object p2, p0, Lvz0;->h:Lha1;

    .line 20
    .line 21
    iput-object v0, p0, Lvz0;->g:Landroid/app/job/JobScheduler;

    .line 22
    .line 23
    iput-object v1, p0, Lvz0;->i:Luz0;

    .line 24
    .line 25
    return-void
.end method

.method public static a(Landroid/app/job/JobScheduler;I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p0

    .line 6
    invoke-static {}, Lh80;->d()Lh80;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v2, "Exception while trying to cancel job (%d)"

    .line 23
    .line 24
    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    filled-new-array {p0}, [Ljava/lang/Throwable;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object v1, Lvz0;->j:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1, p1, p0}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    invoke-static {}, Lh80;->d()Lh80;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "getAllPendingJobs() is not reliable on this device."

    .line 13
    .line 14
    filled-new-array {p1}, [Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v3, Lvz0;->j:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v3, v2, p1}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p1, v0

    .line 24
    :goto_0
    if-nez p1, :cond_0

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Landroid/content/ComponentName;

    .line 37
    .line 38
    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 39
    .line 40
    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Landroid/app/job/JobInfo;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v1, v2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lvz0;->f:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lvz0;->g:Landroid/app/job/JobScheduler;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lvz0;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    move v6, v2

    .line 25
    :cond_1
    :goto_0
    if-ge v6, v5, :cond_3

    .line 26
    .line 27
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    add-int/lit8 v6, v6, 0x1

    .line 32
    .line 33
    check-cast v7, Landroid/app/job/JobInfo;

    .line 34
    .line 35
    const-string v8, "EXTRA_WORK_SPEC_ID"

    .line 36
    .line 37
    invoke-virtual {v7}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    if-eqz v9, :cond_2

    .line 42
    .line 43
    :try_start_0
    invoke-virtual {v9, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_2

    .line 48
    .line 49
    invoke-virtual {v9, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    goto :goto_1

    .line 54
    :catch_0
    :cond_2
    move-object v8, v3

    .line 55
    :goto_1
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_1

    .line 60
    .line 61
    invoke-virtual {v7}, Landroid/app/job/JobInfo;->getId()I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move-object v3, v4

    .line 74
    :goto_2
    if-eqz v3, :cond_5

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_5

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    :goto_3
    if-ge v2, v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    check-cast v4, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-static {v1, v4}, Lvz0;->a(Landroid/app/job/JobScheduler;I)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    iget-object v0, p0, Lvz0;->h:Lha1;

    .line 105
    .line 106
    iget-object v0, v0, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 107
    .line 108
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()Lt83;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0, p1}, Lt83;->O(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    return-void
.end method

.method public final varargs d([Loa1;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lvz0;->h:Lha1;

    .line 2
    .line 3
    iget-object v1, v0, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    new-instance v2, Lf20;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, v3, v1}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    array-length v3, p1

    .line 12
    const/4 v4, 0x0

    .line 13
    move v5, v4

    .line 14
    :goto_0
    if-ge v5, v3, :cond_4

    .line 15
    .line 16
    aget-object v6, p1, v5

    .line 17
    .line 18
    invoke-virtual {v1}, Lpq0;->c()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    iget-object v8, v6, Loa1;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v7, v8}, Lh2;->h(Ljava/lang/String;)Loa1;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    if-nez v7, :cond_0

    .line 32
    .line 33
    invoke-static {}, Lh80;->d()Lh80;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    new-array v7, v4, [Ljava/lang/Throwable;

    .line 38
    .line 39
    invoke-virtual {v6, v7}, Lh80;->g([Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :goto_1
    invoke-virtual {v1}, Lpq0;->f()V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_4

    .line 51
    :cond_0
    :try_start_1
    iget v7, v7, Loa1;->b:I

    .line 52
    .line 53
    const/4 v8, 0x1

    .line 54
    if-eq v7, v8, :cond_1

    .line 55
    .line 56
    invoke-static {}, Lh80;->d()Lh80;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    new-array v7, v4, [Ljava/lang/Throwable;

    .line 61
    .line 62
    invoke-virtual {v6, v7}, Lh80;->g([Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lpq0;->h()V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()Lt83;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    iget-object v8, v6, Loa1;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v7, v8}, Lt83;->F(Ljava/lang/String;)Lsz0;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    if-eqz v7, :cond_2

    .line 80
    .line 81
    iget v8, v7, Lsz0;->b:I

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    iget-object v8, v0, Lha1;->q:Lru0;

    .line 85
    .line 86
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v8, v0, Lha1;->q:Lru0;

    .line 90
    .line 91
    iget v8, v8, Lru0;->b:I

    .line 92
    .line 93
    invoke-virtual {v2, v8}, Lf20;->j(I)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    :goto_2
    if-nez v7, :cond_3

    .line 98
    .line 99
    new-instance v7, Lsz0;

    .line 100
    .line 101
    iget-object v9, v6, Loa1;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-direct {v7, v9, v8}, Lsz0;-><init>(Ljava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    iget-object v9, v0, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 107
    .line 108
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->k()Lt83;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-virtual {v9, v7}, Lt83;->J(Lsz0;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-virtual {p0, v6, v8}, Lvz0;->e(Loa1;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Lpq0;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :goto_4
    invoke-virtual {v1}, Lpq0;->f()V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :cond_4
    return-void
.end method

.method public final e(Loa1;I)V
    .locals 12

    .line 1
    iget-object v0, p0, Lvz0;->g:Landroid/app/job/JobScheduler;

    .line 2
    .line 3
    sget-object v1, Lvz0;->j:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lvz0;->i:Luz0;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, p1, Loa1;->j:Lri;

    .line 11
    .line 12
    new-instance v4, Landroid/os/PersistableBundle;

    .line 13
    .line 14
    invoke-direct {v4}, Landroid/os/PersistableBundle;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v5, "EXTRA_WORK_SPEC_ID"

    .line 18
    .line 19
    iget-object v6, p1, Loa1;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v5, "EXTRA_IS_PERIODIC"

    .line 25
    .line 26
    invoke-virtual {p1}, Loa1;->c()Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    new-instance v5, Landroid/app/job/JobInfo$Builder;

    .line 34
    .line 35
    iget-object v2, v2, Luz0;->a:Landroid/content/ComponentName;

    .line 36
    .line 37
    invoke-direct {v5, p2, v2}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 38
    .line 39
    .line 40
    iget-boolean v2, v3, Lri;->b:Z

    .line 41
    .line 42
    invoke-virtual {v5, v2}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-boolean v5, v3, Lri;->c:Z

    .line 47
    .line 48
    invoke-virtual {v2, v5}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2, v4}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget v4, v3, Lri;->a:I

    .line 57
    .line 58
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    const/16 v6, 0x1e

    .line 61
    .line 62
    const/4 v7, 0x2

    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v9, 0x1

    .line 65
    if-lt v5, v6, :cond_0

    .line 66
    .line 67
    const/4 v6, 0x6

    .line 68
    if-ne v4, v6, :cond_0

    .line 69
    .line 70
    new-instance v4, Landroid/net/NetworkRequest$Builder;

    .line 71
    .line 72
    invoke-direct {v4}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 73
    .line 74
    .line 75
    const/16 v6, 0x19

    .line 76
    .line 77
    invoke-virtual {v4, v6}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v2, v4}, Lq0;->s(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_0
    invoke-static {v4}, Lex0;->s(I)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_3

    .line 94
    .line 95
    if-eq v4, v9, :cond_1

    .line 96
    .line 97
    if-eq v4, v7, :cond_2

    .line 98
    .line 99
    const/4 v6, 0x3

    .line 100
    if-eq v4, v6, :cond_4

    .line 101
    .line 102
    const/4 v6, 0x4

    .line 103
    if-eq v4, v6, :cond_4

    .line 104
    .line 105
    invoke-static {}, Lh80;->d()Lh80;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    sget v6, Luz0;->b:I

    .line 110
    .line 111
    new-array v6, v8, [Ljava/lang/Throwable;

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    move v6, v9

    .line 117
    goto :goto_0

    .line 118
    :cond_2
    move v6, v7

    .line 119
    goto :goto_0

    .line 120
    :cond_3
    move v6, v8

    .line 121
    :cond_4
    :goto_0
    invoke-virtual {v2, v6}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 122
    .line 123
    .line 124
    :goto_1
    iget-boolean v4, v3, Lri;->c:Z

    .line 125
    .line 126
    if-nez v4, :cond_6

    .line 127
    .line 128
    iget v4, p1, Loa1;->l:I

    .line 129
    .line 130
    if-ne v4, v7, :cond_5

    .line 131
    .line 132
    move v4, v8

    .line 133
    goto :goto_2

    .line 134
    :cond_5
    move v4, v9

    .line 135
    :goto_2
    iget-wide v6, p1, Loa1;->m:J

    .line 136
    .line 137
    invoke-virtual {v2, v6, v7, v4}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-virtual {p1}, Loa1;->a()J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 145
    .line 146
    .line 147
    move-result-wide v10

    .line 148
    sub-long/2addr v6, v10

    .line 149
    const-wide/16 v10, 0x0

    .line 150
    .line 151
    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    const/16 v4, 0x1c

    .line 156
    .line 157
    if-gt v5, v4, :cond_7

    .line 158
    .line 159
    invoke-virtual {v2, v6, v7}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_7
    cmp-long v4, v6, v10

    .line 164
    .line 165
    if-lez v4, :cond_8

    .line 166
    .line 167
    invoke-virtual {v2, v6, v7}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_8
    iget-boolean v4, p1, Loa1;->q:Z

    .line 172
    .line 173
    if-nez v4, :cond_9

    .line 174
    .line 175
    invoke-static {v2}, Lq0;->r(Landroid/app/job/JobInfo$Builder;)V

    .line 176
    .line 177
    .line 178
    :cond_9
    :goto_3
    iget-object v4, v3, Lri;->h:Lhj;

    .line 179
    .line 180
    iget-object v4, v4, Lhj;->a:Ljava/util/HashSet;

    .line 181
    .line 182
    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-lez v4, :cond_b

    .line 187
    .line 188
    iget-object v4, v3, Lri;->h:Lhj;

    .line 189
    .line 190
    iget-object v4, v4, Lhj;->a:Ljava/util/HashSet;

    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-eqz v5, :cond_a

    .line 201
    .line 202
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    check-cast v5, Lgj;

    .line 207
    .line 208
    iget-boolean v6, v5, Lgj;->b:Z

    .line 209
    .line 210
    new-instance v7, Landroid/app/job/JobInfo$TriggerContentUri;

    .line 211
    .line 212
    iget-object v5, v5, Lgj;->a:Landroid/net/Uri;

    .line 213
    .line 214
    invoke-direct {v7, v5, v6}, Landroid/app/job/JobInfo$TriggerContentUri;-><init>(Landroid/net/Uri;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v7}, Landroid/app/job/JobInfo$Builder;->addTriggerContentUri(Landroid/app/job/JobInfo$TriggerContentUri;)Landroid/app/job/JobInfo$Builder;

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_a
    iget-wide v4, v3, Lri;->f:J

    .line 222
    .line 223
    invoke-virtual {v2, v4, v5}, Landroid/app/job/JobInfo$Builder;->setTriggerContentUpdateDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 224
    .line 225
    .line 226
    iget-wide v4, v3, Lri;->g:J

    .line 227
    .line 228
    invoke-virtual {v2, v4, v5}, Landroid/app/job/JobInfo$Builder;->setTriggerContentMaxDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 229
    .line 230
    .line 231
    :cond_b
    invoke-virtual {v2, v8}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    .line 232
    .line 233
    .line 234
    iget-boolean v4, v3, Lri;->d:Z

    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroid/app/job/JobInfo$Builder;->setRequiresBatteryNotLow(Z)Landroid/app/job/JobInfo$Builder;

    .line 237
    .line 238
    .line 239
    iget-boolean v3, v3, Lri;->e:Z

    .line 240
    .line 241
    invoke-virtual {v2, v3}, Landroid/app/job/JobInfo$Builder;->setRequiresStorageNotLow(Z)Landroid/app/job/JobInfo$Builder;

    .line 242
    .line 243
    .line 244
    iget v3, p1, Loa1;->k:I

    .line 245
    .line 246
    if-lez v3, :cond_c

    .line 247
    .line 248
    move v3, v9

    .line 249
    goto :goto_5

    .line 250
    :cond_c
    move v3, v8

    .line 251
    :goto_5
    invoke-static {}, Lgc;->a()Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-eqz v4, :cond_d

    .line 256
    .line 257
    iget-boolean v4, p1, Loa1;->q:Z

    .line 258
    .line 259
    if-eqz v4, :cond_d

    .line 260
    .line 261
    if-nez v3, :cond_d

    .line 262
    .line 263
    invoke-static {v2}, Llb;->q(Landroid/app/job/JobInfo$Builder;)V

    .line 264
    .line 265
    .line 266
    :cond_d
    invoke-virtual {v2}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {}, Lh80;->d()Lh80;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    new-array v4, v8, [Ljava/lang/Throwable;

    .line 275
    .line 276
    invoke-virtual {v3, v4}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 277
    .line 278
    .line 279
    :try_start_0
    invoke-virtual {v0, v2}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-nez v2, :cond_e

    .line 284
    .line 285
    invoke-static {}, Lh80;->d()Lh80;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    new-array v3, v8, [Ljava/lang/Throwable;

    .line 290
    .line 291
    invoke-virtual {v2, v3}, Lh80;->g([Ljava/lang/Throwable;)V

    .line 292
    .line 293
    .line 294
    iget-boolean v2, p1, Loa1;->q:Z

    .line 295
    .line 296
    if-eqz v2, :cond_e

    .line 297
    .line 298
    iget v2, p1, Loa1;->r:I

    .line 299
    .line 300
    if-ne v2, v9, :cond_e

    .line 301
    .line 302
    iput-boolean v8, p1, Loa1;->q:Z

    .line 303
    .line 304
    invoke-static {}, Lh80;->d()Lh80;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    new-array v3, v8, [Ljava/lang/Throwable;

    .line 309
    .line 310
    invoke-virtual {v2, v3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p0, p1, p2}, Lvz0;->e(Loa1;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :catchall_0
    move-exception p2

    .line 318
    goto :goto_6

    .line 319
    :catch_0
    move-exception p1

    .line 320
    goto :goto_7

    .line 321
    :cond_e
    return-void

    .line 322
    :goto_6
    invoke-static {}, Lh80;->d()Lh80;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    new-instance v2, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    const-string v3, "Unable to schedule "

    .line 329
    .line 330
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    filled-new-array {p2}, [Ljava/lang/Throwable;

    .line 341
    .line 342
    .line 343
    move-result-object p2

    .line 344
    invoke-virtual {v0, v1, p1, p2}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :goto_7
    iget-object p2, p0, Lvz0;->f:Landroid/content/Context;

    .line 349
    .line 350
    invoke-static {p2, v0}, Lvz0;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 351
    .line 352
    .line 353
    move-result-object p2

    .line 354
    if-eqz p2, :cond_f

    .line 355
    .line 356
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 357
    .line 358
    .line 359
    move-result p2

    .line 360
    goto :goto_8

    .line 361
    :cond_f
    move p2, v8

    .line 362
    :goto_8
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object p2

    .line 370
    iget-object v2, p0, Lvz0;->h:Lha1;

    .line 371
    .line 372
    iget-object v3, v2, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 373
    .line 374
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-virtual {v3}, Lh2;->d()Ljava/util/ArrayList;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    iget-object v2, v2, Lha1;->q:Lru0;

    .line 391
    .line 392
    iget v2, v2, Lru0;->c:I

    .line 393
    .line 394
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    filled-new-array {p2, v3, v2}, [Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object p2

    .line 402
    const-string v2, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."

    .line 403
    .line 404
    invoke-static {v0, v2, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p2

    .line 408
    invoke-static {}, Lh80;->d()Lh80;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    new-array v2, v8, [Ljava/lang/Throwable;

    .line 413
    .line 414
    invoke-virtual {v0, v1, p2, v2}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 415
    .line 416
    .line 417
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 418
    .line 419
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 420
    .line 421
    .line 422
    throw v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
