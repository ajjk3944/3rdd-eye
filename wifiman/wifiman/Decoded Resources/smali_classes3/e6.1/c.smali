.class public abstract Le6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lu6/e;FLj6/b;)F
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "segmentProperties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lj6/b;->a()F

    move-result p2

    invoke-interface {p0}, Lu6/e;->c()Lk6/c;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lk6/c;->b(Lk6/c;LY5/c$b;ILjava/lang/Object;)Lk6/d;

    move-result-object v0

    invoke-virtual {v0}, Lk6/d;->g()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr p2, v0

    invoke-interface {p0}, Lu6/e;->l()F

    move-result v0

    mul-float/2addr p2, v0

    invoke-interface {p0}, Lu6/e;->j()F

    move-result v0

    sub-float/2addr p2, p1

    mul-float/2addr v0, p2

    invoke-interface {p0}, Lu6/e;->h()Z

    move-result p0

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    invoke-static {v0, p1}, Lsh/m;->c(FF)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {v0, p1}, Lsh/m;->f(FF)F

    move-result p0

    :goto_0
    return p0
.end method
