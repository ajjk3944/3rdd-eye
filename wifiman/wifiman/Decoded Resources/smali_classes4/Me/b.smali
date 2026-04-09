.class public abstract LMe/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;FILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LMe/b;->c(Landroidx/compose/ui/e;FILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;FLT/l;I)V
    .locals 16

    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p3

    const-string v0, "modifier"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x18546d56

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v1, v14, 0x6

    if-nez v1, :cond_1

    invoke-interface {v15, v12}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, v14, 0x30

    if-nez v2, :cond_3

    invoke-interface {v15, v13}, LT/l;->g(F)Z

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

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.discovery.component.DiscoveryProgressContainer (DiscoveryProgressContainer.kt:35)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const/4 v0, 0x6

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v7

    const/16 v0, 0x32

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v2

    new-instance v0, LMe/b$a;

    invoke-direct {v0, v13}, LMe/b$a;-><init>(F)V

    const/16 v3, 0x36

    const v4, 0x4f82b092

    const/4 v5, 0x1

    invoke-static {v4, v5, v0, v15, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    and-int/lit8 v0, v1, 0xe

    const/high16 v1, 0x1b0000

    or-int v10, v0, v1

    const/16 v11, 0x1c

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v9, 0x0

    move-object/from16 v0, p0

    move-object v1, v2

    move-wide v2, v3

    move-wide v4, v5

    move-object v6, v9

    move-object v9, v15

    invoke-static/range {v0 .. v11}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    invoke-interface {v15}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, LMe/a;

    invoke-direct {v1, v12, v13, v14}, LMe/a;-><init>(Landroidx/compose/ui/e;FI)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;FILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LMe/b;->b(Landroidx/compose/ui/e;FLT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
