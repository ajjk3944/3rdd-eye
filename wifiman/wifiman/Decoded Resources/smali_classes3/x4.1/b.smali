.class public final Lx4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw4/g;


# static fields
.field private static final b:Lcom/google/crypto/tink/config/internal/b$b;


# instance fields
.field private final a:Lw4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/config/internal/b$b;->ALGORITHM_NOT_FIPS:Lcom/google/crypto/tink/config/internal/b$b;

    sput-object v0, Lx4/b;->b:Lcom/google/crypto/tink/config/internal/b$b;

    return-void
.end method

.method public constructor <init>(Lw4/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lx4/b;->b:Lcom/google/crypto/tink/config/internal/b$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/config/internal/b$b;->isCompatible()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lx4/b;->a:Lw4/a;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-CMAC in FIPS-mode."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
