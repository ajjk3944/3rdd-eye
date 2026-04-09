.class final Lqg/h$a;
.super Lxg/j;
.source "SourceFile"

# interfaces
.implements Lgg/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final e:Ljava/util/concurrent/atomic/AtomicReference;

.field f:Lgg/D;


# direct methods
.method constructor <init>(LDj/b;Lgg/D;)V
    .locals 0

    invoke-direct {p0, p1}, Lxg/j;-><init>(LDj/b;)V

    iput-object p2, p0, Lqg/h$a;->f:Lgg/D;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lxg/j;->b:LDj/c;

    iget-object v0, p0, Lqg/h$a;->f:Lgg/D;

    const/4 v1, 0x0

    iput-object v1, p0, Lqg/h$a;->f:Lgg/D;

    invoke-interface {v0, p0}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lqg/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public cancel()V
    .locals 1

    invoke-super {p0}, Lxg/j;->cancel()V

    iget-object v0, p0, Lqg/h$a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Lxg/j;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lxg/j;->d:J

    iget-object v0, p0, Lxg/j;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lxg/j;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lxg/j;->d(Ljava/lang/Object;)V

    return-void
.end method
