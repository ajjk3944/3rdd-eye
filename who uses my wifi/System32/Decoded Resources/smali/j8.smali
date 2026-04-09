.class public final Lj8;
.super Li41;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static volatile E:Lj8;

.field public static final F:Li8;


# instance fields
.field public final D:Lwn;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lj8;->F:Li8;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lwn;

    .line 5
    .line 6
    invoke-direct {v0}, Lwn;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lj8;->D:Lwn;

    .line 10
    .line 11
    return-void
.end method

.method public static T()Lj8;
    .locals 2

    .line 1
    sget-object v0, Lj8;->E:Lj8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lj8;->E:Lj8;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-class v0, Lj8;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Lj8;->E:Lj8;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Lj8;

    .line 16
    .line 17
    invoke-direct {v1}, Lj8;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lj8;->E:Lj8;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    sget-object v0, Lj8;->E:Lj8;

    .line 27
    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v1
.end method
