.class public final enum Lpd/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lpd/s;

.field public static final enum APP_TO_APP:Lpd/s;

.field public static final enum CONSOLE:Lpd/s;

.field public static final enum INTERNET:Lpd/s;

.field public static final enum LOCAL:Lpd/s;


# direct methods
.method private static final synthetic $values()[Lpd/s;
    .locals 4

    sget-object v0, Lpd/s;->INTERNET:Lpd/s;

    sget-object v1, Lpd/s;->LOCAL:Lpd/s;

    sget-object v2, Lpd/s;->APP_TO_APP:Lpd/s;

    sget-object v3, Lpd/s;->CONSOLE:Lpd/s;

    filled-new-array {v0, v1, v2, v3}, [Lpd/s;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpd/s;

    const-string v1, "INTERNET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpd/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpd/s;->INTERNET:Lpd/s;

    new-instance v0, Lpd/s;

    const-string v1, "LOCAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpd/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpd/s;->LOCAL:Lpd/s;

    new-instance v0, Lpd/s;

    const-string v1, "APP_TO_APP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpd/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpd/s;->APP_TO_APP:Lpd/s;

    new-instance v0, Lpd/s;

    const-string v1, "CONSOLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lpd/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpd/s;->CONSOLE:Lpd/s;

    invoke-static {}, Lpd/s;->$values()[Lpd/s;

    move-result-object v0

    sput-object v0, Lpd/s;->$VALUES:[Lpd/s;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lpd/s;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lpd/s;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpd/s;
    .locals 1

    const-class v0, Lpd/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpd/s;

    return-object p0
.end method

.method public static values()[Lpd/s;
    .locals 1

    sget-object v0, Lpd/s;->$VALUES:[Lpd/s;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpd/s;

    return-object v0
.end method
