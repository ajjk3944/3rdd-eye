.class public abstract Lwf/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lwf/c;->e(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FLandroidx/compose/ui/layout/m;LC0/B;LY0/b;)LC0/D;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwf/c;->d(FLandroidx/compose/ui/layout/m;LC0/B;LY0/b;)LC0/D;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwf/a;

    invoke-direct {v0, p1}, Lwf/a;-><init>(F)V

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/g;->a(Landroidx/compose/ui/e;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final d(FLandroidx/compose/ui/layout/m;LC0/B;LY0/b;)LC0/D;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p0

    invoke-static {v0}, Loh/b;->e(F)I

    move-result p0

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result v0

    invoke-interface {p2, v0}, LC0/n;->S(I)I

    move-result v0

    invoke-static {v0, p0}, Lsh/m;->g(II)I

    move-result v2

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->n(J)I

    move-result p0

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->m(J)I

    move-result v0

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {p0, v2, v0, p3}, LY0/c;->a(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    new-instance v5, Lwf/b;

    invoke-direct {v5, p0}, Lwf/b;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
