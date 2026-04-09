.class public abstract Lh8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lmh/a;)V
    .locals 0

    invoke-static {p0}, Lh8/k$a;->f(Lmh/a;)V

    return-void
.end method

.method public static synthetic b(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lh8/k$a;->h(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lh8/k$a;->r()V

    return-void
.end method

.method public static synthetic d()V
    .locals 0

    invoke-static {}, Lh8/k$a;->s()V

    return-void
.end method

.method private static e(Lh8/k;Lmh/a;)Lkg/a;
    .locals 0

    new-instance p0, Lh8/g;

    invoke-direct {p0, p1}, Lh8/g;-><init>(Lmh/a;)V

    return-object p0
.end method

.method private static f(Lmh/a;)V
    .locals 0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static g(Lh8/k;Lmh/l;)Lkg/f;
    .locals 0

    new-instance p0, Lh8/h;

    invoke-direct {p0, p1}, Lh8/h;-><init>(Lmh/l;)V

    return-object p0
.end method

.method private static h(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string/jumbo v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static i(Lh8/k;Lgg/b;Lh8/c;Lkg/a;Lkg/f;Z)V
    .locals 1

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onComplete"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p5, :cond_0

    invoke-static {}, Lfg/b;->g()Lgg/y;

    move-result-object p5

    invoke-virtual {p1, p5}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p0}, Lh8/k;->K()Lh8/f;

    move-result-object p0

    if-nez p4, :cond_1

    invoke-static {}, Lh8/m;->c()Lkg/f;

    move-result-object p4

    :cond_1
    const-string/jumbo p5, "null cannot be cast to non-null type io.reactivex.rxjava3.functions.Consumer<kotlin.Throwable>"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p3, p4}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object p1

    const-string/jumbo p3, "subscribe(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lh8/f;->d(Lhg/c;Lh8/c;)V

    return-void
.end method

.method public static j(Lh8/k;Lgg/b;Lh8/c;Lmh/l;ZLmh/a;)V
    .locals 7

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onComplete"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p5}, Lh8/k$a;->e(Lh8/k;Lmh/a;)Lkg/a;

    move-result-object v4

    if-eqz p3, :cond_0

    invoke-static {p0, p3}, Lh8/k$a;->g(Lh8/k;Lmh/l;)Lkg/f;

    move-result-object p3

    :goto_0
    move-object v5, p3

    goto :goto_1

    :cond_0
    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v6, p4

    invoke-interface/range {v1 .. v6}, Lh8/k;->q(Lgg/b;Lh8/c;Lkg/a;Lkg/f;Z)V

    return-void
.end method

.method public static k(Lh8/k;Lgg/i;Lh8/c;Lkg/f;Lkg/f;Lkg/a;Z)V
    .locals 1

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onNext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p6, :cond_0

    invoke-static {}, Lfg/b;->g()Lgg/y;

    move-result-object p6

    invoke-virtual {p1, p6}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p0}, Lh8/k;->K()Lh8/f;

    move-result-object p0

    if-nez p4, :cond_1

    invoke-static {}, Lh8/m;->c()Lkg/f;

    move-result-object p4

    :cond_1
    const-string/jumbo p6, "null cannot be cast to non-null type io.reactivex.rxjava3.functions.Consumer<kotlin.Throwable>"

    invoke-static {p4, p6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p5, :cond_2

    new-instance p5, Lh8/j;

    invoke-direct {p5}, Lh8/j;-><init>()V

    :cond_2
    invoke-virtual {p1, p3, p4, p5}, Lgg/i;->C1(Lkg/f;Lkg/f;Lkg/a;)Lhg/c;

    move-result-object p1

    const-string/jumbo p3, "subscribe(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lh8/f;->d(Lhg/c;Lh8/c;)V

    return-void
.end method

.method public static l(Lh8/k;Lgg/i;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;)V
    .locals 8

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onNext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p6}, Lh8/k$a;->g(Lh8/k;Lmh/l;)Lkg/f;

    move-result-object v4

    const/4 p6, 0x0

    if-eqz p3, :cond_0

    invoke-static {p0, p3}, Lh8/k$a;->g(Lh8/k;Lmh/l;)Lkg/f;

    move-result-object p3

    move-object v5, p3

    goto :goto_0

    :cond_0
    move-object v5, p6

    :goto_0
    if-eqz p4, :cond_1

    invoke-static {p0, p4}, Lh8/k$a;->e(Lh8/k;Lmh/a;)Lkg/a;

    move-result-object p3

    move-object v6, p3

    goto :goto_1

    :cond_1
    move-object v6, p6

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v7, p5

    invoke-interface/range {v1 .. v7}, Lh8/k;->k(Lgg/i;Lh8/c;Lkg/f;Lkg/f;Lkg/a;Z)V

    return-void
