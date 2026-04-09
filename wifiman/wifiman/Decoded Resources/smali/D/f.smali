.class abstract synthetic LD/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LE0/j;Ll0/i;Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_0
    invoke-static {p0}, LE0/k;->k(LE0/j;)LC0/r;

    move-result-object v0

    invoke-static {p0}, Landroidx/compose/foundation/relocation/b;->c(LE0/j;)LD/a;

    move-result-object p0

    if-nez p0, :cond_1

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_1
    new-instance v1, LD/f$a;

    invoke-direct {v1, p1, v0}, LD/f$a;-><init>(Ll0/i;LC0/r;)V

    invoke-interface {p0, v0, v1, p2}, LD/a;->r1(LC0/r;Lmh/a;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic b(LE0/j;Ll0/i;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LD/e;->a(LE0/j;Ll0/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
