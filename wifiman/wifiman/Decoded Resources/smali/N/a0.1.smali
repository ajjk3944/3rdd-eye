.class public abstract LN/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroidx/compose/ui/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    sput-object v0, LN/a0;->a:Landroidx/compose/ui/e;

    return-void
.end method

.method public static final a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLT/l;II)V
    .locals 21

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move/from16 v11, p6

    const v0, -0x44202ba2

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_2

    invoke-interface {v12, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v2, p7, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_5

    invoke-interface {v12, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v3

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v4, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v4, v11, 0x180

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-interface {v12, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x100

    goto :goto_4

    :cond_8
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v1, v5

    :goto_5
    and-int/lit16 v5, v11, 0xc00

    const/16 v6, 0x800

    if-nez v5, :cond_a

    and-int/lit8 v5, p7, 0x8

    move-wide/from16 v7, p3

    if-nez v5, :cond_9

    invoke-interface {v12, v7, v8}, LT/l;->j(J)Z

    move-result v5

    if-eqz v5, :cond_9

    move v5, v6

    goto :goto_6

    :cond_9
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v1, v5

    goto :goto_7

    :cond_a
    move-wide/from16 v7, p3

    :goto_7
    and-int/lit16 v5, v1, 0x493

    const/16 v13, 0x492

    if-ne v5, v13, :cond_c

    invoke-interface {v12}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_8

    :cond_b
    invoke-interface {v12}, LT/l;->C()V

    move-object v3, v4

    move-wide v4, v7

    goto/16 :goto_11

    :cond_c
    :goto_8
    invoke-interface {v12}, LT/l;->q()V

    and-int/lit8 v5, v11, 0x1

    if-eqz v5, :cond_f

    invoke-interface {v12}, LT/l;->H()Z

    move-result v5

    if-eqz v5, :cond_d

    goto :goto_9

    :cond_d
    invoke-interface {v12}, LT/l;->C()V

    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_e

    and-int/lit16 v1, v1, -0x1c01

    :cond_e
    move-object v13, v4

    goto :goto_b

    :cond_f
    :goto_9
    if-eqz v2, :cond_10

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_a

    :cond_10
    move-object v2, v4

    :goto_a
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_11

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v4

    invoke-interface {v12, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/v0;

    invoke-virtual {v4}, Lm0/v0;->u()J

    move-result-wide v13

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v4

    invoke-interface {v12, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v15

    const/16 v19, 0xe

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    and-int/lit16 v1, v1, -0x1c01

    move-object v13, v2

    move-wide v7, v4

    goto :goto_b

    :cond_11
    move-object v13, v2

    :goto_b
    invoke-interface {v12}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_12

    const/4 v2, -0x1

    const-string v4, "androidx.compose.material.Icon (Icon.kt:134)"

    invoke-static {v0, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    and-int/lit16 v0, v1, 0x1c00

    xor-int/lit16 v0, v0, 0xc00

    const/4 v5, 0x0

    const/4 v2, 0x1

    if-le v0, v6, :cond_13

    invoke-interface {v12, v7, v8}, LT/l;->j(J)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    and-int/lit16 v0, v1, 0xc00

    if-ne v0, v6, :cond_15

    :cond_14
    move v0, v2

    goto :goto_c

    :cond_15
    move v0, v5

    :goto_c
    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    const/4 v6, 0x0

    if-nez v0, :cond_16

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_18

    :cond_16
    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->e()J

    move-result-wide v14

    invoke-static {v7, v8, v14, v15}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_17

    move-object v4, v6

    goto :goto_d

    :cond_17
    sget-object v14, Lm0/w0;->b:Lm0/w0$a;

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/16 v17, 0x0

    move-wide v15, v7

    invoke-static/range {v14 .. v19}, Lm0/w0$a;->b(Lm0/w0$a;JIILjava/lang/Object;)Lm0/w0;

    move-result-object v0

    move-object v4, v0

    :goto_d
    invoke-interface {v12, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_18
    move-object v14, v4

    check-cast v14, Lm0/w0;

    if-eqz v10, :cond_1c

    const v0, 0x3a70ac59

    invoke-interface {v12, v0}, LT/l;->U(I)V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    and-int/lit8 v1, v1, 0x70

    if-ne v1, v3, :cond_19

    move v1, v2

    goto :goto_e

    :cond_19
    move v1, v5

    :goto_e
    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1a

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_1b

    :cond_1a
    new-instance v3, LN/a0$b;

    invoke-direct {v3, v10}, LN/a0$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v12, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1b
    check-cast v3, Lmh/l;

    invoke-static {v0, v5, v3, v2, v6}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v12}, LT/l;->J()V

    :goto_f
    move-object v15, v0

    goto :goto_10

    :cond_1c
    const v0, 0x3a72cc8b

    invoke-interface {v12, v0}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->J()V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_f

    :goto_10
    invoke-static {v13}, Landroidx/compose/ui/graphics/b;->d(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v9}, LN/a0;->b(Landroidx/compose/ui/e;Lr0/d;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, LC0/h;->a:LC0/h$a;

    invoke-virtual {v1}, LC0/h$a;->b()LC0/h;

    move-result-object v4

    const/16 v16, 0x16

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move v5, v6

    move-object v6, v14

    move-wide/from16 v18, v7

    move/from16 v7, v16

    move-object/from16 v8, v17

    invoke-static/range {v0 .. v8}, Landroidx/compose/ui/draw/d;->b(Landroidx/compose/ui/e;Lr0/d;ZLf0/c;LC0/h;FLm0/w0;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v0, v15}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v12, v1}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, LT/o;->P()V

    :cond_1d
    move-object v3, v13

    move-wide/from16 v4, v18

    :goto_11
    invoke-interface {v12}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_1e

    new-instance v12, LN/a0$a;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LN/a0$a;-><init>(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;JII)V

    invoke-interface {v8, v12}, LT/X0;->a(Lmh/p;)V

    :cond_1e
    return-void
.end method

.method private static final b(Landroidx/compose/ui/e;Lr0/d;)Landroidx/compose/ui/e;
    .locals 4

    invoke-virtual {p1}, Lr0/d;->l()J

    move-result-wide v0

    sget-object v2, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v2}, Ll0/m$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll0/m;->f(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lr0/d;->l()J

    move-result-wide v0

    invoke-static {v0, v1}, LN/a0;->c(J)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p1, LN/a0;->a:Landroidx/compose/ui/e;

    :goto_1
    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final c(J)Z
    .locals 1

    invoke-static {p0, p1}, Ll0/m;->i(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Ll0/m;->g(J)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
