.class public final LZi/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Ljava/util/List;

.field private final c:LYg/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "serialName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "objectInstance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LZi/v0;->a:Ljava/lang/Object;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LZi/v0;->b:Ljava/util/List;

    sget-object p2, LYg/q;->PUBLICATION:LYg/q;

    new-instance v0, LZi/t0;

    invoke-direct {v0, p1, p0}, LZi/t0;-><init>(Ljava/lang/String;LZi/v0;)V

    invoke-static {p2, v0}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LZi/v0;->c:LYg/m;

    return-void
.end method

.method public static synthetic g(LZi/v0;LXi/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LZi/v0;->j(LZi/v0;LXi/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;LZi/v0;)LXi/f;
    .locals 0

    invoke-static {p0, p1}, LZi/v0;->i(Ljava/lang/String;LZi/v0;)LXi/f;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Ljava/lang/String;LZi/v0;)LXi/f;
    .locals 3

    sget-object v0, LXi/n$d;->a:LXi/n$d;

    const/4 v1, 0x0

    new-array v1, v1, [LXi/f;

    new-instance v2, LZi/u0;

    invoke-direct {v2, p1}, LZi/u0;-><init>(LZi/v0;)V

    invoke-static {p0, v0, v1, v2}, LXi/l;->d(Ljava/lang/String;LXi/m;[LXi/f;Lmh/l;)LXi/f;

    move-result-object p0

    return-object p0
.end method

.method private static final j(LZi/v0;LXi/a;)LYg/J;
    .locals 1

    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LZi/v0;->b:Ljava/util/List;

    invoke-virtual {p1, p0}, LXi/a;->h(Ljava/util/List;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    iget-object v0, p0, LZi/v0;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXi/f;

    return-object v0
.end method

.method public c(LYi/e;)Ljava/lang/Object;
    .locals 3

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/v0;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object p1

    invoke-interface {p1}, LYi/c;->B()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LZi/v0;->a()LXi/f;

    move-result-object v1

    invoke-interface {p1, v1}, LYi/c;->k(LXi/f;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    :goto_0
    sget-object v1, LYg/J;->a:LYg/J;

    invoke-interface {p1, v0}, LYi/c;->b(LXi/f;)V

    iget-object p1, p0, LZi/v0;->a:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected index "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(LYi/f;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/v0;->a()LXi/f;

    move-result-object p2

    invoke-interface {p1, p2}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-virtual {p0}, LZi/v0;->a()LXi/f;

    move-result-object p2

    invoke-interface {p1, p2}, LYi/d;->b(LXi/f;)V

    return-void
.end method
