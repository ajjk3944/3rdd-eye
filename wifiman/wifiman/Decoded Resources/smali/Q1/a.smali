.class public abstract LQ1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;LP1/b;Lmh/l;LIi/N;)Lph/c;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceMigrations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LQ1/c;

    invoke-direct {v0, p0, p1, p2, p3}, LQ1/c;-><init>(Ljava/lang/String;LP1/b;Lmh/l;LIi/N;)V

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;LP1/b;Lmh/l;LIi/N;ILjava/lang/Object;)Lph/c;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_1

    sget-object p2, LQ1/a$a;->a:LQ1/a$a;

    :cond_1
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object p3

    const/4 p4, 0x1

    invoke-static {v0, p4, v0}, LIi/S0;->b(LIi/y0;ILjava/lang/Object;)LIi/A;

    move-result-object p4

    invoke-virtual {p3, p4}, Ldh/a;->plus(Ldh/i;)Ldh/i;

    move-result-object p3

    invoke-static {p3}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object p3

    :cond_2
    invoke-static {p0, p1, p2, p3}, LQ1/a;->a(Ljava/lang/String;LP1/b;Lmh/l;LIi/N;)Lph/c;

    move-result-object p0

    return-object p0
.end method
