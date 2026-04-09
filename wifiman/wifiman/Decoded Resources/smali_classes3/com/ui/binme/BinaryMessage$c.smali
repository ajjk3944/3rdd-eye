.class public final enum Lcom/ui/binme/BinaryMessage$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/binme/BinaryMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ui/binme/BinaryMessage$c;

.field public static final enum BINARY:Lcom/ui/binme/BinaryMessage$c;

.field public static final enum JSON:Lcom/ui/binme/BinaryMessage$c;

.field public static final enum STRING:Lcom/ui/binme/BinaryMessage$c;


# instance fields
.field private final id:B


# direct methods
.method private static final synthetic $values()[Lcom/ui/binme/BinaryMessage$c;
    .locals 3

    sget-object v0, Lcom/ui/binme/BinaryMessage$c;->JSON:Lcom/ui/binme/BinaryMessage$c;

    sget-object v1, Lcom/ui/binme/BinaryMessage$c;->STRING:Lcom/ui/binme/BinaryMessage$c;

    sget-object v2, Lcom/ui/binme/BinaryMessage$c;->BINARY:Lcom/ui/binme/BinaryMessage$c;

    filled-new-array {v0, v1, v2}, [Lcom/ui/binme/BinaryMessage$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/binme/BinaryMessage$c;

    const-string/jumbo v1, "JSON"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/ui/binme/BinaryMessage$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/binme/BinaryMessage$c;->JSON:Lcom/ui/binme/BinaryMessage$c;

    new-instance v0, Lcom/ui/binme/BinaryMessage$c;

    const-string/jumbo v1, "STRING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/ui/binme/BinaryMessage$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/binme/BinaryMessage$c;->STRING:Lcom/ui/binme/BinaryMessage$c;

    new-instance v0, Lcom/ui/binme/BinaryMessage$c;

    const-string v1, "BINARY"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/ui/binme/BinaryMessage$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/binme/BinaryMessage$c;->BINARY:Lcom/ui/binme/BinaryMessage$c;

    invoke-static {}, Lcom/ui/binme/BinaryMessage$c;->$values()[Lcom/ui/binme/BinaryMessage$c;

    move-result-object v0

    sput-object v0, Lcom/ui/binme/BinaryMessage$c;->$VALUES:[Lcom/ui/binme/BinaryMessage$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lcom/ui/binme/BinaryMessage$c;->id:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/binme/BinaryMessage$c;
    .locals 1

    const-class v0, Lcom/ui/binme/BinaryMessage$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/binme/BinaryMessage$c;

    return-object p0
.end method

.method public static values()[Lcom/ui/binme/BinaryMessage$c;
    .locals 1

    sget-object v0, Lcom/ui/binme/BinaryMessage$c;->$VALUES:[Lcom/ui/binme/BinaryMessage$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/binme/BinaryMessage$c;

    return-object v0
.end method


# virtual methods
.method public final getId$binme_release()B
    .locals 1

    iget-byte v0, p0, Lcom/ui/binme/BinaryMessage$c;->id:B

    return v0
.end method
