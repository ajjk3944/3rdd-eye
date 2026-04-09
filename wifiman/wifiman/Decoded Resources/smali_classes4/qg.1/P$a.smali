.class final Lqg/P$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/P$a$a;
    }
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;

.field final c:Lqg/P$a$a;

.field final d:Lzg/c;

.field final e:Ljava/util/concurrent/atomic/AtomicLong;

.field volatile f:Z

.field volatile g:Z


# direct methods
.method constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/P$a;->a:LDj/b;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/P$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Lqg/P$a$a;

    invoke-direct {p1, p0}, Lqg/P$a$a;-><init>(Lqg/P$a;)V

    iput-object p1, p0, Lqg/P$a;->c:Lqg/P$a$a;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lqg/P$a;->d:Lzg/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/P$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/P$a;->f:Z

    iget-boolean v0, p0, Lqg/P$a;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/P$a;->a:LDj/b;

    iget-object v1, p0, Lqg/P$a;->d:Lzg/c;

    invoke-static {v0, p0, v1}, Lzg/i;->a(LDj/b;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    :cond_0
    return-void
.end method

.method c()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/P$a;->g:Z

    iget-boolean v0, p0, Lqg/P$a;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/P$a;->a:LDj/b;

    iget-object v1, p0, Lqg/P$a;->d:Lzg/c;

    invoke-static {v0, p0, v1}, Lzg/i;->a(LDj/b;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/P$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/P$a;->c:Lqg/P$a$a;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/P$a;->d:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    return-void
.end method

.method d(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/P$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/P$a;->a:LDj/b;

    iget-object v1, p0, Lqg/P$a;->d:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->c(LDj/b;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lqg/P$a;->a:LDj/b;

    iget-object v1, p0, Lqg/P$a;->d:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->f(LDj/b;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)Z

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/P$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lqg/P$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1}, Lyg/g;->deferredSetOnce(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;LDj/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/P$a;->c:Lqg/P$a$a;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/P$a;->a:LDj/b;

    iget-object v1, p0, Lqg/P$a;->d:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->c(LDj/b;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public request(J)V
    .locals 2

    iget-object v0, p0, Lqg/P$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lqg/P$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1, p2}, Lyg/g;->deferredRequest(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;J)V

    return-void
.end method
