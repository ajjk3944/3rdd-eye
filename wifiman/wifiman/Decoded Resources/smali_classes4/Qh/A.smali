.class public abstract LQh/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LQh/x;)Z
    .locals 2

    instance-of v0, p0, LQh/C;

    if-eqz v0, :cond_0

    check-cast p0, LQh/C;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-interface {p0}, LQh/C;->B()LQh/x;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, LQh/C;->J()Z

    move-result p0

    if-nez p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method
