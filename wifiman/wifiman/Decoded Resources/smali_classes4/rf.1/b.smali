.class final enum Lrf/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lrf/b;

.field public static final enum DISABLED:Lrf/b;

.field public static final enum ENABLED:Lrf/b;

.field public static final enum IDLE:Lrf/b;


# direct methods
.method private static final synthetic $values()[Lrf/b;
    .locals 3

    sget-object v0, Lrf/b;->ENABLED:Lrf/b;

    sget-object v1, Lrf/b;->DISABLED:Lrf/b;

    sget-object v2, Lrf/b;->IDLE:Lrf/b;

    filled-new-array {v0, v1, v2}, [Lrf/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrf/b;

    const-string v1, "ENABLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrf/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf/b;->ENABLED:Lrf/b;

    new-instance v0, Lrf/b;

    const-string v1, "DISABLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrf/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf/b;->DISABLED:Lrf/b;

    new-instance v0, Lrf/b;

    const-string v1, "IDLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrf/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf/b;->IDLE:Lrf/b;

    invoke-static {}, Lrf/b;->$values()[Lrf/b;

    move-result-object v0

    sput-object v0, Lrf/b;->$VALUES:[Lrf/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lrf/b;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lrf/b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrf/b;
    .locals 1

    const-class v0, Lrf/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrf/b;

    return-object p0
.end method

.method public static values()[Lrf/b;
    .locals 1

    sget-object v0, Lrf/b;->$VALUES:[Lrf/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrf/b;

    return-object v0
.end method
