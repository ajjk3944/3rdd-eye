.class final LJ5/e;
.super LJ5/d;
.source "SourceFile"


# instance fields
.field private final a:LJ5/d;

.field private b:Z

.field private c:LJ5/a;


# direct methods
.method constructor <init>(LJ5/d;)V
    .locals 0

    invoke-direct {p0}, LJ5/d;-><init>()V

    iput-object p1, p0, LJ5/e;->a:LJ5/d;

    return-void
.end method

.method private k1()V
    .locals 2

    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LJ5/e;->c:LJ5/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LJ5/e;->b:Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, LJ5/e;->c:LJ5/a;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LJ5/e;->a:LJ5/d;

    invoke-virtual {v0, v1}, LJ5/a;->a(LJ5/d;)V

    goto :goto_0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    iget-object v0, p0, LJ5/e;->a:LJ5/d;

    invoke-virtual {v0, p1}, Lgg/s;->d(Lgg/x;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LJ5/e;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LJ5/e;->c:LJ5/a;

    if-nez v0, :cond_0

    new-instance v0, LJ5/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, LJ5/a;-><init>(I)V

    iput-object v0, p0, LJ5/e;->c:LJ5/a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0, p1}, LJ5/a;->b(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LJ5/e;->b:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LJ5/e;->a:LJ5/d;

    invoke-virtual {v0, p1}, LJ5/d;->accept(Ljava/lang/Object;)V

    invoke-direct {p0}, LJ5/e;->k1()V

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public i1()Z
    .locals 1

    iget-object v0, p0, LJ5/e;->a:LJ5/d;

    invoke-virtual {v0}, LJ5/d;->i1()Z

    move-result v0

    return v0
.end method
