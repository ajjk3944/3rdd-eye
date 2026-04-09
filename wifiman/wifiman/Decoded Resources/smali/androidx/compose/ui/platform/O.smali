.class public final Landroidx/compose/ui/platform/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/P0;
.implements LIi/N;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:LR0/T;

.field private final c:LIi/N;

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LR0/T;LIi/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/O;->a:Landroid/view/View;

    iput-object p2, p0, Landroidx/compose/ui/platform/O;->b:LR0/T;

    iput-object p3, p0, Landroidx/compose/ui/platform/O;->c:LIi/N;

    invoke-static {}, Lf0/k;->a()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/O;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final synthetic c(Landroidx/compose/ui/platform/O;)LIi/N;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/O;->c:LIi/N;

    return-object p0
.end method

.method public static final synthetic d(Landroidx/compose/ui/platform/O;)LR0/T;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/O;->b:LR0/T;

    return-object p0
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/O;->a:Landroid/view/View;

    return-object v0
.end method

.method public b(Landroidx/compose/ui/platform/L0;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Landroidx/compose/ui/platform/O$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/ui/platform/O$a;

    iget v1, v0, Landroidx/compose/ui/platform/O$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/ui/platform/O$a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/O$a;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/platform/O$a;-><init>(Landroidx/compose/ui/platform/O;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/ui/platform/O$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/ui/platform/O$a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/compose/ui/platform/O;->d:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Landroidx/compose/ui/platform/O$b;

    invoke-direct {v2, p1, p0}, Landroidx/compose/ui/platform/O$b;-><init>(Landroidx/compose/ui/platform/L0;Landroidx/compose/ui/platform/O;)V

    new-instance p1, Landroidx/compose/ui/platform/O$c;

    const/4 v4, 0x0

    invoke-direct {p1, p0, v4}, Landroidx/compose/ui/platform/O$c;-><init>(Landroidx/compose/ui/platform/O;Ldh/e;)V

    iput v3, v0, Landroidx/compose/ui/platform/O$a;->c:I

    invoke-static {p2, v2, p1, v0}, Lf0/k;->d(Ljava/util/concurrent/atomic/AtomicReference;Lmh/l;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final e(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/O;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lf0/k;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/x0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/x0;->c(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final f()Z
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/O;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lf0/k;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x0;->e()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public getCoroutineContext()Ldh/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/O;->c:LIi/N;

    invoke-interface {v0}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object v0

    return-object v0
.end method
