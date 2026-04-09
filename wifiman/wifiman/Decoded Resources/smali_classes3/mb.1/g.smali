.class public final enum Lmb/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
    with = Lmb/g$b;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/g$a;,
        Lmb/g$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmb/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0015\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lmb/g;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "b",
        "a",
        "INSTALL_PENDING",
        "INSTALLING",
        "INSTALLED",
        "UNINSTALL_PENDING",
        "UNINSTALLING",
        "UNINSTALLED",
        "UPDATE_PENDING",
        "UPDATING",
        "UPDATE_FAILED",
        "START_PENDING",
        "STARTING",
        "STOP_PENDING",
        "STOPPING",
        "DOWNLOADED",
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

.field private static final synthetic $VALUES:[Lmb/g;

.field public static final Companion:Lmb/g$a;

.field public static final enum DOWNLOADED:Lmb/g;
    .annotation runtime LVi/m;
        value = "downloaded"
    .end annotation
.end field

.field public static final enum INSTALLED:Lmb/g;
    .annotation runtime LVi/m;
        value = "installed"
    .end annotation
.end field

.field public static final enum INSTALLING:Lmb/g;
    .annotation runtime LVi/m;
        value = "installing"
    .end annotation
.end field

.field public static final enum INSTALL_PENDING:Lmb/g;
    .annotation runtime LVi/m;
        value = "installPending"
    .end annotation
.end field

.field public static final enum STARTING:Lmb/g;
    .annotation runtime LVi/m;
        value = "starting"
    .end annotation
.end field

.field public static final enum START_PENDING:Lmb/g;
    .annotation runtime LVi/m;
        value = "startPending"
    .end annotation
.end field

.field public static final enum STOPPING:Lmb/g;
    .annotation runtime LVi/m;
        value = "stopping"
    .end annotation
.end field

.field public static final enum STOP_PENDING:Lmb/g;
    .annotation runtime LVi/m;
        value = "stopPending"
    .end annotation
.end field

.field public static final enum UNINSTALLED:Lmb/g;
    .annotation runtime LVi/m;
        value = "uninstalled"
    .end annotation
.end field

.field public static final enum UNINSTALLING:Lmb/g;
    .annotation runtime LVi/m;
        value = "uninstalling"
    .end annotation
.end field

.field public static final enum UNINSTALL_PENDING:Lmb/g;
    .annotation runtime LVi/m;
        value = "uninstallPending"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lmb/g;
    .annotation runtime LVi/m;
        value = "unknown"
    .end annotation
.end field

.field public static final enum UPDATE_FAILED:Lmb/g;
    .annotation runtime LVi/m;
        value = "updateFailed"
    .end annotation
.end field

.field public static final enum UPDATE_PENDING:Lmb/g;
    .annotation runtime LVi/m;
        value = "updatePending"
    .end annotation
.end field

.field public static final enum UPDATING:Lmb/g;
    .annotation runtime LVi/m;
        value = "updating"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lmb/g;
    .locals 15

    sget-object v0, Lmb/g;->INSTALL_PENDING:Lmb/g;

    sget-object v1, Lmb/g;->INSTALLING:Lmb/g;

    sget-object v2, Lmb/g;->INSTALLED:Lmb/g;

    sget-object v3, Lmb/g;->UNINSTALL_PENDING:Lmb/g;

    sget-object v4, Lmb/g;->UNINSTALLING:Lmb/g;

    sget-object v5, Lmb/g;->UNINSTALLED:Lmb/g;

    sget-object v6, Lmb/g;->UPDATE_PENDING:Lmb/g;

    sget-object v7, Lmb/g;->UPDATING:Lmb/g;

    sget-object v8, Lmb/g;->UPDATE_FAILED:Lmb/g;

    sget-object v9, Lmb/g;->START_PENDING:Lmb/g;

    sget-object v10, Lmb/g;->STARTING:Lmb/g;

    sget-object v11, Lmb/g;->STOP_PENDING:Lmb/g;

    sget-object v12, Lmb/g;->STOPPING:Lmb/g;

    sget-object v13, Lmb/g;->DOWNLOADED:Lmb/g;

    sget-object v14, Lmb/g;->UNKNOWN:Lmb/g;

    filled-new-array/range {v0 .. v14}, [Lmb/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "INSTALL_PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->INSTALL_PENDING:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "INSTALLING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->INSTALLING:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "INSTALLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->INSTALLED:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "UNINSTALL_PENDING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->UNINSTALL_PENDING:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "UNINSTALLING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->UNINSTALLING:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "UNINSTALLED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->UNINSTALLED:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "UPDATE_PENDING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->UPDATE_PENDING:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "UPDATING"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->UPDATING:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "UPDATE_FAILED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->UPDATE_FAILED:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "START_PENDING"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->START_PENDING:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "STARTING"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->STARTING:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "STOP_PENDING"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->STOP_PENDING:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "STOPPING"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->STOPPING:Lmb/g;

    new-instance v0, Lmb/g;

    const-string v1, "DOWNLOADED"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->DOWNLOADED:Lmb/g;

    new-instance v0, Lmb/g;

    const-string/jumbo v1, "UNKNOWN"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lmb/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/g;->UNKNOWN:Lmb/g;

    invoke-static {}, Lmb/g;->$values()[Lmb/g;

    move-result-object v0

    sput-object v0, Lmb/g;->$VALUES:[Lmb/g;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lmb/g;->$ENTRIES:Lfh/a;

    new-instance v0, Lmb/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmb/g;->Companion:Lmb/g$a;

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

    sget-object v0, Lmb/g;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmb/g;
    .locals 1

    const-class v0, Lmb/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmb/g;

    return-object p0
.end method

.method public static values()[Lmb/g;
    .locals 1

    sget-object v0, Lmb/g;->$VALUES:[Lmb/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmb/g;

    return-object v0
.end method
