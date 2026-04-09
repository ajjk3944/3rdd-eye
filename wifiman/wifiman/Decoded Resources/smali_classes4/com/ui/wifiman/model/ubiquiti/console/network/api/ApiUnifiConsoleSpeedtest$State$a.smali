.class public final enum Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

.field public static final enum COMPLETED:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

.field public static final enum IN_PROGRESS:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

.field public static final enum PENDING:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;


# instance fields
.field private final id:I


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;
    .locals 3

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->PENDING:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->IN_PROGRESS:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    sget-object v2, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->COMPLETED:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    filled-new-array {v0, v1, v2}, [Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->PENDING:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    const-string v1, "IN_PROGRESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->IN_PROGRESS:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    const-string v1, "COMPLETED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->COMPLETED:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    invoke-static {}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->$values()[Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->$VALUES:[Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->$ENTRIES:Lfh/a;

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

    iput p3, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->id:I

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

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->$VALUES:[Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    return-object v0
.end method


# virtual methods
.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->id:I

    return v0
.end method
