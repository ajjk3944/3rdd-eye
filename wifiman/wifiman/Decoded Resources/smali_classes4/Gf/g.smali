.class public abstract LGf/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGf/g$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LGf/h;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LGf/g;->e(Landroidx/compose/ui/e;LGf/h;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/l;Lic/b;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LGf/g;->d(Lmh/l;Lic/b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;LGf/h;Lmh/l;LT/l;II)V
    .locals 9

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFeatureSelected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5550ad52

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

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, p5, 0x4

    const/16 v4, 0x100

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_8

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    move v3, v4

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v2, v3

    :cond_8
    :goto_5
    and-int/lit16 v3, v2, 0x93

    const/16 v5, 0x92

    if-ne v3, v5, :cond_b

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {p3}, LT/l;->C()V

    :cond_a
    :goto_6
    move-object v2, p0

    goto/16 :goto_9

    :cond_b
    :goto_7
    if-eqz v1, :cond_c

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_c
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.scan.component.WifiScanFeaturePicker (WifiScanFeature.kt:34)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    invoke-virtual {p1}, LGf/h;->a()Ljava/util/List;

    move-result-object v0

    const v1, 0x624dd84e

    invoke-interface {p3, v1}, LT/l;->U(I)V

    invoke-interface {p3, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_e

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_f

    :cond_e
    invoke-virtual {p1}, LGf/h;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v1

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v3, v1

    check-cast v3, LCi/c;

    invoke-interface {p3}, LT/l;->J()V

    invoke-virtual {p1}, LGf/h;->b()Lic/b;

    move-result-object v0

    const v1, 0x624df4f2

    invoke-interface {p3, v1}, LT/l;->U(I)V

    and-int/lit16 v1, v2, 0x380

    if-ne v1, v4, :cond_10

    const/4 v1, 0x1

    goto :goto_8

    :cond_10
    const/4 v1, 0x0

    :goto_8
    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_11

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_12

    :cond_11
    new-instance v4, LGf/e;

    invoke-direct {v4, p2}, LGf/e;-><init>(Lmh/l;)V

    invoke-interface {p3, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lmh/l;

    invoke-interface {p3}, LT/l;->J()V

    sget-object v5, LGf/g$b;->a:LGf/g$b;

    and-int/lit8 v7, v2, 0xe

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, v0

    move-object v6, p3

    invoke-static/range {v1 .. v8}, LBe/s0;->e(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_6

    :goto_9
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_13

    new-instance p3, LGf/f;

    move-object v1, p3

    move-object v3, p1

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LGf/f;-><init>(Landroidx/compose/ui/e;LGf/h;Lmh/l;II)V

    invoke-interface {p0, p3}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method private static final d(Lmh/l;Lic/b;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;LGf/h;Lmh/l;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LGf/g;->c(Landroidx/compose/ui/e;LGf/h;Lmh/l;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic f(Lic/b;LT/l;I)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, LGf/g;->g(Lic/b;LT/l;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lic/b;LT/l;I)Ljava/lang/String;
    .locals 3

    const v0, 0x45c903d

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.scan.component.text (WifiScanFeature.kt:14)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LGf/g$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-eq p0, p2, :cond_2

    const/4 p2, 0x2

    if-ne p0, p2, :cond_1

    const p0, -0x40132828

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget p0, Lm8/c;->U4:I

    invoke-static {p0, p1, v0}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const p0, -0x40133a4c

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    const p0, -0x401334ad

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget p0, Lm8/c;->V4:I

    invoke-static {p0, p1, v0}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-object p0
.end method
