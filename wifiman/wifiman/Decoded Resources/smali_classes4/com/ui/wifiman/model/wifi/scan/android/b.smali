.class public final Lcom/ui/wifiman/model/wifi/scan/android/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory;


# instance fields
.field private final a:Lme/a;

.field private final b:Lpe/a;

.field private final c:Lme/r;

.field private final d:J


# direct methods
.method public constructor <init>(Lme/a;Lpe/a;Lme/r;)V
    .locals 2

    const-string v0, "securityParser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ssidParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "beaconFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/b;->a:Lme/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/wifi/scan/android/b;->b:Lpe/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/wifi/scan/android/b;->c:Lme/r;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr p1, v0

    iput-wide p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/b;->d:J

    return-void
.end method

.method public static synthetic b(Landroid/net/wifi/MloLink;)Lh9/a;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/wifi/scan/android/b;->d(Landroid/net/wifi/MloLink;)Lh9/a;

    move-result-object p0

    return-object p0
.end method

.method private final c(Landroid/net/wifi/ScanResult;)Ljava/util/Set;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lme/n;->a(Landroid/net/wifi/ScanResult;)Ljava/util/List;

    move-result-object p1

    const-string v0, "getAffiliatedMloLinks(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p1

    new-instance v0, Lme/p;

    invoke-direct {v0}, Lme/p;-><init>()V

    invoke-static {p1, v0}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->b0(Lzi/j;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private static final d(Landroid/net/wifi/MloLink;)Lh9/a;
    .locals 1

    invoke-static {p0}, Lje/d;->a(Landroid/net/wifi/MloLink;)Landroid/net/MacAddress;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lje/e;->a(Landroid/net/MacAddress;)[B

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v0, p0}, Lh9/a$b;->d([B)Lh9/a;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private final e(Landroid/net/wifi/ScanResult;)Lh9/a;
    .locals 3

    sget-object v0, Lh9/a;->b:Lh9/a$b;

    iget-object v1, p1, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v2, "BSSID"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory$Error;

    iget-object p1, p1, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to parse BSSID from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory$Error;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final f(Landroid/net/wifi/ScanResult;)LS8/c;
    .locals 3

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    iget v1, p1, Landroid/net/wifi/ScanResult;->frequency:I

    invoke-virtual {v0, v1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a(I)LS8/c;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory$Error;

    iget p1, p1, Landroid/net/wifi/ScanResult;->frequency:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t get WiFiband from frequency \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory$Error;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final g(Landroid/net/wifi/ScanResult;LS8/c;Ljava/lang/Boolean;)LS8/d;
    .locals 2

    iget v0, p1, Landroid/net/wifi/ScanResult;->channelWidth:I

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 p2, 0x4

    if-eq v0, p2, :cond_1

    const/4 p2, 0x5

    if-eq v0, p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "UNKNOWN CHANNEL WIDTH "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".channelWidth"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x6

    const/4 p3, 0x0

    invoke-static {p1, p3, p3, p2, p3}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, LS8/d;->MHZ_20:LS8/d;

    goto :goto_0

    :cond_0
    sget-object p1, LS8/d;->MHZ_320:LS8/d;

    goto :goto_0

    :cond_1
    sget-object p1, LS8/d;->MHZ_80_80:LS8/d;

    goto :goto_0

    :cond_2
    sget-object p1, LS8/c;->GHZ_6:LS8/c;

    if-ne p2, p1, :cond_3

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, LS8/d;->MHZ_320:LS8/d;

    goto :goto_0

    :cond_3
    sget-object p1, LS8/d;->MHZ_160:LS8/d;

    goto :goto_0

    :cond_4
    sget-object p1, LS8/d;->MHZ_80:LS8/d;

    goto :goto_0

    :cond_5
    sget-object p1, LS8/d;->MHZ_40:LS8/d;

    goto :goto_0

    :cond_6
    sget-object p1, LS8/d;->MHZ_20:LS8/d;

    :goto_0
    return-object p1
.end method

.method private final h(Landroid/net/wifi/ScanResult;LS8/c;ILS8/d;)I
    .locals 2

    iget v0, p1, Landroid/net/wifi/ScanResult;->channelWidth:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, LS8/c;->GHZ_2_4:LS8/c;

    if-ne p2, v0, :cond_0

    iget p1, p1, Landroid/net/wifi/ScanResult;->frequency:I

    return p1

    :cond_0
    invoke-virtual {p2, p3, p4}, LS8/c;->getChannel(ILS8/d;)LS8/e;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LS8/e;->e()LS8/e$b;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LS8/e$b;->a()I

    move-result p1

    goto :goto_1

    :cond_1
    iget p2, p1, Landroid/net/wifi/ScanResult;->centerFreq0:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_3
    iget p1, p1, Landroid/net/wifi/ScanResult;->frequency:I

    :goto_1
    return p1
.end method

.method private final i(Landroid/net/wifi/ScanResult;LS8/c;)Ljava/lang/Integer;
    .locals 2

    iget v0, p1, Landroid/net/wifi/ScanResult;->channelWidth:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v1, LS8/c;->GHZ_2_4:LS8/c;

    if-ne p2, v1, :cond_1

    iget p2, p1, Landroid/net/wifi/ScanResult;->frequency:I

    iget p1, p1, Landroid/net/wifi/ScanResult;->centerFreq0:I

    if-ge p2, p1, :cond_0

    add-int/lit8 p1, p1, 0xa

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0xa

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p2, 0x4

    const/4 v1, 0x0

    if-ne v0, p2, :cond_2

    iget p1, p1, Landroid/net/wifi/ScanResult;->centerFreq1:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v1

    :goto_1
    return-object p1
.end method

.method private final j(Landroid/net/wifi/ScanResult;)I
    .locals 3

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    iget v1, p1, Landroid/net/wifi/ScanResult;->frequency:I

    invoke-virtual {v0, v1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->c(I)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory$Error;

    iget p1, p1, Landroid/net/wifi/ScanResult;->frequency:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to convert frequency \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\' into channel"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory$Error;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final k(Landroid/net/wifi/ScanResult;Lme/q;LS8/c;Ljava/util/Set;)LS8/a;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Lme/o;->a(Landroid/net/wifi/ScanResult;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget-object v2, LS8/a;->BE:LS8/a;

    goto :goto_0

    :pswitch_1
    sget-object v2, LS8/a;->AD:LS8/a;

    goto :goto_0

    :pswitch_2
    sget-object v2, LS8/a;->AX:LS8/a;

    goto :goto_0

    :pswitch_3
    sget-object v2, LS8/a;->AC:LS8/a;

    goto :goto_0

    :pswitch_4
    sget-object v2, LS8/a;->N:LS8/a;

    :cond_0
    :goto_0
    if-nez v2, :cond_1

    invoke-interface {p2, p3, p4}, Lme/q;->g(LS8/c;Ljava/util/Set;)LS8/a;

    move-result-object v2

    :cond_1
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final l(Landroid/net/wifi/ScanResult;)J
    .locals 6

    iget-wide v0, p0, Lcom/ui/wifiman/model/wifi/scan/android/b;->d:J

    iget-wide v2, p1, Landroid/net/wifi/ScanResult;->timestamp:J

    const/16 p1, 0x3e8

    int-to-long v4, p1

    div-long/2addr v2, v4

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final m(Landroid/net/wifi/ScanResult;)Z
    .locals 0

    invoke-virtual {p1}, Landroid/net/wifi/ScanResult;->is80211mcResponder()Z

    move-result p1

    return p1
.end method

.method private final n(Landroid/net/wifi/ScanResult;)Lke/c;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_3

    invoke-static {p1}, Lme/l;->a(Landroid/net/wifi/ScanResult;)Landroid/net/wifi/WifiSsid;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lme/m;->a(Landroid/net/wifi/WifiSsid;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/android/b;->b:Lpe/a;

    invoke-interface {v0, p1}, Lpe/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Lke/c$a;

    invoke-direct {v0, p1}, Lke/c$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    sget-object p1, Lke/c$b;->a:Lke/c$b;

    return-object p1

    :cond_2
    :goto_0
    sget-object p1, Lke/c$b;->a:Lke/c$b;

    return-object p1

    :cond_3
    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/android/b;->b:Lpe/a;

    iget-object p1, p1, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    const-string v1, "SSID"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lpe/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lke/c$a;

    invoke-direct {v0, p1}, Lke/c$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4
    sget-object p1, Lke/c$b;->a:Lke/c$b;

    return-object p1
.end method

.method private final o(Landroid/net/wifi/ScanResult;)LS8/j;
    .locals 1

    iget-object p1, p1, Landroid/net/wifi/ScanResult;->capabilities:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/android/b;->a:Lme/a;

    invoke-interface {v0, p1}, Lme/a;->a(Ljava/lang/String;)LS8/j;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final p(Landroid/net/wifi/ScanResult;)LS8/l;
    .locals 3

    sget-object v0, LS8/l;->f:LS8/l$a;

    iget v1, p1, Landroid/net/wifi/ScanResult;->level:I

    invoke-virtual {v0, v1}, LS8/l$a;->a(I)LS8/l;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory$Error;

    iget p1, p1, Landroid/net/wifi/ScanResult;->level:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to parse signal from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory$Error;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final q(Landroid/net/wifi/ScanResult;Ljava/lang/Boolean;)LS8/e;
    .locals 5

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/b;->f(Landroid/net/wifi/ScanResult;)LS8/c;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/b;->j(Landroid/net/wifi/ScanResult;)I

    move-result v1

    invoke-direct {p0, p1, v0, p2}, Lcom/ui/wifiman/model/wifi/scan/android/b;->g(Landroid/net/wifi/ScanResult;LS8/c;Ljava/lang/Boolean;)LS8/d;

    move-result-object p2

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/ui/wifiman/model/wifi/scan/android/b;->h(Landroid/net/wifi/ScanResult;LS8/c;ILS8/d;)I

    move-result v2

    invoke-direct {p0, p1, v0}, Lcom/ui/wifiman/model/wifi/scan/android/b;->i(Landroid/net/wifi/ScanResult;LS8/c;)Ljava/lang/Integer;

    move-result-object p1

    new-instance v3, LS8/e;

    if-eqz p1, :cond_0

    new-instance v4, LS8/e$b$a;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v4, p2, v2, p1}, LS8/e$b$a;-><init>(LS8/d;II)V

    goto :goto_0

    :cond_0
    new-instance v4, LS8/e$b$b;

    invoke-direct {v4, p2, v2}, LS8/e$b$b;-><init>(LS8/d;I)V

    :goto_0
    invoke-direct {v3, v0, v1, v4, p2}, LS8/e;-><init>(LS8/c;ILS8/e$b;LS8/d;)V

    return-object v3
.end method


# virtual methods
.method public a(Landroid/net/wifi/ScanResult;)Lme/k;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "scanResult"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lcom/ui/wifiman/model/wifi/scan/android/b;->c:Lme/r;

    invoke-interface {v2, v1}, Lme/r;->a(Landroid/net/wifi/ScanResult;)Lme/q;

    move-result-object v2

    invoke-interface {v2}, Lme/q;->a()Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/ui/wifiman/model/wifi/scan/android/b;->q(Landroid/net/wifi/ScanResult;Ljava/lang/Boolean;)LS8/e;

    move-result-object v3

    move-object v7, v3

    invoke-interface {v2}, Lme/q;->c()Ljava/util/Set;

    move-result-object v4

    move-object/from16 v16, v4

    invoke-virtual {v3}, LS8/e;->a()LS8/c;

    move-result-object v5

    invoke-direct {v0, v1, v2, v5, v4}, Lcom/ui/wifiman/model/wifi/scan/android/b;->k(Landroid/net/wifi/ScanResult;Lme/q;LS8/c;Ljava/util/Set;)LS8/a;

    move-result-object v4

    move-object v8, v4

    invoke-virtual {v3}, LS8/e;->a()LS8/c;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Lme/q;->e(LS8/a;LS8/c;)Ljava/util/Set;

    move-result-object v3

    move-object/from16 v17, v3

    invoke-direct/range {p0 .. p1}, Lcom/ui/wifiman/model/wifi/scan/android/b;->n(Landroid/net/wifi/ScanResult;)Lke/c;

    move-result-object v5

    invoke-direct/range {p0 .. p1}, Lcom/ui/wifiman/model/wifi/scan/android/b;->e(Landroid/net/wifi/ScanResult;)Lh9/a;

    move-result-object v6

    invoke-direct/range {p0 .. p1}, Lcom/ui/wifiman/model/wifi/scan/android/b;->p(Landroid/net/wifi/ScanResult;)LS8/l;

    move-result-object v10

    invoke-direct/range {p0 .. p1}, Lcom/ui/wifiman/model/wifi/scan/android/b;->o(Landroid/net/wifi/ScanResult;)LS8/j;

    move-result-object v9

    invoke-direct/range {p0 .. p1}, Lcom/ui/wifiman/model/wifi/scan/android/b;->l(Landroid/net/wifi/ScanResult;)J

    move-result-wide v19

    invoke-direct/range {p0 .. p1}, Lcom/ui/wifiman/model/wifi/scan/android/b;->m(Landroid/net/wifi/ScanResult;)Z

    move-result v11

    invoke-interface {v2}, Lme/q;->b()Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v2}, Lme/q;->d()Ljava/lang/Float;

    move-result-object v13

    invoke-interface {v2, v3}, Lme/q;->f(Ljava/util/Set;)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v14

    invoke-interface {v2}, Lme/q;->h()Ljava/lang/Integer;

    move-result-object v15

    invoke-direct/range {p0 .. p1}, Lcom/ui/wifiman/model/wifi/scan/android/b;->c(Landroid/net/wifi/ScanResult;)Ljava/util/Set;

    move-result-object v18

    new-instance v1, Lme/k;

    move-object v4, v1

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-direct/range {v4 .. v20}, Lme/k;-><init>(Lke/c;Lh9/a;LS8/e;LS8/a;LS8/j;LS8/l;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Float;Lcom/ubnt/usurvey/wifi/WifiMcs;Ljava/lang/Integer;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;J)V

    return-object v1
.end method
