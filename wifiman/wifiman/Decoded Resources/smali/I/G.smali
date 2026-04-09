.class public final LI/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final b:LT/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LI/G;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-static {v0}, LT/C0;->a(F)LT/m0;

    move-result-object v0

    iput-object v0, p0, LI/G;->b:LT/m0;

    return-void
.end method

.method public static final synthetic a(LI/G;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, LI/G;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic b(LI/G;F)V
    .locals 0

    invoke-direct {p0, p1}, LI/G;->e(F)V

    return-void
.end method

.method private final e(F)V
    .locals 1

    iget-object v0, p0, LI/G;->b:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-object v0, p0, LI/G;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIi/y0;

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final d()F
    .locals 1

    iget-object v0, p0, LI/G;->b:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final f(Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LI/G$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LI/G$a;-><init>(LI/G;Ldh/e;)V

    invoke-static {v0, p1}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
