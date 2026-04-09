.class public final LS8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/d;
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
    invoke-direct {p0}, LS8/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)LS8/d;
    .locals 1

    const/16 v0, 0x14

    if-eq p1, v0, :cond_4

    const/16 v0, 0x28

    if-eq p1, v0, :cond_3

    const/16 v0, 0x50

    if-eq p1, v0, :cond_2

    const/16 v0, 0xa0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x140

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object p1, LS8/d;->MHZ_320:LS8/d;

    goto :goto_0

    :cond_1
    sget-object p1, LS8/d;->MHZ_160:LS8/d;

    goto :goto_0

    :cond_2
    sget-object p1, LS8/d;->MHZ_80:LS8/d;

    goto :goto_0

    :cond_3
    sget-object p1, LS8/d;->MHZ_40:LS8/d;

    goto :goto_0

    :cond_4
    sget-object p1, LS8/d;->MHZ_20:LS8/d;

    :goto_0
    return-object p1
.end method
