.class public abstract Lwh/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lth/c;
.implements Lwh/X0;


# instance fields
.field private final a:Lwh/a1$a;

.field private final b:Lwh/a1$a;

.field private final c:Lwh/a1$a;

.field private final d:Lwh/a1$a;

.field private final e:Lwh/a1$a;

.field private final f:LYg/m;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwh/q;

    invoke-direct {v0, p0}, Lwh/q;-><init>(Lwh/A;)V

    invoke-static {v0}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object v0

    const-string v1, "lazySoft(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lwh/A;->a:Lwh/a1$a;

    new-instance v0, Lwh/r;

    invoke-direct {v0, p0}, Lwh/r;-><init>(Lwh/A;)V

    invoke-static {v0}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lwh/A;->b:Lwh/a1$a;

    new-instance v0, Lwh/s;

    invoke-direct {v0, p0}, Lwh/s;-><init>(Lwh/A;)V

    invoke-static {v0}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lwh/A;->c:Lwh/a1$a;

    new-instance v0, Lwh/t;

    invoke-direct {v0, p0}, Lwh/t;-><init>(Lwh/A;)V

    invoke-static {v0}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lwh/A;->d:Lwh/a1$a;

    new-instance v0, Lwh/u;

    invoke-direct {v0, p0}, Lwh/u;-><init>(Lwh/A;)V

    invoke-static {v0}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lwh/A;->e:Lwh/a1$a;

    sget-object v0, LYg/q;->PUBLICATION:LYg/q;

    new-instance v1, Lwh/v;

    invoke-direct {v1, p0}, Lwh/v;-><init>(Lwh/A;)V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lwh/A;->f:LYg/m;

    return-void
.end method

