.class public final LI/c1;
.super LE0/m;
.source "SourceFile"

# interfaces
.implements LE0/B;
.implements LE0/r;
.implements LE0/h;
.implements LE0/t;
.implements LE0/v0;


# instance fields
.field private A:LL0/S;

.field private B:Ll0/i;

.field private C:I

.field private final D:LJ/f;

.field private p:Z

.field private q:Z

.field private r:LI/l1;

.field private s:LI/o1;

.field private t:LJ/j;

.field private u:Lm0/l0;

.field private v:Z

.field private w:Landroidx/compose/foundation/o;

.field private x:Lw/q;

.field private final y:LI/G;

.field private z:LIi/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZZLI/l1;LI/o1;LJ/j;Lm0/l0;ZLandroidx/compose/foundation/o;Lw/q;)V
    .locals 0

    invoke-direct {p0}, LE0/m;-><init>()V

    iput-boolean p1, p0, LI/c1;->p:Z

    iput-boolean p2, p0, LI/c1;->q:Z

    iput-object p3, p0, LI/c1;->r:LI/l1;

    iput-object p4, p0, LI/c1;->s:LI/o1;

    iput-object p5, p0, LI/c1;->t:LJ/j;

    iput-object p6, p0, LI/c1;->u:Lm0/l0;

    iput-boolean p7, p0, LI/c1;->v:Z

    iput-object p8, p0, LI/c1;->w:Landroidx/compose/foundation/o;

    iput-object p9, p0, LI/c1;->x:Lw/q;

    new-instance p1, LI/G;

    invoke-direct {p1}, LI/G;-><init>()V

    iput-object p1, p0, LI/c1;->y:LI/G;

    new-instance p1, Ll0/i;

    const/high16 p2, -0x40800000    # -1.0f

    invoke-direct {p1, p2, p2, p2, p2}, Ll0/i;-><init>(FFFF)V

    iput-object p1, p0, LI/c1;->B:Ll0/i;

    iget-object p1, p0, LI/c1;->s:LI/o1;

    iget-object p2, p0, LI/c1;->t:LJ/j;

    iget-object p3, p0, LI/c1;->r:LI/l1;

    iget-boolean p4, p0, LI/c1;->p:Z

    if-nez p4, :cond_1

    iget-boolean p4, p0, LI/c1;->q:Z

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p4, 0x1

    :goto_1
    invoke-static {p1, p2, p3, p4}, LJ/a;->a(LI/o1;LJ/j;LI/l1;Z)LJ/f;

    move-result-object p1

    invoke-virtual {p0, p1}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object p1

    check-cast p1, LJ/f;

    iput-object p1, p0, LI/c1;->D:LJ/f;

    return-void
.end method

.method public static final synthetic J2(LI/c1;)LI/G;
    .locals 0

    iget-object p0, p0, LI/c1;->y:LI/G;

    return-object p0
.end method

.method public static final synthetic K2(LI/c1;)Landroidx/compose/foundation/o;
    .locals 0

    iget-object p0, p0, LI/c1;->w:Landroidx/compose/foundation/o;

    return-object p0
.end method

.method public static final synthetic L2(LI/c1;)LI/o1;
    .locals 0

    iget-object p0, p0, LI/c1;->s:LI/o1;

    return-object p0
.end method

.method public static final synthetic M2(LI/c1;)LI/l1;
    .locals 0

    iget-object p0, p0, LI/c1;->r:LI/l1;

    return-object p0
.end method

.method public static final synthetic N2(LI/c1;LY0/d;IIJLY0/t;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LI/c1;->Y2(LY0/d;IIJLY0/t;)V

    return-void
.end method

.method private final O2(JI)I
    .locals 4

    iget-object v0, p0, LI/c1;->A:LL0/S;

    if-eqz v0, :cond_2

    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result v1

    invoke-virtual {v0}, LL0/S;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result v0

    if-ne v1, v0, :cond_2

    iget-object v0, p0, LI/c1;->A:LL0/S;

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result v1

    invoke-virtual {v0}, LL0/S;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result v0

    if-ne v1, v0, :cond_1

    iget v0, p0, LI/c1;->C:I

    if-eq p3, v0, :cond_0

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result p1

    :goto_0
    return p1
.end method

.method private final P2(Lo0/f;)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LI/c1;->y:LI/G;

    invoke-virtual {v1}, LI/G;->d()F

    move-result v11

    const/4 v1, 0x0

    cmpg-float v1, v11, v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct/range {p0 .. p0}, LI/c1;->T2()Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v1, v0, LI/c1;->t:LJ/j;

    invoke-virtual {v1}, LJ/j;->T()Ll0/i;

    move-result-object v1

    iget-object v3, v0, LI/c1;->u:Lm0/l0;

    invoke-virtual {v1}, Ll0/i;->o()J

    move-result-wide v4

    invoke-virtual {v1}, Ll0/i;->f()J

    move-result-wide v6

    invoke-virtual {v1}, Ll0/i;->r()F

    move-result v8

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v15}, Lo0/f;->i0(Lo0/f;Lm0/l0;JJFILm0/V0;FLm0/w0;IILjava/lang/Object;)V

    return-void
