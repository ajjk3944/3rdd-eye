.class public abstract LI/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLl0/i;)J
    .locals 3

    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v0

    invoke-virtual {p2}, Ll0/i;->k()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-virtual {p2}, Ll0/i;->k()F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v0

    invoke-virtual {p2}, Ll0/i;->l()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    invoke-virtual {p2}, Ll0/i;->l()F

    move-result v0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v0

    :goto_0
    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result v1

    invoke-virtual {p2}, Ll0/i;->n()F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_2

    invoke-virtual {p2}, Ll0/i;->n()F

    move-result p0

    goto :goto_1

    :cond_2
    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result v1

    invoke-virtual {p2}, Ll0/i;->e()F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_3

    invoke-virtual {p2}, Ll0/i;->e()F

    move-result p0

    goto :goto_1

    :cond_3
    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result p0

    :goto_1
    invoke-static {v0, p0}, Ll0/h;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final b(LI/l1;J)J
    .locals 2

    invoke-virtual {p0}, LI/l1;->j()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LI/l1;->e()LC0/r;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, LC0/r;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p0, p1, p2}, LC0/r;->b0(LC0/r;J)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ll0/g;->v()J

    move-result-wide p1

    :cond_2
    return-wide p1
.end method

.method public static final c(LI/l1;J)J
    .locals 3

    invoke-virtual {p0}, LI/l1;->j()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p0}, LI/l1;->d()LC0/r;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0}, LC0/r;->M()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v2

    :goto_1
    if-eqz p0, :cond_2

    invoke-interface {p0, v0, p1, p2}, LC0/r;->b0(LC0/r;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object v2

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ll0/g;->v()J

    move-result-wide p1

    :cond_3
    return-wide p1
.end method

.method public static final d(LI/l1;J)J
    .locals 1

    invoke-virtual {p0}, LI/l1;->e()LC0/r;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LC0/r;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1, p2}, LC0/r;->W(J)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method
