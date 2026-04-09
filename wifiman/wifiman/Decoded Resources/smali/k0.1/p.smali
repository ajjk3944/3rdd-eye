.class public abstract Lk0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Landroidx/compose/ui/focus/FocusTargetNode;)Lk0/q;
    .locals 0

    invoke-static {p0}, Lk0/p;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Lk0/q;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroidx/compose/ui/focus/FocusTargetNode;)Lk0/q;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->h1()Landroidx/compose/ui/e$c;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->c2()LE0/c0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LE0/G;->n0()LE0/m0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LE0/m0;->getFocusOwner()Lk0/g;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lk0/g;->g()Lk0/q;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->getFocusOwner()Lk0/g;

    move-result-object v0

    invoke-interface {v0, p0}, Lk0/g;->a(Landroidx/compose/ui/focus/FocusTargetNode;)V

    return-void
.end method

.method public static final d(Landroidx/compose/ui/focus/FocusTargetNode;)Lk0/q;
    .locals 0

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object p0

    invoke-interface {p0}, LE0/m0;->getFocusOwner()Lk0/g;

    move-result-object p0

    invoke-interface {p0}, Lk0/g;->g()Lk0/q;

    move-result-object p0

    return-object p0
.end method
