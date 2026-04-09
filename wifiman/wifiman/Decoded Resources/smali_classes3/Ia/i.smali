.class public abstract LIa/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lspeedtest/DirectoryServerApi;LIa/d;)LLi/g;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LIa/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LIa/i$a;-><init>(Lspeedtest/DirectoryServerApi;LIa/d;Ldh/e;)V

    invoke-static {v0}, LLi/i;->e(Lmh/p;)LLi/g;

    move-result-object p0

    new-instance v0, LIa/i$b;

    invoke-direct {v0, p1, v1}, LIa/i$b;-><init>(LIa/d;Ldh/e;)V

    invoke-static {p0, v0}, LLi/i;->J(LLi/g;Lmh/p;)LLi/g;

    move-result-object p0

    new-instance v0, LIa/i$c;

    invoke-direct {v0, p1, v1}, LIa/i$c;-><init>(LIa/d;Ldh/e;)V

    invoke-static {p0, v0}, LLi/i;->H(LLi/g;Lmh/q;)LLi/g;

    move-result-object p0

    new-instance p1, LIa/i$d;

    invoke-direct {p1, v1}, LIa/i$d;-><init>(Ldh/e;)V

    invoke-static {p0, p1}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object p0

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object p1

    invoke-static {p0, p1}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object p0

    return-object p0
.end method
