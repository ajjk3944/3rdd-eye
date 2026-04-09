.class final Lqg/c0$b;
.super Ljava/util/concurrent/atomic/AtomicBoolean;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Lqg/c0;

.field final c:Lqg/c0$a;

.field d:LDj/c;


# direct methods
.method constructor <init>(LDj/b;Lqg/c0;Lqg/c0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lqg/c0$b;->a:LDj/b;

    iput-object p2, p0, Lqg/c0$b;->b:Lqg/c0;

    iput-object p3, p0, Lqg/c0$b;->c:Lqg/c0$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/c0$b;->b:Lqg/c0;

    iget-object v1, p0, Lqg/c0$b;->c:Lqg/c0$a;

    invoke-virtual {v0, v1}, Lqg/c0;->i2(Lqg/c0$a;)V

    iget-object v0, p0, Lqg/c0$b;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 2

    iget-object v0, p0, Lqg/c0$b;->d:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/c0$b;->b:Lqg/c0;

    iget-object v1, p0, Lqg/c0$b;->c:Lqg/c0$a;

    invoke-virtual {v0, v1}, Lqg/c0;->h2(Lqg/c0$a;)V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqg/c0$b;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/c0$b;->d:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/c0$b;->d:LDj/c;

    iget-object p1, p0, Lqg/c0$b;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/c0$b;->b:Lqg/c0;

    iget-object v1, p0, Lqg/c0$b;->c:Lqg/c0$a;

    invoke-virtual {v0, v1}, Lqg/c0;->i2(Lqg/c0$a;)V

    iget-object v0, p0, Lqg/c0$b;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lqg/c0$b;->d:LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    return-void
.end method
