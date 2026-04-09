.class public abstract Lw/F;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ly0/n;Z)J
    .locals 7

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly0/y;

    invoke-virtual {v5}, Ly0/y;->i()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Ly0/y;->l()Z

    move-result v6

    if-eqz v6, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {v5}, Ly0/y;->h()J

    move-result-wide v5

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Ly0/y;->k()J

    move-result-wide v5

    :goto_1
    invoke-static {v0, v1, v5, v6}, Ll0/g;->r(JJ)J

    move-result-wide v0

    add-int/lit8 v4, v4, 0x1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-nez v4, :cond_3

    sget-object p0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p0}, Ll0/g$a;->b()J

    move-result-wide p0

    goto :goto_2

    :cond_3
    int-to-float p0, v4

    invoke-static {v0, v1, p0}, Ll0/g;->h(JF)J

    move-result-wide p0

    :goto_2
    return-wide p0
.end method

.method public static final b(Ly0/n;Z)F
    .locals 8

    invoke-static {p0, p1}, Lw/F;->a(Ly0/n;Z)J

    move-result-wide v0

    sget-object v2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v2}, Ll0/g$a;->b()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll0/g;->j(JJ)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    return v3

    :cond_0
    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_3

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly0/y;

    invoke-virtual {v6}, Ly0/y;->i()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Ly0/y;->l()Z

    move-result v7

    if-eqz v7, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual {v6}, Ly0/y;->h()J

    move-result-wide v6

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Ly0/y;->k()J

    move-result-wide v6

    :goto_1
    invoke-static {v6, v7, v0, v1}, Ll0/g;->q(JJ)J

    move-result-wide v6

    invoke-static {v6, v7}, Ll0/g;->k(J)F

    move-result v6

    add-float/2addr v3, v6

    add-int/lit8 v5, v5, 0x1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    int-to-float p0, v5

    div-float/2addr v3, p0

    return v3
.end method

.method public static final c(Ly0/n;)F
    .locals 3

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lw/F;->b(Ly0/n;Z)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lw/F;->b(Ly0/n;Z)F

    move-result p0

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v1, p0, v1

    if-nez v1, :cond_1

    :goto_0
    const/high16 p0, 0x3f800000    # 1.0f

    return p0

    :cond_1
    div-float/2addr v0, p0

    return v0
.end method
