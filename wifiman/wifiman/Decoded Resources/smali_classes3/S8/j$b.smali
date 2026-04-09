.class public abstract LS8/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/j$b$a;,
        LS8/j$b$b;,
        LS8/j$b$c;,
        LS8/j$b$d;,
        LS8/j$b$e;,
        LS8/j$b$f;,
        LS8/j$b$g;,
        LS8/j$b$h;,
        LS8/j$b$i;
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
    invoke-direct {p0}, LS8/j$b;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    instance-of v0, p0, LS8/j$b$b;

    if-eqz v0, :cond_0

    const-string/jumbo v0, "Open"

    goto/16 :goto_0

    :cond_0
    instance-of v0, p0, LS8/j$b$e;

    if-eqz v0, :cond_1

    const-string/jumbo v0, "WEP"

    goto :goto_0

    :cond_1
    instance-of v0, p0, LS8/j$b$i;

    if-eqz v0, :cond_2

    const-string/jumbo v0, "WPS"

    goto :goto_0

    :cond_2
    instance-of v0, p0, LS8/j$b$a;

    if-eqz v0, :cond_3

    const-string/jumbo v0, "FILS"

    goto :goto_0

    :cond_3
    instance-of v0, p0, LS8/j$b$f$b;

    if-eqz v0, :cond_4

    const-string/jumbo v0, "WPA-PSK"

    goto :goto_0

    :cond_4
    instance-of v0, p0, LS8/j$b$f$a;

    if-eqz v0, :cond_5

    const-string/jumbo v0, "WPA-EAP"

    goto :goto_0

    :cond_5
    instance-of v0, p0, LS8/j$b$g$b;

    if-eqz v0, :cond_6

    const-string/jumbo v0, "WPA2-PSK"

    goto :goto_0

    :cond_6
    instance-of v0, p0, LS8/j$b$g$a;

    if-eqz v0, :cond_7

    const-string/jumbo v0, "WPA2-EAP"

    goto :goto_0

    :cond_7
    instance-of v0, p0, LS8/j$b$h$d;

    if-eqz v0, :cond_8

    const-string/jumbo v0, "WPA3-SAE"

    goto :goto_0

    :cond_8
    instance-of v0, p0, LS8/j$b$h$b;

    if-eqz v0, :cond_9

    const-string/jumbo v0, "WPA3-EAP"

    goto :goto_0

    :cond_9
    instance-of v0, p0, LS8/j$b$h$c;

    if-eqz v0, :cond_a

    const-string/jumbo v0, "WPA3-OWE"

    goto :goto_0

    :cond_a
    instance-of v0, p0, LS8/j$b$h$a;

    if-eqz v0, :cond_b

    const-string/jumbo v0, "WPA3-DPP"

    goto :goto_0

    :cond_b
    instance-of v0, p0, LS8/j$b$d;

    if-eqz v0, :cond_c

    const-string/jumbo v0, "WAPI"

    goto :goto_0

    :cond_c
    instance-of v0, p0, LS8/j$b$c;

    if-eqz v0, :cond_d

    const-string/jumbo v0, "OSEN"

    :goto_0
    return-object v0

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
