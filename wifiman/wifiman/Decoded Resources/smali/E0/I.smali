.class public final LE0/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/f;
.implements Lo0/c;


# instance fields
.field private final a:Lo0/a;

.field private b:LE0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LE0/I;->a:Lo0/a;

    return-void
.end method

.method public synthetic constructor <init>(Lo0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Lo0/a;

    invoke-direct {p1}, Lo0/a;-><init>()V

    .line 4
    :cond_0
    invoke-direct {p0, p1}, LE0/I;-><init>(Lo0/a;)V

    return-void
.end method


# virtual methods
.method public D1()J
    .locals 2

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0}, Lo0/f;->D1()J

    move-result-wide v0

    return-wide v0
.end method

.method public F0(F)J
    .locals 2

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0, p1}, LY0/d;->F0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public H1(Lm0/J0;JJJJFLo0/g;Lm0/w0;II)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LE0/I;->a:Lo0/a;

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    invoke-virtual/range {v1 .. v15}, Lo0/a;->H1(Lm0/J0;JJJJFLo0/g;Lm0/w0;II)V

    return-void
.end method

.method public K1(J)J
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0, p1, p2}, LY0/d;->K1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public N0(F)F
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0, p1}, LY0/d;->N0(F)F

    move-result p1

    return p1
.end method

.method public N1(J)F
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0, p1, p2}, LY0/d;->N1(J)F

    move-result p1

    return p1
.end method

.method public U(Lm0/l0;FFZJJFLo0/g;Lm0/w0;I)V
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LE0/I;->a:Lo0/a;

    move-object v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    invoke-virtual/range {v1 .. v13}, Lo0/a;->U(Lm0/l0;FFZJJFLo0/g;Lm0/w0;I)V

    return-void
.end method

.method public X0(JFFZJJFLo0/g;Lm0/w0;I)V
    .locals 15

    move-object v0, p0

    iget-object v1, v0, LE0/I;->a:Lo0/a;

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    invoke-virtual/range {v1 .. v14}, Lo0/a;->X0(JFFZJJFLo0/g;Lm0/w0;I)V

    return-void
.end method

.method public X1()V
    .locals 10

    invoke-interface {p0}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    iget-object v1, p0, LE0/I;->b:LE0/r;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v1}, LE0/J;->a(LE0/j;)Landroidx/compose/ui/e$c;

    move-result-object v2

    const/4 v3, 0x4

    if-eqz v2, :cond_7

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v1

    const/4 v3, 0x0

    move-object v4, v3

    :goto_0
    if-eqz v2, :cond_9

    instance-of v5, v2, LE0/r;

    if-eqz v5, :cond_0

    check-cast v2, LE0/r;

    invoke-virtual {p0}, LE0/I;->k1()Lo0/d;

    move-result-object v5

    invoke-interface {v5}, Lo0/d;->g()Lp0/c;

    move-result-object v5

    invoke-virtual {p0, v2, v0, v5}, LE0/I;->q(LE0/r;Lm0/n0;Lp0/c;)V

    goto :goto_3

    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->f2()I

    move-result v5

    and-int/2addr v5, v1

    if-eqz v5, :cond_6

    instance-of v5, v2, LE0/m;

    if-eqz v5, :cond_6

    move-object v5, v2

    check-cast v5, LE0/m;

    invoke-virtual {v5}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    const/4 v8, 0x1

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v2, v5

    goto :goto_2

    :cond_1
    if-nez v4, :cond_2

    new-instance v4, LV/b;

    const/16 v8, 0x10

    new-array v8, v8, [Landroidx/compose/ui/e$c;

    invoke-direct {v4, v8, v6}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v4, v2}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v2, v3

    :cond_3
    invoke-virtual {v4, v5}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_1

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_0

    :cond_6
    :goto_3
    invoke-static {v4}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v2

    goto :goto_0

    :cond_7
    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v2

    invoke-static {v1, v2}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object v2

    invoke-virtual {v2}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v3

    invoke-interface {v1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    if-ne v3, v1, :cond_8

    invoke-virtual {v2}, LE0/c0;->H2()LE0/c0;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {p0}, LE0/I;->k1()Lo0/d;

    move-result-object v1

    invoke-interface {v1}, Lo0/d;->g()Lp0/c;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, LE0/c0;->c3(Lm0/n0;Lp0/c;)V

    :cond_9
    return-void
.end method

.method public final b(Lm0/n0;JLE0/c0;Landroidx/compose/ui/e$c;Lp0/c;)V
    .locals 12

    const/4 v0, 0x4

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    const/4 v1, 0x0

    move-object/from16 v2, p5

    move-object v3, v1

    :goto_0
    if-eqz v2, :cond_7

    instance-of v4, v2, LE0/r;

    if-eqz v4, :cond_0

    move-object v10, v2

    check-cast v10, LE0/r;

    move-object v5, p0

    move-object v6, p1

    move-wide v7, p2

    move-object/from16 v9, p4

    move-object/from16 v11, p6

    invoke-virtual/range {v5 .. v11}, LE0/I;->p(Lm0/n0;JLE0/c0;LE0/r;Lp0/c;)V

    goto :goto_3

    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->f2()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_6

    instance-of v4, v2, LE0/m;

    if-eqz v4, :cond_6

    move-object v4, v2

    check-cast v4, LE0/m;

    invoke-virtual {v4}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    const/4 v7, 0x1

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_1

    move-object v2, v4

    goto :goto_2

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, LV/b;

    const/16 v7, 0x10

    new-array v7, v7, [Landroidx/compose/ui/e$c;

    invoke-direct {v3, v7, v5}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v3, v2}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v2, v1

    :cond_3
    invoke-virtual {v3, v4}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_1

    :cond_5
    if-ne v6, v7, :cond_6

    goto :goto_0

    :cond_6
    :goto_3
    invoke-static {v3}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v2

    goto :goto_0

    :cond_7
    return-void
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0}, Lo0/f;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d1(F)F
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0, p1}, LY0/d;->d1(F)F

    move-result p1

    return p1
