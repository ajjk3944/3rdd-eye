.class public abstract Lg8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/kodein/di/DI$g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lorg/kodein/di/DI$g;

    new-instance v4, Lg8/m;

    invoke-direct {v4}, Lg8/m;-><init>()V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string/jumbo v1, "presentation.arch"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/kodein/di/DI$g;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lg8/s;->a:Lorg/kodein/di/DI$g;

    return-void
.end method

.method public static synthetic a(Luj/j;)Li8/r;
    .locals 0

    invoke-static {p0}, Lg8/s;->m(Luj/j;)Li8/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luj/j;)Lj8/c;
    .locals 0

    invoke-static {p0}, Lg8/s;->j(Luj/j;)Lj8/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lg8/s;->h(Lorg/kodein/di/DI$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Luj/j;)Li8/q;
    .locals 0

    invoke-static {p0}, Lg8/s;->k(Luj/j;)Li8/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Luj/j;)Li8/y;
    .locals 0

    invoke-static {p0}, Lg8/s;->l(Luj/j;)Li8/y;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Luj/j;)Lcom/ui/wifiman/model/android/permissions/b;
    .locals 0

    invoke-static {p0}, Lg8/s;->i(Luj/j;)Lcom/ui/wifiman/model/android/permissions/b;

    move-result-object p0

    return-object p0
.end method

.method public static final g()Lorg/kodein/di/DI$g;
    .locals 1

    sget-object v0, Lg8/s;->a:Lorg/kodein/di/DI$g;

    return-object v0
.end method

.method private static final h(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 13

    const-string v0, "$this$Module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lg8/s$a;

    invoke-direct {v1}, Lg8/s$a;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ui/wifiman/model/android/permissions/b;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v11, Lg8/n;

    invoke-direct {v11}, Lg8/n;-><init>()V

    new-instance v12, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, Lg8/s$f;

    invoke-direct {v4}, Lg8/s$f;-><init>()V

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

    new-instance v3, Lg8/s$b;

    invoke-direct {v3}, Lg8/s$b;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lj8/a;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lg8/o;

    invoke-direct {v10}, Lg8/o;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lg8/s$g;

    invoke-direct {v3}, Lg8/s$g;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lj8/c;

    invoke-direct {v7, v3, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lg8/s$c;

    invoke-direct {v3}, Lg8/s$c;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Li8/a;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lg8/p;

    invoke-direct {v10}, Lg8/p;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lg8/s$h;

    invoke-direct {v3}, Lg8/s$h;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Li8/q;

    invoke-direct {v7, v3, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lg8/s$d;

    invoke-direct {v3}, Lg8/s$d;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Li8/s$d;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lg8/q;

    invoke-direct {v10}, Lg8/q;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lg8/s$i;

    invoke-direct {v3}, Lg8/s$i;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Li8/y;

    invoke-direct {v7, v3, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lg8/s$e;

    invoke-direct {v3}, Lg8/s$e;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lxe/f;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lg8/r;

    invoke-direct {v10}, Lg8/r;-><init>()V

    new-instance v1, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance p0, Lg8/s$j;

    invoke-direct {p0}, Lg8/s$j;-><init>()V

    invoke-virtual {p0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Li8/r;

    invoke-direct {v7, p0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v1}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Luj/j;)Lcom/ui/wifiman/model/android/permissions/b;
    .locals 3

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lg8/s$k;

    invoke-direct {v1}, Lg8/s$k;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/android/permissions/d;

    instance-of v0, p0, Lcom/ui/wifiman/model/android/permissions/b;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lcom/ui/wifiman/model/android/permissions/b;

    :cond_0
    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "AndroidPermissionService not implement AppPermissionsService"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final j(Luj/j;)Lj8/c;
    .locals 6

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj8/c;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, Lg8/s$l;

    invoke-direct {v3}, Lg8/s$l;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string/jumbo v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

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

    new-instance v5, Lg8/s$m;

    invoke-direct {v5}, Lg8/s$m;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lmd/b;

    invoke-direct {v2, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmd/b;

    invoke-direct {v0, v1, p0}, Lj8/c;-><init>(Landroid/content/Context;Lmd/b;)V

    return-object v0
.end method

.method private static final k(Luj/j;)Li8/q;
    .locals 10

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, Lg8/s$n;

    invoke-direct {v2}, Lg8/s$n;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string/jumbo v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LP8/f;

    invoke-direct {v1, v2, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LP8/f;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v4, Lg8/s$o;

    invoke-direct {v4}, Lg8/s$o;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lnc/a;

    invoke-direct {v1, v4, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lnc/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v4, Lg8/s$p;

    invoke-direct {v4}, Lg8/s$p;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lnc/j;

    invoke-direct {v1, v4, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lnc/j;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v4, Lg8/s$q;

    invoke-direct {v4}, Lg8/s$q;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lcom/ubnt/usurvey/a$b;

    invoke-direct {v1, v4, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/ubnt/usurvey/a$b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lg8/s$r;

    invoke-direct {v1}, Lg8/s$r;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Ldc/a;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Ldc/a;

    new-instance p0, Li8/q;

    move-object v4, p0

    invoke-direct/range {v4 .. v9}, Li8/q;-><init>(LP8/f;Lnc/j;Lnc/a;Lcom/ubnt/usurvey/a$b;Ldc/a;)V

    return-object p0
.end method

.method private static final l(Luj/j;)Li8/y;
    .locals 6

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li8/y;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, Lg8/s$s;

    invoke-direct {v3}, Lg8/s$s;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string/jumbo v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

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

    new-instance v5, Lg8/s$t;

    invoke-direct {v5}, Lg8/s$t;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;

    invoke-direct {v2, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;

    invoke-direct {v0, v1, p0}, Li8/y;-><init>(Landroid/content/Context;Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;)V

    return-object v0
.end method

.method private static final m(Luj/j;)Li8/r;
    .locals 8

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, Lg8/s$u;

    invoke-direct {v2}, Lg8/s$u;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string/jumbo v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Li8/a;

    invoke-direct {v1, v2, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v4, Lorg/kodein/type/d;

    new-instance v5, Lg8/s$v;

    invoke-direct {v5}, Lg8/s$v;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Li8/s$d;

    invoke-direct {v4, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v1, v4, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/s$d;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v4

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lg8/s$w;

    invoke-direct {v6}, Lg8/s$w;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, LN8/a;

    invoke-direct {v5, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v4, v5, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LN8/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lg8/s$x;

    invoke-direct {v6}, Lg8/s$x;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ubnt/usurvey/ui/teleport/deeplink/a;

    invoke-direct {v5, v6, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v5, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/usurvey/ui/teleport/deeplink/a;

    new-instance v2, Li8/r;

    invoke-direct {v2, v0, v1, p0, v4}, Li8/r;-><init>(Li8/a;Li8/s$d;Lcom/ubnt/usurvey/ui/teleport/deeplink/a;LN8/a;)V

    return-object v2
.end method
