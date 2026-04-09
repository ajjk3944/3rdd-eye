.class final Lqg/t0$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/t0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/t0$a$a;
    }
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Ljava/util/concurrent/atomic/AtomicLong;

.field final c:Ljava/util/concurrent/atomic/AtomicReference;

.field final d:Lzg/c;

.field final e:Lqg/t0$a$a;


# direct methods
.method constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/t0$a;->a:LDj/b;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/t0$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/t0$a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Lqg/t0$a$a;

    invoke-direct {p1, p0}, Lqg/t0$a$a;-><init>(Lqg/t0$a;)V

    iput-object p1, p0, Lqg/t0$a;->e:Lqg/t0$a$a;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lqg/t0$a;->d:Lzg/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lqg/t0$a;->e:Lqg/t0$a$a;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/t0$a;->a:LDj/b;

    iget-object v1, p0, Lqg/t0$a;->d:Lzg/c;

    invoke-static {v0, p0, v1}, Lzg/i;->a(LDj/b;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/t0$a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/t0$a;->e:Lqg/t0$a$a;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lqg/t0$a;->a:LDj/b;

    iget-object v1, p0, Lqg/t0$a;->d:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->f(LDj/b;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)Z

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/t0$a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lqg/t0$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1}, Lyg/g;->deferredSetOnce(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;LDj/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/t0$a;->e:Lqg/t0$a$a;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/t0$a;->a:LDj/b;

    iget-object v1, p0, Lqg/t0$a;->d:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->c(LDj/b;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public request(J)V
    .locals 2

    iget-object v0, p0, Lqg/t0$a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lqg/t0$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1, p2}, Lyg/g;->deferredRequest(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;J)V

    return-void
.end method
