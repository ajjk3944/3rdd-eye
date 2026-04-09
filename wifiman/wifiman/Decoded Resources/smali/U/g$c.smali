.class public abstract LU/g$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public static a(LU/g;)LU/g;
    .locals 0

    return-object p0
.end method

.method public static final b(LU/g;)LU/d;
    .locals 0

    invoke-static {p0}, LU/g;->h(LU/g;)LU/d;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LU/g;II)V
    .locals 3

    const/4 v0, 0x1

    shl-int v1, v0, p1

    invoke-static {p0}, LU/g;->f(LU/g;)I

    move-result v2

    and-int/2addr v2, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already pushed argument "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LU/g$c;->b(LU/g;)LU/d;

    move-result-object v2

    invoke-virtual {v2, p1}, LU/d;->e(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LT/B0;->b(Ljava/lang/String;)V

    :cond_1
    invoke-static {p0}, LU/g;->f(LU/g;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {p0, v0}, LU/g;->i(LU/g;I)V

    invoke-static {p0}, LU/g;->b(LU/g;)[I

    move-result-object v0

    invoke-static {p0, p1}, LU/g;->k(LU/g;I)I

    move-result p0

    aput p2, v0, p0

    return-void
.end method

.method public static final d(LU/g;ILjava/lang/Object;)V
    .locals 3

    const/4 v0, 0x1

    shl-int v1, v0, p1

    invoke-static {p0}, LU/g;->g(LU/g;)I

    move-result v2

    and-int/2addr v2, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already pushed argument "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LU/g$c;->b(LU/g;)LU/d;

    move-result-object v2

    invoke-virtual {v2, p1}, LU/d;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LT/B0;->b(Ljava/lang/String;)V

    :cond_1
    invoke-static {p0}, LU/g;->g(LU/g;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {p0, v0}, LU/g;->j(LU/g;I)V

    invoke-static {p0}, LU/g;->c(LU/g;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, p1}, LU/g;->l(LU/g;I)I

    move-result p0

    aput-object p2, v0, p0

    return-void
.end method