.method static synthetic A(Lwh/A;)Lwh/U0;
    .locals 0

    invoke-static {p0}, Lwh/A;->q(Lwh/A;)Lwh/U0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic D(Lwh/A;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lwh/A;->w(Lwh/A;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic G(Lwh/A;)[Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lwh/A;->b(Lwh/A;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic H(Lwh/A;)Z
    .locals 0

    invoke-static {p0}, Lwh/A;->c0(Lwh/A;)Z

    move-result p0

    return p0
.end method

.method static synthetic I(LBh/b0;)LBh/V;
    .locals 0

    invoke-static {p0}, Lwh/A;->i(LBh/b0;)LBh/V;

    move-result-object p0

    return-object p0
.end method

.method static synthetic L(LBh/b0;)LBh/V;
    .locals 0

    invoke-static {p0}, Lwh/A;->k(LBh/b0;)LBh/V;

    move-result-object p0

    return-object p0
.end method

.method static synthetic M(LBh/b;I)LBh/V;
    .locals 0

    invoke-static {p0, p1}, Lwh/A;->p(LBh/b;I)LBh/V;

    move-result-object p0

    return-object p0
.end method

.method static synthetic N(Lwh/A;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-static {p0}, Lwh/A;->u(Lwh/A;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method private final O(Ljava/util/Map;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lwh/A;->getParameters()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lth/k;

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Annotation argument value cannot be null ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-interface {v2}, Lth/k;->S()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    invoke-interface {v2}, Lth/k;->c()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Lth/k;->getType()Lth/p;

    move-result-object v2

    invoke-direct {p0, v2}, Lwh/A;->R(Lth/p;)Ljava/lang/Object;

    move-result-object v3

    :goto_1
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No argument provided for a required parameter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {p0}, Lwh/A;->X()Lxh/h;

    move-result-object p1

    if-eqz p1, :cond_5

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lxh/h;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lkotlin/reflect/full/IllegalCallableAccessException;

    invoke-direct {v0, p1}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw v0

    :cond_5
    new-instance p1, Lwh/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "This callable does not support a default call: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final R(Lth/p;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lvh/b;->b(Lth/p;)Lth/d;

    move-result-object p1

    invoke-static {p1}, Llh/a;->b(Lth/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "run(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v0, Lwh/Y0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot instantiate the default empty array of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", because it is not an array type"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final T()Ljava/lang/reflect/Type;
    .locals 4

    invoke-interface {p0}, Lth/c;->isSuspend()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lwh/A;->V()Lxh/h;

    move-result-object v0

    invoke-interface {v0}, Lxh/h;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    const-class v3, Ldh/e;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v2, "getActualTypeArguments(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/n;->Q0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v2, :cond_2

    check-cast v0, Ljava/lang/reflect/WildcardType;

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, LZg/n;->Z([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/Type;

    :cond_3
    return-object v1
.end method

.method private final U()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/A;->e:Lwh/a1$a;

    invoke-virtual {v0}, Lwh/a1$a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method private final Z(Lth/k;)I
    .locals 1

    iget-object v0, p0, Lwh/A;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lth/k;->getType()Lth/p;

    move-result-object v0

    invoke-static {v0}, Lwh/j1;->k(Lth/p;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lth/k;->getType()Lth/p;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lwh/U0;

    invoke-virtual {p1}, Lwh/U0;->u()Lpi/S;

    move-result-object p1

    invoke-static {p1}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object p1

    invoke-static {p1}, Lxh/o;->n(Lpi/d0;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Check if parametersNeedMFVCFlattening is true before"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final b(Lwh/A;)[Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Lwh/A;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p0}, Lth/c;->isSuspend()Z

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lwh/A;->f:LYg/m;

    invoke-interface {v2}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lth/k;

    invoke-interface {v5}, Lth/k;->h()Lth/k$a;

    move-result-object v6

    sget-object v7, Lth/k$a;->VALUE:Lth/k$a;

    if-ne v6, v7, :cond_0

    invoke-direct {p0, v5}, Lwh/A;->Z(Lth/k;)I

    move-result v5

    goto :goto_1

    :cond_0
    move v5, v3

    :goto_1
    add-int/2addr v4, v5

    goto :goto_0

    :cond_1
    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    instance-of v4, v2, Ljava/util/Collection;

    if-eqz v4, :cond_2

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v3

    goto :goto_3

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v4, v3

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lth/k;

    invoke-interface {v5}, Lth/k;->h()Lth/k$a;

    move-result-object v5

    sget-object v6, Lth/k$a;->VALUE:Lth/k$a;

    if-ne v5, v6, :cond_3

    add-int/lit8 v4, v4, 0x1

    if-gez v4, :cond_3

    invoke-static {}, LZg/v;->u()V

    goto :goto_2

    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1f

    div-int/lit8 v4, v4, 0x20

    add-int v2, v1, v4

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lth/k;

    invoke-interface {v5}, Lth/k;->S()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Lth/k;->getType()Lth/p;

    move-result-object v6

    invoke-static {v6}, Lwh/j1;->l(Lth/p;)Z

    move-result v6

    if-nez v6, :cond_6

    invoke-interface {v5}, Lth/k;->getIndex()I

    move-result v6

    invoke-interface {v5}, Lth/k;->getType()Lth/p;

    move-result-object v5

    invoke-static {v5}, Lvh/c;->f(Lth/p;)Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lwh/j1;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v2, v6

    goto :goto_4

    :cond_6
    invoke-interface {v5}, Lth/k;->c()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Lth/k;->getIndex()I

    move-result v6

    invoke-interface {v5}, Lth/k;->getType()Lth/p;

    move-result-object v5

    invoke-direct {p0, v5}, Lwh/A;->R(Lth/p;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v2, v6

    goto :goto_4

    :cond_7
    move p0, v3

    :goto_5
    if-ge p0, v4, :cond_8

    add-int v0, v1, p0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v0

    add-int/lit8 p0, p0, 0x1

    goto :goto_5

    :cond_8
    return-object v2
.end method

.method private static final c0(Lwh/A;)Z
    .locals 2

    invoke-virtual {p0}, Lwh/A;->getParameters()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lth/k;

    invoke-interface {v0}, Lth/k;->getType()Lth/p;

    move-result-object v0

    invoke-static {v0}, Lwh/j1;->k(Lth/p;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1
.end method

.method private static final e(Lwh/A;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object p0

    invoke-static {p0}, Lwh/j1;->e(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lwh/A;)Ljava/util/ArrayList;
    .locals 10

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lwh/A;->b0()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    invoke-static {v0}, Lwh/j1;->i(LBh/a;)LBh/b0;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v5, Lwh/y0;

    sget-object v6, Lth/k$a;->INSTANCE:Lth/k$a;

    new-instance v7, Lwh/w;

    invoke-direct {v7, v2}, Lwh/w;-><init>(LBh/b0;)V

    invoke-direct {v5, p0, v4, v6, v7}, Lwh/y0;-><init>(Lwh/A;ILth/k$a;Lmh/a;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-interface {v0}, LBh/a;->k0()LBh/b0;

    move-result-object v5

    if-eqz v5, :cond_2

    new-instance v6, Lwh/y0;

    add-int/lit8 v7, v2, 0x1

    sget-object v8, Lth/k$a;->EXTENSION_RECEIVER:Lth/k$a;

    new-instance v9, Lwh/x;

    invoke-direct {v9, v5}, Lwh/x;-><init>(LBh/b0;)V

    invoke-direct {v6, p0, v2, v8, v9}, Lwh/y0;-><init>(Lwh/A;ILth/k$a;Lmh/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v7

    goto :goto_1

    :cond_1
    move v2, v4

    :cond_2
    :goto_1
    invoke-interface {v0}, LBh/a;->i()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_2
    if-ge v4, v5, :cond_3

    new-instance v6, Lwh/y0;

    add-int/lit8 v7, v2, 0x1

    sget-object v8, Lth/k$a;->VALUE:Lth/k$a;

    new-instance v9, Lwh/y;

    invoke-direct {v9, v0, v4}, Lwh/y;-><init>(LBh/b;I)V

    invoke-direct {v6, p0, v2, v8, v9}, Lwh/y0;-><init>(Lwh/A;ILth/k$a;Lmh/a;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    move v2, v7

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lwh/A;->a0()Z

    move-result p0

    if-eqz p0, :cond_4

    instance-of p0, v0, LLh/a;

    if-eqz p0, :cond_4

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    if-le p0, v3, :cond_4

    new-instance p0, Lwh/A$a;

    invoke-direct {p0}, Lwh/A$a;-><init>()V

    invoke-static {v1, p0}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->trimToSize()V

    return-object v1
.end method

.method private static final i(LBh/b0;)LBh/V;
    .locals 0

    return-object p0
.end method

.method private static final k(LBh/b0;)LBh/V;
    .locals 0

    return-object p0
.end method

.method private static final p(LBh/b;I)LBh/V;
    .locals 0

    invoke-interface {p0}, LBh/a;->i()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "get(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LBh/V;

    return-object p0
.end method

.method private static final q(Lwh/A;)Lwh/U0;
    .locals 3

    new-instance v0, Lwh/U0;

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object v1

    invoke-interface {v1}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v2, Lwh/z;

    invoke-direct {v2, p0}, Lwh/z;-><init>(Lwh/A;)V

    invoke-direct {v0, v1, v2}, Lwh/U0;-><init>(Lpi/S;Lmh/a;)V

    return-object v0
.end method

.method private static final u(Lwh/A;)Ljava/lang/reflect/Type;
    .locals 1

    invoke-direct {p0}, Lwh/A;->T()Ljava/lang/reflect/Type;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lwh/A;->V()Lxh/h;

    move-result-object p0

    invoke-interface {p0}, Lxh/h;->getReturnType()Ljava/lang/reflect/Type;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private static final w(Lwh/A;)Ljava/util/List;
    .locals 4

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object v0

    invoke-interface {v0}, LBh/a;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/l0;

    new-instance v3, Lwh/W0;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v3, p0, v2}, Lwh/W0;-><init>(Lwh/X0;LBh/l0;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method static synthetic x(Lwh/A;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lwh/A;->e(Lwh/A;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic z(Lwh/A;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0}, Lwh/A;->f(Lwh/A;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final Q(Ljava/util/Map;Ldh/e;)Ljava/lang/Object;
    .locals 13

    const/4 v0, 0x1

    const-string v1, "args"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwh/A;->getParameters()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lwh/A;->V()Lxh/h;

    move-result-object p1

    invoke-interface {p0}, Lth/c;->isSuspend()Z

    move-result v1

    if-eqz v1, :cond_0

    new-array v0, v0, [Ldh/e;

    aput-object p2, v0, v3

    goto :goto_0

    :cond_0
    new-array v0, v3, [Ldh/e;

    :goto_0
    invoke-interface {p1, v0}, Lxh/h;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lkotlin/reflect/full/IllegalCallableAccessException;

    invoke-direct {p2, p1}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw p2

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p0}, Lth/c;->isSuspend()Z

    move-result v4

    add-int/2addr v2, v4

    invoke-direct {p0}, Lwh/A;->U()[Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p0}, Lth/c;->isSuspend()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    aput-object p2, v4, v5

    :cond_2
    iget-object p2, p0, Lwh/A;->f:LYg/m;

    invoke-interface {p2}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v5, v3

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lth/k;

    if-eqz p2, :cond_4

    invoke-direct {p0, v6}, Lwh/A;->Z(Lth/k;)I

    move-result v7

    goto :goto_2

    :cond_4
    move v7, v0

    :goto_2
    invoke-interface {p1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v6}, Lth/k;->getIndex()I

    move-result v8

    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    aput-object v9, v4, v8

    goto :goto_4

    :cond_5
    invoke-interface {v6}, Lth/k;->S()Z

    move-result v8

    if-eqz v8, :cond_8

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    if-eqz p2, :cond_6

    add-int v8, v5, v7

    move v9, v5

    :goto_3
    if-ge v9, v8, :cond_7

    div-int/lit8 v10, v9, 0x20

    add-int/2addr v10, v2

    aget-object v11, v4, v10

    invoke-static {v11, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    rem-int/lit8 v12, v9, 0x20

    shl-int v12, v0, v12

    or-int/2addr v11, v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v4, v10

    add-int/2addr v9, v0

    goto :goto_3

    :cond_6
    div-int/lit8 v8, v5, 0x20

    add-int/2addr v8, v2

    aget-object v9, v4, v8

    invoke-static {v9, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v3

    rem-int/lit8 v9, v5, 0x20

    shl-int v9, v0, v9

    or-int/2addr v3, v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v8

    :cond_7
    move v3, v0

    goto :goto_4

    :cond_8
    invoke-interface {v6}, Lth/k;->c()Z

    move-result v8

    if-eqz v8, :cond_9

    :goto_4
    invoke-interface {v6}, Lth/k;->h()Lth/k$a;

    move-result-object v6

    sget-object v8, Lth/k$a;->VALUE:Lth/k$a;

    if-ne v6, v8, :cond_3

    add-int/2addr v5, v7

    goto :goto_1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "No argument provided for a required parameter: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    if-nez v3, :cond_b

    :try_start_1
    invoke-virtual {p0}, Lwh/A;->V()Lxh/h;

    move-result-object p1

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const-string v0, "copyOf(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lxh/h;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    new-instance p2, Lkotlin/reflect/full/IllegalCallableAccessException;

    invoke-direct {p2, p1}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw p2

    :cond_b
    invoke-virtual {p0}, Lwh/A;->X()Lxh/h;

    move-result-object p1

    if-eqz p1, :cond_c

    :try_start_2
    invoke-interface {p1, v4}, Lxh/h;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p1

    :catch_2
    move-exception p1

    new-instance p2, Lkotlin/reflect/full/IllegalCallableAccessException;

    invoke-direct {p2, p1}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw p2

    :cond_c
    new-instance p1, Lwh/Y0;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "This callable does not support a default call: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract V()Lxh/h;
.end method

.method public abstract W()Lwh/d0;
.end method

.method public abstract X()Lxh/h;
.end method

.method public abstract Y()LBh/b;
.end method

.method protected final a0()Z
    .locals 2

    invoke-interface {p0}, Lth/c;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<init>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwh/A;->W()Lwh/d0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/internal/h;->b()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract b0()Z
.end method

.method public varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lwh/A;->V()Lxh/h;

    move-result-object v0

    invoke-interface {v0, p1}, Lxh/h;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lkotlin/reflect/full/IllegalCallableAccessException;

    invoke-direct {v0, p1}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw v0
.end method

.method public callBy(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwh/A;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lwh/A;->O(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lwh/A;->Q(Ljava/util/Map;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lwh/A;->a:Lwh/a1$a;

    invoke-virtual {v0}, Lwh/a1$a;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lwh/A;->b:Lwh/a1$a;

    invoke-virtual {v0}, Lwh/a1$a;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getReturnType()Lth/p;
    .locals 2

    iget-object v0, p0, Lwh/A;->c:Lwh/a1$a;

    invoke-virtual {v0}, Lwh/a1$a;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lth/p;

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lwh/A;->d:Lwh/a1$a;

    invoke-virtual {v0}, Lwh/a1$a;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getVisibility()Lth/t;
    .locals 2

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object v0

    invoke-interface {v0}, LBh/C;->getVisibility()LBh/u;

    move-result-object v0

    const-string v1, "getVisibility(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lwh/j1;->r(LBh/u;)Lth/t;

    move-result-object v0

    return-object v0
.end method

.method public isAbstract()Z
    .locals 2

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object v0

    invoke-interface {v0}, LBh/C;->l()LBh/D;

    move-result-object v0

    sget-object v1, LBh/D;->ABSTRACT:LBh/D;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isFinal()Z
    .locals 2

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object v0

    invoke-interface {v0}, LBh/C;->l()LBh/D;

    move-result-object v0

    sget-object v1, LBh/D;->FINAL:LBh/D;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isOpen()Z
    .locals 2

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object v0

    invoke-interface {v0}, LBh/C;->l()LBh/D;

    move-result-object v0

    sget-object v1, LBh/D;->OPEN:LBh/D;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
