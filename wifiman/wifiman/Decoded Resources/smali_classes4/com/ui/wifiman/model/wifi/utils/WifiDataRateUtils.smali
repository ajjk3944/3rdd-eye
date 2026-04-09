.class public final Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$IeeeModeUnsupportedException;,
        Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->a:Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(LS8/a;)F
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const v0, 0x3f4ccccd    # 0.8f

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$IeeeModeUnsupportedException;

    invoke-direct {p1}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$IeeeModeUnsupportedException;-><init>()V

    throw p1

    :pswitch_1
    const v0, 0x3ecccccd    # 0.4f

    :pswitch_2
    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private final c(LS8/a;LS8/d;)F
    .locals 4

    sget-object v0, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/high16 v0, 0x44750000    # 980.0f

    const/high16 v1, 0x436a0000    # 234.0f

    const/high16 v2, 0x44f50000    # 1960.0f

    const/high16 v3, 0x43ea0000    # 468.0f

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$IeeeModeUnsupportedException;

    invoke-direct {p1}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$IeeeModeUnsupportedException;-><init>()V

    throw p1

    :pswitch_1
    sget-object p1, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    packed-switch p1, :pswitch_data_1

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_2
    const/high16 v0, 0x45750000    # 3920.0f

    goto :goto_0

    :pswitch_3
    move v0, v2

    goto :goto_0

    :pswitch_4
    move v0, v3

    goto :goto_0

    :pswitch_5
    move v0, v1

    goto :goto_0

    :pswitch_6
    sget-object p1, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    packed-switch p1, :pswitch_data_2

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_7
    sget-object p1, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    packed-switch p1, :pswitch_data_3

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_8
    const/high16 v0, 0x42d80000    # 108.0f

    goto :goto_0

    :pswitch_9
    const/high16 v0, 0x42500000    # 52.0f

    :goto_0
    :pswitch_a
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method private final d(LS8/a;)F
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const v0, 0x414ccccd    # 12.8f

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$IeeeModeUnsupportedException;

    invoke-direct {p1}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$IeeeModeUnsupportedException;-><init>()V

    throw p1

    :pswitch_1
    const v0, 0x404ccccd    # 3.2f

    :pswitch_2
    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b(LS8/a;Lcom/ubnt/usurvey/wifi/WifiMcs;LS8/d;)LW7/a;
    .locals 1

    const-string v0, "phyMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mcs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelWidth"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p3}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->c(LS8/a;LS8/d;)F

    move-result p3

    invoke-virtual {p2}, Lcom/ubnt/usurvey/wifi/WifiMcs;->b()Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->getNcb()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr p3, v0

    invoke-virtual {p2}, Lcom/ubnt/usurvey/wifi/WifiMcs;->a()Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->getR()F

    move-result v0

    mul-float/2addr p3, v0

    invoke-virtual {p2}, Lcom/ubnt/usurvey/wifi/WifiMcs;->c()I

    move-result p2

    int-to-float p2, p2

    mul-float/2addr p3, p2

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->d(LS8/a;)F

    move-result p2

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->a(LS8/a;)F

    move-result p1

    add-float/2addr p2, p1

    div-float/2addr p3, p2

    sget-object p1, LW7/a;->b:LW7/a$a;

    invoke-virtual {p1, p3}, LW7/a$a;->c(F)LW7/a;

    move-result-object p1

    return-object p1
.end method
