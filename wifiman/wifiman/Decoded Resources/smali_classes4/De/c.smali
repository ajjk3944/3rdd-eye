.class public abstract LDe/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(JZLs9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LDe/c;->c(JZLs9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(JZLs9/d;LT/l;II)V
    .locals 59

    move-wide/from16 v2, p0

    move-object/from16 v1, p3

    move/from16 v0, p5

    const-string v4, "text"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x4a0b10ea    # -1.8249E-6f

    move-object/from16 v5, p4

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v5, p6, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x4

    if-eqz v5, :cond_0

    or-int/lit8 v5, v0, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    invoke-interface {v15, v2, v3}, LT/l;->j(J)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v7

    goto :goto_0

    :cond_1
    move v5, v6

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move v5, v0

    :goto_1
    and-int/lit8 v8, p6, 0x2

    if-eqz v8, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move/from16 v9, p2

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v0, 0x30

    if-nez v9, :cond_3

    move/from16 v9, p2

    invoke-interface {v15, v9}, LT/l;->c(Z)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v5, v10

    :goto_3
    and-int/lit8 v10, p6, 0x4

    if-eqz v10, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v0, 0x180

    if-nez v10, :cond_8

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v5, v10

    :cond_8
    :goto_5
    and-int/lit16 v10, v5, 0x93

    const/16 v11, 0x92

    if-ne v10, v11, :cond_a

    invoke-interface {v15}, LT/l;->v()Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v15}, LT/l;->C()V

    move v3, v9

    move-object/from16 v27, v15

    goto/16 :goto_a

    :cond_a
    :goto_6
    const/4 v10, 0x0

    if-eqz v8, :cond_b

    move/from16 v25, v10

    goto :goto_7

    :cond_b
    move/from16 v25, v9

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_c

    const/4 v8, -0x1

    const-string v9, "com.ui.wifiman.ui.component.label.Badge (Badge.kt:42)"

    invoke-static {v4, v5, v8, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v8, 0x1

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v9

    invoke-static {v9}, LE/h;->d(F)LE/g;

    move-result-object v9

    invoke-static {v4, v8, v2, v3, v9}, Ls/e;->f(Landroidx/compose/ui/e;FJLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v4, v7, v6}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v21

    if-eqz v25, :cond_d

    const v4, -0x67b42508

    invoke-interface {v15, v4}, LT/l;->U(I)V

    shr-int/lit8 v4, v5, 0x6

    and-int/lit8 v4, v4, 0xe

    invoke-static {v1, v15, v4}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "toUpperCase(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v15}, LT/l;->J()V

    :goto_8
    move-object/from16 v26, v4

    goto :goto_9

    :cond_d
    const v4, -0x67b33dfc

    invoke-interface {v15, v4}, LT/l;->U(I)V

    shr-int/lit8 v4, v5, 0x6

    and-int/lit8 v4, v4, 0xe

    invoke-static {v1, v15, v4}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v15}, LT/l;->J()V

    goto :goto_8

    :goto_9
    sget-object v4, Lpa/a;->a:Lpa/a;

    invoke-virtual {v4}, Lpa/a;->a()LQ0/k;

    move-result-object v35

    sget-object v4, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v4}, LQ0/A$a;->b()LQ0/A;

    move-result-object v32

    const/16 v4, 0xb

    invoke-static {v4}, LY0/w;->g(I)J

    move-result-wide v30

    const/16 v4, 0xc

    invoke-static {v4}, LY0/w;->g(I)J

    move-result-wide v49

    invoke-static {v10}, LY0/w;->g(I)J

    move-result-wide v37

    new-instance v27, LL0/U;

    move-object/from16 v20, v27

    const v57, 0xfdff59

    const/16 v58, 0x0

    const-wide/16 v28, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const-wide/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    invoke-direct/range {v27 .. v58}, LL0/U;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    shl-int/lit8 v4, v5, 0x6

    and-int/lit16 v4, v4, 0x380

    move/from16 v22, v4

    const/16 v23, 0x0

    const v24, 0xfff8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 v27, v15

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, v26

    move-object/from16 v1, v21

    move-wide/from16 v2, p0

    move-object/from16 v21, v27

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    move/from16 v3, v25

    :goto_a
    invoke-interface/range {v27 .. v27}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v8, LDe/b;

    move-object v0, v8

    move-wide/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LDe/b;-><init>(JZLs9/d;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final c(JZLs9/d;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-wide v0, p0

    move v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LDe/c;->b(JZLs9/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
