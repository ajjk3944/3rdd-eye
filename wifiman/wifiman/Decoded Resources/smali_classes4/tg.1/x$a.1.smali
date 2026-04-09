.class final Ltg/x$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lhg/c;
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/x$a$a;
    }
.end annotation


# instance fields
.field final a:Lgg/d;

.field final b:Lzg/c;

.field final c:Lkg/n;

.field final d:Z

.field final e:Lhg/b;

.field f:Lhg/c;

.field volatile g:Z


# direct methods
.method constructor <init>(Lgg/d;Lkg/n;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltg/x$a;->a:Lgg/d;

    iput-object p2, p0, Ltg/x$a;->c:Lkg/n;

    iput-boolean p3, p0, Ltg/x$a;->d:Z

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Ltg/x$a;->b:Lzg/c;

    new-instance p1, Lhg/b;

    invoke-direct {p1}, Lhg/b;-><init>()V

    iput-object p1, p0, Ltg/x$a;->e:Lhg/b;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltg/x$a;->b:Lzg/c;

    iget-object v1, p0, Ltg/x$a;->a:Lgg/d;

    invoke-virtual {v0, v1}, Lzg/c;->l(Lgg/d;)V

    :cond_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/x$a;->f:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ltg/x$a;->f:Lhg/c;

    iget-object p1, p0, Ltg/x$a;->a:Lgg/d;

    invoke-interface {p1, p0}, Lgg/d;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method d(Ltg/x$a$a;)V
    .locals 1

    iget-object v0, p0, Ltg/x$a;->e:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->c(Lhg/c;)Z

    invoke-virtual {p0}, Ltg/x$a;->a()V

    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/x$a;->g:Z

    iget-object v0, p0, Ltg/x$a;->f:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/x$a;->e:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    iget-object v0, p0, Ltg/x$a;->b:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    return-void
.end method

.method g(Ltg/x$a$a;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/x$a;->e:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->c(Lhg/c;)Z

    invoke-virtual {p0, p2}, Ltg/x$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ltg/x$a;->c:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null CompletableSource"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    new-instance v0, Ltg/x$a$a;

    invoke-direct {v0, p0}, Ltg/x$a$a;-><init>(Ltg/x$a;)V

    iget-boolean v1, p0, Ltg/x$a;->g:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ltg/x$a;->e:Lhg/b;

    invoke-virtual {v1, v0}, Lhg/b;->a(Lhg/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lgg/f;->e(Lgg/d;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Ltg/x$a;->f:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0, p1}, Ltg/x$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/x$a;->f:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/x$a;->b:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Ltg/x$a;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ltg/x$a;->b:Lzg/c;

    iget-object v0, p0, Ltg/x$a;->a:Lgg/d;

    invoke-virtual {p1, v0}, Lzg/c;->l(Lgg/d;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Ltg/x$a;->g:Z

    iget-object p1, p0, Ltg/x$a;->f:Lhg/c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    iget-object p1, p0, Ltg/x$a;->e:Lhg/b;

    invoke-virtual {p1}, Lhg/b;->dispose()V

    iget-object p1, p0, Ltg/x$a;->b:Lzg/c;

    iget-object v0, p0, Ltg/x$a;->a:Lgg/d;

    invoke-virtual {p1, v0}, Lzg/c;->l(Lgg/d;)V

    :cond_1
    :goto_0
    return-void
.end method
