.class public final Lcom/bumptech/glide/request/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/request/d;
.implements Lcom/bumptech/glide/request/c;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lcom/bumptech/glide/request/d;

.field private volatile c:Lcom/bumptech/glide/request/c;

.field private volatile d:Lcom/bumptech/glide/request/c;

.field private e:Lcom/bumptech/glide/request/d$a;

.field private f:Lcom/bumptech/glide/request/d$a;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/bumptech/glide/request/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/bumptech/glide/request/d$a;->CLEARED:Lcom/bumptech/glide/request/d$a;

    iput-object v0, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    iput-object v0, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    iput-object p1, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/bumptech/glide/request/b;->b:Lcom/bumptech/glide/request/d;

    return-void
.end method

.method private k(Lcom/bumptech/glide/request/c;)Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    sget-object v1, Lcom/bumptech/glide/request/d$a;->FAILED:Lcom/bumptech/glide/request/d$a;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->c:Lcom/bumptech/glide/request/c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/request/b;->d:Lcom/bumptech/glide/request/c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    sget-object v0, Lcom/bumptech/glide/request/d$a;->SUCCESS:Lcom/bumptech/glide/request/d$a;

    if-eq p1, v0, :cond_1

    if-ne p1, v1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private l()Z
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->b:Lcom/bumptech/glide/request/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/bumptech/glide/request/d;->j(Lcom/bumptech/glide/request/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private m()Z
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->b:Lcom/bumptech/glide/request/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/bumptech/glide/request/d;->c(Lcom/bumptech/glide/request/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private n()Z
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->b:Lcom/bumptech/glide/request/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/bumptech/glide/request/d;->f(Lcom/bumptech/glide/request/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/request/c;)V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->d:Lcom/bumptech/glide/request/c;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/bumptech/glide/request/d$a;->FAILED:Lcom/bumptech/glide/request/d$a;

    iput-object p1, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    iget-object p1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    sget-object v1, Lcom/bumptech/glide/request/d$a;->RUNNING:Lcom/bumptech/glide/request/d$a;

    if-eq p1, v1, :cond_0

    iput-object v1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    iget-object p1, p0, Lcom/bumptech/glide/request/b;->d:Lcom/bumptech/glide/request/c;

    invoke-interface {p1}, Lcom/bumptech/glide/request/c;->i()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :cond_1
    sget-object p1, Lcom/bumptech/glide/request/d$a;->FAILED:Lcom/bumptech/glide/request/d$a;

    iput-object p1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    iget-object p1, p0, Lcom/bumptech/glide/request/b;->b:Lcom/bumptech/glide/request/d;

    if-eqz p1, :cond_2

    invoke-interface {p1, p0}, Lcom/bumptech/glide/request/d;->a(Lcom/bumptech/glide/request/c;)V

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->c:Lcom/bumptech/glide/request/c;

    invoke-interface {v1}, Lcom/bumptech/glide/request/c;->b()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/request/b;->d:Lcom/bumptech/glide/request/c;

    invoke-interface {v1}, Lcom/bumptech/glide/request/c;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c(Lcom/bumptech/glide/request/c;)Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/request/b;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lcom/bumptech/glide/request/b;->k(Lcom/bumptech/glide/request/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public clear()V
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/bumptech/glide/request/d$a;->CLEARED:Lcom/bumptech/glide/request/d$a;

    iput-object v1, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    iget-object v2, p0, Lcom/bumptech/glide/request/b;->c:Lcom/bumptech/glide/request/c;

    invoke-interface {v2}, Lcom/bumptech/glide/request/c;->clear()V

    iget-object v2, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    if-eq v2, v1, :cond_0

    iput-object v1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    iget-object v1, p0, Lcom/bumptech/glide/request/b;->d:Lcom/bumptech/glide/request/c;

    invoke-interface {v1}, Lcom/bumptech/glide/request/c;->clear()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d(Lcom/bumptech/glide/request/c;)Z
    .locals 3

    instance-of v0, p1, Lcom/bumptech/glide/request/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/bumptech/glide/request/b;

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->c:Lcom/bumptech/glide/request/c;

    iget-object v2, p1, Lcom/bumptech/glide/request/b;->c:Lcom/bumptech/glide/request/c;

    invoke-interface {v0, v2}, Lcom/bumptech/glide/request/c;->d(Lcom/bumptech/glide/request/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->d:Lcom/bumptech/glide/request/c;

    iget-object p1, p1, Lcom/bumptech/glide/request/b;->d:Lcom/bumptech/glide/request/c;

    invoke-interface {v0, p1}, Lcom/bumptech/glide/request/c;->d(Lcom/bumptech/glide/request/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    sget-object v2, Lcom/bumptech/glide/request/d$a;->RUNNING:Lcom/bumptech/glide/request/d$a;

    if-ne v1, v2, :cond_0

    sget-object v1, Lcom/bumptech/glide/request/d$a;->PAUSED:Lcom/bumptech/glide/request/d$a;

    iput-object v1, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    iget-object v1, p0, Lcom/bumptech/glide/request/b;->c:Lcom/bumptech/glide/request/c;

    invoke-interface {v1}, Lcom/bumptech/glide/request/c;->e()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    if-ne v1, v2, :cond_1

    sget-object v1, Lcom/bumptech/glide/request/d$a;->PAUSED:Lcom/bumptech/glide/request/d$a;

    iput-object v1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    iget-object v1, p0, Lcom/bumptech/glide/request/b;->d:Lcom/bumptech/glide/request/c;

    invoke-interface {v1}, Lcom/bumptech/glide/request/c;->e()V

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public f(Lcom/bumptech/glide/request/c;)Z
    .locals 1

    iget-object p1, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/request/b;->n()Z

    move-result v0

    monitor-exit p1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public g()Z
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    sget-object v2, Lcom/bumptech/glide/request/d$a;->CLEARED:Lcom/bumptech/glide/request/d$a;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getRoot()Lcom/bumptech/glide/request/d;
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->b:Lcom/bumptech/glide/request/d;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/bumptech/glide/request/d;->getRoot()Lcom/bumptech/glide/request/d;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    move-object v1, p0

    :goto_0
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public h(Lcom/bumptech/glide/request/c;)V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->c:Lcom/bumptech/glide/request/c;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lcom/bumptech/glide/request/d$a;->SUCCESS:Lcom/bumptech/glide/request/d$a;

    iput-object p1, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->d:Lcom/bumptech/glide/request/c;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/bumptech/glide/request/d$a;->SUCCESS:Lcom/bumptech/glide/request/d$a;

    iput-object p1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/bumptech/glide/request/b;->b:Lcom/bumptech/glide/request/d;

    if-eqz p1, :cond_2

    invoke-interface {p1, p0}, Lcom/bumptech/glide/request/d;->h(Lcom/bumptech/glide/request/c;)V

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i()V
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    sget-object v2, Lcom/bumptech/glide/request/d$a;->RUNNING:Lcom/bumptech/glide/request/d$a;

    if-eq v1, v2, :cond_0

    iput-object v2, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    iget-object v1, p0, Lcom/bumptech/glide/request/b;->c:Lcom/bumptech/glide/request/c;

    invoke-interface {v1}, Lcom/bumptech/glide/request/c;->i()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isComplete()Z
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    sget-object v2, Lcom/bumptech/glide/request/d$a;->SUCCESS:Lcom/bumptech/glide/request/d$a;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isRunning()Z
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/b;->e:Lcom/bumptech/glide/request/d$a;

    sget-object v2, Lcom/bumptech/glide/request/d$a;->RUNNING:Lcom/bumptech/glide/request/d$a;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/request/b;->f:Lcom/bumptech/glide/request/d$a;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public j(Lcom/bumptech/glide/request/c;)Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/request/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/request/b;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/request/b;->c:Lcom/bumptech/glide/request/c;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public o(Lcom/bumptech/glide/request/c;Lcom/bumptech/glide/request/c;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/request/b;->c:Lcom/bumptech/glide/request/c;

    iput-object p2, p0, Lcom/bumptech/glide/request/b;->d:Lcom/bumptech/glide/request/c;

    return-void
.end method
