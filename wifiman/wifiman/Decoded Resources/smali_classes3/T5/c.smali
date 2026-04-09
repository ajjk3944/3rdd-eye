.class public abstract LT5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(J)F
    .locals 5

    invoke-static {p0, p1}, LY0/v;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/x;->b:LY0/x$a;

    invoke-virtual {v2}, LY0/x$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/x;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p0, p1}, LY0/v;->h(J)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, LY0/x$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/x;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, LY0/v;->h(J)F

    move-result p0

    goto :goto_0

    :cond_1
    const/high16 p0, 0x41400000    # 12.0f

    :goto_0
    return p0
.end method
