.class public abstract Lg2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Landroid/content/Context;)Lc0/k;
    .locals 2

    sget-object v0, Lg2/l$a;->a:Lg2/l$a;

    new-instance v1, Lg2/l$b;

    invoke-direct {v1, p0}, Lg2/l$b;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lc0/l;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Landroid/content/Context;)Lf2/w;
    .locals 0

    invoke-static {p0}, Lg2/l;->c(Landroid/content/Context;)Lf2/w;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroid/content/Context;)Lf2/w;
    .locals 3

    new-instance v0, Lf2/w;

    invoke-direct {v0, p0}, Lf2/w;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lf2/n;->K()Lf2/E;

    move-result-object p0

    new-instance v1, Lg2/d;

    invoke-virtual {v0}, Lf2/n;->K()Lf2/E;

    move-result-object v2

    invoke-direct {v1, v2}, Lg2/d;-><init>(Lf2/E;)V

    invoke-virtual {p0, v1}, Lf2/E;->b(Lf2/D;)Lf2/D;

    invoke-virtual {v0}, Lf2/n;->K()Lf2/E;

    move-result-object p0

    new-instance v1, Lg2/e;

    invoke-direct {v1}, Lg2/e;-><init>()V

    invoke-virtual {p0, v1}, Lf2/E;->b(Lf2/D;)Lf2/D;

    invoke-virtual {v0}, Lf2/n;->K()Lf2/E;

    move-result-object p0

    new-instance v1, Lg2/i;

    invoke-direct {v1}, Lg2/i;-><init>()V

    invoke-virtual {p0, v1}, Lf2/E;->b(Lf2/D;)Lf2/D;

    return-object v0
.end method

.method public static final d([Lf2/D;LT/l;I)Lf2/w;
    .locals 8

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)"

    const v2, -0x129c080e

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2}, Lg2/l;->a(Landroid/content/Context;)Lc0/k;

    move-result-object v2

    invoke-interface {p1, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_2

    :cond_1
    new-instance v3, Lg2/l$c;

    invoke-direct {v3, p2}, Lg2/l$c;-><init>(Landroid/content/Context;)V

    invoke-interface {p1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v4, v3

    check-cast v4, Lmh/a;

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v3, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lc0/c;->e([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/w;

    array-length p2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_3

    aget-object v1, p0, v0

    invoke-virtual {p1}, Lf2/n;->K()Lf2/E;

    move-result-object v2

    invoke-virtual {v2, v1}, Lf2/E;->b(Lf2/D;)Lf2/D;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-object p1
.end method
