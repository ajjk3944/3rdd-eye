.class public final enum Lxe/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lxe/g;

.field public static final enum DIRECT_CONSOLE_CONNECT:Lxe/g;

.field public static final enum NONE:Lxe/g;

.field public static final enum SPEED_TEST_A2A:Lxe/g;

.field public static final enum WIFIMAN_WIZARD:Lxe/g;


# direct methods
.method private static final synthetic $values()[Lxe/g;
    .locals 4

    sget-object v0, Lxe/g;->NONE:Lxe/g;

    sget-object v1, Lxe/g;->SPEED_TEST_A2A:Lxe/g;

    sget-object v2, Lxe/g;->WIFIMAN_WIZARD:Lxe/g;

    sget-object v3, Lxe/g;->DIRECT_CONSOLE_CONNECT:Lxe/g;

    filled-new-array {v0, v1, v2, v3}, [Lxe/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxe/g;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxe/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxe/g;->NONE:Lxe/g;

    new-instance v0, Lxe/g;

    const-string v1, "SPEED_TEST_A2A"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lxe/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxe/g;->SPEED_TEST_A2A:Lxe/g;

    new-instance v0, Lxe/g;

    const-string v1, "WIFIMAN_WIZARD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lxe/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxe/g;->WIFIMAN_WIZARD:Lxe/g;

    new-instance v0, Lxe/g;

    const-string v1, "DIRECT_CONSOLE_CONNECT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lxe/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxe/g;->DIRECT_CONSOLE_CONNECT:Lxe/g;

    invoke-static {}, Lxe/g;->$values()[Lxe/g;

    move-result-object v0

    sput-object v0, Lxe/g;->$VALUES:[Lxe/g;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lxe/g;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lxe/g;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxe/g;
    .locals 1

    const-class v0, Lxe/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxe/g;

    return-object p0
.end method

.method public static values()[Lxe/g;
    .locals 1

    sget-object v0, Lxe/g;->$VALUES:[Lxe/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxe/g;

    return-object v0
.end method