.end method

.method public static m(Lh8/k;Lgg/s;Lh8/c;Lkg/f;Lkg/a;ZLkg/f;)V
    .locals 1

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onNext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p5, :cond_0

    invoke-static {}, Lfg/b;->g()Lgg/y;

    move-result-object p5

    invoke-virtual {p1, p5}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object p1

    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p0}, Lh8/k;->K()Lh8/f;

    move-result-object p0

    if-nez p3, :cond_1

    invoke-static {}, Lh8/m;->c()Lkg/f;

    move-result-object p3

    :cond_1
    const-string/jumbo p5, "null cannot be cast to non-null type io.reactivex.rxjava3.functions.Consumer<kotlin.Throwable>"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_2

    new-instance p4, Lh8/i;

    invoke-direct {p4}, Lh8/i;-><init>()V

    :cond_2
    invoke-virtual {p1, p6, p3, p4}, Lgg/s;->K0(Lkg/f;Lkg/f;Lkg/a;)Lhg/c;

    move-result-object p1

    const-string/jumbo p3, "subscribe(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lh8/f;->d(Lhg/c;Lh8/c;)V

    return-void
.end method

.method public static n(Lh8/k;Lgg/s;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;)V
    .locals 8

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onNext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p6}, Lh8/k$a;->g(Lh8/k;Lmh/l;)Lkg/f;

    move-result-object v7

    const/4 p6, 0x0

    if-eqz p3, :cond_0

    invoke-static {p0, p3}, Lh8/k$a;->g(Lh8/k;Lmh/l;)Lkg/f;

    move-result-object p3

    move-object v4, p3

    goto :goto_0

    :cond_0
    move-object v4, p6

    :goto_0
    if-eqz p4, :cond_1

    invoke-static {p0, p4}, Lh8/k$a;->e(Lh8/k;Lmh/a;)Lkg/a;

    move-result-object p3

    move-object v5, p3

    goto :goto_1

    :cond_1
    move-object v5, p6

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v6, p5

    invoke-interface/range {v1 .. v7}, Lh8/k;->J(Lgg/s;Lh8/c;Lkg/f;Lkg/a;ZLkg/f;)V

    return-void
.end method

.method public static synthetic o(Lh8/k;Lgg/b;Lh8/c;Lmh/l;ZLmh/a;ILjava/lang/Object;)V
    .locals 6

    if-nez p7, :cond_2

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x4

    if-eqz p3, :cond_1

    const/4 p4, 0x1

    :cond_1
    move v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lh8/k;->B(Lgg/b;Lh8/c;Lmh/l;ZLmh/a;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: subscribeUntil"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic p(Lh8/k;Lgg/i;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;ILjava/lang/Object;)V
    .locals 9

    if-nez p8, :cond_3

    and-int/lit8 v0, p7, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p3

    :goto_0
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, p4

    :goto_1
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    move v7, v0

    goto :goto_2

    :cond_2
    move v7, p5

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v8, p6

    invoke-interface/range {v2 .. v8}, Lh8/k;->M(Lgg/i;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v1, "Super calls with default arguments not supported in this target, function: subscribeUntil"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic q(Lh8/k;Lgg/s;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;ILjava/lang/Object;)V
    .locals 9

    if-nez p8, :cond_3

    and-int/lit8 v0, p7, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p3

    :goto_0
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, p4

    :goto_1
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    move v7, v0

    goto :goto_2

    :cond_2
    move v7, p5

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v8, p6

    invoke-interface/range {v2 .. v8}, Lh8/k;->c(Lgg/s;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v1, "Super calls with default arguments not supported in this target, function: subscribeUntil"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static r()V
    .locals 0

    return-void
.end method

.method private static s()V
    .locals 0

    return-void
.end method
