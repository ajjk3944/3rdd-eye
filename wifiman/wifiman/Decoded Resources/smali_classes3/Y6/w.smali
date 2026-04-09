.class public abstract LY6/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LY6/r;Lth/p;)LY6/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ktype"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lth/w;->f(Lth/p;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p0, v0}, LY6/r;->d(Ljava/lang/reflect/Type;)LY6/h;

    move-result-object p0

    instance-of v0, p0, La7/b;

    if-nez v0, :cond_2

    instance-of v0, p0, La7/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lth/p;->t()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LY6/h;->g()LY6/h;

    move-result-object p0

    const-string/jumbo p1, "{\n    adapter.nullSafe()\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LY6/h;->f()LY6/h;

    move-result-object p0

    const-string/jumbo p1, "{\n    adapter.nonNull()\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-object p0
.end method
