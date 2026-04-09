.class public abstract LTe/U;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LTe/S;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LTe/U;->c(Landroidx/compose/ui/e;LTe/S;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LTe/S;LT/l;I)V
    .locals 25

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p3

    const-string v0, "modifier"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x17ed9cca

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v1, v8, 0x6

    const/4 v9, 0x4

    if-nez v1, :cond_1

    invoke-interface {v15, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v9

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    and-int/lit8 v2, v8, 0x30

    if-nez v2, :cond_3

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v1, v15

    goto/16 :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.signal.components.SignalMapperChartLatencyOverlay (SignalChartLatencyStatsOverlay.kt:36)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v16, Lm0/l0;->b:Lm0/l0$a;

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, v15, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->b()J

    move-result-wide v17

    const/16 v23, 0xe

    const/16 v24, 0x0

    const v19, 0x3f4ccccd    # 0.8f

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v17 .. v24}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    invoke-virtual {v0, v15, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->e()Lma/a$e;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$e;->b()J

    move-result-wide v17

    const/16 v19, 0x0

    invoke-static/range {v17 .. v24}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v0

    filled-new-array {v2, v0}, [Lm0/v0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-static/range {v16 .. v22}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/b;->b(Landroidx/compose/ui/e;Lm0/l0;Lm0/i1;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    int-to-float v3, v9

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v0, v2, v4}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v0, Lz/c;->a:Lz/c;

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v10

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v11

    new-instance v0, LTe/U$a;

    invoke-direct {v0, v7}, LTe/U$a;-><init>(LTe/S;)V

    const/16 v1, 0x36

    const v2, -0x592254fb

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, v15, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const v17, 0x1801b0

    const/16 v18, 0x38

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v1, v15

    move-object v15, v0

    move-object/from16 v16, v1

    invoke-static/range {v9 .. v18}, Lz/t;->a(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, LTe/T;

    invoke-direct {v1, v6, v7, v8}, LTe/T;-><init>(Landroidx/compose/ui/e;LTe/S;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LTe/S;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LTe/U;->b(Landroidx/compose/ui/e;LTe/S;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
