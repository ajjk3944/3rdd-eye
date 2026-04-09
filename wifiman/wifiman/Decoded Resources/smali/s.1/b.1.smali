.class public abstract Ls/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LT/l;I)Ls/S;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)"

    const v2, -0x57ff4a94

    invoke-static {v2, p1, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object p1

    invoke-interface {p0, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {}, Ls/Q;->a()LT/H0;

    move-result-object v0

    invoke-interface {p0, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls/P;

    if-eqz v0, :cond_3

    const v1, 0x5e88c4e9

    invoke-interface {p0, v1}, LT/l;->U(I)V

    invoke-interface {p0, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p0, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Ls/a;

    invoke-direct {v2, p1, v0}, Ls/a;-><init>(Landroid/content/Context;Ls/P;)V

    invoke-interface {p0, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Ls/a;

    invoke-interface {p0}, LT/l;->J()V

    goto :goto_0

    :cond_3
    const p1, 0x5e8a48e5

    invoke-interface {p0, p1}, LT/l;->U(I)V

    invoke-interface {p0}, LT/l;->J()V

    sget-object v2, Ls/O;->a:Ls/O;

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-object v2
.end method
