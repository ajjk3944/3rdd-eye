.class final enum Lrf/A;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lrf/A;

.field public static final enum CHECKMARK:Lrf/A;

.field public static final enum DOTS:Lrf/A;

.field public static final enum NONE:Lrf/A;


# direct methods
.method private static final synthetic $values()[Lrf/A;
    .locals 3

    sget-object v0, Lrf/A;->NONE:Lrf/A;

    sget-object v1, Lrf/A;->CHECKMARK:Lrf/A;

    sget-object v2, Lrf/A;->DOTS:Lrf/A;

    filled-new-array {v0, v1, v2}, [Lrf/A;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrf/A;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrf/A;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf/A;->NONE:Lrf/A;

    new-instance v0, Lrf/A;

    const-string v1, "CHECKMARK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrf/A;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf/A;->CHECKMARK:Lrf/A;

    new-instance v0, Lrf/A;

    const-string v1, "DOTS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrf/A;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrf/A;->DOTS:Lrf/A;

    invoke-static {}, Lrf/A;->$values()[Lrf/A;

    move-result-object v0

    sput-object v0, Lrf/A;->$VALUES:[Lrf/A;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lrf/A;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lrf/A;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrf/A;
    .locals 1

    const-class v0, Lrf/A;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrf/A;

    return-object p0
.end method

.method public static values()[Lrf/A;
    .locals 1

    sget-object v0, Lrf/A;->$VALUES:[Lrf/A;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrf/A;

    return-object v0
.end method
