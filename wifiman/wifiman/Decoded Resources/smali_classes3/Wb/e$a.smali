.class public final LWb/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWb/e$a$a;
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
    invoke-direct {p0}, LWb/e$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LWb/e$a;LWb/e$b;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LWb/e$a;->d(LWb/e$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LWb/e$a;LWb/e$c;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LWb/e$a;->e(LWb/e$c;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LWb/e$a;LWb/e$d;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LWb/e$a;->f(LWb/e$d;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final d(LWb/e$b;)Ljava/lang/String;
    .locals 1

    sget-object v0, LWb/e$a$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "latency"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "throughput"

    goto :goto_0

    :cond_2
    const-string/jumbo p1, "signal"

    :goto_0
    return-object p1
.end method

.method private final e(LWb/e$c;)Ljava/lang/String;
    .locals 1

    sget-object v0, LWb/e$a$a;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "cellular"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "wifi"

    :goto_0
    return-object p1
.end method

.method private final f(LWb/e$d;)Ljava/lang/String;
    .locals 1

    sget-object v0, LWb/e$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "floorplan"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "signal"

    :goto_0
    return-object p1
.end method
