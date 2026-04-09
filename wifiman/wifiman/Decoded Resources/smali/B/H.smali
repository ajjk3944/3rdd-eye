.class public abstract LB/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/q;LT/l;I)V
    .locals 8

    const v0, 0x282f3fa8

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, Lc0/j;->d()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc0/h;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LB/G;->d:LB/G$b;

    invoke-virtual {v2, v0}, LB/G$b;->a(Lc0/h;)Lc0/k;

    move-result-object v2

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_6

    :cond_5
    new-instance v4, LB/H$c;

    invoke-direct {v4, v0}, LB/H$c;-><init>(Lc0/h;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lmh/a;

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v3, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lc0/c;->e([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/G;

    invoke-static {}, Lc0/j;->d()LT/H0;

    move-result-object v1

    invoke-virtual {v1, v0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v1

    new-instance v2, LB/H$a;

    invoke-direct {v2, v0, p0}, LB/H$a;-><init>(LB/G;Lmh/q;)V

    const/16 v0, 0x36

    const v3, 0x6f1942e8

    const/4 v4, 0x1

    invoke-static {v3, v4, v2, p1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget v2, LT/I0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v1, v0, p1, v2}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, LB/H$b;

    invoke-direct {v0, p0, p2}, LB/H$b;-><init>(Lmh/q;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method
