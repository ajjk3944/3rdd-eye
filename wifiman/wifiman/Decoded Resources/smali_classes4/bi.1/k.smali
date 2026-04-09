.class public abstract Lbi/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LZh/c;

.field private static final b:LZh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZh/c;

    const-string v1, "kotlin.jvm.JvmInline"

    invoke-direct {v0, v1}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbi/k;->a:LZh/c;

    sget-object v1, LZh/b;->d:LZh/b$a;

    invoke-virtual {v1, v0}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v0

    sput-object v0, Lbi/k;->b:LZh/b;

    return-void
.end method

.method public static final a(LBh/a;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LBh/Z;

    if-eqz v0, :cond_0

    check-cast p0, LBh/Z;

    invoke-interface {p0}, LBh/X;->C0()LBh/Y;

    move-result-object p0

    const-string v0, "getCorrespondingProperty(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbi/k;->f(LBh/t0;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(LBh/m;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_0

    check-cast p0, LBh/e;

    invoke-interface {p0}, LBh/e;->z0()LBh/q0;

    move-result-object p0

    instance-of p0, p0, LBh/A;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final c(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lbi/k;->b(LBh/m;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(LBh/m;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_0

    check-cast p0, LBh/e;

    invoke-interface {p0}, LBh/e;->z0()LBh/q0;

    move-result-object p0

    instance-of p0, p0, LBh/H;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final e(LBh/t0;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/a;->k0()LBh/b0;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-interface {p0}, LBh/r0;->b()LBh/m;

    move-result-object v0

    instance-of v1, v0, LBh/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LBh/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lfi/e;->q(LBh/e;)LBh/A;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LBh/A;->c()LZh/f;

    move-result-object v2

    :cond_1
    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object p0

    invoke-static {v2, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static final f(LBh/t0;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/a;->k0()LBh/b0;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p0}, LBh/r0;->b()LBh/m;

    move-result-object v0

    instance-of v1, v0, LBh/e;

    if-eqz v1, :cond_0

    check-cast v0, LBh/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, LBh/e;->z0()LBh/q0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object p0

    const-string v1, "getName(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, LBh/q0;->a(LZh/f;)Z

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static final g(LBh/m;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbi/k;->b(LBh/m;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lbi/k;->d(LBh/m;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final h(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lbi/k;->g(LBh/m;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final i(Lpi/S;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lbi/k;->d(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/s;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/s;

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/s;->v0(Lri/i;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static final j(Lpi/S;)Lpi/S;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbi/k;->k(Lpi/S;)Lpi/S;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lpi/G0;->f(Lpi/S;)Lpi/G0;

    move-result-object p0

    sget-object v1, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {p0, v0, v1}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final k(Lpi/S;)Lpi/S;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    instance-of v0, p0, LBh/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LBh/e;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lfi/e;->q(LBh/e;)LBh/A;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LBh/A;->d()Lri/j;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lpi/d0;

    :cond_1
    return-object v1
.end method
