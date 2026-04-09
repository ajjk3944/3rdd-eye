.class public abstract Lcom/ui/wifiman/ui/component/network/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/ui/component/network/p$a;
    }
.end annotation


# direct methods
.method public static final a(Lb8/c;)Ls9/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/ui/component/network/p$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    :goto_0
    sget-object p0, LPe/a;->a:LPe/a;

    invoke-virtual {p0}, LPe/a;->d0()Ls9/b;

    move-result-object p0

    goto :goto_1

    :cond_2
    sget-object p0, LPe/a;->a:LPe/a;

    invoke-virtual {p0}, LPe/a;->g()Ls9/b;

    move-result-object p0

    goto :goto_1

    :cond_3
    sget-object p0, LPe/a;->a:LPe/a;

    invoke-virtual {p0}, LPe/a;->w()Ls9/b;

    move-result-object p0

    goto :goto_1

    :cond_4
    sget-object p0, LPe/a;->a:LPe/a;

    invoke-virtual {p0}, LPe/a;->b0()Ls9/b;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method public static final b(Lb8/c;Ljava/lang/String;)Ls9/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/ui/component/network/p$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_5

    const/4 v0, 0x2

    if-eq p0, v0, :cond_4

    const/4 v0, 0x3

    if-eq p0, v0, :cond_3

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 p1, 0x5

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    if-eqz p1, :cond_2

    new-instance p0, Ls9/d$c;

    invoke-direct {p0, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    new-instance p0, Ls9/d$b;

    sget p1, Lm8/c;->l:I

    invoke-direct {p0, p1}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_3
    new-instance p0, Ls9/d$b;

    sget p1, Lm8/c;->j:I

    invoke-direct {p0, p1}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_4
    :goto_0
    new-instance p0, Ls9/d$b;

    sget p1, Lm8/c;->k:I

    invoke-direct {p0, p1}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_5
    new-instance p0, Ls9/d$b;

    sget p1, Lm8/c;->m:I

    invoke-direct {p0, p1}, Ls9/d$b;-><init>(I)V

    :goto_1
    return-object p0
.end method

.method public static synthetic c(Lb8/c;Ljava/lang/String;ILjava/lang/Object;)Ls9/d;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/component/network/p;->b(Lb8/c;Ljava/lang/String;)Ls9/d;

    move-result-object p0

    return-object p0
.end method
