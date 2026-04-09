.class public abstract Lg2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf2/k;Lc0/e;Lmh/p;LT/l;I)V
    .locals 5

    const v0, -0x5e232270

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object v0, Lc2/a;->a:Lc2/a;

    invoke-virtual {v0, p0}, Lc2/a;->b(Landroidx/lifecycle/S;)LT/I0;

    move-result-object v0

    invoke-static {}, LZ1/a;->a()LT/H0;

    move-result-object v1

    invoke-virtual {v1, p0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v1

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->j()LT/H0;

    move-result-object v2

    invoke-virtual {v2, p0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [LT/I0;

    move-result-object v0

    new-instance v1, Lg2/j$a;

    invoke-direct {v1, p1, p2}, Lg2/j$a;-><init>(Lc0/e;Lmh/p;)V

    const/16 v2, 0x36

    const v3, -0x3279f30

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, p3, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    sget v2, LT/I0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p3, v2}, LT/w;->b([LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_5
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_a

    new-instance v0, Lg2/j$b;

    invoke-direct {v0, p0, p1, p2, p4}, Lg2/j$b;-><init>(Lf2/k;Lc0/e;Lmh/p;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method private static final b(Lc0/e;Lmh/p;LT/l;I)V
    .locals 11

    const v0, 0x483b17a9

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    move v9, v1

    and-int/lit8 v1, v9, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_6

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)"

    invoke-static {v0, v9, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const v0, 0x671a9c9b

    invoke-interface {p2, v0}, LT/l;->e(I)V

    sget-object v0, Lc2/a;->a:Lc2/a;

    const/4 v10, 0x6

    invoke-virtual {v0, p2, v10}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v2

    if-eqz v2, :cond_a

    instance-of v0, v2, Landroidx/lifecycle/i;

    if-eqz v0, :cond_7

    move-object v0, v2

    check-cast v0, Landroidx/lifecycle/i;

    invoke-interface {v0}, Landroidx/lifecycle/i;->h()Lb2/a;

    move-result-object v0

    :goto_4
    move-object v5, v0

    goto :goto_5

    :cond_7
    sget-object v0, Lb2/a$a;->b:Lb2/a$a;

    goto :goto_4

    :goto_5
    const-class v0, Lg2/a;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lc2/c;->c(Lth/d;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v0

    invoke-interface {p2}, LT/l;->P()V

    check-cast v0, Lg2/a;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lg2/a;->Z(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0}, Lg2/a;->X()Ljava/util/UUID;

    move-result-object v0

    and-int/lit8 v1, v9, 0x70

    shl-int/lit8 v2, v9, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    invoke-interface {p0, v0, p1, p2, v1}, Lc0/e;->d(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_6
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Lg2/j$c;

    invoke-direct {v0, p0, p1, p3}, Lg2/j$c;-><init>(Lc0/e;Lmh/p;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_9
    return-void

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic c(Lc0/e;Lmh/p;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lg2/j;->b(Lc0/e;Lmh/p;LT/l;I)V

    return-void
.end method
