.class public final enum Lcom/ubnt/usurvey/wifi/WifiMcs$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/usurvey/wifi/WifiMcs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ubnt/usurvey/wifi/WifiMcs$c;

.field public static final enum BPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

.field public static final enum QAM_1024:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

.field public static final enum QAM_16:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

.field public static final enum QAM_256:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

.field public static final enum QAM_4096:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

.field public static final enum QAM_64:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

.field public static final enum QPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;


# instance fields
.field private final ncb:I


# direct methods
.method private static final synthetic $values()[Lcom/ubnt/usurvey/wifi/WifiMcs$c;
    .locals 7

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->BPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v1, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v2, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_16:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v3, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_64:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v4, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_256:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v5, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_1024:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    sget-object v6, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_4096:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    filled-new-array/range {v0 .. v6}, [Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    const-string v1, "BPSK"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/ubnt/usurvey/wifi/WifiMcs$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->BPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    const-string/jumbo v1, "QPSK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/ubnt/usurvey/wifi/WifiMcs$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QPSK:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    const-string/jumbo v1, "QAM_16"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/ubnt/usurvey/wifi/WifiMcs$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_16:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    const-string/jumbo v1, "QAM_64"

    const/4 v2, 0x3

    const/4 v4, 0x6

    invoke-direct {v0, v1, v2, v4}, Lcom/ubnt/usurvey/wifi/WifiMcs$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_64:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    const-string/jumbo v1, "QAM_256"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v3, v2}, Lcom/ubnt/usurvey/wifi/WifiMcs$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_256:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    const/4 v1, 0x5

    const/16 v2, 0xa

    const-string/jumbo v3, "QAM_1024"

    invoke-direct {v0, v3, v1, v2}, Lcom/ubnt/usurvey/wifi/WifiMcs$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_1024:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    const-string/jumbo v1, "QAM_4096"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v4, v2}, Lcom/ubnt/usurvey/wifi/WifiMcs$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->QAM_4096:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    invoke-static {}, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->$values()[Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->$VALUES:[Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->ncb:I

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

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ubnt/usurvey/wifi/WifiMcs$c;
    .locals 1

    const-class v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    return-object p0
.end method

.method public static values()[Lcom/ubnt/usurvey/wifi/WifiMcs$c;
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->$VALUES:[Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    return-object v0
.end method


# virtual methods
.method public final getNcb()I
    .locals 1

    iget v0, p0, Lcom/ubnt/usurvey/wifi/WifiMcs$c;->ncb:I

    return v0
.end method
