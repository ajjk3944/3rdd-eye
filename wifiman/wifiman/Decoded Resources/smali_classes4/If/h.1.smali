.class public abstract LIf/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LIf/f;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LIf/h;->c(Landroidx/compose/ui/e;LIf/f;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LIf/f;LT/l;I)V
    .locals 10

    const-string v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x76d5d60d

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    const/16 v4, 0x20

    if-nez v3, :cond_3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, v1, 0x13

    const/16 v5, 0x12

    if-ne v3, v5, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v5, "com.ui.wifiman.ui.wmw.WmwStatusPopupAdoptionFailed (WmwStatusPopupAdoptionFailed.kt:35)"

    invoke-static {v0, v1, v3, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v0, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v0, p2, v3}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->a()Lra/b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lra/b$a$a;->c()F

    move-result v0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {p0, v0, v3, v2, v5}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {p1}, LIf/f;->getTitle()LLi/N;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v6, 0x1

    invoke-static {v2, v5, p2, v3, v6}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls9/d;

    invoke-virtual {p1}, LIf/f;->n0()LLi/N;

    move-result-object v7

    invoke-static {v7, v5, p2, v3, v6}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls9/d;

    new-instance v7, Ls9/d$b;

    sget v8, Lm8/c;->f:I

    invoke-direct {v7, v8}, Ls9/d$b;-><init>(I)V

    const v8, 0x308a3db2

    invoke-interface {p2, v8}, LT/l;->U(I)V

    and-int/lit8 v1, v1, 0x70

    if-ne v1, v4, :cond_7

    move v3, v6

    :cond_7
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v3, :cond_8

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_9

    :cond_8
    new-instance v1, LIf/h$a;

    invoke-direct {v1, p1}, LIf/h$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v6, v1

    check-cast v6, Lmh/a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, v0

    move-object v3, v5

    move-object v4, v7

    move-object v5, v6

    move-object v6, p2

    move v7, v8

    move v8, v9

    invoke-static/range {v1 .. v8}, LJf/g;->c(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;Lmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_4
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, LIf/g;

    invoke-direct {v0, p0, p1, p3}, LIf/g;-><init>(Landroidx/compose/ui/e;LIf/f;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LIf/f;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LIf/h;->b(Landroidx/compose/ui/e;LIf/f;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
