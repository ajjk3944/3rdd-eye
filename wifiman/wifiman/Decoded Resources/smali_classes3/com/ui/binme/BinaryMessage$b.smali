.class public final enum Lcom/ui/binme/BinaryMessage$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/binme/BinaryMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ui/binme/BinaryMessage$b;

.field public static final enum DISABLED:Lcom/ui/binme/BinaryMessage$b;

.field public static final enum ENABLED:Lcom/ui/binme/BinaryMessage$b;


# instance fields
.field private final id:B


# direct methods
.method private static final synthetic $values()[Lcom/ui/binme/BinaryMessage$b;
    .locals 2

    sget-object v0, Lcom/ui/binme/BinaryMessage$b;->DISABLED:Lcom/ui/binme/BinaryMessage$b;

    sget-object v1, Lcom/ui/binme/BinaryMessage$b;->ENABLED:Lcom/ui/binme/BinaryMessage$b;

    filled-new-array {v0, v1}, [Lcom/ui/binme/BinaryMessage$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/binme/BinaryMessage$b;

    const-string v1, "DISABLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/ui/binme/BinaryMessage$b;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/binme/BinaryMessage$b;->DISABLED:Lcom/ui/binme/BinaryMessage$b;

    new-instance v0, Lcom/ui/binme/BinaryMessage$b;

    const-string/jumbo v1, "ENABLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/ui/binme/BinaryMessage$b;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/ui/binme/BinaryMessage$b;->ENABLED:Lcom/ui/binme/BinaryMessage$b;

    invoke-static {}, Lcom/ui/binme/BinaryMessage$b;->$values()[Lcom/ui/binme/BinaryMessage$b;

    move-result-object v0

    sput-object v0, Lcom/ui/binme/BinaryMessage$b;->$VALUES:[Lcom/ui/binme/BinaryMessage$b;

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

    iput-byte p3, p0, Lcom/ui/binme/BinaryMessage$b;->id:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/binme/BinaryMessage$b;
    .locals 1

    const-class v0, Lcom/ui/binme/BinaryMessage$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/binme/BinaryMessage$b;

    return-object p0
.end method

.method public static values()[Lcom/ui/binme/BinaryMessage$b;
    .locals 1

    sget-object v0, Lcom/ui/binme/BinaryMessage$b;->$VALUES:[Lcom/ui/binme/BinaryMessage$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/binme/BinaryMessage$b;

    return-object v0
.end method


# virtual methods
.method public final getId$binme_release()B
    .locals 1

    iget-byte v0, p0, Lcom/ui/binme/BinaryMessage$b;->id:B

    return v0
.end method
