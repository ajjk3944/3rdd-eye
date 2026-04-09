.class public abstract LQ0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ILQ0/A;II)LQ0/j;
    .locals 8

    new-instance v7, LQ0/N;

    new-instance v4, LQ0/z;

    const/4 v0, 0x0

    new-array v0, v0, [LQ0/y;

    invoke-direct {v4, v0}, LQ0/z;-><init>([LQ0/y;)V

    const/4 v6, 0x0

    move-object v0, v7

    move v1, p0

    move-object v2, p1

    move v3, p2

    move v5, p3

    invoke-direct/range {v0 .. v6}, LQ0/N;-><init>(ILQ0/A;ILQ0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public static synthetic b(ILQ0/A;IIILjava/lang/Object;)LQ0/j;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p1, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {p1}, LQ0/A$a;->e()LQ0/A;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_1

    sget-object p2, LQ0/v;->b:LQ0/v$a;

    invoke-virtual {p2}, LQ0/v$a;->b()I

    move-result p2

    :cond_1
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    sget-object p3, LQ0/t;->a:LQ0/t$a;

    invoke-virtual {p3}, LQ0/t$a;->b()I

    move-result p3

    :cond_2
    invoke-static {p0, p1, p2, p3}, LQ0/p;->a(ILQ0/A;II)LQ0/j;

    move-result-object p0

    return-object p0
.end method
