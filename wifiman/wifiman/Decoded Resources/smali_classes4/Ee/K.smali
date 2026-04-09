.class public abstract LEe/K;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LEe/K;->c(Landroidx/compose/ui/e;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LT/l;II)V
    .locals 8

    const v0, -0x6934c3e0

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p3, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v3, p2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p2, 0x6

    if-nez v3, :cond_2

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    or-int/2addr v3, p2

    goto :goto_1

    :cond_2
    move v3, p2

    :goto_1
    and-int/lit8 v4, v3, 0x3

    if-ne v4, v2, :cond_4

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_5
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.list.ListItemTrailingChevron (ListItemTrailingChevron.kt:17)"

    invoke-static {v0, v3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->k()Ls9/b;

    move-result-object v1

    const/16 v0, 0x14

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p0, v0}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v0, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v0, p1, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->c()Lma/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$c;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v4, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, LEe/J;

    invoke-direct {v0, p0, p2, p3}, LEe/J;-><init>(Landroidx/compose/ui/e;II)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, LEe/K;->b(Landroidx/compose/ui/e;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
