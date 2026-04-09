.class public abstract LJh/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LZh/c;Ljava/lang/String;)LZh/c;
    .locals 0

    invoke-static {p0, p1}, LJh/k;->c(LZh/c;Ljava/lang/String;)LZh/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LZh/d;Ljava/lang/String;)LZh/c;
    .locals 0

    invoke-static {p0, p1}, LJh/k;->d(LZh/d;Ljava/lang/String;)LZh/c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LZh/c;Ljava/lang/String;)LZh/c;
    .locals 0

    invoke-static {p1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p1

    invoke-virtual {p0, p1}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object p0

    const-string p1, "child(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final d(LZh/d;Ljava/lang/String;)LZh/c;
    .locals 0

    invoke-static {p1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p1

    invoke-virtual {p0, p1}, LZh/d;->c(LZh/f;)LZh/d;

    move-result-object p0

    invoke-virtual {p0}, LZh/d;->l()LZh/c;

    move-result-object p0

    const-string p1, "toSafe(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
