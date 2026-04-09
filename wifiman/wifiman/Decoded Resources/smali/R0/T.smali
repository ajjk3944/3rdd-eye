.class public LR0/T;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LR0/L;

.field private final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LR0/L;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/T;->a:LR0/L;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LR0/T;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a()LR0/Z;
    .locals 1

    iget-object v0, p0, LR0/T;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR0/Z;

    return-object v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, LR0/T;->a:LR0/L;

    invoke-interface {v0}, LR0/L;->g()V

    return-void
.end method

.method public final c()V
    .locals 1

    invoke-virtual {p0}, LR0/T;->a()LR0/Z;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LR0/T;->a:LR0/L;

    invoke-interface {v0}, LR0/L;->c()V

    :cond_0
    return-void
.end method

.method public d(LR0/Q;LR0/s;Lmh/l;Lmh/l;)LR0/Z;
    .locals 1

    iget-object v0, p0, LR0/T;->a:LR0/L;

    invoke-interface {v0, p1, p2, p3, p4}, LR0/L;->a(LR0/Q;LR0/s;Lmh/l;Lmh/l;)V

    new-instance p1, LR0/Z;

    iget-object p2, p0, LR0/T;->a:LR0/L;

    invoke-direct {p1, p0, p2}, LR0/Z;-><init>(LR0/T;LR0/L;)V

    iget-object p2, p0, LR0/T;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, LR0/T;->a:LR0/L;

    invoke-interface {v0}, LR0/L;->b()V

    new-instance v0, LR0/Z;

    iget-object v1, p0, LR0/T;->a:LR0/L;

    invoke-direct {v0, p0, v1}, LR0/Z;-><init>(LR0/T;LR0/L;)V

    iget-object v1, p0, LR0/T;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, LR0/T;->a:LR0/L;

    invoke-interface {v0}, LR0/L;->d()V

    return-void
.end method

.method public g(LR0/Z;)V
    .locals 2

    iget-object v0, p0, LR0/T;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LR0/T;->a:LR0/L;

    invoke-interface {p1}, LR0/L;->d()V

    :cond_0
    return-void
.end method
