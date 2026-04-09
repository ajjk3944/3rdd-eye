.class public abstract LEc/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/kodein/di/DI$g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lorg/kodein/di/DI$g;

    new-instance v4, LEc/a;

    invoke-direct {v4}, LEc/a;-><init>()V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, "model.discovery.engine"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/kodein/di/DI$g;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, LEc/s;->a:Lorg/kodein/di/DI$g;

    return-void
.end method

.method private static final A(Luj/b;LJc/a$a;)LJc/c;
    .locals 6

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJc/c;

    sget-object v1, Lfe/u$a;->DISCOVERY_HOSTNAME:Lfe/u$a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEc/s$T;

    invoke-direct {v3}, LEc/s$T;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lfe/u$a;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v3, Lorg/kodein/type/d;

    new-instance v5, LEc/s$U;

    invoke-direct {v5}, LEc/s$U;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lgg/y;

    invoke-direct {v3, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v4, 0x0

    invoke-interface {p0, v2, v3, v4, v1}, Lrj/o2;->b(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/y;

    invoke-direct {v0, p1, p0}, LJc/c;-><init>(LJc/a$a;Lgg/y;)V

    return-object v0
.end method

.method private static final B(Luj/j;)LTc/b;
    .locals 8

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LTc/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEc/s$V;

    invoke-direct {v3}, LEc/s$V;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lxa/o;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxa/o;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v2

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, LEc/s$W;

    invoke-direct {v6}, LEc/s$W;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lbe/e;

    invoke-direct {v5, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v2, v5, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbe/e;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, LEc/s$X;

    invoke-direct {v6}, LEc/s$X;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/vendor/d$b;

    invoke-direct {v5, v6, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v5, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/vendor/d$b;

    invoke-direct {v0, v1, v2, p0}, LTc/b;-><init>(Lxa/o;Lbe/e;Lcom/ui/wifiman/model/vendor/d$b;)V

    return-object v0
.end method

.method private static final C(Luj/j;)LUc/i;
    .locals 6

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LUc/i;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEc/s$Y;

    invoke-direct {v3}, LEc/s$Y;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Landroid/net/wifi/WifiManager;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/WifiManager;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v5, LEc/s$Z;

    invoke-direct {v5}, LEc/s$Z;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/vendor/d$b;

    invoke-direct {v2, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/vendor/d$b;

    invoke-direct {v0, v1, p0}, LUc/i;-><init>(Landroid/net/wifi/WifiManager;Lcom/ui/wifiman/model/vendor/d$b;)V

    return-object v0
.end method

.method private static final D(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/b;
    .locals 9

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEc/s$a0;

    invoke-direct {v3}, LEc/s$a0;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v2

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, LEc/s$b0;

    invoke-direct {v6}, LEc/s$b0;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;

    invoke-direct {v5, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v2, v5, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$c0;

    invoke-direct {v7}, LEc/s$c0;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lcom/ui/wifiman/model/vendor/d$b;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v5, v6, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/vendor/d$b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$d0;

    invoke-direct {v7}, LEc/s$d0;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lgd/a$b;

    invoke-direct {v6, v7, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v6, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgd/a$b;

    invoke-direct {v0, v1, v2, v5, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;Lcom/ui/wifiman/model/vendor/d$b;Lgd/a$b;)V

    return-object v0
.end method

.method private static final E(Luj/b;LFc/a$a;)LFc/d;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LFc/d;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, LEc/s$e0;

    invoke-direct {v2}, LEc/s$e0;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lle/g;

    invoke-direct {v1, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lle/g;

    invoke-direct {v0, p1, p0}, LFc/d;-><init>(LFc/a$a;Lle/g;)V

    return-object v0
.end method

.method private static final F(Luj/j;)LMc/b;
    .locals 6

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LMc/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEc/s$f0;

    invoke-direct {v3}, LEc/s$f0;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LZc/f;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZc/f;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v5, LEc/s$g0;

    invoke-direct {v5}, LEc/s$g0;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lmc/a;

    invoke-direct {v2, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmc/a;

    invoke-direct {v0, v1, p0}, LMc/b;-><init>(LZc/f;Lmc/a;)V

    return-object v0
.end method

.method private static final G(Luj/b;LKc/a$a;)LKc/e;
    .locals 6

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKc/e;

    sget-object v1, Lfe/u$a;->HEAVY_PARALLEL:Lfe/u$a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEc/s$h0;

    invoke-direct {v3}, LEc/s$h0;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lfe/u$a;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v3, Lorg/kodein/type/d;

    new-instance v5, LEc/s$i0;

    invoke-direct {v5}, LEc/s$i0;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lgg/y;

    invoke-direct {v3, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v4, 0x0

    invoke-interface {p0, v2, v3, v4, v1}, Lrj/o2;->b(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/y;

    invoke-direct {v0, p1, p0}, LKc/e;-><init>(LKc/a$a;Lgg/y;)V

    return-object v0
.end method

.method private static final H(Luj/j;)LSc/e;
    .locals 4

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSc/e;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, LEc/s$j0;

    invoke-direct {v2}, LEc/s$j0;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lxa/o;

    invoke-direct {v1, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxa/o;

    invoke-direct {v0, p0}, LSc/e;-><init>(Lxa/o;)V

    return-object v0
.end method

.method private static final I(Luj/j;)LLc/d;
    .locals 4

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LLc/d;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, LEc/s$k0;

    invoke-direct {v2}, LEc/s$k0;-><init>()V

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

    invoke-direct {v0, p0}, LLc/d;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static final J(Luj/j;)LGc/b;
    .locals 6

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LGc/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEc/s$l0;

    invoke-direct {v3}, LEc/s$l0;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Led/a;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Led/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v5, LEc/s$m0;

    invoke-direct {v5}, LEc/s$m0;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/vendor/d$b;

    invoke-direct {v2, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/vendor/d$b;

    invoke-direct {v0, v1, p0}, LGc/b;-><init>(Led/a;Lcom/ui/wifiman/model/vendor/d$b;)V

    return-object v0
.end method

.method private static final K(Luj/j;)LIc/b;
    .locals 4

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LIc/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, LEc/s$n0;

    invoke-direct {v2}, LEc/s$n0;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LZc/f;

    invoke-direct {v1, v2, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LZc/f;

    invoke-direct {v0, p0}, LIc/b;-><init>(LZc/f;)V

    return-object v0
.end method

.method public static synthetic a(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/b;
    .locals 0

    invoke-static {p0}, LEc/s;->D(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/snmp/b;
    .locals 0

    invoke-static {p0}, LEc/s;->z(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/snmp/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Luj/j;)LLc/d;
    .locals 0

    invoke-static {p0}, LEc/s;->I(Luj/j;)LLc/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Luj/j;)LIc/b;
    .locals 0

    invoke-static {p0}, LEc/s;->K(Luj/j;)LIc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/e;
    .locals 0

    invoke-static {p0}, LEc/s;->u(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LEc/s;->t(Lorg/kodein/di/DI$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Luj/j;)LUc/i;
    .locals 0

    invoke-static {p0}, LEc/s;->C(Luj/j;)LUc/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Luj/b;LFc/a$a;)LFc/d;
    .locals 0

    invoke-static {p0, p1}, LEc/s;->E(Luj/b;LFc/a$a;)LFc/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Luj/j;)LGc/b;
    .locals 0

    invoke-static {p0}, LEc/s;->J(Luj/j;)LGc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Luj/b;LKc/a$a;)LKc/e;
    .locals 0

    invoke-static {p0, p1}, LEc/s;->G(Luj/b;LKc/a$a;)LKc/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Luj/j;)LMc/b;
    .locals 0

    invoke-static {p0}, LEc/s;->F(Luj/j;)LMc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/snmp/c;
    .locals 0

    invoke-static {p0}, LEc/s;->y(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/snmp/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/d;
    .locals 0

    invoke-static {p0}, LEc/s;->v(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Luj/b;LJc/a$a;)LJc/c;
    .locals 0

    invoke-static {p0, p1}, LEc/s;->A(Luj/b;LJc/a$a;)LJc/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Luj/b;LNc/b$a;)LNc/c;
    .locals 0

    invoke-static {p0, p1}, LEc/s;->x(Luj/b;LNc/b$a;)LNc/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Luj/j;)LTc/b;
    .locals 0

    invoke-static {p0}, LEc/s;->B(Luj/j;)LTc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Luj/j;)LNc/e;
    .locals 0

    invoke-static {p0}, LEc/s;->w(Luj/j;)LNc/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Luj/j;)LSc/e;
    .locals 0

    invoke-static {p0}, LEc/s;->H(Luj/j;)LSc/e;

    move-result-object p0

    return-object p0
.end method

.method public static final s()Lorg/kodein/di/DI$g;
    .locals 1

    sget-object v0, LEc/s;->a:Lorg/kodein/di/DI$g;

    return-object v0
.end method

.method private static final t(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 12

    const-string v0, "$this$Module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LPc/d;->d()Lorg/kodein/di/DI$g;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$i;

    invoke-direct {v1}, LEc/s$i;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v11, LEc/j;

    invoke-direct {v11}, LEc/j;-><init>()V

    new-instance v1, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LEc/s$H;

    invoke-direct {v4}, LEc/s$H;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    invoke-direct {v8, v4, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v1}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$j;

    invoke-direct {v1}, LEc/s$j;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v11, LEc/r;

    invoke-direct {v11}, LEc/r;-><init>()V

    new-instance v1, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LEc/s$I;

    invoke-direct {v4}, LEc/s$I;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lcom/ui/wifiman/model/discovery/engine/bonjour/d;

    invoke-direct {v8, v4, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v1}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$k;

    invoke-direct {v1}, LEc/s$k;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/discovery/engine/bonjour/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/b;

    invoke-direct {v1}, LEc/b;-><init>()V

    new-instance v4, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$z;

    invoke-direct {v7}, LEc/s$z;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v1}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$l;

    invoke-direct {v1}, LEc/s$l;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LFc/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/c;

    invoke-direct {v1}, LEc/c;-><init>()V

    new-instance v4, Luj/g;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$r;

    invoke-direct {v7}, LEc/s$r;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, LFc/a$a;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, LEc/s$s;

    invoke-direct {v8}, LEc/s$s;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, LFc/d;

    invoke-direct {v7, v8, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v7, v1}, Luj/g;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/p;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$m;

    invoke-direct {v1}, LEc/s$m;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LMc/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/d;

    invoke-direct {v1}, LEc/d;-><init>()V

    new-instance v4, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$A;

    invoke-direct {v7}, LEc/s$A;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, LMc/b;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v1}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$n;

    invoke-direct {v1}, LEc/s$n;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LKc/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/e;

    invoke-direct {v1}, LEc/e;-><init>()V

    new-instance v4, Luj/g;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$t;

    invoke-direct {v7}, LEc/s$t;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, LKc/a$a;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, LEc/s$u;

    invoke-direct {v8}, LEc/s$u;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, LKc/e;

    invoke-direct {v7, v8, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v7, v1}, Luj/g;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/p;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$o;

    invoke-direct {v1}, LEc/s$o;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LSc/b;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/f;

    invoke-direct {v1}, LEc/f;-><init>()V

    new-instance v4, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$B;

    invoke-direct {v7}, LEc/s$B;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, LSc/e;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v1}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$p;

    invoke-direct {v1}, LEc/s$p;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LLc/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/g;

    invoke-direct {v1}, LEc/g;-><init>()V

    new-instance v4, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$C;

    invoke-direct {v7}, LEc/s$C;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, LLc/d;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v1}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$q;

    invoke-direct {v1}, LEc/s$q;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LGc/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/h;

    invoke-direct {v1}, LEc/h;-><init>()V

    new-instance v4, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$D;

    invoke-direct {v7}, LEc/s$D;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, LGc/b;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v1}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$a;

    invoke-direct {v1}, LEc/s$a;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LIc/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/i;

    invoke-direct {v1}, LEc/i;-><init>()V

    new-instance v4, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$E;

    invoke-direct {v7}, LEc/s$E;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, LIc/b;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v1}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$b;

    invoke-direct {v1}, LEc/s$b;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LNc/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v11, LEc/k;

    invoke-direct {v11}, LEc/k;-><init>()V

    new-instance v1, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LEc/s$J;

    invoke-direct {v4}, LEc/s$J;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, LNc/e;

    invoke-direct {v8, v4, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v1}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$c;

    invoke-direct {v1}, LEc/s$c;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LNc/b;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/l;

    invoke-direct {v1}, LEc/l;-><init>()V

    new-instance v4, Luj/g;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$v;

    invoke-direct {v7}, LEc/s$v;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, LNc/b$a;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, LEc/s$w;

    invoke-direct {v8}, LEc/s$w;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, LNc/c;

    invoke-direct {v7, v8, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v7, v1}, Luj/g;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/p;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$d;

    invoke-direct {v1}, LEc/s$d;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v11, LEc/m;

    invoke-direct {v11}, LEc/m;-><init>()V

    new-instance v1, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LEc/s$K;

    invoke-direct {v4}, LEc/s$K;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lcom/ui/wifiman/model/discovery/engine/snmp/c;

    invoke-direct {v8, v4, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v1}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$e;

    invoke-direct {v1}, LEc/s$e;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/discovery/engine/snmp/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/n;

    invoke-direct {v1}, LEc/n;-><init>()V

    new-instance v4, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$F;

    invoke-direct {v7}, LEc/s$F;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lcom/ui/wifiman/model/discovery/engine/snmp/b;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v1}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$f;

    invoke-direct {v1}, LEc/s$f;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LJc/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/o;

    invoke-direct {v1}, LEc/o;-><init>()V

    new-instance v4, Luj/g;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$x;

    invoke-direct {v7}, LEc/s$x;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, LJc/a$a;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, LEc/s$y;

    invoke-direct {v8}, LEc/s$y;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, LJc/c;

    invoke-direct {v7, v8, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v4, v5, v6, v7, v1}, Luj/g;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/p;)V

    invoke-interface {v0, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$g;

    invoke-direct {v1}, LEc/s$g;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LTc/a;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    sget-object v9, Lrj/c6;->a:Lrj/c6;

    new-instance v11, LEc/p;

    invoke-direct {v11}, LEc/p;-><init>()V

    new-instance v1, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LEc/s$L;

    invoke-direct {v4}, LEc/s$L;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v10, LTc/b;

    invoke-direct {v8, v4, v10}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v10, 0x1

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v1}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LEc/s$h;

    invoke-direct {v1}, LEc/s$h;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LUc/e;

    invoke-direct {v0, v1, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v3, v3}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v1, LEc/q;

    invoke-direct {v1}, LEc/q;-><init>()V

    new-instance v3, Luj/n;

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object p0

    new-instance v4, Lorg/kodein/type/d;

    new-instance v5, LEc/s$G;

    invoke-direct {v5}, LEc/s$G;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LUc/i;

    invoke-direct {v4, v5, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v3, p0, v4, v1}, Luj/n;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/l;)V

    invoke-interface {v0, v3}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final u(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/e;
    .locals 6

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEc/s$M;

    invoke-direct {v3}, LEc/s$M;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LZc/f;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZc/f;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v5, LEc/s$N;

    invoke-direct {v5}, LEc/s$N;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Landroid/net/wifi/WifiManager;

    invoke-direct {v2, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/wifi/WifiManager;

    invoke-direct {v0, v1, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;-><init>(LZc/f;Landroid/net/wifi/WifiManager;)V

    return-object v0
.end method

.method private static final v(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/d;
    .locals 1

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/d;

    invoke-direct {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/d;-><init>()V

    return-object p0
.end method

.method private static final w(Luj/j;)LNc/e;
    .locals 1

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LNc/e;

    invoke-direct {p0}, LNc/e;-><init>()V

    return-object p0
.end method

.method private static final x(Luj/b;LNc/b$a;)LNc/c;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LNc/c;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEc/s$O;

    invoke-direct {v3}, LEc/s$O;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LNc/a;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNc/a;

    sget-object v2, Lfe/u$a;->DISCOVERY_NETBIOS:Lfe/u$a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, LEc/s$P;

    invoke-direct {v6}, LEc/s$P;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lfe/u$a;

    invoke-direct {v5, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LEc/s$Q;

    invoke-direct {v7}, LEc/s$Q;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lgg/y;

    invoke-direct {v6, v7, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v5, v6, v3, v2}, Lrj/o2;->b(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/y;

    invoke-direct {v0, p1, v1, p0}, LNc/c;-><init>(LNc/b$a;LNc/a;Lgg/y;)V

    return-object v0
.end method

.method private static final y(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/snmp/c;
    .locals 1

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;

    invoke-direct {p0}, Lcom/ui/wifiman/model/discovery/engine/snmp/c;-><init>()V

    return-object p0
.end method

.method private static final z(Luj/j;)Lcom/ui/wifiman/model/discovery/engine/snmp/b;
    .locals 6

    const-string v0, "$this$provider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LEc/s$R;

    invoke-direct {v3}, LEc/s$R;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LZc/f;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZc/f;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v5, LEc/s$S;

    invoke-direct {v5}, LEc/s$S;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;

    invoke-direct {v2, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;

    invoke-direct {v0, v1, p0}, Lcom/ui/wifiman/model/discovery/engine/snmp/b;-><init>(LZc/f;Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;)V

    return-object v0
.end method
