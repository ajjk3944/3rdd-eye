.class public abstract LA/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LA/B;Lmh/l;LT/l;I)Lmh/a;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)"

    const v2, -0x147cff54

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 v0, p3, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {p1, p2, v0}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v1, :cond_3

    :cond_2
    const/4 p3, 0x1

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_4

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_5

    :cond_4
    new-instance p3, LA/d;

    invoke-direct {p3}, LA/d;-><init>()V

    invoke-static {}, LT/o1;->m()LT/n1;

    move-result-object v0

    new-instance v1, LA/o$b;

    invoke-direct {v1, p1}, LA/o$b;-><init>(LT/z1;)V

    invoke-static {v0, v1}, LT/o1;->d(LT/n1;Lmh/a;)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o1;->m()LT/n1;

    move-result-object v0

    new-instance v1, LA/o$c;

    invoke-direct {v1, p1, p0, p3}, LA/o$c;-><init>(LT/z1;LA/B;LA/d;)V

    invoke-static {v0, v1}, LT/o1;->d(LT/n1;Lmh/a;)LT/z1;

    move-result-object p0

    new-instance v0, LA/o$a;

    invoke-direct {v0, p0}, LA/o$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Lth/m;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    return-object v0
.end method
