.class public abstract Lkc/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/kodein/di/DI$g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lorg/kodein/di/DI$g;

    new-instance v4, Lkc/a;

    invoke-direct {v4}, Lkc/a;-><init>()V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, "model.android"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/kodein/di/DI$g;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lkc/w;->a:Lorg/kodein/di/DI$g;

    return-void
.end method

.method private static final A(Luj/j;)Lvc/e;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lkc/w$T;

    invoke-direct {v1}, Lkc/w$T;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lvc/e;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvc/e;

    return-object p0
.end method

.method private static final B(Luj/j;)Llc/g;
    .locals 1

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Llc/g;

    invoke-direct {p0}, Llc/g;-><init>()V

    return-object p0
.end method

.method private static final C(Luj/j;)Llc/g;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lkc/w$U;

    invoke-direct {v1}, Lkc/w$U;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Llc/g;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llc/g;

    return-object p0
.end method

.method private static final D(Luj/j;)Llc/g;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lkc/w$V;

    invoke-direct {v1}, Lkc/w$V;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Llc/g;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llc/g;

    return-object p0
.end method

.method private static final E(Luj/j;)Loc/b;
    .locals 1

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Loc/b;

    invoke-direct {p0}, Loc/b;-><init>()V

    return-object p0
.end method

.method private static final F(Luj/j;)Loc/b;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lkc/w$W;

    invoke-direct {v1}, Lkc/w$W;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Loc/b;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Loc/b;

    return-object p0
.end method

.method private static final G(Luj/j;)Loc/b;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lkc/w$X;

    invoke-direct {v1}, Lkc/w$X;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Loc/b;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Loc/b;

    return-object p0
.end method

