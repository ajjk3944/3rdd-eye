.class final Lsg/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/j$a$a;
    }
.end annotation


# static fields
.field static final h:Lsg/j$a$a;


# instance fields
.field final a:Lgg/d;

.field final b:Lkg/n;

.field final c:Z

.field final d:Lzg/c;

.field final e:Ljava/util/concurrent/atomic/AtomicReference;

.field volatile f:Z

.field g:Lhg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsg/j$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsg/j$a$a;-><init>(Lsg/j$a;)V

    sput-object v0, Lsg/j$a;->h:Lsg/j$a$a;

    return-void
.end method

.method constructor <init>(Lgg/d;Lkg/n;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/j$a;->a:Lgg/d;

    iput-object p2, p0, Lsg/j$a;->b:Lkg/n;

    iput-boolean p3, p0, Lsg/j$a;->c:Z

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lsg/j$a;->d:Lzg/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lsg/j$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsg/j$a;->f:Z

    iget-object v0, p0, Lsg/j$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lsg/j$a;->d:Lzg/c;

    iget-object v1, p0, Lsg/j$a;->a:Lgg/d;

    invoke-virtual {v0, v1}, Lzg/c;->l(Lgg/d;)V

    :cond_0
    return-void
.end method

.method b()V
    .locals 2

    iget-object v0, p0, Lsg/j$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lsg/j$a;->h:Lsg/j$a$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsg/j$a$a;

    if-eqz v0, :cond_0

    if-eq v0, v1, :cond_0

    invoke-virtual {v0}, Lsg/j$a$a;->d()V

    :cond_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lsg/j$a;->g:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lsg/j$a;->g:Lhg/c;

    iget-object p1, p0, Lsg/j$a;->a:Lgg/d;

    invoke-interface {p1, p0}, Lgg/d;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method d(Lsg/j$a$a;)V
    .locals 2

    iget-object v0, p0, Lsg/j$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lsg/j$a;->f:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsg/j$a;->d:Lzg/c;

    iget-object v0, p0, Lsg/j$a;->a:Lgg/d;

    invoke-virtual {p1, v0}, Lzg/c;->l(Lgg/d;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lsg/j$a;->g:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0}, Lsg/j$a;->b()V

    iget-object v0, p0, Lsg/j$a;->d:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    return-void
.end method

.method e(Lsg/j$a$a;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lsg/j$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lsg/j$a;->d:Lzg/c;

    invoke-virtual {p1, p2}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lsg/j$a;->c:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lsg/j$a;->f:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lsg/j$a;->d:Lzg/c;

    iget-object p2, p0, Lsg/j$a;->a:Lgg/d;

    invoke-virtual {p1, p2}, Lzg/c;->l(Lgg/d;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lsg/j$a;->g:Lhg/c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    invoke-virtual {p0}, Lsg/j$a;->b()V

    iget-object p1, p0, Lsg/j$a;->d:Lzg/c;

    iget-object p2, p0, Lsg/j$a;->a:Lgg/d;

    invoke-virtual {p1, p2}, Lzg/c;->l(Lgg/d;)V

    goto :goto_0

    :cond_1
    invoke-static {p2}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lsg/j$a;->b:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null CompletableSource"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lsg/j$a$a;

    invoke-direct {v0, p0}, Lsg/j$a$a;-><init>(Lsg/j$a;)V

    :cond_0
    iget-object v1, p0, Lsg/j$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsg/j$a$a;

    sget-object v2, Lsg/j$a;->h:Lsg/j$a$a;

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lsg/j$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v1, v0}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lsg/j$a$a;->d()V

    :cond_2
    invoke-interface {p1, v0}, Lgg/f;->e(Lgg/d;)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lsg/j$a;->g:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0, p1}, Lsg/j$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 2

    iget-object v0, p0, Lsg/j$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lsg/j$a;->h:Lsg/j$a$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lsg/j$a;->d:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lsg/j$a;->c:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lsg/j$a;->a()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lsg/j$a;->b()V

    iget-object p1, p0, Lsg/j$a;->d:Lzg/c;

    iget-object v0, p0, Lsg/j$a;->a:Lgg/d;

    invoke-virtual {p1, v0}, Lzg/c;->l(Lgg/d;)V

    :cond_1
    :goto_0
    return-void
.end method
