.class public final enum LUc/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LUc/c;

.field public static final enum FW_GEN:LUc/c;

.field public static final enum FW_VERSION:LUc/c;

.field public static final enum HW_VERSION:LUc/c;

.field public static final enum MODEL_DESCRIPTION:LUc/c;

.field public static final enum MODEL_NAME:LUc/c;

.field public static final enum MODEL_NUMBER:LUc/c;

.field public static final enum MODEL_URL:LUc/c;

.field public static final enum NAME_DISPLAY:LUc/c;

.field public static final enum NAME_FRIENDLY:LUc/c;

.field public static final enum SERIAL_NUMBER:LUc/c;

.field public static final enum TYPE:LUc/c;

.field public static final enum UDN:LUc/c;

.field public static final enum VENDOR_NAME:LUc/c;

.field public static final enum VENDOR_URL:LUc/c;


# instance fields
.field private final keys:[Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LUc/c;
    .locals 14

    sget-object v0, LUc/c;->TYPE:LUc/c;

    sget-object v1, LUc/c;->NAME_FRIENDLY:LUc/c;

    sget-object v2, LUc/c;->VENDOR_NAME:LUc/c;

    sget-object v3, LUc/c;->VENDOR_URL:LUc/c;

    sget-object v4, LUc/c;->MODEL_NUMBER:LUc/c;

    sget-object v5, LUc/c;->MODEL_DESCRIPTION:LUc/c;

    sget-object v6, LUc/c;->MODEL_NAME:LUc/c;

    sget-object v7, LUc/c;->MODEL_URL:LUc/c;

    sget-object v8, LUc/c;->SERIAL_NUMBER:LUc/c;

    sget-object v9, LUc/c;->UDN:LUc/c;

    sget-object v10, LUc/c;->FW_VERSION:LUc/c;

    sget-object v11, LUc/c;->FW_GEN:LUc/c;

    sget-object v12, LUc/c;->HW_VERSION:LUc/c;

    sget-object v13, LUc/c;->NAME_DISPLAY:LUc/c;

    filled-new-array/range {v0 .. v13}, [LUc/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LUc/c;

    const-string v1, "deviceType"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "TYPE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->TYPE:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "friendlyName"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "NAME_FRIENDLY"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->NAME_FRIENDLY:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "manufacturer"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "VENDOR_NAME"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->VENDOR_NAME:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "manufacturerURL"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "VENDOR_URL"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->VENDOR_URL:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "modelNumber"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "MODEL_NUMBER"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->MODEL_NUMBER:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "modelDescription"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "MODEL_DESCRIPTION"

    const/4 v3, 0x5

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->MODEL_DESCRIPTION:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "modelName"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "MODEL_NAME"

    const/4 v3, 0x6

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->MODEL_NAME:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "modelURL"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "MODEL_URL"

    const/4 v3, 0x7

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->MODEL_URL:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "serialNumber"

    const-string v2, "serialNum"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "SERIAL_NUMBER"

    const/16 v3, 0x8

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->SERIAL_NUMBER:LUc/c;

    new-instance v0, LUc/c;

    const/16 v1, 0x9

    const-string v2, "UDN"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->UDN:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "softwareVersion"

    const-string v2, "swVersion"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "FW_VERSION"

    const/16 v3, 0xa

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->FW_VERSION:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "swGen"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "FW_GEN"

    const/16 v3, 0xb

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->FW_GEN:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "hardwareVersion"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "HW_VERSION"

    const/16 v3, 0xc

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->HW_VERSION:LUc/c;

    new-instance v0, LUc/c;

    const-string v1, "displayName"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "NAME_DISPLAY"

    const/16 v3, 0xd

    invoke-direct {v0, v2, v3, v1}, LUc/c;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/c;->NAME_DISPLAY:LUc/c;

    invoke-static {}, LUc/c;->$values()[LUc/c;

    move-result-object v0

    sput-object v0, LUc/c;->$VALUES:[LUc/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LUc/c;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LUc/c;->keys:[Ljava/lang/String;

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

    sget-object v0, LUc/c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LUc/c;
    .locals 1

    const-class v0, LUc/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUc/c;

    return-object p0
.end method

.method public static values()[LUc/c;
    .locals 1

    sget-object v0, LUc/c;->$VALUES:[LUc/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUc/c;

    return-object v0
.end method


# virtual methods
.method public final getKeys()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUc/c;->keys:[Ljava/lang/String;

    return-object v0
.end method
