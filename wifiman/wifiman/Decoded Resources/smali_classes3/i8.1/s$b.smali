.class final enum Li8/s$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Li8/s$b;

.field public static final enum HOME_DISCOVERY:Li8/s$b;

.field public static final enum HOME_SCAN:Li8/s$b;

.field public static final enum HOME_SIGNAL:Li8/s$b;

.field public static final enum HOME_SPEED:Li8/s$b;

.field public static final enum HOME_TELEPORT:Li8/s$b;

.field public static final enum SPEEDTEST_INTERNET:Li8/s$b;

.field public static final enum TELEPORT_CONNECT_SSO_CONSOLE:Li8/s$b;

.field public static final enum TELEPORT_INVITATION:Li8/s$b;


# instance fields
.field private final path:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Li8/s$b;
    .locals 8

    sget-object v0, Li8/s$b;->HOME_SPEED:Li8/s$b;

    sget-object v1, Li8/s$b;->HOME_SIGNAL:Li8/s$b;

    sget-object v2, Li8/s$b;->HOME_SCAN:Li8/s$b;

    sget-object v3, Li8/s$b;->HOME_DISCOVERY:Li8/s$b;

    sget-object v4, Li8/s$b;->HOME_TELEPORT:Li8/s$b;

    sget-object v5, Li8/s$b;->TELEPORT_INVITATION:Li8/s$b;

    sget-object v6, Li8/s$b;->TELEPORT_CONNECT_SSO_CONSOLE:Li8/s$b;

    sget-object v7, Li8/s$b;->SPEEDTEST_INTERNET:Li8/s$b;

    filled-new-array/range {v0 .. v7}, [Li8/s$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li8/s$b;

    const/4 v1, 0x0

    const-string v2, "/home/speed"

    const-string/jumbo v3, "HOME_SPEED"

    invoke-direct {v0, v3, v1, v2}, Li8/s$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li8/s$b;->HOME_SPEED:Li8/s$b;

    new-instance v0, Li8/s$b;

    const/4 v1, 0x1

    const-string v2, "/home/signal"

    const-string/jumbo v3, "HOME_SIGNAL"

    invoke-direct {v0, v3, v1, v2}, Li8/s$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li8/s$b;->HOME_SIGNAL:Li8/s$b;

    new-instance v0, Li8/s$b;

    const/4 v1, 0x2

    const-string v2, "/home/scan"

    const-string/jumbo v3, "HOME_SCAN"

    invoke-direct {v0, v3, v1, v2}, Li8/s$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li8/s$b;->HOME_SCAN:Li8/s$b;

    new-instance v0, Li8/s$b;

    const/4 v1, 0x3

    const-string v2, "/home/discovery"

    const-string/jumbo v3, "HOME_DISCOVERY"

    invoke-direct {v0, v3, v1, v2}, Li8/s$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li8/s$b;->HOME_DISCOVERY:Li8/s$b;

    new-instance v0, Li8/s$b;

    const/4 v1, 0x4

    const-string v2, "/home/teleport"

    const-string/jumbo v3, "HOME_TELEPORT"

    invoke-direct {v0, v3, v1, v2}, Li8/s$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li8/s$b;->HOME_TELEPORT:Li8/s$b;

    new-instance v0, Li8/s$b;

    const/4 v1, 0x5

    const-string v2, "/teleport/invitation"

    const-string/jumbo v3, "TELEPORT_INVITATION"

    invoke-direct {v0, v3, v1, v2}, Li8/s$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li8/s$b;->TELEPORT_INVITATION:Li8/s$b;

    new-instance v0, Li8/s$b;

    const/4 v1, 0x6

    const-string v2, "/teleport/connect"

    const-string/jumbo v3, "TELEPORT_CONNECT_SSO_CONSOLE"

    invoke-direct {v0, v3, v1, v2}, Li8/s$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li8/s$b;->TELEPORT_CONNECT_SSO_CONSOLE:Li8/s$b;

    new-instance v0, Li8/s$b;

    const/4 v1, 0x7

    const-string v2, "/speed/internet"

    const-string/jumbo v3, "SPEEDTEST_INTERNET"

    invoke-direct {v0, v3, v1, v2}, Li8/s$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li8/s$b;->SPEEDTEST_INTERNET:Li8/s$b;

    invoke-static {}, Li8/s$b;->$values()[Li8/s$b;

    move-result-object v0

    sput-object v0, Li8/s$b;->$VALUES:[Li8/s$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Li8/s$b;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, Li8/s$b;->path:Ljava/lang/String;

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

    sget-object v0, Li8/s$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li8/s$b;
    .locals 1

    const-class v0, Li8/s$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li8/s$b;

    return-object p0
.end method

.method public static values()[Li8/s$b;
    .locals 1

    sget-object v0, Li8/s$b;->$VALUES:[Li8/s$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li8/s$b;

    return-object v0
.end method


# virtual methods
.method public final getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li8/s$b;->path:Ljava/lang/String;

    return-object v0
.end method
