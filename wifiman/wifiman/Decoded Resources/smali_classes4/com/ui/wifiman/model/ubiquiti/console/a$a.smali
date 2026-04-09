.class final enum Lcom/ui/wifiman/model/ubiquiti/console/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/console/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/ubiquiti/console/a$a;

.field public static final enum DISABLED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

.field public static final enum ENABLED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

.field public static final enum ENABLED_NETWORK_VERSION_UNSUPPORTED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

.field public static final enum ENABLED_PERMISSIONS_DENIED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

.field public static final enum UNSUPPORTED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/ubiquiti/console/a$a;
    .locals 5

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->UNSUPPORTED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->DISABLED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    sget-object v2, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->ENABLED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    sget-object v3, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->ENABLED_NETWORK_VERSION_UNSUPPORTED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    sget-object v4, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->ENABLED_PERMISSIONS_DENIED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    const/4 v1, 0x0

    const-string v2, "unsupported"

    const-string v3, "UNSUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/console/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->UNSUPPORTED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    const/4 v1, 0x1

    const-string v2, "disabled"

    const-string v3, "DISABLED"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/console/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->DISABLED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    const/4 v1, 0x2

    const-string v2, "enabled"

    const-string v3, "ENABLED"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/console/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->ENABLED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    const/4 v1, 0x3

    const-string v2, "networkVersion"

    const-string v3, "ENABLED_NETWORK_VERSION_UNSUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/console/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->ENABLED_NETWORK_VERSION_UNSUPPORTED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    const/4 v1, 0x4

    const-string v2, "insufficient_permission"

    const-string v3, "ENABLED_PERMISSIONS_DENIED"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/console/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->ENABLED_PERMISSIONS_DENIED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    invoke-static {}, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->$values()[Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->$VALUES:[Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->id:Ljava/lang/String;

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

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/a$a;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/ubiquiti/console/a$a;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->$VALUES:[Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->id:Ljava/lang/String;

    return-object v0
.end method
