.class public final enum Le8/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Le8/a;

.field public static final enum ACCESS:Le8/a;

.field public static final enum AMPLIFI:Le8/a;

.field public static final enum CONNECT:Le8/a;

.field public static final enum NETWORK:Le8/a;

.field public static final enum PLAY:Le8/a;

.field public static final enum PROTECT:Le8/a;

.field public static final enum UISP:Le8/a;

.field public static final enum WIFIMAN:Le8/a;


# instance fields
.field private final appName:Ljava/lang/String;

.field private final packageName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Le8/a;
    .locals 8

    sget-object v0, Le8/a;->WIFIMAN:Le8/a;

    sget-object v1, Le8/a;->UISP:Le8/a;

    sget-object v2, Le8/a;->NETWORK:Le8/a;

    sget-object v3, Le8/a;->PROTECT:Le8/a;

    sget-object v4, Le8/a;->CONNECT:Le8/a;

    sget-object v5, Le8/a;->ACCESS:Le8/a;

    sget-object v6, Le8/a;->AMPLIFI:Le8/a;

    sget-object v7, Le8/a;->PLAY:Le8/a;

    filled-new-array/range {v0 .. v7}, [Le8/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Le8/a;

    const-string/jumbo v1, "com.ubnt.usurvey"

    const-string/jumbo v2, "WiFiman"

    const-string/jumbo v3, "WIFIMAN"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Le8/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Le8/a;->WIFIMAN:Le8/a;

    new-instance v0, Le8/a;

    const-string/jumbo v1, "com.ubnt.umobile"

    const-string/jumbo v2, "UISP Mobile"

    const-string/jumbo v3, "UISP"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Le8/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Le8/a;->UISP:Le8/a;

    new-instance v0, Le8/a;

    const-string/jumbo v1, "com.ubnt.easyunifi"

    const-string/jumbo v2, "UniFi Network"

    const-string/jumbo v3, "NETWORK"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Le8/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Le8/a;->NETWORK:Le8/a;

    new-instance v0, Le8/a;

    const-string/jumbo v1, "com.ubnt.unifi.protect"

    const-string/jumbo v2, "UniFi Protect"

    const-string/jumbo v3, "PROTECT"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Le8/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Le8/a;->PROTECT:Le8/a;

    new-instance v0, Le8/a;

    const-string/jumbo v1, "com.ui.unifi.connect.app"

    const-string/jumbo v2, "UniFi Connect"

    const-string v3, "CONNECT"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1, v2}, Le8/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Le8/a;->CONNECT:Le8/a;

    new-instance v0, Le8/a;

    const-string/jumbo v1, "com.ui.access.app"

    const-string/jumbo v2, "UniFi Access"

    const-string v3, "ACCESS"

    const/4 v4, 0x5

    invoke-direct {v0, v3, v4, v1, v2}, Le8/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Le8/a;->ACCESS:Le8/a;

    new-instance v0, Le8/a;

    const-string/jumbo v1, "com.ubnt.unifihome"

    const-string v2, "AmpliFi WiFi"

    const-string v3, "AMPLIFI"

    const/4 v4, 0x6

    invoke-direct {v0, v3, v4, v1, v2}, Le8/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Le8/a;->AMPLIFI:Le8/a;

    new-instance v0, Le8/a;

    const-string/jumbo v1, "com.ui.unifi.play"

    const-string/jumbo v2, "UniFi Play"

    const-string/jumbo v3, "PLAY"

    const/4 v4, 0x7

    invoke-direct {v0, v3, v4, v1, v2}, Le8/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Le8/a;->PLAY:Le8/a;

    invoke-static {}, Le8/a;->$values()[Le8/a;

    move-result-object v0

    sput-object v0, Le8/a;->$VALUES:[Le8/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Le8/a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Le8/a;->packageName:Ljava/lang/String;

    iput-object p4, p0, Le8/a;->appName:Ljava/lang/String;

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

    sget-object v0, Le8/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Le8/a;
    .locals 1

    const-class v0, Le8/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le8/a;

    return-object p0
.end method

.method public static values()[Le8/a;
    .locals 1

    sget-object v0, Le8/a;->$VALUES:[Le8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le8/a;

    return-object v0
.end method


# virtual methods
.method public final getAppName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le8/a;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le8/a;->packageName:Ljava/lang/String;

    return-object v0
.end method
