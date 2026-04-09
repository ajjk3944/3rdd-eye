.class public abstract Landroidx/compose/ui/platform/N0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/N0$a;->a:Landroidx/compose/ui/platform/N0$a;

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/platform/N0;->a:LT/H0;

    return-void
.end method

.method public static final synthetic a(LE0/m0;Landroidx/compose/ui/platform/e0;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/platform/N0;->c(LE0/m0;Landroidx/compose/ui/platform/e0;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/platform/M0;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Landroidx/compose/ui/platform/N0$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/ui/platform/N0$b;

    iget v1, v0, Landroidx/compose/ui/platform/N0$b;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/ui/platform/N0$b;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/N0$b;

    invoke-direct {v0, p2}, Landroidx/compose/ui/platform/N0$b;-><init>(Ldh/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/ui/platform/N0$b;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/ui/platform/N0$b;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/e$c;->k2()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object p2

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    invoke-virtual {p0}, LE0/G;->J()LT/x;

    move-result-object p0

    sget-object v2, Landroidx/compose/ui/platform/N0;->a:LT/H0;

    invoke-interface {p0, v2}, LT/x;->b(LT/u;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lf/d;->a(Ljava/lang/Object;)V

    iput v3, v0, Landroidx/compose/ui/platform/N0$b;->b:I

    const/4 p0, 0x0

    invoke-static {p2, p0, p1, v0}, Landroidx/compose/ui/platform/N0;->c(LE0/m0;Landroidx/compose/ui/platform/e0;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "establishTextInputSession called from an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final c(LE0/m0;Landroidx/compose/ui/platform/e0;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 3

    instance-of p1, p3, Landroidx/compose/ui/platform/N0$c;

    if-eqz p1, :cond_0

    move-object p1, p3

    check-cast p1, Landroidx/compose/ui/platform/N0$c;

    iget v0, p1, Landroidx/compose/ui/platform/N0$c;->b:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p1, Landroidx/compose/ui/platform/N0$c;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/compose/ui/platform/N0$c;

    invoke-direct {p1, p3}, Landroidx/compose/ui/platform/N0$c;-><init>(Ldh/e;)V

    :goto_0
    iget-object p3, p1, Landroidx/compose/ui/platform/N0$c;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p1, Landroidx/compose/ui/platform/N0$c;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    const/4 p0, 0x2

    if-eq v1, p0, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    iput v2, p1, Landroidx/compose/ui/platform/N0$c;->b:I

    invoke-interface {p0, p2, p1}, LE0/m0;->w(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method
