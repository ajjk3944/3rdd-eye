.class public abstract LMh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic a(LMh/k;LBh/g;)LJh/E;
    .locals 0

    invoke-static {p0, p1}, LMh/c;->g(LMh/k;LBh/g;)LJh/E;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LJh/E;
    .locals 0

    invoke-static {p0, p1}, LMh/c;->l(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LJh/E;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LMh/k;LBh/m;LQh/z;ILYg/m;)LMh/k;
    .locals 2

    invoke-virtual {p0}, LMh/k;->a()LMh/d;

    move-result-object v0

    if-eqz p2, :cond_0

    new-instance v1, LMh/m;

    invoke-direct {v1, p0, p1, p2, p3}, LMh/m;-><init>(LMh/k;LBh/m;LQh/z;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LMh/k;->f()LMh/p;

    move-result-object v1

    :goto_0
    new-instance p0, LMh/k;

    invoke-direct {p0, v0, v1, p4}, LMh/k;-><init>(LMh/d;LMh/p;LYg/m;)V

    return-object p0
.end method

.method public static final d(LMh/k;LMh/p;)LMh/k;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LMh/k;

    invoke-virtual {p0}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {p0}, LMh/k;->c()LYg/m;

    move-result-object p0

    invoke-direct {v0, v1, p1, p0}, LMh/k;-><init>(LMh/d;LMh/p;LYg/m;)V

    return-object v0
.end method

.method public static final e(LMh/k;LBh/g;LQh/z;I)LMh/k;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYg/q;->NONE:LYg/q;

    new-instance v1, LMh/a;

    invoke-direct {v1, p0, p1}, LMh/a;-><init>(LMh/k;LBh/g;)V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    invoke-static {p0, p1, p2, p3, v0}, LMh/c;->c(LMh/k;LBh/m;LQh/z;ILYg/m;)LMh/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LMh/k;LBh/g;LQh/z;IILjava/lang/Object;)LMh/k;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-static {p0, p1, p2, p3}, LMh/c;->e(LMh/k;LBh/g;LQh/z;I)LMh/k;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LMh/k;LBh/g;)LJh/E;
    .locals 0

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    invoke-static {p0, p1}, LMh/c;->j(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LJh/E;

    move-result-object p0

    return-object p0
.end method

.method public static final h(LMh/k;LBh/m;LQh/z;I)LMh/k;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LMh/k;->c()LYg/m;

    move-result-object v0

    invoke-static {p0, p1, p2, p3, v0}, LMh/c;->c(LMh/k;LBh/m;LQh/z;ILYg/m;)LMh/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(LMh/k;LBh/m;LQh/z;IILjava/lang/Object;)LMh/k;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, LMh/c;->h(LMh/k;LBh/m;LQh/z;I)LMh/k;

    move-result-object p0

    return-object p0
.end method

.method public static final j(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LJh/E;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalAnnotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->a()LJh/d;

    move-result-object v0

    invoke-virtual {p0}, LMh/k;->b()LJh/E;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, LJh/b;->d(LJh/E;Ljava/lang/Iterable;)LJh/E;

    move-result-object p0

    return-object p0
.end method

.method public static final k(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LMh/k;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalAnnotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LMh/k;

    invoke-virtual {p0}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {p0}, LMh/k;->f()LMh/p;

    move-result-object v2

    sget-object v3, LYg/q;->NONE:LYg/q;

    new-instance v4, LMh/b;

    invoke-direct {v4, p0, p1}, LMh/b;-><init>(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    invoke-static {v3, v4}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, LMh/k;-><init>(LMh/d;LMh/p;LYg/m;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method private static final l(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LJh/E;
    .locals 0

    invoke-static {p0, p1}, LMh/c;->j(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LJh/E;

    move-result-object p0

    return-object p0
.end method

.method public static final m(LMh/k;LMh/d;)LMh/k;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "components"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LMh/k;

    invoke-virtual {p0}, LMh/k;->f()LMh/p;

    move-result-object v1

    invoke-virtual {p0}, LMh/k;->c()LYg/m;

    move-result-object p0

    invoke-direct {v0, p1, v1, p0}, LMh/k;-><init>(LMh/d;LMh/p;LYg/m;)V

    return-object v0
.end method
