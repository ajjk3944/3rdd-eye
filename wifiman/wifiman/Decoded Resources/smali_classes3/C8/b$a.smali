.class final enum LC8/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LC8/b$a;

.field public static final enum AP_MODEL:LC8/b$a;

.field public static final enum AP_NAME:LC8/b$a;

.field public static final enum CELLULAR_CONNECTION:LC8/b$a;

.field public static final enum CELLULAR_CONNECTION_SIM_0:LC8/b$a;

.field public static final enum CELLULAR_CONNECTION_SIM_1:LC8/b$a;

.field public static final enum CELLULAR_SIGNAL:LC8/b$a;

.field public static final enum CELLULAR_SIGNAL_SIM_0:LC8/b$a;

.field public static final enum CELLULAR_SIGNAL_SIM_1:LC8/b$a;

.field public static final enum CREATED:LC8/b$a;

.field public static final enum SIGNAL_WIFI:LC8/b$a;

.field public static final enum SSID:LC8/b$a;

.field public static final enum THROUGHPUT:LC8/b$a;

.field public static final enum WIFI_BAND:LC8/b$a;

.field public static final enum WIFI_MODE:LC8/b$a;


# instance fields
.field private final titleRes:I


# direct methods
.method private static final synthetic $values()[LC8/b$a;
    .locals 14

    sget-object v0, LC8/b$a;->SSID:LC8/b$a;

    sget-object v1, LC8/b$a;->AP_NAME:LC8/b$a;

    sget-object v2, LC8/b$a;->AP_MODEL:LC8/b$a;

    sget-object v3, LC8/b$a;->SIGNAL_WIFI:LC8/b$a;

    sget-object v4, LC8/b$a;->CELLULAR_SIGNAL:LC8/b$a;

    sget-object v5, LC8/b$a;->CELLULAR_CONNECTION:LC8/b$a;

    sget-object v6, LC8/b$a;->CELLULAR_SIGNAL_SIM_0:LC8/b$a;

    sget-object v7, LC8/b$a;->CELLULAR_CONNECTION_SIM_0:LC8/b$a;

    sget-object v8, LC8/b$a;->CELLULAR_SIGNAL_SIM_1:LC8/b$a;

    sget-object v9, LC8/b$a;->CELLULAR_CONNECTION_SIM_1:LC8/b$a;

    sget-object v10, LC8/b$a;->THROUGHPUT:LC8/b$a;

    sget-object v11, LC8/b$a;->WIFI_MODE:LC8/b$a;

    sget-object v12, LC8/b$a;->WIFI_BAND:LC8/b$a;

    sget-object v13, LC8/b$a;->CREATED:LC8/b$a;

    filled-new-array/range {v0 .. v13}, [LC8/b$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LC8/b$a;

    const/4 v1, 0x0

    const v2, 0x7f110423

    const-string/jumbo v3, "SSID"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->SSID:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/4 v1, 0x1

    const v2, 0x7f110089

    const-string v3, "AP_NAME"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->AP_NAME:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/4 v1, 0x2

    const v2, 0x7f110088

    const-string v3, "AP_MODEL"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->AP_MODEL:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/4 v1, 0x3

    const v2, 0x7f110422

    const-string/jumbo v3, "SIGNAL_WIFI"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->SIGNAL_WIFI:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/4 v1, 0x4

    const v2, 0x7f11005f

    const-string v3, "CELLULAR_SIGNAL"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->CELLULAR_SIGNAL:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/4 v1, 0x5

    const v2, 0x7f11008b

    const-string v3, "CELLULAR_CONNECTION"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->CELLULAR_CONNECTION:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/4 v1, 0x6

    const v2, 0x7f11008e

    const-string v3, "CELLULAR_SIGNAL_SIM_0"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->CELLULAR_SIGNAL_SIM_0:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/4 v1, 0x7

    const v2, 0x7f11008c

    const-string v3, "CELLULAR_CONNECTION_SIM_0"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->CELLULAR_CONNECTION_SIM_0:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/16 v1, 0x8

    const v2, 0x7f11008f

    const-string v3, "CELLULAR_SIGNAL_SIM_1"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->CELLULAR_SIGNAL_SIM_1:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/16 v1, 0x9

    const v2, 0x7f11008d

    const-string v3, "CELLULAR_CONNECTION_SIM_1"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->CELLULAR_CONNECTION_SIM_1:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/16 v1, 0xa

    const v2, 0x7f11026a

    const-string/jumbo v3, "THROUGHPUT"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->THROUGHPUT:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/16 v1, 0xb

    const v2, 0x7f1103d1

    const-string/jumbo v3, "WIFI_MODE"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->WIFI_MODE:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/16 v1, 0xc

    const v2, 0x7f1103d9

    const-string/jumbo v3, "WIFI_BAND"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->WIFI_BAND:LC8/b$a;

    new-instance v0, LC8/b$a;

    const/16 v1, 0xd

    const v2, 0x7f110264

    const-string v3, "CREATED"

    invoke-direct {v0, v3, v1, v2}, LC8/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LC8/b$a;->CREATED:LC8/b$a;

    invoke-static {}, LC8/b$a;->$values()[LC8/b$a;

    move-result-object v0

    sput-object v0, LC8/b$a;->$VALUES:[LC8/b$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LC8/b$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LC8/b$a;->titleRes:I

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

    sget-object v0, LC8/b$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LC8/b$a;
    .locals 1

    const-class v0, LC8/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LC8/b$a;

    return-object p0
.end method

.method public static values()[LC8/b$a;
    .locals 1

    sget-object v0, LC8/b$a;->$VALUES:[LC8/b$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LC8/b$a;

    return-object v0
.end method


# virtual methods
.method public final getTitleRes()I
    .locals 1

    iget v0, p0, LC8/b$a;->titleRes:I

    return v0
.end method
