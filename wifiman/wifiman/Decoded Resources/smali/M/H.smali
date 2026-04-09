.class public abstract LM/H;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM/H$d;
    }
.end annotation


# direct methods
.method public static final a(ZLW0/i;LM/G;LT/l;I)V
    .locals 11

    const v0, -0x50245748

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LT/l;->c(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_5

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v3, v1, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_7

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LT/l;->C()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)"

    invoke-static {v0, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    and-int/lit8 v0, v1, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v2, :cond_9

    move v5, v4

    goto :goto_5

    :cond_9
    move v5, v3

    :goto_5
    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_a

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_b

    :cond_a
    invoke-virtual {p2, p0}, LM/G;->Q(Z)LF/U;

    move-result-object v6

    invoke-interface {p3, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, LF/U;

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-ne v0, v2, :cond_c

    move v3, v4

    :cond_c
    or-int v0, v5, v3

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_d

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_e

    :cond_d
    new-instance v2, LM/H$a;

    invoke-direct {v2, p2, p0}, LM/H$a;-><init>(LM/G;Z)V

    invoke-interface {p3, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    move-object v0, v2

    check-cast v0, LM/j;

    invoke-virtual {p2}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->m(J)Z

    move-result v4

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {p3, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_f

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_10

    :cond_f
    new-instance v5, LM/H$b;

    const/4 v3, 0x0

    invoke-direct {v5, v6, v3}, LM/H$b;-><init>(LF/U;Ldh/e;)V

    invoke-interface {p3, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Lmh/p;

    invoke-static {v2, v6, v5}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object v7

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v9, v1, 0x3f0

    const/16 v10, 0x10

    const-wide/16 v5, 0x0

    move-object v1, v0

    move v2, p0

    move-object v3, p1

    move-object v8, p3

    invoke-static/range {v1 .. v10}, LM/a;->b(LM/j;ZLW0/i;ZJLandroidx/compose/ui/e;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_6
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_12

    new-instance v0, LM/H$c;

    invoke-direct {v0, p0, p1, p2, p4}, LM/H$c;-><init>(ZLW0/i;LM/G;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method public static final b(LM/G;J)J
    .locals 7

    invoke-virtual {p0}, LM/G;->A()Ll0/g;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0}, LM/G;->N()LL0/d;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0}, LM/G;->C()LF/p;

    move-result-object v2

    const/4 v3, -0x1

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    sget-object v4, LM/H$d;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    :goto_0
    if-eq v2, v3, :cond_9

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v2, v3, :cond_3

    if-eq v2, v4, :cond_3

    const/4 v3, 0x3

    if-ne v2, v3, :cond_2

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result v2

    goto :goto_1

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result v2

    :goto_1
    invoke-virtual {p0}, LM/G;->L()LF/E;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, LF/E;->j()LF/j0;

    move-result-object v3

    if-nez v3, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-virtual {p0}, LM/G;->L()LF/E;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, LF/E;->v()LF/S;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, LF/S;->k()LL0/d;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, LM/G;->J()LR0/H;

    move-result-object p0

    invoke-interface {p0, v2}, LR0/H;->b(I)I

    move-result p0

    const/4 v2, 0x0

    invoke-virtual {v5}, LL0/d;->length()I

    move-result v5

    invoke-static {p0, v2, v5}, Lsh/m;->k(III)I

    move-result p0

    invoke-virtual {v3, v0, v1}, LF/j0;->j(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    invoke-virtual {v3}, LF/j0;->f()LL0/M;

    move-result-object v1

    invoke-virtual {v1, p0}, LL0/M;->q(I)I

    move-result p0

    invoke-virtual {v1, p0}, LL0/M;->s(I)F

    move-result v2

    invoke-virtual {v1, p0}, LL0/M;->t(I)F

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v0, v5, v2}, Lsh/m;->j(FFF)F

    move-result v2

    sget-object v3, LY0/r;->b:LY0/r$a;

    invoke-virtual {v3}, LY0/r$a;->a()J

    move-result-wide v5

    invoke-static {p1, p2, v5, v6}, LY0/r;->e(JJ)Z

    move-result v3

    if-nez v3, :cond_6

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {p1, p2}, LY0/r;->g(J)I

    move-result p1

    div-int/2addr p1, v4

    int-to-float p1, p1

    cmpl-float p1, v0, p1

    if-lez p1, :cond_6

    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_6
    invoke-virtual {v1, p0}, LL0/M;->v(I)F

    move-result p1

    invoke-virtual {v1, p0}, LL0/M;->m(I)F

    move-result p0

    sub-float/2addr p0, p1

    int-to-float p2, v4

    div-float/2addr p0, p2

    add-float/2addr p0, p1

    invoke-static {v2, p0}, Ll0/h;->a(FF)J

    move-result-wide p0

    return-wide p0

    :cond_7
    :goto_2
    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_8
    :goto_3
    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_9
    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_a
    :goto_4
    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_b
    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    return-wide p0
.end method

.method public static final c(LM/G;Z)Z
    .locals 1

    invoke-virtual {p0}, LM/G;->L()LF/E;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF/E;->i()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LM/A;->b(LC0/r;)Ll0/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LM/G;->G(Z)J

    move-result-wide p0

    invoke-static {v0, p0, p1}, LM/A;->a(Ll0/i;J)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
