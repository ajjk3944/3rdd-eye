.class public final LE0/w;
.super LE0/c0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/w$a;,
        LE0/w$b;
    }
.end annotation


# static fields
.field public static final m1:LE0/w$a;

.field private static final n1:Lm0/S0;


# instance fields
.field private final k1:LE0/y0;

.field private l1:LE0/Q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE0/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE0/w$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LE0/w;->m1:LE0/w$a;

    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object v0

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->c()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lm0/S0;->I(J)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {v0, v1}, Lm0/S0;->K(F)V

    sget-object v1, Lm0/T0;->a:Lm0/T0$a;

    invoke-virtual {v1}, Lm0/T0$a;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->H(I)V

    sput-object v0, LE0/w;->n1:Lm0/S0;

    return-void
.end method

.method public constructor <init>(LE0/G;)V
    .locals 1

    invoke-direct {p0, p1}, LE0/c0;-><init>(LE0/G;)V

    new-instance v0, LE0/y0;

    invoke-direct {v0}, LE0/y0;-><init>()V

    iput-object v0, p0, LE0/w;->k1:LE0/y0;

    invoke-virtual {p0}, LE0/w;->B3()LE0/y0;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/compose/ui/e$c;->C2(LE0/c0;)V

    invoke-virtual {p1}, LE0/G;->a0()LE0/G;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p1, LE0/w$b;

    invoke-direct {p1, p0}, LE0/w$b;-><init>(LE0/w;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LE0/w;->l1:LE0/Q;

    return-void
.end method

.method private final C3()V
    .locals 1

    invoke-virtual {p0}, LE0/P;->M1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LE0/c0;->a3()V

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    invoke-virtual {v0}, LE0/L$b;->Z1()V

    return-void
.end method


# virtual methods
.method public B3()LE0/y0;
    .locals 1

    iget-object v0, p0, LE0/w;->k1:LE0/y0;

    return-object v0
.end method

.method public C2()LE0/Q;
    .locals 1

    iget-object v0, p0, LE0/w;->l1:LE0/Q;

    return-object v0
.end method

.method protected D3(LE0/Q;)V
    .locals 0

    iput-object p1, p0, LE0/w;->l1:LE0/Q;

    return-void
.end method

.method public bridge synthetic G2()Landroidx/compose/ui/e$c;
    .locals 1

    invoke-virtual {p0}, LE0/w;->B3()LE0/y0;

    move-result-object v0

    return-object v0
.end method

.method protected K0(JFLmh/l;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, LE0/c0;->K0(JFLmh/l;)V

    invoke-direct {p0}, LE0/w;->C3()V

    return-void
.end method

.method protected L0(JFLp0/c;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, LE0/c0;->L0(JFLp0/c;)V

    invoke-direct {p0}, LE0/w;->C3()V

    return-void
.end method

.method public Q2(LE0/c0$f;JLE0/u;ZZ)V
    .locals 15

    move-object v0, p0

    move-wide/from16 v8, p2

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v1

    move-object/from16 v10, p1

    invoke-interface {v10, v1}, LE0/c0$f;->c(LE0/G;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p0, v8, v9}, LE0/c0;->A3(J)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v11, p6

    :goto_0
    move v3, v2

    goto :goto_1

    :cond_0
    if-eqz p5, :cond_1

    invoke-virtual {p0}, LE0/c0;->D2()J

    move-result-wide v4

    invoke-virtual {p0, v8, v9, v4, v5}, LE0/c0;->o2(JJ)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_1

    move v11, v3

    goto :goto_0

    :cond_1
    move/from16 v11, p6

    :goto_1
    if-eqz v3, :cond_6

    invoke-static/range {p4 .. p4}, LE0/u;->e(LE0/u;)I

    move-result v12

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->v0()LV/b;

    move-result-object v1

    invoke-virtual {v1}, LV/b;->o()I

    move-result v3

    if-lez v3, :cond_4

    sub-int/2addr v3, v2

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v13

    move v14, v3

    :cond_2
    aget-object v1, v13, v14

    move-object v2, v1

    check-cast v2, LE0/G;

    invoke-virtual {v2}, LE0/G;->q()Z

    move-result v1

    if-eqz v1, :cond_5

    move-object/from16 v1, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move v7, v11

    invoke-interface/range {v1 .. v7}, LE0/c0$f;->a(LE0/G;JLE0/u;ZZ)V

    invoke-virtual/range {p4 .. p4}, LE0/u;->v()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual/range {p4 .. p4}, LE0/u;->s()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual/range {p4 .. p4}, LE0/u;->b()V

    goto :goto_3

    :cond_4
    :goto_2
    move-object/from16 v1, p4

    goto :goto_4

    :cond_5
    :goto_3
    add-int/lit8 v14, v14, -0x1

    if-gez v14, :cond_2

    goto :goto_2

    :goto_4
    invoke-static {v1, v12}, LE0/u;->g(LE0/u;I)V

    :cond_6
    return-void
.end method

.method public R(I)I
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/G;->b1(I)I

    move-result p1

    return p1
.end method

.method public S(I)I
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/G;->X0(I)I

    move-result p1

    return p1
.end method

.method public T(J)Landroidx/compose/ui/layout/t;
    .locals 5

    invoke-virtual {p0}, LE0/c0;->y2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LE0/w;->C2()LE0/Q;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, LE0/Q;->c2()J

    move-result-wide p1

    :cond_0
    invoke-static {p0, p1, p2}, LE0/c0;->j2(LE0/c0;J)V

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_1
    aget-object v3, v0, v2

    check-cast v3, LE0/G;

    invoke-virtual {v3}, LE0/G;->c0()LE0/L$b;

    move-result-object v3

    sget-object v4, LE0/G$g;->NotUsed:LE0/G$g;

    invoke-virtual {v3, v4}, LE0/L$b;->f2(LE0/G$g;)V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_1

    :cond_2
    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->e0()LC0/C;

    move-result-object v0

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->G()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1, p2}, LC0/C;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    invoke-virtual {p0, p1}, LE0/c0;->k3(LC0/D;)V

    invoke-virtual {p0}, LE0/c0;->Z2()V

    return-object p0
.end method

.method public U0(LC0/a;)I
    .locals 1

    invoke-virtual {p0}, LE0/w;->C2()LE0/Q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LE0/P;->U0(LC0/a;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LE0/c0;->x2()LE0/b;

    move-result-object v0

    invoke-interface {v0}, LE0/b;->v()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_1
    const/high16 p1, -0x80000000

    :goto_0
    return p1
.end method

.method public c3(Lm0/n0;Lp0/c;)V
    .locals 6

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-static {v0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->v0()LV/b;

    move-result-object v1

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, LE0/G;

    invoke-virtual {v4}, LE0/G;->q()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4, p1, p2}, LE0/G;->B(Lm0/n0;Lp0/c;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    invoke-interface {v0}, LE0/m0;->getShowLayoutBounds()Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, LE0/w;->n1:Lm0/S0;

    invoke-virtual {p0, p1, p2}, LE0/c0;->q2(Lm0/n0;Lm0/S0;)V

    :cond_3
    return-void
.end method

.method public s(I)I
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/G;->W0(I)I

    move-result p1

    return p1
.end method

.method public s0(I)I
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/G;->a1(I)I

    move-result p1

    return p1
.end method

.method public s2()V
    .locals 1

    invoke-virtual {p0}, LE0/w;->C2()LE0/Q;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LE0/w$b;

    invoke-direct {v0, p0}, LE0/w$b;-><init>(LE0/w;)V

    invoke-virtual {p0, v0}, LE0/w;->D3(LE0/Q;)V

    :cond_0
    return-void
.end method
