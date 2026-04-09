.class final enum Lcom/ubnt/usurvey/ui/signal/strength/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/usurvey/ui/signal/strength/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ubnt/usurvey/ui/signal/strength/b$a;

.field public static final enum LATENCY:Lcom/ubnt/usurvey/ui/signal/strength/b$a;

.field public static final enum SIGNAL:Lcom/ubnt/usurvey/ui/signal/strength/b$a;


# direct methods
.method private static final synthetic $values()[Lcom/ubnt/usurvey/ui/signal/strength/b$a;
    .locals 2

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->SIGNAL:Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->LATENCY:Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    filled-new-array {v0, v1}, [Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    const-string/jumbo v1, "SIGNAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ubnt/usurvey/ui/signal/strength/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->SIGNAL:Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    const-string/jumbo v1, "LATENCY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ubnt/usurvey/ui/signal/strength/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->LATENCY:Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    invoke-static {}, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->$values()[Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->$VALUES:[Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ubnt/usurvey/ui/signal/strength/b$a;
    .locals 1

    const-class v0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    return-object p0
.end method

.method public static values()[Lcom/ubnt/usurvey/ui/signal/strength/b$a;
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->$VALUES:[Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    return-object v0
.end method
