.class public abstract Lr/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lr/q;FF)Lr/s;
    .locals 0

    invoke-static {p0, p1, p2}, Lr/w0;->c(Lr/q;FF)Lr/s;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lr/y0;J)J
    .locals 8

    invoke-interface {p0}, Lr/y0;->e()I

    move-result v0

    int-to-long v0, v0

    sub-long v2, p1, v0

    invoke-interface {p0}, Lr/y0;->g()I

    move-result p0

    int-to-long v6, p0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, Lsh/m;->m(JJJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final c(Lr/q;FF)Lr/s;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lr/w0$a;

    invoke-direct {v0, p0, p1, p2}, Lr/w0$a;-><init>(Lr/q;FF)V

    return-object v0

    :cond_0
    new-instance p0, Lr/w0$b;

    invoke-direct {p0, p1, p2}, Lr/w0$b;-><init>(FF)V

    return-object p0
.end method

.method public static final d(Lr/v0;JLr/q;Lr/q;Lr/q;)Lr/q;
    .locals 8

    const-wide/32 v0, 0xf4240

    mul-long v3, p1, v0

    move-object v2, p0

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v2 .. v7}, Lr/v0;->c(JLr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object p0

    return-object p0
.end method
