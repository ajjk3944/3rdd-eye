.class public abstract Ll0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(FFFFFF)Ll0/k;
    .locals 15

    invoke-static/range {p4 .. p5}, Ll0/b;->a(FF)J

    move-result-wide v11

    new-instance v14, Ll0/k;

    const/4 v13, 0x0

    move-object v0, v14

    move v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-wide v5, v11

    move-wide v7, v11

    move-wide v9, v11

    invoke-direct/range {v0 .. v13}, Ll0/k;-><init>(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v14
.end method

.method public static final b(Ll0/i;JJJJ)Ll0/k;
    .locals 15

    new-instance v14, Ll0/k;

    invoke-virtual {p0}, Ll0/i;->k()F

    move-result v1

    invoke-virtual {p0}, Ll0/i;->n()F

    move-result v2

    invoke-virtual {p0}, Ll0/i;->l()F

    move-result v3

    invoke-virtual {p0}, Ll0/i;->e()F

    move-result v4

    const/4 v13, 0x0

    move-object v0, v14

    move-wide/from16 v5, p1

    move-wide/from16 v7, p3

    move-wide/from16 v9, p5

    move-wide/from16 v11, p7

    invoke-direct/range {v0 .. v13}, Ll0/k;-><init>(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v14
.end method

.method public static synthetic c(Ll0/i;JJJJILjava/lang/Object;)Ll0/k;
    .locals 8

    and-int/lit8 v0, p9, 0x2

    if-eqz v0, :cond_0

    sget-object v0, Ll0/a;->a:Ll0/a$a;

    invoke-virtual {v0}, Ll0/a$a;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    and-int/lit8 v2, p9, 0x4

    if-eqz v2, :cond_1

    sget-object v2, Ll0/a;->a:Ll0/a$a;

    invoke-virtual {v2}, Ll0/a$a;->a()J

    move-result-wide v2

    goto :goto_1

    :cond_1
    move-wide v2, p3

    :goto_1
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_2

    sget-object v4, Ll0/a;->a:Ll0/a$a;

    invoke-virtual {v4}, Ll0/a$a;->a()J

    move-result-wide v4

    goto :goto_2

    :cond_2
    move-wide v4, p5

    :goto_2
    and-int/lit8 v6, p9, 0x10

    if-eqz v6, :cond_3

    sget-object v6, Ll0/a;->a:Ll0/a$a;

    invoke-virtual {v6}, Ll0/a$a;->a()J

    move-result-wide v6

    goto :goto_3

    :cond_3
    move-wide v6, p7

    :goto_3
    move-wide p1, v0

    move-wide p3, v2

    move-wide p5, v4

    move-wide p7, v6

    invoke-static/range {p0 .. p8}, Ll0/l;->b(Ll0/i;JJJJ)Ll0/k;

    move-result-object v0

    return-object v0
.end method

.method public static final d(FFFFJ)Ll0/k;
    .locals 6

    invoke-static {p4, p5}, Ll0/a;->d(J)F

    move-result v4

    invoke-static {p4, p5}, Ll0/a;->e(J)F

    move-result v5

    move v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-static/range {v0 .. v5}, Ll0/l;->a(FFFFFF)Ll0/k;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ll0/k;)Ll0/i;
    .locals 4

    new-instance v0, Ll0/i;

    invoke-virtual {p0}, Ll0/k;->e()F

    move-result v1

    invoke-virtual {p0}, Ll0/k;->g()F

    move-result v2

    invoke-virtual {p0}, Ll0/k;->f()F

    move-result v3

    invoke-virtual {p0}, Ll0/k;->a()F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Ll0/i;-><init>(FFFF)V

    return-object v0
.end method

.method public static final f(Ll0/k;)Z
    .locals 3

    invoke-virtual {p0}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ll0/k;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->e(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ll0/k;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->d(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ll0/k;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->e(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ll0/k;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->d(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ll0/k;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->e(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ll0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->d(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ll0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->e(J)F

    move-result p0

    cmpg-float p0, v0, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
