.class public final Lkh0;
.super Ldh0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final k:Li80;


# instance fields
.field public final i:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lkh0;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lkh0;->k:Li80;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lkh0;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lkh0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    new-instance v0, Leh0;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, p0, v1}, Leh0;-><init>(Lkh0;I)V

    .line 22
    .line 23
    .line 24
    const-class v1, Ldh0;

    .line 25
    .line 26
    monitor-enter v1

    .line 27
    :try_start_0
    sget-object v2, Ldh0;->c:[Ljava/lang/Runnable;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    aput-object v0, v2, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 31
    .line 32
    monitor-exit v1

    .line 33
    new-instance v0, Leh0;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, p0, v1}, Leh0;-><init>(Lkh0;I)V

    .line 37
    .line 38
    .line 39
    const-class v2, Ldh0;

    .line 40
    .line 41
    monitor-enter v2

    .line 42
    :try_start_1
    sget-object v1, Ldh0;->b:[Ljava/lang/Runnable;

    .line 43
    .line 44
    aput-object v0, v1, v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    .line 46
    monitor-exit v2

    .line 47
    new-instance v0, Leh0;

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    invoke-direct {v0, p0, v1}, Leh0;-><init>(Lkh0;I)V

    .line 51
    .line 52
    .line 53
    const-class v1, Ldh0;

    .line 54
    .line 55
    monitor-enter v1

    .line 56
    :try_start_2
    sget-object v2, Ldh0;->d:[Ljava/lang/Runnable;

    .line 57
    .line 58
    aput-object v0, v2, v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    .line 60
    monitor-exit v1

    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 64
    throw v0

    .line 65
    :catchall_1
    move-exception v0

    .line 66
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 67
    throw v0

    .line 68
    :catchall_2
    move-exception v0

    .line 69
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 70
    throw v0
.end method
