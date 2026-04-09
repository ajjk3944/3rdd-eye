.class final Lqg/o0$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements LDg/a;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/o0$a$a;
    }
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;

.field final c:Ljava/util/concurrent/atomic/AtomicLong;

.field final d:Lqg/o0$a$a;

.field final e:Lzg/c;

.field volatile f:Z


# direct methods
.method constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/o0$a;->a:LDj/b;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/o0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/o0$a;->c:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Lqg/o0$a$a;

    invoke-direct {p1, p0}, Lqg/o0$a$a;-><init>(Lqg/o0$a;)V

    iput-object p1, p0, Lqg/o0$a;->d:Lqg/o0$a$a;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lqg/o0$a;->e:Lzg/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lqg/o0$a;->d:Lqg/o0$a$a;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/o0$a;->a:LDj/b;

    iget-object v1, p0, Lqg/o0$a;->e:Lzg/c;

    invoke-static {v0, p0, v1}, Lzg/i;->a(LDj/b;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/o0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/o0$a;->d:Lqg/o0$a$a;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    invoke-virtual {p0, p1}, Lqg/o0$a;->m(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lqg/o0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDj/c;

    const-wide/16 v0, 0x1

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/o0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lqg/o0$a;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1}, Lyg/g;->deferredSetOnce(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;LDj/c;)Z

    return-void
.end method

.method public m(Ljava/lang/Object;)Z
    .locals 2

    iget-boolean v0, p0, Lqg/o0$a;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/o0$a;->a:LDj/b;

    iget-object v1, p0, Lqg/o0$a;->e:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->f(LDj/b;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/o0$a;->d:Lqg/o0$a$a;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/o0$a;->a:LDj/b;

    iget-object v1, p0, Lqg/o0$a;->e:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->c(LDj/b;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public request(J)V
    .locals 2

    iget-object v0, p0, Lqg/o0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lqg/o0$a;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1, p2}, Lyg/g;->deferredRequest(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;J)V

    return-void
.end method
