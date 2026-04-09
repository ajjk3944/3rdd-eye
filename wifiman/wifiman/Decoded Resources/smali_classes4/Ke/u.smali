.class public abstract LKe/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lmh/a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LKe/u;->c(Landroidx/compose/ui/e;Lmh/a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lmh/a;LT/l;I)V
    .locals 12

    const/16 v0, 0x30

    const-string v1, "modifier"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClick"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x58829d81

    invoke-interface {p2, v1}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.device.card.DeviceDetailCardSpeedtestButton (DeviceDetailCardSpeedtestButton.kt:15)"

    invoke-static {v1, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v1

    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3}, Lz/c;->g()Lz/c$m;

    move-result-object v3

    invoke-static {v3, v1, p2, v0}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p2, v1}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {p2, p0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {p2, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {p2}, LT/l;->I()V

    :goto_4
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v0, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v7, v4, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v7}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v7, v5, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/k;->a:Lz/k;

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v3, LN9/b;->a:LN9/b;

    invoke-virtual {v3}, LN9/b;->K()Ls9/b;

    move-result-object v4

    sget v3, Lm8/c;->X:I

    invoke-static {v3, p2, v1}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v5

    sget-object v3, Lw9/c;->CLEAR:Lw9/c;

    shl-int/lit8 v1, v2, 0xf

    const/high16 v2, 0x380000

    and-int/2addr v1, v2

    or-int/lit8 v10, v1, 0x36

    const/16 v11, 0x30

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    move-object v8, p1

    move-object v9, p2

    invoke-static/range {v2 .. v11}, Lw9/e;->b(Landroidx/compose/ui/e;Lw9/c;Ls9/b;Ljava/lang/String;ZZLmh/a;LT/l;II)V

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, LKe/t;

    invoke-direct {v0, p0, p1, p3}, LKe/t;-><init>(Landroidx/compose/ui/e;Lmh/a;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lmh/a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LKe/u;->b(Landroidx/compose/ui/e;Lmh/a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
