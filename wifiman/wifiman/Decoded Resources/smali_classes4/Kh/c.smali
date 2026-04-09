.class public LKh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLh/g;


# static fields
.field static final synthetic f:[Lth/l;


# instance fields
.field private final a:LZh/c;

.field private final b:LBh/g0;

.field private final c:Loi/i;

.field private final d:LQh/b;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LKh/c;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "type"

    const-string v3, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LKh/c;->f:[Lth/l;

    return-void
.end method

.method public constructor <init>(LMh/k;LQh/a;LZh/c;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LKh/c;->a:LZh/c;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object p3

    invoke-virtual {p3}, LMh/d;->t()LPh/b;

    move-result-object p3

    invoke-interface {p3, p2}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    sget-object p3, LBh/g0;->a:LBh/g0;

    const-string v0, "NO_SOURCE"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iput-object p3, p0, LKh/c;->b:LBh/g0;

    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p3

    new-instance v0, LKh/b;

    invoke-direct {v0, p1, p0}, LKh/b;-><init>(LMh/k;LKh/c;)V

    invoke-interface {p3, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LKh/c;->c:Loi/i;

    if-eqz p2, :cond_1

    invoke-interface {p2}, LQh/a;->j()Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LQh/b;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, LKh/c;->d:LQh/b;

    const/4 p1, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p2}, LQh/a;->d()Z

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_2

    move p1, p3

    :cond_2
    iput-boolean p1, p0, LKh/c;->e:Z

    return-void
.end method

.method static synthetic b(LMh/k;LKh/c;)Lpi/d0;
    .locals 0

    invoke-static {p0, p1}, LKh/c;->g(LMh/k;LKh/c;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LMh/k;LKh/c;)Lpi/d0;
    .locals 0

    invoke-virtual {p0}, LMh/k;->d()LBh/G;

    move-result-object p0

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p0

    invoke-virtual {p1}, LKh/c;->e()LZh/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->o(LZh/c;)LBh/e;

    move-result-object p0

    invoke-interface {p0}, LBh/e;->u()Lpi/d0;

    move-result-object p0

    const-string p1, "getDefaultType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected final c()LQh/b;
    .locals 1

    iget-object v0, p0, LKh/c;->d:LQh/b;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LKh/c;->e:Z

    return v0
.end method

.method public e()LZh/c;
    .locals 1

    iget-object v0, p0, LKh/c;->a:LZh/c;

    return-object v0
.end method

.method public f()Lpi/d0;
    .locals 3

    iget-object v0, p0, LKh/c;->c:Loi/i;

    sget-object v1, LKh/c;->f:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/d0;

    return-object v0
.end method

.method public bridge synthetic getType()Lpi/S;
    .locals 1

    invoke-virtual {p0}, LKh/c;->f()Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public j()LBh/g0;
    .locals 1

    iget-object v0, p0, LKh/c;->b:LBh/g0;

    return-object v0
.end method
