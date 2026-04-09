.class public abstract LBe/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ljava/lang/String;JILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LBe/u;->g(Landroidx/compose/ui/e;Ljava/lang/String;JILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(JJLandroid/content/Context;)Lh4/a;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LBe/u;->e(JJLandroid/content/Context;)Lh4/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Lh4/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LBe/u;->f(Ljava/lang/String;Lh4/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;Ljava/lang/String;JLT/l;I)V
    .locals 8

    const-string v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5f8cdd3e

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-interface {p4, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p5, 0x180

    const/16 v4, 0x100

    if-nez v2, :cond_5

    invoke-interface {p4, p2, p3}, LT/l;->j(J)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v4

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v5, 0x92

    if-ne v2, v5, :cond_7

    invoke-interface {p4}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p4}, LT/l;->C()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v5, "com.ui.wifiman.ui.component.HtmlText (HtmlText.kt:17)"

    invoke-static {v0, v1, v2, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object v0, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v0, p4, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v5

    const v0, -0x11a65920    # -1.6839997E28f

    invoke-interface {p4, v0}, LT/l;->U(I)V

    and-int/lit16 v0, v1, 0x380

    const/4 v2, 0x0

    const/4 v7, 0x1

    if-ne v0, v4, :cond_9

    move v0, v7

    goto :goto_5

    :cond_9
    move v0, v2

    :goto_5
    invoke-interface {p4, v5, v6}, LT/l;->j(J)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_a

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_b

    :cond_a
    new-instance v4, LBe/r;

    invoke-direct {v4, p2, p3, v5, v6}, LBe/r;-><init>(JJ)V

    invoke-interface {p4, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v0, v4

    check-cast v0, Lmh/l;

    invoke-interface {p4}, LT/l;->J()V

    const v4, -0x11a63522

    invoke-interface {p4, v4}, LT/l;->U(I)V

    and-int/lit8 v4, v1, 0x70

    if-ne v4, v3, :cond_c

    move v2, v7

    :cond_c
    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_d

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_e

    :cond_d
    new-instance v3, LBe/s;

    invoke-direct {v3, p1}, LBe/s;-><init>(Ljava/lang/String;)V

    invoke-interface {p4, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lmh/l;

    invoke-interface {p4}, LT/l;->J()V

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v5, v1, 0x70

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v4, p4

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/viewinterop/e;->a(Lmh/l;Landroidx/compose/ui/e;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_6
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p4

    if-eqz p4, :cond_10

    new-instance v6, LBe/t;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p5

    invoke-direct/range {v0 .. v5}, LBe/t;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;JI)V

    invoke-interface {p4, v6}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final e(JJLandroid/content/Context;)Lh4/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh4/a;

    invoke-direct {v0, p4}, Lh4/a;-><init>(Landroid/content/Context;)V

    const/4 p4, 0x1

    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setAutoLinkMask(I)V

    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setLinksClickable(Z)V

    invoke-static {p0, p1}, Lm0/x0;->j(J)I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {p2, p3}, Lm0/x0;->j(J)I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setLinkTextColor(I)V

    return-object v0
.end method

.method private static final f(Ljava/lang/String;Lh4/a;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;Ljava/lang/String;JILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p5

    invoke-static/range {v0 .. v5}, LBe/u;->d(Landroidx/compose/ui/e;Ljava/lang/String;JLT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
