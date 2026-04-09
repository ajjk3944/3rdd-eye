.class public abstract LE0/M;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LE0/G;)Z
    .locals 1

    invoke-virtual {p0}, LE0/G;->a0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/G;->a0()LE0/G;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, LE0/G;->U()LE0/L;

    move-result-object p0

    invoke-virtual {p0}, LE0/L;->w()Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    return p0
.end method
