.class public abstract Lm0/L0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IIIZLn0/c;)Lm0/J0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm0/O;->a(IIIZLn0/c;)Lm0/J0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(IIIZLn0/c;ILjava/lang/Object;)Lm0/J0;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    sget-object p2, Lm0/K0;->b:Lm0/K0$a;

    invoke-virtual {p2}, Lm0/K0$a;->b()I

    move-result p2

    :cond_0
    and-int/lit8 p6, p5, 0x8

    if-eqz p6, :cond_1

    const/4 p3, 0x1

    :cond_1
    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_2

    sget-object p4, Ln0/g;->a:Ln0/g;

    invoke-virtual {p4}, Ln0/g;->w()Ln0/x;

    move-result-object p4

    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lm0/L0;->a(IIIZLn0/c;)Lm0/J0;

    move-result-object p0

    return-object p0
.end method
