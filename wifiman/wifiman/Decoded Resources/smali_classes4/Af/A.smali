.class public abstract LAf/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LS8/c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LAf/A;->c(Landroidx/compose/ui/e;LS8/c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LS8/c;LT/l;II)V
    .locals 7

    const v0, -0x1e77cd73

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_5

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_7

    invoke-interface {p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_5

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_8
    if-eqz v3, :cond_9

    const/4 p1, 0x0

    :cond_9
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_a

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.component.WifiSpectrumChartHeader (WifiSpectrumChartHeader.kt:16)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    new-instance v0, Ls9/d$b;

    sget v1, Lm8/c;->n5:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LNe/h;->d(LS8/c;)Ls9/d;

    move-result-object v3

    and-int/lit8 v5, v2, 0xe

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, v0

    move-object v4, p2

    invoke-static/range {v1 .. v6}, LAf/G;->b(Landroidx/compose/ui/e;Ls9/d;Ls9/d;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, LAf/z;

    invoke-direct {v0, p0, p1, p3, p4}, LAf/z;-><init>(Landroidx/compose/ui/e;LS8/c;II)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LS8/c;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LAf/A;->b(Landroidx/compose/ui/e;LS8/c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
