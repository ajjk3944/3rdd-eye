.class final LFh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LFh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LFh/c;

    invoke-direct {v0}, LFh/c;-><init>()V

    sput-object v0, LFh/c;->a:LFh/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Class;)Ldi/f;
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p1, Ldi/f;

    sget-object v1, LZh/b;->d:LZh/b$a;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->f:LZh/d;

    invoke-virtual {v2}, LZh/d;->l()LZh/c;

    move-result-object v2

    const-string v3, "toSafe(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v1

    invoke-direct {p1, v1, v0}, Ldi/f;-><init>(LZh/b;I)V

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgi/e;->get(Ljava/lang/String;)Lgi/e;

    move-result-object p1

    invoke-virtual {p1}, Lgi/e;->getPrimitiveType()Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object p1

    const-string v1, "getPrimitiveType(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-lez v0, :cond_2

    new-instance v1, Ldi/f;

    sget-object v2, LZh/b;->d:LZh/b$a;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;->getArrayTypeFqName()LZh/c;

    move-result-object p1

    invoke-virtual {v2, p1}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object p1

    add-int/lit8 v0, v0, -0x1

    invoke-direct {v1, p1, v0}, Ldi/f;-><init>(LZh/b;I)V

    return-object v1

    :cond_2
    new-instance v1, Ldi/f;

    sget-object v2, LZh/b;->d:LZh/b$a;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;->getTypeFqName()LZh/c;

    move-result-object p1

    invoke-virtual {v2, p1}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ldi/f;-><init>(LZh/b;I)V

    return-object v1

    :cond_3
    invoke-static {p1}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object p1

    sget-object v1, LAh/c;->a:LAh/c;

    invoke-virtual {p1}, LZh/b;->a()LZh/c;

    move-result-object v2

    invoke-virtual {v1, v2}, LAh/c;->m(LZh/c;)LZh/b;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v1

    :goto_1
    new-instance v1, Ldi/f;

    invoke-direct {v1, p1, v0}, Ldi/f;-><init>(LZh/b;I)V

    return-object v1
.end method

