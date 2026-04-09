.class public final Lx4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw4/g;


# static fields
.field private static final b:Lcom/google/crypto/tink/config/internal/b$b;


# instance fields
.field private final a:Lw4/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/config/internal/b$b;->ALGORITHM_REQUIRES_BORINGCRYPTO:Lcom/google/crypto/tink/config/internal/b$b;

    sput-object v0, Lx4/c;->b:Lcom/google/crypto/tink/config/internal/b$b;

    return-void
.end method

.method public constructor <init>(Lw4/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lx4/c;->b:Lcom/google/crypto/tink/config/internal/b$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/config/internal/b$b;->isCompatible()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lx4/c;->a:Lw4/i;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
