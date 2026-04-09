.class public abstract LN/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LN/n$a;->a:LN/n$a;

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LN/n;->a:LT/H0;

    return-void
.end method

.method public static final a(LN/m;J)J
    .locals 2

    invoke-virtual {p0}, LN/m;->j()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LN/m;->g()J

    move-result-wide p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/m;->k()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LN/m;->g()J

    move-result-wide p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LN/m;->l()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LN/m;->h()J

    move-result-wide p0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LN/m;->m()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LN/m;->h()J

    move-result-wide p0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LN/m;->c()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LN/m;->e()J

    move-result-wide p0

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, LN/m;->n()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LN/m;->i()J

    move-result-wide p0

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, LN/m;->d()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, LN/m;->f()J

    move-result-wide p0

    goto :goto_0

    :cond_6
    sget-object p0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p0}, Lm0/v0$a;->e()J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static final b(JLT/l;I)J
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.contentColorFor (Colors.kt:296)"

    const v2, 0x1a561887

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p3, -0x29ddb2df

    invoke-interface {p2, p3}, LT/l;->U(I)V

    sget-object p3, LN/f0;->a:LN/f0;

    const/4 v0, 0x6

    invoke-virtual {p3, p2, v0}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object p3

    invoke-static {p3, p0, p1}, LN/n;->a(LN/m;J)J

    move-result-wide p0

    const-wide/16 v0, 0x10

    cmp-long p3, p0, v0

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object p0

    invoke-interface {p2, p0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/v0;

    invoke-virtual {p0}, Lm0/v0;->u()J

    move-result-wide p0

    :goto_0
    invoke-interface {p2}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-wide p0
.end method

.method public static final c(JJJJJJJJJJJJ)LN/m;
    .locals 28

    move-wide/from16 v1, p0

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-wide/from16 v13, p12

    move-wide/from16 v15, p14

    move-wide/from16 v17, p16

    move-wide/from16 v19, p18

    move-wide/from16 v21, p20

    move-wide/from16 v23, p22

    new-instance v27, LN/m;

    move-object/from16 v0, v27

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v0 .. v26}, LN/m;-><init>(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v27
.end method

.method public static final d()LT/H0;
    .locals 1

    sget-object v0, LN/n;->a:LT/H0;

    return-object v0
.end method

.method public static final e(JJJJJJJJJJJJ)LN/m;
    .locals 28

    move-wide/from16 v1, p0

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-wide/from16 v13, p12

    move-wide/from16 v15, p14

    move-wide/from16 v17, p16

    move-wide/from16 v19, p18

    move-wide/from16 v21, p20

    move-wide/from16 v23, p22

    new-instance v27, LN/m;

    move-object/from16 v0, v27

    const/16 v25, 0x1

    const/16 v26, 0x0

    invoke-direct/range {v0 .. v26}, LN/m;-><init>(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v27
.end method

.method public static synthetic f(JJJJJJJJJJJJILjava/lang/Object;)LN/m;
    .locals 19

    move/from16 v0, p24

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide v1, 0xff6200eeL

    invoke-static {v1, v2}, Lm0/x0;->d(J)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p0

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const-wide v3, 0xff3700b3L

    invoke-static {v3, v4}, Lm0/x0;->d(J)J

    move-result-wide v3

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    const-wide v5, 0xff03dac6L

    invoke-static {v5, v6}, Lm0/x0;->d(J)J

    move-result-wide v5

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p4

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const-wide v7, 0xff018786L

    invoke-static {v7, v8}, Lm0/x0;->d(J)J

    move-result-wide v7

    goto :goto_3

    :cond_3
    move-wide/from16 v7, p6

    :goto_3
    and-int/lit8 v9, v0, 0x10

    if-eqz v9, :cond_4

    sget-object v9, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v9}, Lm0/v0$a;->f()J

    move-result-wide v9

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p8

    :goto_4
    and-int/lit8 v11, v0, 0x20

    if-eqz v11, :cond_5

    sget-object v11, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v11}, Lm0/v0$a;->f()J

    move-result-wide v11

    goto :goto_5

    :cond_5
    move-wide/from16 v11, p10

    :goto_5
    and-int/lit8 v13, v0, 0x40

    if-eqz v13, :cond_6

    const-wide v13, 0xffb00020L

    invoke-static {v13, v14}, Lm0/x0;->d(J)J

    move-result-wide v13

    goto :goto_6

    :cond_6
    move-wide/from16 v13, p12

    :goto_6
    and-int/lit16 v15, v0, 0x80

    if-eqz v15, :cond_7

    sget-object v15, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v15}, Lm0/v0$a;->f()J

    move-result-wide v15

    goto :goto_7

    :cond_7
    move-wide/from16 v15, p14

    :goto_7
    move-wide/from16 p14, v15

    and-int/lit16 v15, v0, 0x100

    if-eqz v15, :cond_8

    sget-object v15, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v15}, Lm0/v0$a;->a()J

    move-result-wide v15

    goto :goto_8

    :cond_8
    move-wide/from16 v15, p16

    :goto_8
    move-wide/from16 p16, v15

    and-int/lit16 v15, v0, 0x200

    if-eqz v15, :cond_9

    sget-object v15, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v15}, Lm0/v0$a;->a()J

    move-result-wide v15

    goto :goto_9

    :cond_9
    move-wide/from16 v15, p18

    :goto_9
    move-wide/from16 p18, v15

    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    sget-object v15, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v15}, Lm0/v0$a;->a()J

    move-result-wide v15

    goto :goto_a

    :cond_a
    move-wide/from16 v15, p20

    :goto_a
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->f()J

    move-result-wide v17

    goto :goto_b

    :cond_b
    move-wide/from16 v17, p22

    :goto_b
    move-wide/from16 p0, v1

    move-wide/from16 p2, v3

    move-wide/from16 p4, v5

    move-wide/from16 p6, v7

    move-wide/from16 p8, v9

    move-wide/from16 p10, v11

    move-wide/from16 p12, v13

    move-wide/from16 p20, v15

    move-wide/from16 p22, v17

    invoke-static/range {p0 .. p23}, LN/n;->e(JJJJJJJJJJJJ)LN/m;

    move-result-object v0

    return-object v0
.end method

.method public static final g(LN/m;LN/m;)V
    .locals 2

    invoke-virtual {p1}, LN/m;->j()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->x(J)V

    invoke-virtual {p1}, LN/m;->k()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->y(J)V

    invoke-virtual {p1}, LN/m;->l()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->z(J)V

    invoke-virtual {p1}, LN/m;->m()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->A(J)V

    invoke-virtual {p1}, LN/m;->c()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->p(J)V

    invoke-virtual {p1}, LN/m;->n()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->B(J)V

    invoke-virtual {p1}, LN/m;->d()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->q(J)V

    invoke-virtual {p1}, LN/m;->g()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->u(J)V

    invoke-virtual {p1}, LN/m;->h()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->v(J)V

    invoke-virtual {p1}, LN/m;->e()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->s(J)V

    invoke-virtual {p1}, LN/m;->i()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->w(J)V

    invoke-virtual {p1}, LN/m;->f()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/m;->t(J)V

    invoke-virtual {p1}, LN/m;->o()Z

    move-result p1

    invoke-virtual {p0, p1}, LN/m;->r(Z)V

    return-void
.end method
