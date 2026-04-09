.class abstract synthetic Landroidx/compose/foundation/relocation/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LC0/r;LC0/r;Ll0/i;)Ll0/i;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/relocation/d;->c(LC0/r;LC0/r;Ll0/i;)Ll0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LE0/j;)LD/a;
    .locals 1

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object v0, Landroidx/compose/foundation/relocation/f;->q:Landroidx/compose/foundation/relocation/f$a;

    invoke-static {p0, v0}, LE0/B0;->a(LE0/j;Ljava/lang/Object;)LE0/A0;

    move-result-object v0

    check-cast v0, LD/a;

    if-nez v0, :cond_1

    invoke-static {p0}, LD/d;->b(LE0/j;)LD/a;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private static final c(LC0/r;LC0/r;Ll0/i;)Ll0/i;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, LC0/r;->J(LC0/r;Z)Ll0/i;

    move-result-object p0

    invoke-virtual {p0}, Ll0/i;->p()J

    move-result-wide p0

    invoke-virtual {p2, p0, p1}, Ll0/i;->x(J)Ll0/i;

    move-result-object p0

    return-object p0
.end method
