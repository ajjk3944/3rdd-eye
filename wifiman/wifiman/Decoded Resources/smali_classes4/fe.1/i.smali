.class public abstract Lfe/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lgg/i;Lgg/b;)Lgg/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lgg/i;->h1()Ljg/a;

    move-result-object p0

    invoke-virtual {p0}, Ljg/a;->i2()Lgg/i;

    move-result-object p0

    invoke-virtual {p0}, Lgg/i;->E0()Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->X(Lgg/f;)Lgg/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p0

    const-string p1, "let(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(Lgg/b;)Lgg/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lgg/b;->f0()Lgg/s;

    move-result-object p0

    invoke-virtual {p0}, Lgg/s;->D0()Lgg/s;

    move-result-object p0

    invoke-virtual {p0}, Lgg/s;->f0()Lgg/b;

    move-result-object p0

    const-string v0, "ignoreElements(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
