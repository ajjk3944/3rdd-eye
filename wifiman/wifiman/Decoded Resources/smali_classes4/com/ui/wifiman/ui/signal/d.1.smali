.class public final enum Lcom/ui/wifiman/ui/signal/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/ui/signal/d;

.field public static final enum FLOORPLAN:Lcom/ui/wifiman/ui/signal/d;

.field public static final enum SIGNAL:Lcom/ui/wifiman/ui/signal/d;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/ui/signal/d;
    .locals 2

    sget-object v0, Lcom/ui/wifiman/ui/signal/d;->SIGNAL:Lcom/ui/wifiman/ui/signal/d;

    sget-object v1, Lcom/ui/wifiman/ui/signal/d;->FLOORPLAN:Lcom/ui/wifiman/ui/signal/d;

    filled-new-array {v0, v1}, [Lcom/ui/wifiman/ui/signal/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/signal/d;

    const-string v1, "SIGNAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/ui/signal/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/ui/signal/d;->SIGNAL:Lcom/ui/wifiman/ui/signal/d;

    new-instance v0, Lcom/ui/wifiman/ui/signal/d;

    const-string v1, "FLOORPLAN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/ui/signal/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/ui/signal/d;->FLOORPLAN:Lcom/ui/wifiman/ui/signal/d;

    invoke-static {}, Lcom/ui/wifiman/ui/signal/d;->$values()[Lcom/ui/wifiman/ui/signal/d;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/signal/d;->$VALUES:[Lcom/ui/wifiman/ui/signal/d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/signal/d;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lcom/ui/wifiman/ui/signal/d;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/ui/signal/d;
    .locals 1

    const-class v0, Lcom/ui/wifiman/ui/signal/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/ui/signal/d;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/ui/signal/d;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/signal/d;->$VALUES:[Lcom/ui/wifiman/ui/signal/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/ui/signal/d;

    return-object v0
.end method
