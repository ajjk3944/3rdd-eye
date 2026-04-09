.class public final Lcom/ubnt/usurvey/wifi/WifiMcs$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/usurvey/wifi/WifiMcs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
    invoke-direct {p0}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;-><init>()V

    return-void
.end method

.method private final a(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->BPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    if-ne p1, v0, :cond_1

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;

    invoke-direct {v0, p1, p2}, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;-><init>(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V

    throw v0

    :cond_1
    :goto_0
    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    if-ne p1, v0, :cond_3

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-eq p2, v0, :cond_3

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-ne p2, v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;

    invoke-direct {v0, p1, p2}, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;-><init>(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V

    throw v0

    :cond_3
    :goto_1
    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_16:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    if-ne p1, v0, :cond_5

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-eq p2, v0, :cond_5

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-ne p2, v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;

    invoke-direct {v0, p1, p2}, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;-><init>(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V

    throw v0

    :cond_5
    :goto_2
    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_64:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    if-ne p1, v0, :cond_7

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_2_3:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-eq p2, v0, :cond_7

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-eq p2, v0, :cond_7

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-ne p2, v0, :cond_6

    goto :goto_3

    :cond_6
    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;

    invoke-direct {v0, p1, p2}, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;-><init>(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V

    throw v0

    :cond_7
    :goto_3
    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_256:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    if-ne p1, v0, :cond_9

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-eq p2, v0, :cond_9

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-ne p2, v0, :cond_8

    goto :goto_4

    :cond_8
    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;

    invoke-direct {v0, p1, p2}, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;-><init>(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V

    throw v0

    :cond_9
    :goto_4
    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_1024:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    if-ne p1, v0, :cond_b

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-eq p2, v0, :cond_b

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-ne p2, v0, :cond_a

    goto :goto_5

    :cond_a
    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;

    invoke-direct {v0, p1, p2}, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;-><init>(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V

    throw v0

    :cond_b
    :goto_5
    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_4096:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    if-ne p1, v0, :cond_d

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-eq p2, v0, :cond_d

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-ne p2, v0, :cond_c

    goto :goto_6

    :cond_c
    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;

    invoke-direct {v0, p1, p2}, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;-><init>(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V

    throw v0

    :cond_d
    :goto_6
    return-void
.end method


# virtual methods
.method public final b(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 1

    const-string/jumbo v0, "modulation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "coding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;->a(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs;

    invoke-direct {v0, p1, p2, p3}, Lcom/ubnt/usurvey/wifi/WifiMcs;-><init>(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)V

    return-object v0
.end method
