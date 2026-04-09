.class public abstract Lp0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo0/f;Lp0/c;)V
    .locals 1

    invoke-interface {p0}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {p0}, Lo0/f;->k1()Lo0/d;

    move-result-object p0

    invoke-interface {p0}, Lo0/d;->g()Lp0/c;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Lp0/c;->h(Lm0/n0;Lp0/c;)V

    return-void
.end method

.method public static final b(Lp0/c;Lm0/Q0;)V
    .locals 8

    instance-of v0, p1, Lm0/Q0$b;

    if-eqz v0, :cond_0

    check-cast p1, Lm0/Q0$b;

    invoke-virtual {p1}, Lm0/Q0$b;->b()Ll0/i;

    move-result-object v0

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v0

    invoke-virtual {p1}, Lm0/Q0$b;->b()Ll0/i;

    move-result-object v1

    invoke-virtual {v1}, Ll0/i;->n()F

    move-result v1

    invoke-static {v0, v1}, Ll0/h;->a(FF)J

    move-result-wide v0

    invoke-virtual {p1}, Lm0/Q0$b;->b()Ll0/i;

    move-result-object v2

    invoke-virtual {v2}, Ll0/i;->r()F

    move-result v2

    invoke-virtual {p1}, Lm0/Q0$b;->b()Ll0/i;

    move-result-object p1

    invoke-virtual {p1}, Ll0/i;->j()F

    move-result p1

    invoke-static {v2, p1}, Ll0/n;->a(FF)J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lp0/c;->R(JJ)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lm0/Q0$a;

    if-eqz v0, :cond_1

    check-cast p1, Lm0/Q0$a;

    invoke-virtual {p1}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp0/c;->O(Lm0/U0;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lm0/Q0$c;

    if-eqz v0, :cond_3

    check-cast p1, Lm0/Q0$c;

    invoke-virtual {p1}, Lm0/Q0$c;->c()Lm0/U0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lm0/Q0$c;->c()Lm0/U0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp0/c;->O(Lm0/U0;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lm0/Q0$c;->b()Ll0/k;

    move-result-object p1

    invoke-virtual {p1}, Ll0/k;->e()F

    move-result v0

    invoke-virtual {p1}, Ll0/k;->g()F

    move-result v1

    invoke-static {v0, v1}, Ll0/h;->a(FF)J

    move-result-wide v3

    invoke-virtual {p1}, Ll0/k;->j()F

    move-result v0

    invoke-virtual {p1}, Ll0/k;->d()F

    move-result v1

    invoke-static {v0, v1}, Ll0/n;->a(FF)J

    move-result-wide v5

    invoke-virtual {p1}, Ll0/k;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v7

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lp0/c;->W(JJF)V

    :cond_3
    :goto_0
    return-void
.end method
