.class public final LT7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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
    invoke-direct {p0}, LT7/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Locale;)LT7/c;
    .locals 2

    const-string/jumbo v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x986

    if-eq v0, v1, :cond_2

    const/16 v1, 0x9a0

    if-eq v0, v1, :cond_1

    const/16 v1, 0xa9e

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const-string/jumbo v0, "US"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_1
    const-string/jumbo v0, "MM"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    const-string/jumbo v0, "LR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    sget-object p1, LT7/c;->IMPERIAL:LT7/c;

    return-object p1

    :cond_4
    :goto_1
    sget-object p1, LT7/c;->METRIC:LT7/c;

    return-object p1
.end method
