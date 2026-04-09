.class public abstract LYb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final varargs a(LYb/b;[LYb/a;)Lgg/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYb/c$a;

    invoke-direct {v0, p0, p1}, LYb/c$a;-><init>(LYb/b;[LYb/a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "observeOn(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(LYb/b;)Lgg/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LYb/b;->c()Lgg/i;

    move-result-object p0

    sget-object v0, LYb/c$b;->a:LYb/c$b;

    invoke-virtual {p0, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p0

    invoke-virtual {p0}, Lgg/i;->W()Lgg/i;

    move-result-object p0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "observeOn(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(LYb/b;LYb/a;)Lgg/b;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LYb/b;->c()Lgg/i;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lgg/i;->O1(J)Lgg/i;

    move-result-object v0

    new-instance v1, LYb/c$d;

    invoke-direct {v1, p0}, LYb/c$d;-><init>(LYb/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, LYb/c$c;

    invoke-direct {v1, p1, p0}, LYb/c$c;-><init>(LYb/a;LYb/b;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "observeOn(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
