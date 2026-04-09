.class public abstract LV6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV6/d$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(LC2/a;)LS6/a;
    .locals 0

    invoke-static {p0}, LV6/d;->b(LC2/a;)LS6/a;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LC2/a;)LS6/a;
    .locals 1

    sget-object v0, LV6/d$a;->a:[I

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

    sget-object p0, LS6/a;->MEMORY:LS6/a;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, LS6/a;->DISK:LS6/a;

    goto :goto_0

    :cond_2
    sget-object p0, LS6/a;->DISK:LS6/a;

    goto :goto_0

    :cond_3
    sget-object p0, LS6/a;->NETWORK:LS6/a;

    goto :goto_0

    :cond_4
    sget-object p0, LS6/a;->DISK:LS6/a;

    :goto_0
    return-object p0
.end method
