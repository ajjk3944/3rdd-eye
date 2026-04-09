.class final LQ2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ2/r$d;,
        LQ2/r$c;
    }
.end annotation


# static fields
.field private static volatile d:LQ2/r;


# instance fields
.field private final a:LQ2/r$c;

.field final b:Ljava/util/Set;

.field private c:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LQ2/r;->b:Ljava/util/Set;

    new-instance v0, LQ2/r$a;

    invoke-direct {v0, p0, p1}, LQ2/r$a;-><init>(LQ2/r;Landroid/content/Context;)V

    invoke-static {v0}, LW2/f;->a(LW2/f$b;)LW2/f$b;

    move-result-object p1

    new-instance v0, LQ2/r$b;

    invoke-direct {v0, p0}, LQ2/r$b;-><init>(LQ2/r;)V

    new-instance v1, LQ2/r$d;

    invoke-direct {v1, p1, v0}, LQ2/r$d;-><init>(LW2/f$b;LQ2/b$a;)V

    iput-object v1, p0, LQ2/r;->a:LQ2/r$c;

    return-void
.end method

.method static a(Landroid/content/Context;)LQ2/r;
    .locals 2

    sget-object v0, LQ2/r;->d:LQ2/r;

    if-nez v0, :cond_1

    const-class v0, LQ2/r;

    monitor-enter v0

    :try_start_0
    sget-object v1, LQ2/r;->d:LQ2/r;

    if-nez v1, :cond_0

    new-instance v1, LQ2/r;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, LQ2/r;-><init>(Landroid/content/Context;)V

    sput-object v1, LQ2/r;->d:LQ2/r;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, LQ2/r;->d:LQ2/r;

    return-object p0
.end method

.method private b()V
    .locals 1

    iget-boolean v0, p0, LQ2/r;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LQ2/r;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LQ2/r;->a:LQ2/r$c;

    invoke-interface {v0}, LQ2/r$c;->b()Z

    move-result v0

    iput-boolean v0, p0, LQ2/r;->c:Z

    :cond_1
    :goto_0
    return-void
.end method

.method private c()V
    .locals 1

    iget-boolean v0, p0, LQ2/r;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LQ2/r;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LQ2/r;->a:LQ2/r$c;

    invoke-interface {v0}, LQ2/r$c;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LQ2/r;->c:Z

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method declared-synchronized d(LQ2/b$a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LQ2/r;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, LQ2/r;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method declared-synchronized e(LQ2/b$a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LQ2/r;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-direct {p0}, LQ2/r;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