.method private final c(Ljava/lang/Class;LSh/x$d;)V
    .locals 11

    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    sget-object v1, LZh/h;->j:LZh/f;

    sget-object v2, LFh/m;->a:LFh/m;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, LFh/m;->a(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, v2}, LSh/x$d;->a(LZh/f;Ljava/lang/String;)LSh/x$e;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/annotation/Annotation;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v1, v3}, LFh/c;->f(LSh/x$c;Ljava/lang/annotation/Annotation;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    array-length v3, v2

    const/4 v4, 0x0

    if-nez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    if-nez v3, :cond_5

    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    array-length v3, v2

    sub-int/2addr v0, v3

    array-length v3, v2

    :goto_3
    if-ge v4, v3, :cond_5

    aget-object v5, v2, v4

    invoke-static {v5}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/annotation/Annotation;

    invoke-static {v6}, Llh/a;->a(Ljava/lang/annotation/Annotation;)Lth/d;

    move-result-object v7

    invoke-static {v7}, Llh/a;->b(Lth/d;)Ljava/lang/Class;

    move-result-object v7

    add-int v8, v4, v0

    invoke-static {v7}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object v9

    new-instance v10, LFh/b;

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v10, v6}, LFh/b;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-interface {v1, v8, v9, v10}, LSh/x$e;->c(ILZh/b;LBh/g0;)LSh/x$a;

    move-result-object v8

    if-eqz v8, :cond_3

    sget-object v9, LFh/c;->a:LFh/c;

    invoke-direct {v9, v8, v6, v7}, LFh/c;->h(LSh/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    goto :goto_4

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_5
    invoke-interface {v1}, LSh/x$c;->a()V

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method private final d(Ljava/lang/Class;LSh/x$d;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    const-string v2, "identifier(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LFh/m;->a:LFh/m;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, LFh/m;->b(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p2, v1, v2, v3}, LSh/x$d;->b(LZh/f;Ljava/lang/String;Ljava/lang/Object;)LSh/x$c;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/annotation/Annotation;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v1, v2}, LFh/c;->f(LSh/x$c;Ljava/lang/annotation/Annotation;)V

    goto :goto_1

    :cond_1
    invoke-interface {v1}, LSh/x$c;->a()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final e(Ljava/lang/Class;LSh/x$d;)V
    .locals 9

    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    const-string v2, "identifier(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LFh/m;->a:LFh/m;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, LFh/m;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, v2}, LSh/x$d;->a(LZh/f;Ljava/lang/String;)LSh/x$e;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/annotation/Annotation;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v1, v3}, LFh/c;->f(LSh/x$c;Ljava/lang/annotation/Annotation;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v0

    const-string v2, "getParameterAnnotations(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [[Ljava/lang/annotation/Annotation;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_4

    aget-object v4, v0, v3

    invoke-static {v4}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/annotation/Annotation;

    invoke-static {v5}, Llh/a;->a(Ljava/lang/annotation/Annotation;)Lth/d;

    move-result-object v6

    invoke-static {v6}, Llh/a;->b(Lth/d;)Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object v7

    new-instance v8, LFh/b;

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v8, v5}, LFh/b;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-interface {v1, v3, v7, v8}, LSh/x$e;->c(ILZh/b;LBh/g0;)LSh/x$a;

    move-result-object v7

    if-eqz v7, :cond_2

    sget-object v8, LFh/c;->a:LFh/c;

    invoke-direct {v8, v7, v5, v6}, LFh/c;->h(LSh/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    goto :goto_3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    invoke-interface {v1}, LSh/x$c;->a()V

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method private final f(LSh/x$c;Ljava/lang/annotation/Annotation;)V
    .locals 3

    invoke-static {p2}, Llh/a;->a(Ljava/lang/annotation/Annotation;)Lth/d;

    move-result-object v0

    invoke-static {v0}, Llh/a;->b(Lth/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object v1

    new-instance v2, LFh/b;

    invoke-direct {v2, p2}, LFh/b;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-interface {p1, v1, v2}, LSh/x$c;->b(LZh/b;LBh/g0;)LSh/x$a;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v1, LFh/c;->a:LFh/c;

    invoke-direct {v1, p1, p2, v0}, LFh/c;->h(LSh/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method private final g(LSh/x$a;LZh/f;Ljava/lang/Object;)V
    .locals 9

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Class;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "null cannot be cast to non-null type java.lang.Class<*>"

    if-eqz v2, :cond_0

    invoke-static {p3, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Class;

    invoke-direct {p0, p3}, LFh/c;->a(Ljava/lang/Class;)Ldi/f;

    move-result-object p3

    invoke-interface {p1, p2, p3}, LSh/x$a;->b(LZh/f;Ldi/f;)V

    goto/16 :goto_6

    :cond_0
    invoke-static {}, LFh/i;->a()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1, p2, p3}, LSh/x$a;->c(LZh/f;Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    invoke-static {v0}, LGh/f;->l(Ljava/lang/Class;)Z

    move-result v2

    const-string v4, "identifier(...)"

    const-string v5, "null cannot be cast to non-null type kotlin.Enum<*>"

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object v0

    invoke-static {p3, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Enum;

    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p3

    invoke-static {p3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2, v0, p3}, LSh/x$a;->e(LZh/f;LZh/b;LZh/f;)V

    goto/16 :goto_6

    :cond_3
    const-class v2, Ljava/lang/annotation/Annotation;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    const-string v7, "null cannot be cast to non-null type kotlin.Annotation"

    if-eqz v6, :cond_5

    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInterfaces(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/n;->Q0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object v1

    invoke-interface {p1, p2, v1}, LSh/x$a;->f(LZh/f;LZh/b;)LSh/x$a;

    move-result-object p1

    if-nez p1, :cond_4

    return-void

    :cond_4
    invoke-static {p3, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/annotation/Annotation;

    invoke-direct {p0, p1, p3, v0}, LFh/c;->h(LSh/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    goto/16 :goto_6

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {p1, p2}, LSh/x$a;->d(LZh/f;)LSh/x$b;

    move-result-object p1

    if-nez p1, :cond_6

    return-void

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    const/4 v6, 0x0

    const-string v8, "null cannot be cast to non-null type kotlin.Array<*>"

    if-eqz v0, :cond_7

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p2}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object p2

    invoke-static {p3, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Object;

    array-length v0, p3

    :goto_1
    if-ge v6, v0, :cond_b

    aget-object v1, p3, v6

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Enum;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2, v1}, LSh/x$b;->c(LZh/b;LZh/f;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_7
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p3, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Object;

    array-length p2, p3

    :goto_2
    if-ge v6, p2, :cond_b

    aget-object v0, p3, v6

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Class;

    invoke-direct {p0, v0}, LFh/c;->a(Ljava/lang/Class;)Ldi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LSh/x$b;->b(Ldi/f;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_8
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p3, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Object;

    array-length v0, p3

    :goto_3
    if-ge v6, v0, :cond_b

    aget-object v1, p3, v6

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p2}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object v2

    invoke-interface {p1, v2}, LSh/x$b;->e(LZh/b;)LSh/x$a;

    move-result-object v2

    if-nez v2, :cond_9

    goto :goto_4

    :cond_9
    invoke-static {v1, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/annotation/Annotation;

    invoke-direct {p0, v2, v1, p2}, LFh/c;->h(LSh/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_a
    invoke-static {p3, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Object;

    array-length p2, p3

    :goto_5
    if-ge v6, p2, :cond_b

    aget-object v0, p3, v6

    invoke-interface {p1, v0}, LSh/x$b;->d(Ljava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_b
    invoke-interface {p1}, LSh/x$b;->a()V

    :goto_6
    return-void

    :cond_c
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported annotation argument value ("

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "): "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final h(LSh/x$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V
    .locals 3

    invoke-virtual {p3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p3

    :catch_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    const-string v2, "identifier(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, v1}, LFh/c;->g(LSh/x$a;LZh/f;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LSh/x$a;->a()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Class;LSh/x$c;)V
    .locals 1

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visitor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/annotation/Annotation;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p2, v0}, LFh/c;->f(LSh/x$c;Ljava/lang/annotation/Annotation;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LSh/x$c;->a()V

    return-void
.end method

.method public final i(Ljava/lang/Class;LSh/x$d;)V
    .locals 1

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberVisitor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LFh/c;->e(Ljava/lang/Class;LSh/x$d;)V

    invoke-direct {p0, p1, p2}, LFh/c;->c(Ljava/lang/Class;LSh/x$d;)V

    invoke-direct {p0, p1, p2}, LFh/c;->d(Ljava/lang/Class;LSh/x$d;)V

    return-void
.end method
