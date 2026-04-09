.class public abstract LT/O;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/L;

    invoke-direct {v0}, LT/L;-><init>()V

    sput-object v0, LT/O;->a:LT/L;

    return-void
.end method

.method public static final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lmh/l;LT/l;I)V
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)"

    const v2, -0x49e1da5f

    invoke-static {v2, p5, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p4, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p4, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_1

    sget-object p0, LT/l;->a:LT/l$a;

    invoke-virtual {p0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_2

    :cond_1
    new-instance p1, LT/J;

    invoke-direct {p1, p3}, LT/J;-><init>(Lmh/l;)V

    invoke-interface {p4, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p1, LT/J;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public static final b(Ljava/lang/Object;Ljava/lang/Object;Lmh/l;LT/l;I)V
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)"

    const v2, 0x552e4d01

    invoke-static {v2, p4, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_1

    sget-object p0, LT/l;->a:LT/l$a;

    invoke-virtual {p0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_2

    :cond_1
    new-instance p1, LT/J;

    invoke-direct {p1, p2}, LT/J;-><init>(Lmh/l;)V

    invoke-interface {p3, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p1, LT/J;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public static final c(Ljava/lang/Object;Lmh/l;LT/l;I)V
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)"

    const v2, -0x51c6db9f

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    if-nez p0, :cond_1

    sget-object p0, LT/l;->a:LT/l$a;

    invoke-virtual {p0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p3, p0, :cond_2

    :cond_1
    new-instance p3, LT/J;

    invoke-direct {p3, p1}, LT/J;-><init>(Lmh/l;)V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p3, LT/J;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public static final d([Ljava/lang/Object;Lmh/l;LT/l;I)V
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)"

    const v2, -0x4df0ce72

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    array-length p3, p0

    invoke-static {p0, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    array-length p3, p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v0, p3, :cond_1

    aget-object v2, p0, v0

    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p0

    if-nez v1, :cond_2

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p0, p3, :cond_3

    :cond_2
    new-instance p0, LT/J;

    invoke-direct {p0, p1}, LT/J;-><init>(Lmh/l;)V

    invoke-interface {p2, p0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-void
.end method

.method public static final e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)"

    const v2, 0x232e5d65

    invoke-static {v2, p4, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p3}, LT/l;->E()Ldh/i;

    move-result-object p4

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_1

    sget-object p0, LT/l;->a:LT/l$a;

    invoke-virtual {p0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_2

    :cond_1
    new-instance p1, LT/c0;

    invoke-direct {p1, p4, p2}, LT/c0;-><init>(Ldh/i;Lmh/p;)V

    invoke-interface {p3, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p1, LT/c0;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public static final f(Ljava/lang/Object;Lmh/p;LT/l;I)V
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)"

    const v2, 0x4648f105

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LT/l;->E()Ldh/i;

    move-result-object p3

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p0, :cond_1

    sget-object p0, LT/l;->a:LT/l$a;

    invoke-virtual {p0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne v0, p0, :cond_2

    :cond_1
    new-instance v0, LT/c0;

    invoke-direct {v0, p3, p1}, LT/c0;-><init>(Ldh/i;Lmh/p;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, LT/c0;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public static final g(Lmh/a;LT/l;I)V
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.SideEffect (Effects.kt:48)"

    const v2, -0x4ccc7149

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1, p0}, LT/l;->m(Lmh/a;)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public static final synthetic h()LT/L;
    .locals 1

    sget-object v0, LT/O;->a:LT/L;

    return-object v0
.end method

.method public static final i(Ldh/i;LT/l;)LIi/N;
    .locals 2

    sget-object v0, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p0, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    const/4 p1, 0x0

    invoke-static {p1, p0, p1}, LIi/A0;->b(LIi/y0;ILjava/lang/Object;)LIi/A;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "CoroutineContext supplied to rememberCoroutineScope may not include a parent job"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, LIi/A;->a(Ljava/lang/Throwable;)Z

    invoke-static {p0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->E()Ldh/i;

    move-result-object p1

    invoke-interface {p1, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    check-cast v0, LIi/y0;

    invoke-static {v0}, LIi/A0;->a(LIi/y0;)LIi/A;

    move-result-object v0

    invoke-interface {p1, v0}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    invoke-interface {p1, p0}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    invoke-static {p0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object p0

    :goto_0
    return-object p0
.end method
