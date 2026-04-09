.class public abstract LNe/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNe/h$a;
    }
.end annotation


# direct methods
.method public static final a(LS8/c;LT/l;I)Ljava/lang/String;
    .locals 3

    const v0, 0x7f44d0b9

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.domain.stringNullable (WifiBandExtensions.kt:28)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {p0}, LNe/h;->d(LS8/c;)Ls9/d;

    move-result-object p0

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object p0
.end method

.method public static final b(LS8/c;ILT/l;I)Ljava/lang/String;
    .locals 3

    const v0, -0x4c024b07

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.domain.stringWithCountFormat (WifiBandExtensions.kt:43)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {p0, p1}, LNe/h;->g(LS8/c;I)Ls9/d;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p2, p1}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p2}, LT/l;->J()V

    return-object p0
.end method

.method public static final c(LS8/c;)Ls9/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/d$b;

    invoke-static {p0}, LNe/h;->e(LS8/c;)I

    move-result p0

    invoke-direct {v0, p0}, Ls9/d$b;-><init>(I)V

    return-object v0
.end method

.method public static final d(LS8/c;)Ls9/d;
    .locals 1

    new-instance v0, Ls9/d$b;

    invoke-static {p0}, LNe/h;->f(LS8/c;)I

    move-result p0

    invoke-direct {v0, p0}, Ls9/d$b;-><init>(I)V

    return-object v0
.end method

.method public static final e(LS8/c;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LNe/h$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget p0, Lm8/c;->G4:I

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget p0, Lm8/c;->F4:I

    goto :goto_0

    :cond_2
    sget p0, Lm8/c;->E4:I

    :goto_0
    return p0
.end method

.method public static final f(LS8/c;)I
    .locals 3

    const/4 v0, -0x1

    if-nez p0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    sget-object v1, LNe/h$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_0
    if-ne v1, v0, :cond_1

    sget p0, Lm8/c;->l5:I

    goto :goto_1

    :cond_1
    invoke-static {p0}, LNe/h;->e(LS8/c;)I

    move-result p0

    :goto_1
    return p0
.end method

.method public static final g(LS8/c;I)Ls9/d;
    .locals 3

    new-instance v0, Ls9/d$b;

    const/4 v1, -0x1

    if-nez p0, :cond_0

    move p0, v1

    goto :goto_0

    :cond_0
    sget-object v2, LNe/h$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v2, p0

    :goto_0
    if-eq p0, v1, :cond_4

    const/4 v1, 0x1

    if-eq p0, v1, :cond_3

    const/4 v1, 0x2

    if-eq p0, v1, :cond_2

    const/4 v1, 0x3

    if-ne p0, v1, :cond_1

    sget p0, Lm8/c;->k5:I

    goto :goto_1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget p0, Lm8/c;->j5:I

    goto :goto_1

    :cond_3
    sget p0, Lm8/c;->i5:I

    goto :goto_1

    :cond_4
    sget p0, Lm8/c;->m5:I

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ls9/d$b;-><init>(ILjava/util/List;)V

    return-object v0
.end method
