.class public final enum LI7/Q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LI7/Q;

.field public static final enum CONNECTED:LI7/Q;

.field public static final enum LOOSING:LI7/Q;

.field public static final enum LOST:LI7/Q;


# direct methods
.method private static final synthetic $values()[LI7/Q;
    .locals 3

    sget-object v0, LI7/Q;->CONNECTED:LI7/Q;

    sget-object v1, LI7/Q;->LOOSING:LI7/Q;

    sget-object v2, LI7/Q;->LOST:LI7/Q;

    filled-new-array {v0, v1, v2}, [LI7/Q;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LI7/Q;

    const-string v1, "CONNECTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LI7/Q;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI7/Q;->CONNECTED:LI7/Q;

    new-instance v0, LI7/Q;

    const-string/jumbo v1, "LOOSING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LI7/Q;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI7/Q;->LOOSING:LI7/Q;

    new-instance v0, LI7/Q;

    const-string/jumbo v1, "LOST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LI7/Q;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI7/Q;->LOST:LI7/Q;

    invoke-static {}, LI7/Q;->$values()[LI7/Q;

    move-result-object v0

    sput-object v0, LI7/Q;->$VALUES:[LI7/Q;

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

.method public static valueOf(Ljava/lang/String;)LI7/Q;
    .locals 1

    const-class v0, LI7/Q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LI7/Q;

    return-object p0
.end method

.method public static values()[LI7/Q;
    .locals 1

    sget-object v0, LI7/Q;->$VALUES:[LI7/Q;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LI7/Q;

    return-object v0
.end method
