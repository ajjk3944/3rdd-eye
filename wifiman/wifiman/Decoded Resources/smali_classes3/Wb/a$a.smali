.class public abstract LWb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LWb/a;J)V
    .locals 0

    invoke-interface {p0, p1, p2}, LWb/a;->j(J)I

    invoke-interface {p0, p1, p2}, LWb/a;->h(J)I

    return-void
.end method

.method public static b(LWb/a;LWb/d;Ljava/lang/String;)J
    .locals 3

    const-string/jumbo v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "gpx"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LWb/a;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-interface {p0, v1, v2}, LWb/a;->a(J)V

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, LWb/a;->c(LWb/d;)J

    move-result-wide v0

    new-instance p1, LWb/c;

    invoke-direct {p1, v0, v1, p2}, LWb/c;-><init>(JLjava/lang/String;)V

    invoke-interface {p0, p1}, LWb/a;->g(LWb/c;)J

    move-result-wide p0

    return-wide p0
.end method
