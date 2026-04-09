.class public abstract LJh/T;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic a(LBh/b;)Z
    .locals 0

    invoke-static {p0}, LJh/T;->h(LBh/b;)Z

    move-result p0

    return p0
.end method

.method static synthetic b(LBh/b;)Z
    .locals 0

    invoke-static {p0}, LJh/T;->i(LBh/b;)Z

    move-result p0

    return p0
.end method

.method static synthetic c(LBh/b;)Z
    .locals 0

    invoke-static {p0}, LJh/T;->k(LBh/b;)Z

    move-result p0

    return p0
.end method

.method public static final d(LBh/b;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LJh/T;->g(LBh/b;)LBh/b;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final e(LBh/b;)Ljava/lang/String;
    .locals 2

    const-string v0, "callableMemberDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LJh/T;->f(LBh/b;)LBh/b;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lfi/e;->w(LBh/b;)LBh/b;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p0, LBh/Y;

    if-eqz v1, :cond_1

    sget-object v0, LJh/m;->a:LJh/m;

    invoke-virtual {v0, p0}, LJh/m;->b(LBh/b;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v1, p0, LBh/f0;

    if-eqz v1, :cond_2

    sget-object v1, LJh/f;->o:LJh/f;

    check-cast p0, LBh/f0;

    invoke-virtual {v1, p0}, LJh/f;->j(LBh/f0;)LZh/f;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private static final f(LBh/b;)LBh/b;
    .locals 1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g0(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LJh/T;->g(LBh/b;)LBh/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final g(LBh/b;)LBh/b;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/U;->a:LJh/U$a;

    invoke-virtual {v0}, LJh/U$a;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, LJh/j;->a:LJh/j;

    invoke-virtual {v0}, LJh/j;->d()Ljava/util/Set;

    move-result-object v0

    invoke-static {p0}, Lfi/e;->w(LBh/b;)LBh/b;

    move-result-object v2

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    instance-of v0, p0, LBh/Y;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_2

    instance-of v0, p0, LBh/X;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p0, LBh/f0;

    if-eqz v0, :cond_3

    sget-object v0, LJh/Q;->a:LJh/Q;

    invoke-static {p0, v3, v0, v2, v1}, Lfi/e;->i(LBh/b;ZLmh/l;ILjava/lang/Object;)LBh/b;

    move-result-object v1

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, LJh/P;->a:LJh/P;

    invoke-static {p0, v3, v0, v2, v1}, Lfi/e;->i(LBh/b;ZLmh/l;ILjava/lang/Object;)LBh/b;

    move-result-object v1

    :cond_3
    :goto_1
    return-object v1
.end method

.method private static final h(LBh/b;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/m;->a:LJh/m;

    invoke-static {p0}, Lfi/e;->w(LBh/b;)LBh/b;

    move-result-object p0

    invoke-virtual {v0, p0}, LJh/m;->d(LBh/b;)Z

    move-result p0

    return p0
.end method

.method private static final i(LBh/b;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/f;->o:LJh/f;

    check-cast p0, LBh/f0;

    invoke-virtual {v0, p0}, LJh/f;->k(LBh/f0;)Z

    move-result p0

    return p0
.end method

.method public static final j(LBh/b;)LBh/b;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LJh/T;->g(LBh/b;)LBh/b;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, LJh/i;->o:LJh/i;

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LJh/i;->n(LZh/f;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v0, LJh/S;->a:LJh/S;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p0, v3, v0, v2, v1}, Lfi/e;->i(LBh/b;ZLmh/l;ILjava/lang/Object;)LBh/b;

    move-result-object p0

    return-object p0
.end method

.method private static final k(LBh/b;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g0(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LJh/i;->o(LBh/b;)LJh/U$b;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final l(LBh/e;LBh/a;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "specialCallableDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/n;->b()LBh/m;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LBh/e;

    invoke-interface {p1}, LBh/e;->u()Lpi/d0;

    move-result-object p1

    const-string v0, "getDefaultType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbi/i;->s(LBh/e;)LBh/e;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    instance-of v0, p0, LLh/c;

    if-nez v0, :cond_0

    invoke-interface {p0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/w;->b(Lpi/S;Lpi/S;)Lpi/S;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g0(LBh/m;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0

    :cond_0
    invoke-static {p0}, Lbi/i;->s(LBh/e;)LBh/e;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final m(LBh/b;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lfi/e;->w(LBh/b;)LBh/b;

    move-result-object p0

    invoke-interface {p0}, LBh/n;->b()LBh/m;

    move-result-object p0

    instance-of p0, p0, LLh/c;

    return p0
.end method

.method public static final n(LBh/b;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LJh/T;->m(LBh/b;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g0(LBh/m;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
