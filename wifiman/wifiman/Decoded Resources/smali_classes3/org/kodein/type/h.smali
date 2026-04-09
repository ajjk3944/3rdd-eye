.class public final Lorg/kodein/type/h;
.super Lorg/kodein/type/e;
.source "SourceFile"


# instance fields
.field private final h:Ljava/lang/reflect/ParameterizedType;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/ParameterizedType;)V
    .locals 1

    const-string/jumbo v0, "jvmType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/kodein/type/e;-><init>()V

    iput-object p1, p0, Lorg/kodein/type/h;->h:Ljava/lang/reflect/ParameterizedType;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()[Lorg/kodein/type/q;
    .locals 7

    invoke-virtual {p0}, Lorg/kodein/type/h;->n()Ljava/lang/reflect/ParameterizedType;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string/jumbo v1, "jvmType.actualTypeArguments"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v0, v4

    const-string/jumbo v6, "it"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-array v0, v3, [Lorg/kodein/type/q;

    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/kodein/type/q;

    return-object v0
.end method

.method public c()Lorg/kodein/type/q;
    .locals 2

    new-instance v0, Lorg/kodein/type/f;

    invoke-virtual {p0}, Lorg/kodein/type/h;->n()Ljava/lang/reflect/ParameterizedType;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/j;->f(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/kodein/type/f;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public bridge synthetic e()Ljava/lang/reflect/Type;
    .locals 1

    invoke-virtual {p0}, Lorg/kodein/type/h;->n()Ljava/lang/reflect/ParameterizedType;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 12

    invoke-virtual {p0}, Lorg/kodein/type/h;->n()Ljava/lang/reflect/ParameterizedType;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/j;->f(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v0

    const-string/jumbo v1, "jvmType.rawClass.typeParameters"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v5, v0, v3

    add-int/lit8 v6, v4, 0x1

    invoke-virtual {p0}, Lorg/kodein/type/h;->n()Ljava/lang/reflect/ParameterizedType;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v7

    aget-object v4, v7, v4

    const-class v7, Ljava/lang/Object;

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    instance-of v7, v4, Ljava/lang/reflect/WildcardType;

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object v5

    const-string/jumbo v7, "variable.bounds"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v5

    move v8, v2

    :goto_1
    if-ge v8, v7, :cond_2

    aget-object v9, v5, v8

    move-object v10, v4

    check-cast v10, Ljava/lang/reflect/WildcardType;

    invoke-interface {v10}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v10

    const-string/jumbo v11, "argument.upperBounds"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v9}, LZg/n;->U([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    move v4, v6

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public g()Ljava/util/List;
    .locals 11

    invoke-virtual {p0}, Lorg/kodein/type/h;->n()Ljava/lang/reflect/ParameterizedType;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/j;->f(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lorg/kodein/type/h;->n()Ljava/lang/reflect/ParameterizedType;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/j;->f(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_2

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lorg/kodein/type/h;->n()Ljava/lang/reflect/ParameterizedType;

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lorg/kodein/type/j;->j(Ljava/lang/reflect/ParameterizedType;Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;[Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :cond_3
    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p0}, Lorg/kodein/type/h;->n()Ljava/lang/reflect/ParameterizedType;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/j;->f(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v1

    const-string/jumbo v2, "jvmType.rawClass.genericInterfaces"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v1

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_4

    aget-object v6, v1, v4

    invoke-virtual {p0}, Lorg/kodein/type/h;->n()Ljava/lang/reflect/ParameterizedType;

    move-result-object v5

    const-string/jumbo v7, "it"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lorg/kodein/type/j;->j(Ljava/lang/reflect/ParameterizedType;Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;[Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    invoke-static {v0, v2}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/lang/reflect/ParameterizedType;
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/h;->h:Ljava/lang/reflect/ParameterizedType;

    return-object v0
.end method
