.class public abstract Lfi/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LZh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "value"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lfi/e;->a:LZh/f;

    return-void
.end method

.method private static final A(ZLBh/b;)Lzi/j;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1, p0}, Lfi/e;->z(LBh/b;Z)Lzi/j;

    move-result-object p0

    return-object p0
.end method

.method public static final B(LBh/G;LZh/c;LIh/b;)LBh/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topLevelClassFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZh/c;->d()Z

    invoke-virtual {p1}, LZh/c;->e()LZh/c;

    move-result-object v0

    const-string v1, "parent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, LBh/G;->y(LZh/c;)LBh/U;

    move-result-object p0

    invoke-interface {p0}, LBh/U;->r()Lii/k;

    move-result-object p0

    invoke-virtual {p1}, LZh/c;->g()LZh/f;

    move-result-object p1

    const-string v0, "shortName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p0

    instance-of p1, p0, LBh/e;

    if-eqz p1, :cond_0

    check-cast p0, LBh/e;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final a(LBh/m;)LBh/m;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(LBh/s0;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0}, Lfi/e;->g(LBh/s0;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(LBh/m;)LBh/m;
    .locals 0

    invoke-static {p0}, Lfi/e;->a(LBh/m;)LBh/m;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(ZLBh/b;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0, p1}, Lfi/e;->j(ZLBh/b;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(ZLBh/b;)Lzi/j;
    .locals 0

    invoke-static {p0, p1}, Lfi/e;->A(ZLBh/b;)Lzi/j;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LBh/s0;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    sget-object v0, Lfi/a;->a:Lfi/a;

    sget-object v1, Lfi/e$a;->a:Lfi/e$a;

    invoke-static {p0, v0, v1}, Lxi/b;->e(Ljava/util/Collection;Lxi/b$c;Lmh/l;)Ljava/lang/Boolean;

    move-result-object p0

    const-string v0, "ifAny(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final g(LBh/s0;)Ljava/lang/Iterable;
    .locals 2

    invoke-interface {p0}, LBh/s0;->f()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/s0;

    invoke-interface {v1}, LBh/s0;->a()LBh/s0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final h(LBh/b;ZLmh/l;)LBh/b;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predicate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {p0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    new-instance v1, Lfi/c;

    invoke-direct {v1, p1}, Lfi/c;-><init>(Z)V

    new-instance p1, Lfi/e$b;

    invoke-direct {p1, v0, p2}, Lfi/e$b;-><init>(Lkotlin/jvm/internal/N;Lmh/l;)V

    invoke-static {p0, v1, p1}, Lxi/b;->b(Ljava/util/Collection;Lxi/b$c;Lxi/b$d;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBh/b;

    return-object p0
.end method

.method public static synthetic i(LBh/b;ZLmh/l;ILjava/lang/Object;)LBh/b;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lfi/e;->h(LBh/b;ZLmh/l;)LBh/b;

    move-result-object p0

    return-object p0
.end method

.method private static final j(ZLBh/b;)Ljava/lang/Iterable;
    .locals 0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LBh/b;->a()LBh/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    invoke-interface {p1}, LBh/b;->f()Ljava/util/Collection;

    move-result-object p0

    if-eqz p0, :cond_2

    :goto_1
    check-cast p0, Ljava/lang/Iterable;

    goto :goto_2

    :cond_2
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    goto :goto_1

    :goto_2
    return-object p0
.end method

.method public static final k(LBh/m;)LZh/c;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lfi/e;->p(LBh/m;)LZh/d;

    move-result-object p0

    invoke-virtual {p0}, LZh/d;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, LZh/d;->l()LZh/c;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public static final l(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)LBh/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;->getType()Lpi/S;

    move-result-object p0

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_0

    check-cast p0, LBh/e;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lfi/e;->s(LBh/m;)LBh/G;

    move-result-object p0

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p0

    return-object p0
.end method

.method public static final n(LBh/h;)LZh/b;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-interface {p0}, LBh/n;->b()LBh/m;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v2, v1, LBh/M;

    const-string v3, "getName(...)"

    if-eqz v2, :cond_0

    new-instance v0, LZh/b;

    check-cast v1, LBh/M;

    invoke-interface {v1}, LBh/M;->e()LZh/c;

    move-result-object v1

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p0}, LZh/b;-><init>(LZh/c;LZh/f;)V

    goto :goto_0

    :cond_0
    instance-of v2, v1, LBh/i;

    if-eqz v2, :cond_1

    check-cast v1, LBh/h;

    invoke-static {v1}, Lfi/e;->n(LBh/h;)LZh/b;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p0}, LZh/b;->d(LZh/f;)LZh/b;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final o(LBh/m;)LZh/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbi/i;->n(LBh/m;)LZh/c;

    move-result-object p0

    const-string v0, "getFqNameSafe(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final p(LBh/m;)LZh/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbi/i;->m(LBh/m;)LZh/d;

    move-result-object p0

    const-string v0, "getFqName(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final q(LBh/e;)LBh/A;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LBh/e;->z0()LBh/q0;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of v1, p0, LBh/A;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, LBh/A;

    :cond_1
    return-object v0
.end method

.method public static final r(LBh/G;)Lkotlin/reflect/jvm/internal/impl/types/checker/g;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/types/checker/h;->a()LBh/F;

    move-result-object v0

    invoke-interface {p0, v0}, LBh/G;->b0(LBh/F;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lf/d;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/reflect/jvm/internal/impl/types/checker/g$a;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/g$a;

    return-object p0
.end method

.method public static final s(LBh/m;)LBh/G;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbi/i;->g(LBh/m;)LBh/G;

    move-result-object p0

    const-string v0, "getContainingModule(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final t(LBh/e;)LBh/H;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LBh/e;->z0()LBh/q0;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of v1, p0, LBh/H;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, LBh/H;

    :cond_1
    return-object v0
.end method

.method public static final u(LBh/m;)Lzi/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lfi/e;->v(LBh/m;)Lzi/j;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzi/m;->B(Lzi/j;I)Lzi/j;

    move-result-object p0

    return-object p0
.end method

.method public static final v(LBh/m;)Lzi/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfi/b;->a:Lfi/b;

    invoke-static {p0, v0}, Lzi/m;->n(Ljava/lang/Object;Lmh/l;)Lzi/j;

    move-result-object p0

    return-object p0
.end method

.method public static final w(LBh/b;)LBh/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LBh/X;

    if-eqz v0, :cond_0

    check-cast p0, LBh/X;

    invoke-interface {p0}, LBh/X;->C0()LBh/Y;

    move-result-object p0

    const-string v0, "getCorrespondingProperty(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final x(LBh/e;)LBh/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/e;->u()Lpi/d0;

    move-result-object p0

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->b0(Lpi/S;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    invoke-static {v0}, Lbi/i;->w(LBh/m;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/e;

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final y(LBh/G;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/types/checker/h;->a()LBh/F;

    move-result-object v0

    invoke-interface {p0, v0}, LBh/G;->b0(LBh/F;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static final z(LBh/b;Z)Lzi/j;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-interface {p0}, LBh/b;->a()LBh/b;

    move-result-object p0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [LBh/b;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lzi/m;->s([Ljava/lang/Object;)Lzi/j;

    move-result-object v0

    invoke-interface {p0}, LBh/b;->f()Ljava/util/Collection;

    move-result-object p0

    const-string v1, "getOverriddenDescriptors(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p0

    new-instance v1, Lfi/d;

    invoke-direct {v1, p1}, Lfi/d;-><init>(Z)V

    invoke-static {p0, v1}, Lzi/m;->H(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p0

    invoke-static {v0, p0}, Lzi/m;->S(Lzi/j;Lzi/j;)Lzi/j;

    move-result-object p0

    return-object p0
.end method
