.class final Ltg/m$a;
.super Log/b;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:Lkg/a;

.field c:Lhg/c;

.field d:LDg/b;

.field e:Z


# direct methods
.method constructor <init>(Lgg/x;Lkg/a;)V
    .locals 0

    invoke-direct {p0}, Log/b;-><init>()V

    iput-object p1, p0, Ltg/m$a;->a:Lgg/x;

    iput-object p2, p0, Ltg/m$a;->b:Lkg/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ltg/m$a;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    invoke-virtual {p0}, Ltg/m$a;->d()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/m$a;->c:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Ltg/m$a;->c:Lhg/c;

    instance-of v0, p1, LDg/b;

    if-eqz v0, :cond_0

    check-cast p1, LDg/b;

    iput-object p1, p0, Ltg/m$a;->d:LDg/b;

    :cond_0
    iget-object p1, p0, Ltg/m$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_1
    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Ltg/m$a;->d:LDg/b;

    invoke-interface {v0}, LDg/g;->clear()V

    return-void
.end method

.method d()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Ltg/m$a;->b:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/m$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0}, Ltg/m$a;->d()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ltg/m$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/m$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Ltg/m$a;->d:LDg/b;

    invoke-interface {v0}, LDg/g;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/m$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Ltg/m$a;->d()V

    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltg/m$a;->d:LDg/b;

    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-boolean v1, p0, Ltg/m$a;->e:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ltg/m$a;->d()V

    :cond_0
    return-object v0
.end method

.method public requestFusion(I)I
    .locals 3

    iget-object v0, p0, Ltg/m$a;->d:LDg/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    and-int/lit8 v2, p1, 0x4

    if-nez v2, :cond_2

    invoke-interface {v0, p1}, LDg/c;->requestFusion(I)I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    move v1, v0

    :cond_0
    iput-boolean v1, p0, Ltg/m$a;->e:Z

    :cond_1
    return p1

    :cond_2
    return v1
.end method
