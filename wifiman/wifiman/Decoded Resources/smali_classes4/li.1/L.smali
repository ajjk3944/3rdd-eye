.class public abstract Lli/L;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LWh/c;I)LZh/b;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LZh/b;->d:LZh/b$a;

    invoke-interface {p0, p1}, LWh/c;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, p1}, LWh/c;->b(I)Z

    move-result p0

    invoke-virtual {v0, v1, p0}, LZh/b$a;->a(Ljava/lang/String;Z)LZh/b;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LWh/c;I)LZh/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LZh/f;->g(Ljava/lang/String;)LZh/f;

    move-result-object p0

    const-string p1, "guessByFirstCharacter(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
