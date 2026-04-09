.class public final enum LO7/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LO7/b;

.field public static final enum TELEPORT:LO7/b;

.field public static final enum WIFIMAN_WIZARD_FW_UPGRADE:LO7/b;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LO7/b;
    .locals 2

    sget-object v0, LO7/b;->TELEPORT:LO7/b;

    sget-object v1, LO7/b;->WIFIMAN_WIZARD_FW_UPGRADE:LO7/b;

    filled-new-array {v0, v1}, [LO7/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LO7/b;

    const/4 v1, 0x0

    const-string/jumbo v2, "teleport"

    const-string/jumbo v3, "TELEPORT"

    invoke-direct {v0, v3, v1, v2}, LO7/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/b;->TELEPORT:LO7/b;

    new-instance v0, LO7/b;

    const/4 v1, 0x1

    const-string/jumbo v2, "wizard_upgrade"

    const-string/jumbo v3, "WIFIMAN_WIZARD_FW_UPGRADE"

    invoke-direct {v0, v3, v1, v2}, LO7/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/b;->WIFIMAN_WIZARD_FW_UPGRADE:LO7/b;

    invoke-static {}, LO7/b;->$values()[LO7/b;

    move-result-object v0

    sput-object v0, LO7/b;->$VALUES:[LO7/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LO7/b;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, LO7/b;->id:Ljava/lang/String;

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

    sget-object v0, LO7/b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LO7/b;
    .locals 1

    const-class v0, LO7/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LO7/b;

    return-object p0
.end method

.method public static values()[LO7/b;
    .locals 1

    sget-object v0, LO7/b;->$VALUES:[LO7/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LO7/b;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LO7/b;->id:Ljava/lang/String;

    return-object v0
.end method
