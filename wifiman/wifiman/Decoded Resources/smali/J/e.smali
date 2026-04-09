.class public abstract LJ/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/e$a;
    }
.end annotation


# direct methods
.method public static final a(LI/o1;LJ/j;LI/l1;J)J
    .locals 5

    invoke-virtual {p1}, LJ/j;->X()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/h;->d(J)Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {p0}, LI/o1;->l()LH/h;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, LI/o1;->l()LH/h;

    move-result-object p0

    invoke-virtual {p0}, LH/h;->f()J

    move-result-wide v2

    invoke-virtual {p1}, LJ/j;->V()LF/p;

    move-result-object p0

    const/4 p1, -0x1

    if-nez p0, :cond_1

    move p0, p1

    goto :goto_0

    :cond_1
    sget-object v4, LJ/e$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v4, p0

    :goto_0
    if-eq p0, p1, :cond_8

    const/4 p1, 0x1

    const/4 v4, 0x2

    if-eq p0, p1, :cond_3

    if-eq p0, v4, :cond_3

    const/4 p1, 0x3

    if-ne p0, p1, :cond_2

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result p0

    goto :goto_1

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result p0

    :goto_1
    invoke-virtual {p2}, LI/l1;->f()LL0/M;

    move-result-object p1

    if-nez p1, :cond_4

    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_4
    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    invoke-virtual {p1, p0}, LL0/M;->q(I)I

    move-result p0

    invoke-virtual {p1, p0}, LL0/M;->s(I)F

    move-result v1

    invoke-virtual {p1, p0}, LL0/M;->t(I)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v0, v3, v1}, Lsh/m;->j(FFF)F

    move-result v1

    sget-object v2, LY0/r;->b:LY0/r$a;

    invoke-virtual {v2}, LY0/r$a;->a()J

    move-result-wide v2

    invoke-static {p3, p4, v2, v3}, LY0/r;->e(JJ)Z

    move-result v2

    if-nez v2, :cond_5

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result p3

    div-int/2addr p3, v4

    int-to-float p3, p3

    cmpl-float p3, v0, p3

    if-lez p3, :cond_5

    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_5
    invoke-virtual {p1, p0}, LL0/M;->v(I)F

    move-result p3

    invoke-virtual {p1, p0}, LL0/M;->m(I)F

    move-result p0

    sub-float/2addr p0, p3

    int-to-float p1, v4

    div-float/2addr p0, p1

    add-float/2addr p0, p3

    invoke-static {v1, p0}, Ll0/h;->a(FF)J

    move-result-wide p0

    invoke-virtual {p2}, LI/l1;->j()LC0/r;

    move-result-object p3

    if-eqz p3, :cond_7

    invoke-interface {p3}, LC0/r;->M()Z

    move-result p4

    if-eqz p4, :cond_6

    goto :goto_2

    :cond_6
    const/4 p3, 0x0

    :goto_2
    if-eqz p3, :cond_7

    invoke-static {p3}, LM/A;->b(LC0/r;)Ll0/i;

    move-result-object p3

    invoke-static {p0, p1, p3}, LI/m1;->a(JLl0/i;)J

    move-result-wide p0

    :cond_7
    invoke-static {p2, p0, p1}, LI/m1;->c(LI/l1;J)J

    move-result-wide p0

    return-wide p0

    :cond_8
    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_9
    :goto_3
    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    return-wide p0
.end method
