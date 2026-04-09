.class public final enum Lcom/ubnt/usurvey/wifi/WifiMcs$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/usurvey/wifi/WifiMcs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ubnt/usurvey/wifi/WifiMcs$a;

.field public static final enum _1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

.field public static final enum _2_3:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

.field public static final enum _3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

.field public static final enum _5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;


# instance fields
.field private final r:F


# direct methods
.method private static final synthetic $values()[Lcom/ubnt/usurvey/wifi/WifiMcs$a;
    .locals 4

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    sget-object v1, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_2_3:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    sget-object v2, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    sget-object v3, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    filled-new-array {v0, v1, v2, v3}, [Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    const/4 v1, 0x0

    const/high16 v2, 0x3f000000    # 0.5f

    const-string/jumbo v3, "_1_2"

    invoke-direct {v0, v3, v1, v2}, Lcom/ubnt/usurvey/wifi/WifiMcs$a;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_1_2:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    const/4 v1, 0x1

    const v2, 0x3f2aaaab

    const-string/jumbo v3, "_2_3"

    invoke-direct {v0, v3, v1, v2}, Lcom/ubnt/usurvey/wifi/WifiMcs$a;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_2_3:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    const/4 v1, 0x2

    const/high16 v2, 0x3f400000    # 0.75f

    const-string/jumbo v3, "_3_4"

    invoke-direct {v0, v3, v1, v2}, Lcom/ubnt/usurvey/wifi/WifiMcs$a;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_3_4:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    const/4 v1, 0x3

    const v2, 0x3f555555

    const-string/jumbo v3, "_5_6"

    invoke-direct {v0, v3, v1, v2}, Lcom/ubnt/usurvey/wifi/WifiMcs$a;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->_5_6:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-static {}, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->$values()[Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->$VALUES:[Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->r:F

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

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ubnt/usurvey/wifi/WifiMcs$a;
    .locals 1

    const-class v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    return-object p0
.end method

.method public static values()[Lcom/ubnt/usurvey/wifi/WifiMcs$a;
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->$VALUES:[Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    return-object v0
.end method


# virtual methods
.method public final getR()F
    .locals 1

    iget v0, p0, Lcom/ubnt/usurvey/wifi/WifiMcs$a;->r:F

    return v0
.end method
