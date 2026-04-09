.class public final enum LS8/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LS8/h;

.field public static final enum ACCESS_POINT:LS8/h;

.field public static final enum REPEATER:LS8/h;

.field public static final enum STATION:LS8/h;


# direct methods
.method private static final synthetic $values()[LS8/h;
    .locals 3

    sget-object v0, LS8/h;->ACCESS_POINT:LS8/h;

    sget-object v1, LS8/h;->STATION:LS8/h;

    sget-object v2, LS8/h;->REPEATER:LS8/h;

    filled-new-array {v0, v1, v2}, [LS8/h;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS8/h;

    const-string v1, "ACCESS_POINT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LS8/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/h;->ACCESS_POINT:LS8/h;

    new-instance v0, LS8/h;

    const-string/jumbo v1, "STATION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LS8/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/h;->STATION:LS8/h;

    new-instance v0, LS8/h;

    const-string/jumbo v1, "REPEATER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LS8/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/h;->REPEATER:LS8/h;

    invoke-static {}, LS8/h;->$values()[LS8/h;

    move-result-object v0

    sput-object v0, LS8/h;->$VALUES:[LS8/h;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LS8/h;->$ENTRIES:Lfh/a;

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

    sget-object v0, LS8/h;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS8/h;
    .locals 1

    const-class v0, LS8/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS8/h;

    return-object p0
.end method

.method public static values()[LS8/h;
    .locals 1

    sget-object v0, LS8/h;->$VALUES:[LS8/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS8/h;

    return-object v0
.end method
