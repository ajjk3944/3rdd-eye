.class public abstract LDe/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ls9/d;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LDe/j;->c(Ls9/d;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ls9/d;LT/l;I)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "text"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x49b5f483

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v3, 0x3

    if-ne v5, v4, :cond_3

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v29, v15

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.component.label.Tag (Tag.kt:28)"

    invoke-static {v2, v3, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v15, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$a;->a()J

    move-result-wide v7

    const/16 v9, 0x10

    int-to-float v9, v9

    invoke-static {v9}, LY0/h;->j(F)F

    move-result v9

    invoke-static {v9}, LE/h;->d(F)LE/g;

    move-result-object v9

    invoke-static {v2, v7, v8, v9}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v7, 0x8

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v2, v7, v8, v4, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    and-int/lit8 v2, v3, 0xe

    invoke-static {v0, v15, v2}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v3

    invoke-virtual {v5, v15, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->a()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->f()LL0/U;

    move-result-object v24

    invoke-virtual {v5, v15, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v5

    const/16 v27, 0x0

    const v28, 0x1fff8

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v2, 0x0

    move-object/from16 v29, v15

    move-object v15, v2

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v29

    invoke-static/range {v3 .. v28}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    invoke-interface/range {v29 .. v29}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v3, LDe/i;

    invoke-direct {v3, v0, v1}, LDe/i;-><init>(Ls9/d;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_6
    return-void
.end method

.method private static final c(Ls9/d;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LDe/j;->b(Ls9/d;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
