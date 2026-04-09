.class public abstract LXi/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LXi/f;)Lth/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LXi/c;

    if-eqz v0, :cond_0

    check-cast p0, LXi/c;

    iget-object p0, p0, LXi/c;->b:Lth/d;

    goto :goto_0

    :cond_0
    instance-of v0, p0, LZi/Q0;

    if-eqz v0, :cond_1

    check-cast p0, LZi/Q0;

    invoke-virtual {p0}, LZi/Q0;->k()LXi/f;

    move-result-object p0

    invoke-static {p0}, LXi/b;->a(LXi/f;)Lth/d;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(Lcj/e;LXi/f;)LXi/f;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LXi/b;->a(LXi/f;)Lth/d;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcj/e;->c(Lcj/e;Lth/d;Ljava/util/List;ILjava/lang/Object;)LVi/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LVi/b;->a()LXi/f;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static final c(LXi/f;Lth/d;)LXi/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LXi/c;

    invoke-direct {v0, p0, p1}, LXi/c;-><init>(LXi/f;Lth/d;)V

    return-object v0
.end method
