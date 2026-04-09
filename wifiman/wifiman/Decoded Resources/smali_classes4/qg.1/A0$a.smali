.class final Lqg/A0$a;
.super Ljava/util/concurrent/atomic/AtomicBoolean;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/A0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/A0$a$a;
    }
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Lgg/y;

.field c:LDj/c;


# direct methods
.method constructor <init>(LDj/b;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lqg/A0$a;->a:LDj/b;

    iput-object p2, p0, Lqg/A0$a;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg/A0$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/A0$a;->b:Lgg/y;

    new-instance v1, Lqg/A0$a$a;

    invoke-direct {v1, p0}, Lqg/A0$a$a;-><init>(Lqg/A0$a;)V

    invoke-virtual {v0, v1}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg/A0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/A0$a;->c:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/A0$a;->c:LDj/c;

    iget-object p1, p0, Lqg/A0$a;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lqg/A0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lqg/A0$a;->c:LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    return-void
.end method
