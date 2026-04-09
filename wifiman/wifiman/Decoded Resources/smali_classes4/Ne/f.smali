.class public abstract LNe/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNe/f$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(LW7/f;)Ls9/d;
    .locals 0

    invoke-static {p0}, LNe/f;->f(LW7/f;)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LW7/f$a;)LW7/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LNe/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, LW7/e;->POOR:LW7/e;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, LW7/e;->GOOD:LW7/e;

    goto :goto_0

    :cond_2
    sget-object p0, LW7/e;->EXCELLENT:LW7/e;

    :goto_0
    return-object p0
.end method

.method public static final c(LW7/f;LW7/f$a;LT/l;II)J
    .locals 2

    const v0, -0x6c8bcaac

    invoke-interface {p2, v0}, LT/l;->U(I)V

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LW7/f;->h()LW7/f$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_2

    const/4 p4, -0x1

    const-string v1, "com.ui.wifiman.ui.domain.color (SignalExtensions.kt:25)"

    invoke-static {v0, p3, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p3, Lla/a;->a:Lla/a;

    sget p4, Lla/a;->b:I

    invoke-virtual {p3, p2, p4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p3

    invoke-static {p0, p3, p1}, LNe/f;->d(LW7/f;Lma/a;LW7/f$a;)J

    move-result-wide p0

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->J()V

    return-wide p0
.end method

.method public static final d(LW7/f;Lma/a;LW7/f$a;)J
    .locals 1

    const-string p0, "palette"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, -0x1

    if-nez p2, :cond_0

    move p2, p0

    goto :goto_0

    :cond_0
    sget-object v0, LNe/f$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    :goto_0
    if-eq p2, p0, :cond_4

    const/4 p0, 0x1

    if-eq p2, p0, :cond_3

    const/4 p0, 0x2

    if-eq p2, p0, :cond_2

    const/4 p0, 0x3

    if-ne p2, p0, :cond_1

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->l()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide p0

    goto :goto_1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->e()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide p0

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide p0

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$b;->i()J

    move-result-wide p0

    :goto_1
    return-wide p0
.end method

.method public static synthetic e(LW7/f;Lma/a;LW7/f$a;ILjava/lang/Object;)J
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LW7/f;->h()LW7/f$a;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :cond_1
    :goto_0
    invoke-static {p0, p1, p2}, LNe/f;->d(LW7/f;Lma/a;LW7/f$a;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final f(LW7/f;)Ls9/d;
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LW7/f;->b()I

    move-result p0

    new-instance v0, Ls9/d$b;

    sget v1, Lm8/c;->r4:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ls9/d$b;-><init>(ILjava/util/List;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ls9/d$b;

    sget p0, Lm8/c;->L2:I

    invoke-direct {v0, p0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object v0
.end method

.method public static final g(LW7/f;ZLW7/f$a;)Ls9/d;
    .locals 2

    if-nez p1, :cond_0

    invoke-static {p0}, LNe/f;->f(LW7/f;)Ls9/d;

    move-result-object p0

    goto :goto_1

    :cond_0
    new-instance p1, Ls9/d$a;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LW7/f;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, LNe/f$b;

    invoke-direct {v1, p0, p2}, LNe/f$b;-><init>(LW7/f;LW7/f$a;)V

    invoke-direct {p1, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    move-object p0, p1

    :goto_1
    return-object p0
.end method

.method public static synthetic h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LW7/f;->h()LW7/f$a;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :cond_1
    :goto_0
    invoke-static {p0, p1, p2}, LNe/f;->g(LW7/f;ZLW7/f$a;)Ls9/d;

    move-result-object p0

    return-object p0
.end method
