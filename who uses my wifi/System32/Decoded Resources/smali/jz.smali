.class public final Ljz;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final t:Lcom/google/android/gms/common/api/Status;

.field public static final u:Lcom/google/android/gms/common/api/Status;

.field public static final v:Ljava/lang/Object;

.field public static w:Ljz;


# instance fields
.field public f:J

.field public g:Z

.field public h:Lq01;

.field public i:Luc1;

.field public final j:Landroid/content/Context;

.field public final k:Lfz;

.field public final l:Lvq2;

.field public final m:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final n:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final o:Ljava/util/concurrent/ConcurrentHashMap;

.field public final p:Lu8;

.field public final q:Lu8;

.field public final r:Lwc1;

.field public volatile s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lrh;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ljz;->t:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lrh;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ljz;->u:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Ljz;->v:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 6

    .line 1
    sget-object v0, Lfz;->d:Lfz;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, Ljz;->f:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Ljz;->g:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Ljz;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Ljz;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    new-instance v2, Lu8;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Lu8;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Ljz;->p:Lu8;

    .line 44
    .line 45
    new-instance v2, Lu8;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Lu8;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, Ljz;->q:Lu8;

    .line 51
    .line 52
    iput-boolean v3, p0, Ljz;->s:Z

    .line 53
    .line 54
    iput-object p1, p0, Ljz;->j:Landroid/content/Context;

    .line 55
    .line 56
    new-instance v2, Lwc1;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-direct {v2, p2, p0, v3}, Lwc1;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;I)V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, Ljz;->r:Lwc1;

    .line 63
    .line 64
    iput-object v0, p0, Ljz;->k:Lfz;

    .line 65
    .line 66
    new-instance p2, Lvq2;

    .line 67
    .line 68
    const/16 v0, 0x11

    .line 69
    .line 70
    invoke-direct {p2, v0}, Lvq2;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object p2, p0, Ljz;->l:Lvq2;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    sget-object p2, Li30;->u:Ljava/lang/Boolean;

    .line 80
    .line 81
    if-nez p2, :cond_0

    .line 82
    .line 83
    const-string p2, "android.hardware.type.automotive"

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    sput-object p1, Li30;->u:Ljava/lang/Boolean;

    .line 94
    .line 95
    :cond_0
    sget-object p1, Li30;->u:Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_1

    .line 102
    .line 103
    iput-boolean v1, p0, Ljz;->s:Z

    .line 104
    .line 105
    :cond_1
    const/4 p1, 0x6

    .line 106
    invoke-virtual {v2, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public static c(Lc5;Lrh;)Lcom/google/android/gms/common/api/Status;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lc5;->b:Lgw3;

    .line 4
    .line 5
    iget-object p0, p0, Lgw3;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x3f

    .line 28
    .line 29
    add-int/2addr v2, v3

    .line 30
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const-string v2, "API: "

    .line 34
    .line 35
    const-string v3, " is not available on this device. Connection failed with: "

    .line 36
    .line 37
    invoke-static {v4, v2, p0, v3, v1}, Lex0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/16 v1, 0x11

    .line 42
    .line 43
    iget-object v2, p1, Lrh;->h:Landroid/app/PendingIntent;

    .line 44
    .line 45
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lrh;)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public static e(Landroid/content/Context;)Ljz;
    .locals 5

    .line 1
    sget-object v0, Ljz;->v:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ljz;->w:Ljz;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lnf4;->g:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, Lnf4;->i:Landroid/os/HandlerThread;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    monitor-exit v1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v2, Landroid/os/HandlerThread;

    .line 20
    .line 21
    const-string v3, "GoogleApiHandler"

    .line 22
    .line 23
    const/16 v4, 0x9

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    sput-object v2, Lnf4;->i:Landroid/os/HandlerThread;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    sget-object v2, Lnf4;->i:Landroid/os/HandlerThread;

    .line 34
    .line 35
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Ljz;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v3, Lfz;->c:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {v2, p0, v1}, Ljz;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, Ljz;->w:Ljz;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p0

    .line 55
    goto :goto_3

    .line 56
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    :try_start_4
    throw p0

    .line 58
    :cond_1
    :goto_2
    sget-object p0, Ljz;->w:Ljz;

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object p0

    .line 62
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    throw p0
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Ljz;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lsq0;->k()Lsq0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lsq0;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ltq0;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, v0, Ltq0;->g:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Ljz;->l:Lvq2;

    .line 21
    .line 22
    iget-object v0, v0, Lvq2;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/util/SparseIntArray;

    .line 25
    .line 26
    const v1, 0xc1fa340

    .line 27
    .line 28
    .line 29
    const/4 v2, -0x1

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->get(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eq v0, v2, :cond_3

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 40
    return v0

    .line 41
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 42
    return v0
.end method

.method public final b(Lrh;I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Ljz;->k:Lfz;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ljz;->j:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v1}, La30;->f(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget v2, p1, Lrh;->g:I

    .line 17
    .line 18
    iget-object p1, p1, Lrh;->h:Landroid/app/PendingIntent;

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    move v5, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v5, v3

    .line 28
    :goto_0
    if-eqz v5, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 p1, 0x0

    .line 32
    invoke-virtual {v0, v2, v1, p1}, Lgz;->b(ILandroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    const/high16 p1, 0xc000000

    .line 40
    .line 41
    invoke-static {v1, v3, v5, p1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_1
    if-eqz p1, :cond_4

    .line 46
    .line 47
    sget v5, Lcom/google/android/gms/common/api/GoogleApiActivity;->g:I

    .line 48
    .line 49
    new-instance v5, Landroid/content/Intent;

    .line 50
    .line 51
    const-class v6, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 52
    .line 53
    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    const-string v6, "pending_intent"

    .line 57
    .line 58
    invoke-virtual {v5, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    const-string p1, "failing_client_id"

    .line 62
    .line 63
    invoke-virtual {v5, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    const-string p1, "notify_manager"

    .line 67
    .line 68
    invoke-virtual {v5, p1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    sget p1, Ltc1;->a:I

    .line 72
    .line 73
    const/high16 p2, 0x8000000

    .line 74
    .line 75
    or-int/2addr p1, p2

    .line 76
    invoke-static {v1, v3, v5, p1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v0, v1, v2, p1}, Lfz;->g(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 81
    .line 82
    .line 83
    return v4

    .line 84
    :cond_4
    :goto_2
    return v3
.end method

.method public final d(Lez;)Lxb1;
    .locals 3

    .line 1
    iget-object v0, p1, Lez;->j:Lc5;

    .line 2
    .line 3
    iget-object v1, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lxb1;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lxb1;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, Lxb1;-><init>(Ljz;Lez;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, v2, Lxb1;->g:Lv4;

    .line 22
    .line 23
    invoke-interface {p1}, Lv4;->l()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Ljz;->q:Lu8;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lu8;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v2}, Lxb1;->j()V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public final f(Lrh;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ljz;->b(Lrh;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, Ljz;->r:Lwc1;

    .line 10
    .line 11
    invoke-virtual {v2, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 13

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/4 v3, 0x2

    .line 7
    const-wide/32 v4, 0x493e0

    .line 8
    .line 9
    .line 10
    const/16 v6, 0x11

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    return v7

    .line 19
    :pswitch_0
    iput-boolean v7, p0, Ljz;->g:Z

    .line 20
    .line 21
    return v9

    .line 22
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Lic1;

    .line 25
    .line 26
    iget-wide v4, p1, Lic1;->c:J

    .line 27
    .line 28
    const-wide/16 v10, 0x0

    .line 29
    .line 30
    cmp-long v0, v4, v10

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Lq01;

    .line 35
    .line 36
    iget v4, p1, Lic1;->b:I

    .line 37
    .line 38
    iget-object p1, p1, Lic1;->a:Lre0;

    .line 39
    .line 40
    filled-new-array {p1}, [Lre0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, v4, p1}, Lq01;-><init>(ILjava/util/List;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Ljz;->i:Luc1;

    .line 52
    .line 53
    if-nez p1, :cond_0

    .line 54
    .line 55
    iget-object p1, p0, Ljz;->j:Landroid/content/Context;

    .line 56
    .line 57
    sget-object v4, Lr01;->b:Lr01;

    .line 58
    .line 59
    new-instance v5, Luc1;

    .line 60
    .line 61
    sget-object v6, Luc1;->n:Lgw3;

    .line 62
    .line 63
    sget-object v8, Ldz;->b:Ldz;

    .line 64
    .line 65
    invoke-direct {v5, p1, v6, v4, v8}, Lez;-><init>(Landroid/content/Context;Lgw3;Lu4;Ldz;)V

    .line 66
    .line 67
    .line 68
    iput-object v5, p0, Ljz;->i:Luc1;

    .line 69
    .line 70
    :cond_0
    iget-object p1, p0, Ljz;->i:Luc1;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance v4, Lsq0;

    .line 76
    .line 77
    invoke-direct {v4, v2}, Lsq0;-><init>(I)V

    .line 78
    .line 79
    .line 80
    sget-object v2, La30;->l:Lju;

    .line 81
    .line 82
    filled-new-array {v2}, [Lju;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    new-instance v5, Lkf3;

    .line 87
    .line 88
    invoke-direct {v5, v1, v0}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iput-object v5, v4, Lsq0;->g:Ljava/lang/Object;

    .line 92
    .line 93
    new-instance v0, Lrb;

    .line 94
    .line 95
    invoke-direct {v0, v4, v2, v7, v7}, Lrb;-><init>(Lsq0;[Lju;ZI)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v3, v0}, Lez;->b(ILrb;)Lgi4;

    .line 99
    .line 100
    .line 101
    return v9

    .line 102
    :cond_1
    iget-object v0, p0, Ljz;->h:Lq01;

    .line 103
    .line 104
    if-eqz v0, :cond_8

    .line 105
    .line 106
    iget-object v4, v0, Lq01;->g:Ljava/util/List;

    .line 107
    .line 108
    iget v0, v0, Lq01;->f:I

    .line 109
    .line 110
    iget v5, p1, Lic1;->b:I

    .line 111
    .line 112
    if-ne v0, v5, :cond_4

    .line 113
    .line 114
    if-eqz v4, :cond_2

    .line 115
    .line 116
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iget v4, p1, Lic1;->d:I

    .line 121
    .line 122
    if-lt v0, v4, :cond_2

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    iget-object v0, p0, Ljz;->h:Lq01;

    .line 126
    .line 127
    iget-object v1, p1, Lic1;->a:Lre0;

    .line 128
    .line 129
    iget-object v2, v0, Lq01;->g:Ljava/util/List;

    .line 130
    .line 131
    if-nez v2, :cond_3

    .line 132
    .line 133
    new-instance v2, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    iput-object v2, v0, Lq01;->g:Ljava/util/List;

    .line 139
    .line 140
    :cond_3
    iget-object v0, v0, Lq01;->g:Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_4
    :goto_0
    iget-object v0, p0, Ljz;->r:Lwc1;

    .line 147
    .line 148
    invoke-virtual {v0, v6}, Landroid/os/Handler;->removeMessages(I)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Ljz;->h:Lq01;

    .line 152
    .line 153
    if-eqz v0, :cond_8

    .line 154
    .line 155
    iget v4, v0, Lq01;->f:I

    .line 156
    .line 157
    if-gtz v4, :cond_5

    .line 158
    .line 159
    invoke-virtual {p0}, Ljz;->a()Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-eqz v4, :cond_7

    .line 164
    .line 165
    :cond_5
    iget-object v4, p0, Ljz;->i:Luc1;

    .line 166
    .line 167
    if-nez v4, :cond_6

    .line 168
    .line 169
    iget-object v4, p0, Ljz;->j:Landroid/content/Context;

    .line 170
    .line 171
    sget-object v5, Lr01;->b:Lr01;

    .line 172
    .line 173
    new-instance v10, Luc1;

    .line 174
    .line 175
    sget-object v11, Luc1;->n:Lgw3;

    .line 176
    .line 177
    sget-object v12, Ldz;->b:Ldz;

    .line 178
    .line 179
    invoke-direct {v10, v4, v11, v5, v12}, Lez;-><init>(Landroid/content/Context;Lgw3;Lu4;Ldz;)V

    .line 180
    .line 181
    .line 182
    iput-object v10, p0, Ljz;->i:Luc1;

    .line 183
    .line 184
    :cond_6
    iget-object v4, p0, Ljz;->i:Luc1;

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v5, Lsq0;

    .line 190
    .line 191
    invoke-direct {v5, v2}, Lsq0;-><init>(I)V

    .line 192
    .line 193
    .line 194
    sget-object v2, La30;->l:Lju;

    .line 195
    .line 196
    filled-new-array {v2}, [Lju;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    new-instance v10, Lkf3;

    .line 201
    .line 202
    invoke-direct {v10, v1, v0}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    iput-object v10, v5, Lsq0;->g:Ljava/lang/Object;

    .line 206
    .line 207
    new-instance v0, Lrb;

    .line 208
    .line 209
    invoke-direct {v0, v5, v2, v7, v7}, Lrb;-><init>(Lsq0;[Lju;ZI)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4, v3, v0}, Lez;->b(ILrb;)Lgi4;

    .line 213
    .line 214
    .line 215
    :cond_7
    iput-object v8, p0, Ljz;->h:Lq01;

    .line 216
    .line 217
    :cond_8
    :goto_1
    iget-object v0, p0, Ljz;->h:Lq01;

    .line 218
    .line 219
    if-nez v0, :cond_20

    .line 220
    .line 221
    new-instance v0, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    iget-object v1, p1, Lic1;->a:Lre0;

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    new-instance v1, Lq01;

    .line 232
    .line 233
    iget v2, p1, Lic1;->b:I

    .line 234
    .line 235
    invoke-direct {v1, v2, v0}, Lq01;-><init>(ILjava/util/List;)V

    .line 236
    .line 237
    .line 238
    iput-object v1, p0, Ljz;->h:Lq01;

    .line 239
    .line 240
    iget-object v0, p0, Ljz;->r:Lwc1;

    .line 241
    .line 242
    invoke-virtual {v0, v6}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    iget-wide v2, p1, Lic1;->c:J

    .line 247
    .line 248
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 249
    .line 250
    .line 251
    return v9

    .line 252
    :pswitch_2
    iget-object p1, p0, Ljz;->h:Lq01;

    .line 253
    .line 254
    if-eqz p1, :cond_20

    .line 255
    .line 256
    iget v0, p1, Lq01;->f:I

    .line 257
    .line 258
    if-gtz v0, :cond_9

    .line 259
    .line 260
    invoke-virtual {p0}, Ljz;->a()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_b

    .line 265
    .line 266
    :cond_9
    iget-object v0, p0, Ljz;->i:Luc1;

    .line 267
    .line 268
    if-nez v0, :cond_a

    .line 269
    .line 270
    iget-object v0, p0, Ljz;->j:Landroid/content/Context;

    .line 271
    .line 272
    sget-object v4, Lr01;->b:Lr01;

    .line 273
    .line 274
    new-instance v5, Luc1;

    .line 275
    .line 276
    sget-object v6, Luc1;->n:Lgw3;

    .line 277
    .line 278
    sget-object v10, Ldz;->b:Ldz;

    .line 279
    .line 280
    invoke-direct {v5, v0, v6, v4, v10}, Lez;-><init>(Landroid/content/Context;Lgw3;Lu4;Ldz;)V

    .line 281
    .line 282
    .line 283
    iput-object v5, p0, Ljz;->i:Luc1;

    .line 284
    .line 285
    :cond_a
    iget-object v0, p0, Ljz;->i:Luc1;

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    new-instance v4, Lsq0;

    .line 291
    .line 292
    invoke-direct {v4, v2}, Lsq0;-><init>(I)V

    .line 293
    .line 294
    .line 295
    sget-object v2, La30;->l:Lju;

    .line 296
    .line 297
    filled-new-array {v2}, [Lju;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    new-instance v5, Lkf3;

    .line 302
    .line 303
    invoke-direct {v5, v1, p1}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    iput-object v5, v4, Lsq0;->g:Ljava/lang/Object;

    .line 307
    .line 308
    new-instance p1, Lrb;

    .line 309
    .line 310
    invoke-direct {p1, v4, v2, v7, v7}, Lrb;-><init>(Lsq0;[Lju;ZI)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v3, p1}, Lez;->b(ILrb;)Lgi4;

    .line 314
    .line 315
    .line 316
    :cond_b
    iput-object v8, p0, Ljz;->h:Lq01;

    .line 317
    .line 318
    return v9

    .line 319
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast p1, Lyb1;

    .line 322
    .line 323
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 324
    .line 325
    iget-object v1, p1, Lyb1;->a:Lc5;

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_20

    .line 332
    .line 333
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 334
    .line 335
    iget-object v1, p1, Lyb1;->a:Lc5;

    .line 336
    .line 337
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    check-cast v0, Lxb1;

    .line 342
    .line 343
    iget-object v1, v0, Lxb1;->o:Ljava/util/ArrayList;

    .line 344
    .line 345
    iget-object v2, v0, Lxb1;->r:Ljz;

    .line 346
    .line 347
    iget-object v3, v0, Lxb1;->f:Ljava/util/LinkedList;

    .line 348
    .line 349
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_20

    .line 354
    .line 355
    iget-object v1, v2, Ljz;->r:Lwc1;

    .line 356
    .line 357
    const/16 v4, 0xf

    .line 358
    .line 359
    invoke-virtual {v1, v4, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    iget-object v1, v2, Ljz;->r:Lwc1;

    .line 363
    .line 364
    const/16 v2, 0x10

    .line 365
    .line 366
    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    iget-object p1, p1, Lyb1;->b:Lju;

    .line 370
    .line 371
    new-instance v1, Ljava/util/ArrayList;

    .line 372
    .line 373
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    :cond_c
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-eqz v4, :cond_e

    .line 389
    .line 390
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    check-cast v4, Lcc1;

    .line 395
    .line 396
    if-eqz v4, :cond_c

    .line 397
    .line 398
    invoke-virtual {v4, v0}, Lcc1;->b(Lxb1;)[Lju;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    if-eqz v5, :cond_c

    .line 403
    .line 404
    array-length v6, v5

    .line 405
    move v8, v7

    .line 406
    :goto_3
    if-ge v8, v6, :cond_c

    .line 407
    .line 408
    aget-object v10, v5, v8

    .line 409
    .line 410
    invoke-static {v10, p1}, La30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    if-eqz v10, :cond_d

    .line 415
    .line 416
    if-ltz v8, :cond_c

    .line 417
    .line 418
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    goto :goto_2

    .line 422
    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 423
    .line 424
    goto :goto_3

    .line 425
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    :goto_4
    if-ge v7, v0, :cond_20

    .line 430
    .line 431
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    check-cast v2, Lcc1;

    .line 436
    .line 437
    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    new-instance v4, Ld41;

    .line 441
    .line 442
    invoke-direct {v4, p1}, Ld41;-><init>(Lju;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2, v4}, Lcc1;->d(Ljava/lang/Exception;)V

    .line 446
    .line 447
    .line 448
    add-int/lit8 v7, v7, 0x1

    .line 449
    .line 450
    goto :goto_4

    .line 451
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast p1, Lyb1;

    .line 454
    .line 455
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 456
    .line 457
    iget-object v1, p1, Lyb1;->a:Lc5;

    .line 458
    .line 459
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-eqz v0, :cond_20

    .line 464
    .line 465
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 466
    .line 467
    iget-object v1, p1, Lyb1;->a:Lc5;

    .line 468
    .line 469
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    check-cast v0, Lxb1;

    .line 474
    .line 475
    iget-object v1, v0, Lxb1;->o:Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result p1

    .line 481
    if-nez p1, :cond_f

    .line 482
    .line 483
    goto/16 :goto_e

    .line 484
    .line 485
    :cond_f
    iget-boolean p1, v0, Lxb1;->n:Z

    .line 486
    .line 487
    if-nez p1, :cond_20

    .line 488
    .line 489
    iget-object p1, v0, Lxb1;->g:Lv4;

    .line 490
    .line 491
    invoke-interface {p1}, Lv4;->a()Z

    .line 492
    .line 493
    .line 494
    move-result p1

    .line 495
    if-nez p1, :cond_10

    .line 496
    .line 497
    invoke-virtual {v0}, Lxb1;->j()V

    .line 498
    .line 499
    .line 500
    return v9

    .line 501
    :cond_10
    invoke-virtual {v0}, Lxb1;->d()V

    .line 502
    .line 503
    .line 504
    return v9

    .line 505
    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 506
    .line 507
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    new-instance p1, Ljava/lang/ClassCastException;

    .line 511
    .line 512
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 513
    .line 514
    .line 515
    throw p1

    .line 516
    :pswitch_6
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 517
    .line 518
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 519
    .line 520
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-eqz v0, :cond_20

    .line 525
    .line 526
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 527
    .line 528
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 529
    .line 530
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    check-cast p1, Lxb1;

    .line 535
    .line 536
    iget-object v0, p1, Lxb1;->r:Ljz;

    .line 537
    .line 538
    iget-object v0, v0, Ljz;->r:Lwc1;

    .line 539
    .line 540
    invoke-static {v0}, Lou1;->g(Landroid/os/Handler;)V

    .line 541
    .line 542
    .line 543
    iget-object v0, p1, Lxb1;->g:Lv4;

    .line 544
    .line 545
    invoke-interface {v0}, Lv4;->a()Z

    .line 546
    .line 547
    .line 548
    move-result v1

    .line 549
    if-eqz v1, :cond_20

    .line 550
    .line 551
    iget-object v1, p1, Lxb1;->k:Ljava/util/HashMap;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    if-nez v1, :cond_20

    .line 558
    .line 559
    iget-object v1, p1, Lxb1;->i:Ltb1;

    .line 560
    .line 561
    iget-object v2, v1, Ltb1;->a:Ljava/util/Map;

    .line 562
    .line 563
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    if-eqz v2, :cond_12

    .line 568
    .line 569
    iget-object v1, v1, Ltb1;->b:Ljava/util/Map;

    .line 570
    .line 571
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 572
    .line 573
    .line 574
    move-result v1

    .line 575
    if-nez v1, :cond_11

    .line 576
    .line 577
    goto :goto_5

    .line 578
    :cond_11
    const-string p1, "Timing out service connection."

    .line 579
    .line 580
    invoke-interface {v0, p1}, Lv4;->d(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    return v9

    .line 584
    :cond_12
    :goto_5
    invoke-virtual {p1}, Lxb1;->g()V

    .line 585
    .line 586
    .line 587
    return v9

    .line 588
    :pswitch_7
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 589
    .line 590
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 591
    .line 592
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    move-result v0

    .line 596
    if-eqz v0, :cond_20

    .line 597
    .line 598
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 599
    .line 600
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 601
    .line 602
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    check-cast p1, Lxb1;

    .line 607
    .line 608
    iget-object v0, p1, Lxb1;->r:Ljz;

    .line 609
    .line 610
    iget-object v1, v0, Ljz;->r:Lwc1;

    .line 611
    .line 612
    invoke-static {v1}, Lou1;->g(Landroid/os/Handler;)V

    .line 613
    .line 614
    .line 615
    iget-boolean v1, p1, Lxb1;->n:Z

    .line 616
    .line 617
    if-eqz v1, :cond_20

    .line 618
    .line 619
    iget-object v2, p1, Lxb1;->h:Lc5;

    .line 620
    .line 621
    iget-object v3, p1, Lxb1;->r:Ljz;

    .line 622
    .line 623
    iget-object v3, v3, Ljz;->r:Lwc1;

    .line 624
    .line 625
    if-eqz v1, :cond_13

    .line 626
    .line 627
    const/16 v1, 0xb

    .line 628
    .line 629
    invoke-virtual {v3, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    const/16 v1, 0x9

    .line 633
    .line 634
    invoke-virtual {v3, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    iput-boolean v7, p1, Lxb1;->n:Z

    .line 638
    .line 639
    :cond_13
    iget-object v1, v0, Ljz;->k:Lfz;

    .line 640
    .line 641
    iget-object v0, v0, Ljz;->j:Landroid/content/Context;

    .line 642
    .line 643
    sget v2, Lgz;->a:I

    .line 644
    .line 645
    invoke-virtual {v1, v0, v2}, Lgz;->c(Landroid/content/Context;I)I

    .line 646
    .line 647
    .line 648
    move-result v0

    .line 649
    const/16 v1, 0x12

    .line 650
    .line 651
    if-ne v0, v1, :cond_14

    .line 652
    .line 653
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 654
    .line 655
    const/16 v1, 0x15

    .line 656
    .line 657
    const-string v2, "Connection timed out waiting for Google Play services update to complete."

    .line 658
    .line 659
    invoke-direct {v0, v1, v2, v8, v8}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lrh;)V

    .line 660
    .line 661
    .line 662
    goto :goto_6

    .line 663
    :cond_14
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 664
    .line 665
    const/16 v1, 0x16

    .line 666
    .line 667
    const-string v2, "API failed to connect while resuming due to an unknown error."

    .line 668
    .line 669
    invoke-direct {v0, v1, v2, v8, v8}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lrh;)V

    .line 670
    .line 671
    .line 672
    :goto_6
    invoke-virtual {p1, v0}, Lxb1;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 673
    .line 674
    .line 675
    iget-object p1, p1, Lxb1;->g:Lv4;

    .line 676
    .line 677
    const-string v0, "Timing out connection while resuming."

    .line 678
    .line 679
    invoke-interface {p1, v0}, Lv4;->d(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    return v9

    .line 683
    :pswitch_8
    iget-object p1, p0, Ljz;->q:Lu8;

    .line 684
    .line 685
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    new-instance v0, Lo8;

    .line 689
    .line 690
    invoke-direct {v0, p1}, Lo8;-><init>(Lu8;)V

    .line 691
    .line 692
    .line 693
    :cond_15
    :goto_7
    invoke-virtual {v0}, Lo8;->hasNext()Z

    .line 694
    .line 695
    .line 696
    move-result p1

    .line 697
    if-eqz p1, :cond_16

    .line 698
    .line 699
    invoke-virtual {v0}, Lo8;->next()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object p1

    .line 703
    check-cast p1, Lc5;

    .line 704
    .line 705
    iget-object v1, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 706
    .line 707
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object p1

    .line 711
    check-cast p1, Lxb1;

    .line 712
    .line 713
    if-eqz p1, :cond_15

    .line 714
    .line 715
    invoke-virtual {p1}, Lxb1;->m()V

    .line 716
    .line 717
    .line 718
    goto :goto_7

    .line 719
    :cond_16
    iget-object p1, p0, Ljz;->q:Lu8;

    .line 720
    .line 721
    invoke-virtual {p1}, Lu8;->clear()V

    .line 722
    .line 723
    .line 724
    return v9

    .line 725
    :pswitch_9
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 726
    .line 727
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 728
    .line 729
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result v0

    .line 733
    if-eqz v0, :cond_20

    .line 734
    .line 735
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 736
    .line 737
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 738
    .line 739
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object p1

    .line 743
    check-cast p1, Lxb1;

    .line 744
    .line 745
    iget-object v0, p1, Lxb1;->r:Ljz;

    .line 746
    .line 747
    iget-object v0, v0, Ljz;->r:Lwc1;

    .line 748
    .line 749
    invoke-static {v0}, Lou1;->g(Landroid/os/Handler;)V

    .line 750
    .line 751
    .line 752
    iget-boolean v0, p1, Lxb1;->n:Z

    .line 753
    .line 754
    if-eqz v0, :cond_20

    .line 755
    .line 756
    invoke-virtual {p1}, Lxb1;->j()V

    .line 757
    .line 758
    .line 759
    return v9

    .line 760
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast p1, Lez;

    .line 763
    .line 764
    invoke-virtual {p0, p1}, Ljz;->d(Lez;)Lxb1;

    .line 765
    .line 766
    .line 767
    return v9

    .line 768
    :pswitch_b
    iget-object p1, p0, Ljz;->j:Landroid/content/Context;

    .line 769
    .line 770
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 771
    .line 772
    .line 773
    move-result-object p1

    .line 774
    instance-of p1, p1, Landroid/app/Application;

    .line 775
    .line 776
    if-eqz p1, :cond_20

    .line 777
    .line 778
    iget-object p1, p0, Ljz;->j:Landroid/content/Context;

    .line 779
    .line 780
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 781
    .line 782
    .line 783
    move-result-object p1

    .line 784
    check-cast p1, Landroid/app/Application;

    .line 785
    .line 786
    sget-object v0, Lj9;->j:Lj9;

    .line 787
    .line 788
    monitor-enter v0

    .line 789
    :try_start_0
    iget-boolean v1, v0, Lj9;->i:Z

    .line 790
    .line 791
    if-nez v1, :cond_17

    .line 792
    .line 793
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 797
    .line 798
    .line 799
    iput-boolean v9, v0, Lj9;->i:Z

    .line 800
    .line 801
    goto :goto_8

    .line 802
    :catchall_0
    move-exception p1

    .line 803
    goto :goto_9

    .line 804
    :cond_17
    :goto_8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 805
    new-instance p1, Lwb1;

    .line 806
    .line 807
    invoke-direct {p1, p0}, Lwb1;-><init>(Ljz;)V

    .line 808
    .line 809
    .line 810
    monitor-enter v0

    .line 811
    :try_start_1
    iget-object v1, v0, Lj9;->h:Ljava/util/ArrayList;

    .line 812
    .line 813
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 817
    iget-object p1, v0, Lj9;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 818
    .line 819
    iget-object v0, v0, Lj9;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 820
    .line 821
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 822
    .line 823
    .line 824
    move-result v1

    .line 825
    if-nez v1, :cond_18

    .line 826
    .line 827
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 828
    .line 829
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 830
    .line 831
    .line 832
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 836
    .line 837
    .line 838
    move-result v0

    .line 839
    if-nez v0, :cond_18

    .line 840
    .line 841
    iget v0, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 842
    .line 843
    const/16 v1, 0x64

    .line 844
    .line 845
    if-le v0, v1, :cond_18

    .line 846
    .line 847
    invoke-virtual {p1, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 848
    .line 849
    .line 850
    :cond_18
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 851
    .line 852
    .line 853
    move-result p1

    .line 854
    if-nez p1, :cond_20

    .line 855
    .line 856
    iput-wide v4, p0, Ljz;->f:J

    .line 857
    .line 858
    return v9

    .line 859
    :catchall_1
    move-exception p1

    .line 860
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 861
    throw p1

    .line 862
    :goto_9
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 863
    throw p1

    .line 864
    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 865
    .line 866
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast p1, Lrh;

    .line 869
    .line 870
    iget-object v1, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 871
    .line 872
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 873
    .line 874
    .line 875
    move-result-object v1

    .line 876
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    :cond_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 881
    .line 882
    .line 883
    move-result v2

    .line 884
    if-eqz v2, :cond_1a

    .line 885
    .line 886
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    check-cast v2, Lxb1;

    .line 891
    .line 892
    iget v3, v2, Lxb1;->l:I

    .line 893
    .line 894
    if-ne v3, v0, :cond_19

    .line 895
    .line 896
    goto :goto_a

    .line 897
    :cond_1a
    move-object v2, v8

    .line 898
    :goto_a
    if-eqz v2, :cond_1c

    .line 899
    .line 900
    iget v0, p1, Lrh;->g:I

    .line 901
    .line 902
    const/16 v1, 0xd

    .line 903
    .line 904
    if-ne v0, v1, :cond_1b

    .line 905
    .line 906
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 907
    .line 908
    iget-object v3, p0, Ljz;->k:Lfz;

    .line 909
    .line 910
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    sget v3, Loz;->c:I

    .line 914
    .line 915
    invoke-static {v0}, Lrh;->a(I)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    iget-object p1, p1, Lrh;->i:Ljava/lang/String;

    .line 920
    .line 921
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v3

    .line 925
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 926
    .line 927
    .line 928
    move-result v3

    .line 929
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v4

    .line 933
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 934
    .line 935
    .line 936
    move-result v4

    .line 937
    new-instance v5, Ljava/lang/StringBuilder;

    .line 938
    .line 939
    add-int/lit8 v3, v3, 0x45

    .line 940
    .line 941
    add-int/2addr v3, v4

    .line 942
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 943
    .line 944
    .line 945
    const-string v3, "Error resolution was canceled by the user, original error message: "

    .line 946
    .line 947
    const-string v4, ": "

    .line 948
    .line 949
    invoke-static {v5, v3, v0, v4, p1}, Lex0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object p1

    .line 953
    invoke-direct {v1, v6, p1, v8, v8}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lrh;)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v2, v1}, Lxb1;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 957
    .line 958
    .line 959
    return v9

    .line 960
    :cond_1b
    iget-object v0, v2, Lxb1;->h:Lc5;

    .line 961
    .line 962
    invoke-static {v0, p1}, Ljz;->c(Lc5;Lrh;)Lcom/google/android/gms/common/api/Status;

    .line 963
    .line 964
    .line 965
    move-result-object p1

    .line 966
    invoke-virtual {v2, p1}, Lxb1;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 967
    .line 968
    .line 969
    return v9

    .line 970
    :cond_1c
    new-instance p1, Ljava/lang/StringBuilder;

    .line 971
    .line 972
    const/16 v1, 0x4c

    .line 973
    .line 974
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 975
    .line 976
    .line 977
    const-string v1, "Could not find API instance "

    .line 978
    .line 979
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 980
    .line 981
    .line 982
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    const-string v0, " while trying to fail enqueued calls."

    .line 986
    .line 987
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    new-instance v0, Ljava/lang/Exception;

    .line 991
    .line 992
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 993
    .line 994
    .line 995
    const-string v1, "GoogleApiManager"

    .line 996
    .line 997
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object p1

    .line 1001
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1002
    .line 1003
    .line 1004
    return v9

    .line 1005
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast p1, Ljc1;

    .line 1008
    .line 1009
    iget-object v0, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1010
    .line 1011
    iget-object v1, p1, Ljc1;->c:Lez;

    .line 1012
    .line 1013
    iget-object v1, v1, Lez;->j:Lc5;

    .line 1014
    .line 1015
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    check-cast v0, Lxb1;

    .line 1020
    .line 1021
    if-nez v0, :cond_1d

    .line 1022
    .line 1023
    iget-object v0, p1, Ljc1;->c:Lez;

    .line 1024
    .line 1025
    invoke-virtual {p0, v0}, Ljz;->d(Lez;)Lxb1;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    :cond_1d
    iget-object v1, v0, Lxb1;->g:Lv4;

    .line 1030
    .line 1031
    invoke-interface {v1}, Lv4;->l()Z

    .line 1032
    .line 1033
    .line 1034
    move-result v1

    .line 1035
    if-eqz v1, :cond_1e

    .line 1036
    .line 1037
    iget-object v1, p0, Ljz;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1038
    .line 1039
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1040
    .line 1041
    .line 1042
    move-result v1

    .line 1043
    iget v2, p1, Ljc1;->b:I

    .line 1044
    .line 1045
    if-eq v1, v2, :cond_1e

    .line 1046
    .line 1047
    iget-object p1, p1, Ljc1;->a:Lpc1;

    .line 1048
    .line 1049
    sget-object v1, Ljz;->t:Lcom/google/android/gms/common/api/Status;

    .line 1050
    .line 1051
    invoke-virtual {p1, v1}, Lpc1;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v0}, Lxb1;->m()V

    .line 1055
    .line 1056
    .line 1057
    return v9

    .line 1058
    :cond_1e
    iget-object p1, p1, Ljc1;->a:Lpc1;

    .line 1059
    .line 1060
    invoke-virtual {v0, p1}, Lxb1;->k(Lcc1;)V

    .line 1061
    .line 1062
    .line 1063
    return v9

    .line 1064
    :pswitch_e
    iget-object p1, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1065
    .line 1066
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 1067
    .line 1068
    .line 1069
    move-result-object p1

    .line 1070
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1071
    .line 1072
    .line 1073
    move-result-object p1

    .line 1074
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    if-eqz v0, :cond_20

    .line 1079
    .line 1080
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v0

    .line 1084
    check-cast v0, Lxb1;

    .line 1085
    .line 1086
    iget-object v1, v0, Lxb1;->r:Ljz;

    .line 1087
    .line 1088
    iget-object v1, v1, Ljz;->r:Lwc1;

    .line 1089
    .line 1090
    invoke-static {v1}, Lou1;->g(Landroid/os/Handler;)V

    .line 1091
    .line 1092
    .line 1093
    iput-object v8, v0, Lxb1;->p:Lrh;

    .line 1094
    .line 1095
    invoke-virtual {v0}, Lxb1;->j()V

    .line 1096
    .line 1097
    .line 1098
    goto :goto_b

    .line 1099
    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1100
    .line 1101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    new-instance p1, Ljava/lang/ClassCastException;

    .line 1105
    .line 1106
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 1107
    .line 1108
    .line 1109
    throw p1

    .line 1110
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1111
    .line 1112
    check-cast p1, Ljava/lang/Boolean;

    .line 1113
    .line 1114
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1115
    .line 1116
    .line 1117
    move-result p1

    .line 1118
    if-eq v9, p1, :cond_1f

    .line 1119
    .line 1120
    goto :goto_c

    .line 1121
    :cond_1f
    const-wide/16 v4, 0x2710

    .line 1122
    .line 1123
    :goto_c
    iput-wide v4, p0, Ljz;->f:J

    .line 1124
    .line 1125
    iget-object p1, p0, Ljz;->r:Lwc1;

    .line 1126
    .line 1127
    const/16 v0, 0xc

    .line 1128
    .line 1129
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 1130
    .line 1131
    .line 1132
    iget-object p1, p0, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1133
    .line 1134
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1135
    .line 1136
    .line 1137
    move-result-object p1

    .line 1138
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1139
    .line 1140
    .line 1141
    move-result-object p1

    .line 1142
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1143
    .line 1144
    .line 1145
    move-result v1

    .line 1146
    if-eqz v1, :cond_20

    .line 1147
    .line 1148
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v1

    .line 1152
    check-cast v1, Lc5;

    .line 1153
    .line 1154
    iget-object v2, p0, Ljz;->r:Lwc1;

    .line 1155
    .line 1156
    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v1

    .line 1160
    iget-wide v3, p0, Ljz;->f:J

    .line 1161
    .line 1162
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1163
    .line 1164
    .line 1165
    goto :goto_d

    .line 1166
    :cond_20
    :goto_e
    return v9

    .line 1167
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
