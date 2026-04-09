.class public abstract LWa/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LLi/g;LIi/N;LLi/J;I)LLi/g;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "started"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWa/c$a;

    invoke-direct {v0, p0}, LWa/c$a;-><init>(LLi/g;)V

    new-instance p0, LWa/c$c;

    const/4 v1, 0x0

    invoke-direct {p0, v1}, LWa/c$c;-><init>(Ldh/e;)V

    invoke-static {v0, p0}, LLi/i;->f(LLi/g;Lmh/q;)LLi/g;

    move-result-object p0

    invoke-static {p0, p1, p2, p3}, LLi/i;->K(LLi/g;LIi/N;LLi/J;I)LLi/D;

    move-result-object p0

    new-instance p1, LWa/c$b;

    invoke-direct {p1, p0}, LWa/c$b;-><init>(LLi/g;)V

    return-object p1
.end method

.method public static synthetic b(LLi/g;LIi/N;LLi/J;IILjava/lang/Object;)LLi/g;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, LWa/c;->a(LLi/g;LIi/N;LLi/J;I)LLi/g;

    move-result-object p0

    return-object p0
.end method