.end method

.method public e0(F)J
    .locals 2

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0, p1}, LY0/l;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public e1(Lm0/J0;JFLo0/g;Lm0/w0;I)V
    .locals 8

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move v7, p7

    invoke-virtual/range {v0 .. v7}, Lo0/a;->e1(Lm0/J0;JFLo0/g;Lm0/w0;I)V

    return-void
.end method

.method public f0(J)J
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0, p1, p2}, LY0/d;->f0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public f1(Lm0/l0;JJFILm0/V0;FLm0/w0;I)V
    .locals 13

    move-object v0, p0

    iget-object v1, v0, LE0/I;->a:Lo0/a;

    move-object v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    invoke-virtual/range {v1 .. v12}, Lo0/a;->f1(Lm0/l0;JJFILm0/V0;FLm0/w0;I)V

    return-void
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->getLayoutDirection()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public j0(JJJFLo0/g;Lm0/w0;I)V
    .locals 12

    move-object v0, p0

    iget-object v1, v0, LE0/I;->a:Lo0/a;

    move-wide v2, p1

    move-wide v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    invoke-virtual/range {v1 .. v11}, Lo0/a;->j0(JJJFLo0/g;Lm0/w0;I)V

    return-void
.end method

.method public j1(JJJJLo0/g;FLm0/w0;I)V
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LE0/I;->a:Lo0/a;

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    invoke-virtual/range {v1 .. v13}, Lo0/a;->j1(JJJJLo0/g;FLm0/w0;I)V

    return-void
.end method

.method public k1()Lo0/d;
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->k1()Lo0/d;

    move-result-object v0

    return-object v0
.end method

.method public l1(Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;I)V
    .locals 7

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lo0/a;->l1(Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;I)V

    return-void
.end method

.method public m0(JFJFLo0/g;Lm0/w0;I)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, LE0/I;->a:Lo0/a;

    move-wide v2, p1

    move v4, p3

    move-wide v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lo0/a;->m0(JFJFLo0/g;Lm0/w0;I)V

    return-void
.end method

.method public m1(Lm0/l0;JJJFLo0/g;Lm0/w0;I)V
    .locals 13

    move-object v0, p0

    iget-object v1, v0, LE0/I;->a:Lo0/a;

    move-object v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    invoke-virtual/range {v1 .. v12}, Lo0/a;->m1(Lm0/l0;JJJFLo0/g;Lm0/w0;I)V

    return-void
.end method

.method public n0(J)F
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0, p1, p2}, LY0/l;->n0(J)F

    move-result p1

    return p1
.end method

