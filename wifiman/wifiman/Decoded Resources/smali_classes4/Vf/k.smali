.class public abstract LVf/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LC0/r;)Ll0/i;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p0}, LC0/s;->f(LC0/r;)J

    move-result-wide v0

    new-instance v2, Ll0/i;

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v3

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v4

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v5

    invoke-interface {p0}, LC0/r;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, LY0/r;->g(J)I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v5, v6

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v0

    invoke-interface {p0}, LC0/r;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, LY0/r;->f(J)I

    move-result p0

    int-to-float p0, p0

    add-float/2addr v0, p0

    invoke-direct {v2, v3, v4, v5, v0}, Ll0/i;-><init>(FFFF)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {p0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v2

    :goto_0
    return-object v2
.end method
