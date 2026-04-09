.class final Ltg/d$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/d$b$a;
    }
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:Lkg/n;

.field final c:Ltg/d$b$a;

.field final d:I

.field e:LDg/g;

.field f:Lhg/c;

.field volatile g:Z

.field volatile h:Z

.field volatile i:Z

.field j:I


# direct methods
.method constructor <init>(Lgg/x;Lkg/n;I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltg/d$b;->a:Lgg/x;

    iput-object p2, p0, Ltg/d$b;->b:Lkg/n;

    iput p3, p0, Ltg/d$b;->d:I

    new-instance p2, Ltg/d$b$a;

    invoke-direct {p2, p1, p0}, Ltg/d$b$a;-><init>(Lgg/x;Ltg/d$b;)V

    iput-object p2, p0, Ltg/d$b;->c:Ltg/d$b$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Ltg/d$b;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/d$b;->i:Z

    invoke-virtual {p0}, Ltg/d$b;->d()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 2

    iget-object v0, p0, Ltg/d$b;->f:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Ltg/d$b;->f:Lhg/c;

    instance-of v0, p1, LDg/b;

    if-eqz v0, :cond_1

    check-cast p1, LDg/b;

    const/4 v0, 0x3

    invoke-interface {p1, v0}, LDg/c;->requestFusion(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Ltg/d$b;->j:I

    iput-object p1, p0, Ltg/d$b;->e:LDg/g;

    iput-boolean v1, p0, Ltg/d$b;->i:Z

    iget-object p1, p0, Ltg/d$b;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {p0}, Ltg/d$b;->d()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Ltg/d$b;->j:I

    iput-object p1, p0, Ltg/d$b;->e:LDg/g;

    iget-object p1, p0, Ltg/d$b;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    return-void

    :cond_1
    new-instance p1, LDg/i;

    iget v0, p0, Ltg/d$b;->d:I

    invoke-direct {p1, v0}, LDg/i;-><init>(I)V

    iput-object p1, p0, Ltg/d$b;->e:LDg/g;

    iget-object p1, p0, Ltg/d$b;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_2
    return-void
.end method

.method d()V
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Ltg/d$b;->h:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltg/d$b;->e:LDg/g;

    invoke-interface {v0}, LDg/g;->clear()V

    return-void

    :cond_1
    iget-boolean v0, p0, Ltg/d$b;->g:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ltg/d$b;->i:Z

    :try_start_0
    iget-object v1, p0, Ltg/d$b;->e:LDg/g;

    invoke-interface {v1}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    move v3, v2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-eqz v0, :cond_3

    if-eqz v3, :cond_3

    iput-boolean v2, p0, Ltg/d$b;->h:Z

    iget-object v0, p0, Ltg/d$b;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    return-void

    :cond_3
    if-nez v3, :cond_4

    :try_start_1
    iget-object v0, p0, Ltg/d$b;->b:Lkg/n;

    invoke-interface {v0, v1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The mapper returned a null ObservableSource"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lgg/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-boolean v2, p0, Ltg/d$b;->g:Z

    iget-object v1, p0, Ltg/d$b;->c:Ltg/d$b$a;

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Ltg/d$b;->dispose()V

    iget-object v1, p0, Ltg/d$b;->e:LDg/g;

    invoke-interface {v1}, LDg/g;->clear()V

    iget-object v1, p0, Ltg/d$b;->a:Lgg/x;

    invoke-interface {v1, v0}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Ltg/d$b;->dispose()V

    iget-object v1, p0, Ltg/d$b;->e:LDg/g;

    invoke-interface {v1}, LDg/g;->clear()V

    iget-object v1, p0, Ltg/d$b;->a:Lgg/x;

    invoke-interface {v1, v0}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/d$b;->h:Z

    iget-object v0, p0, Ltg/d$b;->c:Ltg/d$b$a;

    invoke-virtual {v0}, Ltg/d$b$a;->d()V

    iget-object v0, p0, Ltg/d$b;->f:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltg/d$b;->e:LDg/g;

    invoke-interface {v0}, LDg/g;->clear()V

    :cond_0
    return-void
.end method

.method g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltg/d$b;->g:Z

    invoke-virtual {p0}, Ltg/d$b;->d()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Ltg/d$b;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Ltg/d$b;->j:I

    if-nez v0, :cond_1

    iget-object v0, p0, Ltg/d$b;->e:LDg/g;

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, Ltg/d$b;->d()V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Ltg/d$b;->h:Z

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ltg/d$b;->i:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/d$b;->i:Z

    invoke-virtual {p0}, Ltg/d$b;->dispose()V

    iget-object v0, p0, Ltg/d$b;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
