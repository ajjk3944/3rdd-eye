.class public final enum Lcom/wireguard/crypto/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wireguard/crypto/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/wireguard/crypto/b$a;

.field public static final enum BASE64:Lcom/wireguard/crypto/b$a;

.field public static final enum BINARY:Lcom/wireguard/crypto/b$a;

.field public static final enum HEX:Lcom/wireguard/crypto/b$a;


# instance fields
.field private final length:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/wireguard/crypto/b$a;

    const/4 v1, 0x0

    const/16 v2, 0x2c

    const-string v3, "BASE64"

    invoke-direct {v0, v3, v1, v2}, Lcom/wireguard/crypto/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/wireguard/crypto/b$a;->BASE64:Lcom/wireguard/crypto/b$a;

    new-instance v1, Lcom/wireguard/crypto/b$a;

    const/4 v2, 0x1

    const/16 v3, 0x20

    const-string v4, "BINARY"

    invoke-direct {v1, v4, v2, v3}, Lcom/wireguard/crypto/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/wireguard/crypto/b$a;->BINARY:Lcom/wireguard/crypto/b$a;

    new-instance v2, Lcom/wireguard/crypto/b$a;

    const/4 v3, 0x2

    const/16 v4, 0x40

    const-string v5, "HEX"

    invoke-direct {v2, v5, v3, v4}, Lcom/wireguard/crypto/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/wireguard/crypto/b$a;->HEX:Lcom/wireguard/crypto/b$a;

    filled-new-array {v0, v1, v2}, [Lcom/wireguard/crypto/b$a;

    move-result-object v0

    sput-object v0, Lcom/wireguard/crypto/b$a;->$VALUES:[Lcom/wireguard/crypto/b$a;

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

    iput p3, p0, Lcom/wireguard/crypto/b$a;->length:I

    return-void
.end method

.method static synthetic access$000(Lcom/wireguard/crypto/b$a;)I
    .locals 0

    iget p0, p0, Lcom/wireguard/crypto/b$a;->length:I

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/wireguard/crypto/b$a;
    .locals 1

    const-class v0, Lcom/wireguard/crypto/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/wireguard/crypto/b$a;

    return-object p0
.end method

.method public static values()[Lcom/wireguard/crypto/b$a;
    .locals 1

    sget-object v0, Lcom/wireguard/crypto/b$a;->$VALUES:[Lcom/wireguard/crypto/b$a;

    invoke-virtual {v0}, [Lcom/wireguard/crypto/b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/wireguard/crypto/b$a;

    return-object v0
.end method


# virtual methods
.method public getLength()I
    .locals 1

    iget v0, p0, Lcom/wireguard/crypto/b$a;->length:I

    return v0
.end method
