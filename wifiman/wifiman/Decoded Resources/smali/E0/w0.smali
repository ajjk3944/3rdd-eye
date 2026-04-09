.class public abstract LE0/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LJ0/j;)Z
    .locals 1

    sget-object v0, LJ0/i;->a:LJ0/i;

    invoke-virtual {v0}, LJ0/i;->k()LJ0/v;

    move-result-object v0

    invoke-static {p0, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(LE0/v0;)V
    .locals 0

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    invoke-virtual {p0}, LE0/G;->I0()V

    return-void
.end method

.method public static final c(Landroidx/compose/ui/e$c;Z)Ll0/i;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {p0}, Ll0/i$a;->a()Ll0/i;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v0, 0x8

    if-nez p1, :cond_1

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result p1

    invoke-static {p0, p1}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object p0

    invoke-static {p0}, LC0/s;->b(LC0/r;)Ll0/i;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {v0}, LE0/e0;->a(I)I

    move-result p1

    invoke-static {p0, p1}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object p0

    invoke-virtual {p0}, LE0/c0;->t3()Ll0/i;

    move-result-object p0

    return-object p0
.end method
