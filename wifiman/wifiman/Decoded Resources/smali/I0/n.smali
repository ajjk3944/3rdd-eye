.class public abstract LI0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(LJ0/n;)Z
    .locals 2

    invoke-static {p0}, LI0/n;->c(LJ0/n;)Lmh/p;

    move-result-object v0

    invoke-virtual {p0}, LJ0/n;->w()LJ0/j;

    move-result-object p0

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->I()LJ0/v;

    move-result-object v1

    invoke-static {p0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ0/h;

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LJ0/h;->a()Lmh/a;

    move-result-object p0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final b(LJ0/n;)Ljava/util/List;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0}, LJ0/n;->l(ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LJ0/n;)Lmh/p;
    .locals 1

    invoke-virtual {p0}, LJ0/n;->w()LJ0/j;

    move-result-object p0

    sget-object v0, LJ0/i;->a:LJ0/i;

    invoke-virtual {v0}, LJ0/i;->u()LJ0/v;

    move-result-object v0

    invoke-static {p0, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmh/p;

    return-object p0
.end method

.method private static final d(LJ0/n;ILmh/l;)V
    .locals 5

    new-instance v0, LV/b;

    const/16 v1, 0x10

    new-array v1, v1, [LJ0/n;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    invoke-static {p0}, LI0/n;->b(LJ0/n;)Ljava/util/List;

    move-result-object p0

    :goto_0
    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    invoke-virtual {v0, v1, p0}, LV/b;->e(ILjava/util/List;)Z

    :cond_0
    :goto_1
    invoke-virtual {v0}, LV/b;->u()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {v0}, LV/b;->o()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v0, p0}, LV/b;->z(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ0/n;

    invoke-static {p0}, Landroidx/compose/ui/platform/l1;->g(LJ0/n;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    sget-object v2, LJ0/q;->a:LJ0/q;

    invoke-virtual {v2}, LJ0/q;->f()LJ0/v;

    move-result-object v2

    invoke-virtual {v1, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LJ0/n;->e()LE0/c0;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LE0/c0;->c1()LC0/r;

    move-result-object v1

    invoke-static {v1}, LC0/s;->c(LC0/r;)Ll0/i;

    move-result-object v2

    invoke-static {v2}, LY0/q;->b(Ll0/i;)LY0/p;

    move-result-object v2

    invoke-virtual {v2}, LY0/p;->k()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p0}, LI0/n;->a(LJ0/n;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {p0}, LI0/n;->b(LJ0/n;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_3
    add-int/lit8 v3, p1, 0x1

    new-instance v4, LI0/m;

    invoke-direct {v4, p0, v3, v2, v1}, LI0/m;-><init>(LJ0/n;ILY0/p;LC0/r;)V

    invoke-interface {p2, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, v3, p2}, LI0/n;->d(LJ0/n;ILmh/l;)V

    goto :goto_1

    :cond_4
    const-string p0, "Expected semantics node to have a coordinator."

    invoke-static {p0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0

    :cond_5
    return-void
.end method

.method static synthetic e(LJ0/n;ILmh/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LI0/n;->d(LJ0/n;ILmh/l;)V

    return-void
.end method
