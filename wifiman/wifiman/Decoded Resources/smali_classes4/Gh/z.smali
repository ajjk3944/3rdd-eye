.class public final LGh/z;
.super LGh/y;
.source "SourceFile"

# interfaces
.implements LQh/r;


# instance fields
.field private final a:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LGh/y;-><init>()V

    iput-object p1, p0, LGh/z;->a:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public L()Z
    .locals 1

    invoke-interface {p0}, LQh/r;->o()LQh/b;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic S()Ljava/lang/reflect/Member;
    .locals 1

    invoke-virtual {p0}, LGh/z;->U()Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0
.end method

.method public U()Ljava/lang/reflect/Method;
    .locals 1

    iget-object v0, p0, LGh/z;->a:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public V()LGh/E;
    .locals 3

    sget-object v0, LGh/E;->a:LGh/E$a;

    invoke-virtual {p0}, LGh/z;->U()Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "getGenericReturnType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LGh/E$a;->a(Ljava/lang/reflect/Type;)LGh/E;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getReturnType()LQh/x;
    .locals 1

    invoke-virtual {p0}, LGh/z;->V()LGh/E;

    move-result-object v0

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 6

    invoke-virtual {p0}, LGh/z;->U()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    new-instance v5, LGh/F;

    invoke-direct {v5, v4}, LGh/F;-><init>(Ljava/lang/reflect/TypeVariable;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public i()Ljava/util/List;
    .locals 3

    invoke-virtual {p0}, LGh/z;->U()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "getGenericParameterTypes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LGh/z;->U()Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v1

    const-string v2, "getParameterAnnotations(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [[Ljava/lang/annotation/Annotation;

    invoke-virtual {p0}, LGh/z;->U()Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->isVarArgs()Z

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, LGh/y;->T([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public o()LQh/b;
    .locals 3

    invoke-virtual {p0}, LGh/z;->U()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, LGh/h;->b:LGh/h$a;

    invoke-virtual {v2, v0, v1}, LGh/h$a;->a(Ljava/lang/Object;LZh/f;)LGh/h;

    move-result-object v1

    :cond_0
    return-object v1
.end method
