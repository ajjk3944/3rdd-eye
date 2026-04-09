.class public final enum Lfc/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lfc/c;

.field public static final enum BLUETOOTH:Lfc/c;

.field public static final enum LAN:Lfc/c;


# direct methods
.method private static final synthetic $values()[Lfc/c;
    .locals 2

    sget-object v0, Lfc/c;->LAN:Lfc/c;

    sget-object v1, Lfc/c;->BLUETOOTH:Lfc/c;

    filled-new-array {v0, v1}, [Lfc/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfc/c;

    const-string/jumbo v1, "LAN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfc/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfc/c;->LAN:Lfc/c;

    new-instance v0, Lfc/c;

    const-string v1, "BLUETOOTH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfc/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfc/c;->BLUETOOTH:Lfc/c;

    invoke-static {}, Lfc/c;->$values()[Lfc/c;

    move-result-object v0

    sput-object v0, Lfc/c;->$VALUES:[Lfc/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lfc/c;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lfc/c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfc/c;
    .locals 1

    const-class v0, Lfc/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfc/c;

    return-object p0
.end method

.method public static values()[Lfc/c;
    .locals 1

    sget-object v0, Lfc/c;->$VALUES:[Lfc/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfc/c;

    return-object v0
.end method
