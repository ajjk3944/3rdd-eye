.class public final enum Lnf/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lnf/d;

.field public static final enum METERED_NETWORK_WARNING:Lnf/d;

.field public static final enum NOTHING:Lnf/d;

.field public static final enum TEST:Lnf/d;


# direct methods
.method private static final synthetic $values()[Lnf/d;
    .locals 3

    sget-object v0, Lnf/d;->NOTHING:Lnf/d;

    sget-object v1, Lnf/d;->TEST:Lnf/d;

    sget-object v2, Lnf/d;->METERED_NETWORK_WARNING:Lnf/d;

    filled-new-array {v0, v1, v2}, [Lnf/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnf/d;

    const-string v1, "NOTHING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnf/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnf/d;->NOTHING:Lnf/d;

    new-instance v0, Lnf/d;

    const-string v1, "TEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnf/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnf/d;->TEST:Lnf/d;

    new-instance v0, Lnf/d;

    const-string v1, "METERED_NETWORK_WARNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lnf/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnf/d;->METERED_NETWORK_WARNING:Lnf/d;

    invoke-static {}, Lnf/d;->$values()[Lnf/d;

    move-result-object v0

    sput-object v0, Lnf/d;->$VALUES:[Lnf/d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lnf/d;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lnf/d;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnf/d;
    .locals 1

    const-class v0, Lnf/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnf/d;

    return-object p0
.end method

.method public static values()[Lnf/d;
    .locals 1

    sget-object v0, Lnf/d;->$VALUES:[Lnf/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnf/d;

    return-object v0
.end method
