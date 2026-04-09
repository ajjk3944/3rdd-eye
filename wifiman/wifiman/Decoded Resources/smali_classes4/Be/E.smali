.class public abstract LBe/E;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;JIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LBe/E;->c(Landroidx/compose/ui/e;JIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;JLT/l;II)V
    .locals 9

    const v0, -0x724d9b75

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_2

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p4

    goto :goto_1

    :cond_2
    move v2, p4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_5

    invoke-interface {p3, p1, p2}, LT/l;->j(J)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_8

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {p3}, LT/l;->C()V

    :cond_7
    :goto_4
    move-object v2, p0

    goto :goto_6

    :cond_8
    :goto_5
    if-eqz v1, :cond_9

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_9
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_a

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.component.StatusDot (StatusDot.kt:22)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    shr-int/lit8 v0, v2, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v7, v0, 0x180

    const/16 v8, 0xa

    const/4 v3, 0x0

    const-string v4, "dot color"

    const/4 v5, 0x0

    move-wide v1, p1

    move-object v6, p3

    invoke-static/range {v1 .. v8}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {p0, v1}, Landroidx/compose/foundation/layout/r;->o(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v2

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v0

    invoke-static {v1, v2, v3, v0}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p3, v1}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    goto :goto_4

    :goto_6
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_b

    new-instance p3, LBe/D;

    move-object v1, p3

    move-wide v3, p1

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LBe/D;-><init>(Landroidx/compose/ui/e;JII)V

    invoke-interface {p0, p3}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;JIILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LBe/E;->b(Landroidx/compose/ui/e;JLT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
