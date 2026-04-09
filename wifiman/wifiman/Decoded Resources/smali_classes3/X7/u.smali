.class public abstract LX7/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Luj/j;)Landroid/content/res/Resources;
    .locals 0

    invoke-static {p0}, LX7/u;->g(Luj/j;)Landroid/content/res/Resources;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luj/j;)LT7/d;
    .locals 0

    invoke-static {p0}, LX7/u;->i(Luj/j;)LT7/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Luj/j;)LT7/a;
    .locals 0

    invoke-static {p0}, LX7/u;->h(Luj/j;)LT7/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/app/Application;Lorg/kodein/di/DI$b;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LX7/u;->f(Landroid/app/Application;Lorg/kodein/di/DI$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroid/app/Application;)Lorg/kodein/di/DI$g;
    .locals 8

    const-string/jumbo v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/di/DI$g;

    new-instance v5, LX7/q;

    invoke-direct {v5, p0}, LX7/q;-><init>(Landroid/app/Application;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string/jumbo v2, "application"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lorg/kodein/di/DI$g;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final f(Landroid/app/Application;Lorg/kodein/di/DI$b;)LYg/J;
    .locals 12

    const-string v0, "$this$Module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LX7/u$a;

    invoke-direct {v1}, LX7/u$a;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Landroid/content/Context;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v3, Luj/h;

    new-instance v4, Lorg/kodein/type/d;

    new-instance v5, LX7/u$e;

    invoke-direct {v5}, LX7/u$e;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Landroid/app/Application;

    invoke-direct {v4, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v3, v4, p0}, Luj/h;-><init>(Lorg/kodein/type/q;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance p0, Lorg/kodein/type/d;

    new-instance v0, LX7/u$b;

    invoke-direct {v0}, LX7/u$b;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Landroid/content/res/Resources;

    invoke-direct {p0, v0, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object p0

    new-instance v0, LX7/r;

    invoke-direct {v0}, LX7/r;-><init>()V

    new-instance v4, Luj/n;

    invoke-interface {p1}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LX7/u$f;

    invoke-direct {v7}, LX7/u$f;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v7, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v0}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {p0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance p0, Lorg/kodein/type/d;

    new-instance v0, LX7/u$c;

    invoke-direct {v0}, LX7/u$c;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LT7/a;

    invoke-direct {p0, v0, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object p0

    new-instance v11, LX7/s;

    invoke-direct {v11}, LX7/s;-><init>()V

    new-instance v0, Luj/u;

    invoke-interface {p1}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface {p1}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {p1}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LX7/u$g;

    invoke-direct {v4}, LX7/u$g;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v4, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v0

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {p0, v0}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance p0, Lorg/kodein/type/d;

    new-instance v0, LX7/u$d;

    invoke-direct {v0}, LX7/u$d;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LT7/d;

    invoke-direct {p0, v0, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, p0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object p0

    new-instance v11, LX7/t;

    invoke-direct {v11}, LX7/t;-><init>()V

    new-instance v0, Luj/u;

    invoke-interface {p1}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface {p1}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {p1}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LX7/u$h;

    invoke-direct {v4}, LX7/u$h;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v4, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    move-object v4, v0

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {p0, v0}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    invoke-static {}, LX7/p;->g()Lorg/kodein/di/DI$g;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {p1, p0, v0, v2, v1}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LX7/l;->w()Lorg/kodein/di/DI$g;

    move-result-object p0

    invoke-static {p1, p0, v0, v2, v1}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Ldc/f;->i()Lorg/kodein/di/DI$g;

    move-result-object p0

    invoke-static {p1, p0, v0, v2, v1}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LP7/p;->o()Lorg/kodein/di/DI$g;

    move-result-object p0

    invoke-static {p1, p0, v0, v2, v1}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lcom/ubnt/usurvey/product/f;->k()Lorg/kodein/di/DI$g;

    move-result-object p0

    invoke-static {p1, p0, v0, v2, v1}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LY7/e;->e()Lorg/kodein/di/DI$g;

    move-result-object p0

    invoke-static {p1, p0, v0, v2, v1}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Ld8/e;->e()Lorg/kodein/di/DI$g;

    move-result-object p0

    invoke-static {p1, p0, v0, v2, v1}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lve/f;->g()Lorg/kodein/di/DI$g;

    move-result-object p0

    invoke-static {p1, p0, v0, v2, v1}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Ljc/b;->c()Lorg/kodein/di/DI$g;

    move-result-object p0

    invoke-static {p1, p0, v0, v2, v1}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lf8/g1;->k3()Lorg/kodein/di/DI$g;

    move-result-object p0

    invoke-static {p1, p0, v0, v2, v1}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Luj/j;)Landroid/content/res/Resources;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LX7/u$i;

    invoke-direct {v1}, LX7/u$i;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Luj/j;)LT7/a;
    .locals 1

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LT7/a;->b:LT7/a$a;

    invoke-virtual {p0}, LT7/a$a;->a()LT7/a;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Luj/j;)LT7/d;
    .locals 1

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LT7/d;->a:LT7/d$a;

    invoke-virtual {p0}, LT7/d$a;->a()LT7/d;

    move-result-object p0

    return-object p0
.end method
