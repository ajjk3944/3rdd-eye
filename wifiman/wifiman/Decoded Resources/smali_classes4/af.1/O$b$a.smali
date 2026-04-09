.class public final enum Laf/O$b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/O$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Laf/O$b$a;

.field public static final enum BAND:Laf/O$b$a;

.field public static final enum CHANNEL:Laf/O$b$a;

.field public static final enum CHANNEL_WIDTH:Laf/O$b$a;

.field public static final enum MIMO:Laf/O$b$a;

.field public static final enum PROVIDER:Laf/O$b$a;

.field public static final enum SIGNAL:Laf/O$b$a;

.field public static final enum STANDARD:Laf/O$b$a;

.field public static final enum TX_RETRIES:Laf/O$b$a;

.field public static final enum UTILIZATION:Laf/O$b$a;


# direct methods
.method private static final synthetic $values()[Laf/O$b$a;
    .locals 9

    sget-object v0, Laf/O$b$a;->BAND:Laf/O$b$a;

    sget-object v1, Laf/O$b$a;->CHANNEL:Laf/O$b$a;

    sget-object v2, Laf/O$b$a;->CHANNEL_WIDTH:Laf/O$b$a;

    sget-object v3, Laf/O$b$a;->STANDARD:Laf/O$b$a;

    sget-object v4, Laf/O$b$a;->MIMO:Laf/O$b$a;

    sget-object v5, Laf/O$b$a;->SIGNAL:Laf/O$b$a;

    sget-object v6, Laf/O$b$a;->UTILIZATION:Laf/O$b$a;

    sget-object v7, Laf/O$b$a;->TX_RETRIES:Laf/O$b$a;

    sget-object v8, Laf/O$b$a;->PROVIDER:Laf/O$b$a;

    filled-new-array/range {v0 .. v8}, [Laf/O$b$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Laf/O$b$a;

    const-string v1, "BAND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laf/O$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/O$b$a;->BAND:Laf/O$b$a;

    new-instance v0, Laf/O$b$a;

    const-string v1, "CHANNEL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Laf/O$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/O$b$a;->CHANNEL:Laf/O$b$a;

    new-instance v0, Laf/O$b$a;

    const-string v1, "CHANNEL_WIDTH"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Laf/O$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/O$b$a;->CHANNEL_WIDTH:Laf/O$b$a;

    new-instance v0, Laf/O$b$a;

    const-string v1, "STANDARD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Laf/O$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/O$b$a;->STANDARD:Laf/O$b$a;

    new-instance v0, Laf/O$b$a;

    const-string v1, "MIMO"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Laf/O$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/O$b$a;->MIMO:Laf/O$b$a;

    new-instance v0, Laf/O$b$a;

    const-string v1, "SIGNAL"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Laf/O$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/O$b$a;->SIGNAL:Laf/O$b$a;

    new-instance v0, Laf/O$b$a;

    const-string v1, "UTILIZATION"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Laf/O$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/O$b$a;->UTILIZATION:Laf/O$b$a;

    new-instance v0, Laf/O$b$a;

    const-string v1, "TX_RETRIES"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Laf/O$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/O$b$a;->TX_RETRIES:Laf/O$b$a;

    new-instance v0, Laf/O$b$a;

    const-string v1, "PROVIDER"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Laf/O$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/O$b$a;->PROVIDER:Laf/O$b$a;

    invoke-static {}, Laf/O$b$a;->$values()[Laf/O$b$a;

    move-result-object v0

    sput-object v0, Laf/O$b$a;->$VALUES:[Laf/O$b$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Laf/O$b$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Laf/O$b$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Laf/O$b$a;
    .locals 1

    const-class v0, Laf/O$b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laf/O$b$a;

    return-object p0
.end method

.method public static values()[Laf/O$b$a;
    .locals 1

    sget-object v0, Laf/O$b$a;->$VALUES:[Laf/O$b$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laf/O$b$a;

    return-object v0
.end method
