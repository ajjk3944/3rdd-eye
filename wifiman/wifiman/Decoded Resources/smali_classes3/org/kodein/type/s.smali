.class public abstract Lorg/kodein/type/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Byte;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Character;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v4

    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Short;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Integer;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v6

    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Long;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v7

    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Float;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v8

    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/lang/Double;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v9

    filled-new-array/range {v2 .. v9}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lorg/kodein/type/s;->a:Ljava/util/Map;

    return-void
.end method

.method public static final a(Ljava/lang/Class;)Lorg/kodein/type/q;
    .locals 1

    const-string/jumbo v0, "jCls"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/type/f;

    invoke-direct {v0, p0}, Lorg/kodein/type/f;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public static final b(Lth/d;)Lorg/kodein/type/q;
    .locals 1

    const-string/jumbo v0, "cls"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/type/f;

    invoke-static {p0}, Llh/a;->c(Lth/d;)Ljava/lang/Class;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/kodein/type/f;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public static final c(Ljava/lang/Object;)Lorg/kodein/type/q;
    .locals 1

    const-string/jumbo v0, "obj"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/type/f;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/kodein/type/f;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method private static final d(Ljava/lang/reflect/Type;)Z
    .locals 7

    instance-of v0, p0, Ljava/lang/Class;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    const-string/jumbo v2, "it"

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    const-string/jumbo v0, "actualTypeArguments"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_8

    aget-object v5, p0, v4

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lorg/kodein/type/s;->d(Ljava/lang/reflect/Type;)Z

    move-result v5

    if-nez v5, :cond_1

    :goto_1
    move v1, v3

    goto :goto_5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p0

    const-string/jumbo v0, "genericComponentType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lorg/kodein/type/s;->d(Ljava/lang/reflect/Type;)Z

    move-result v1

    goto :goto_5

    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_7

    check-cast p0, Ljava/lang/reflect/WildcardType;

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string/jumbo v4, "lowerBounds"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v0

    move v5, v3

    :goto_2
    if-ge v5, v4, :cond_5

    aget-object v6, v0, v5

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lorg/kodein/type/s;->d(Ljava/lang/reflect/Type;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    const-string/jumbo v0, "upperBounds"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    move v4, v3

    :goto_3
    if-ge v4, v0, :cond_8

    aget-object v5, p0, v4

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lorg/kodein/type/s;->d(Ljava/lang/reflect/Type;)Z

    move-result v5

    if-nez v5, :cond_6

    :goto_4
    goto :goto_1

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_9

    goto :goto_1

    :cond_8
    :goto_5
    return v1

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unknown type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;
    .locals 4

    const-string/jumbo v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lorg/kodein/type/j;->h(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/kodein/type/f;

    check-cast p0, Ljava/lang/Class;

    invoke-direct {v0, p0}, Lorg/kodein/type/f;-><init>(Ljava/lang/Class;)V

    goto/16 :goto_1

    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0}, Lorg/kodein/type/s;->d(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p0, Lorg/kodein/type/h;

    invoke-direct {p0, v0}, Lorg/kodein/type/h;-><init>(Ljava/lang/reflect/ParameterizedType;)V

    :goto_0
    move-object v0, p0

    goto/16 :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot create TypeToken for non fully reified type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_6

    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    const-string/jumbo v1, "k.genericComponentType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    invoke-interface {v0}, Lorg/kodein/type/q;->c()Lorg/kodein/type/q;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/j;->e(Lorg/kodein/type/q;)Ljava/lang/reflect/Type;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type java.lang.Class<*>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance p0, Lorg/kodein/type/f;

    invoke-static {v1}, Lorg/kodein/type/j;->g(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/kodein/type/f;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Lorg/kodein/type/q;->a()Z

    move-result v3

    if-nez v3, :cond_4

    new-instance p0, Lorg/kodein/type/f;

    invoke-static {v1}, Lorg/kodein/type/j;->g(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/kodein/type/f;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_4
    invoke-interface {v0}, Lorg/kodein/type/q;->a()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Lorg/kodein/type/q;->f()Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance p0, Lorg/kodein/type/f;

    invoke-interface {v0}, Lorg/kodein/type/q;->c()Lorg/kodein/type/q;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/j;->e(Lorg/kodein/type/q;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, Lorg/kodein/type/j;->g(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/kodein/type/f;-><init>(Ljava/lang/Class;)V

    goto/16 :goto_0

    :cond_5
    new-instance v0, Lorg/kodein/type/g;

    invoke-direct {v0, p0}, Lorg/kodein/type/g;-><init>(Ljava/lang/reflect/GenericArrayType;)V

    goto :goto_1

    :cond_6
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_7

    check-cast p0, Ljava/lang/reflect/WildcardType;

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    const-string/jumbo v0, "k.upperBounds[0]"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    goto :goto_1

    :cond_7
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_8

    check-cast p0, Ljava/lang/reflect/TypeVariable;

    invoke-static {p0}, Lorg/kodein/type/j;->d(Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_8
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unsupported type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
