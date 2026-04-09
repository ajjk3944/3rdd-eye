.class public abstract LAf/E;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LAf/B;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LAf/E;->e(Landroidx/compose/ui/e;LAf/B;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/l;Ljava/util/Map;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LAf/E;->d(Lmh/l;Ljava/util/Map;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;LAf/B;Lmh/l;LT/l;II)V
    .locals 9

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSpectrumSelected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x24be4faf

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

    const/16 v4, 0x10

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
    move v3, v4

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p5, 0x4

    const/16 v5, 0x100

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_8

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    move v3, v5

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v2, v3

    :cond_8
    :goto_5
    and-int/lit16 v3, v2, 0x93

    const/16 v6, 0x92

    if-ne v3, v6, :cond_b

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {p3}, LT/l;->C()V

    :cond_a
    :goto_6
    move-object v2, p0

    goto/16 :goto_b

    :cond_b
    :goto_7
    if-eqz v1, :cond_c

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_c
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.component.WifiSpectrumPicker (WifiSpectrumPicker.kt:30)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    invoke-virtual {p1}, LAf/B;->c()Ljava/util/List;

    move-result-object v0

    const v1, 0x3fd1b6d9

    invoke-interface {p3, v1}, LT/l;->U(I)V

    invoke-interface {p3, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    const/16 v3, 0xa

    if-nez v0, :cond_e

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_10

    :cond_e
    invoke-virtual {p1}, LAf/B;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LS8/c;

    invoke-static {v6}, LAf/E;->f(LS8/c;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_f
    invoke-static {v1}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v1

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    move-object v0, v1

    check-cast v0, LCi/c;

    invoke-interface {p3}, LT/l;->J()V

    invoke-virtual {p1}, LAf/B;->c()Ljava/util/List;

    move-result-object v1

    const v6, 0x3fd1c54f

    invoke-interface {p3, v6}, LT/l;->U(I)V

    invoke-interface {p3, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_11

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v6, v1, :cond_13

    :cond_11
    invoke-virtual {p1}, LAf/B;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, LZg/U;->d(I)I

    move-result v3

    invoke-static {v3, v4}, Lsh/m;->d(II)I

    move-result v3

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LS8/c;

    invoke-static {v4}, LAf/E;->f(LS8/c;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_12
    invoke-interface {p3, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v6, Ljava/util/Map;

    invoke-interface {p3}, LT/l;->J()V

    invoke-virtual {p1}, LAf/B;->b()LS8/c;

    move-result-object v1

    invoke-static {v1}, LAf/E;->f(LS8/c;)Ljava/lang/String;

    move-result-object v3

    const v1, 0x3fd1e273

    invoke-interface {p3, v1}, LT/l;->U(I)V

    and-int/lit16 v1, v2, 0x380

    if-ne v1, v5, :cond_14

    const/4 v1, 0x1

    goto :goto_a

    :cond_14
    const/4 v1, 0x0

    :goto_a
    invoke-interface {p3, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_15

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_16

    :cond_15
    new-instance v4, LAf/C;

    invoke-direct {v4, p2, v6}, LAf/C;-><init>(Lmh/l;Ljava/util/Map;)V

    invoke-interface {p3, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    check-cast v4, Lmh/l;

    invoke-interface {p3}, LT/l;->J()V

    new-instance v5, LAf/E$a;

    invoke-direct {v5, v6, p1}, LAf/E$a;-><init>(Ljava/util/Map;LAf/B;)V

    and-int/lit8 v7, v2, 0xe

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, v3

    move-object v3, v0

    move-object v6, p3

    invoke-static/range {v1 .. v8}, LBe/s0;->e(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_6

    :goto_b
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_17

    new-instance p3, LAf/D;

    move-object v1, p3

    move-object v3, p1

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LAf/D;-><init>(Landroidx/compose/ui/e;LAf/B;Lmh/l;II)V

    invoke-interface {p0, p3}, LT/X0;->a(Lmh/p;)V

    :cond_17
    return-void
.end method

.method private static final d(Lmh/l;Ljava/util/Map;Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;LAf/B;Lmh/l;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LAf/E;->c(Landroidx/compose/ui/e;LAf/B;Lmh/l;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(LS8/c;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    const-string p0, "all"

    :cond_1
    return-object p0
.end method
