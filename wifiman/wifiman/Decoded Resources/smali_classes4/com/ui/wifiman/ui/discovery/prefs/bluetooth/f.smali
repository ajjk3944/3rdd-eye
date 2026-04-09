.class public abstract Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f;->c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;LT/l;II)V
    .locals 11

    const v0, 0x4579187c

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, p4, 0x2

    if-nez v3, :cond_3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_4
    move v9, v2

    and-int/lit8 v2, v9, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_6

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_7

    :cond_6
    :goto_3
    invoke-interface {p2}, LT/l;->q()V

    and-int/lit8 v2, p3, 0x1

    if-eqz v2, :cond_8

    invoke-interface {p2}, LT/l;->H()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {p2}, LT/l;->C()V

    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_d

    :goto_4
    and-int/lit8 v9, v9, -0x71

    goto/16 :goto_6

    :cond_8
    :goto_5
    if-eqz v1, :cond_9

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_9
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_d

    const p1, -0x72e5f4af

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Lc2/a;->a:Lc2/a;

    sget v1, Lc2/a;->c:I

    invoke-virtual {p1, p2, v1}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Landroidx/lifecycle/P$c;

    const/4 v7, 0x0

    const/16 v8, 0x10

    const-class v1, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object p1

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v1

    invoke-interface {p2, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v3

    invoke-interface {p2, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    const v4, 0x318a4a49

    invoke-interface {p2, v4}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_a

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_b

    :cond_a
    new-instance v5, Lye/i;

    invoke-direct {v5, p1, v1, v2}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v1, 0x0

    invoke-static {v3, v5, p2, v1}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    check-cast p1, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;

    goto/16 :goto_4

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    :goto_6
    invoke-interface {p2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.discovery.prefs.bluetooth.DiscoveryHomeDisplayPrefsBluetoothUi (DiscoveryHomeDisplayPrefsBluetoothUi.kt:30)"

    invoke-static {v0, v9, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_e
    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p2, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->e()Lma/a$e;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$e;->a()J

    move-result-wide v2

    sget-object v0, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/b;->a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/b;

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/b;->a()Lmh/q;

    move-result-object v4

    new-instance v0, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a;

    invoke-direct {v0, p0, p1}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;)V

    const/16 v1, 0x36

    const v5, -0x3d9bc0c7

    const/4 v6, 0x1

    invoke-static {v5, v6, v0, p2, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    and-int/lit8 v0, v9, 0xe

    const v1, 0x30180

    or-int v9, v0, v1

    const/16 v10, 0x18

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v8, p2

    invoke-static/range {v1 .. v10}, LFe/g;->b(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_7
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_10

    new-instance v0, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/e;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/e;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;II)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
