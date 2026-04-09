.class public final Lpi/V;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/V$b;
    }
.end annotation


# static fields
.field public static final a:Lpi/V;

.field private static final b:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpi/V;

    invoke-direct {v0}, Lpi/V;-><init>()V

    sput-object v0, Lpi/V;->a:Lpi/V;

    sget-object v0, Lpi/V$a;->a:Lpi/V$a;

    sput-object v0, Lpi/V;->b:Lmh/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lpi/v0;Ljava/util/List;Lpi/r0;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpi/V;->l(Lpi/v0;Ljava/util/List;Lpi/r0;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lpi/v0;Ljava/util/List;Lpi/r0;ZLii/k;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpi/V;->o(Lpi/v0;Ljava/util/List;Lpi/r0;ZLii/k;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LBh/k0;Ljava/util/List;)Lpi/d0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/m0;

    sget-object v1, Lpi/o0$a;->a:Lpi/o0$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpi/m0;-><init>(Lpi/o0;Z)V

    sget-object v1, Lpi/n0;->e:Lpi/n0$a;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p0, p1}, Lpi/n0$a;->a(Lpi/n0;LBh/k0;Ljava/util/List;)Lpi/n0;

    move-result-object p0

    sget-object p1, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {p1}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lpi/m0;->h(Lpi/n0;Lpi/r0;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lpi/v0;Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 2

    invoke-interface {p1}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    instance-of v1, v0, LBh/l0;

    if-eqz v1, :cond_0

    check-cast v0, LBh/l0;

    invoke-interface {v0}, LBh/h;->u()Lpi/d0;

    move-result-object p1

    invoke-virtual {p1}, Lpi/S;->r()Lii/k;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v1, v0, LBh/e;

    if-eqz v1, :cond_3

    if-nez p3, :cond_1

    invoke-static {v0}, Lfi/e;->s(LBh/m;)LBh/G;

    move-result-object p3

    invoke-static {p3}, Lfi/e;->r(LBh/G;)Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    move-result-object p3

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    check-cast v0, LBh/e;

    invoke-static {v0, p3}, LDh/A;->b(LBh/e;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p1

    goto :goto_0

    :cond_2
    check-cast v0, LBh/e;

    sget-object v1, Lpi/w0;->c:Lpi/w0$a;

    invoke-virtual {v1, p1, p2}, Lpi/w0$a;->b(Lpi/v0;Ljava/util/List;)Lpi/E0;

    move-result-object p1

    invoke-static {v0, p1, p3}, LDh/A;->a(LBh/e;Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of p2, v0, LBh/k0;

    if-eqz p2, :cond_4

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/error/h;->SCOPE_FOR_ABBREVIATION_TYPE:Lkotlin/reflect/jvm/internal/impl/types/error/h;

    check-cast v0, LBh/k0;

    invoke-interface {v0}, LBh/I;->getName()LZh/f;

    move-result-object p2

    invoke-virtual {p2}, LZh/f;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p1, p3, p2}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a(Lkotlin/reflect/jvm/internal/impl/types/error/h;Z[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/g;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_4
    instance-of p2, p1, Lpi/Q;

    if-eqz p2, :cond_5

    check-cast p1, Lpi/Q;

    invoke-virtual {p1}, Lpi/Q;->i()Lii/k;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported classifier: "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for constructor: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final e(Lpi/d0;Lpi/d0;)Lpi/M0;
    .locals 1

    const-string v0, "lowerBound"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lpi/J;

    invoke-direct {v0, p0, p1}, Lpi/J;-><init>(Lpi/d0;Lpi/d0;)V

    return-object v0
.end method

.method public static final f(Lpi/r0;Ldi/q;Z)Lpi/d0;
    .locals 4

    const-string v0, "attributes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/error/h;->INTEGER_LITERAL_TYPE_SCOPE:Lkotlin/reflect/jvm/internal/impl/types/error/h;

    const-string v2, "unknown integer literal type"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v3, v2}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a(Lkotlin/reflect/jvm/internal/impl/types/error/h;Z[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/g;

    move-result-object v1

    invoke-static {p0, p1, v0, p2, v1}, Lpi/V;->m(Lpi/r0;Lpi/v0;Ljava/util/List;ZLii/k;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lpi/v0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;Ljava/util/List;)Lpi/V$b;
    .locals 2

    invoke-interface {p1}, Lpi/v0;->c()LBh/h;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p2, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->f(LBh/m;)LBh/h;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, LBh/k0;

    if-eqz v1, :cond_1

    new-instance p2, Lpi/V$b;

    check-cast p1, LBh/k0;

    invoke-static {p1, p3}, Lpi/V;->c(LBh/k0;Ljava/util/List;)Lpi/d0;

    move-result-object p1

    invoke-direct {p2, p1, v0}, Lpi/V$b;-><init>(Lpi/d0;Lpi/v0;)V

    return-object p2

    :cond_1
    invoke-interface {p1}, LBh/h;->k()Lpi/v0;

    move-result-object p1

    invoke-interface {p1, p2}, Lpi/v0;->b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/v0;

    move-result-object p1

    const-string p2, "refine(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lpi/V$b;

    invoke-direct {p2, v0, p1}, Lpi/V$b;-><init>(Lpi/d0;Lpi/v0;)V

    return-object p2

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static final h(Lpi/r0;LBh/e;Ljava/util/List;)Lpi/d0;
    .locals 8

    const-string v0, "attributes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/h;->k()Lpi/v0;

    move-result-object v2

    const-string p1, "getTypeConstructor(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lpi/V;->k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lpi/r0;Lpi/v0;Ljava/util/List;Z)Lpi/d0;
    .locals 8

    const-string v0, "attributes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-static/range {v1 .. v7}, Lpi/V;->k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 7

    const-string v0, "attributes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lui/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    invoke-interface {p1}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p0}, LBh/h;->u()Lpi/d0;

    move-result-object p0

    const-string p1, "getDefaultType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    sget-object v0, Lpi/V;->a:Lpi/V;

    invoke-direct {v0, p1, p2, p4}, Lpi/V;->d(Lpi/v0;Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object v5

    new-instance v6, Lpi/T;

    invoke-direct {v6, p1, p2, p0, p3}, Lpi/T;-><init>(Lpi/v0;Ljava/util/List;Lpi/r0;Z)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-static/range {v1 .. v6}, Lpi/V;->n(Lpi/r0;Lpi/v0;Ljava/util/List;ZLii/k;Lmh/l;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;
    .locals 0

    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lpi/V;->j(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lpi/v0;Ljava/util/List;Lpi/r0;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 1

    const-string v0, "refiner"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpi/V;->a:Lpi/V;

    invoke-direct {v0, p0, p4, p1}, Lpi/V;->g(Lpi/v0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;Ljava/util/List;)Lpi/V$b;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lpi/V$b;->a()Lpi/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lpi/V$b;->b()Lpi/v0;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p2, p0, p1, p3, p4}, Lpi/V;->j(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lpi/r0;Lpi/v0;Ljava/util/List;ZLii/k;)Lpi/d0;
    .locals 8

    const-string v0, "attributes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/e0;

    new-instance v7, Lpi/U;

    move-object v1, v7

    move-object v2, p1

    move-object v3, p2

    move-object v4, p0

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lpi/U;-><init>(Lpi/v0;Ljava/util/List;Lpi/r0;ZLii/k;)V

    move-object v1, v0

    move v4, p3

    move-object v5, p4

    move-object v6, v7

    invoke-direct/range {v1 .. v6}, Lpi/e0;-><init>(Lpi/v0;Ljava/util/List;ZLii/k;Lmh/l;)V

    invoke-virtual {p0}, Lui/a;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lpi/f0;

    invoke-direct {p1, v0, p0}, Lpi/f0;-><init>(Lpi/d0;Lpi/r0;)V

    move-object v0, p1

    :goto_0
    return-object v0
.end method

.method public static final n(Lpi/r0;Lpi/v0;Ljava/util/List;ZLii/k;Lmh/l;)Lpi/d0;
    .locals 7

    const-string v0, "attributes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refinedTypeFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/e0;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lpi/e0;-><init>(Lpi/v0;Ljava/util/List;ZLii/k;Lmh/l;)V

    invoke-virtual {p0}, Lui/a;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lpi/f0;

    invoke-direct {p1, v0, p0}, Lpi/f0;-><init>(Lpi/d0;Lpi/r0;)V

    move-object v0, p1

    :goto_0
    return-object v0
.end method

.method private static final o(Lpi/v0;Ljava/util/List;Lpi/r0;ZLii/k;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpi/V;->a:Lpi/V;

    invoke-direct {v0, p0, p5, p1}, Lpi/V;->g(Lpi/v0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;Ljava/util/List;)Lpi/V$b;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lpi/V$b;->a()Lpi/d0;

    move-result-object p5

    if-eqz p5, :cond_1

    return-object p5

    :cond_1
    invoke-virtual {p0}, Lpi/V$b;->b()Lpi/v0;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p2, p0, p1, p3, p4}, Lpi/V;->m(Lpi/r0;Lpi/v0;Ljava/util/List;ZLii/k;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method
