.class public abstract LT8/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT8/a$d$a;,
        LT8/a$d$b;,
        LT8/a$d$c;,
        LT8/a$d$d;,
        LT8/a$d$e;
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
    invoke-direct {p0}, LT8/a$d;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    instance-of v0, p0, LT8/a$d$b;

    if-eqz v0, :cond_0

    const-string v0, "BTLE State [ Bluetooth Adapter Unavailable ]"

    goto :goto_0

    :cond_0
    instance-of v0, p0, LT8/a$d$a;

    if-eqz v0, :cond_1

    const-string v0, "BTLE State [ Bluetooth Adapter Disabled ]"

    goto :goto_0

    :cond_1
    instance-of v0, p0, LT8/a$d$c;

    if-eqz v0, :cond_2

    const-string v0, "BTLE State [ Insufficient Permissions ]"

    goto :goto_0

    :cond_2
    instance-of v0, p0, LT8/a$d$d;

    if-eqz v0, :cond_3

    const-string v0, "BTLE State [ Location Disabled ]"

    goto :goto_0

    :cond_3
    instance-of v0, p0, LT8/a$d$e;

    if-eqz v0, :cond_4

    const-string v0, "BTLE State [ Ready ]"

    :goto_0
    return-object v0

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
