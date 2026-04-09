.class public abstract Landroidx/lifecycle/U;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/view/View;)Landroidx/lifecycle/S;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/U$a;->a:Landroidx/lifecycle/U$a;

    invoke-static {p0, v0}, Lzi/m;->n(Ljava/lang/Object;Lmh/l;)Lzi/j;

    move-result-object p0

    sget-object v0, Landroidx/lifecycle/U$b;->a:Landroidx/lifecycle/U$b;

    invoke-static {p0, v0}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p0

    invoke-static {p0}, Lzi/m;->G(Lzi/j;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/S;

    return-object p0
.end method

.method public static final b(Landroid/view/View;Landroidx/lifecycle/S;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lb2/c;->a:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
