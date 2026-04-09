.class final Landroidx/compose/animation/m;
.super Lq/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/m$a;
    }
.end annotation


# instance fields
.field private n:Lr/i;

.field private o:Lf0/c;

.field private p:Lmh/p;

.field private q:J

.field private r:J

.field private s:Z

.field private final t:LT/q0;


# direct methods
.method public constructor <init>(Lr/i;Lf0/c;Lmh/p;)V
    .locals 6

    invoke-direct {p0}, Lq/q;-><init>()V

    iput-object p1, p0, Landroidx/compose/animation/m;->n:Lr/i;

    iput-object p2, p0, Landroidx/compose/animation/m;->o:Lf0/c;

    iput-object p3, p0, Landroidx/compose/animation/m;->p:Lmh/p;

    invoke-static {}, Landroidx/compose/animation/f;->c()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/animation/m;->q:J

    const/16 v4, 0xf

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/animation/m;->r:J

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/animation/m;->t:LT/q0;

    return-void
.end method

.method private final M2(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/animation/m;->r:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/animation/m;->s:Z

    return-void
.end method

.method private final N2(J)J
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/animation/m;->s:Z

    if-eqz v0, :cond_0

    iget-wide p1, p0, Landroidx/compose/animation/m;->r:J

    :cond_0
    return-wide p1
.end method


# virtual methods
.method public final D2(J)J
    .locals 14

    move-wide v2, p1

    invoke-virtual {p0}, Landroidx/compose/animation/m;->F2()Landroidx/compose/animation/m$a;

    move-result-object v6

    const/4 v0, 0x1

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Landroidx/compose/animation/m$a;->a()Lr/a;

    move-result-object v1

    invoke-virtual {v1}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/r;

    invoke-virtual {v1}, LY0/r;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LY0/r;->e(JJ)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v6}, Landroidx/compose/animation/m$a;->a()Lr/a;

    move-result-object v1

    invoke-virtual {v1}, Lr/a;->p()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v6}, Landroidx/compose/animation/m$a;->a()Lr/a;

    move-result-object v1

    invoke-virtual {v1}, Lr/a;->k()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/r;

    invoke-virtual {v1}, LY0/r;->j()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LY0/r;->e(JJ)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {v6}, Landroidx/compose/animation/m$a;->a()Lr/a;

    move-result-object v0

    invoke-virtual {v0}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/r;

    invoke-virtual {v0}, LY0/r;->j()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Landroidx/compose/animation/m$a;->c(J)V

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v7

    new-instance v10, Landroidx/compose/animation/m$b;

    const/4 v5, 0x0

    move-object v0, v10

    move-object v1, v6

    move-wide v2, p1

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/animation/m$b;-><init>(Landroidx/compose/animation/m$a;JLandroidx/compose/animation/m;Ldh/e;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_2
    :goto_1
    move-object v0, p0

    goto :goto_2

    :cond_3
    new-instance v6, Landroidx/compose/animation/m$a;

    new-instance v1, Lr/a;

    invoke-static/range {p1 .. p2}, LY0/r;->b(J)LY0/r;

    move-result-object v8

    sget-object v4, LY0/r;->b:LY0/r$a;

    invoke-static {v4}, Lr/u0;->e(LY0/r$a;)Lr/s0;

    move-result-object v9

    invoke-static {v0, v0}, LY0/s;->a(II)J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/r;->b(J)LY0/r;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v13}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    invoke-direct {v6, v1, v2, v3, v0}, Landroidx/compose/animation/m$a;-><init>(Lr/a;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :goto_2
    invoke-virtual {p0, v6}, Landroidx/compose/animation/m;->J2(Landroidx/compose/animation/m$a;)V

    invoke-virtual {v6}, Landroidx/compose/animation/m$a;->a()Lr/a;

    move-result-object v1

    invoke-virtual {v1}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/r;

    invoke-virtual {v1}, LY0/r;->j()J

    move-result-wide v1

    return-wide v1
.end method

.method public final E2()Lf0/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/m;->o:Lf0/c;

    return-object v0
.end method

.method public final F2()Landroidx/compose/animation/m$a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/m;->t:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/animation/m$a;

    return-object v0
.end method

.method public final G2()Lr/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/m;->n:Lr/i;

    return-object v0
.end method

.method public final H2()Lmh/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/m;->p:Lmh/p;

    return-object v0
.end method

.method public final I2(Lf0/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/m;->o:Lf0/c;

    return-void
.end method

.method public final J2(Landroidx/compose/animation/m$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/m;->t:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final K2(Lr/i;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/m;->n:Lr/i;

    return-void
.end method

.method public final L2(Lmh/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/m;->p:Lmh/p;

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 16

    move-object/from16 v8, p0

    move-wide/from16 v0, p3

    invoke-interface/range {p1 .. p1}, LC0/o;->a1()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {v8, v0, v1}, Landroidx/compose/animation/m;->M2(J)V

    invoke-interface/range {p2 .. p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v2

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    invoke-direct {v8, v0, v1}, Landroidx/compose/animation/m;->N2(J)J

    move-result-wide v2

    move-object/from16 v4, p2

    invoke-interface {v4, v2, v3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v2

    goto :goto_0

    :goto_1
    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    invoke-static {v2, v3}, LY0/s;->a(II)J

    move-result-wide v2

    invoke-interface/range {p1 .. p1}, LC0/o;->a1()Z

    move-result v4

    if-eqz v4, :cond_1

    iput-wide v2, v8, Landroidx/compose/animation/m;->q:J

    move-wide v0, v2

    goto :goto_3

    :cond_1
    iget-wide v4, v8, Landroidx/compose/animation/m;->q:J

    invoke-static {v4, v5}, Landroidx/compose/animation/f;->d(J)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-wide v4, v8, Landroidx/compose/animation/m;->q:J

    goto :goto_2

    :cond_2
    move-wide v4, v2

    :goto_2
    invoke-virtual {v8, v4, v5}, Landroidx/compose/animation/m;->D2(J)J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, LY0/c;->f(JJ)J

    move-result-wide v0

    :goto_3
    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v10

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v11

    new-instance v13, Landroidx/compose/animation/m$c;

    move-object v0, v13

    move-object/from16 v1, p0

    move v4, v10

    move v5, v11

    move-object/from16 v6, p1

    invoke-direct/range {v0 .. v7}, Landroidx/compose/animation/m$c;-><init>(Landroidx/compose/animation/m;JIILandroidx/compose/ui/layout/m;Landroidx/compose/ui/layout/t;)V

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v12, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method

.method public n2()V
    .locals 2

    invoke-super {p0}, Landroidx/compose/ui/e$c;->n2()V

    invoke-static {}, Landroidx/compose/animation/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/animation/m;->q:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/animation/m;->s:Z

    return-void
.end method

.method public p2()V
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/e$c;->p2()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/animation/m;->J2(Landroidx/compose/animation/m$a;)V

    return-void
.end method
