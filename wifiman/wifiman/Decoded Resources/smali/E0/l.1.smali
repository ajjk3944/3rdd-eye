.class public abstract LE0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LE0/j;)Landroid/view/View;
    .locals 1

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Cannot get View because the Modifier node is not currently attached."

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    invoke-static {p0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.view.View"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/view/View;

    return-object p0
.end method