.end method

.method private final Q2(Lo0/f;LYg/s;LL0/M;)V
    .locals 12

    invoke-virtual {p2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH/n;

    invoke-virtual {v0}, LH/n;->i()I

    move-result v0

    invoke-virtual {p2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LL0/S;

    invoke-virtual {p2}, LL0/S;->r()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-static {v1, v2}, LL0/S;->l(J)I

    move-result p2

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result v1

    invoke-virtual {p3, p2, v1}, LL0/M;->z(II)Lm0/U0;

    move-result-object v3

    sget-object p2, LH/n;->b:LH/n$a;

    invoke-virtual {p2}, LH/n$a;->a()I

    move-result p2

    invoke-static {v0, p2}, LH/n;->f(II)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p3}, LL0/M;->l()LL0/L;

    move-result-object p2

    invoke-virtual {p2}, LL0/L;->i()LL0/U;

    move-result-object p2

    invoke-virtual {p2}, LL0/U;->g()Lm0/l0;

    move-result-object v4

    if-eqz v4, :cond_1

    const/16 v9, 0x38

    const/4 v10, 0x0

    const v5, 0x3e4ccccd    # 0.2f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v10}, Lo0/f;->R0(Lo0/f;Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;IILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-virtual {p3}, LL0/M;->l()LL0/L;

    move-result-object p2

    invoke-virtual {p2}, LL0/L;->i()LL0/U;

    move-result-object p2

    invoke-virtual {p2}, LL0/U;->h()J

    move-result-wide p2

    const-wide/16 v0, 0x10

    cmp-long v0, p2, v0

    if-eqz v0, :cond_2

    :goto_0
    move-wide v4, p2

    goto :goto_1

    :cond_2
    sget-object p2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p2}, Lm0/v0$a;->a()J

    move-result-wide p2

    goto :goto_0

    :goto_1
    invoke-static {v4, v5}, Lm0/v0;->n(J)F

    move-result p2

    const p3, 0x3e4ccccd    # 0.2f

    mul-float v6, p2, p3

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    const/16 v10, 0x3c

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v11}, Lo0/f;->C1(Lo0/f;Lm0/U0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {}, LM/L;->b()LT/H0;

    move-result-object p2

    invoke-static {p0, p2}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LM/K;

    invoke-virtual {p2}, LM/K;->a()J

    move-result-wide v4

    const/16 v10, 0x3c

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v11}, Lo0/f;->C1(Lo0/f;Lm0/U0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :goto_2
    return-void
.end method

.method private final R2(Lo0/f;JLL0/M;)V
    .locals 11

    invoke-static {p2, p3}, LL0/S;->l(J)I

    move-result v0

    invoke-static {p2, p3}, LL0/S;->k(J)I

    move-result p2

    if-eq v0, p2, :cond_0

    invoke-static {}, LM/L;->b()LT/H0;

    move-result-object p3

    invoke-static {p0, p3}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LM/K;

    invoke-virtual {p3}, LM/K;->a()J

    move-result-wide v3

    invoke-virtual {p4, v0, p2}, LL0/M;->z(II)Lm0/U0;

    move-result-object v2

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lo0/f;->C1(Lo0/f;Lm0/U0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final S2(Lo0/f;LL0/M;)V
    .locals 1

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object p1

    invoke-interface {p1}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    sget-object v0, LL0/Q;->a:LL0/Q;

    invoke-virtual {v0, p1, p2}, LL0/Q;->a(Lm0/n0;LL0/M;)V

    return-void
.end method

.method private final T2()Z
    .locals 1

    iget-boolean v0, p0, LI/c1;->v:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LI/c1;->p:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, LI/c1;->q:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, LI/c1;->u:Lm0/l0;

    invoke-static {v0}, LI/b1;->b(Lm0/l0;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final U2(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 8

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v0, p3

    invoke-static/range {v0 .. v7}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result p3

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    new-instance v5, LI/c1$a;

    invoke-direct {v5, p0, p1, v2, p2}, LI/c1$a;-><init>(LI/c1;Landroidx/compose/ui/layout/m;ILandroidx/compose/ui/layout/t;)V

    const/4 v6, 0x4

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method private final V2(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 8

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x7fffffff

    move-wide v0, p3

    invoke-static/range {v0 .. v7}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    new-instance v5, LI/c1$b;

    invoke-direct {v5, p0, p1, v3, p2}, LI/c1$b;-><init>(LI/c1;Landroidx/compose/ui/layout/m;ILandroidx/compose/ui/layout/t;)V

    const/4 v6, 0x4

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method private final W2()V
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v0

    new-instance v3, LI/c1$c;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, LI/c1$c;-><init>(LI/c1;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object v0

    iput-object v0, p0, LI/c1;->z:LIi/y0;

    return-void
.end method

.method private final Y2(LY0/d;IIJLY0/t;)V
    .locals 8

    sub-int v0, p3, p2

    iget-object v1, p0, LI/c1;->w:Landroidx/compose/foundation/o;

    invoke-virtual {v1, v0}, Landroidx/compose/foundation/o;->n(I)V

    invoke-direct {p0, p4, p5, p3}, LI/c1;->O2(JI)I

    move-result v0

    if-ltz v0, :cond_a

    invoke-direct {p0}, LI/c1;->T2()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v1, p0, LI/c1;->r:LI/l1;

    invoke-virtual {v1}, LI/l1;->f()LL0/M;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    new-instance v2, Lsh/i;

    invoke-virtual {v1}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->j()LL0/d;

    move-result-object v3

    invoke-virtual {v3}, LL0/d;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3}, Lsh/i;-><init>(II)V

    invoke-static {v0, v2}, Lsh/m;->l(ILsh/f;)I

    move-result v0

    invoke-virtual {v1, v0}, LL0/M;->e(I)Ll0/i;

    move-result-object v0

    sget-object v1, LY0/t;->Rtl:LY0/t;

    const/4 v2, 0x1

    if-ne p6, v1, :cond_2

    move p6, v2

    goto :goto_0

    :cond_2
    move p6, v4

    :goto_0
    invoke-static {p1, v0, p6, p3}, LI/b1;->a(LY0/d;Ll0/i;ZI)Ll0/i;

    move-result-object p1

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result p6

    iget-object v1, p0, LI/c1;->B:Ll0/i;

    invoke-virtual {v1}, Ll0/i;->k()F

    move-result v1

    cmpg-float p6, p6, v1

    if-nez p6, :cond_3

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result p6

    iget-object v1, p0, LI/c1;->B:Ll0/i;

    invoke-virtual {v1}, Ll0/i;->n()F

    move-result v1

    cmpg-float p6, p6, v1

    if-nez p6, :cond_3

    iget p6, p0, LI/c1;->C:I

    if-eq p3, p6, :cond_a

    :cond_3
    iget-object p6, p0, LI/c1;->x:Lw/q;

    sget-object v1, Lw/q;->Vertical:Lw/q;

    if-ne p6, v1, :cond_4

    move v4, v2

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result p6

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Ll0/i;->k()F

    move-result p6

    :goto_1
    if-eqz v4, :cond_6

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result v1

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v1

    :goto_2
    iget-object v2, p0, LI/c1;->w:Landroidx/compose/foundation/o;

    invoke-virtual {v2}, Landroidx/compose/foundation/o;->m()I

    move-result v2

    add-int v3, v2, p2

    int-to-float v3, v3

    cmpl-float v4, v1, v3

    if-lez v4, :cond_7

    :goto_3
    sub-float/2addr v1, v3

    goto :goto_4

    :cond_7
    int-to-float v2, v2

    cmpg-float v4, p6, v2

    if-gez v4, :cond_8

    sub-float v5, v1, p6

    int-to-float v6, p2

    cmpl-float v5, v5, v6

    if-lez v5, :cond_8

    goto :goto_3

    :cond_8
    if-gez v4, :cond_9

    sub-float/2addr v1, p6

    int-to-float p2, p2

    cmpg-float p2, v1, p2

    if-gtz p2, :cond_9

    sub-float v1, p6, v2

    goto :goto_4

    :cond_9
    const/4 v1, 0x0

    :goto_4
    invoke-static {p4, p5}, LL0/S;->b(J)LL0/S;

    move-result-object p2

    iput-object p2, p0, LI/c1;->A:LL0/S;

    iput-object p1, p0, LI/c1;->B:Ll0/i;

    iput p3, p0, LI/c1;->C:I

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v2

    sget-object v4, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v5, LI/c1$d;

    const/4 p1, 0x0

    invoke-direct {v5, p0, v1, v0, p1}, LI/c1$d;-><init>(LI/c1;FLl0/i;Ldh/e;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_a
    :goto_5
    return-void
.end method


# virtual methods
.method public B(LC0/r;)V
    .locals 1

    iget-object v0, p0, LI/c1;->r:LI/l1;

    invoke-virtual {v0, p1}, LI/l1;->m(LC0/r;)V

    iget-object v0, p0, LI/c1;->D:LJ/f;

    invoke-virtual {v0, p1}, LJ/f;->B(LC0/r;)V

    return-void
.end method

.method public J(Lo0/c;)V
    .locals 4

    invoke-interface {p1}, Lo0/c;->X1()V

    iget-object v0, p0, LI/c1;->s:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    iget-object v1, p0, LI/c1;->r:LI/l1;

    invoke-virtual {v1}, LI/l1;->f()LL0/M;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, LH/h;->d()LYg/s;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-direct {p0, p1, v2, v1}, LI/c1;->Q2(Lo0/f;LYg/s;LL0/M;)V

    :cond_1
    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0, p1, v1}, LI/c1;->S2(Lo0/f;LL0/M;)V

    invoke-virtual {v0}, LH/h;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1}, LI/c1;->P2(Lo0/f;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LH/h;->h()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v2

    invoke-direct {p0, p1, v2, v3, v1}, LI/c1;->R2(Lo0/f;JLL0/M;)V

    :cond_3
    invoke-direct {p0, p1, v1}, LI/c1;->S2(Lo0/f;LL0/M;)V

    :cond_4
    :goto_0
    iget-object v0, p0, LI/c1;->D:LJ/f;

    invoke-virtual {v0, p1}, LJ/f;->J(Lo0/c;)V

    return-void
.end method

.method public final X2(ZZLI/l1;LI/o1;LJ/j;Lm0/l0;ZLandroidx/compose/foundation/o;Lw/q;)V
    .locals 6

    invoke-direct {p0}, LI/c1;->T2()Z

    move-result v0

    iget-boolean v1, p0, LI/c1;->p:Z

    iget-object v2, p0, LI/c1;->s:LI/o1;

    iget-object v3, p0, LI/c1;->r:LI/l1;

    iget-object v4, p0, LI/c1;->t:LJ/j;

    iget-object v5, p0, LI/c1;->w:Landroidx/compose/foundation/o;

    iput-boolean p1, p0, LI/c1;->p:Z

    iput-boolean p2, p0, LI/c1;->q:Z

    iput-object p3, p0, LI/c1;->r:LI/l1;

    iput-object p4, p0, LI/c1;->s:LI/o1;

    iput-object p5, p0, LI/c1;->t:LJ/j;

    iput-object p6, p0, LI/c1;->u:Lm0/l0;

    iput-boolean p7, p0, LI/c1;->v:Z

    iput-object p8, p0, LI/c1;->w:Landroidx/compose/foundation/o;

    iput-object p9, p0, LI/c1;->x:Lw/q;

    iget-object p6, p0, LI/c1;->D:LJ/f;

    const/4 p7, 0x1

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, p7

    :goto_1
    invoke-virtual {p6, p4, p5, p3, p1}, LJ/f;->J2(LI/o1;LJ/j;LI/l1;Z)V

    invoke-direct {p0}, LI/c1;->T2()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, LI/c1;->z:LIi/y0;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    invoke-static {p1, p2, p7, p2}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_2
    iput-object p2, p0, LI/c1;->z:LIi/y0;

    iget-object p1, p0, LI/c1;->y:LI/G;

    invoke-virtual {p1}, LI/G;->c()V

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_4

    invoke-static {v2, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    if-nez v0, :cond_5

    :cond_4
    invoke-direct {p0}, LI/c1;->W2()V

    :cond_5
    :goto_2
    invoke-static {v2, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {v3, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {v4, p5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {v5, p8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    :cond_6
    invoke-static {p0}, LE0/E;->b(LE0/B;)V

    :cond_7
    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 2

    iget-object v0, p0, LI/c1;->x:Lw/q;

    sget-object v1, Lw/q;->Vertical:Lw/q;

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1, p2, p3, p4}, LI/c1;->V2(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LI/c1;->U2(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public n2()V
    .locals 1

    iget-boolean v0, p0, LI/c1;->p:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, LI/c1;->T2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LI/c1;->W2()V

    :cond_0
    return-void
.end method

.method public q(LJ0/w;)V
    .locals 1

    iget-object v0, p0, LI/c1;->D:LJ/f;

    invoke-virtual {v0, p1}, LJ/f;->q(LJ0/w;)V

    return-void
.end method
