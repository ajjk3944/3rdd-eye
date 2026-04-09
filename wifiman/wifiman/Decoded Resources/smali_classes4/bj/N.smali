.class public abstract Lbj/N;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LXi/f;Lcj/e;)LXi/f;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LXi/f;->h()LXi/m;

    move-result-object v0

    sget-object v1, LXi/m$a;->a:LXi/m$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p0}, LXi/b;->b(Lcj/e;LXi/f;)LXi/f;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, p1}, Lbj/N;->a(LXi/f;Lcj/e;)LXi/f;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, LXi/f;->isInline()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-interface {p0, v0}, LXi/f;->i(I)LXi/f;

    move-result-object p0

    invoke-static {p0, p1}, Lbj/N;->a(LXi/f;Lcj/e;)LXi/f;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static final b(Laj/b;LXi/f;)Lbj/M;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LXi/f;->h()LXi/m;

    move-result-object v0

    instance-of v1, v0, LXi/d;

    if-eqz v1, :cond_0

    sget-object p0, Lbj/M;->POLY_OBJ:Lbj/M;

    goto :goto_1

    :cond_0
    sget-object v1, LXi/n$b;->a:LXi/n$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p0, Lbj/M;->LIST:Lbj/M;

    goto :goto_1

    :cond_1
    sget-object v1, LXi/n$c;->a:LXi/n$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LXi/f;->i(I)LXi/f;

    move-result-object p1

    invoke-virtual {p0}, Laj/b;->a()Lcj/e;

    move-result-object v0

    invoke-static {p1, v0}, Lbj/N;->a(LXi/f;Lcj/e;)LXi/f;

    move-result-object p1

    invoke-interface {p1}, LXi/f;->h()LXi/m;

    move-result-object v0

    instance-of v1, v0, LXi/e;

    if-nez v1, :cond_4

    sget-object v1, LXi/m$b;->a:LXi/m$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Laj/b;->e()Laj/g;

    move-result-object p0

    invoke-virtual {p0}, Laj/g;->c()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lbj/M;->LIST:Lbj/M;

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lbj/r;->c(LXi/f;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    move-result-object p0

    throw p0

    :cond_4
    :goto_0
    sget-object p0, Lbj/M;->MAP:Lbj/M;

    goto :goto_1

    :cond_5
    sget-object p0, Lbj/M;->OBJ:Lbj/M;

    :goto_1
    return-object p0
.end method
