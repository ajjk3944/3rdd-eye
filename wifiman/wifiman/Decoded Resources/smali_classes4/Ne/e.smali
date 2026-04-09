.class public abstract LNe/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNe/e$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(LW7/e;)I
    .locals 0

    invoke-static {p0}, LNe/e;->e(LW7/e;)I

    move-result p0

    return p0
.end method

.method public static final b(LW7/e;LT/l;I)J
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x268e7bf2

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.domain.color (RatingCategoryExtensions.kt:23)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-static {p0, p2}, LNe/e;->c(LW7/e;Lma/a;)J

    move-result-wide v0

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method

.method public static final c(LW7/e;Lma/a;)J
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "palette"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LNe/e$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->l()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide p0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->h()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide p0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->e()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide p0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static final d(LW7/e;Z)Ls9/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    new-instance p1, Ls9/d$b;

    invoke-static {p0}, LNe/e;->e(LW7/e;)I

    move-result p0

    invoke-direct {p1, p0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p1, Ls9/d$a;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    new-instance v1, LNe/e$b;

    invoke-direct {v1, p0}, LNe/e$b;-><init>(LW7/e;)V

    invoke-direct {p1, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    :goto_0
    return-object p1
.end method

.method private static final e(LW7/e;)I
    .locals 1

    sget-object v0, LNe/e$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget p0, Lm8/c;->K2:I

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget p0, Lm8/c;->I2:I

    goto :goto_0

    :cond_2
    sget p0, Lm8/c;->J2:I

    goto :goto_0

    :cond_3
    sget p0, Lm8/c;->H2:I

    :goto_0
    return p0
.end method
