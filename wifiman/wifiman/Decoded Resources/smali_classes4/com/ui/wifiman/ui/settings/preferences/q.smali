.class public abstract Lcom/ui/wifiman/ui/settings/preferences/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lcom/ui/wifiman/ui/settings/preferences/o;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/settings/preferences/q;->c(Lcom/ui/wifiman/ui/settings/preferences/o;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/ui/wifiman/ui/settings/preferences/o;LT/l;II)V
    .locals 11

    const v0, -0x26c3b1ee

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    and-int/lit8 v1, p3, 0x1

    if-nez v1, :cond_0

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    move v9, v1

    goto :goto_1

    :cond_1
    move v9, p2

    :goto_1
    and-int/lit8 v1, v9, 0x3

    if-ne v1, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-interface {p1}, LT/l;->q()V

    and-int/lit8 v1, p2, 0x1

    if-eqz v1, :cond_5

    invoke-interface {p1}, LT/l;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-interface {p1}, LT/l;->C()V

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_9

    :goto_3
    and-int/lit8 v9, v9, -0xf

    goto/16 :goto_5

    :cond_5
    :goto_4
    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_9

    const p0, -0x72e5f4af

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lc2/a;->a:Lc2/a;

    sget v1, Lc2/a;->c:I

    invoke-virtual {p0, p1, v1}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object p0

    invoke-interface {p1, p0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Landroidx/lifecycle/P$c;

    const/4 v7, 0x0

    const/16 v8, 0x10

    const-class v1, Lcom/ui/wifiman/ui/settings/preferences/o;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v6, p1

    invoke-static/range {v1 .. v8}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object p0

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v1

    invoke-interface {p1, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v2

    invoke-interface {p1, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v3

    invoke-interface {p1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    const v4, 0x318a4a49

    invoke-interface {p1, v4}, LT/l;->U(I)V

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p1, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p1, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_6

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_7

    :cond_6
    new-instance v5, Lye/i;

    invoke-direct {v5, p0, v1, v2}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {p1, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    const/4 v1, 0x0

    invoke-static {v3, v5, p1, v1}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    check-cast p0, Lcom/ui/wifiman/ui/settings/preferences/o;

    goto/16 :goto_3

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    :goto_5
    invoke-interface {p1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_a

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationAddUi (TeleportQuickActionExplanationAddUi.kt:34)"

    invoke-static {v0, v9, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxe/f$b;

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, p1, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->e()Lma/a$e;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$e;->b()J

    move-result-wide v2

    new-instance v1, Lcom/ui/wifiman/ui/settings/preferences/q$a;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/ui/settings/preferences/q$a;-><init>(Lxe/f$b;)V

    const v4, 0x33728c8c

    const/4 v5, 0x1

    const/16 v6, 0x36

    invoke-static {v4, v5, v1, p1, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    new-instance v1, Lcom/ui/wifiman/ui/settings/preferences/q$b;

    invoke-direct {v1, p0, v0}, Lcom/ui/wifiman/ui/settings/preferences/q$b;-><init>(Lcom/ui/wifiman/ui/settings/preferences/o;Lxe/f$b;)V

    const v0, -0x6ac17131

    invoke-static {v0, v5, v1, p1, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v9, 0x30180

    const/16 v10, 0x19

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, p1

    invoke-static/range {v1 .. v10}, LFe/g;->b(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_6
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v0, Lcom/ui/wifiman/ui/settings/preferences/p;

    invoke-direct {v0, p0, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/p;-><init>(Lcom/ui/wifiman/ui/settings/preferences/o;II)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final c(Lcom/ui/wifiman/ui/settings/preferences/o;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lcom/ui/wifiman/ui/settings/preferences/q;->b(Lcom/ui/wifiman/ui/settings/preferences/o;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
