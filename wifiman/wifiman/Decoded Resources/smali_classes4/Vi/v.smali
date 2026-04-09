.class public abstract LVi/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LZi/S0;

.field private static final b:LZi/S0;

.field private static final c:LZi/z0;

.field private static final d:LZi/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LVi/p;

    invoke-direct {v0}, LVi/p;-><init>()V

    invoke-static {v0}, LZi/o;->a(Lmh/l;)LZi/S0;

    move-result-object v0

    sput-object v0, LVi/v;->a:LZi/S0;

    new-instance v0, LVi/q;

    invoke-direct {v0}, LVi/q;-><init>()V

    invoke-static {v0}, LZi/o;->a(Lmh/l;)LZi/S0;

    move-result-object v0

    sput-object v0, LVi/v;->b:LZi/S0;

    new-instance v0, LVi/r;

    invoke-direct {v0}, LVi/r;-><init>()V

    invoke-static {v0}, LZi/o;->b(Lmh/p;)LZi/z0;

    move-result-object v0

    sput-object v0, LVi/v;->c:LZi/z0;

    new-instance v0, LVi/s;

    invoke-direct {v0}, LVi/s;-><init>()V

    invoke-static {v0}, LZi/o;->b(Lmh/p;)LZi/z0;

    move-result-object v0

    sput-object v0, LVi/v;->d:LZi/z0;

    return-void
.end method

.method public static synthetic a(Lth/d;)LVi/b;
    .locals 0

    invoke-static {p0}, LVi/v;->k(Lth/d;)LVi/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lth/d;)LVi/b;
    .locals 0

    invoke-static {p0}, LVi/v;->l(Lth/d;)LVi/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;)Lth/e;
    .locals 0

    invoke-static {p0}, LVi/v;->h(Ljava/util/List;)Lth/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lth/d;Ljava/util/List;)LVi/b;
    .locals 0

    invoke-static {p0, p1}, LVi/v;->i(Lth/d;Ljava/util/List;)LVi/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lth/d;Ljava/util/List;)LVi/b;
    .locals 0

    invoke-static {p0, p1}, LVi/v;->g(Lth/d;Ljava/util/List;)LVi/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/util/List;)Lth/e;
    .locals 0

    invoke-static {p0}, LVi/v;->j(Ljava/util/List;)Lth/e;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lth/d;Ljava/util/List;)LVi/b;
    .locals 2

    const-string v0, "clazz"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "types"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcj/g;->a()Lcj/e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, LVi/w;->i(Lcj/e;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v1, LVi/t;

    invoke-direct {v1, p1}, LVi/t;-><init>(Ljava/util/List;)V

    invoke-static {p0, v0, v1}, LVi/w;->a(Lth/d;Ljava/util/List;Lmh/a;)LVi/b;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ljava/util/List;)Lth/e;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lth/p;

    invoke-interface {p0}, Lth/p;->r()Lth/e;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lth/d;Ljava/util/List;)LVi/b;
    .locals 2

    const-string v0, "clazz"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "types"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcj/g;->a()Lcj/e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, LVi/w;->i(Lcj/e;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v1, LVi/u;

    invoke-direct {v1, p1}, LVi/u;-><init>(Ljava/util/List;)V

    invoke-static {p0, v0, v1}, LVi/w;->a(Lth/d;Ljava/util/List;Lmh/a;)LVi/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final j(Ljava/util/List;)Lth/e;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lth/p;

    invoke-interface {p0}, Lth/p;->r()Lth/e;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lth/d;)LVi/b;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LVi/w;->h(Lth/d;)LVi/b;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p0}, LZi/A0;->l(Lth/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LVi/f;

    invoke-direct {v0, p0}, LVi/f;-><init>(Lth/d;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    move-object v0, p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static final l(Lth/d;)LVi/b;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LVi/w;->h(Lth/d;)LVi/b;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p0}, LZi/A0;->l(Lth/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LVi/f;

    invoke-direct {v0, p0}, LVi/f;-><init>(Lth/d;)V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object p0

    if-eqz p0, :cond_2

    move-object v1, p0

    :cond_2
    return-object v1
.end method

.method public static final m(Lth/d;Z)LVi/b;
    .locals 1

    const-string v0, "clazz"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_1

    sget-object p1, LVi/v;->a:LZi/S0;

    invoke-interface {p1, p0}, LZi/S0;->a(Lth/d;)LVi/b;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    sget-object p1, LVi/v;->b:LZi/S0;

    invoke-interface {p1, p0}, LZi/S0;->a(Lth/d;)LVi/b;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final n(Lth/d;Ljava/util/List;Z)Ljava/lang/Object;
    .locals 1

    const-string v0, "clazz"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "types"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    sget-object p2, LVi/v;->c:LZi/z0;

    invoke-interface {p2, p0, p1}, LZi/z0;->a(Lth/d;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p2, LVi/v;->d:LZi/z0;

    invoke-interface {p2, p0, p1}, LZi/z0;->a(Lth/d;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
