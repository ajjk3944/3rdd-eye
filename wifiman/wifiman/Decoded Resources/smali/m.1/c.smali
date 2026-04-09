.class public Lm/c;
.super Lm/e;
.source "SourceFile"


# static fields
.field private static volatile c:Lm/c;

.field private static final d:Ljava/util/concurrent/Executor;

.field private static final e:Ljava/util/concurrent/Executor;


# instance fields
.field private a:Lm/e;

.field private final b:Lm/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm/a;

    invoke-direct {v0}, Lm/a;-><init>()V

    sput-object v0, Lm/c;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Lm/b;

    invoke-direct {v0}, Lm/b;-><init>()V

    sput-object v0, Lm/c;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lm/e;-><init>()V

    new-instance v0, Lm/d;

    invoke-direct {v0}, Lm/d;-><init>()V

    iput-object v0, p0, Lm/c;->b:Lm/e;

    iput-object v0, p0, Lm/c;->a:Lm/e;

    return-void
.end method

.method public static synthetic d(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, Lm/c;->h(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, Lm/c;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static f()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lm/c;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static g()Lm/c;
    .locals 2

    sget-object v0, Lm/c;->c:Lm/c;

    if-eqz v0, :cond_0

    sget-object v0, Lm/c;->c:Lm/c;

    return-object v0

    :cond_0
    const-class v0, Lm/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm/c;->c:Lm/c;

    if-nez v1, :cond_1

    new-instance v1, Lm/c;

    invoke-direct {v1}, Lm/c;-><init>()V

    sput-object v1, Lm/c;->c:Lm/c;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lm/c;->c:Lm/c;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private static synthetic h(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lm/c;->g()Lm/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lm/c;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static synthetic i(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lm/c;->g()Lm/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lm/c;->a(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lm/c;->a:Lm/e;

    invoke-virtual {v0, p1}, Lm/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lm/c;->a:Lm/e;

    invoke-virtual {v0}, Lm/e;->b()Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lm/c;->a:Lm/e;

    invoke-virtual {v0, p1}, Lm/e;->c(Ljava/lang/Runnable;)V

    return-void
.end method
