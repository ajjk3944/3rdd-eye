.class final LLi/Q;
.super LMi/c;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LMi/c;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LLi/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final synthetic c(LLi/Q;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, LLi/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LLi/O;

    invoke-virtual {p0, p1}, LLi/Q;->d(LLi/O;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)[Ldh/e;
    .locals 0

    check-cast p1, LLi/O;

    invoke-virtual {p0, p1}, LLi/Q;->f(LLi/O;)[Ldh/e;

    move-result-object p1

    return-object p1
.end method

.method public d(LLi/O;)Z
    .locals 1

    iget-object p1, p0, LLi/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, LNi/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p0, LLi/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LLi/P;->b()LNi/C;

    move-result-object v0

    invoke-static {p1, v0}, LNi/c;->b(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final e(Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LIi/p;

    invoke-static {p1}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    invoke-static {p0}, LLi/Q;->c(LLi/Q;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {}, LLi/P;->b()LNi/C;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, LYg/u;->b:LYg/u$a;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_2

    return-object v0

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public f(LLi/O;)[Ldh/e;
    .locals 1

    iget-object p1, p0, LLi/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LNi/c;->b(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V

    sget-object p1, LMi/b;->a:[Ldh/e;

    return-object p1
.end method

.method public final g()V
    .locals 4

    iget-object v0, p0, LLi/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_0
    invoke-static {v0}, LNi/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-static {}, LLi/P;->c()LNi/C;

    move-result-object v2

    if-ne v1, v2, :cond_2

    return-void

    :cond_2
    invoke-static {}, LLi/P;->b()LNi/C;

    move-result-object v2

    if-ne v1, v2, :cond_3

    iget-object v2, p0, LLi/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LLi/P;->c()LNi/C;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_3
    iget-object v2, p0, LLi/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LLi/P;->b()LNi/C;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    check-cast v1, LIi/p;

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, LLi/Q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LLi/P;->b()LNi/C;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {}, LLi/P;->c()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
