.class public final enum Lcom/ubnt/mlkit/product/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/mlkit/product/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ubnt/mlkit/product/a$b;

.field public static final enum AMPLIFI:Lcom/ubnt/mlkit/product/a$b;

.field public static final enum AMPLIFI_ALIEN:Lcom/ubnt/mlkit/product/a$b;

.field public static final enum AMPLIFI_INSTANT:Lcom/ubnt/mlkit/product/a$b;

.field public static final enum AMPLIFI_MESHPOINT:Lcom/ubnt/mlkit/product/a$b;

.field public static final enum UDM:Lcom/ubnt/mlkit/product/a$b;

.field public static final enum UNIFI_AP:Lcom/ubnt/mlkit/product/a$b;

.field public static final enum UNIFI_AP_FLEX:Lcom/ubnt/mlkit/product/a$b;

.field public static final enum UNIFI_AP_INWALL:Lcom/ubnt/mlkit/product/a$b;


# instance fields
.field private final minRequiredConfidence:F


# direct methods
.method private static final synthetic $values()[Lcom/ubnt/mlkit/product/a$b;
    .locals 8

    sget-object v0, Lcom/ubnt/mlkit/product/a$b;->UNIFI_AP:Lcom/ubnt/mlkit/product/a$b;

    sget-object v1, Lcom/ubnt/mlkit/product/a$b;->UNIFI_AP_INWALL:Lcom/ubnt/mlkit/product/a$b;

    sget-object v2, Lcom/ubnt/mlkit/product/a$b;->UNIFI_AP_FLEX:Lcom/ubnt/mlkit/product/a$b;

    sget-object v3, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI:Lcom/ubnt/mlkit/product/a$b;

    sget-object v4, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI_INSTANT:Lcom/ubnt/mlkit/product/a$b;

    sget-object v5, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI_ALIEN:Lcom/ubnt/mlkit/product/a$b;

    sget-object v6, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI_MESHPOINT:Lcom/ubnt/mlkit/product/a$b;

    sget-object v7, Lcom/ubnt/mlkit/product/a$b;->UDM:Lcom/ubnt/mlkit/product/a$b;

    filled-new-array/range {v0 .. v7}, [Lcom/ubnt/mlkit/product/a$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 16

    new-instance v6, Lcom/ubnt/mlkit/product/a$b;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-string/jumbo v1, "UNIFI_AP"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ubnt/mlkit/product/a$b;-><init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/ubnt/mlkit/product/a$b;->UNIFI_AP:Lcom/ubnt/mlkit/product/a$b;

    new-instance v0, Lcom/ubnt/mlkit/product/a$b;

    const-string/jumbo v1, "UNIFI_AP_INWALL"

    const/4 v2, 0x1

    const v3, 0x3f666666    # 0.9f

    invoke-direct {v0, v1, v2, v3}, Lcom/ubnt/mlkit/product/a$b;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/ubnt/mlkit/product/a$b;->UNIFI_AP_INWALL:Lcom/ubnt/mlkit/product/a$b;

    new-instance v0, Lcom/ubnt/mlkit/product/a$b;

    const-string/jumbo v1, "UNIFI_AP_FLEX"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/ubnt/mlkit/product/a$b;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/ubnt/mlkit/product/a$b;->UNIFI_AP_FLEX:Lcom/ubnt/mlkit/product/a$b;

    new-instance v0, Lcom/ubnt/mlkit/product/a$b;

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-string v5, "AMPLIFI"

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/ubnt/mlkit/product/a$b;-><init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI:Lcom/ubnt/mlkit/product/a$b;

    new-instance v0, Lcom/ubnt/mlkit/product/a$b;

    const/4 v14, 0x1

    const/4 v15, 0x0

    const-string v11, "AMPLIFI_INSTANT"

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v15}, Lcom/ubnt/mlkit/product/a$b;-><init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI_INSTANT:Lcom/ubnt/mlkit/product/a$b;

    new-instance v0, Lcom/ubnt/mlkit/product/a$b;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v2, "AMPLIFI_ALIEN"

    const/4 v3, 0x5

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ubnt/mlkit/product/a$b;-><init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI_ALIEN:Lcom/ubnt/mlkit/product/a$b;

    new-instance v0, Lcom/ubnt/mlkit/product/a$b;

    const/4 v11, 0x1

    const/4 v12, 0x0

    const-string v8, "AMPLIFI_MESHPOINT"

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ubnt/mlkit/product/a$b;-><init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/mlkit/product/a$b;->AMPLIFI_MESHPOINT:Lcom/ubnt/mlkit/product/a$b;

    new-instance v0, Lcom/ubnt/mlkit/product/a$b;

    const-string/jumbo v2, "UDM"

    const/4 v3, 0x7

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ubnt/mlkit/product/a$b;-><init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/mlkit/product/a$b;->UDM:Lcom/ubnt/mlkit/product/a$b;

    invoke-static {}, Lcom/ubnt/mlkit/product/a$b;->$values()[Lcom/ubnt/mlkit/product/a$b;

    move-result-object v0

    sput-object v0, Lcom/ubnt/mlkit/product/a$b;->$VALUES:[Lcom/ubnt/mlkit/product/a$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ubnt/mlkit/product/a$b;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/ubnt/mlkit/product/a$b;->minRequiredConfidence:F

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const p3, 0x3f4ccccd    # 0.8f

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/ubnt/mlkit/product/a$b;-><init>(Ljava/lang/String;IF)V

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lcom/ubnt/mlkit/product/a$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ubnt/mlkit/product/a$b;
    .locals 1

    const-class v0, Lcom/ubnt/mlkit/product/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ubnt/mlkit/product/a$b;

    return-object p0
.end method

.method public static values()[Lcom/ubnt/mlkit/product/a$b;
    .locals 1

    sget-object v0, Lcom/ubnt/mlkit/product/a$b;->$VALUES:[Lcom/ubnt/mlkit/product/a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ubnt/mlkit/product/a$b;

    return-object v0
.end method


# virtual methods
.method public final getMinRequiredConfidence$ar_object_detection_release()F
    .locals 1

    iget v0, p0, Lcom/ubnt/mlkit/product/a$b;->minRequiredConfidence:F

    return v0
.end method
