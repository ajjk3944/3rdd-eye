.class public final Laj/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:Laj/r;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Laj/r;

    invoke-direct {v0}, Laj/r;-><init>()V

    sput-object v0, Laj/r;->a:Laj/r;

    sget-object v0, LXi/d$b;->a:LXi/d$b;

    const/4 v1, 0x0

    new-array v1, v1, [LXi/f;

    new-instance v2, Laj/l;

    invoke-direct {v2}, Laj/l;-><init>()V

    const-string v3, "kotlinx.serialization.json.JsonElement"

    invoke-static {v3, v0, v1, v2}, LXi/l;->d(Ljava/lang/String;LXi/m;[LXi/f;Lmh/l;)LXi/f;

    move-result-object v0

    sput-object v0, Laj/r;->b:LXi/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic g(LXi/a;)LYg/J;
    .locals 0

    invoke-static {p0}, Laj/r;->m(LXi/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()LXi/f;
    .locals 1

    invoke-static {}, Laj/r;->n()LXi/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()LXi/f;
    .locals 1

    invoke-static {}, Laj/r;->o()LXi/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()LXi/f;
    .locals 1

    invoke-static {}, Laj/r;->p()LXi/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k()LXi/f;
    .locals 1

    invoke-static {}, Laj/r;->q()LXi/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l()LXi/f;
    .locals 1

    invoke-static {}, Laj/r;->r()LXi/f;

    move-result-object v0

    return-object v0
.end method

.method private static final m(LXi/a;)LYg/J;
    .locals 8

    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laj/m;

    invoke-direct {v0}, Laj/m;-><init>()V

    invoke-static {v0}, Laj/s;->a(Lmh/a;)LXi/f;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "JsonPrimitive"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    new-instance v0, Laj/n;

    invoke-direct {v0}, Laj/n;-><init>()V

    invoke-static {v0}, Laj/s;->a(Lmh/a;)LXi/f;

    move-result-object v3

    const-string v2, "JsonNull"

    invoke-static/range {v1 .. v7}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    new-instance v0, Laj/o;

    invoke-direct {v0}, Laj/o;-><init>()V

    invoke-static {v0}, Laj/s;->a(Lmh/a;)LXi/f;

    move-result-object v3

    const-string v2, "JsonLiteral"

    invoke-static/range {v1 .. v7}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    new-instance v0, Laj/p;

    invoke-direct {v0}, Laj/p;-><init>()V

    invoke-static {v0}, Laj/s;->a(Lmh/a;)LXi/f;

    move-result-object v3

    const-string v2, "JsonObject"

    invoke-static/range {v1 .. v7}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    new-instance v0, Laj/q;

    invoke-direct {v0}, Laj/q;-><init>()V

    invoke-static {v0}, Laj/s;->a(Lmh/a;)LXi/f;

    move-result-object v3

    const-string v2, "JsonArray"

    invoke-static/range {v1 .. v7}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final n()LXi/f;
    .locals 1

    sget-object v0, Laj/H;->a:Laj/H;

    invoke-virtual {v0}, Laj/H;->a()LXi/f;

    move-result-object v0

    return-object v0
.end method

.method private static final o()LXi/f;
    .locals 1

    sget-object v0, Laj/C;->a:Laj/C;

    invoke-virtual {v0}, Laj/C;->a()LXi/f;

    move-result-object v0

    return-object v0
.end method

.method private static final p()LXi/f;
    .locals 1

    sget-object v0, Laj/y;->a:Laj/y;

    invoke-virtual {v0}, Laj/y;->a()LXi/f;

    move-result-object v0

    return-object v0
.end method

.method private static final q()LXi/f;
    .locals 1

    sget-object v0, Laj/F;->a:Laj/F;

    invoke-virtual {v0}, Laj/F;->a()LXi/f;

    move-result-object v0

    return-object v0
.end method

.method private static final r()LXi/f;
    .locals 1

    sget-object v0, Laj/d;->a:Laj/d;

    invoke-virtual {v0}, Laj/d;->a()LXi/f;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    sget-object v0, Laj/r;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Laj/r;->s(LYi/e;)Laj/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Laj/j;

    invoke-virtual {p0, p1, p2}, Laj/r;->t(LYi/f;Laj/j;)V

    return-void
.end method

.method public s(LYi/e;)Laj/j;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->d(LYi/e;)Laj/i;

    move-result-object p1

    invoke-interface {p1}, Laj/i;->m()Laj/j;

    move-result-object p1

    return-object p1
.end method

.method public t(LYi/f;Laj/j;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->c(LYi/f;)V

    instance-of v0, p2, Laj/G;

    if-eqz v0, :cond_0

    sget-object v0, Laj/H;->a:Laj/H;

    invoke-interface {p1, v0, p2}, LYi/f;->z(LVi/o;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, Laj/E;

    if-eqz v0, :cond_1

    sget-object v0, Laj/F;->a:Laj/F;

    invoke-interface {p1, v0, p2}, LYi/f;->z(LVi/o;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of v0, p2, Laj/c;

    if-eqz v0, :cond_2

    sget-object v0, Laj/d;->a:Laj/d;

    invoke-interface {p1, v0, p2}, LYi/f;->z(LVi/o;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
