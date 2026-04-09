.class public abstract Lfe/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/lang/Throwable;)Lgg/i;
    .locals 0

    invoke-static {p0}, Lfe/h;->f(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLWc/b;LWc/b;)LWc/b;
    .locals 0

    invoke-static {p0, p1, p2}, Lfe/h;->i(ZLWc/b;LWc/b;)LWc/b;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lgg/i;Lmh/l;)Lgg/i;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onErrorFallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfe/h$b;->a:Lfe/h$b;

    invoke-virtual {p0, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p0

    new-instance v0, Lfe/h$e;

    invoke-direct {v0, p1}, Lfe/h$e;-><init>(Lmh/l;)V

    invoke-virtual {p0, v0}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p0

    new-instance p1, LWc/b$b;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, v0}, LWc/b$b;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    const-string p1, "startWithItem(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final d(Lgg/z;Lmh/l;)Lgg/s;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onErrorFallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfe/h$a;->a:Lfe/h$a;

    invoke-virtual {p0, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p0

    new-instance v0, Lfe/h$e;

    invoke-direct {v0, p1}, Lfe/h$e;-><init>(Lmh/l;)V

    invoke-virtual {p0, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p0

    invoke-virtual {p0}, Lgg/z;->Y()Lgg/s;

    move-result-object p0

    new-instance p1, LWc/b$b;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, v0}, LWc/b$b;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lgg/s;->I0(Ljava/lang/Object;)Lgg/s;

    move-result-object p0

    const-string p1, "startWithItem(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic e(Lgg/i;Lmh/l;ILjava/lang/Object;)Lgg/i;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Lfe/f;

    invoke-direct {p1}, Lfe/f;-><init>()V

    :cond_0
    invoke-static {p0, p1}, Lfe/h;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljava/lang/Throwable;)Lgg/i;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWc/b$a$a;

    invoke-direct {v0, p0}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lgg/i;Z)Lgg/i;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfe/g;

    invoke-direct {v0, p1}, Lfe/g;-><init>(Z)V

    invoke-virtual {p0, v0}, Lgg/i;->r1(Lkg/b;)Lgg/i;

    move-result-object p0

    new-instance p1, LWc/b$b;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, v0}, LWc/b$b;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    invoke-virtual {p0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p0

    invoke-virtual {p0}, Ljg/a;->i2()Lgg/i;

    move-result-object p0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p0

    const-string p1, "subscribeOn(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic h(Lgg/i;ZILjava/lang/Object;)Lgg/i;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-static {p0, p1}, Lfe/h;->g(Lgg/i;Z)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private static final i(ZLWc/b;LWc/b;)LWc/b;
    .locals 1

    const-string v0, "emitted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of p0, p2, LWc/b$a$b;

    if-nez p0, :cond_1

    instance-of p0, p1, LWc/b$a$b;

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object p1, p2

    :goto_1
    return-object p1
.end method

.method public static final j(Lgg/i;Lmh/l;)Lgg/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfe/h$c;

    invoke-direct {v0, p1}, Lfe/h$c;-><init>(Lmh/l;)V

    invoke-virtual {p0, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p0

    const-string p1, "map(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final k(Lgg/i;JZLmh/l;)Lgg/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endPointMapper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2, p4}, Lfe/h;->m(Lgg/i;JLmh/l;)Lgg/i;

    move-result-object p0

    invoke-static {p0, p3}, Lfe/h;->g(Lgg/i;Z)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lgg/i;JZLmh/l;ILjava/lang/Object;)Lgg/i;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lfe/h;->k(Lgg/i;JZLmh/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lgg/i;JLmh/l;)Lgg/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endPointMapper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfe/h$d;

    invoke-direct {v0, p3, p1, p2}, Lfe/h$d;-><init>(Lmh/l;J)V

    invoke-virtual {p0, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p0

    const-string p1, "switchMap(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
