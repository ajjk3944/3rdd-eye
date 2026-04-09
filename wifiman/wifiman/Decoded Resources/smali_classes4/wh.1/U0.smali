.class public final Lwh/U0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/U0$a;
    }
.end annotation


# static fields
.field static final synthetic e:[Lth/l;


# instance fields
.field private final a:Lpi/S;

.field private final b:Lwh/a1$a;

.field private final c:Lwh/a1$a;

.field private final d:Lwh/a1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lwh/U0;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "classifier"

    const-string v4, "getClassifier()Lkotlin/reflect/KClassifier;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v3, "arguments"

    const-string v4, "getArguments()Ljava/util/List;"

    invoke-direct {v2, v1, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lwh/U0;->e:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lpi/S;Lmh/a;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwh/U0;->a:Lpi/S;

    .line 3
    instance-of p1, p2, Lwh/a1$a;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Lwh/a1$a;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    if-eqz p2, :cond_2

    invoke-static {p2}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, p1

    :cond_2
    :goto_1
    iput-object v0, p0, Lwh/U0;->b:Lwh/a1$a;

    .line 4
    new-instance p1, Lwh/Q0;

    invoke-direct {p1, p0}, Lwh/Q0;-><init>(Lwh/U0;)V

    invoke-static {p1}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object p1

    iput-object p1, p0, Lwh/U0;->c:Lwh/a1$a;

    .line 5
    new-instance p1, Lwh/R0;

    invoke-direct {p1, p0, p2}, Lwh/R0;-><init>(Lwh/U0;Lmh/a;)V

    invoke-static {p1}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object p1

    iput-object p1, p0, Lwh/U0;->d:Lwh/a1$a;

    return-void
.end method

.method public synthetic constructor <init>(Lpi/S;Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lwh/U0;-><init>(Lpi/S;Lmh/a;)V

    return-void
.end method

.method static synthetic a(Lwh/U0;)Lth/e;
    .locals 0

    invoke-static {p0}, Lwh/U0;->q(Lwh/U0;)Lth/e;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lwh/U0;Lmh/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lwh/U0;->i(Lwh/U0;Lmh/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lwh/U0;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lwh/U0;->k(Lwh/U0;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lwh/U0;ILYg/m;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-static {p0, p1, p2}, Lwh/U0;->p(Lwh/U0;ILYg/m;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lwh/U0;Lmh/a;)Ljava/util/List;
    .locals 9

    iget-object v0, p0, Lwh/U0;->a:Lpi/S;

    invoke-virtual {v0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v1, LYg/q;->PUBLICATION:LYg/q;

    new-instance v2, Lwh/S0;

    invoke-direct {v2, p0}, Lwh/S0;-><init>(Lwh/U0;)V

    invoke-static {v1, v2}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_1

    invoke-static {}, LZg/v;->v()V

    :cond_1
    check-cast v4, Lpi/B0;

    invoke-interface {v4}, Lpi/B0;->c()Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v3, Lth/r;->c:Lth/r$a;

    invoke-virtual {v3}, Lth/r$a;->c()Lth/r;

    move-result-object v3

    goto :goto_2

    :cond_2
    new-instance v6, Lwh/U0;

    invoke-interface {v4}, Lpi/B0;->getType()Lpi/S;

    move-result-object v7

    const-string v8, "getType(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_3

    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    new-instance v8, Lwh/T0;

    invoke-direct {v8, p0, v3, v1}, Lwh/T0;-><init>(Lwh/U0;ILYg/m;)V

    move-object v3, v8

    :goto_1
    invoke-direct {v6, v7, v3}, Lwh/U0;-><init>(Lpi/S;Lmh/a;)V

    invoke-interface {v4}, Lpi/B0;->a()Lpi/N0;

    move-result-object v3

    sget-object v4, Lwh/U0$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_6

    const/4 v4, 0x2

    if-eq v3, v4, :cond_5

    const/4 v4, 0x3

    if-ne v3, v4, :cond_4

    sget-object v3, Lth/r;->c:Lth/r$a;

    invoke-virtual {v3, v6}, Lth/r$a;->b(Lth/p;)Lth/r;

    move-result-object v3

    goto :goto_2

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    sget-object v3, Lth/r;->c:Lth/r$a;

    invoke-virtual {v3, v6}, Lth/r$a;->a(Lth/p;)Lth/r;

    move-result-object v3

    goto :goto_2

    :cond_6
    sget-object v3, Lth/r;->c:Lth/r$a;

    invoke-virtual {v3, v6}, Lth/r$a;->d(Lth/p;)Lth/r;

    move-result-object v3

    :goto_2
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v3, v5

    goto :goto_0

    :cond_7
    return-object v2
.end method

.method private static final k(Lwh/U0;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lwh/U0;->E()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p0}, LGh/f;->h(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final m(LYg/m;)Ljava/util/List;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final p(Lwh/U0;ILYg/m;)Ljava/lang/reflect/Type;
    .locals 2

    invoke-virtual {p0}, Lwh/U0;->E()Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-class p0, Ljava/lang/Object;

    :goto_0
    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    instance-of v1, v0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v1, :cond_3

    if-nez p1, :cond_2

    check-cast v0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    new-instance p1, Lwh/Y0;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Array type has been queried for a non-0th argument: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_6

    invoke-static {p2}, Lwh/U0;->m(LYg/m;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/reflect/Type;

    instance-of p1, p0, Ljava/lang/reflect/WildcardType;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    check-cast p0, Ljava/lang/reflect/WildcardType;

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object p1

    const-string p2, "getLowerBounds(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/n;->a0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/Type;

    if-nez p1, :cond_5

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    const-string p1, "getUpperBounds(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LZg/n;->Z([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/reflect/Type;

    goto :goto_1

    :cond_5
    move-object p0, p1

    :goto_1
    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_2
    return-object p0

    :cond_6
    new-instance p1, Lwh/Y0;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Non-generic type has been queried for arguments: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final q(Lwh/U0;)Lth/e;
    .locals 1

    iget-object v0, p0, Lwh/U0;->a:Lpi/S;

    invoke-direct {p0, v0}, Lwh/U0;->s(Lpi/S;)Lth/e;

    move-result-object p0

    return-object p0
.end method

.method private final s(Lpi/S;)Lth/e;
    .locals 3

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    instance-of v1, v0, LBh/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    check-cast v0, LBh/e;

    invoke-static {v0}, Lwh/j1;->q(LBh/e;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lpi/S;->L0()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->T0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpi/B0;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lpi/B0;->getType()Lpi/S;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lwh/U0;->s(Lpi/S;)Lth/e;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Lwh/X;

    invoke-static {p1}, Lvh/b;->a(Lth/e;)Lth/d;

    move-result-object p1

    invoke-static {p1}, Llh/a;->b(Lth/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lwh/j1;->f(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1}, Lwh/X;-><init>(Ljava/lang/Class;)V

    return-object v0

    :cond_2
    new-instance p1, Lwh/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot determine classifier for array element type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    new-instance p1, Lwh/X;

    invoke-direct {p1, v0}, Lwh/X;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_4
    invoke-static {p1}, Lpi/J0;->l(Lpi/S;)Z

    move-result p1

    if-nez p1, :cond_6

    new-instance p1, Lwh/X;

    invoke-static {v0}, LGh/f;->i(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    move-object v0, v1

    :goto_1
    invoke-direct {p1, v0}, Lwh/X;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_6
    new-instance p1, Lwh/X;

    invoke-direct {p1, v0}, Lwh/X;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_7
    instance-of p1, v0, LBh/l0;

    if-eqz p1, :cond_8

    new-instance p1, Lwh/W0;

    check-cast v0, LBh/l0;

    invoke-direct {p1, v2, v0}, Lwh/W0;-><init>(Lwh/X0;LBh/l0;)V

    return-object p1

    :cond_8
    instance-of p1, v0, LBh/k0;

    if-nez p1, :cond_9

    return-object v2

    :cond_9
    new-instance p1, LYg/r;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Type alias classifiers are not yet supported"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, LYg/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public E()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lwh/U0;->b:Lwh/a1$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lwh/a1$a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lwh/U0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwh/U0;->a:Lpi/S;

    check-cast p1, Lwh/U0;

    iget-object v1, p1, Lwh/U0;->a:Lpi/S;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwh/U0;->r()Lth/e;

    move-result-object v0

    invoke-virtual {p1}, Lwh/U0;->r()Lth/e;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwh/U0;->j()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lwh/U0;->j()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lwh/U0;->a:Lpi/S;

    invoke-virtual {v0}, Lpi/S;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lwh/U0;->r()Lth/e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lwh/U0;->j()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public j()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lwh/U0;->d:Lwh/a1$a;

    sget-object v1, Lwh/U0;->e:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lwh/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public r()Lth/e;
    .locals 3

    iget-object v0, p0, Lwh/U0;->c:Lwh/a1$a;

    sget-object v1, Lwh/U0;->e:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lwh/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lth/e;

    return-object v0
.end method

.method public t()Z
    .locals 1

    iget-object v0, p0, Lwh/U0;->a:Lpi/S;

    invoke-virtual {v0}, Lpi/S;->O0()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lwh/e1;->a:Lwh/e1;

    iget-object v1, p0, Lwh/U0;->a:Lpi/S;

    invoke-virtual {v0, v1}, Lwh/e1;->l(Lpi/S;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lpi/S;
    .locals 1

    iget-object v0, p0, Lwh/U0;->a:Lpi/S;

    return-object v0
.end method
