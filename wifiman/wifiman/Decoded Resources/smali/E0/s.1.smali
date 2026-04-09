.class public abstract LE0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LE0/r;)V
    .locals 1

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object p0

    invoke-virtual {p0}, LE0/c0;->R2()V

    :cond_0
    return-void
.end method
