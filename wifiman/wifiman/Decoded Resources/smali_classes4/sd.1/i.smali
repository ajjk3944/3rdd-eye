.class public abstract Lsd/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/kodein/di/DI$g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lorg/kodein/di/DI$g;

    new-instance v4, Lsd/f;

    invoke-direct {v4}, Lsd/f;-><init>()V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, "speedtest.combined"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/kodein/di/DI$g;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lsd/i;->a:Lorg/kodein/di/DI$g;

    return-void
.end method

.method public static synthetic a(Luj/j;)Lsd/b;
    .locals 0

    invoke-static {p0}, Lsd/i;->f(Luj/j;)Lsd/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lsd/i;->e(Lorg/kodein/di/DI$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Luj/b;Ljava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;
    .locals 0

    invoke-static {p0, p1}, Lsd/i;->g(Luj/b;Ljava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Lorg/kodein/di/DI$g;
    .locals 1

    sget-object v0, Lsd/i;->a:Lorg/kodein/di/DI$g;

    return-object v0
.end method

.method private static final e(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 12

    const-string v0, "$this$Module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lsd/i$a;

    invoke-direct {v1}, Lsd/i$a;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lsd/a;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    new-instance v10, Lsd/g;

    invoke-direct {v10}, Lsd/g;-><init>()V

    new-instance v11, Luj/u;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v3, Lsd/i$e;

    invoke-direct {v3}, Lsd/i$e;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lsd/b;

    invoke-direct {v7, v3, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v0, v11}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lsd/i$b;

    invoke-direct {v3}, Lsd/i$b;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/speedtest/advanced/a;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v0, v1, v1}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v0

    sget-object v9, Lrj/c6;->a:Lrj/c6;

    new-instance v11, Lsd/h;

    invoke-direct {v11}, Lsd/h;-><init>()V

    new-instance v1, Luj/i;

    invoke-interface {p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v4

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-interface {p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance p0, Lsd/i$c;

    invoke-direct {p0}, Lsd/i$c;-><init>()V

    invoke-virtual {p0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Ljava/lang/Object;

    invoke-direct {v7, p0, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v8, Lorg/kodein/type/d;

    new-instance p0, Lsd/i$d;

    invoke-direct {p0}, Lsd/i$d;-><init>()V

    invoke-virtual {p0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;

    invoke-direct {v8, p0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v10, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v11}, Luj/i;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Lorg/kodein/type/q;Luj/o;ZLmh/p;)V

    invoke-interface {v0, v1}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Luj/j;)Lsd/b;
    .locals 5

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, Lsd/i$f;

    invoke-direct {v2}, Lsd/i$f;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LSd/d;

    invoke-direct {v1, v2, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSd/d;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v4, Lsd/i$g;

    invoke-direct {v4}, Lsd/i$g;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Ljd/b;

    invoke-direct {v1, v4, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljd/b;

    new-instance v1, Lsd/b;

    invoke-direct {v1, p0, v0}, Lsd/b;-><init>(Ljd/b;LSd/d;)V

    return-object v1
.end method

.method private static final g(Luj/b;Ljava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;
    .locals 11

    const-string v0, "$this$multiton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lsd/i$h;

    invoke-direct {v1}, Lsd/i$h;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LSd/d;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, LSd/d;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lsd/i$i;

    invoke-direct {v3}, Lsd/i$i;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lvd/a;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lvd/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lsd/i$j;

    invoke-direct {v3}, Lsd/i$j;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lzd/a;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lzd/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lsd/i$k;

    invoke-direct {v3}, Lsd/i$k;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lyd/a;

    invoke-direct {v0, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lyd/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lsd/i$l;

    invoke-direct {v3}, Lsd/i$l;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lwd/f;

    invoke-direct {v0, v3, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lwd/f;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lsd/i$m;

    invoke-direct {v3}, Lsd/i$m;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lud/a;

    invoke-direct {v0, v3, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, v0, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Lud/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Lsd/i$n;

    invoke-direct {v0}, Lsd/i$n;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Ltd/d;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, p1, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, Ltd/d;

    new-instance p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;

    move-object v3, p0

    invoke-direct/range {v3 .. v10}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;-><init>(Lzd/a;Lyd/a;Lwd/f;Lvd/a;LSd/d;Lud/a;Ltd/d;)V

    return-object p0
.end method
