.class public final LF3/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final h:Ljava/util/concurrent/ExecutorService;

.field private static final i:Ljava/util/concurrent/ExecutorService;

.field public static final j:J

.field private static k:LF3/f0;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:LF3/E;

.field private final d:LF3/d0;

.field private final e:Ljava/util/Map;

.field private final f:LF3/i0;

.field private final g:LF3/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, LF3/f0;->h:Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, LF3/f0;->i:Ljava/util/concurrent/ExecutorService;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, LF3/f0;->j:J

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;LF3/E;LF3/g0;LF3/D;)V
    .locals 13

    move-object v0, p0

    sget-object v1, LF3/f0;->h:Ljava/util/concurrent/ExecutorService;

    sget-object v2, LF3/f0;->i:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Ljava/util/TreeMap;

    invoke-direct {v3}, Ljava/util/TreeMap;-><init>()V

    iput-object v3, v0, LF3/f0;->e:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-object v3, p2

    iput-object v3, v0, LF3/f0;->c:LF3/E;

    iput-object v1, v0, LF3/f0;->a:Ljava/util/concurrent/Executor;

    iput-object v2, v0, LF3/f0;->b:Ljava/util/concurrent/Executor;

    move-object/from16 v1, p3

    iput-object v1, v0, LF3/f0;->g:LF3/g0;

    new-instance v2, LF3/d0;

    invoke-virtual/range {p4 .. p4}, LF3/D;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p4 .. p4}, LF3/D;->a()Ljava/lang/String;

    move-result-object v6

    const-string v7, "firebase"

    const-wide/16 v10, 0x5

    move-object v3, v2

    move-object v4, p1

    move-wide v8, v10

    move-object/from16 v12, p3

    invoke-direct/range {v3 .. v12}, LF3/d0;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLF3/g0;)V

    iput-object v2, v0, LF3/f0;->d:LF3/d0;

    new-instance v1, LF3/i0;

    move-object v2, p1

    invoke-direct {v1, p1}, LF3/i0;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, LF3/f0;->f:LF3/i0;

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)LF3/f0;
    .locals 5

    const-class v0, LF3/f0;

    monitor-enter v0

    :try_start_0
    sget-object v1, LF3/f0;->k:LF3/f0;

    if-nez v1, :cond_0

    new-instance v1, LF3/f0;

    invoke-static {p0}, LF3/E;->a(Landroid/content/Context;)LF3/E;

    move-result-object v2

    new-instance v3, LF3/g0;

    invoke-direct {v3, p0}, LF3/g0;-><init>(Landroid/content/Context;)V

    sget-object v4, LF3/I;->a:LF3/D;

    invoke-direct {v1, p0, v2, v3, v4}, LF3/f0;-><init>(Landroid/content/Context;LF3/E;LF3/g0;LF3/D;)V

    sput-object v1, LF3/f0;->k:LF3/f0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, LF3/f0;->k:LF3/f0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
