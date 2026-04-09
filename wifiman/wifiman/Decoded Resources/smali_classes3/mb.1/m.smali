.class public final enum Lmb/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
    with = Lmb/m$b;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/m$a;,
        Lmb/m$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmb/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0012\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lmb/m;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "b",
        "a",
        "NOT_READY",
        "ERROR",
        "NOT_SETUP",
        "SETTING_UP",
        "SETUP",
        "REBOOTING",
        "POWERING_OFF",
        "RESETTING_TO_DEFAULTS",
        "WILL_UPGRADE",
        "UPGRADING",
        "UPDATE_AVAILABLE",
        "UNKNOWN",
        "unificore_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lmb/m;

.field public static final Companion:Lmb/m$a;

.field public static final enum ERROR:Lmb/m;
    .annotation runtime LVi/m;
        value = "error"
    .end annotation
.end field

.field public static final enum NOT_READY:Lmb/m;
    .annotation runtime LVi/m;
        value = "notReady"
    .end annotation
.end field

.field public static final enum NOT_SETUP:Lmb/m;
    .annotation runtime LVi/m;
        value = "notSetup"
    .end annotation
.end field

.field public static final enum POWERING_OFF:Lmb/m;
    .annotation runtime LVi/m;
        value = "poweringOff"
    .end annotation
.end field

.field public static final enum REBOOTING:Lmb/m;
    .annotation runtime LVi/m;
        value = "rebooting"
    .end annotation
.end field

.field public static final enum RESETTING_TO_DEFAULTS:Lmb/m;
    .annotation runtime LVi/m;
        value = "resettingToDefaults"
    .end annotation
.end field

.field public static final enum SETTING_UP:Lmb/m;
    .annotation runtime LVi/m;
        value = "settingUp"
    .end annotation
.end field

.field public static final enum SETUP:Lmb/m;
    .annotation runtime LVi/m;
        value = "setup"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lmb/m;
    .annotation runtime LVi/m;
        value = "unknown"
    .end annotation
.end field

.field public static final enum UPDATE_AVAILABLE:Lmb/m;
    .annotation runtime LVi/m;
        value = "updateAvailable"
    .end annotation
.end field

.field public static final enum UPGRADING:Lmb/m;
    .annotation runtime LVi/m;
        value = "upgrading"
    .end annotation
.end field

.field public static final enum WILL_UPGRADE:Lmb/m;
    .annotation runtime LVi/m;
        value = "willUpgrade"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lmb/m;
    .locals 12

    sget-object v0, Lmb/m;->NOT_READY:Lmb/m;

    sget-object v1, Lmb/m;->ERROR:Lmb/m;

    sget-object v2, Lmb/m;->NOT_SETUP:Lmb/m;

    sget-object v3, Lmb/m;->SETTING_UP:Lmb/m;

    sget-object v4, Lmb/m;->SETUP:Lmb/m;

    sget-object v5, Lmb/m;->REBOOTING:Lmb/m;

    sget-object v6, Lmb/m;->POWERING_OFF:Lmb/m;

    sget-object v7, Lmb/m;->RESETTING_TO_DEFAULTS:Lmb/m;

    sget-object v8, Lmb/m;->WILL_UPGRADE:Lmb/m;

    sget-object v9, Lmb/m;->UPGRADING:Lmb/m;

    sget-object v10, Lmb/m;->UPDATE_AVAILABLE:Lmb/m;

    sget-object v11, Lmb/m;->UNKNOWN:Lmb/m;

    filled-new-array/range {v0 .. v11}, [Lmb/m;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "NOT_READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->NOT_READY:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->ERROR:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "NOT_SETUP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->NOT_SETUP:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "SETTING_UP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->SETTING_UP:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "SETUP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->SETUP:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "REBOOTING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->REBOOTING:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "POWERING_OFF"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->POWERING_OFF:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "RESETTING_TO_DEFAULTS"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->RESETTING_TO_DEFAULTS:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "WILL_UPGRADE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->WILL_UPGRADE:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "UPGRADING"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->UPGRADING:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "UPDATE_AVAILABLE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->UPDATE_AVAILABLE:Lmb/m;

    new-instance v0, Lmb/m;

    const-string/jumbo v1, "UNKNOWN"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lmb/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/m;->UNKNOWN:Lmb/m;

    invoke-static {}, Lmb/m;->$values()[Lmb/m;

    move-result-object v0

    sput-object v0, Lmb/m;->$VALUES:[Lmb/m;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lmb/m;->$ENTRIES:Lfh/a;

    new-instance v0, Lmb/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmb/m;->Companion:Lmb/m$a;

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

    sget-object v0, Lmb/m;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmb/m;
    .locals 1

    const-class v0, Lmb/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmb/m;

    return-object p0
.end method

.method public static values()[Lmb/m;
    .locals 1

    sget-object v0, Lmb/m;->$VALUES:[Lmb/m;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmb/m;

    return-object v0
.end method
