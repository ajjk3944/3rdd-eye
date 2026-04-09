.class public abstract LEd/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/kodein/di/DI$g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lorg/kodein/di/DI$g;

    new-instance v4, LEd/a;

    invoke-direct {v4}, LEd/a;-><init>()V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, "model.support"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/kodein/di/DI$g;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, LEd/e;->a:Lorg/kodein/di/DI$g;

    return-void
.end method

.method public static synthetic a(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LEd/e;->e(Lorg/kodein/di/DI$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luj/j;)Lcom/ui/wifiman/model/support/f;
    .locals 0

    invoke-static {p0}, LEd/e;->g(Luj/j;)Lcom/ui/wifiman/model/support/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Luj/j;)Lcom/ui/wifiman/model/support/f;
    .locals 0

    invoke-static {p0}, LEd/e;->f(Luj/j;)Lcom/ui/wifiman/model/support/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Luj/j;)Lcom/ui/wifiman/model/support/f;
    .locals 0

    invoke-static {p0}, LEd/e;->h(Luj/j;)Lcom/ui/wifiman/model/support/f;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 13

    const-string v0, "$this$Module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEd/e$a;

    invoke-direct {v1}, LEd/e$a;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ui/wifiman/model/support/f;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v11, LEd/b;

    invoke-direct {v11}, LEd/b;-><init>()V

    new-instance v12, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LEd/e$f;

    invoke-direct {v4}, LEd/e$f;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v4, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v12}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LEd/e$b;

    invoke-direct {v4}, LEd/e$b;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/support/SupportManager;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v4, LEd/c;

    invoke-direct {v4}, LEd/c;-><init>()V

    new-instance v5, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, LEd/e$d;

    invoke-direct {v8}, LEd/e$d;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v4}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LEd/e$c;

    invoke-direct {v4}, LEd/e$c;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/support/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEd/d;

    invoke-direct {v1}, LEd/d;-><init>()V

    new-instance v4, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object p0

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, LEd/e$e;

    invoke-direct {v6}, LEd/e$e;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v6, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, p0, v5, v1}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Luj/j;)Lcom/ui/wifiman/model/support/f;
    .locals 6

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/support/f;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEd/e$g;

    invoke-direct {v3}, LEd/e$g;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Landroid/content/Context;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v5, LEd/e$h;

    invoke-direct {v5}, LEd/e$h;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Ldc/a;

    invoke-direct {v2, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldc/a;

    invoke-direct {v0, v1, p0}, Lcom/ui/wifiman/model/support/f;-><init>(Landroid/content/Context;Ldc/a;)V

    return-object v0
.end method

.method private static final g(Luj/j;)Lcom/ui/wifiman/model/support/f;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEd/e$i;

    invoke-direct {v1}, LEd/e$i;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/support/f;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/support/f;

    return-object p0
.end method

.method private static final h(Luj/j;)Lcom/ui/wifiman/model/support/f;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEd/e$j;

    invoke-direct {v1}, LEd/e$j;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/support/f;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/support/f;

    return-object p0
.end method

.method public static final i()Lorg/kodein/di/DI$g;
    .locals 1

    sget-object v0, LEd/e;->a:Lorg/kodein/di/DI$g;

    return-object v0
.end method
