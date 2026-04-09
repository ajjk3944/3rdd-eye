.class public abstract Ls0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/List;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:J

.field private static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    sput-object v0, Ls0/n;->a:Ljava/util/List;

    sget-object v0, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v0}, Lm0/k1$a;->a()I

    move-result v0

    sput v0, Ls0/n;->b:I

    sget-object v0, Lm0/l1;->a:Lm0/l1$a;

    invoke-virtual {v0}, Lm0/l1$a;->b()I

    move-result v0

    sput v0, Ls0/n;->c:I

    sget-object v0, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {v0}, Lm0/d0$a;->z()I

    move-result v0

    sput v0, Ls0/n;->d:I

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->d()J

    move-result-wide v0

    sput-wide v0, Ls0/n;->e:J

    sget-object v0, Lm0/W0;->a:Lm0/W0$a;

    invoke-virtual {v0}, Lm0/W0$a;->b()I

    move-result v0

    sput v0, Ls0/n;->f:I

    return-void
.end method

.method public static final a()I
    .locals 1

    sget v0, Ls0/n;->f:I

    return v0
.end method

.method public static final b()I
    .locals 1

    sget v0, Ls0/n;->b:I

    return v0
.end method

.method public static final c()I
    .locals 1

    sget v0, Ls0/n;->c:I

    return v0
.end method

.method public static final d()Ljava/util/List;
    .locals 1

    sget-object v0, Ls0/n;->a:Ljava/util/List;

    return-object v0
.end method

.method public static final e(JJ)Z
    .locals 2

    invoke-static {p0, p1}, Lm0/v0;->r(J)F

    move-result v0

    invoke-static {p2, p3}, Lm0/v0;->r(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Lm0/v0;->q(J)F

    move-result v0

    invoke-static {p2, p3}, Lm0/v0;->q(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Lm0/v0;->o(J)F

    move-result p0

    invoke-static {p2, p3}, Lm0/v0;->o(J)F

    move-result p1

    cmpg-float p0, p0, p1

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final f(Lm0/w0;)Z
    .locals 5

    instance-of v0, p0, Lm0/e0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Lm0/e0;

    invoke-virtual {p0}, Lm0/e0;->b()I

    move-result v0

    sget-object v3, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {v3}, Lm0/d0$a;->z()I

    move-result v4

    invoke-static {v0, v4}, Lm0/d0;->E(II)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lm0/e0;->b()I

    move-result p0

    invoke-virtual {v3}, Lm0/d0$a;->B()I

    move-result v0

    invoke-static {p0, v0}, Lm0/d0;->E(II)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    if-nez p0, :cond_0

    :cond_2
    :goto_0
    return v1
.end method
