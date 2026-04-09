.class final Lqg/y$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/y$a$a;
    }
.end annotation


# instance fields
.field final a:Lgg/d;

.field final b:Lzg/c;

.field final c:Lkg/n;

.field final d:Z

.field final e:Lhg/b;

.field final f:I

.field g:LDj/c;

.field volatile h:Z


# direct methods
.method constructor <init>(Lgg/d;Lkg/n;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/y$a;->a:Lgg/d;

    iput-object p2, p0, Lqg/y$a;->c:Lkg/n;

    iput-boolean p3, p0, Lqg/y$a;->d:Z

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lqg/y$a;->b:Lzg/c;

    new-instance p1, Lhg/b;

    invoke-direct {p1}, Lhg/b;-><init>()V

    iput-object p1, p0, Lqg/y$a;->e:Lhg/b;

    iput p4, p0, Lqg/y$a;->f:I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg/y$a;->b:Lzg/c;

    iget-object v1, p0, Lqg/y$a;->a:Lgg/d;

    invoke-virtual {v0, v1}, Lzg/c;->l(Lgg/d;)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lqg/y$a;->f:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lqg/y$a;->g:LDj/c;

    const-wide/16 v1, 0x1

    invoke-interface {v0, v1, v2}, LDj/c;->request(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method c(Lqg/y$a$a;)V
    .locals 1

    iget-object v0, p0, Lqg/y$a;->e:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->c(Lhg/c;)Z

    invoke-virtual {p0}, Lqg/y$a;->a()V

    return-void
.end method

.method d(Lqg/y$a$a;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/y$a;->e:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->c(Lhg/c;)Z

    invoke-virtual {p0, p2}, Lqg/y$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/y$a;->h:Z

    iget-object v0, p0, Lqg/y$a;->g:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/y$a;->e:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    iget-object v0, p0, Lqg/y$a;->b:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lqg/y$a;->c:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null CompletableSource"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    new-instance v0, Lqg/y$a$a;

    invoke-direct {v0, p0}, Lqg/y$a$a;-><init>(Lqg/y$a;)V

    iget-boolean v1, p0, Lqg/y$a;->h:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lqg/y$a;->e:Lhg/b;

    invoke-virtual {v1, v0}, Lhg/b;->a(Lhg/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lgg/f;->e(Lgg/d;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/y$a;->g:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0, p1}, Lqg/y$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lqg/y$a;->e:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/y$a;->g:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lqg/y$a;->g:LDj/c;

    iget-object v0, p0, Lqg/y$a;->a:Lgg/d;

    invoke-interface {v0, p0}, Lgg/d;->c(Lhg/c;)V

    iget v0, p0, Lqg/y$a;->f:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_0

    :cond_0
    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/y$a;->b:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lqg/y$a;->d:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lqg/y$a;->b:Lzg/c;

    iget-object v0, p0, Lqg/y$a;->a:Lgg/d;

    invoke-virtual {p1, v0}, Lzg/c;->l(Lgg/d;)V

    goto :goto_0

    :cond_0
    iget p1, p0, Lqg/y$a;->f:I

    const v0, 0x7fffffff

    if-eq p1, v0, :cond_2

    iget-object p1, p0, Lqg/y$a;->g:LDj/c;

    const-wide/16 v0, 0x1

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/y$a;->h:Z

    iget-object p1, p0, Lqg/y$a;->g:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    iget-object p1, p0, Lqg/y$a;->e:Lhg/b;

    invoke-virtual {p1}, Lhg/b;->dispose()V

    iget-object p1, p0, Lqg/y$a;->b:Lzg/c;

    iget-object v0, p0, Lqg/y$a;->a:Lgg/d;

    invoke-virtual {p1, v0}, Lzg/c;->l(Lgg/d;)V

    :cond_2
    :goto_0
    return-void
.end method
