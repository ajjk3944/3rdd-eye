.class public final enum Lcom/ui/wmw/api/v1/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wmw/api/v1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wmw/api/v1/a$a;

.field public static final enum BLUETOOTH:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum DEVICE:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum DEVICE_LOCATE:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum DEVICE_REBOOT:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum DEVICE_RESET:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum FIRMWARE:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum FIRMWARE_UPLOAD_ABORT:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum FIRMWARE_UPLOAD_DATA:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum FIRMWARE_UPLOAD_START:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum SETTINGS:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum SETTINGS_HW_RESET:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum SETTINGS_LED:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum SETTINGS_NAME:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum SETTINGS_STATISTICS_INTERVAL:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum STATISTICS:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum STATISTICS_PERIODIC:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum WIFI_PRIORITY_CHANNELS:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum WIFI_SCAN_DONE:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum WIFI_SCAN_RESULT:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum WIFI_SCAN_START:Lcom/ui/wmw/api/v1/a$a;

.field public static final enum WIFI_SCAN_STOP:Lcom/ui/wmw/api/v1/a$a;


# instance fields
.field private final path:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wmw/api/v1/a$a;
    .locals 21

    sget-object v0, Lcom/ui/wmw/api/v1/a$a;->DEVICE:Lcom/ui/wmw/api/v1/a$a;

    sget-object v1, Lcom/ui/wmw/api/v1/a$a;->DEVICE_LOCATE:Lcom/ui/wmw/api/v1/a$a;

    sget-object v2, Lcom/ui/wmw/api/v1/a$a;->DEVICE_REBOOT:Lcom/ui/wmw/api/v1/a$a;

    sget-object v3, Lcom/ui/wmw/api/v1/a$a;->DEVICE_RESET:Lcom/ui/wmw/api/v1/a$a;

    sget-object v4, Lcom/ui/wmw/api/v1/a$a;->STATISTICS:Lcom/ui/wmw/api/v1/a$a;

    sget-object v5, Lcom/ui/wmw/api/v1/a$a;->STATISTICS_PERIODIC:Lcom/ui/wmw/api/v1/a$a;

    sget-object v6, Lcom/ui/wmw/api/v1/a$a;->SETTINGS:Lcom/ui/wmw/api/v1/a$a;

    sget-object v7, Lcom/ui/wmw/api/v1/a$a;->SETTINGS_NAME:Lcom/ui/wmw/api/v1/a$a;

    sget-object v8, Lcom/ui/wmw/api/v1/a$a;->SETTINGS_LED:Lcom/ui/wmw/api/v1/a$a;

    sget-object v9, Lcom/ui/wmw/api/v1/a$a;->SETTINGS_HW_RESET:Lcom/ui/wmw/api/v1/a$a;

    sget-object v10, Lcom/ui/wmw/api/v1/a$a;->SETTINGS_STATISTICS_INTERVAL:Lcom/ui/wmw/api/v1/a$a;

    sget-object v11, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE:Lcom/ui/wmw/api/v1/a$a;

    sget-object v12, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE_UPLOAD_START:Lcom/ui/wmw/api/v1/a$a;

    sget-object v13, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE_UPLOAD_DATA:Lcom/ui/wmw/api/v1/a$a;

    sget-object v14, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE_UPLOAD_ABORT:Lcom/ui/wmw/api/v1/a$a;

    sget-object v15, Lcom/ui/wmw/api/v1/a$a;->BLUETOOTH:Lcom/ui/wmw/api/v1/a$a;

    sget-object v16, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_START:Lcom/ui/wmw/api/v1/a$a;

    sget-object v17, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_STOP:Lcom/ui/wmw/api/v1/a$a;

    sget-object v18, Lcom/ui/wmw/api/v1/a$a;->WIFI_PRIORITY_CHANNELS:Lcom/ui/wmw/api/v1/a$a;

    sget-object v19, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_DONE:Lcom/ui/wmw/api/v1/a$a;

    sget-object v20, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_RESULT:Lcom/ui/wmw/api/v1/a$a;

    filled-new-array/range {v0 .. v20}, [Lcom/ui/wmw/api/v1/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/4 v1, 0x0

    const-string v2, ""

    const-string v3, "DEVICE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->DEVICE:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/4 v1, 0x1

    const-string v2, "/locate"

    const-string v3, "DEVICE_LOCATE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->DEVICE_LOCATE:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/4 v1, 0x2

    const-string v2, "/reboot"

    const-string v3, "DEVICE_REBOOT"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->DEVICE_REBOOT:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/4 v1, 0x3

    const-string v2, "/reset"

    const-string v3, "DEVICE_RESET"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->DEVICE_RESET:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/4 v1, 0x4

    const-string v2, "/stats"

    const-string v3, "STATISTICS"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->STATISTICS:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/4 v1, 0x5

    const-string v2, "/per_stats"

    const-string v3, "STATISTICS_PERIODIC"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->STATISTICS_PERIODIC:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/4 v1, 0x6

    const-string v2, "/settings"

    const-string v3, "SETTINGS"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->SETTINGS:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/4 v1, 0x7

    const-string v2, "/settings/name"

    const-string v3, "SETTINGS_NAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->SETTINGS_NAME:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0x8

    const-string v2, "/settings/led"

    const-string v3, "SETTINGS_LED"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->SETTINGS_LED:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0x9

    const-string v2, "/settings/hwreset"

    const-string v3, "SETTINGS_HW_RESET"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->SETTINGS_HW_RESET:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0xa

    const-string v2, "/settings/intervals"

    const-string v3, "SETTINGS_STATISTICS_INTERVAL"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->SETTINGS_STATISTICS_INTERVAL:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0xb

    const-string v2, "/fw"

    const-string v3, "FIRMWARE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0xc

    const-string v2, "/fw/start"

    const-string v3, "FIRMWARE_UPLOAD_START"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE_UPLOAD_START:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0xd

    const-string v2, "/fw/data"

    const-string v3, "FIRMWARE_UPLOAD_DATA"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE_UPLOAD_DATA:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0xe

    const-string v2, "/fw/abort"

    const-string v3, "FIRMWARE_UPLOAD_ABORT"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->FIRMWARE_UPLOAD_ABORT:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0xf

    const-string v2, "/bt"

    const-string v3, "BLUETOOTH"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->BLUETOOTH:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0x10

    const-string v2, "/wifi/trigger_scan"

    const-string v3, "WIFI_SCAN_START"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_START:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0x11

    const-string v2, "/wifi/stop_scan"

    const-string v3, "WIFI_SCAN_STOP"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_STOP:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0x12

    const-string v2, "/wifi/priority"

    const-string v3, "WIFI_PRIORITY_CHANNELS"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->WIFI_PRIORITY_CHANNELS:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0x13

    const-string v2, "/scan_done"

    const-string v3, "WIFI_SCAN_DONE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_DONE:Lcom/ui/wmw/api/v1/a$a;

    new-instance v0, Lcom/ui/wmw/api/v1/a$a;

    const/16 v1, 0x14

    const-string v2, "/wifi/get_scan_result"

    const-string v3, "WIFI_SCAN_RESULT"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wmw/api/v1/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->WIFI_SCAN_RESULT:Lcom/ui/wmw/api/v1/a$a;

    invoke-static {}, Lcom/ui/wmw/api/v1/a$a;->$values()[Lcom/ui/wmw/api/v1/a$a;

    move-result-object v0

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->$VALUES:[Lcom/ui/wmw/api/v1/a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wmw/api/v1/a$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ui/wmw/api/v1/a$a;->path:Ljava/lang/String;

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

    sget-object v0, Lcom/ui/wmw/api/v1/a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wmw/api/v1/a$a;
    .locals 1

    const-class v0, Lcom/ui/wmw/api/v1/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wmw/api/v1/a$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/wmw/api/v1/a$a;
    .locals 1

    sget-object v0, Lcom/ui/wmw/api/v1/a$a;->$VALUES:[Lcom/ui/wmw/api/v1/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wmw/api/v1/a$a;

    return-object v0
.end method


# virtual methods
.method public getPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ui/wmw/api/v1/a$a;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/a$a;->pathPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/ui/wmw/api/v1/a$a;->getPath()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected final pathPrefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/api/1.0/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
