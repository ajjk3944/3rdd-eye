.class final Lqg/o0$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/o0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lqg/o0$a;


# direct methods
.method constructor <init>(Lqg/o0$a;)V
    .locals 0

    iput-object p1, p0, Lqg/o0$a$a;->a:Lqg/o0$a;

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lqg/o0$a$a;->a:Lqg/o0$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lqg/o0$a;->f:Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lqg/o0$a$a;->a:Lqg/o0$a;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lqg/o0$a;->f:Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-static {p0, p1, v0, v1}, Lyg/g;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;LDj/c;J)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lqg/o0$a$a;->a:Lqg/o0$a;

    iget-object v0, v0, Lqg/o0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/o0$a$a;->a:Lqg/o0$a;

    iget-object v1, v0, Lqg/o0$a;->a:LDj/b;

    iget-object v2, v0, Lqg/o0$a;->e:Lzg/c;

    invoke-static {v1, p1, v0, v2}, Lzg/i;->c(LDj/b;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method
