.class final Lqg/n$a;
.super Lyg/a;
.source "SourceFile"

# interfaces
.implements LDg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDg/a;

.field final b:Lkg/a;

.field c:LDj/c;

.field d:LDg/d;

.field e:Z


# direct methods
.method constructor <init>(LDg/a;Lkg/a;)V
    .locals 0

    invoke-direct {p0}, Lyg/a;-><init>()V

    iput-object p1, p0, Lqg/n$a;->a:LDg/a;

    iput-object p2, p0, Lqg/n$a;->b:Lkg/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqg/n$a;->a:LDg/a;

    invoke-interface {v0}, LDj/b;->a()V

    invoke-virtual {p0}, Lqg/n$a;->d()V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/n$a;->c:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0}, Lqg/n$a;->d()V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lqg/n$a;->d:LDg/d;

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
    iget-object v0, p0, Lqg/n$a;->b:Lkg/a;

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

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqg/n$a;->a:LDg/a;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lqg/n$a;->d:LDg/d;

    invoke-interface {v0}, LDg/g;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/n$a;->c:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lqg/n$a;->c:LDj/c;

    instance-of v0, p1, LDg/d;

    if-eqz v0, :cond_0

    check-cast p1, LDg/d;

    iput-object p1, p0, Lqg/n$a;->d:LDg/d;

    :cond_0
    iget-object p1, p0, Lqg/n$a;->a:LDg/a;

    invoke-interface {p1, p0}, Lgg/l;->j(LDj/c;)V

    :cond_1
    return-void
.end method

.method public m(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lqg/n$a;->a:LDg/a;

    invoke-interface {v0, p1}, LDg/a;->m(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/n$a;->a:LDg/a;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lqg/n$a;->d()V

    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqg/n$a;->d:LDg/d;

    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-boolean v1, p0, Lqg/n$a;->e:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lqg/n$a;->d()V

    :cond_0
    return-object v0
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lqg/n$a;->c:LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    return-void
.end method

.method public requestFusion(I)I
    .locals 3

    iget-object v0, p0, Lqg/n$a;->d:LDg/d;

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
    iput-boolean v1, p0, Lqg/n$a;->e:Z

    :cond_1
    return p1

    :cond_2
    return v1
.end method
