.class public abstract LLd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/kodein/di/DI$g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lorg/kodein/di/DI$g;

    new-instance v4, LLd/a;

    invoke-direct {v4}, LLd/a;-><init>()V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, "model.ubiquiti"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/kodein/di/DI$g;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, LLd/c;->a:Lorg/kodein/di/DI$g;

    return-void
.end method

.method public static synthetic a(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LLd/c;->c(Lorg/kodein/di/DI$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luj/j;)LLd/h;
    .locals 0

    invoke-static {p0}, LLd/c;->d(Luj/j;)LLd/h;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 11

    const-string v0, "$this$Module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LMd/f;->k()Lorg/kodein/di/DI$g;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LQd/d;->g()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LXd/e;->g()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LWd/c;->e()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LLd/c$a;

    invoke-direct {v1}, LLd/c$a;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LLd/f;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, LLd/b;

    invoke-direct {v10}, LLd/b;-><init>()V

    new-instance v1, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance p0, LLd/c$b;

    invoke-direct {p0}, LLd/c$b;-><init>()V

    invoke-virtual {p0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LLd/h;

    invoke-direct {v7, p0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v1}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final d(Luj/j;)LLd/h;
    .locals 12

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LLd/h;

    invoke-interface {p0}, Lrj/o2;->d()Lorg/kodein/di/DI;

    move-result-object v2

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, LLd/c$c;

    invoke-direct {v4}, LLd/c$c;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Landroid/content/Context;

    invoke-direct {v3, v4, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v4, 0x0

    invoke-interface {v1, v3, v4}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/content/Context;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LLd/c$d;

    invoke-direct {v7}, LLd/c$d;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Ldc/a;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v1, v6, v4}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ldc/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, LLd/c$e;

    invoke-direct {v8}, LLd/c$e;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    invoke-direct {v7, v8, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v1, v7, v4}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v8, Lorg/kodein/type/d;

    new-instance v9, LLd/c$f;

    invoke-direct {v9}, LLd/c$f;-><init>()V

    invoke-virtual {v9}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v9

    invoke-static {v9}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v9

    invoke-static {v9, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v10, LQd/e;

    invoke-direct {v8, v9, v10}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v1, v8, v4}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, LQd/e;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v9, Lorg/kodein/type/d;

    new-instance v10, LLd/c$g;

    invoke-direct {v10}, LLd/c$g;-><init>()V

    invoke-virtual {v10}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-static {v10}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v11, LZc/f;

    invoke-direct {v9, v10, v11}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v1, v9, v4}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, LZc/f;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v10, LLd/c$h;

    invoke-direct {v10}, LLd/c$h;-><init>()V

    invoke-virtual {v10}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-static {v10}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lfe/u;

    invoke-direct {v1, v10, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v1, v4}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfe/u;

    move-object v1, v0

    move-object v4, v6

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, p0

    invoke-direct/range {v1 .. v8}, LLd/h;-><init>(Lorg/kodein/di/DI;Landroid/content/Context;Ldc/a;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;LQd/e;LZc/f;Lfe/u;)V

    return-object v0
.end method

.method public static final e()Lorg/kodein/di/DI$g;
    .locals 1

    sget-object v0, LLd/c;->a:Lorg/kodein/di/DI$g;

    return-object v0
.end method
