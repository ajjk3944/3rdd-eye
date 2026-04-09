.class public final enum Lra/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lra/d;

.field public static final enum COMPACT:Lra/d;

.field public static final enum EXPANDED:Lra/d;

.field public static final enum MEDIUM:Lra/d;


# direct methods
.method private static final synthetic $values()[Lra/d;
    .locals 3

    sget-object v0, Lra/d;->COMPACT:Lra/d;

    sget-object v1, Lra/d;->MEDIUM:Lra/d;

    sget-object v2, Lra/d;->EXPANDED:Lra/d;

    filled-new-array {v0, v1, v2}, [Lra/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lra/d;

    const-string v1, "COMPACT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lra/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lra/d;->COMPACT:Lra/d;

    new-instance v0, Lra/d;

    const-string/jumbo v1, "MEDIUM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lra/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lra/d;->MEDIUM:Lra/d;

    new-instance v0, Lra/d;

    const-string/jumbo v1, "EXPANDED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lra/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lra/d;->EXPANDED:Lra/d;

    invoke-static {}, Lra/d;->$values()[Lra/d;

    move-result-object v0

    sput-object v0, Lra/d;->$VALUES:[Lra/d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lra/d;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lra/d;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lra/d;
    .locals 1

    const-class v0, Lra/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lra/d;

    return-object p0
.end method

.method public static values()[Lra/d;
    .locals 1

    sget-object v0, Lra/d;->$VALUES:[Lra/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lra/d;

    return-object v0
.end method
