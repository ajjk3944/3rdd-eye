.class public final LGh/q;
.super LGh/u;
.source "SourceFile"

# interfaces
.implements LGh/j;
.implements LGh/A;
.implements LQh/g;


# instance fields
.field private final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LGh/u;-><init>()V

    iput-object p1, p0, LGh/q;->a:Ljava/lang/Class;

    return-void
.end method

.method private static final R(Ljava/lang/Class;)Z
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getSimpleName(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final S(Ljava/lang/Class;)LZh/f;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LZh/f;->l(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method private static final T(LGh/q;Ljava/lang/reflect/Method;)Z
    .locals 3

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->isSynthetic()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LGh/q;->A()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, LGh/q;->d0(Ljava/lang/reflect/Method;)Z

    move-result p0

    if-nez p0, :cond_2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method static synthetic U(Ljava/lang/Class;)Z
    .locals 0

    invoke-static {p0}, LGh/q;->R(Ljava/lang/Class;)Z

    move-result p0

    return p0
.end method

.method static synthetic V(Ljava/lang/Class;)LZh/f;
    .locals 0

    invoke-static {p0}, LGh/q;->S(Ljava/lang/Class;)LZh/f;

    move-result-object p0

    return-object p0
.end method

.method static synthetic W(LGh/q;Ljava/lang/reflect/Method;)Z
    .locals 0

    invoke-static {p0, p1}, LGh/q;->T(LGh/q;Ljava/lang/reflect/Method;)Z

    move-result p0

    return p0
.end method

.method private final d0(Ljava/lang/reflect/Method;)Z
    .locals 3

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getParameterTypes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    if-nez p1, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const-string v1, "valueOf"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    :cond_1
    :goto_0
    return v2
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic C()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LGh/q;->Z()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public D()I
    .locals 1

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    return v0
.end method

.method public E()Z
    .locals 2

    sget-object v0, LGh/b;->a:LGh/b;

    iget-object v1, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LGh/b;->f(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public H()Z
    .locals 1

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    return v0
.end method

.method public I()LQh/D;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic K()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LGh/q;->a0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public bridge synthetic M()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LGh/q;->b0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public N()Lzi/j;
    .locals 6

    sget-object v0, LGh/b;->a:LGh/b;

    iget-object v1, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LGh/b;->c(Ljava/lang/Class;)[Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    new-instance v5, LGh/s;

    invoke-direct {v5, v4}, LGh/s;-><init>(Ljava/lang/reflect/Type;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lzi/m;->i()Lzi/j;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public Q()Z
    .locals 1

    invoke-interface {p0}, LGh/A;->D()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    return v0
.end method

.method public X()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const-string v1, "getDeclaredConstructors(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/n;->Q([Ljava/lang/Object;)Lzi/j;

    move-result-object v0

    sget-object v1, LGh/q$a;->a:LGh/q$a;

    invoke-static {v0, v1}, Lzi/m;->D(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    sget-object v1, LGh/q$b;->a:LGh/q$b;

    invoke-static {v0, v1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public Y()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public Z()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-string v1, "getDeclaredFields(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/n;->Q([Ljava/lang/Object;)Lzi/j;

    move-result-object v0

    sget-object v1, LGh/q$c;->a:LGh/q$c;

    invoke-static {v0, v1}, Lzi/m;->D(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    sget-object v1, LGh/q$d;->a:LGh/q$d;

    invoke-static {v0, v1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a()Ljava/util/Collection;
    .locals 4

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/jvm/internal/T;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lkotlin/jvm/internal/T;-><init>(I)V

    iget-object v2, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/T;->a(Ljava/lang/Object;)V

    iget-object v1, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/T;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lkotlin/jvm/internal/T;->c()I

    move-result v1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/T;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Type;

    new-instance v3, LGh/s;

    invoke-direct {v3, v2}, LGh/s;-><init>(Ljava/lang/reflect/Type;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method public a0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getDeclaredClasses(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/n;->Q([Ljava/lang/Object;)Lzi/j;

    move-result-object v0

    sget-object v1, LGh/n;->a:LGh/n;

    invoke-static {v0, v1}, Lzi/m;->D(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    sget-object v1, LGh/o;->a:LGh/o;

    invoke-static {v0, v1}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v1, "getDeclaredMethods(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/n;->Q([Ljava/lang/Object;)Lzi/j;

    move-result-object v0

    new-instance v1, LGh/p;

    invoke-direct {v1, p0}, LGh/p;-><init>(LGh/q;)V

    invoke-static {v0, v1}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    sget-object v1, LGh/q$e;->a:LGh/q$e;

    invoke-static {v0, v1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c0()LGh/q;
    .locals 2

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LGh/q;

    invoke-direct {v1, v0}, LGh/q;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public e()LZh/c;
    .locals 1

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-static {v0}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object v0

    invoke-virtual {v0}, LZh/b;->a()LZh/c;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LGh/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    check-cast p1, LGh/q;

    iget-object p1, p1, LGh/q;->a:Ljava/lang/Class;

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

.method public bridge synthetic f()LQh/g;
    .locals 1

    invoke-virtual {p0}, LGh/q;->c0()LGh/q;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/Collection;
    .locals 6

    sget-object v0, LGh/b;->a:LGh/b;

    iget-object v1, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LGh/b;->d(Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array v0, v1, [Ljava/lang/Object;

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v4, v0, v1

    new-instance v5, LGh/D;

    invoke-direct {v5, v4}, LGh/D;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public bridge synthetic getAnnotations()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-interface {p0}, LGh/j;->getAnnotations()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1

    .line 2
    invoke-interface {p0}, LGh/j;->v()Ljava/lang/reflect/AnnotatedElement;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LGh/k;->b([Ljava/lang/annotation/Annotation;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getName()LZh/f;
    .locals 4

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "."

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lkotlin/text/t;->h1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 6

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

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

.method public getVisibility()LBh/w0;
    .locals 2

    invoke-interface {p0}, LGh/A;->D()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, LBh/v0$h;->c:LBh/v0$h;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, LBh/v0$e;->c:LBh/v0$e;

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LEh/c;->c:LEh/c;

    goto :goto_0

    :cond_2
    sget-object v0, LEh/b;->c:LEh/b;

    goto :goto_0

    :cond_3
    sget-object v0, LEh/a;->c:LEh/a;

    :goto_0
    return-object v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isAbstract()Z
    .locals 1

    invoke-interface {p0}, LGh/A;->D()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    return v0
.end method

.method public isFinal()Z
    .locals 1

    invoke-interface {p0}, LGh/A;->D()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v0

    return v0
.end method

.method public l(LZh/c;)LGh/g;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p0}, LGh/j;->v()Ljava/lang/reflect/AnnotatedElement;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, LGh/k;->a([Ljava/lang/annotation/Annotation;LZh/c;)LGh/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(LZh/c;)LQh/a;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LGh/j;->l(LZh/c;)LGh/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LGh/q;->X()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    return v0
.end method

.method public p()Z
    .locals 2

    sget-object v0, LGh/b;->a:LGh/b;

    iget-object v1, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LGh/b;->e(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, LGh/q;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LGh/q;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Ljava/lang/reflect/AnnotatedElement;
    .locals 1

    invoke-virtual {p0}, LGh/q;->Y()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method