.method private static final H(Luj/j;)Lrc/h;
    .locals 8

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrc/h;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$Y;

    invoke-direct {v3}, Lkc/w$Y;-><init>()V

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

    invoke-static {v1}, Lj4/c;->a(Landroid/content/Context;)Lj4/b;

    move-result-object v1

    const-string v2, "create(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v2

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lkc/w$Z;

    invoke-direct {v6}, Lkc/w$Z;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lhc/b;

    invoke-direct {v5, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v2, v5, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhc/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lkc/w$a0;

    invoke-direct {v6}, Lkc/w$a0;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LMb/a;

    invoke-direct {v5, v6, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v5, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LMb/a;

    invoke-direct {v0, v1, v2, p0}, Lrc/h;-><init>(Lj4/b;Lhc/b;LMb/a;)V

    return-object v0
.end method

.method private static final I(Luj/j;)Lrc/h;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lkc/w$b0;

    invoke-direct {v1}, Lkc/w$b0;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lrc/h;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrc/h;

    return-object p0
.end method

.method private static final J(Luj/j;)Lcom/ui/wifiman/model/android/permissions/c;
    .locals 4

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/android/permissions/c;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, Lkc/w$c0;

    invoke-direct {v2}, Lkc/w$c0;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/android/permissions/c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static final K(Luj/j;)Lrc/h;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lkc/w$d0;

    invoke-direct {v1}, Lkc/w$d0;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lrc/h;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrc/h;

    return-object p0
.end method

.method private static final L(Luj/j;)Ltc/d;
    .locals 4

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltc/d;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, Lkc/w$e0;

    invoke-direct {v2}, Lkc/w$e0;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-direct {v0, p0}, Ltc/d;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static final M(Luj/j;)Lmc/b;
    .locals 10

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmc/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$f0;

    invoke-direct {v3}, Lkc/w$f0;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Landroid/content/res/Resources;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/content/res/Resources;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lkc/w$g0;

    invoke-direct {v6}, Lkc/w$g0;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Landroid/content/Context;

    invoke-direct {v5, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v1, v5, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/content/Context;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, Lkc/w$h0;

    invoke-direct {v7}, Lkc/w$h0;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lcom/ui/wifiman/model/vendor/d$b;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v1, v6, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/ui/wifiman/model/vendor/d$b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, Lkc/w$i0;

    invoke-direct {v8}, Lkc/w$i0;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lld/b;

    invoke-direct {v7, v8, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v1, v7, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lld/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v8, Lkc/w$j0;

    invoke-direct {v8}, Lkc/w$j0;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LNd/c;

    invoke-direct {v1, v8, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v1, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LNd/c;

    move-object v1, v0

    move-object v3, v5

    move-object v4, v6

    move-object v5, v7

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lmc/b;-><init>(Landroid/content/res/Resources;Landroid/content/Context;Lcom/ui/wifiman/model/vendor/d$b;Lld/b;LNd/c;)V

    return-object v0
.end method

.method private static final N(Luj/j;)Luc/c;
    .locals 4

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Luc/c;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, Lkc/w$k0;

    invoke-direct {v2}, Lkc/w$k0;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-direct {v0, p0}, Luc/c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static final O(Luj/j;)Lnc/k;
    .locals 4

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnc/k;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, Lkc/w$l0;

    invoke-direct {v2}, Lkc/w$l0;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-direct {v0, p0}, Lnc/k;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static final P(Luj/j;)Lnc/i;
    .locals 6

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnc/i;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$m0;

    invoke-direct {v3}, Lkc/w$m0;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Landroid/content/pm/PackageManager;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageManager;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v5, Lkc/w$n0;

    invoke-direct {v5}, Lkc/w$n0;-><init>()V

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

    invoke-direct {v0, v1, p0}, Lnc/i;-><init>(Landroid/content/pm/PackageManager;Ldc/a;)V

    return-object v0
.end method

.method private static final Q(Luj/j;)Lpc/j;
    .locals 9

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpc/j;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$o0;

    invoke-direct {v3}, Lkc/w$o0;-><init>()V

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

    move-result-object v2

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lkc/w$p0;

    invoke-direct {v6}, Lkc/w$p0;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Ltc/a;

    invoke-direct {v5, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v2, v5, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltc/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, Lkc/w$q0;

    invoke-direct {v7}, Lkc/w$q0;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Landroid/location/LocationManager;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v5, v6, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/location/LocationManager;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, Lkc/w$r0;

    invoke-direct {v7}, Lkc/w$r0;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {v6, v7, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v6, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {v0, v1, v2, v5, p0}, Lpc/j;-><init>(Landroid/content/Context;Ltc/a;Landroid/location/LocationManager;Lcom/ui/wifiman/model/android/permissions/d;)V

    return-object v0
.end method

.method private static final R(Luj/j;)Lvc/e;
    .locals 1

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lvc/e;

    invoke-direct {p0}, Lvc/e;-><init>()V

    return-object p0
.end method

.method public static final S()Lorg/kodein/di/DI$g;
    .locals 1

    sget-object v0, Lkc/w;->a:Lorg/kodein/di/DI$g;

    return-object v0
.end method

.method public static synthetic a(Luj/j;)Lrc/h;
    .locals 0

    invoke-static {p0}, Lkc/w;->K(Luj/j;)Lrc/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luj/j;)Llc/g;
    .locals 0

    invoke-static {p0}, Lkc/w;->C(Luj/j;)Llc/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Luj/j;)Lvc/e;
    .locals 0

    invoke-static {p0}, Lkc/w;->A(Luj/j;)Lvc/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Luj/j;)Lqc/b;
    .locals 0

    invoke-static {p0}, Lkc/w;->y(Luj/j;)Lqc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Luj/j;)Lrc/h;
    .locals 0

    invoke-static {p0}, Lkc/w;->I(Luj/j;)Lrc/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Luj/j;)Lrc/h;
    .locals 0

    invoke-static {p0}, Lkc/w;->H(Luj/j;)Lrc/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Luj/j;)Loc/b;
    .locals 0

    invoke-static {p0}, Lkc/w;->G(Luj/j;)Loc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Luj/j;)Loc/b;
    .locals 0

    invoke-static {p0}, Lkc/w;->F(Luj/j;)Loc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Luj/j;)Lqc/b;
    .locals 0

    invoke-static {p0}, Lkc/w;->x(Luj/j;)Lqc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Luj/j;)Llc/g;
    .locals 0

    invoke-static {p0}, Lkc/w;->B(Luj/j;)Llc/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Luj/j;)Llc/g;
    .locals 0

    invoke-static {p0}, Lkc/w;->D(Luj/j;)Llc/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Luj/j;)Lpc/j;
    .locals 0

    invoke-static {p0}, Lkc/w;->Q(Luj/j;)Lpc/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lkc/w;->w(Lorg/kodein/di/DI$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Luj/j;)Lnc/k;
    .locals 0

    invoke-static {p0}, Lkc/w;->O(Luj/j;)Lnc/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Luj/j;)Lmc/b;
    .locals 0

    invoke-static {p0}, Lkc/w;->M(Luj/j;)Lmc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Luj/j;)Lcom/ui/wifiman/model/android/permissions/c;
    .locals 0

    invoke-static {p0}, Lkc/w;->J(Luj/j;)Lcom/ui/wifiman/model/android/permissions/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Luj/j;)Lnc/i;
    .locals 0

    invoke-static {p0}, Lkc/w;->P(Luj/j;)Lnc/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Luj/j;)Lvc/e;
    .locals 0

    invoke-static {p0}, Lkc/w;->R(Luj/j;)Lvc/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Luj/j;)Ltc/d;
    .locals 0

    invoke-static {p0}, Lkc/w;->L(Luj/j;)Ltc/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Luj/j;)Loc/b;
    .locals 0

    invoke-static {p0}, Lkc/w;->E(Luj/j;)Loc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Luj/j;)Lvc/e;
    .locals 0

    invoke-static {p0}, Lkc/w;->z(Luj/j;)Lvc/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Luj/j;)Luc/c;
    .locals 0

    invoke-static {p0}, Lkc/w;->N(Luj/j;)Luc/c;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 13

    const-string v0, "$this$Module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lkc/w$k;

    invoke-direct {v1}, Lkc/w$k;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lqc/b;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v11, Lkc/l;

    invoke-direct {v11}, Lkc/l;-><init>()V

    new-instance v12, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, Lkc/w$H;

    invoke-direct {v4}, Lkc/w$H;-><init>()V

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

    new-instance v4, Lkc/w$n;

    invoke-direct {v4}, Lkc/w$n;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lqc/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v4, Lkc/d;

    invoke-direct {v4}, Lkc/d;-><init>()V

    new-instance v5, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, Lkc/w$v;

    invoke-direct {v8}, Lkc/w$v;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v4}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$o;

    invoke-direct {v3}, Lkc/w$o;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lkc/f;

    invoke-direct {v10}, Lkc/f;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$I;

    invoke-direct {v3}, Lkc/w$I;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lcom/ui/wifiman/model/android/permissions/c;

    invoke-direct {v7, v3, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$p;

    invoke-direct {v3}, Lkc/w$p;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Ltc/a;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lkc/g;

    invoke-direct {v10}, Lkc/g;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$J;

    invoke-direct {v3}, Lkc/w$J;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Ltc/d;

    invoke-direct {v7, v3, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$q;

    invoke-direct {v3}, Lkc/w$q;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lmc/a;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lkc/h;

    invoke-direct {v10}, Lkc/h;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$K;

    invoke-direct {v3}, Lkc/w$K;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lmc/b;

    invoke-direct {v7, v3, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$r;

    invoke-direct {v3}, Lkc/w$r;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Luc/a;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lkc/i;

    invoke-direct {v10}, Lkc/i;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$L;

    invoke-direct {v3}, Lkc/w$L;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Luc/c;

    invoke-direct {v7, v3, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$s;

    invoke-direct {v3}, Lkc/w$s;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lnc/j;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lkc/j;

    invoke-direct {v10}, Lkc/j;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$M;

    invoke-direct {v3}, Lkc/w$M;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lnc/k;

    invoke-direct {v7, v3, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$t;

    invoke-direct {v3}, Lkc/w$t;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lnc/a;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lkc/k;

    invoke-direct {v10}, Lkc/k;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$N;

    invoke-direct {v3}, Lkc/w$N;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lnc/i;

    invoke-direct {v7, v3, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$u;

    invoke-direct {v3}, Lkc/w$u;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lpc/a;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    sget-object v8, Lrj/c6;->a:Lrj/c6;

    new-instance v10, Lkc/m;

    invoke-direct {v10}, Lkc/m;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$O;

    invoke-direct {v3}, Lkc/w$O;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lpc/j;

    invoke-direct {v7, v3, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x1

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$a;

    invoke-direct {v3}, Lkc/w$a;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lvc/e;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v12, Lkc/n;

    invoke-direct {v12}, Lkc/n;-><init>()V

    new-instance v3, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v7

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v8

    new-instance v9, Lorg/kodein/type/d;

    new-instance v5, Lkc/w$P;

    invoke-direct {v5}, Lkc/w$P;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v9, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object v5, v3

    invoke-direct/range {v5 .. v12}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v3}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$b;

    invoke-direct {v3}, Lkc/w$b;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lvc/b;

    invoke-direct {v0, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v3, Lkc/o;

    invoke-direct {v3}, Lkc/o;-><init>()V

    new-instance v5, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, Lkc/w$w;

    invoke-direct {v8}, Lkc/w$w;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v3}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$c;

    invoke-direct {v3}, Lkc/w$c;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lvc/a;

    invoke-direct {v0, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v3, Lkc/p;

    invoke-direct {v3}, Lkc/p;-><init>()V

    new-instance v5, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, Lkc/w$x;

    invoke-direct {v8}, Lkc/w$x;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v3}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$d;

    invoke-direct {v3}, Lkc/w$d;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Llc/g;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v12, Lkc/q;

    invoke-direct {v12}, Lkc/q;-><init>()V

    new-instance v3, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v7

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v8

    new-instance v9, Lorg/kodein/type/d;

    new-instance v5, Lkc/w$E;

    invoke-direct {v5}, Lkc/w$E;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v9, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    move-object v5, v3

    invoke-direct/range {v5 .. v12}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v3}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$e;

    invoke-direct {v3}, Lkc/w$e;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Llc/e;

    invoke-direct {v0, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v3, Lkc/r;

    invoke-direct {v3}, Lkc/r;-><init>()V

    new-instance v5, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, Lkc/w$y;

    invoke-direct {v8}, Lkc/w$y;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v3}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$f;

    invoke-direct {v3}, Lkc/w$f;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Llc/d;

    invoke-direct {v0, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v3, Lkc/s;

    invoke-direct {v3}, Lkc/s;-><init>()V

    new-instance v5, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, Lkc/w$z;

    invoke-direct {v8}, Lkc/w$z;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v3}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$g;

    invoke-direct {v3}, Lkc/w$g;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Loc/b;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v12, Lkc/t;

    invoke-direct {v12}, Lkc/t;-><init>()V

    new-instance v3, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v7

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v8

    new-instance v9, Lorg/kodein/type/d;

    new-instance v5, Lkc/w$F;

    invoke-direct {v5}, Lkc/w$F;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v9, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    move-object v5, v3

    invoke-direct/range {v5 .. v12}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v3}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$h;

    invoke-direct {v3}, Lkc/w$h;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Loc/a;

    invoke-direct {v0, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v3, Lkc/u;

    invoke-direct {v3}, Lkc/u;-><init>()V

    new-instance v5, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, Lkc/w$A;

    invoke-direct {v8}, Lkc/w$A;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v3}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$i;

    invoke-direct {v3}, Lkc/w$i;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Loc/c;

    invoke-direct {v0, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v3, Lkc/v;

    invoke-direct {v3}, Lkc/v;-><init>()V

    new-instance v5, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, Lkc/w$B;

    invoke-direct {v8}, Lkc/w$B;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v3}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$j;

    invoke-direct {v3}, Lkc/w$j;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lrc/h;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v12, Lkc/b;

    invoke-direct {v12}, Lkc/b;-><init>()V

    new-instance v3, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v7

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v8

    new-instance v9, Lorg/kodein/type/d;

    new-instance v5, Lkc/w$G;

    invoke-direct {v5}, Lkc/w$G;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v9, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    move-object v5, v3

    invoke-direct/range {v5 .. v12}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v3}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$l;

    invoke-direct {v3}, Lkc/w$l;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lrc/b;

    invoke-direct {v0, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v3, Lkc/c;

    invoke-direct {v3}, Lkc/c;-><init>()V

    new-instance v5, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, Lkc/w$C;

    invoke-direct {v8}, Lkc/w$C;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v3}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lkc/w$m;

    invoke-direct {v3}, Lkc/w$m;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lrc/a;

    invoke-direct {v0, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, Lkc/e;

    invoke-direct {v1}, Lkc/e;-><init>()V

    new-instance v3, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object p0

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lkc/w$D;

    invoke-direct {v6}, Lkc/w$D;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v6, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v3, p0, v5, v1}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v3}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final x(Luj/j;)Lqc/b;
    .locals 4

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqc/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, Lkc/w$Q;

    invoke-direct {v2}, Lkc/w$Q;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Landroid/content/pm/PackageManager;

    invoke-direct {v1, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/PackageManager;

    invoke-direct {v0, p0}, Lqc/b;-><init>(Landroid/content/pm/PackageManager;)V

    return-object v0
.end method

.method private static final y(Luj/j;)Lqc/b;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lkc/w$R;

    invoke-direct {v1}, Lkc/w$R;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lqc/b;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqc/b;

    return-object p0
.end method

.method private static final z(Luj/j;)Lvc/e;
    .locals 3

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lkc/w$S;

    invoke-direct {v1}, Lkc/w$S;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lvc/e;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvc/e;

    return-object p0
.end method
