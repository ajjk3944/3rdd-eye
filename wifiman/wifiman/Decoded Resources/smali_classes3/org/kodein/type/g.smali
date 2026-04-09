.class public final Lorg/kodein/type/g;
.super Lorg/kodein/type/e;
.source "SourceFile"


# instance fields
.field private final h:Ljava/lang/reflect/GenericArrayType;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/GenericArrayType;)V
    .locals 1

    const-string/jumbo v0, "jvmType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/kodein/type/e;-><init>()V

    iput-object p1, p0, Lorg/kodein/type/g;->h:Ljava/lang/reflect/GenericArrayType;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()[Lorg/kodein/type/q;
    .locals 3

    invoke-virtual {p0}, Lorg/kodein/type/g;->n()Ljava/lang/reflect/GenericArrayType;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    const-string/jumbo v1, "jvmType.genericComponentType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lorg/kodein/type/q;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public c()Lorg/kodein/type/q;
    .locals 2

    invoke-virtual {p0}, Lorg/kodein/type/g;->n()Ljava/lang/reflect/GenericArrayType;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    const-string/jumbo v1, "jvmType.genericComponentType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    invoke-interface {v0}, Lorg/kodein/type/q;->c()Lorg/kodein/type/q;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/j;->e(Lorg/kodein/type/q;)Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lorg/kodein/type/j;->g(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.TypeToken<T of org.kodein.type.JVMGenericArrayTypeToken>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not get raw array component type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic e()Ljava/lang/reflect/Type;
    .locals 1

    invoke-virtual {p0}, Lorg/kodein/type/g;->n()Ljava/lang/reflect/GenericArrayType;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 2

    invoke-virtual {p0}, Lorg/kodein/type/g;->n()Ljava/lang/reflect/GenericArrayType;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lorg/kodein/type/g;->n()Ljava/lang/reflect/GenericArrayType;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public g()Ljava/util/List;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/lang/reflect/GenericArrayType;
    .locals 1

    iget-object v0, p0, Lorg/kodein/type/g;->h:Ljava/lang/reflect/GenericArrayType;

    return-object v0
.end method
