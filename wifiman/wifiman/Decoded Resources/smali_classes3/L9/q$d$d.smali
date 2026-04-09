.class final LL9/q$d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/G;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL9/q$d;->a(Lz/Y;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F


# direct methods
.method constructor <init>(F)V
    .locals 0

    iput p1, p0, LL9/q$d$d;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/layout/t;IILandroidx/compose/ui/layout/t;ILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LL9/q$d$d;->h(Landroidx/compose/ui/layout/t;IILandroidx/compose/ui/layout/t;ILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/layout/t;JLandroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LL9/q$d$d;->g(Landroidx/compose/ui/layout/t;JLandroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/layout/t;JLandroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v3, v0, 0x2

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p2

    sub-int/2addr p1, p2

    div-int/lit8 v4, p1, 0x2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p3

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/layout/t;IILandroidx/compose/ui/layout/t;ILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v0

    sub-int v0, p2, v0

    div-int/lit8 v4, v0, 0x2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p6

    move-object v2, p0

    move v3, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p0

    sub-int p0, p4, p0

    sub-int v2, p0, p1

    invoke-virtual {p3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p0

    sub-int p0, p2, p0

    div-int/lit8 v3, p0, 0x2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p6

    move-object v1, p3

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p5}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p0

    sub-int/2addr p4, p0

    div-int/lit8 v2, p4, 0x2

    invoke-virtual {p5}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p0

    sub-int/2addr p2, p0

    div-int/lit8 v3, p2, 0x2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p6

    move-object v1, p5

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v11, p3

    const-string v3, "$this$Layout"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "measurables"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC0/B;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-interface {v4, v11, v12}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v4

    move-object v13, v4

    goto :goto_0

    :cond_0
    move-object v13, v5

    :goto_0
    const/4 v4, 0x1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC0/B;

    if-eqz v4, :cond_1

    invoke-interface {v4, v11, v12}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v5

    :cond_1
    move-object v14, v5

    if-eqz v13, :cond_2

    invoke-virtual {v13}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v4

    goto :goto_1

    :cond_2
    move v4, v3

    :goto_1
    if-eqz v14, :cond_3

    invoke-virtual {v14}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v3

    :cond_3
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v15

    const/4 v10, 0x2

    if-nez v15, :cond_4

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, LC0/B;

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v2

    iget v3, v0, LL9/q$d$d;->a:F

    invoke-interface {v1, v3}, LY0/d;->x1(F)I

    move-result v3

    mul-int/2addr v3, v10

    sub-int/2addr v2, v3

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v3

    invoke-static {v2, v3}, Lsh/m;->d(II)I

    move-result v5

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v9}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface {v13, v2, v3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v2

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v3

    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v4

    new-instance v5, LL9/u;

    invoke-direct {v5, v2, v11, v12}, LL9/u;-><init>(Landroidx/compose/ui/layout/t;J)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v1, p1

    move v2, v3

    move v3, v4

    move-object v4, v8

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v1

    return-object v1

    :cond_4
    iget v3, v0, LL9/q$d$d;->a:F

    const/4 v4, 0x6

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    sub-float/2addr v3, v4

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-interface {v1, v3}, LY0/d;->x1(F)I

    move-result v16

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v3

    mul-int/lit8 v17, v16, 0x2

    sub-int v3, v3, v17

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v4

    invoke-static {v3, v4}, Lsh/m;->d(II)I

    move-result v6

    const/16 v9, 0xd

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide/from16 v3, p3

    move v0, v10

    move-object/from16 v10, v18

    invoke-static/range {v3 .. v10}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/b;->l(J)I

    move-result v3

    mul-int/2addr v15, v0

    sub-int/2addr v3, v15

    sub-int v3, v3, v17

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/B;

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v2

    invoke-static {v3, v2}, Lsh/m;->d(II)I

    move-result v5

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v9}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface {v0, v2, v3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v0

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v2

    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v3

    new-instance v5, LL9/v;

    move-object v6, v5

    move-object v7, v13

    move/from16 v8, v16

    move v9, v3

    move-object v10, v14

    move v11, v2

    move-object v12, v0

    invoke-direct/range {v6 .. v12}, LL9/v;-><init>(Landroidx/compose/ui/layout/t;IILandroidx/compose/ui/layout/t;ILandroidx/compose/ui/layout/t;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method
