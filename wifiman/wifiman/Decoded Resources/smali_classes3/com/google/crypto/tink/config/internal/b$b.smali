.class public abstract enum Lcom/google/crypto/tink/config/internal/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/config/internal/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/crypto/tink/config/internal/b$b;

.field public static final enum ALGORITHM_NOT_FIPS:Lcom/google/crypto/tink/config/internal/b$b;

.field public static final enum ALGORITHM_REQUIRES_BORINGCRYPTO:Lcom/google/crypto/tink/config/internal/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/crypto/tink/config/internal/b$b$a;

    const-string v1, "ALGORITHM_NOT_FIPS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/crypto/tink/config/internal/b$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/crypto/tink/config/internal/b$b;->ALGORITHM_NOT_FIPS:Lcom/google/crypto/tink/config/internal/b$b;

    new-instance v1, Lcom/google/crypto/tink/config/internal/b$b$b;

    const-string v3, "ALGORITHM_REQUIRES_BORINGCRYPTO"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/crypto/tink/config/internal/b$b$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/crypto/tink/config/internal/b$b;->ALGORITHM_REQUIRES_BORINGCRYPTO:Lcom/google/crypto/tink/config/internal/b$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/crypto/tink/config/internal/b$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/google/crypto/tink/config/internal/b$b;->$VALUES:[Lcom/google/crypto/tink/config/internal/b$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/crypto/tink/config/internal/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/google/crypto/tink/config/internal/b$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/crypto/tink/config/internal/b$b;
    .locals 1

    const-class v0, Lcom/google/crypto/tink/config/internal/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/config/internal/b$b;

    return-object p0
.end method

.method public static values()[Lcom/google/crypto/tink/config/internal/b$b;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/config/internal/b$b;->$VALUES:[Lcom/google/crypto/tink/config/internal/b$b;

    invoke-virtual {v0}, [Lcom/google/crypto/tink/config/internal/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/crypto/tink/config/internal/b$b;

    return-object v0
.end method


# virtual methods
.method public abstract isCompatible()Z
.end method
