.class public abstract LQ5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/graphics/Path;FFFFLl0/k;[F)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "rect"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "radii"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p5}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    const/4 v1, 0x0

    aput v0, p6, v1

    invoke-virtual {p5}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->e(J)F

    move-result v0

    const/4 v1, 0x1

    aput v0, p6, v1

    invoke-virtual {p5}, Ll0/k;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    const/4 v1, 0x2

    aput v0, p6, v1

    invoke-virtual {p5}, Ll0/k;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->e(J)F

    move-result v0

    const/4 v1, 0x3

    aput v0, p6, v1

    invoke-virtual {p5}, Ll0/k;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    const/4 v1, 0x4

    aput v0, p6, v1

    invoke-virtual {p5}, Ll0/k;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->e(J)F

    move-result v0

    const/4 v1, 0x5

    aput v0, p6, v1

    invoke-virtual {p5}, Ll0/k;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    const/4 v1, 0x6

    aput v0, p6, v1

    invoke-virtual {p5}, Ll0/k;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->e(J)F

    move-result p5

    const/4 v0, 0x7

    aput p5, p6, v0

    sget-object v7, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p6

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->addRoundRect(FFFF[FLandroid/graphics/Path$Direction;)V

    return-void
.end method

.method public static final b(Lm0/i1;)Lo6/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LQ5/a$a;

    invoke-direct {v0, p0}, LQ5/a$a;-><init>(Lm0/i1;)V

    return-object v0
.end method

.method public static final c(Lo6/e;Lo6/c;FFLo6/a$a;)Lo6/a;
    .locals 1

    const-string v0, "$this$dashedShape"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p0, "shape"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p0, "fitStrategy"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lo6/a;

    invoke-direct {p0, p1, p2, p3, p4}, Lo6/a;-><init>(Lo6/c;FFLo6/a$a;)V

    return-object p0
.end method

.method public static synthetic d(Lo6/e;Lo6/c;FFLo6/a$a;ILjava/lang/Object;)Lo6/a;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget-object p4, Lo6/a$a;->Resize:Lo6/a$a;

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LQ5/a;->c(Lo6/e;Lo6/c;FFLo6/a$a;)Lo6/a;

    move-result-object p0

    return-object p0
.end method
