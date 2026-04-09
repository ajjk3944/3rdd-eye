.class public abstract LQe/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQe/f;

    invoke-direct {v0}, LQe/f;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LQe/i;->a:LT/H0;

    return-void
.end method

.method public static synthetic a()LQe/d;
    .locals 1

    invoke-static {}, LQe/i;->e()LQe/d;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;Lc0/m;LQe/b;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1, p2}, LQe/i;->j(Ljava/lang/String;Lc0/m;LQe/b;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/util/Map;)LQe/b;
    .locals 0

    invoke-static {p0, p1}, LQe/i;->k(Ljava/lang/String;Ljava/util/Map;)LQe/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()LT/q0;
    .locals 1

    invoke-static {}, LQe/i;->h()LT/q0;

    move-result-object v0

    return-object v0
.end method

.method private static final e()LQe/d;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No WifimanRootController set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final f()LT/H0;
    .locals 1

    sget-object v0, LQe/i;->a:LT/H0;

    return-object v0
.end method

.method public static final g(LT/l;I)LT/z1;
    .locals 7

    const v0, -0x7374e83c

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.root.rememberWifimanRootController (WifimanRootController.kt:92)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    new-array v0, p1, [Ljava/lang/Object;

    invoke-static {}, LQe/i;->i()Lc0/k;

    move-result-object v1

    const p1, -0x4a88a1f4

    invoke-interface {p0, p1}, LT/l;->U(I)V

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_1

    new-instance p1, LQe/e;

    invoke-direct {p1}, LQe/e;-><init>()V

    invoke-interface {p0, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v3, p1

    check-cast v3, Lmh/a;

    invoke-interface {p0}, LT/l;->J()V

    const/16 v5, 0xc00

    const/4 v6, 0x4

    const/4 v2, 0x0

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Lc0/c;->d([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)LT/q0;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p0}, LT/l;->J()V

    return-object p1
.end method

.method private static final h()LT/q0;
    .locals 3

    new-instance v0, LQe/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, LQe/b;-><init>(LQe/c$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x2

    invoke-static {v0, v2, v1, v2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    return-object v0
.end method

.method private static final i()Lc0/k;
    .locals 3

    new-instance v0, LQe/g;

    const-string v1, "tab"

    invoke-direct {v0, v1}, LQe/g;-><init>(Ljava/lang/String;)V

    new-instance v2, LQe/h;

    invoke-direct {v2, v1}, LQe/h;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lc0/b;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    return-object v0
.end method

.method private static final j(Ljava/lang/String;Lc0/m;LQe/b;)Ljava/util/Map;
    .locals 1

    const-string v0, "$this$mapSaver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LQe/b;->k()LQe/c$a;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    invoke-static {p0}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Ljava/lang/String;Ljava/util/Map;)LQe/b;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LQe/b;

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, LQe/c$a;->valueOf(Ljava/lang/String;)LQe/c$a;

    move-result-object p0

    invoke-direct {v0, p0}, LQe/b;-><init>(LQe/c$a;)V

    return-object v0
.end method
