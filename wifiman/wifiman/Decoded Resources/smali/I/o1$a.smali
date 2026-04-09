.class final LI/o1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/o1$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LI/o1$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LI/o1$a;LH/h;LI/o;LI/X0;)LI/o1$b;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LI/o1$a;->d(LH/h;LI/o;LI/X0;)LI/o1$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LI/o1$a;JLI/S0;)J
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LI/o1$a;->e(JLI/S0;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic c(LI/o1$a;JLI/S0;LI/X0;)J
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LI/o1$a;->f(JLI/S0;LI/X0;)J

    move-result-wide p0

    return-wide p0
.end method

.method private final d(LH/h;LI/o;LI/X0;)LI/o1$b;
    .locals 9

    new-instance v0, LI/S0;

    invoke-direct {v0}, LI/S0;-><init>()V

    invoke-static {p1, p2, v0}, LI/p;->a(LH/h;LI/o;LI/S0;)Ljava/lang/CharSequence;

    move-result-object v2

    const/4 p2, 0x0

    if-ne v2, p1, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p1}, LH/h;->f()J

    move-result-wide v3

    invoke-direct {p0, v3, v4, v0, p3}, LI/o1$a;->f(JLI/S0;LI/X0;)J

    move-result-wide v3

    invoke-virtual {p1}, LH/h;->c()LL0/S;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LL0/S;->r()J

    move-result-wide p1

    invoke-static {}, LI/o1;->a()LI/o1$a;

    move-result-object v1

    invoke-direct {v1, p1, p2, v0, p3}, LI/o1$a;->f(JLI/S0;LI/X0;)J

    move-result-wide p1

    invoke-static {p1, p2}, LL0/S;->b(J)LL0/S;

    move-result-object p1

    move-object v5, p1

    goto :goto_0

    :cond_1
    move-object v5, p2

    :goto_0
    new-instance p1, LH/h;

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p2, LI/o1$b;

    invoke-direct {p2, p1, v0}, LI/o1$b;-><init>(LH/h;LI/S0;)V

    return-object p2
.end method

.method private final e(JLI/S0;)J
    .locals 5

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result v0

    invoke-virtual {p3, v0}, LI/S0;->b(I)J

    move-result-wide v0

    invoke-static {p1, p2}, LL0/S;->h(J)Z

    move-result v2

    if-eqz v2, :cond_0

    move-wide v2, v0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result v2

    invoke-virtual {p3, v2}, LI/S0;->b(I)J

    move-result-wide v2

    :goto_0
    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result p3

    invoke-static {v2, v3}, LL0/S;->l(J)I

    move-result v4

    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result v0

    invoke-static {v2, v3}, LL0/S;->k(J)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {p1, p2}, LL0/S;->m(J)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v0, p3}, LL0/T;->b(II)J

    move-result-wide p1

    goto :goto_1

    :cond_1
    invoke-static {p3, v0}, LL0/T;->b(II)J

    move-result-wide p1

    :goto_1
    return-wide p1
.end method

.method private final f(JLI/S0;LI/X0;)J
    .locals 5

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result v0

    invoke-virtual {p3, v0}, LI/S0;->c(I)J

    move-result-wide v0

    invoke-static {p1, p2}, LL0/S;->h(J)Z

    move-result v2

    if-eqz v2, :cond_0

    move-wide v2, v0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result v2

    invoke-virtual {p3, v2}, LI/S0;->c(I)J

    move-result-wide v2

    :goto_0
    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result p3

    invoke-static {v2, v3}, LL0/S;->l(J)I

    move-result v4

    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result v0

    invoke-static {v2, v3}, LL0/S;->k(J)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {p1, p2}, LL0/S;->m(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0, p3}, LL0/T;->b(II)J

    move-result-wide v0

    goto :goto_1

    :cond_1
    invoke-static {p3, v0}, LL0/T;->b(II)J

    move-result-wide v0

    :goto_1
    invoke-static {p1, p2}, LL0/S;->h(J)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result p1

    if-nez p1, :cond_6

    if-eqz p4, :cond_2

    invoke-virtual {p4}, LI/X0;->a()LI/p1;

    move-result-object p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    const/4 p2, -0x1

    if-nez p1, :cond_3

    move p1, p2

    goto :goto_3

    :cond_3
    sget-object p3, LI/o1$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    :goto_3
    if-eq p1, p2, :cond_6

    const/4 p2, 0x1

    if-eq p1, p2, :cond_5

    const/4 p2, 0x2

    if-ne p1, p2, :cond_4

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result p1

    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide v0

    goto :goto_4

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result p1

    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide v0

    :cond_6
    :goto_4
    return-wide v0
.end method

.method static synthetic g(LI/o1$a;JLI/S0;LI/X0;ILjava/lang/Object;)J
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LI/o1$a;->f(JLI/S0;LI/X0;)J

    move-result-wide p0

    return-wide p0
.end method
