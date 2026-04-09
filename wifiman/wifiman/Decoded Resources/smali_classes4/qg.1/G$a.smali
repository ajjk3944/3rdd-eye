.class final Lqg/G$a;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lgg/h;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Lkg/b;

.field final c:Lkg/f;

.field d:Ljava/lang/Object;

.field volatile e:Z

.field f:Z

.field g:Z


# direct methods
.method constructor <init>(LDj/b;Lkg/b;Lkg/f;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/G$a;->a:LDj/b;

    iput-object p2, p0, Lqg/G$a;->b:Lkg/b;

    iput-object p3, p0, Lqg/G$a;->c:Lkg/f;

    iput-object p4, p0, Lqg/G$a;->d:Ljava/lang/Object;

    return-void
.end method

.method private j(Ljava/lang/Object;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lqg/G$a;->c:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lqg/G$a;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/G$a;->f:Z

    iget-object v0, p0, Lqg/G$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 4

    iget-boolean v0, p0, Lqg/G$a;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/G$a;->e:Z

    const-wide/16 v0, 0x1

    invoke-static {p0, v0, v1}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg/G$a;->d:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lqg/G$a;->d:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lqg/G$a;->j(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Lqg/G$a;->f:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lqg/G$a;->g:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onNext already called in this generate turn"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lqg/G$a;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "onNext called with a null value."

    invoke-static {p1}, Lzg/h;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqg/G$a;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/G$a;->g:Z

    iget-object v0, p0, Lqg/G$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/G$a;->f:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "onError called with a null Throwable."

    invoke-static {p1}, Lzg/h;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    move-result-object p1

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/G$a;->f:Z

    iget-object v0, p0, Lqg/G$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public request(J)V
    .locals 9

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lqg/G$a;->d:Ljava/lang/Object;

    iget-object v1, p0, Lqg/G$a;->b:Lkg/b;

    :cond_2
    move-wide v4, v2

    :cond_3
    :goto_0
    cmp-long v6, v4, p1

    if-eqz v6, :cond_6

    iget-boolean v6, p0, Lqg/G$a;->e:Z

    const/4 v7, 0x0

    if-eqz v6, :cond_4

    iput-object v7, p0, Lqg/G$a;->d:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lqg/G$a;->j(Ljava/lang/Object;)V

    return-void

    :cond_4
    const/4 v6, 0x0

    iput-boolean v6, p0, Lqg/G$a;->g:Z

    const/4 v6, 0x1

    :try_start_0
    invoke-interface {v1, v0, p0}, Lkg/b;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v8, p0, Lqg/G$a;->f:Z

    if-eqz v8, :cond_5

    iput-boolean v6, p0, Lqg/G$a;->e:Z

    iput-object v7, p0, Lqg/G$a;->d:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lqg/G$a;->j(Ljava/lang/Object;)V

    return-void

    :cond_5
    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iput-boolean v6, p0, Lqg/G$a;->e:Z

    iput-object v7, p0, Lqg/G$a;->d:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lqg/G$a;->onError(Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lqg/G$a;->j(Ljava/lang/Object;)V

    return-void

    :cond_6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide p1

    cmp-long v6, v4, p1

    if-nez v6, :cond_3

    iput-object v0, p0, Lqg/G$a;->d:Ljava/lang/Object;

    neg-long p1, v4

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide p1

    cmp-long v4, p1, v2

    if-nez v4, :cond_2

    return-void
.end method
