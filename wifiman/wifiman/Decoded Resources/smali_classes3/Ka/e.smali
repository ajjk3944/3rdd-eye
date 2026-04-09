.class public abstract LKa/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/a;)LLi/g;
    .locals 2

    const-string/jumbo v0, "stFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKa/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LKa/e$a;-><init>(Lmh/a;Ldh/e;)V

    invoke-static {v0}, LLi/i;->e(Lmh/p;)LLi/g;

    move-result-object p0

    new-instance v0, LKa/e$b;

    invoke-direct {v0, v1}, LKa/e$b;-><init>(Ldh/e;)V

    invoke-static {p0, v0}, LLi/i;->J(LLi/g;Lmh/p;)LLi/g;

    move-result-object p0

    new-instance v0, LKa/e$c;

    invoke-direct {v0, v1}, LKa/e$c;-><init>(Ldh/e;)V

    invoke-static {p0, v0}, LLi/i;->H(LLi/g;Lmh/q;)LLi/g;

    move-result-object p0

    new-instance v0, LKa/e$d;

    invoke-direct {v0, v1}, LKa/e$d;-><init>(Ldh/e;)V

    invoke-static {p0, v0}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object p0

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v0

    invoke-static {p0, v0}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object p0

    return-object p0
.end method
