.class public final Lkotlin/reflect/jvm/internal/impl/types/error/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

.field private static final b:LBh/G;

.field private static final c:Lkotlin/reflect/jvm/internal/impl/types/error/a;

.field private static final d:Lpi/S;

.field private static final e:Lpi/S;

.field private static final f:LBh/Y;

.field private static final g:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/e;->a:Lkotlin/reflect/jvm/internal/impl/types/error/e;

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->b:LBh/G;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/error/a;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/error/b;->ERROR_CLASS:Lkotlin/reflect/jvm/internal/impl/types/error/b;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/types/error/b;->getDebugText()Ljava/lang/String;

    move-result-object v1

    const-string v2, "unknown class"

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LZh/f;->n(Ljava/lang/String;)LZh/f;

    move-result-object v1

    const-string v2, "special(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/error/a;-><init>(LZh/f;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->c:Lkotlin/reflect/jvm/internal/impl/types/error/a;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/k;->CYCLIC_SUPERTYPES:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d:Lpi/S;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/k;->ERROR_PROPERTY_TYPE:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->e:Lpi/S;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/error/f;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/f;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->f:LBh/Y;

    invoke-static {v0}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->g:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final varargs a(Lkotlin/reflect/jvm/internal/impl/types/error/h;Z[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/g;
    .locals 1

    const-string v0, "kind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    new-instance p1, Lkotlin/reflect/jvm/internal/impl/types/error/m;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-direct {p1, p0, p2}, Lkotlin/reflect/jvm/internal/impl/types/error/m;-><init>(Lkotlin/reflect/jvm/internal/impl/types/error/h;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/types/error/g;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-direct {p1, p0, p2}, Lkotlin/reflect/jvm/internal/impl/types/error/g;-><init>(Lkotlin/reflect/jvm/internal/impl/types/error/h;[Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public static final varargs b(Lkotlin/reflect/jvm/internal/impl/types/error/h;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/g;
    .locals 1

    const-string v0, "kind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a(Lkotlin/reflect/jvm/internal/impl/types/error/h;Z[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/g;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;
    .locals 3

    const-string v0, "kind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {v0, p0, v1, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->g(Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p0

    return-object p0
.end method

.method public static final m(LBh/m;)Z
    .locals 2

    if-eqz p0, :cond_1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->n(LBh/m;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->n(LBh/m;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->b:LBh/G;

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private final n(LBh/m;)Z
    .locals 0

    instance-of p1, p1, Lkotlin/reflect/jvm/internal/impl/types/error/a;

    return p1
.end method

.method public static final o(Lpi/S;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    instance-of v1, p0, Lkotlin/reflect/jvm/internal/impl/types/error/j;

    if-eqz v1, :cond_1

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/types/error/j;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/j;->f()Lkotlin/reflect/jvm/internal/impl/types/error/k;

    move-result-object p0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/error/k;->UNINFERRED_TYPE_VARIABLE:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    if-ne p0, v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method


# virtual methods
.method public final varargs c(Lkotlin/reflect/jvm/internal/impl/types/error/k;Lpi/v0;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;
    .locals 2

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeConstructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    array-length v1, p3

    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2, p3}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->f(Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Lpi/v0;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    return-object p1
.end method

.method public final varargs e(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/j;
    .locals 2

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/error/j;

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-direct {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/error/j;-><init>(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)V

    return-object v0
.end method

.method public final varargs f(Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Lpi/v0;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;
    .locals 8

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeConstructor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/error/i;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/error/h;->ERROR_TYPE_SCOPE:Lkotlin/reflect/jvm/internal/impl/types/error/h;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->b(Lkotlin/reflect/jvm/internal/impl/types/error/h;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/g;

    move-result-object v3

    array-length v1, p4

    invoke-static {p4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p4

    move-object v7, p4

    check-cast v7, [Ljava/lang/String;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p3

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, Lkotlin/reflect/jvm/internal/impl/types/error/i;-><init>(Lpi/v0;Lii/k;Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Z[Ljava/lang/String;)V

    return-object v0
.end method

.method public final varargs g(Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;
    .locals 2

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p3

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->e(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/j;

    move-result-object v0

    array-length v1, p3

    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/String;

    invoke-virtual {p0, p1, p2, v0, p3}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->f(Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Lpi/v0;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    return-object p1
.end method

.method public final h()Lkotlin/reflect/jvm/internal/impl/types/error/a;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->c:Lkotlin/reflect/jvm/internal/impl/types/error/a;

    return-object v0
.end method

.method public final i()LBh/G;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->b:LBh/G;

    return-object v0
.end method

.method public final j()Ljava/util/Set;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->g:Ljava/util/Set;

    return-object v0
.end method

.method public final k()Lpi/S;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->e:Lpi/S;

    return-object v0
.end method

.method public final l()Lpi/S;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d:Lpi/S;

    return-object v0
.end method

.method public final p(Lpi/S;)Ljava/lang/String;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lsi/d;->z(Lpi/S;)Z

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/error/j;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/types/error/j;->g(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
