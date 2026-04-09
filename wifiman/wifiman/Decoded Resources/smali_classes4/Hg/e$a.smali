.class final LHg/e$a;
.super Log/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHg/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:LHg/e;


# direct methods
.method constructor <init>(LHg/e;)V
    .locals 0

    iput-object p1, p0, LHg/e$a;->a:LHg/e;

    invoke-direct {p0}, Log/b;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    iget-object v0, v0, LHg/e;->a:LDg/i;

    invoke-virtual {v0}, LDg/i;->clear()V

    return-void
.end method

.method public dispose()V
    .locals 2

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    iget-boolean v0, v0, LHg/e;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    const/4 v1, 0x1

    iput-boolean v1, v0, LHg/e;->e:Z

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    invoke-virtual {v0}, LHg/e;->k1()V

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    iget-object v0, v0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    iget-object v0, v0, LHg/e;->i:Log/b;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    iget-object v0, v0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    iget-boolean v1, v0, LHg/e;->j:Z

    if-nez v1, :cond_0

    iget-object v0, v0, LHg/e;->a:LDg/i;

    invoke-virtual {v0}, LDg/i;->clear()V

    :cond_0
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    iget-boolean v0, v0, LHg/e;->e:Z

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    iget-object v0, v0, LHg/e;->a:LDg/i;

    invoke-virtual {v0}, LDg/i;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public poll()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LHg/e$a;->a:LHg/e;

    iget-object v0, v0, LHg/e;->a:LDg/i;

    invoke-virtual {v0}, LDg/i;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public requestFusion(I)I
    .locals 2

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    iget-object p1, p0, LHg/e$a;->a:LHg/e;

    const/4 v1, 0x1

    iput-boolean v1, p1, LHg/e;->j:Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
