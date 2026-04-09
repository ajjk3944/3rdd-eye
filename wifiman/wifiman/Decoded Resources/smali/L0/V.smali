.class public abstract LL0/V;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL0/V$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(LL0/A;LL0/z;)LL0/B;
    .locals 0

    invoke-static {p0, p1}, LL0/V;->b(LL0/A;LL0/z;)LL0/B;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LL0/A;LL0/z;)LL0/B;
    .locals 0

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LL0/c;->a(LL0/A;LL0/z;)LL0/B;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final c(LL0/U;LL0/U;F)LL0/U;
    .locals 3

    new-instance v0, LL0/U;

    invoke-virtual {p0}, LL0/U;->N()LL0/D;

    move-result-object v1

    invoke-virtual {p1}, LL0/U;->N()LL0/D;

    move-result-object v2

    invoke-static {v1, v2, p2}, LL0/E;->c(LL0/D;LL0/D;F)LL0/D;

    move-result-object v1

    invoke-virtual {p0}, LL0/U;->M()LL0/v;

    move-result-object p0

    invoke-virtual {p1}, LL0/U;->M()LL0/v;

    move-result-object p1

    invoke-static {p0, p1, p2}, LL0/w;->b(LL0/v;LL0/v;F)LL0/v;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LL0/U;-><init>(LL0/D;LL0/v;)V

    return-object v0
.end method

.method public static final d(LL0/U;LY0/t;)LL0/U;
    .locals 3

    new-instance v0, LL0/U;

    invoke-virtual {p0}, LL0/U;->y()LL0/D;

    move-result-object v1

    invoke-static {v1}, LL0/E;->h(LL0/D;)LL0/D;

    move-result-object v1

    invoke-virtual {p0}, LL0/U;->v()LL0/v;

    move-result-object v2

    invoke-static {v2, p1}, LL0/w;->e(LL0/v;LY0/t;)LL0/v;

    move-result-object p1

    invoke-virtual {p0}, LL0/U;->w()LL0/B;

    move-result-object p0

    invoke-direct {v0, v1, p1, p0}, LL0/U;-><init>(LL0/D;LL0/v;LL0/B;)V

    return-object v0
.end method

.method public static final e(LY0/t;I)I
    .locals 4

    sget-object v0, LW0/l;->b:LW0/l$a;

    invoke-virtual {v0}, LW0/l$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LW0/l;->j(II)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    sget-object p1, LL0/V$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    if-eq p0, v3, :cond_1

    if-ne p0, v2, :cond_0

    invoke-virtual {v0}, LW0/l$a;->c()I

    move-result p1

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-virtual {v0}, LW0/l$a;->b()I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LW0/l$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LW0/l;->j(II)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object p1, LL0/V$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    if-eq p0, v3, :cond_4

    if-ne p0, v2, :cond_3

    invoke-virtual {v0}, LW0/l$a;->e()I

    move-result p1

    goto :goto_0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    invoke-virtual {v0}, LW0/l$a;->d()I

    move-result p1

    :cond_5
    :goto_0
    return p1
.end method
