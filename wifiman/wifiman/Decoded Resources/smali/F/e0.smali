.class public abstract LF/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/e0$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(LY0/d;ILR0/a0;LL0/M;ZI)Ll0/i;
    .locals 0

    invoke-static/range {p0 .. p5}, LF/e0;->b(LY0/d;ILR0/a0;LL0/M;ZI)Ll0/i;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LY0/d;ILR0/a0;LL0/M;ZI)Ll0/i;
    .locals 7

    if-eqz p3, :cond_1

    invoke-virtual {p2}, LR0/a0;->a()LR0/H;

    move-result-object p2

    invoke-interface {p2, p1}, LR0/H;->b(I)I

    move-result p1

    invoke-virtual {p3, p1}, LL0/M;->e(I)Ll0/i;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v0, p1

    goto :goto_2

    :cond_1
    :goto_1
    sget-object p1, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {p1}, Ll0/i$a;->a()Ll0/i;

    move-result-object p1

    goto :goto_0

    :goto_2
    invoke-static {}, LF/V;->b()F

    move-result p1

    invoke-interface {p0, p1}, LY0/d;->x1(F)I

    move-result p0

    if-eqz p4, :cond_2

    int-to-float p1, p5

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result p2

    sub-float/2addr p1, p2

    int-to-float p2, p0

    sub-float/2addr p1, p2

    :goto_3
    move v1, p1

    goto :goto_4

    :cond_2
    invoke-virtual {v0}, Ll0/i;->k()F

    move-result p1

    goto :goto_3

    :goto_4
    if-eqz p4, :cond_3

    int-to-float p0, p5

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result p1

    sub-float/2addr p0, p1

    move v3, p0

    goto :goto_5

    :cond_3
    invoke-virtual {v0}, Ll0/i;->k()F

    move-result p1

    int-to-float p0, p0

    add-float/2addr p1, p0

    move v3, p1

    :goto_5
    const/16 v5, 0xa

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Ll0/i;->d(Ll0/i;FFFFILjava/lang/Object;)Ll0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;LF/f0;LR0/Q;LR0/c0;Lmh/a;)Landroidx/compose/ui/e;
    .locals 4

    invoke-virtual {p1}, LF/f0;->f()Lw/q;

    move-result-object v0

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, LF/f0;->e(J)I

    move-result v1

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, LF/f0;->i(J)V

    invoke-virtual {p2}, LR0/Q;->f()LL0/d;

    move-result-object p2

    invoke-static {p3, p2}, LF/y0;->c(LR0/c0;LL0/d;)LR0/a0;

    move-result-object p2

    sget-object p3, LF/e0$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p3, p3, v0

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    new-instance p3, LF/s;

    invoke-direct {p3, p1, v1, p2, p4}, LF/s;-><init>(LF/f0;ILR0/a0;Lmh/a;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p3, LF/z0;

    invoke-direct {p3, p1, v1, p2, p4}, LF/z0;-><init>(LF/f0;ILR0/a0;Lmh/a;)V

    :goto_0
    invoke-static {p0}, Lj0/e;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    invoke-interface {p0, p3}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;LF/f0;Ly/m;Z)Landroidx/compose/ui/e;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/platform/z0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LF/e0$b;

    invoke-direct {v0, p1, p2, p3}, LF/e0$b;-><init>(LF/f0;Ly/m;Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/z0;->a()Lmh/l;

    move-result-object v0

    :goto_0
    new-instance v1, LF/e0$c;

    invoke-direct {v1, p1, p3, p2}, LF/e0$c;-><init>(LF/f0;ZLy/m;)V

    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/e;Lmh/l;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
