.class public abstract LKi/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ILKi/a;Lmh/l;)LKi/g;
    .locals 2

    const/4 v0, -0x2

    const/4 v1, 0x1

    if-eq p0, v0, :cond_6

    const/4 v0, -0x1

    if-eq p0, v0, :cond_4

    if-eqz p0, :cond_2

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_1

    sget-object v0, LKi/a;->SUSPEND:LKi/a;

    if-ne p1, v0, :cond_0

    new-instance p1, LKi/e;

    invoke-direct {p1, p0, p2}, LKi/e;-><init>(ILmh/l;)V

    goto :goto_1

    :cond_0
    new-instance v0, LKi/q;

    invoke-direct {v0, p0, p1, p2}, LKi/q;-><init>(ILKi/a;Lmh/l;)V

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, LKi/e;

    invoke-direct {p1, v0, p2}, LKi/e;-><init>(ILmh/l;)V

    goto :goto_1

    :cond_2
    sget-object p0, LKi/a;->SUSPEND:LKi/a;

    if-ne p1, p0, :cond_3

    new-instance p0, LKi/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, LKi/e;-><init>(ILmh/l;)V

    :goto_0
    move-object p1, p0

    goto :goto_1

    :cond_3
    new-instance p0, LKi/q;

    invoke-direct {p0, v1, p1, p2}, LKi/q;-><init>(ILKi/a;Lmh/l;)V

    goto :goto_0

    :cond_4
    sget-object p0, LKi/a;->SUSPEND:LKi/a;

    if-ne p1, p0, :cond_5

    new-instance p1, LKi/q;

    sget-object p0, LKi/a;->DROP_OLDEST:LKi/a;

    invoke-direct {p1, v1, p0, p2}, LKi/q;-><init>(ILKi/a;Lmh/l;)V

    goto :goto_1

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    sget-object p0, LKi/a;->SUSPEND:LKi/a;

    if-ne p1, p0, :cond_7

    new-instance p0, LKi/e;

    sget-object p1, LKi/g;->P:LKi/g$a;

    invoke-virtual {p1}, LKi/g$a;->a()I

    move-result p1

    invoke-direct {p0, p1, p2}, LKi/e;-><init>(ILmh/l;)V

    goto :goto_0

    :cond_7
    new-instance p0, LKi/q;

    invoke-direct {p0, v1, p1, p2}, LKi/q;-><init>(ILKi/a;Lmh/l;)V

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public static synthetic b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p0, 0x0

    :cond_0
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_1

    sget-object p1, LKi/a;->SUSPEND:LKi/a;

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    const/4 p2, 0x0

    :cond_2
    invoke-static {p0, p1, p2}, LKi/j;->a(ILKi/a;Lmh/l;)LKi/g;

    move-result-object p0

    return-object p0
.end method
