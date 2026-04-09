.class public abstract Lq2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/view/View;)Lq2/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq2/g$a;->a:Lq2/g$a;

    invoke-static {p0, v0}, Lzi/m;->n(Ljava/lang/Object;Lmh/l;)Lzi/j;

    move-result-object p0

    sget-object v0, Lq2/g$b;->a:Lq2/g$b;

    invoke-static {p0, v0}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p0

    invoke-static {p0}, Lzi/m;->G(Lzi/j;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq2/f;

    return-object p0
.end method

.method public static final b(Landroid/view/View;Lq2/f;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lq2/a;->a:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
