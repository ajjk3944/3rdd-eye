.class public final enum Lcom/ui/wifiman/model/bluetooth/le/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/bluetooth/le/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/bluetooth/le/i$a;

.field public static final enum BATTERY_LEVEL:Lcom/ui/wifiman/model/bluetooth/le/i$a;

.field public static final enum FIRMWARE_REVISION:Lcom/ui/wifiman/model/bluetooth/le/i$a;

.field public static final enum MANUFACTURER:Lcom/ui/wifiman/model/bluetooth/le/i$a;

.field public static final enum MODEL_NUMBER:Lcom/ui/wifiman/model/bluetooth/le/i$a;

.field public static final enum NAME:Lcom/ui/wifiman/model/bluetooth/le/i$a;

.field public static final enum SERIAL_NUMBER:Lcom/ui/wifiman/model/bluetooth/le/i$a;


# instance fields
.field private final characteristic:I

.field private final dataFormat:Ljava/lang/Integer;

.field private final formatter:Lmh/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmh/l;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/bluetooth/le/i$a;
    .locals 6

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->NAME:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    sget-object v1, Lcom/ui/wifiman/model/bluetooth/le/i$a;->MODEL_NUMBER:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    sget-object v2, Lcom/ui/wifiman/model/bluetooth/le/i$a;->MANUFACTURER:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    sget-object v3, Lcom/ui/wifiman/model/bluetooth/le/i$a;->BATTERY_LEVEL:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    sget-object v4, Lcom/ui/wifiman/model/bluetooth/le/i$a;->SERIAL_NUMBER:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    sget-object v5, Lcom/ui/wifiman/model/bluetooth/le/i$a;->FIRMWARE_REVISION:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    filled-new-array/range {v0 .. v5}, [Lcom/ui/wifiman/model/bluetooth/le/i$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lcom/ui/wifiman/model/bluetooth/le/i$a;

    new-instance v5, Lyc/l;

    invoke-direct {v5}, Lyc/l;-><init>()V

    const-string v1, "NAME"

    const/4 v2, 0x0

    const/16 v3, 0x2a00

    const/4 v4, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ui/wifiman/model/bluetooth/le/i$a;-><init>(Ljava/lang/String;IILjava/lang/Integer;Lmh/l;)V

    sput-object v6, Lcom/ui/wifiman/model/bluetooth/le/i$a;->NAME:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;

    new-instance v12, Lyc/m;

    invoke-direct {v12}, Lyc/m;-><init>()V

    const-string v8, "MODEL_NUMBER"

    const/4 v9, 0x1

    const/16 v10, 0x2a24

    const/4 v11, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ui/wifiman/model/bluetooth/le/i$a;-><init>(Ljava/lang/String;IILjava/lang/Integer;Lmh/l;)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->MODEL_NUMBER:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;

    new-instance v6, Lyc/n;

    invoke-direct {v6}, Lyc/n;-><init>()V

    const-string v2, "MANUFACTURER"

    const/4 v3, 0x2

    const/16 v4, 0x2a29

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ui/wifiman/model/bluetooth/le/i$a;-><init>(Ljava/lang/String;IILjava/lang/Integer;Lmh/l;)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->MANUFACTURER:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    new-instance v12, Lyc/o;

    invoke-direct {v12}, Lyc/o;-><init>()V

    const-string v8, "BATTERY_LEVEL"

    const/4 v9, 0x3

    const/16 v10, 0x2a19

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ui/wifiman/model/bluetooth/le/i$a;-><init>(Ljava/lang/String;IILjava/lang/Integer;Lmh/l;)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->BATTERY_LEVEL:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;

    new-instance v6, Lyc/p;

    invoke-direct {v6}, Lyc/p;-><init>()V

    const-string v2, "SERIAL_NUMBER"

    const/4 v3, 0x4

    const/16 v4, 0x2a25

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ui/wifiman/model/bluetooth/le/i$a;-><init>(Ljava/lang/String;IILjava/lang/Integer;Lmh/l;)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->SERIAL_NUMBER:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;

    new-instance v12, Lyc/q;

    invoke-direct {v12}, Lyc/q;-><init>()V

    const-string v8, "FIRMWARE_REVISION"

    const/4 v9, 0x5

    const/16 v10, 0x2a26

    const/4 v11, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ui/wifiman/model/bluetooth/le/i$a;-><init>(Ljava/lang/String;IILjava/lang/Integer;Lmh/l;)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->FIRMWARE_REVISION:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-static {}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->$values()[Lcom/ui/wifiman/model/bluetooth/le/i$a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->$VALUES:[Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/Integer;Lmh/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Integer;",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->characteristic:I

    iput-object p4, p0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->dataFormat:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->formatter:Lmh/l;

    return-void
.end method

.method private static final _init_$lambda$0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$1(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$2(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$3(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " %"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$4(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$5(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->_init_$lambda$0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->_init_$lambda$1(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->_init_$lambda$4(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->_init_$lambda$5(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->_init_$lambda$2(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->_init_$lambda$3(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/bluetooth/le/i$a;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/bluetooth/le/i$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/bluetooth/le/i$a;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->$VALUES:[Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/bluetooth/le/i$a;

    return-object v0
.end method


# virtual methods
.method public final getCharacteristic()I
    .locals 1

    iget v0, p0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->characteristic:I

    return v0
.end method

.method public final getDataFormat()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->dataFormat:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getFormatter()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/i$a;->formatter:Lmh/l;

    return-object v0
.end method