.method public final p(Lm0/n0;JLE0/c0;LE0/r;Lp0/c;)V
    .locals 14

    move-object v1, p0

    move-object/from16 v0, p5

    iget-object v2, v1, LE0/I;->b:LE0/r;

    iput-object v0, v1, LE0/I;->b:LE0/r;

    iget-object v3, v1, LE0/I;->a:Lo0/a;

    invoke-virtual/range {p4 .. p4}, LE0/c0;->getLayoutDirection()LY0/t;

    move-result-object v4

    invoke-interface {v3}, Lo0/f;->k1()Lo0/d;

    move-result-object v5

    invoke-interface {v5}, Lo0/d;->getDensity()LY0/d;

    move-result-object v5

    invoke-interface {v3}, Lo0/f;->k1()Lo0/d;

    move-result-object v6

    invoke-interface {v6}, Lo0/d;->getLayoutDirection()LY0/t;

    move-result-object v6

    invoke-interface {v3}, Lo0/f;->k1()Lo0/d;

    move-result-object v7

    invoke-interface {v7}, Lo0/d;->d()Lm0/n0;

    move-result-object v7

    invoke-interface {v3}, Lo0/f;->k1()Lo0/d;

    move-result-object v8

    invoke-interface {v8}, Lo0/d;->c()J

    move-result-wide v8

    invoke-interface {v3}, Lo0/f;->k1()Lo0/d;

    move-result-object v10

    invoke-interface {v10}, Lo0/d;->g()Lp0/c;

    move-result-object v10

    invoke-interface {v3}, Lo0/f;->k1()Lo0/d;

    move-result-object v11

    move-object/from16 v12, p4

    invoke-interface {v11, v12}, Lo0/d;->a(LY0/d;)V

    invoke-interface {v11, v4}, Lo0/d;->b(LY0/t;)V

    move-object v4, p1

    invoke-interface {v11, p1}, Lo0/d;->i(Lm0/n0;)V

    move-wide/from16 v12, p2

    invoke-interface {v11, v12, v13}, Lo0/d;->f(J)V

    move-object/from16 v12, p6

    invoke-interface {v11, v12}, Lo0/d;->h(Lp0/c;)V

    invoke-interface {p1}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v0, p0}, LE0/r;->J(Lo0/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lm0/n0;->r()V

    invoke-interface {v3}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0, v5}, Lo0/d;->a(LY0/d;)V

    invoke-interface {v0, v6}, Lo0/d;->b(LY0/t;)V

    invoke-interface {v0, v7}, Lo0/d;->i(Lm0/n0;)V

    invoke-interface {v0, v8, v9}, Lo0/d;->f(J)V

    invoke-interface {v0, v10}, Lo0/d;->h(Lp0/c;)V

    iput-object v2, v1, LE0/I;->b:LE0/r;

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-interface {p1}, Lm0/n0;->r()V

    invoke-interface {v3}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0, v5}, Lo0/d;->a(LY0/d;)V

    invoke-interface {v0, v6}, Lo0/d;->b(LY0/t;)V

    invoke-interface {v0, v7}, Lo0/d;->i(Lm0/n0;)V

    invoke-interface {v0, v8, v9}, Lo0/d;->f(J)V

    invoke-interface {v0, v10}, Lo0/d;->h(Lp0/c;)V

    throw v2
.end method

.method public p0(Lm0/l0;JJFLo0/g;Lm0/w0;I)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, LE0/I;->a:Lo0/a;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lo0/a;->p0(Lm0/l0;JJFLo0/g;Lm0/w0;I)V

    return-void
.end method

.method public final q(LE0/r;Lm0/n0;Lp0/c;)V
    .locals 8

    const/4 v0, 0x4

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object v5

    invoke-virtual {v5}, LE0/c0;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/s;->d(J)J

    move-result-wide v3

    invoke-virtual {v5}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->b0()LE0/I;

    move-result-object v1

    move-object v2, p2

    move-object v6, p1

    move-object v7, p3

    invoke-virtual/range {v1 .. v7}, LE0/I;->p(Lm0/n0;JLE0/c0;LE0/r;Lp0/c;)V

    return-void
.end method

.method public t0(Lm0/U0;JFLo0/g;Lm0/w0;I)V
    .locals 8

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move v7, p7

    invoke-virtual/range {v0 .. v7}, Lo0/a;->t0(Lm0/U0;JFLo0/g;Lm0/w0;I)V

    return-void
.end method

.method public x(I)F
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0, p1}, LY0/d;->x(I)F

    move-result p1

    return p1
.end method

.method public x1(F)I
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-interface {v0, p1}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, LE0/I;->a:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->y()F

    move-result v0

    return v0
.end method

.method public z0(JJJFILm0/V0;FLm0/w0;I)V
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LE0/I;->a:Lo0/a;

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    invoke-virtual/range {v1 .. v13}, Lo0/a;->z0(JJJFILm0/V0;FLm0/w0;I)V

    return-void
.end method
