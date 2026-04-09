.class public abstract Lcom/ui/wifiman/model/speedtest/Speedtest$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/Speedtest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;,
        Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;,
        Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;
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
    invoke-direct {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    instance-of v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;->c()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_1
    instance-of v0, p0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method
