.class public abstract Lze/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/kodein/di/DI;Lq2/f;Landroid/os/Bundle;Ljava/lang/String;)Landroidx/lifecycle/a;
    .locals 1

    const-string v0, "di"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lze/a$a;

    invoke-direct {v0, p1, p2, p0, p3}, Lze/a$a;-><init>(Lq2/f;Landroid/os/Bundle;Lorg/kodein/di/DI;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b(Lorg/kodein/di/DI;Lq2/f;Landroid/os/Bundle;Ljava/lang/String;LT/l;II)Landroidx/lifecycle/a;
    .locals 3

    const v0, -0x17846a85

    invoke-interface {p4, v0}, LT/l;->U(I)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    invoke-static {}, Lze/c;->c()LT/H0;

    move-result-object p0

    invoke-interface {p4, p0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/kodein/di/DI;

    :cond_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->j()LT/H0;

    move-result-object p1

    invoke-interface {p4, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq2/f;

    :cond_1
    and-int/lit8 v1, p6, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object p2, v2

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    move-object p3, v2

    :cond_3
    invoke-static {}, LT/o;->H()Z

    move-result p6

    if-eqz p6, :cond_4

    const/4 p6, -0x1

    const-string v1, "com.ui.wifiman.ui.arch.kodein.rememberCustomKodeinVmFactory (KodeinViewModelFactory.kt:44)"

    invoke-static {v0, p5, p6, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const p5, 0x7890c7b

    invoke-interface {p4, p5}, LT/l;->U(I)V

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    sget-object p6, LT/l;->a:LT/l$a;

    invoke-virtual {p6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p6

    if-ne p5, p6, :cond_5

    invoke-static {p0, p1, p2, p3}, Lze/a;->a(Lorg/kodein/di/DI;Lq2/f;Landroid/os/Bundle;Ljava/lang/String;)Landroidx/lifecycle/a;

    move-result-object p5

    invoke-interface {p4, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast p5, Landroidx/lifecycle/a;

    invoke-interface {p4}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface {p4}, LT/l;->J()V

    return-object p5
.end method

.method public static final c(Lf2/k;Lorg/kodein/di/DI;Ljava/lang/String;LT/l;II)Landroidx/lifecycle/a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5b545360

    invoke-interface {p3, v0}, LT/l;->U(I)V

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    invoke-static {}, Lze/c;->c()LT/H0;

    move-result-object p1

    invoke-interface {p3, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/kodein/di/DI;

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_2

    const/4 p5, -0x1

    const-string v1, "com.ui.wifiman.ui.arch.kodein.rememberKodeinVmFactory (KodeinViewModelFactory.kt:57)"

    invoke-static {v0, p4, p5, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const p4, 0x59c31d0b

    invoke-interface {p3, p4}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p4

    sget-object p5, LT/l;->a:LT/l$a;

    invoke-virtual {p5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p5

    if-ne p4, p5, :cond_3

    invoke-virtual {p0}, Lf2/k;->d()Landroid/os/Bundle;

    move-result-object p4

    invoke-static {p1, p0, p4, p2}, Lze/a;->a(Lorg/kodein/di/DI;Lq2/f;Landroid/os/Bundle;Ljava/lang/String;)Landroidx/lifecycle/a;

    move-result-object p4

    invoke-interface {p3, p4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast p4, Landroidx/lifecycle/a;

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p3}, LT/l;->J()V

    return-object p4
.end method
