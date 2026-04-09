.class public final enum LS6/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LS6/a;

.field public static final enum DISK:LS6/a;

.field public static final enum MEMORY:LS6/a;

.field public static final enum NETWORK:LS6/a;

.field public static final enum UNKNOWN:LS6/a;


# direct methods
.method private static final synthetic $values()[LS6/a;
    .locals 4

    sget-object v0, LS6/a;->MEMORY:LS6/a;

    sget-object v1, LS6/a;->DISK:LS6/a;

    sget-object v2, LS6/a;->NETWORK:LS6/a;

    sget-object v3, LS6/a;->UNKNOWN:LS6/a;

    filled-new-array {v0, v1, v2, v3}, [LS6/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS6/a;

    const-string/jumbo v1, "MEMORY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LS6/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS6/a;->MEMORY:LS6/a;

    new-instance v0, LS6/a;

    const-string v1, "DISK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LS6/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS6/a;->DISK:LS6/a;

    new-instance v0, LS6/a;

    const-string/jumbo v1, "NETWORK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LS6/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS6/a;->NETWORK:LS6/a;

    new-instance v0, LS6/a;

    const-string/jumbo v1, "UNKNOWN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LS6/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS6/a;->UNKNOWN:LS6/a;

    invoke-static {}, LS6/a;->$values()[LS6/a;

    move-result-object v0

    sput-object v0, LS6/a;->$VALUES:[LS6/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LS6/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LS6/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS6/a;
    .locals 1

    const-class v0, LS6/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS6/a;

    return-object p0
.end method

.method public static values()[LS6/a;
    .locals 1

    sget-object v0, LS6/a;->$VALUES:[LS6/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS6/a;

    return-object v0
.end method
