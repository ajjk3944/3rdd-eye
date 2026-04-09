.class public final Ls/f;
.super LE0/m;
.source "SourceFile"


# instance fields
.field private p:Ls/d;

.field private q:F

.field private r:Lm0/l0;

.field private s:Lm0/i1;

.field private final t:Lj0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(FLm0/l0;Lm0/i1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LE0/m;-><init>()V

    .line 3
    iput p1, p0, Ls/f;->q:F

    .line 4
    iput-object p2, p0, Ls/f;->r:Lm0/l0;

    .line 5
    iput-object p3, p0, Ls/f;->s:Lm0/i1;

    .line 6
    new-instance p1, Ls/f$e;

    invoke-direct {p1, p0}, Ls/f$e;-><init>(Ls/f;)V

    invoke-static {p1}, Landroidx/compose/ui/draw/b;->a(Lmh/l;)Lj0/c;

    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object p1

    check-cast p1, Lj0/c;

    iput-object p1, p0, Ls/f;->t:Lj0/c;

    return-void
.end method

.method public synthetic constructor <init>(FLm0/l0;Lm0/i1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ls/f;-><init>(FLm0/l0;Lm0/i1;)V

    return-void
.end method

.method public static final synthetic J2(Ls/f;Lj0/d;Lm0/l0;Lm0/Q0$a;ZF)Lj0/h;
    .locals 0

    invoke-direct/range {p0 .. p5}, Ls/f;->L2(Lj0/d;Lm0/l0;Lm0/Q0$a;ZF)Lj0/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic K2(Ls/f;Lj0/d;Lm0/l0;Lm0/Q0$c;JJZF)Lj0/h;
    .locals 0

    invoke-direct/range {p0 .. p9}, Ls/f;->M2(Lj0/d;Lm0/l0;Lm0/Q0$c;JJZF)Lj0/h;

    move-result-object p0

    return-object p0
.end method

.method private final L2(Lj0/d;Lm0/l0;Lm0/Q0$a;ZF)Lj0/h;
    .locals 47

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v11, p2

    if-eqz p4, :cond_0

    new-instance v2, Ls/f$a;

    move-object/from16 v3, p3

    invoke-direct {v2, v3, v11}, Ls/f$a;-><init>(Lm0/Q0$a;Lm0/l0;)V

    invoke-virtual {v0, v2}, Lj0/d;->p(Lmh/l;)Lj0/h;

    move-result-object v0

    goto/16 :goto_5

    :cond_0
    move-object/from16 v3, p3

    instance-of v2, v11, Lm0/j1;

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    sget-object v2, Lm0/K0;->b:Lm0/K0$a;

    invoke-virtual {v2}, Lm0/K0$a;->a()I

    move-result v2

    sget-object v5, Lm0/w0;->b:Lm0/w0$a;

    move-object v6, v11

    check-cast v6, Lm0/j1;

    invoke-virtual {v6}, Lm0/j1;->b()J

    move-result-wide v6

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lm0/w0$a;->b(Lm0/w0$a;JIILjava/lang/Object;)Lm0/w0;

    move-result-object v5

    move v14, v2

    move-object/from16 v19, v5

    goto :goto_0

    :cond_1
    sget-object v2, Lm0/K0;->b:Lm0/K0$a;

    invoke-virtual {v2}, Lm0/K0$a;->b()I

    move-result v2

    move v14, v2

    move-object/from16 v19, v4

    :goto_0
    invoke-virtual/range {p3 .. p3}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object v2

    invoke-interface {v2}, Lm0/U0;->getBounds()Ll0/i;

    move-result-object v10

    iget-object v2, v1, Ls/f;->p:Ls/d;

    if-nez v2, :cond_2

    new-instance v2, Ls/d;

    const/16 v25, 0xf

    const/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v2

    invoke-direct/range {v20 .. v26}, Ls/d;-><init>(Lm0/J0;Lm0/n0;Lo0/a;Lm0/U0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v1, Ls/f;->p:Ls/d;

    :cond_2
    iget-object v2, v1, Ls/f;->p:Ls/d;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ls/d;->g()Lm0/U0;

    move-result-object v9

    invoke-interface {v9}, Lm0/U0;->a()V

    const/4 v2, 0x2

    invoke-static {v9, v10, v4, v2, v4}, Lm0/U0;->g(Lm0/U0;Ll0/i;Lm0/U0$b;ILjava/lang/Object;)V

    invoke-virtual/range {p3 .. p3}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object v5

    sget-object v6, Lm0/Y0;->a:Lm0/Y0$a;

    invoke-virtual {v6}, Lm0/Y0$a;->a()I

    move-result v6

    invoke-interface {v9, v9, v5, v6}, Lm0/U0;->k(Lm0/U0;Lm0/U0;I)Z

    new-instance v8, Lkotlin/jvm/internal/N;

    invoke-direct {v8}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-virtual {v10}, Ll0/i;->r()F

    move-result v5

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v5, v5

    float-to-int v5, v5

    invoke-virtual {v10}, Ll0/i;->j()F

    move-result v6

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v6, v6

    float-to-int v6, v6

    invoke-static {v5, v6}, LY0/s;->a(II)J

    move-result-wide v20

    iget-object v5, v1, Ls/f;->p:Ls/d;

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v5}, Ls/d;->c(Ls/d;)Lm0/J0;

    move-result-object v6

    invoke-static {v5}, Ls/d;->a(Ls/d;)Lm0/n0;

    move-result-object v7

    if-eqz v6, :cond_3

    invoke-interface {v6}, Lm0/J0;->b()I

    move-result v12

    invoke-static {v12}, Lm0/K0;->f(I)Lm0/K0;

    move-result-object v12

    goto :goto_1

    :cond_3
    move-object v12, v4

    :goto_1
    sget-object v13, Lm0/K0;->b:Lm0/K0$a;

    invoke-virtual {v13}, Lm0/K0$a;->b()I

    move-result v13

    const/4 v15, 0x0

    if-nez v12, :cond_4

    move v12, v15

    goto :goto_2

    :cond_4
    invoke-virtual {v12}, Lm0/K0;->l()I

    move-result v12

    invoke-static {v12, v13}, Lm0/K0;->i(II)Z

    move-result v12

    :goto_2
    const/4 v13, 0x1

    if-nez v12, :cond_6

    if-eqz v6, :cond_5

    invoke-interface {v6}, Lm0/J0;->b()I

    move-result v4

    invoke-static {v4}, Lm0/K0;->f(I)Lm0/K0;

    move-result-object v4

    :cond_5
    invoke-static {v14, v4}, Lm0/K0;->h(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    move v15, v13

    :cond_7
    if-eqz v6, :cond_9

    if-eqz v7, :cond_9

    invoke-virtual/range {p1 .. p1}, Lj0/d;->c()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ll0/m;->i(J)F

    move-result v4

    invoke-interface {v6}, Lm0/J0;->getWidth()I

    move-result v12

    int-to-float v12, v12

    cmpl-float v4, v4, v12

    if-gtz v4, :cond_9

    invoke-virtual/range {p1 .. p1}, Lj0/d;->c()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ll0/m;->g(J)F

    move-result v4

    invoke-interface {v6}, Lm0/J0;->getHeight()I

    move-result v12

    int-to-float v12, v12

    cmpl-float v4, v4, v12

    if-gtz v4, :cond_9

    if-nez v15, :cond_8

    goto :goto_3

    :cond_8
    move-object v12, v6

    move/from16 v46, v13

    move-object v13, v7

    move/from16 v7, v46

    goto :goto_4

    :cond_9
    :goto_3
    invoke-static/range {v20 .. v21}, LY0/r;->g(J)I

    move-result v12

    invoke-static/range {v20 .. v21}, LY0/r;->f(J)I

    move-result v4

    const/16 v17, 0x18

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move v7, v13

    move v13, v4

    invoke-static/range {v12 .. v18}, Lm0/L0;->b(IIIZLn0/c;ILjava/lang/Object;)Lm0/J0;

    move-result-object v6

    invoke-static {v5, v6}, Ls/d;->f(Ls/d;Lm0/J0;)V

    invoke-static {v6}, Lm0/p0;->a(Lm0/J0;)Lm0/n0;

    move-result-object v4

    invoke-static {v5, v4}, Ls/d;->d(Ls/d;Lm0/n0;)V

    move-object v13, v4

    move-object v12, v6

    :goto_4
    invoke-static {v5}, Ls/d;->b(Ls/d;)Lo0/a;

    move-result-object v4

    if-nez v4, :cond_a

    new-instance v4, Lo0/a;

    invoke-direct {v4}, Lo0/a;-><init>()V

    invoke-static {v5, v4}, Ls/d;->e(Ls/d;Lo0/a;)V

    :cond_a
    move-object v14, v4

    invoke-static/range {v20 .. v21}, LY0/s;->d(J)J

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, Lj0/d;->getLayoutDirection()LY0/t;

    move-result-object v6

    invoke-virtual {v14}, Lo0/a;->B()Lo0/a$a;

    move-result-object v15

    move-object/from16 p4, v9

    invoke-virtual {v15}, Lo0/a$a;->a()LY0/d;

    move-result-object v9

    move-object/from16 v16, v9

    invoke-virtual {v15}, Lo0/a$a;->b()LY0/t;

    move-result-object v9

    move-object/from16 v17, v9

    invoke-virtual {v15}, Lo0/a$a;->c()Lm0/n0;

    move-result-object v9

    move-object/from16 v18, v8

    move-object/from16 v35, v9

    invoke-virtual {v15}, Lo0/a$a;->d()J

    move-result-wide v8

    invoke-virtual {v14}, Lo0/a;->B()Lo0/a$a;

    move-result-object v15

    invoke-virtual {v15, v0}, Lo0/a$a;->j(LY0/d;)V

    invoke-virtual {v15, v6}, Lo0/a$a;->k(LY0/t;)V

    invoke-virtual {v15, v13}, Lo0/a$a;->i(Lm0/n0;)V

    invoke-virtual {v15, v4, v5}, Lo0/a$a;->l(J)V

    invoke-interface {v13}, Lm0/n0;->j()V

    sget-object v6, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v6}, Lm0/v0$a;->a()J

    move-result-wide v23

    sget-object v15, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {v15}, Lm0/d0$a;->a()I

    move-result v32

    const/16 v33, 0x3a

    const/16 v34, 0x0

    const-wide/16 v25, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v22, v14

    move-wide/from16 v27, v4

    invoke-static/range {v22 .. v34}, Lo0/f;->u0(Lo0/f;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    invoke-virtual {v10}, Ll0/i;->k()F

    move-result v4

    neg-float v6, v4

    invoke-virtual {v10}, Ll0/i;->n()F

    move-result v4

    neg-float v5, v4

    invoke-interface {v14}, Lo0/f;->k1()Lo0/d;

    move-result-object v4

    invoke-interface {v4}, Lo0/d;->e()Lo0/h;

    move-result-object v4

    invoke-interface {v4, v6, v5}, Lo0/h;->c(FF)V

    :try_start_0
    invoke-virtual/range {p3 .. p3}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object v3

    new-instance v30, Lo0/k;

    int-to-float v2, v2

    mul-float v23, p5, v2

    const/16 v28, 0x1e

    const/16 v29, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v22, v30

    invoke-direct/range {v22 .. v29}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/16 v22, 0x34

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object v2, v14

    move-object/from16 v4, p2

    move/from16 v36, v5

    move/from16 v5, v24

    move/from16 v37, v6

    move-object/from16 v6, v30

    move-object/from16 v7, v25

    move-wide/from16 v38, v8

    move-object/from16 v9, v18

    move/from16 v8, v26

    move-object/from16 v40, v9

    move-object/from16 v41, v16

    move-object/from16 v42, v17

    move-object/from16 v43, v35

    move-object/from16 v16, p4

    move/from16 v9, v22

    move-object/from16 v17, v10

    move-object/from16 v10, v23

    :try_start_1
    invoke-static/range {v2 .. v10}, Lo0/f;->R0(Lo0/f;Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;IILjava/lang/Object;)V

    invoke-interface {v14}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v2

    const/4 v3, 0x1

    int-to-float v3, v3

    add-float/2addr v2, v3

    invoke-interface {v14}, Lo0/f;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/m;->i(J)F

    move-result v4

    div-float/2addr v2, v4

    invoke-interface {v14}, Lo0/f;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/m;->g(J)F

    move-result v4

    add-float/2addr v4, v3

    invoke-interface {v14}, Lo0/f;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/m;->g(J)F

    move-result v3

    div-float/2addr v4, v3

    invoke-interface {v14}, Lo0/f;->D1()J

    move-result-wide v5

    invoke-interface {v14}, Lo0/f;->k1()Lo0/d;

    move-result-object v10

    invoke-interface {v10}, Lo0/d;->c()J

    move-result-wide v8

    invoke-interface {v10}, Lo0/d;->d()Lm0/n0;

    move-result-object v3

    invoke-interface {v3}, Lm0/n0;->j()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v10}, Lo0/d;->e()Lo0/h;

    move-result-object v3

    invoke-interface {v3, v2, v4, v5, v6}, Lo0/h;->f(FFJ)V

    invoke-virtual {v15}, Lm0/d0$a;->a()I

    move-result v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/16 v18, 0x1c

    const/16 v22, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v14

    move-object/from16 v3, v16

    move-object/from16 v4, p2

    move-wide/from16 v44, v8

    move v8, v15

    move/from16 v9, v18

    move-object v11, v10

    move-object/from16 v10, v22

    :try_start_3
    invoke-static/range {v2 .. v10}, Lo0/f;->R0(Lo0/f;Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;IILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-interface {v11}, Lo0/d;->d()Lm0/n0;

    move-result-object v2

    invoke-interface {v2}, Lm0/n0;->r()V

    move-wide/from16 v2, v44

    invoke-interface {v11, v2, v3}, Lo0/d;->f(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-interface {v14}, Lo0/f;->k1()Lo0/d;

    move-result-object v2

    invoke-interface {v2}, Lo0/d;->e()Lo0/h;

    move-result-object v2

    move/from16 v4, v37

    neg-float v3, v4

    move/from16 v5, v36

    neg-float v4, v5

    invoke-interface {v2, v3, v4}, Lo0/h;->c(FF)V

    invoke-interface {v13}, Lm0/n0;->r()V

    invoke-virtual {v14}, Lo0/a;->B()Lo0/a$a;

    move-result-object v2

    move-object/from16 v3, v41

    invoke-virtual {v2, v3}, Lo0/a$a;->j(LY0/d;)V

    move-object/from16 v3, v42

    invoke-virtual {v2, v3}, Lo0/a$a;->k(LY0/t;)V

    move-object/from16 v3, v43

    invoke-virtual {v2, v3}, Lo0/a$a;->i(Lm0/n0;)V

    move-wide/from16 v3, v38

    invoke-virtual {v2, v3, v4}, Lo0/a$a;->l(J)V

    invoke-interface {v12}, Lm0/J0;->a()V

    move-object/from16 v2, v40

    iput-object v12, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    new-instance v3, Ls/f$b;

    move-object v5, v3

    move-object/from16 v6, v17

    move-object v7, v2

    move-wide/from16 v8, v20

    move-object/from16 v10, v19

    invoke-direct/range {v5 .. v10}, Ls/f$b;-><init>(Ll0/i;Lkotlin/jvm/internal/N;JLm0/w0;)V

    invoke-virtual {v0, v3}, Lj0/d;->p(Lmh/l;)Lj0/h;

    move-result-object v0

    :goto_5
    return-object v0

    :catchall_0
    move-exception v0

    move/from16 v5, v36

    move/from16 v4, v37

    goto :goto_7

    :catchall_1
    move-exception v0

    move/from16 v5, v36

    move/from16 v4, v37

    move-wide/from16 v2, v44

    goto :goto_6

    :catchall_2
    move-exception v0

    move-wide v2, v8

    move-object v11, v10

    move/from16 v5, v36

    move/from16 v4, v37

    :goto_6
    :try_start_5
    invoke-interface {v11}, Lo0/d;->d()Lm0/n0;

    move-result-object v6

    invoke-interface {v6}, Lm0/n0;->r()V

    invoke-interface {v11, v2, v3}, Lo0/d;->f(J)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    goto :goto_7

    :catchall_4
    move-exception v0

    move v4, v6

    :goto_7
    invoke-interface {v14}, Lo0/f;->k1()Lo0/d;

    move-result-object v2

    invoke-interface {v2}, Lo0/d;->e()Lo0/h;

    move-result-object v2

    neg-float v3, v4

    neg-float v4, v5

    invoke-interface {v2, v3, v4}, Lo0/h;->c(FF)V

    throw v0
.end method

.method private final M2(Lj0/d;Lm0/l0;Lm0/Q0$c;JJZF)Lj0/h;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v10, p9

    invoke-virtual/range {p3 .. p3}, Lm0/Q0$c;->b()Ll0/k;

    move-result-object v2

    invoke-static {v2}, Ll0/l;->f(Ll0/k;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p3 .. p3}, Lm0/Q0$c;->b()Ll0/k;

    move-result-object v2

    invoke-virtual {v2}, Ll0/k;->h()J

    move-result-wide v11

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float v13, v10, v2

    new-instance v14, Lo0/k;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v14

    move/from16 v3, p9

    invoke-direct/range {v2 .. v9}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Ls/f$c;

    move-object v2, v15

    move/from16 v3, p8

    move-object/from16 v4, p2

    move-wide v5, v11

    move v7, v13

    move/from16 v8, p9

    move-wide/from16 v9, p4

    move-wide/from16 v11, p6

    move-object v13, v14

    invoke-direct/range {v2 .. v13}, Ls/f$c;-><init>(ZLm0/l0;JFFJJLo0/k;)V

    invoke-virtual {v1, v15}, Lj0/d;->p(Lmh/l;)Lj0/h;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v2, v0, Ls/f;->p:Ls/d;

    if-nez v2, :cond_1

    new-instance v2, Ls/d;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Ls/d;-><init>(Lm0/J0;Lm0/n0;Lo0/a;Lm0/U0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Ls/f;->p:Ls/d;

    :cond_1
    iget-object v2, v0, Ls/f;->p:Ls/d;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ls/d;->g()Lm0/U0;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lm0/Q0$c;->b()Ll0/k;

    move-result-object v3

    move/from16 v4, p8

    invoke-static {v2, v3, v10, v4}, Ls/e;->a(Lm0/U0;Ll0/k;FZ)Lm0/U0;

    move-result-object v2

    new-instance v3, Ls/f$d;

    move-object/from16 v4, p2

    invoke-direct {v3, v2, v4}, Ls/f$d;-><init>(Lm0/U0;Lm0/l0;)V

    invoke-virtual {v1, v3}, Lj0/d;->p(Lmh/l;)Lj0/h;

    move-result-object v1

    :goto_0
    return-object v1
.end method


# virtual methods
.method public final I1(Lm0/i1;)V
    .locals 1

    iget-object v0, p0, Ls/f;->s:Lm0/i1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Ls/f;->s:Lm0/i1;

    iget-object p1, p0, Ls/f;->t:Lj0/c;

    invoke-interface {p1}, Lj0/c;->c0()V

    :cond_0
    return-void
.end method

.method public final N2()Lm0/l0;
    .locals 1

    iget-object v0, p0, Ls/f;->r:Lm0/l0;

    return-object v0
.end method

.method public final O2()Lm0/i1;
    .locals 1

    iget-object v0, p0, Ls/f;->s:Lm0/i1;

    return-object v0
.end method

.method public final P2()F
    .locals 1

    iget v0, p0, Ls/f;->q:F

    return v0
.end method

.method public final Q2(Lm0/l0;)V
    .locals 1

    iget-object v0, p0, Ls/f;->r:Lm0/l0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Ls/f;->r:Lm0/l0;

    iget-object p1, p0, Ls/f;->t:Lj0/c;

    invoke-interface {p1}, Lj0/c;->c0()V

    :cond_0
    return-void
.end method

.method public final R2(F)V
    .locals 1

    iget v0, p0, Ls/f;->q:F

    invoke-static {v0, p1}, LY0/h;->n(FF)Z

    move-result v0

    if-nez v0, :cond_0

    iput p1, p0, Ls/f;->q:F

    iget-object p1, p0, Ls/f;->t:Lj0/c;

    invoke-interface {p1}, Lj0/c;->c0()V

    :cond_0
    return-void
.end method
