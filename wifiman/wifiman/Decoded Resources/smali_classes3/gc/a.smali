.class public final enum Lgc/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lgc/a;

.field public static final enum FLOORPLAN:Lgc/a;

.field public static final enum SIGNAL:Lgc/a;


# direct methods
.method private static final synthetic $values()[Lgc/a;
    .locals 2

    sget-object v0, Lgc/a;->SIGNAL:Lgc/a;

    sget-object v1, Lgc/a;->FLOORPLAN:Lgc/a;

    filled-new-array {v0, v1}, [Lgc/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgc/a;

    const-string/jumbo v1, "SIGNAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgc/a;->SIGNAL:Lgc/a;

    new-instance v0, Lgc/a;

    const-string/jumbo v1, "FLOORPLAN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lgc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgc/a;->FLOORPLAN:Lgc/a;

    invoke-static {}, Lgc/a;->$values()[Lgc/a;

    move-result-object v0

    sput-object v0, Lgc/a;->$VALUES:[Lgc/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lgc/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lgc/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgc/a;
    .locals 1

    const-class v0, Lgc/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgc/a;

    return-object p0
.end method

.method public static values()[Lgc/a;
    .locals 1

    sget-object v0, Lgc/a;->$VALUES:[Lgc/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgc/a;

    return-object v0
.end method
