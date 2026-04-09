.class public abstract LE0/c0;
.super LE0/P;
.source "SourceFile"

# interfaces
.implements LC0/B;
.implements LC0/r;
.implements LE0/n0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/c0$e;,
        LE0/c0$f;
    }
.end annotation


# static fields
.field public static final X:LE0/c0$e;

.field private static final Y:Lmh/l;

.field private static final Z:Lmh/l;

.field private static final f1:Landroidx/compose/ui/graphics/d;

.field private static final g1:LE0/z;

.field private static final h1:[F

.field private static final i1:LE0/c0$f;

.field private static final j1:LE0/c0$f;


# instance fields
.field private A:LC0/D;

.field private B:Ljava/util/Map;

.field private C:J

.field private D:F

.field private E:Ll0/e;

.field private F:LE0/z;

.field private final G:Lmh/p;

.field private final H:Lmh/a;

.field private I:Z

.field private J:LE0/l0;

.field private N:Lp0/c;

.field private final p:LE0/G;

.field private q:Z

.field private r:Z

.field private s:LE0/c0;

.field private t:LE0/c0;

.field private u:Z

.field private v:Z

.field private w:Lmh/l;

.field private x:LY0/d;

.field private y:LY0/t;

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LE0/c0$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE0/c0$e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LE0/c0;->X:LE0/c0$e;

    sget-object v0, LE0/c0$d;->a:LE0/c0$d;

    sput-object v0, LE0/c0;->Y:Lmh/l;

    sget-object v0, LE0/c0$c;->a:LE0/c0$c;

    sput-object v0, LE0/c0;->Z:Lmh/l;

    new-instance v0, Landroidx/compose/ui/graphics/d;

    invoke-direct {v0}, Landroidx/compose/ui/graphics/d;-><init>()V

    sput-object v0, LE0/c0;->f1:Landroidx/compose/ui/graphics/d;

    new-instance v0, LE0/z;

    invoke-direct {v0}, LE0/z;-><init>()V

    sput-object v0, LE0/c0;->g1:LE0/z;

    const/4 v0, 0x1

    invoke-static {v1, v0, v1}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v0

    sput-object v0, LE0/c0;->h1:[F

    new-instance v0, LE0/c0$a;

    invoke-direct {v0}, LE0/c0$a;-><init>()V

    sput-object v0, LE0/c0;->i1:LE0/c0$f;

    new-instance v0, LE0/c0$b;

    invoke-direct {v0}, LE0/c0$b;-><init>()V

    sput-object v0, LE0/c0;->j1:LE0/c0$f;

    return-void
.end method

.method public constructor <init>(LE0/G;)V
    .locals 2

    invoke-direct {p0}, LE0/P;-><init>()V

    iput-object p1, p0, LE0/c0;->p:LE0/G;

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->K()LY0/d;

    move-result-object p1

    iput-object p1, p0, LE0/c0;->x:LY0/d;

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->getLayoutDirection()LY0/t;

    move-result-object p1

    iput-object p1, p0, LE0/c0;->y:LY0/t;

    const p1, 0x3f4ccccd    # 0.8f

    iput p1, p0, LE0/c0;->z:F

    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LE0/c0;->C:J

    new-instance p1, LE0/c0$g;

    invoke-direct {p1, p0}, LE0/c0$g;-><init>(LE0/c0;)V

    iput-object p1, p0, LE0/c0;->G:Lmh/p;

    new-instance p1, LE0/c0$j;

    invoke-direct {p1, p0}, LE0/c0$j;-><init>(LE0/c0;)V

    iput-object p1, p0, LE0/c0;->H:Lmh/a;

    return-void
.end method

.method private final F2()LE0/o0;
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-static {v0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->getSnapshotObserver()LE0/o0;

    move-result-object v0

    return-object v0
.end method

.method private final K2(I)Z
    .locals 2

    invoke-static {p1}, LE0/f0;->i(I)Z

    move-result v0

    invoke-direct {p0, v0}, LE0/c0;->M2(Z)Landroidx/compose/ui/e$c;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, LE0/k;->e(LE0/j;I)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    move v1, v0

    :cond_0
    return v1
.end method

.method private final M2(Z)Landroidx/compose/ui/e$c;
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->m0()LE0/c0;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->k0()LE0/a0;

    move-result-object p1

    invoke-virtual {p1}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, LE0/c0;->t:LE0/c0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    goto :goto_0

    :cond_2
    iget-object p1, p0, LE0/c0;->t:LE0/c0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final N2(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZ)V
    .locals 11

    move-object v9, p1

    if-nez v9, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, LE0/c0;->Q2(LE0/c0$f;JLE0/u;ZZ)V

    goto :goto_0

    :cond_0
    new-instance v10, LE0/c0$h;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LE0/c0$h;-><init>(LE0/c0;Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZ)V

    move-object/from16 v0, p5

    move/from16 v1, p7

    invoke-virtual {v0, p1, v1, v10}, LE0/u;->w(Landroidx/compose/ui/e$c;ZLmh/a;)V

    :goto_0
    return-void
.end method

.method private final O2(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V
    .locals 12

    move-object v10, p1

    if-nez v10, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, LE0/c0;->Q2(LE0/c0$f;JLE0/u;ZZ)V

    goto :goto_0

    :cond_0
    new-instance v11, LE0/c0$i;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v0 .. v9}, LE0/c0$i;-><init>(LE0/c0;Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V

    move-object/from16 v0, p5

    move/from16 v1, p7

    move/from16 v2, p8

    invoke-virtual {v0, p1, v2, v1, v11}, LE0/u;->x(Landroidx/compose/ui/e$c;FZLmh/a;)V

    :goto_0
    return-void
.end method

.method private final U2(J)J
    .locals 3

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-gez v2, :cond_0

    neg-float v0, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->G0()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    :goto_0
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    cmpg-float p2, p1, v1

    if-gez p2, :cond_1

    neg-float p1, p1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->D0()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    :goto_1
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {v0, p1}, Ll0/h;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public static final synthetic W1(LE0/c0;Lm0/n0;Lp0/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LE0/c0;->r2(Lm0/n0;Lp0/c;)V

    return-void
.end method

.method public static final synthetic Y1()Landroidx/compose/ui/graphics/d;
    .locals 1

    sget-object v0, LE0/c0;->f1:Landroidx/compose/ui/graphics/d;

    return-object v0
.end method

.method public static final synthetic Z1(LE0/c0;)LE0/z;
    .locals 0

    iget-object p0, p0, LE0/c0;->F:LE0/z;

    return-object p0
.end method

.method public static final synthetic a2()Lmh/l;
    .locals 1

    sget-object v0, LE0/c0;->Z:Lmh/l;

    return-object v0
.end method

.method public static final synthetic b2()LE0/c0$f;
    .locals 1

    sget-object v0, LE0/c0;->i1:LE0/c0$f;

    return-object v0
.end method

.method public static final synthetic c2()LE0/c0$f;
    .locals 1

    sget-object v0, LE0/c0;->j1:LE0/c0$f;

    return-object v0
.end method

.method public static final synthetic d2(LE0/c0;)LE0/o0;
    .locals 0

    invoke-direct {p0}, LE0/c0;->F2()LE0/o0;

    move-result-object p0

    return-object p0
.end method

.method private final d3(JFLmh/l;Lp0/c;)V
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p5, :cond_3

    const/4 v3, 0x1

    if-nez p4, :cond_0

    move p4, v3

    goto :goto_0

    :cond_0
    move p4, v1

    :goto_0
    if-nez p4, :cond_1

    const-string p4, "both ways to create layers shouldn\'t be used together"

    invoke-static {p4}, LB0/a;->a(Ljava/lang/String;)V

    :cond_1
    iget-object p4, p0, LE0/c0;->N:Lp0/c;

    if-eq p4, p5, :cond_2

    iput-object v2, p0, LE0/c0;->N:Lp0/c;

    invoke-static {p0, v2, v1, v0, v2}, LE0/c0;->x3(LE0/c0;Lmh/l;ZILjava/lang/Object;)V

    iput-object p5, p0, LE0/c0;->N:Lp0/c;

    :cond_2
    iget-object p4, p0, LE0/c0;->J:LE0/l0;

    if-nez p4, :cond_5

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p4

    invoke-static {p4}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object p4

    iget-object v0, p0, LE0/c0;->G:Lmh/p;

    iget-object v1, p0, LE0/c0;->H:Lmh/a;

    invoke-interface {p4, v0, v1, p5}, LE0/m0;->y(Lmh/p;Lmh/a;Lp0/c;)LE0/l0;

    move-result-object p4

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->E0()J

    move-result-wide v0

    invoke-interface {p4, v0, v1}, LE0/l0;->f(J)V

    invoke-interface {p4, p1, p2}, LE0/l0;->i(J)V

    iput-object p4, p0, LE0/c0;->J:LE0/l0;

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p4

    invoke-virtual {p4, v3}, LE0/G;->B1(Z)V

    iget-object p4, p0, LE0/c0;->H:Lmh/a;

    invoke-interface {p4}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-object p5, p0, LE0/c0;->N:Lp0/c;

    if-eqz p5, :cond_4

    iput-object v2, p0, LE0/c0;->N:Lp0/c;

    invoke-static {p0, v2, v1, v0, v2}, LE0/c0;->x3(LE0/c0;Lmh/l;ZILjava/lang/Object;)V

    :cond_4
    invoke-static {p0, p4, v1, v0, v2}, LE0/c0;->x3(LE0/c0;Lmh/l;ZILjava/lang/Object;)V

    :cond_5
    :goto_1
    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide p4

    invoke-static {p4, p5, p1, p2}, LY0/n;->g(JJ)Z

    move-result p4

    if-nez p4, :cond_8

    invoke-virtual {p0, p1, p2}, LE0/c0;->l3(J)V

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p4

    invoke-virtual {p4}, LE0/G;->U()LE0/L;

    move-result-object p4

    invoke-virtual {p4}, LE0/L;->I()LE0/L$b;

    move-result-object p4

    invoke-virtual {p4}, LE0/L$b;->S1()V

    iget-object p4, p0, LE0/c0;->J:LE0/l0;

    if-eqz p4, :cond_6

    invoke-interface {p4, p1, p2}, LE0/l0;->i(J)V

    goto :goto_2

    :cond_6
    iget-object p1, p0, LE0/c0;->t:LE0/c0;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, LE0/c0;->R2()V

    :cond_7
    :goto_2
    invoke-virtual {p0, p0}, LE0/P;->B1(LE0/c0;)V

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->n0()LE0/m0;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p2

    invoke-interface {p1, p2}, LE0/m0;->b(LE0/G;)V

    :cond_8
    iput p3, p0, LE0/c0;->D:F

    invoke-virtual {p0}, LE0/P;->L1()Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {p0}, LE0/c0;->h1()LC0/D;

    move-result-object p1

    invoke-virtual {p0, p1}, LE0/P;->W0(LC0/D;)V

    :cond_9
    return-void
.end method

.method public static final synthetic e2()LE0/z;
    .locals 1

    sget-object v0, LE0/c0;->g1:LE0/z;

    return-object v0
.end method

.method public static final synthetic f2(LE0/c0;Z)Landroidx/compose/ui/e$c;
    .locals 0

    invoke-direct {p0, p1}, LE0/c0;->M2(Z)Landroidx/compose/ui/e$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g2(LE0/c0;Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZ)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LE0/c0;->N2(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZ)V

    return-void
.end method

.method public static synthetic g3(LE0/c0;Ll0/e;ZZILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LE0/c0;->f3(Ll0/e;ZZ)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: rectInParent"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic h2(LE0/c0;Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LE0/c0;->O2(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V

    return-void
.end method

.method public static final synthetic i2(LE0/c0;Z)V
    .locals 0

    iput-boolean p1, p0, LE0/c0;->I:Z

    return-void
.end method

.method public static final synthetic j2(LE0/c0;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/t;->S0(J)V

    return-void
.end method

.method public static final synthetic k2(LE0/c0;Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LE0/c0;->p3(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V

    return-void
.end method

.method private final l2(LE0/c0;Ll0/e;Z)V
    .locals 1

    if-ne p1, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LE0/c0;->t:LE0/c0;

    if-eqz v0, :cond_1

    invoke-direct {v0, p1, p2, p3}, LE0/c0;->l2(LE0/c0;Ll0/e;Z)V

    :cond_1
    invoke-direct {p0, p2, p3}, LE0/c0;->w2(Ll0/e;Z)V

    return-void
.end method

.method private final m2(LE0/c0;JZ)J
    .locals 2

    if-ne p1, p0, :cond_0

    return-wide p2

    :cond_0
    iget-object v0, p0, LE0/c0;->t:LE0/c0;

    if-eqz v0, :cond_2

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {v0, p1, p2, p3, p4}, LE0/c0;->m2(LE0/c0;JZ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p4}, LE0/c0;->u2(JZ)J

    move-result-wide p1

    return-wide p1

    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3, p4}, LE0/c0;->u2(JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method private final p3(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V
    .locals 12

    move-object v10, p1

    if-nez v10, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, LE0/c0;->Q2(LE0/c0$f;JLE0/u;ZZ)V

    goto :goto_0

    :cond_0
    move-object v3, p2

    invoke-interface {p2, p1}, LE0/c0$f;->d(Landroidx/compose/ui/e$c;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v11, LE0/c0$k;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v0 .. v9}, LE0/c0$k;-><init>(LE0/c0;Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V

    move-object/from16 v0, p5

    invoke-virtual {v0, p1, v9, v8, v11}, LE0/u;->D(Landroidx/compose/ui/e$c;FZLmh/a;)V

    goto :goto_0

    :cond_1
    move-object/from16 v0, p5

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-interface {p2}, LE0/c0$f;->b()I

    move-result v1

    const/4 v2, 0x2

    invoke-static {v2}, LE0/e0;->a(I)I

    move-result v2

    invoke-static {p1, v1, v2}, LE0/d0;->a(LE0/j;II)Landroidx/compose/ui/e$c;

    move-result-object v2

    move-object v1, p0

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    invoke-direct/range {v1 .. v9}, LE0/c0;->p3(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V

    :goto_0
    return-void
.end method

.method private final q3(LC0/r;)LE0/c0;
    .locals 1

    instance-of v0, p1, LC0/z;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LC0/z;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, LE0/c0;

    :cond_2
    return-object v0
.end method

.method private final r2(Lm0/n0;Lp0/c;)V
    .locals 8

    const/4 v0, 0x4

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-virtual {p0, v0}, LE0/c0;->L2(I)Landroidx/compose/ui/e$c;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-virtual {p0, p1, p2}, LE0/c0;->c3(Lm0/n0;Lp0/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->b0()LE0/I;

    move-result-object v1

    invoke-virtual {p0}, LE0/c0;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/s;->d(J)J

    move-result-wide v3

    move-object v2, p1

    move-object v5, p0

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, LE0/I;->b(Lm0/n0;JLE0/c0;Landroidx/compose/ui/e$c;Lp0/c;)V

    :goto_0
    return-void
.end method

.method public static synthetic s3(LE0/c0;JZILjava/lang/Object;)J
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LE0/c0;->r3(JZ)J

    move-result-wide p0

    return-wide p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final u3(LE0/c0;[F)V
    .locals 6

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LE0/c0;->t:LE0/c0;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v0, p1, p2}, LE0/c0;->u3(LE0/c0;[F)V

    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v0

    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/n;->g(JJ)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, LE0/c0;->h1:[F

    invoke-static {p1}, Lm0/O0;->h([F)V

    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result v0

    int-to-float v0, v0

    neg-float v1, v0

    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/n;->i(J)I

    move-result v0

    int-to-float v0, v0

    neg-float v2, v0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lm0/O0;->q([FFFFILjava/lang/Object;)V

    invoke-static {p2, p1}, Lm0/O0;->n([F[F)V

    :cond_0
    iget-object p1, p0, LE0/c0;->J:LE0/l0;

    if-eqz p1, :cond_1

    invoke-interface {p1, p2}, LE0/l0;->h([F)V

    :cond_1
    return-void
.end method

.method public static synthetic v2(LE0/c0;JZILjava/lang/Object;)J
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LE0/c0;->u2(JZ)J

    move-result-wide p0

    return-wide p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final v3(LE0/c0;[F)V
    .locals 10

    move-object v0, p0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v0, LE0/c0;->J:LE0/l0;

    if-eqz v1, :cond_0

    invoke-interface {v1, p2}, LE0/l0;->a([F)V

    :cond_0
    invoke-virtual {v0}, LE0/c0;->r1()J

    move-result-wide v1

    sget-object v3, LY0/n;->b:LY0/n$a;

    invoke-virtual {v3}, LY0/n$a;->a()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LY0/n;->g(JJ)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, LE0/c0;->h1:[F

    invoke-static {v3}, Lm0/O0;->h([F)V

    invoke-static {v1, v2}, LY0/n;->h(J)I

    move-result v4

    int-to-float v5, v4

    invoke-static {v1, v2}, LY0/n;->i(J)I

    move-result v1

    int-to-float v6, v1

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, v3

    invoke-static/range {v4 .. v9}, Lm0/O0;->q([FFFFILjava/lang/Object;)V

    invoke-static {p2, v3}, Lm0/O0;->n([F[F)V

    :cond_1
    iget-object v0, v0, LE0/c0;->t:LE0/c0;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final w2(Ll0/e;Z)V
    .locals 2

    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result v0

    invoke-virtual {p1}, Ll0/e;->b()F

    move-result v1

    int-to-float v0, v0

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Ll0/e;->i(F)V

    invoke-virtual {p1}, Ll0/e;->c()F

    move-result v1

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Ll0/e;->j(F)V

    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->i(J)I

    move-result v0

    invoke-virtual {p1}, Ll0/e;->d()F

    move-result v1

    int-to-float v0, v0

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Ll0/e;->k(F)V

    invoke-virtual {p1}, Ll0/e;->a()F

    move-result v1

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Ll0/e;->h(F)V

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, LE0/l0;->k(Ll0/e;Z)V

    iget-boolean v0, p0, LE0/c0;->v:Z

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, LE0/c0;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0}, LE0/c0;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, p2, v0}, Ll0/e;->e(FFFF)V

    invoke-virtual {p1}, Ll0/e;->f()Z

    :cond_0
    return-void
.end method

.method public static synthetic x3(LE0/c0;Lmh/l;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LE0/c0;->w3(Lmh/l;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: updateLayerBlock"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final y3(Z)V
    .locals 6

    iget-object v0, p0, LE0/c0;->N:Lp0/c;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_3

    iget-object v1, p0, LE0/c0;->w:Lmh/l;

    if-eqz v1, :cond_2

    sget-object v2, LE0/c0;->f1:Landroidx/compose/ui/graphics/d;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/d;->O()V

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v3

    invoke-virtual {v3}, LE0/G;->K()LY0/d;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/compose/ui/graphics/d;->Q(LY0/d;)V

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v3

    invoke-virtual {v3}, LE0/G;->getLayoutDirection()LY0/t;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/compose/ui/graphics/d;->R(LY0/t;)V

    invoke-virtual {p0}, LE0/c0;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/s;->d(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Landroidx/compose/ui/graphics/d;->S(J)V

    invoke-direct {p0}, LE0/c0;->F2()LE0/o0;

    move-result-object v3

    sget-object v4, LE0/c0;->Y:Lmh/l;

    new-instance v5, LE0/c0$l;

    invoke-direct {v5, v1}, LE0/c0$l;-><init>(Lmh/l;)V

    invoke-virtual {v3, p0, v4, v5}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    iget-object v1, p0, LE0/c0;->F:LE0/z;

    if-nez v1, :cond_1

    new-instance v1, LE0/z;

    invoke-direct {v1}, LE0/z;-><init>()V

    iput-object v1, p0, LE0/c0;->F:LE0/z;

    :cond_1
    invoke-virtual {v1, v2}, LE0/z;->b(Landroidx/compose/ui/graphics/c;)V

    invoke-interface {v0, v2}, LE0/l0;->c(Landroidx/compose/ui/graphics/d;)V

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/d;->q()Z

    move-result v0

    iput-boolean v0, p0, LE0/c0;->v:Z

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/d;->b()F

    move-result v0

    iput v0, p0, LE0/c0;->z:F

    if-eqz p1, :cond_5

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->n0()LE0/m0;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-interface {p1, v0}, LE0/m0;->b(LE0/G;)V

    goto :goto_1

    :cond_2
    const-string p1, "updateLayerParameters requires a non-null layerBlock"

    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_3
    iget-object p1, p0, LE0/c0;->w:Lmh/l;

    if-nez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_5

    const-string p1, "null layer with a non-null layerBlock"

    invoke-static {p1}, LB0/a;->b(Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-void
.end method

.method static synthetic z3(LE0/c0;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-direct {p0, p1}, LE0/c0;->y3(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: updateLayerParameters"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public A(J)J
    .locals 1

    invoke-virtual {p0, p1, p2}, LE0/c0;->o0(J)J

    move-result-wide p1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-static {v0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LE0/m0;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final A2()J
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->H0()J

    move-result-wide v0

    return-wide v0
.end method

.method protected final A3(J)Z
    .locals 3

    invoke-static {p1, p2}, Ll0/h;->b(J)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_1

    iget-boolean v2, p0, LE0/c0;->v:Z

    if-eqz v2, :cond_1

    invoke-interface {v0, p1, p2}, LE0/l0;->b(J)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final B2()LE0/l0;
    .locals 1

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    return-object v0
.end method

.method public abstract C2()LE0/Q;
.end method

.method public final D2()J
    .locals 3

    iget-object v0, p0, LE0/c0;->x:LY0/d;

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->s0()Landroidx/compose/ui/platform/w1;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/platform/w1;->e()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, LY0/d;->K1(J)J

    move-result-wide v0

    return-wide v0
.end method

.method protected final E2()Ll0/e;
    .locals 2

    iget-object v0, p0, LE0/c0;->E:Ll0/e;

    if-nez v0, :cond_0

    new-instance v0, Ll0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Ll0/e;-><init>(FFFF)V

    iput-object v0, p0, LE0/c0;->E:Ll0/e;

    :cond_0
    return-object v0
.end method

.method public G1()LE0/G;
    .locals 1

    iget-object v0, p0, LE0/c0;->p:LE0/G;

    return-object v0
.end method

.method public abstract G2()Landroidx/compose/ui/e$c;
.end method

.method public final H2()LE0/c0;
    .locals 1

    iget-object v0, p0, LE0/c0;->s:LE0/c0;

    return-object v0
.end method

.method public final I2()LE0/c0;
    .locals 1

    iget-object v0, p0, LE0/c0;->t:LE0/c0;

    return-object v0
.end method

.method public J(LC0/r;Z)Ll0/i;
    .locals 9

    invoke-virtual {p0}, LE0/c0;->M()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1}, LC0/r;->M()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LayoutCoordinates "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not attached!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0, p1}, LE0/c0;->q3(LC0/r;)LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->V2()V

    invoke-virtual {p0, v0}, LE0/c0;->t2(LE0/c0;)LE0/c0;

    move-result-object v1

    invoke-virtual {p0}, LE0/c0;->E2()Ll0/e;

    move-result-object v8

    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Ll0/e;->i(F)V

    invoke-virtual {v8, v2}, Ll0/e;->k(F)V

    invoke-interface {p1}, LC0/r;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v8, v2}, Ll0/e;->j(F)V

    invoke-interface {p1}, LC0/r;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->f(J)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v8, p1}, Ll0/e;->h(F)V

    :goto_0
    if-eq v0, v1, :cond_3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    move-object v3, v8

    move v4, p2

    invoke-static/range {v2 .. v7}, LE0/c0;->g3(LE0/c0;Ll0/e;ZZILjava/lang/Object;)V

    invoke-virtual {v8}, Ll0/e;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {p1}, Ll0/i$a;->a()Ll0/i;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, v0, LE0/c0;->t:LE0/c0;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-direct {p0, v1, v8, p2}, LE0/c0;->l2(LE0/c0;Ll0/e;Z)V

    invoke-static {v8}, Ll0/f;->a(Ll0/e;)Ll0/i;

    move-result-object p1

    return-object p1
.end method

.method public final J2()F
    .locals 1

    iget v0, p0, LE0/c0;->D:F

    return v0
.end method

.method protected K0(JFLmh/l;)V
    .locals 6

    iget-boolean v0, p0, LE0/c0;->q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LE0/Q;->r1()J

    move-result-wide v1

    const/4 v5, 0x0

    move-object v0, p0

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LE0/c0;->d3(JFLmh/l;Lp0/c;)V

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LE0/c0;->d3(JFLmh/l;Lp0/c;)V

    :goto_0
    return-void
.end method

.method protected L0(JFLp0/c;)V
    .locals 11

    iget-boolean v0, p0, LE0/c0;->q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LE0/c0;->C2()LE0/Q;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, LE0/Q;->r1()J

    move-result-wide v1

    const/4 v4, 0x0

    move-object v0, p0

    move v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LE0/c0;->d3(JFLmh/l;Lp0/c;)V

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    move-object v5, p0

    move-wide v6, p1

    move v8, p3

    move-object v10, p4

    invoke-direct/range {v5 .. v10}, LE0/c0;->d3(JFLmh/l;Lp0/c;)V

    :goto_0
    return-void
.end method

.method public final L2(I)Landroidx/compose/ui/e$c;
    .locals 3

    invoke-static {p1}, LE0/f0;->i(I)Z

    move-result v0

    invoke-virtual {p0}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {p0, v0}, LE0/c0;->f2(LE0/c0;Z)Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->a2()I

    move-result v2

    and-int/2addr v2, p1

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v2, p1

    if-eqz v2, :cond_2

    return-object v0

    :cond_2
    if-eq v0, v1, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_1

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public M()Z
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    return v0
.end method

.method public O([F)V
    .locals 2

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-static {v0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    invoke-static {p0}, LC0/s;->d(LC0/r;)LC0/r;

    move-result-object v1

    invoke-direct {p0, v1}, LE0/c0;->q3(LC0/r;)LE0/c0;

    move-result-object v1

    invoke-direct {p0, v1, p1}, LE0/c0;->v3(LE0/c0;[F)V

    invoke-interface {v0, p1}, Ly0/M;->t([F)V

    return-void
.end method

.method public final P2(LE0/c0$f;JLE0/u;ZZ)V
    .locals 10

    move-object v9, p0

    move-wide v3, p2

    move-object v5, p4

    invoke-interface {p1}, LE0/c0$f;->b()I

    move-result v0

    invoke-virtual {p0, v0}, LE0/c0;->L2(I)Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {p0, p2, p3}, LE0/c0;->A3(J)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p5, :cond_6

    invoke-virtual {p0}, LE0/c0;->D2()J

    move-result-wide v6

    invoke-virtual {p0, p2, p3, v6, v7}, LE0/c0;->o2(JJ)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6

    const/4 v0, 0x0

    invoke-virtual {p4, v8, v0}, LE0/u;->z(FZ)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v7, 0x0

    move-object v0, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v8}, LE0/c0;->O2(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V

    goto/16 :goto_2

    :cond_0
    if-nez v1, :cond_1

    invoke-virtual/range {p0 .. p6}, LE0/c0;->Q2(LE0/c0$f;JLE0/u;ZZ)V

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p0, p2, p3}, LE0/c0;->S2(J)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    invoke-direct/range {v0 .. v7}, LE0/c0;->N2(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZ)V

    goto :goto_2

    :cond_2
    if-nez p5, :cond_3

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    :goto_0
    move v8, v0

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, LE0/c0;->D2()J

    move-result-wide v6

    invoke-virtual {p0, p2, p3, v6, v7}, LE0/c0;->o2(JJ)F

    move-result v0

    goto :goto_0

    :goto_1
    invoke-static {v8}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    move/from16 v7, p6

    invoke-virtual {p4, v8, v7}, LE0/u;->z(FZ)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object v0, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    invoke-direct/range {v0 .. v8}, LE0/c0;->O2(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V

    goto :goto_2

    :cond_4
    move/from16 v7, p6

    :cond_5
    move-object v0, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    invoke-direct/range {v0 .. v8}, LE0/c0;->p3(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZF)V

    :cond_6
    :goto_2
    return-void
.end method

.method public Q2(LE0/c0$f;JLE0/u;ZZ)V
    .locals 7

    iget-object v6, p0, LE0/c0;->s:LE0/c0;

    if-eqz v6, :cond_0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-wide v1, p2

    invoke-static/range {v0 .. v5}, LE0/c0;->v2(LE0/c0;JZILjava/lang/Object;)J

    move-result-wide v2

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, LE0/c0;->P2(LE0/c0$f;JLE0/u;ZZ)V

    :cond_0
    return-void
.end method

.method public R1()V
    .locals 4

    iget-object v0, p0, LE0/c0;->N:Lp0/c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v1

    iget v3, p0, LE0/c0;->D:F

    invoke-virtual {p0, v1, v2, v3, v0}, LE0/c0;->L0(JFLp0/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v0

    iget v2, p0, LE0/c0;->D:F

    iget-object v3, p0, LE0/c0;->w:Lmh/l;

    invoke-virtual {p0, v0, v1, v2, v3}, LE0/c0;->K0(JFLmh/l;)V

    :goto_0
    return-void
.end method

.method public R2()V
    .locals 1

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LE0/l0;->invalidate()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LE0/c0;->t:LE0/c0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/c0;->R2()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected final S2(J)Z
    .locals 2

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v0

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float v1, v0, p2

    if-ltz v1, :cond_0

    cmpl-float p2, p1, p2

    if-ltz p2, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->G0()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->D0()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p1, p1, p2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final T2()Z
    .locals 2

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_0

    iget v0, p0, LE0/c0;->z:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, LE0/c0;->t:LE0/c0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/c0;->T2()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public V(LC0/r;JZ)J
    .locals 1

    instance-of v0, p1, LC0/z;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LC0/z;

    invoke-virtual {v0}, LC0/z;->a()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->V2()V

    invoke-static {p2, p3}, Ll0/g;->u(J)J

    move-result-wide p2

    invoke-interface {p1, p0, p2, p3, p4}, LC0/r;->V(LC0/r;JZ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ll0/g;->u(J)J

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-direct {p0, p1}, LE0/c0;->q3(LC0/r;)LE0/c0;

    move-result-object p1

    invoke-virtual {p1}, LE0/c0;->V2()V

    invoke-virtual {p0, p1}, LE0/c0;->t2(LE0/c0;)LE0/c0;

    move-result-object v0

    :goto_0
    if-eq p1, v0, :cond_1

    invoke-virtual {p1, p2, p3, p4}, LE0/c0;->r3(JZ)J

    move-result-wide p2

    iget-object p1, p1, LE0/c0;->t:LE0/c0;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0, p2, p3, p4}, LE0/c0;->m2(LE0/c0;JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final V2()V
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->U()LE0/L;

    move-result-object v0

    invoke-virtual {v0}, LE0/L;->S()V

    return-void
.end method

.method public W(J)J
    .locals 3

    invoke-virtual {p0}, LE0/c0;->M()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, LC0/s;->d(LC0/r;)LC0/r;

    move-result-object v0

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v1

    invoke-static {v1}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v1

    invoke-interface {v1, p1, p2}, LE0/m0;->e(J)J

    move-result-wide p1

    invoke-static {v0}, LC0/s;->e(LC0/r;)J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ll0/g;->q(JJ)J

    move-result-wide p1

    invoke-virtual {p0, v0, p1, p2}, LE0/c0;->b0(LC0/r;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public W2()V
    .locals 1

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LE0/l0;->invalidate()V

    :cond_0
    return-void
.end method

.method public final X2()V
    .locals 2

    iget-object v0, p0, LE0/c0;->w:Lmh/l;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, LE0/c0;->w3(Lmh/l;Z)V

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LE0/l0;->invalidate()V

    :cond_0
    return-void
.end method

.method protected Y2(II)V
    .locals 9

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, LY0/s;->a(II)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, LE0/l0;->f(J)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LE0/c0;->t:LE0/c0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/c0;->R2()V

    :cond_1
    :goto_0
    invoke-static {p1, p2}, LY0/s;->a(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/t;->Q0(J)V

    iget-object p1, p0, LE0/c0;->w:Lmh/l;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    invoke-direct {p0, p2}, LE0/c0;->y3(Z)V

    :cond_2
    const/4 p1, 0x4

    invoke-static {p1}, LE0/e0;->a(I)I

    move-result p1

    invoke-static {p1}, LE0/f0;->i(I)Z

    move-result v0

    invoke-virtual {p0}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v1

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    if-nez v1, :cond_4

    goto/16 :goto_7

    :cond_4
    :goto_1
    invoke-static {p0, v0}, LE0/c0;->f2(LE0/c0;Z)Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->a2()I

    move-result v2

    and-int/2addr v2, p1

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v2, p1

    if-eqz v2, :cond_c

    const/4 v2, 0x0

    move-object v3, v0

    move-object v4, v2

    :goto_3
    if-eqz v3, :cond_c

    instance-of v5, v3, LE0/r;

    if-eqz v5, :cond_5

    check-cast v3, LE0/r;

    invoke-interface {v3}, LE0/r;->H0()V

    goto :goto_6

    :cond_5
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->f2()I

    move-result v5

    and-int/2addr v5, p1

    if-eqz v5, :cond_b

    instance-of v5, v3, LE0/m;

    if-eqz v5, :cond_b

    move-object v5, v3

    check-cast v5, LE0/m;

    invoke-virtual {v5}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v5

    move v6, p2

    :goto_4
    const/4 v7, 0x1

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v8, p1

    if-eqz v8, :cond_9

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_6

    move-object v3, v5

    goto :goto_5

    :cond_6
    if-nez v4, :cond_7

    new-instance v4, LV/b;

    const/16 v7, 0x10

    new-array v7, v7, [Landroidx/compose/ui/e$c;

    invoke-direct {v4, v7, p2}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_7
    if-eqz v3, :cond_8

    invoke-virtual {v4, v3}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v3, v2

    :cond_8
    invoke-virtual {v4, v5}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_9
    :goto_5
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_4

    :cond_a
    if-ne v6, v7, :cond_b

    goto :goto_3

    :cond_b
    :goto_6
    invoke-static {v4}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v3

    goto :goto_3

    :cond_c
    if-eq v0, v1, :cond_d

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_2

    :cond_d
    :goto_7
    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->n0()LE0/m0;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p2

    invoke-interface {p1, p2}, LE0/m0;->b(LE0/G;)V

    :cond_e
    return-void
.end method

.method public Z0()LE0/P;
    .locals 1

    iget-object v0, p0, LE0/c0;->s:LE0/c0;

    return-object v0
.end method

.method public final Z2()V
    .locals 15

    const/4 v0, 0x1

    const/16 v1, 0x80

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v2

    invoke-direct {p0, v2}, LE0/c0;->K2(I)Z

    move-result v2

    if-eqz v2, :cond_c

    sget-object v2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v6

    :try_start_0
    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-static {v1}, LE0/f0;->i(I)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {p0}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v8

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    invoke-virtual {p0}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v8

    if-nez v8, :cond_2

    goto/16 :goto_7

    :cond_2
    :goto_1
    invoke-static {p0, v7}, LE0/c0;->f2(LE0/c0;Z)Landroidx/compose/ui/e$c;

    move-result-object v7

    :goto_2
    if-eqz v7, :cond_b

    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->a2()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_b

    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_a

    move-object v10, v4

    move-object v9, v7

    :goto_3
    if-eqz v9, :cond_a

    instance-of v11, v9, LE0/A;

    if-eqz v11, :cond_3

    check-cast v9, LE0/A;

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->E0()J

    move-result-wide v11

    invoke-interface {v9, v11, v12}, LE0/A;->a0(J)V

    goto :goto_6

    :cond_3
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v1

    if-eqz v11, :cond_9

    instance-of v11, v9, LE0/m;

    if-eqz v11, :cond_9

    move-object v11, v9

    check-cast v11, LE0/m;

    invoke-virtual {v11}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v11

    const/4 v12, 0x0

    move v13, v12

    :goto_4
    if-eqz v11, :cond_8

    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->f2()I

    move-result v14

    and-int/2addr v14, v1

    if-eqz v14, :cond_7

    add-int/2addr v13, v0

    if-ne v13, v0, :cond_4

    move-object v9, v11

    goto :goto_5

    :cond_4
    if-nez v10, :cond_5

    new-instance v10, LV/b;

    const/16 v14, 0x10

    new-array v14, v14, [Landroidx/compose/ui/e$c;

    invoke-direct {v10, v14, v12}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz v9, :cond_6

    invoke-virtual {v10, v9}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v9, v4

    :cond_6
    invoke-virtual {v10, v11}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_7
    :goto_5
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v11

    goto :goto_4

    :cond_8
    if-ne v13, v0, :cond_9

    goto :goto_3

    :cond_9
    :goto_6
    invoke-static {v10}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v9

    goto :goto_3

    :cond_a
    if-eq v7, v8, :cond_b

    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v7

    goto :goto_2

    :cond_b
    :goto_7
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v3, v6, v5}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    goto :goto_9

    :goto_8
    invoke-virtual {v2, v3, v6, v5}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw v0

    :cond_c
    :goto_9
    return-void
.end method

.method public final a0()LC0/r;
    .locals 1

    invoke-virtual {p0}, LE0/c0;->M()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LE0/c0;->V2()V

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->m0()LE0/c0;

    move-result-object v0

    iget-object v0, v0, LE0/c0;->t:LE0/c0;

    return-object v0
.end method

.method public final a3()V
    .locals 11

    const/16 v0, 0x80

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-static {v0}, LE0/f0;->i(I)Z

    move-result v1

    invoke-virtual {p0}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v2

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v2

    if-nez v2, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-static {p0, v1}, LE0/c0;->f2(LE0/c0;Z)Landroidx/compose/ui/e$c;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->a2()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v1

    move-object v5, v3

    :goto_2
    if-eqz v4, :cond_9

    instance-of v6, v4, LE0/A;

    if-eqz v6, :cond_2

    check-cast v4, LE0/A;

    invoke-interface {v4, p0}, LE0/A;->Y1(LC0/r;)V

    goto :goto_5

    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_8

    instance-of v6, v4, LE0/m;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, LE0/m;

    invoke-virtual {v6}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_3
    const/4 v9, 0x1

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_3

    move-object v4, v6

    goto :goto_4

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, LV/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/e$c;

    invoke-direct {v5, v9, v7}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v4, v3

    :cond_5
    invoke-virtual {v5, v6}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_6
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto :goto_3

    :cond_7
    if-ne v8, v9, :cond_8

    goto :goto_2

    :cond_8
    :goto_5
    invoke-static {v5}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_2

    :cond_9
    if-eq v1, v2, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_1

    :cond_a
    :goto_6
    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 12

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->k0()LE0/a0;

    move-result-object v0

    const/16 v1, 0x40

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v2

    invoke-virtual {v0, v2}, LE0/a0;->q(I)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v3

    invoke-virtual {v3}, LE0/G;->k0()LE0/a0;

    move-result-object v3

    invoke-virtual {v3}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_8

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v4

    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->f2()I

    move-result v5

    and-int/2addr v4, v5

    if-eqz v4, :cond_7

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v4

    move-object v6, v2

    move-object v5, v3

    :goto_1
    if-eqz v5, :cond_7

    instance-of v7, v5, LE0/p0;

    if-eqz v7, :cond_0

    check-cast v5, LE0/p0;

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v7

    invoke-virtual {v7}, LE0/G;->K()LY0/d;

    move-result-object v7

    iget-object v8, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-interface {v5, v7, v8}, LE0/p0;->M(LY0/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_4

    :cond_0
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v7

    and-int/2addr v7, v4

    if-eqz v7, :cond_6

    instance-of v7, v5, LE0/m;

    if-eqz v7, :cond_6

    move-object v7, v5

    check-cast v7, LE0/m;

    invoke-virtual {v7}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v7

    const/4 v8, 0x0

    move v9, v8

    :goto_2
    const/4 v10, 0x1

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v4

    if-eqz v11, :cond_4

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v10, :cond_1

    move-object v5, v7

    goto :goto_3

    :cond_1
    if-nez v6, :cond_2

    new-instance v6, LV/b;

    const/16 v10, 0x10

    new-array v10, v10, [Landroidx/compose/ui/e$c;

    invoke-direct {v6, v10, v8}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v6, v5}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v5, v2

    :cond_3
    invoke-virtual {v6, v7}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v7

    goto :goto_2

    :cond_5
    if-ne v9, v10, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v6}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_1

    :cond_7
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v3

    goto :goto_0

    :cond_8
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-object v0

    :cond_9
    return-object v2
.end method

.method public b0(LC0/r;J)J
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, LE0/c0;->V(LC0/r;JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b3()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/c0;->u:Z

    iget-object v0, p0, LE0/c0;->H:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, LE0/c0;->h3()V

    return-void
.end method

.method public c1()LC0/r;
    .locals 0

    return-object p0
.end method

.method public abstract c3(Lm0/n0;Lp0/c;)V
.end method

.method public final e3(JFLmh/l;Lp0/c;)V
    .locals 8

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->A0()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/n;->l(JJ)J

    move-result-wide v3

    move-object v2, p0

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v2 .. v7}, LE0/c0;->d3(JFLmh/l;Lp0/c;)V

    return-void
.end method

.method public final f3(Ll0/e;ZZ)V
    .locals 6

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, LE0/c0;->v:Z

    if-eqz v1, :cond_2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, LE0/c0;->D2()J

    move-result-wide p2

    invoke-static {p2, p3}, Ll0/m;->i(J)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-static {p2, p3}, Ll0/m;->g(J)F

    move-result p2

    div-float/2addr p2, v2

    neg-float p3, v1

    neg-float v2, p2

    invoke-virtual {p0}, LE0/c0;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->g(J)I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v1

    invoke-virtual {p0}, LE0/c0;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/r;->f(J)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v1, p2

    invoke-virtual {p1, p3, v2, v3, v1}, Ll0/e;->e(FFFF)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, LE0/c0;->h()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/r;->g(J)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0}, LE0/c0;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->f(J)I

    move-result p3

    int-to-float p3, p3

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, p2, p3}, Ll0/e;->e(FFFF)V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll0/e;->f()Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    :cond_2
    const/4 p2, 0x0

    invoke-interface {v0, p1, p2}, LE0/l0;->k(Ll0/e;Z)V

    :cond_3
    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/n;->h(J)I

    move-result p2

    invoke-virtual {p1}, Ll0/e;->b()F

    move-result p3

    int-to-float p2, p2

    add-float/2addr p3, p2

    invoke-virtual {p1, p3}, Ll0/e;->i(F)V

    invoke-virtual {p1}, Ll0/e;->c()F

    move-result p3

    add-float/2addr p3, p2

    invoke-virtual {p1, p3}, Ll0/e;->j(F)V

    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/n;->i(J)I

    move-result p2

    invoke-virtual {p1}, Ll0/e;->d()F

    move-result p3

    int-to-float p2, p2

    add-float/2addr p3, p2

    invoke-virtual {p1, p3}, Ll0/e;->k(F)V

    invoke-virtual {p1}, Ll0/e;->a()F

    move-result p3

    add-float/2addr p3, p2

    invoke-virtual {p1, p3}, Ll0/e;->h(F)V

    return-void
.end method

.method public g1()Z
    .locals 1

    iget-object v0, p0, LE0/c0;->A:LC0/D;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getDensity()F
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->K()LY0/d;

    move-result-object v0

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->getLayoutDirection()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public final h()J
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->E0()J

    move-result-wide v0

    return-wide v0
.end method

.method public h0()Z
    .locals 1

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LE0/c0;->u:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->K0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h1()LC0/D;
    .locals 2

    iget-object v0, p0, LE0/c0;->A:LC0/D;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Asking for measurement result of unmeasured layout modifier"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h3()V
    .locals 4

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_1

    iget-object v0, p0, LE0/c0;->N:Lp0/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, LE0/c0;->N:Lp0/c;

    :cond_0
    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v1, v2, v0, v1}, LE0/c0;->x3(LE0/c0;Lmh/l;ZILjava/lang/Object;)V

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, LE0/G;->u1(LE0/G;ZILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final i3(Z)V
    .locals 0

    iput-boolean p1, p0, LE0/c0;->r:Z

    return-void
.end method

.method public final j3(Z)V
    .locals 0

    iput-boolean p1, p0, LE0/c0;->q:Z

    return-void
.end method

.method public k3(LC0/D;)V
    .locals 3

    iget-object v0, p0, LE0/c0;->A:LC0/D;

    if-eq p1, v0, :cond_5

    iput-object p1, p0, LE0/c0;->A:LC0/D;

    if-eqz v0, :cond_0

    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result v1

    invoke-interface {v0}, LC0/D;->getWidth()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result v1

    invoke-interface {v0}, LC0/D;->getHeight()I

    move-result v0

    if-eq v1, v0, :cond_1

    :cond_0
    invoke-interface {p1}, LC0/D;->getWidth()I

    move-result v0

    invoke-interface {p1}, LC0/D;->getHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1}, LE0/c0;->Y2(II)V

    :cond_1
    iget-object v0, p0, LE0/c0;->B:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-interface {p1}, LC0/D;->p()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    :cond_3
    invoke-interface {p1}, LC0/D;->p()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LE0/c0;->B:Ljava/util/Map;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, LE0/c0;->x2()LE0/b;

    move-result-object v0

    invoke-interface {v0}, LE0/b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->m()V

    iget-object v0, p0, LE0/c0;->B:Ljava/util/Map;

    if-nez v0, :cond_4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LE0/c0;->B:Ljava/util/Map;

    :cond_4
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-interface {p1}, LC0/D;->p()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_5
    return-void
.end method

.method protected l3(J)V
    .locals 0

    iput-wide p1, p0, LE0/c0;->C:J

    return-void
.end method

.method public final m3(LE0/c0;)V
    .locals 0

    iput-object p1, p0, LE0/c0;->s:LE0/c0;

    return-void
.end method

.method protected final n2(J)J
    .locals 2

    invoke-static {p1, p2}, Ll0/m;->i(J)F

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->G0()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-static {p1, p2}, Ll0/m;->g(J)F

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->D0()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr v0, p2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    div-float/2addr p1, p2

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {v0, p1}, Ll0/n;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public final n3(LE0/c0;)V
    .locals 0

    iput-object p1, p0, LE0/c0;->t:LE0/c0;

    return-void
.end method

.method public o0(J)J
    .locals 7

    invoke-virtual {p0}, LE0/c0;->M()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LE0/c0;->V2()V

    move-wide v2, p1

    move-object p1, p0

    :goto_0
    if-eqz p1, :cond_1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LE0/c0;->s3(LE0/c0;JZILjava/lang/Object;)J

    move-result-wide v2

    iget-object p1, p1, LE0/c0;->t:LE0/c0;

    goto :goto_0

    :cond_1
    return-wide v2
.end method

.method public o1()LE0/P;
    .locals 1

    iget-object v0, p0, LE0/c0;->t:LE0/c0;

    return-object v0
.end method

.method protected final o2(JJ)F
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->G0()I

    move-result v0

    int-to-float v0, v0

    invoke-static {p3, p4}, Ll0/m;->i(J)F

    move-result v1

    cmpl-float v0, v0, v1

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->D0()I

    move-result v0

    int-to-float v0, v0

    invoke-static {p3, p4}, Ll0/m;->g(J)F

    move-result v2

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p3, p4}, LE0/c0;->n2(J)J

    move-result-wide p3

    invoke-static {p3, p4}, Ll0/m;->i(J)F

    move-result v0

    invoke-static {p3, p4}, Ll0/m;->g(J)F

    move-result p3

    invoke-direct {p0, p1, p2}, LE0/c0;->U2(J)J

    move-result-wide p1

    const/4 p4, 0x0

    cmpl-float v2, v0, p4

    if-gtz v2, :cond_1

    cmpl-float p4, p3, p4

    if-lez p4, :cond_2

    :cond_1
    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p4

    cmpg-float p4, p4, v0

    if-gtz p4, :cond_2

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p4

    cmpg-float p3, p4, p3

    if-gtz p3, :cond_2

    invoke-static {p1, p2}, Ll0/g;->l(J)F

    move-result v1

    :cond_2
    return v1
.end method

.method public final o3()Z
    .locals 11

    const/16 v0, 0x10

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v1

    invoke-static {v1}, LE0/f0;->i(I)Z

    move-result v1

    invoke-direct {p0, v1}, LE0/c0;->M2(Z)Landroidx/compose/ui/e$c;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v3

    invoke-interface {v1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "visitLocalDescendants called on an unattached node"

    invoke-static {v4}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-interface {v1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->a2()I

    move-result v4

    and-int/2addr v4, v3

    if-eqz v4, :cond_a

    :goto_0
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v4

    and-int/2addr v4, v3

    if-eqz v4, :cond_9

    const/4 v4, 0x0

    move-object v5, v1

    move-object v6, v4

    :goto_1
    if-eqz v5, :cond_9

    instance-of v7, v5, LE0/s0;

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    check-cast v5, LE0/s0;

    invoke-interface {v5}, LE0/s0;->E1()Z

    move-result v5

    if-eqz v5, :cond_8

    return v8

    :cond_2
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v7

    and-int/2addr v7, v3

    if-eqz v7, :cond_8

    instance-of v7, v5, LE0/m;

    if-eqz v7, :cond_8

    move-object v7, v5

    check-cast v7, LE0/m;

    invoke-virtual {v7}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v7

    move v9, v2

    :goto_2
    if-eqz v7, :cond_7

    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v3

    if-eqz v10, :cond_6

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v8, :cond_3

    move-object v5, v7

    goto :goto_3

    :cond_3
    if-nez v6, :cond_4

    new-instance v6, LV/b;

    new-array v10, v0, [Landroidx/compose/ui/e$c;

    invoke-direct {v6, v10, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v5, :cond_5

    invoke-virtual {v6, v5}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v5, v4

    :cond_5
    invoke-virtual {v6, v7}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_6
    :goto_3
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v7

    goto :goto_2

    :cond_7
    if-ne v9, v8, :cond_8

    goto :goto_1

    :cond_8
    invoke-static {v6}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_1

    :cond_9
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_0

    :cond_a
    return v2
.end method

.method public final p2(Lm0/n0;Lp0/c;)V
    .locals 3

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, LE0/l0;->d(Lm0/n0;Lp0/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/n;->i(J)I

    move-result v1

    int-to-float v1, v1

    invoke-interface {p1, v0, v1}, Lm0/n0;->c(FF)V

    invoke-direct {p0, p1, p2}, LE0/c0;->r2(Lm0/n0;Lp0/c;)V

    neg-float p2, v0

    neg-float v0, v1

    invoke-interface {p1, p2, v0}, Lm0/n0;->c(FF)V

    :goto_0
    return-void
.end method

.method protected final q2(Lm0/n0;Lm0/S0;)V
    .locals 5

    new-instance v0, Ll0/i;

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->E0()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->E0()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->f(J)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v2

    invoke-direct {v0, v2, v2, v1, v3}, Ll0/i;-><init>(FFFF)V

    invoke-interface {p1, v0, p2}, Lm0/n0;->v(Ll0/i;Lm0/S0;)V

    return-void
.end method

.method public r(J)J
    .locals 1

    invoke-virtual {p0}, LE0/c0;->M()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-static {v0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ly0/M;->r(J)J

    move-result-wide p1

    invoke-static {p0}, LC0/s;->d(LC0/r;)LC0/r;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, LE0/c0;->b0(LC0/r;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public r1()J
    .locals 2

    iget-wide v0, p0, LE0/c0;->C:J

    return-wide v0
.end method

.method public r3(JZ)J
    .locals 2

    iget-object v0, p0, LE0/c0;->J:LE0/l0;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, LE0/l0;->e(JZ)J

    move-result-wide p1

    :cond_0
    if-nez p3, :cond_1

    invoke-virtual {p0}, LE0/P;->J1()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/o;->c(JJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public abstract s2()V
.end method

.method public final t2(LE0/c0;)LE0/c0;
    .locals 4

    invoke-virtual {p1}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {p0}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, LE0/e0;->a(I)I

    move-result v2

    invoke-interface {v1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "visitLocalAncestors called on an unattached node"

    invoke-static {v3}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-interface {v1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v3

    and-int/2addr v3, v2

    if-eqz v3, :cond_1

    if-ne v1, v0, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_0

    :cond_2
    return-object p0

    :cond_3
    :goto_1
    invoke-virtual {v0}, LE0/G;->L()I

    move-result v2

    invoke-virtual {v1}, LE0/G;->L()I

    move-result v3

    if-le v2, v3, :cond_4

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    :goto_2
    invoke-virtual {v1}, LE0/G;->L()I

    move-result v2

    invoke-virtual {v0}, LE0/G;->L()I

    move-result v3

    if-le v2, v3, :cond_5

    invoke-virtual {v1}, LE0/G;->o0()LE0/G;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    :goto_3
    if-eq v0, v1, :cond_7

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    invoke-virtual {v1}, LE0/G;->o0()LE0/G;

    move-result-object v1

    if-eqz v0, :cond_6

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "layouts are not part of the same hierarchy"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v2

    if-ne v1, v2, :cond_8

    move-object p1, p0

    goto :goto_4

    :cond_8
    invoke-virtual {p1}, LE0/c0;->G1()LE0/G;

    move-result-object v1

    if-ne v0, v1, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v0}, LE0/G;->P()LE0/c0;

    move-result-object p1

    :goto_4
    return-object p1
.end method

.method public final t3()Ll0/i;
    .locals 6

    invoke-virtual {p0}, LE0/c0;->M()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {p0}, LC0/s;->d(LC0/r;)LC0/r;

    move-result-object v0

    invoke-virtual {p0}, LE0/c0;->E2()Ll0/e;

    move-result-object v1

    invoke-virtual {p0}, LE0/c0;->D2()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LE0/c0;->n2(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v4

    neg-float v4, v4

    invoke-virtual {v1, v4}, Ll0/e;->i(F)V

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v4

    neg-float v4, v4

    invoke-virtual {v1, v4}, Ll0/e;->k(F)V

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->G0()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v5

    add-float/2addr v4, v5

    invoke-virtual {v1, v4}, Ll0/e;->j(F)V

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->D0()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v2

    add-float/2addr v4, v2

    invoke-virtual {v1, v4}, Ll0/e;->h(F)V

    move-object v2, p0

    :goto_0
    if-eq v2, v0, :cond_2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v2, v1, v3, v4}, LE0/c0;->f3(Ll0/e;ZZ)V

    invoke-virtual {v1}, Ll0/e;->f()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v2, v2, LE0/c0;->t:LE0/c0;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {v1}, Ll0/f;->a(Ll0/e;)Ll0/i;

    move-result-object v0

    return-object v0
.end method

.method public u2(JZ)J
    .locals 2

    if-nez p3, :cond_0

    invoke-virtual {p0}, LE0/P;->J1()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/o;->b(JJ)J

    move-result-wide p1

    :goto_0
    iget-object p3, p0, LE0/c0;->J:LE0/l0;

    if-eqz p3, :cond_1

    const/4 v0, 0x1

    invoke-interface {p3, p1, p2, v0}, LE0/l0;->e(JZ)J

    move-result-wide p1

    :cond_1
    return-wide p1
.end method

.method public final w3(Lmh/l;Z)V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iget-object v2, p0, LE0/c0;->N:Lp0/c;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    if-nez v2, :cond_2

    const-string v2, "layerBlock can\'t be provided when explicitLayer is provided"

    invoke-static {v2}, LB0/a;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v2

    if-nez p2, :cond_4

    iget-object p2, p0, LE0/c0;->w:Lmh/l;

    if-ne p2, p1, :cond_4

    iget-object p2, p0, LE0/c0;->x:LY0/d;

    invoke-virtual {v2}, LE0/G;->K()LY0/d;

    move-result-object v3

    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, LE0/c0;->y:LY0/t;

    invoke-virtual {v2}, LE0/G;->getLayoutDirection()LY0/t;

    move-result-object v3

    if-eq p2, v3, :cond_3

    goto :goto_2

    :cond_3
    move p2, v0

    goto :goto_3

    :cond_4
    :goto_2
    move p2, v1

    :goto_3
    invoke-virtual {v2}, LE0/G;->K()LY0/d;

    move-result-object v3

    iput-object v3, p0, LE0/c0;->x:LY0/d;

    invoke-virtual {v2}, LE0/G;->getLayoutDirection()LY0/t;

    move-result-object v3

    iput-object v3, p0, LE0/c0;->y:LY0/t;

    invoke-virtual {v2}, LE0/G;->K0()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    if-eqz p1, :cond_6

    iput-object p1, p0, LE0/c0;->w:Lmh/l;

    iget-object p1, p0, LE0/c0;->J:LE0/l0;

    if-nez p1, :cond_5

    invoke-static {v2}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v5

    iget-object v6, p0, LE0/c0;->G:Lmh/p;

    iget-object v7, p0, LE0/c0;->H:Lmh/a;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, LE0/m0;->n(LE0/m0;Lmh/p;Lmh/a;Lp0/c;ILjava/lang/Object;)LE0/l0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->E0()J

    move-result-wide v5

    invoke-interface {p1, v5, v6}, LE0/l0;->f(J)V

    invoke-virtual {p0}, LE0/c0;->r1()J

    move-result-wide v5

    invoke-interface {p1, v5, v6}, LE0/l0;->i(J)V

    iput-object p1, p0, LE0/c0;->J:LE0/l0;

    invoke-static {p0, v0, v1, v4}, LE0/c0;->z3(LE0/c0;ZILjava/lang/Object;)V

    invoke-virtual {v2, v1}, LE0/G;->B1(Z)V

    iget-object p1, p0, LE0/c0;->H:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_4

    :cond_5
    if-eqz p2, :cond_8

    invoke-static {p0, v0, v1, v4}, LE0/c0;->z3(LE0/c0;ZILjava/lang/Object;)V

    goto :goto_4

    :cond_6
    iput-object v4, p0, LE0/c0;->w:Lmh/l;

    iget-object p1, p0, LE0/c0;->J:LE0/l0;

    if-eqz p1, :cond_7

    invoke-interface {p1}, LE0/l0;->destroy()V

    invoke-virtual {v2, v1}, LE0/G;->B1(Z)V

    iget-object p1, p0, LE0/c0;->H:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, LE0/c0;->M()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {v2}, LE0/G;->n0()LE0/m0;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1, v2}, LE0/m0;->b(LE0/G;)V

    :cond_7
    iput-object v4, p0, LE0/c0;->J:LE0/l0;

    iput-boolean v0, p0, LE0/c0;->I:Z

    :cond_8
    :goto_4
    return-void
.end method

.method public x2()LE0/b;
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->U()LE0/L;

    move-result-object v0

    invoke-virtual {v0}, LE0/L;->r()LE0/b;

    move-result-object v0

    return-object v0
.end method

.method public y()F
    .locals 1

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->K()LY0/d;

    move-result-object v0

    invoke-interface {v0}, LY0/l;->y()F

    move-result v0

    return v0
.end method

.method public final y2()Z
    .locals 1

    iget-boolean v0, p0, LE0/c0;->r:Z

    return v0
.end method

.method public z(LC0/r;[F)V
    .locals 1

    invoke-direct {p0, p1}, LE0/c0;->q3(LC0/r;)LE0/c0;

    move-result-object p1

    invoke-virtual {p1}, LE0/c0;->V2()V

    invoke-virtual {p0, p1}, LE0/c0;->t2(LE0/c0;)LE0/c0;

    move-result-object v0

    invoke-static {p2}, Lm0/O0;->h([F)V

    invoke-direct {p1, v0, p2}, LE0/c0;->v3(LE0/c0;[F)V

    invoke-direct {p0, v0, p2}, LE0/c0;->u3(LE0/c0;[F)V

    return-void
.end method

.method public final z2()Z
    .locals 1

    iget-boolean v0, p0, LE0/c0;->I:Z

    return v0
.end method
