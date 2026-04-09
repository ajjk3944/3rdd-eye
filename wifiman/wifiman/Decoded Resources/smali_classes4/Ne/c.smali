.class public abstract LNe/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lb8/a;LT/l;I)J
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x8b28050

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.domain.color (InternetAvailabilityExtensions.kt:22)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-static {p0, p2}, LNe/c;->b(Lb8/a;Lma/a;)J

    move-result-wide v0

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method

.method public static final b(Lb8/a;Lma/a;)J
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "palette"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lb8/a$b;

    if-nez v0, :cond_2

    instance-of v0, p0, Lb8/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide p0

    goto :goto_0

    :cond_0
    instance-of p0, p0, Lb8/a$c;

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->l()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide p0

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    invoke-virtual {p1}, Lma/a;->f()Lma/a$f;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$f;->c()J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method private static final c(Lb8/a;IZ)Ls9/d;
    .locals 2

    if-eqz p2, :cond_0

    new-instance p2, Ls9/d$a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LNe/c$a;

    invoke-direct {v1, p0, p1}, LNe/c$a;-><init>(Lb8/a;I)V

    invoke-direct {p2, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_0

    :cond_0
    new-instance p2, Ls9/d$b;

    invoke-direct {p2, p1}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p2
.end method

.method public static final d(Lb8/a;Z)Ls9/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LNe/c;->f(Lb8/a;)I

    move-result v0

    invoke-static {p0, v0, p1}, LNe/c;->c(Lb8/a;IZ)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lb8/a;Z)Ls9/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LNe/c;->g(Lb8/a;)I

    move-result v0

    invoke-static {p0, v0, p1}, LNe/c;->c(Lb8/a;IZ)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lb8/a;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lb8/a$b;

    if-nez v0, :cond_2

    instance-of v0, p0, Lb8/a$a;

    if-eqz v0, :cond_0

    sget p0, Lm8/c;->B0:I

    goto :goto_0

    :cond_0
    instance-of p0, p0, Lb8/a$c;

    if-eqz p0, :cond_1

    sget p0, Lm8/c;->C0:I

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget p0, Lm8/c;->A4:I

    :goto_0
    return p0
.end method

.method public static final g(Lb8/a;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lb8/a$b;

    if-nez v0, :cond_2

    instance-of v0, p0, Lb8/a$a;

    if-eqz v0, :cond_0

    sget p0, Lm8/c;->l1:I

    goto :goto_0

    :cond_0
    instance-of p0, p0, Lb8/a$c;

    if-eqz p0, :cond_1

    sget p0, Lm8/c;->m1:I

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget p0, Lm8/c;->A4:I

    :goto_0
    return p0
.end method
