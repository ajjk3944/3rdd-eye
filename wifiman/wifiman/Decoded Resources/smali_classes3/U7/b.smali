.class public final enum LU7/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LU7/b;

.field public static final enum BLE:LU7/b;

.field public static final enum CLASSIC:LU7/b;


# direct methods
.method private static final synthetic $values()[LU7/b;
    .locals 2

    sget-object v0, LU7/b;->CLASSIC:LU7/b;

    sget-object v1, LU7/b;->BLE:LU7/b;

    filled-new-array {v0, v1}, [LU7/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LU7/b;

    const-string v1, "CLASSIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LU7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LU7/b;->CLASSIC:LU7/b;

    new-instance v0, LU7/b;

    const-string v1, "BLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LU7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LU7/b;->BLE:LU7/b;

    invoke-static {}, LU7/b;->$values()[LU7/b;

    move-result-object v0

    sput-object v0, LU7/b;->$VALUES:[LU7/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LU7/b;->$ENTRIES:Lfh/a;

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

    sget-object v0, LU7/b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LU7/b;
    .locals 1

    const-class v0, LU7/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LU7/b;

    return-object p0
.end method

.method public static values()[LU7/b;
    .locals 1

    sget-object v0, LU7/b;->$VALUES:[LU7/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LU7/b;

    return-object v0
.end method
