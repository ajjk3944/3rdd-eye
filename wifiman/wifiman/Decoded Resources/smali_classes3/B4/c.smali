.class public final LB4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/a;


# static fields
.field public static final b:Lcom/google/crypto/tink/config/internal/b$b;


# instance fields
.field private final a:Lq4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/config/internal/b$b;->ALGORITHM_REQUIRES_BORINGCRYPTO:Lcom/google/crypto/tink/config/internal/b$b;

    sput-object v0, LB4/c;->b:Lcom/google/crypto/tink/config/internal/b$b;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LB4/c;->b:Lcom/google/crypto/tink/config/internal/b$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/config/internal/b$b;->isCompatible()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lq4/b;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lq4/b;-><init>([BZ)V

    iput-object v0, p0, LB4/c;->a:Lq4/b;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a([B[B)[B
    .locals 2

    const/16 v0, 0xc

    invoke-static {v0}, LB4/p;->c(I)[B

    move-result-object v0

    iget-object v1, p0, LB4/c;->a:Lq4/b;

    invoke-virtual {v1, v0, p1, p2}, Lq4/b;->b([B[B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 2

    const/16 v0, 0xc

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, LB4/c;->a:Lq4/b;

    invoke-virtual {v1, v0, p1, p2}, Lq4/b;->a([B[B[B)[B

    move-result-object p1

    return-object p1
.end method
