.class public abstract LNe/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LS8/g;LT/l;I)J
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7360e6aa

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.domain.color (WifiExperienceExtensions.kt:50)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of p2, p0, LS8/g$b;

    if-eqz p2, :cond_1

    const p0, 0x60185f9f

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    instance-of p2, p0, LS8/g$c;

    if-eqz p2, :cond_2

    const p0, 0x6018675f

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->e()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_2
    instance-of p0, p0, LS8/g$d;

    if-eqz p0, :cond_4

    const p0, 0x60186eff

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->l()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0

    :cond_4
    const p0, 0x6018568f

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(LS8/g;Z)Ls9/d;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/d$a;

    invoke-virtual {p0}, LS8/g;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LNe/k$a;

    invoke-direct {v2, p0, p1}, LNe/k$a;-><init>(LS8/g;Z)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    return-object v0
.end method
