.class public abstract LT/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LT/I0;Lmh/p;LT/l;I)V
    .locals 3

    const v0, -0x50862cb8

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2, p0}, LT/l;->W(LT/I0;)V

    shr-int/lit8 v0, p3, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LT/l;->O()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_2

    new-instance v0, LT/w$b;

    invoke-direct {v0, p0, p1, p3}, LT/w$b;-><init>(LT/I0;Lmh/p;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_2
    return-void
.end method

.method public static final b([LT/I0;Lmh/p;LT/l;I)V
    .locals 3

    const v0, -0x52e5dee3

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2, p0}, LT/l;->B([LT/I0;)V

    shr-int/lit8 v0, p3, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LT/l;->F()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_2

    new-instance v0, LT/w$a;

    invoke-direct {v0, p0, p1, p3}, LT/w$a;-><init>([LT/I0;Lmh/p;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_2
    return-void
.end method

.method public static final c(LT/n1;Lmh/a;)LT/H0;
    .locals 1

    new-instance v0, LT/M;

    invoke-direct {v0, p0, p1}, LT/M;-><init>(LT/n1;Lmh/a;)V

    return-object v0
.end method

.method public static synthetic d(LT/n1;Lmh/a;ILjava/lang/Object;)LT/H0;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object p0

    :cond_0
    invoke-static {p0, p1}, LT/w;->c(LT/n1;Lmh/a;)LT/H0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lmh/l;)LT/H0;
    .locals 1

    new-instance v0, LT/C;

    invoke-direct {v0, p0}, LT/C;-><init>(Lmh/l;)V

    return-object v0
.end method

.method public static final f(Lmh/a;)LT/H0;
    .locals 1

    new-instance v0, LT/A1;

    invoke-direct {v0, p0}, LT/A1;-><init>(Lmh/a;)V

    return-object v0
.end method
