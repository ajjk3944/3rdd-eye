.class public abstract LLe/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LA/y;)LYg/J;
    .locals 0

    invoke-static {p0}, LLe/j;->e(LA/y;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(I)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LLe/j;->f(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LLe/j;->g(Landroidx/compose/ui/e;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;LT/l;I)V
    .locals 13

    const-string v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5c432b23

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.discovery.DiscoveryHomeLoading (DiscoveryHomeLoading.kt:26)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const v0, -0x652b209e

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_5

    new-instance v0, LLe/g;

    invoke-direct {v0}, LLe/g;-><init>()V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v9, v0

    check-cast v9, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    and-int/lit8 v0, v1, 0xe

    const/high16 v1, 0x6c00000

    or-int v11, v0, v1

    const/16 v12, 0x7e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v10, p1

    invoke-static/range {v1 .. v12}, LA/b;->a(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$m;Lf0/c$b;Lw/n;ZLmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, LLe/h;

    invoke-direct {v0, p0, p2}, LLe/h;-><init>(Landroidx/compose/ui/e;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_7
    return-void
.end method

.method private static final e(LA/y;)LYg/J;
    .locals 6

    const-string v0, "$this$LazyColumn"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    invoke-static {v0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    new-instance v1, LLe/i;

    invoke-direct {v1}, LLe/i;-><init>()V

    sget-object v2, LLe/j$a;->a:LLe/j$a;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, LLe/j$b;

    invoke-direct {v4, v1, v0}, LLe/j$b;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v1, LLe/j$c;

    invoke-direct {v1, v2, v0}, LLe/j$c;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v2, LLe/j$d;

    invoke-direct {v2, v0}, LLe/j$d;-><init>(Ljava/util/List;)V

    const v0, -0x25b7f321

    const/4 v5, 0x1

    invoke-static {v0, v5, v2}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    invoke-interface {p0, v3, v4, v1, v0}, LA/y;->a(ILmh/l;Lmh/l;Lmh/r;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(I)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LLe/j;->d(Landroidx/compose/ui/e;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
