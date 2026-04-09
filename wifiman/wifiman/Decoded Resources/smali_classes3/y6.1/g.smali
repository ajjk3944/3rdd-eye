.class public abstract Ly6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(FF)Lsh/e;
    .locals 1

    cmpl-float v0, p1, p0

    if-lez v0, :cond_0

    invoke-static {p0, p1}, Lsh/m;->b(FF)Lsh/e;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p1, p0}, Lsh/m;->b(FF)Lsh/e;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final b(F)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x2212

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    neg-float p0, p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method
