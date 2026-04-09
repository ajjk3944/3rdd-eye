.class public abstract LE0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LE0/h;LT/u;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Cannot read CompositionLocal because the Modifier node is not currently attached."

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    invoke-virtual {p0}, LE0/G;->J()LT/x;

    move-result-object p0

    invoke-interface {p0, p1}, LT/x;->b(LT/u;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
