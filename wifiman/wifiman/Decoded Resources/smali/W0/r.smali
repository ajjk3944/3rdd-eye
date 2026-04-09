.class public abstract LW0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW0/q;LW0/q;F)LW0/q;
    .locals 7

    new-instance v6, LW0/q;

    invoke-virtual {p0}, LW0/q;->b()J

    move-result-wide v0

    invoke-virtual {p1}, LW0/q;->b()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3, p2}, LL0/E;->f(JJF)J

    move-result-wide v1

    invoke-virtual {p0}, LW0/q;->c()J

    move-result-wide v3

    invoke-virtual {p1}, LW0/q;->c()J

    move-result-wide p0

    invoke-static {v3, v4, p0, p1, p2}, LL0/E;->f(JJF)J

    move-result-wide v3

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LW0/q;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method
