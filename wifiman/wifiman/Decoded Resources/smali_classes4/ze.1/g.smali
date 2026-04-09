.class public abstract Lze/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/lifecycle/N;Landroidx/lifecycle/E;)V
    .locals 1

    const-string v0, "instance"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lye/g;

    if-eqz v0, :cond_0

    check-cast p0, Lye/g;

    invoke-virtual {p0, p1}, Lye/g;->m0(Landroidx/lifecycle/E;)V

    invoke-virtual {p0}, Lye/g;->l0()V

    :cond_0
    return-void
.end method
