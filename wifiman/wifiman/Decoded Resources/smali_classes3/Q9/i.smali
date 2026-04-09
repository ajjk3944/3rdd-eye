.class public abstract LQ9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf2/k;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf2/k;->k()Landroidx/lifecycle/E;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/E;->f(Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static final b(Lf2/n;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf2/n;->L()Lf2/k;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lf2/k;->k()Landroidx/lifecycle/E;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
