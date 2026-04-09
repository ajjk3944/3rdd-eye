.class public final LTb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTb/a$a$a;
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
    invoke-direct {p0}, LTb/a$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LTb/a$a;LTb/a$b;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LTb/a$a;->e(LTb/a$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LTb/a$a;LTb/a$c;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LTb/a$a;->f(LTb/a$c;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LTb/a$a;LTb/a$d;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LTb/a$a;->g(LTb/a$d;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LTb/a$a;LTb/a$e;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LTb/a$a;->h(LTb/a$e;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final e(LTb/a$b;)Ljava/lang/String;
    .locals 1

    sget-object v0, LTb/a$a$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "channel_quality"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "ssid_scan"

    :goto_0
    return-object p1
.end method

.method private final f(LTb/a$c;)Ljava/lang/String;
    .locals 1

    sget-object v0, LTb/a$a$a;->d:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "quality"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "number"

    :goto_0
    return-object p1
.end method

.method private final g(LTb/a$d;)Ljava/lang/String;
    .locals 1

    sget-object v0, LTb/a$a$a;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "signal"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "ssid"

    :goto_0
    return-object p1
.end method

.method private final h(LTb/a$e;)Ljava/lang/String;
    .locals 1

    sget-object v0, LTb/a$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const-string p1, "6ghz"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string p1, "5ghz"

    goto :goto_0

    :cond_2
    const-string p1, "2ghz"

    goto :goto_0

    :cond_3
    const-string/jumbo p1, "all"

    :goto_0
    return-object p1
.end method
