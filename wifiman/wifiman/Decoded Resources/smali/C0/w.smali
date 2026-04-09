.class public abstract LC0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Lmh/p;LC0/C;LT/l;II)V
    .locals 7

    const v0, 0x74399e13

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

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

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

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_8

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v2, v3

    :cond_8
    :goto_5
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_b

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

    const-string v3, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:248)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    const/4 v0, 0x0

    invoke-static {p3, v0}, LT/j;->a(LT/l;I)I

    move-result v0

    invoke-static {p3, p0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-interface {p3}, LT/l;->G()LT/x;

    move-result-object v3

    sget-object v4, LE0/G;->X:LE0/G$d;

    invoke-virtual {v4}, LE0/G$d;->a()Lmh/a;

    move-result-object v4

    shl-int/lit8 v2, v2, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/lit8 v2, v2, 0x6

    invoke-interface {p3}, LT/l;->x()LT/f;

    move-result-object v5

    if-nez v5, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {p3}, LT/l;->u()V

    invoke-interface {p3}, LT/l;->o()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {p3, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_f
    invoke-interface {p3}, LT/l;->I()V

    :goto_8
    invoke-static {p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v4, p2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v4, v3, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, LC0/w$a;->a:LC0/w$a;

    invoke-static {v4, v3}, LT/E1;->b(LT/l;Lmh/l;)V

    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v4, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v4}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_10

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    :cond_10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    shr-int/lit8 v0, v2, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p3, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_6

    :goto_9
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_12

    new-instance p3, LC0/w$b;

    move-object v1, p3

    move-object v3, p1

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LC0/w$b;-><init>(Landroidx/compose/ui/e;Lmh/p;LC0/C;II)V

    invoke-interface {p0, p3}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method public static final b(Ljava/util/List;)Lmh/p;
    .locals 2

    new-instance v0, LC0/w$c;

    invoke-direct {v0, p0}, LC0/w$c;-><init>(Ljava/util/List;)V

    const p0, -0x74725ab7

    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;)Lmh/q;
    .locals 2

    new-instance v0, LC0/w$d;

    invoke-direct {v0, p0}, LC0/w$d;-><init>(Landroidx/compose/ui/e;)V

    const p0, -0x352954e

    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p0

    return-object p0
.end method
