.class public final enum LO7/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LO7/c;

.field public static final enum TELEPORT:LO7/c;

.field public static final enum WIFIMAN_WIZARD_FW_UPGRADE:LO7/c;


# instance fields
.field private final id:I


# direct methods
.method private static final synthetic $values()[LO7/c;
    .locals 2

    sget-object v0, LO7/c;->TELEPORT:LO7/c;

    sget-object v1, LO7/c;->WIFIMAN_WIZARD_FW_UPGRADE:LO7/c;

    filled-new-array {v0, v1}, [LO7/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LO7/c;

    const-string/jumbo v1, "TELEPORT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, LO7/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LO7/c;->TELEPORT:LO7/c;

    new-instance v0, LO7/c;

    const-string/jumbo v1, "WIFIMAN_WIZARD_FW_UPGRADE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, LO7/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LO7/c;->WIFIMAN_WIZARD_FW_UPGRADE:LO7/c;

    invoke-static {}, LO7/c;->$values()[LO7/c;

    move-result-object v0

    sput-object v0, LO7/c;->$VALUES:[LO7/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LO7/c;->$ENTRIES:Lfh/a;

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

    iput p3, p0, LO7/c;->id:I

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

    sget-object v0, LO7/c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LO7/c;
    .locals 1

    const-class v0, LO7/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LO7/c;

    return-object p0
.end method

.method public static values()[LO7/c;
    .locals 1

    sget-object v0, LO7/c;->$VALUES:[LO7/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LO7/c;

    return-object v0
.end method


# virtual methods
.method public final getId()I
    .locals 1

    iget v0, p0, LO7/c;->id:I

    return v0
.end method
