.class public abstract Lhf/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;[Lhf/h;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lhf/j;->c(Landroidx/compose/ui/e;[Lhf/h;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;[Lhf/h;LT/l;I)V
    .locals 30

    move-object/from16 v2, p0

    move-object/from16 v15, p1

    move/from16 v14, p3

    const-string v0, "modifier"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x358fda78    # -3934562.0f

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v1, v14, 0x6

    if-nez v1, :cond_1

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_1
    move v1, v14

    :goto_1
    array-length v3, v15

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const v4, 0x2c2fce71

    invoke-interface {v13, v4, v3}, LT/l;->s(ILjava/lang/Object;)V

    array-length v3, v15

    const/4 v4, 0x0

    move v5, v4

    :goto_2
    if-ge v5, v3, :cond_3

    aget-object v6, v15, v5

    invoke-interface {v13, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_3

    :cond_2
    move v6, v4

    :goto_3
    or-int/2addr v1, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    invoke-interface {v13}, LT/l;->N()V

    and-int/lit8 v3, v1, 0x70

    if-nez v3, :cond_4

    or-int/lit8 v1, v1, 0x10

    :cond_4
    and-int/lit8 v3, v1, 0x13

    const/16 v5, 0x12

    if-ne v3, v5, :cond_6

    invoke-interface {v13}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v13}, LT/l;->C()V

    move-object/from16 v20, v13

    goto/16 :goto_6

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, -0x1

    const-string v5, "com.ui.wifiman.ui.speedtest.component.SpeedtestChart (SpeedtestChart.kt:56)"

    invoke-static {v0, v1, v3, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    const v0, 0x2c2fdbe0

    invoke-interface {v13, v0}, LT/l;->U(I)V

    new-instance v3, Ljava/util/ArrayList;

    array-length v0, v15

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, v15

    move v5, v4

    :goto_5
    if-ge v5, v0, :cond_8

    aget-object v6, v15, v5

    invoke-virtual {v6}, Lhf/h;->b()Lff/a;

    move-result-object v6

    invoke-static {v6, v13, v4}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v6

    new-instance v8, Lh6/a$a;

    invoke-static {v6, v7}, Lm0/x0;->j(J)I

    move-result v9

    new-instance v10, LR5/a;

    sget-object v11, Lm0/l0;->b:Lm0/l0$a;

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/high16 v18, 0x3f000000    # 0.5f

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide/from16 v16, v6

    invoke-static/range {v16 .. v23}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v12

    const/16 v18, 0x0

    move-wide/from16 v16, v6

    invoke-static/range {v16 .. v23}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    filled-new-array {v12, v6}, [Lm0/v0;

    move-result-object v6

    invoke-static {v6}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, v11

    invoke-static/range {v16 .. v22}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v6

    invoke-direct {v10, v6}, LR5/a;-><init>(Lm0/l0;)V

    const/16 v28, 0x7f8

    const/16 v29, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v16, v8

    move/from16 v17, v9

    move-object/from16 v19, v10

    invoke-direct/range {v16 .. v29}, Lh6/a$a;-><init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_8
    invoke-interface {v13}, LT/l;->J()V

    sget-object v5, Lh6/a$b;->Start:Lh6/a$b;

    const/16 v11, 0x180

    const/16 v12, 0x7a

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v10, v13

    invoke-static/range {v3 .. v12}, LN5/a;->a(Ljava/util/List;FLh6/a$b;Ljava/util/List;Ljava/util/Map;Lk6/a;LY5/c$b;LT/l;II)Lh6/a;

    move-result-object v0

    shr-int/lit8 v3, v1, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v15, v13, v3}, Lhf/j;->d([Lhf/h;LT/l;I)Lx6/b;

    move-result-object v3

    move v11, v1

    move-object v1, v3

    const/4 v8, 0x6

    const/16 v9, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, v13

    invoke-static/range {v3 .. v9}, LO5/b;->a(ZLE6/d;LE6/c;Lr/i;LT/l;II)LO5/a;

    move-result-object v10

    shl-int/lit8 v3, v11, 0x6

    and-int/lit16 v3, v3, 0x380

    move/from16 v17, v3

    const/16 v18, 0x30

    const v19, 0xf3f8

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object/from16 v20, v13

    move-object/from16 v13, v16

    move-object/from16 v14, v16

    move-object/from16 v15, v16

    move-object/from16 v2, p0

    move-object/from16 v16, v20

    invoke-static/range {v0 .. v19}, LM5/a;->a(Lb6/b;Lx6/b;Landroidx/compose/ui/e;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_6
    invoke-interface/range {v20 .. v20}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Lhf/i;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v1, v2, v3, v4}, Lhf/i;-><init>(Landroidx/compose/ui/e;[Lhf/h;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;[Lhf/h;ILT/l;I)LYg/J;
    .locals 0

    array-length p4, p1

    invoke-static {p1, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lhf/h;

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lhf/j;->b(Landroidx/compose/ui/e;[Lhf/h;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final d([Lhf/h;LT/l;I)Lx6/b;
    .locals 3

    const v0, 0x849e0d8

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.component.chartEntryModel (SpeedtestChart.kt:87)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance p2, Lhf/j$a;

    invoke-direct {p2, p0}, Lhf/j$a;-><init>([Lhf/h;)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object p2
.end method

.method public static final e(Lff/a;LT/l;II)Lhf/h;
    .locals 2

    const v0, 0x4d9ea77b    # 3.3272202E8f

    invoke-interface {p1, v0}, LT/l;->U(I)V

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p0, Lff/a;->DOWN:Lff/a;

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x1

    const-string v1, "com.ui.wifiman.ui.speedtest.component.previewSpeedtestChartModel (SpeedtestChart.kt:109)"

    invoke-static {v0, p2, p3, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    new-instance p2, Lhf/h;

    const/16 p3, 0x10

    new-array p3, p3, [F

    fill-array-data p3, :array_0

    invoke-direct {p2, p0, p3}, Lhf/h;-><init>(Lff/a;[F)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p1}, LT/l;->J()V

    return-object p2

    nop

    :array_0
    .array-data 4
        0x3e800000    # 0.25f
        0x3eb33333    # 0.35f
        0x3ee66666    # 0.45f
        0x3f59999a    # 0.85f
        0x3f400000    # 0.75f
        0x3f333333    # 0.7f
        0x3f333333    # 0.7f
        0x3f333333    # 0.7f
        0x3f19999a    # 0.6f
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
    .end array-data
.end method
