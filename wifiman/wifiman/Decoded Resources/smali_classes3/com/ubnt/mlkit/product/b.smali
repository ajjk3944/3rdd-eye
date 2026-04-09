.class public final Lcom/ubnt/mlkit/product/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/mlkit/product/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lcom/ubnt/mlkit/product/a$b;F)Z
    .locals 0

    invoke-virtual {p1}, Lcom/ubnt/mlkit/product/a$b;->getMinRequiredConfidence$ar_object_detection_release()F

    move-result p1

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public a(Ljava/lang/String;F)Lcom/ubnt/mlkit/product/a$b;
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string/jumbo v0, "amplifi_alien"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI_ALIEN:Lcom/ubnt/mlkit/product/a$b;

    goto :goto_1

    :sswitch_1
    const-string/jumbo v0, "uap_flex"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/ubnt/mlkit/product/a$b;->UNIFI_AP_FLEX:Lcom/ubnt/mlkit/product/a$b;

    goto :goto_1

    :sswitch_2
    const-string/jumbo v0, "amplifi_mesh"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI_MESHPOINT:Lcom/ubnt/mlkit/product/a$b;

    goto :goto_1

    :sswitch_3
    const-string/jumbo v0, "amplifi_instant"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI_INSTANT:Lcom/ubnt/mlkit/product/a$b;

    goto :goto_1

    :sswitch_4
    const-string/jumbo v0, "udm"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/ubnt/mlkit/product/a$b;->UDM:Lcom/ubnt/mlkit/product/a$b;

    goto :goto_1

    :sswitch_5
    const-string/jumbo v0, "uap"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget-object p1, Lcom/ubnt/mlkit/product/a$b;->UNIFI_AP:Lcom/ubnt/mlkit/product/a$b;

    goto :goto_1

    :sswitch_6
    const-string/jumbo v0, "amplifi"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    sget-object p1, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI:Lcom/ubnt/mlkit/product/a$b;

    goto :goto_1

    :sswitch_7
    const-string/jumbo v0, "uap_inwall"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    move-object p1, v1

    goto :goto_1

    :cond_7
    sget-object p1, Lcom/ubnt/mlkit/product/a$b;->UNIFI_AP_INWALL:Lcom/ubnt/mlkit/product/a$b;

    :goto_1
    if-eqz p1, :cond_8

    invoke-direct {p0, p1, p2}, Lcom/ubnt/mlkit/product/b;->b(Lcom/ubnt/mlkit/product/a$b;F)Z

    move-result p2

    if-eqz p2, :cond_8

    move-object v1, p1

    :cond_8
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x5f1b1a56 -> :sswitch_7
        -0x3466593c -> :sswitch_6
        0x1c364 -> :sswitch_5
        0x1c3be -> :sswitch_4
        0x8366f66 -> :sswitch_3
        0x2461c288 -> :sswitch_2
        0x49af73f4 -> :sswitch_1
        0x67307d8c -> :sswitch_0
    .end sparse-switch
.end method
