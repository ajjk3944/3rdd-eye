.class public abstract LB/D;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;ILB/E;Lmh/p;LT/l;I)V
    .locals 7

    const v0, -0x7beccd10

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    invoke-interface {p4, p0}, LT/l;->l(Ljava/lang/Object;)Z

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

    if-nez v2, :cond_3

    invoke-interface {p4, p1}, LT/l;->i(I)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p5, 0x180

    if-nez v2, :cond_5

    invoke-interface {p4, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, p5, 0xc00

    if-nez v2, :cond_7

    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v1, 0x493

    const/16 v3, 0x492

    if-ne v2, v3, :cond_9

    invoke-interface {p4}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {p4}, LT/l;->C()V

    goto/16 :goto_6

    :cond_9
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p4, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_b

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_c

    :cond_b
    new-instance v2, LB/C;

    invoke-direct {v2, p0, p2}, LB/C;-><init>(Ljava/lang/Object;LB/E;)V

    invoke-interface {p4, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v2, LB/C;

    invoke-virtual {v2, p1}, LB/C;->g(I)V

    invoke-static {}, LC0/M;->a()LT/H0;

    move-result-object v0

    invoke-interface {p4, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/L;

    invoke-virtual {v2, v0}, LB/C;->i(LC0/L;)V

    invoke-interface {p4, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_d

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_e

    :cond_d
    new-instance v3, LB/D$a;

    invoke-direct {v3, v2}, LB/D$a;-><init>(LB/C;)V

    invoke-interface {p4, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lmh/l;

    const/4 v0, 0x0

    invoke-static {v2, v3, p4, v0}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LC0/M;->a()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v2}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    sget v2, LT/I0;->i:I

    shr-int/lit8 v1, v1, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    invoke-static {v0, p3, p4, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_6
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p4

    if-eqz p4, :cond_10

    new-instance v6, LB/D$b;

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LB/D$b;-><init>(Ljava/lang/Object;ILB/E;Lmh/p;I)V

    invoke-interface {p4, v6}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method
