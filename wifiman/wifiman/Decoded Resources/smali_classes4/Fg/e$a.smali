.class final LFg/e$a;
.super Lyg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFg/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:LFg/e;


# direct methods
.method constructor <init>(LFg/e;)V
    .locals 0

    iput-object p1, p0, LFg/e$a;->a:LFg/e;

    invoke-direct {p0}, Lyg/a;-><init>()V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    iget-boolean v0, v0, LFg/e;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    const/4 v1, 0x1

    iput-boolean v1, v0, LFg/e;->h:Z

    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    invoke-virtual {v0}, LFg/e;->l2()V

    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    iget-object v0, v0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    iget-object v0, v0, LFg/e;->j:Lyg/a;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    iget-object v0, v0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    iget-boolean v1, v0, LFg/e;->l:Z

    if-nez v1, :cond_1

    iget-object v0, v0, LFg/e;->b:LDg/i;

    invoke-virtual {v0}, LDg/i;->clear()V

    :cond_1
    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    iget-object v0, v0, LFg/e;->b:LDg/i;

    invoke-virtual {v0}, LDg/i;->clear()V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    iget-object v0, v0, LFg/e;->b:LDg/i;

    invoke-virtual {v0}, LDg/i;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public poll()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    iget-object v0, v0, LFg/e;->b:LDg/i;

    invoke-virtual {v0}, LDg/i;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public request(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LFg/e$a;->a:LFg/e;

    iget-object v0, v0, LFg/e;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    iget-object p1, p0, LFg/e$a;->a:LFg/e;

    invoke-virtual {p1}, LFg/e;->m2()V

    :cond_0
    return-void
.end method

.method public requestFusion(I)I
    .locals 2

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    iget-object p1, p0, LFg/e$a;->a:LFg/e;

    const/4 v1, 0x1

    iput-boolean v1, p1, LFg/e;->l:Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
