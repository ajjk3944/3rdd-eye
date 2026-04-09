.class public final enum LHf/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LHf/a;

.field public static final enum APP_TO_APP_SPEEDTEST:LHf/a;

.field public static final enum BLUETOOTH_PERMISSION:LHf/a;

.field public static final enum LOCATION_PERMISSION:LHf/a;

.field public static final enum NOTIFICATION_PERMISSION:LHf/a;


# direct methods
.method private static final synthetic $values()[LHf/a;
    .locals 4

    sget-object v0, LHf/a;->LOCATION_PERMISSION:LHf/a;

    sget-object v1, LHf/a;->BLUETOOTH_PERMISSION:LHf/a;

    sget-object v2, LHf/a;->NOTIFICATION_PERMISSION:LHf/a;

    sget-object v3, LHf/a;->APP_TO_APP_SPEEDTEST:LHf/a;

    filled-new-array {v0, v1, v2, v3}, [LHf/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LHf/a;

    const-string v1, "LOCATION_PERMISSION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LHf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHf/a;->LOCATION_PERMISSION:LHf/a;

    new-instance v0, LHf/a;

    const-string v1, "BLUETOOTH_PERMISSION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LHf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHf/a;->BLUETOOTH_PERMISSION:LHf/a;

    new-instance v0, LHf/a;

    const-string v1, "NOTIFICATION_PERMISSION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LHf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHf/a;->NOTIFICATION_PERMISSION:LHf/a;

    new-instance v0, LHf/a;

    const-string v1, "APP_TO_APP_SPEEDTEST"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LHf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHf/a;->APP_TO_APP_SPEEDTEST:LHf/a;

    invoke-static {}, LHf/a;->$values()[LHf/a;

    move-result-object v0

    sput-object v0, LHf/a;->$VALUES:[LHf/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LHf/a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, LHf/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LHf/a;
    .locals 1

    const-class v0, LHf/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LHf/a;

    return-object p0
.end method

.method public static values()[LHf/a;
    .locals 1

    sget-object v0, LHf/a;->$VALUES:[LHf/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LHf/a;

    return-object v0
.end method
