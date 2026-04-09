.class public final Lcom/wireguard/crypto/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/wireguard/crypto/b$a;
    }
.end annotation


# instance fields
.field private final a:[B


# direct methods
.method private constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lcom/wireguard/crypto/b;->a:[B

    return-void
.end method

.method private static a([CI)I
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x4

    if-ge v0, v2, :cond_0

    add-int v2, v0, p1

    aget-char v2, p0, v2

    rsub-int/lit8 v3, v2, 0x40

    add-int/lit8 v4, v2, -0x5b

    and-int/2addr v3, v4

    ushr-int/lit8 v3, v3, 0x8

    add-int/lit8 v4, v2, -0x40

    and-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    rsub-int/lit8 v4, v2, 0x60

    add-int/lit8 v5, v2, -0x7b

    and-int/2addr v4, v5

    ushr-int/lit8 v4, v4, 0x8

    add-int/lit8 v5, v2, -0x46

    and-int/2addr v4, v5

    add-int/2addr v3, v4

    rsub-int/lit8 v4, v2, 0x2f

    add-int/lit8 v5, v2, -0x3a

    and-int/2addr v4, v5

    ushr-int/lit8 v4, v4, 0x8

    add-int/lit8 v5, v2, 0x5

    and-int/2addr v4, v5

    add-int/2addr v3, v4

    rsub-int/lit8 v4, v2, 0x2a

    add-int/lit8 v5, v2, -0x2c

    and-int/2addr v4, v5

    ushr-int/lit8 v4, v4, 0x8

    and-int/lit8 v4, v4, 0x3f

    add-int/2addr v3, v4

    rsub-int/lit8 v4, v2, 0x2e

    add-int/lit8 v2, v2, -0x30

    and-int/2addr v2, v4

    ushr-int/lit8 v2, v2, 0x8

    and-int/lit8 v2, v2, 0x40

    add-int/2addr v3, v2

    mul-int/lit8 v2, v0, 0x6

    rsub-int/lit8 v2, v2, 0x12

    shl-int v2, v3, v2

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method private static b([BI[CI)V
    .locals 7

    aget-byte v0, p0, p1

    const/4 v1, 0x2

    ushr-int/lit8 v2, v0, 0x2

    and-int/lit8 v2, v2, 0x3f

    int-to-byte v2, v2

    const/4 v3, 0x4

    shl-int/2addr v0, v3

    const/4 v4, 0x1

    add-int/lit8 v5, p1, 0x1

    aget-byte v5, p0, v5

    and-int/lit16 v6, v5, 0xff

    ushr-int/2addr v6, v3

    or-int/2addr v0, v6

    and-int/lit8 v0, v0, 0x3f

    int-to-byte v0, v0

    shl-int/2addr v5, v1

    add-int/2addr p1, v1

    aget-byte p0, p0, p1

    and-int/lit16 p1, p0, 0xff

    ushr-int/lit8 p1, p1, 0x6

    or-int/2addr p1, v5

    and-int/lit8 p1, p1, 0x3f

    int-to-byte p1, p1

    and-int/lit8 p0, p0, 0x3f

    int-to-byte p0, p0

    new-array v5, v3, [B

    const/4 v6, 0x0

    aput-byte v2, v5, v6

    aput-byte v0, v5, v4

    aput-byte p1, v5, v1

    const/4 p1, 0x3

    aput-byte p0, v5, p1

    :goto_0
    if-ge v6, v3, :cond_0

    add-int p0, v6, p3

    aget-byte v0, v5, v6

    add-int/lit8 v1, v0, 0x41

    rsub-int/lit8 v2, v0, 0x19

    ushr-int/lit8 v2, v2, 0x8

    and-int/lit8 v2, v2, 0x6

    add-int/2addr v1, v2

    rsub-int/lit8 v2, v0, 0x33

    ushr-int/lit8 v2, v2, 0x8

    and-int/lit8 v2, v2, 0x4b

    sub-int/2addr v1, v2

    rsub-int/lit8 v2, v0, 0x3d

    ushr-int/lit8 v2, v2, 0x8

    and-int/lit8 v2, v2, 0xf

    sub-int/2addr v1, v2

    rsub-int/lit8 v0, v0, 0x3e

    ushr-int/lit8 v0, v0, 0x8

    and-int/2addr v0, p1

    add-int/2addr v1, v0

    int-to-char v0, v1

    aput-char v0, p2, p0

    add-int/2addr v6, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;)Lcom/wireguard/crypto/b;
    .locals 13

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    array-length v5, p0

    sget-object v6, Lcom/wireguard/crypto/b$a;->BASE64:Lcom/wireguard/crypto/b$a;

    invoke-static {v6}, Lcom/wireguard/crypto/b$a;->access$000(Lcom/wireguard/crypto/b$a;)I

    move-result v7

    if-ne v5, v7, :cond_2

    invoke-static {v6}, Lcom/wireguard/crypto/b$a;->access$000(Lcom/wireguard/crypto/b$a;)I

    move-result v5

    sub-int/2addr v5, v4

    aget-char v5, p0, v5

    const/16 v7, 0x3d

    if-ne v5, v7, :cond_2

    sget-object v5, Lcom/wireguard/crypto/b$a;->BINARY:Lcom/wireguard/crypto/b$a;

    invoke-static {v5}, Lcom/wireguard/crypto/b$a;->access$000(Lcom/wireguard/crypto/b$a;)I

    move-result v5

    new-array v6, v5, [B

    move v7, v1

    move v8, v7

    :goto_0
    div-int/lit8 v9, v5, 0x3

    if-ge v7, v9, :cond_0

    mul-int/lit8 v9, v7, 0x4

    invoke-static {p0, v9}, Lcom/wireguard/crypto/b;->a([CI)I

    move-result v9

    ushr-int/lit8 v10, v9, 0x1f

    or-int/2addr v8, v10

    mul-int/lit8 v10, v7, 0x3

    ushr-int/lit8 v11, v9, 0x10

    and-int/lit16 v11, v11, 0xff

    int-to-byte v11, v11

    aput-byte v11, v6, v10

    add-int/lit8 v11, v10, 0x1

    ushr-int/lit8 v12, v9, 0x8

    and-int/lit16 v12, v12, 0xff

    int-to-byte v12, v12

    aput-byte v12, v6, v11

    add-int/2addr v10, v0

    and-int/lit16 v9, v9, 0xff

    int-to-byte v9, v9

    aput-byte v9, v6, v10

    add-int/2addr v7, v4

    goto :goto_0

    :cond_0
    mul-int/lit8 v5, v7, 0x4

    aget-char v9, p0, v5

    add-int/lit8 v10, v5, 0x1

    aget-char v10, p0, v10

    add-int/2addr v5, v0

    aget-char p0, p0, v5

    new-array v2, v2, [C

    aput-char v9, v2, v1

    aput-char v10, v2, v4

    aput-char p0, v2, v0

    const/16 p0, 0x41

    aput-char p0, v2, v3

    invoke-static {v2, v1}, Lcom/wireguard/crypto/b;->a([CI)I

    move-result p0

    ushr-int/lit8 v0, p0, 0x1f

    and-int/lit16 v1, p0, 0xff

    or-int/2addr v0, v1

    or-int/2addr v0, v8

    mul-int/2addr v7, v3

    ushr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v6, v7

    add-int/2addr v7, v4

    ushr-int/lit8 p0, p0, 0x8

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    aput-byte p0, v6, v7

    if-nez v0, :cond_1

    new-instance p0, Lcom/wireguard/crypto/b;

    invoke-direct {p0, v6}, Lcom/wireguard/crypto/b;-><init>([B)V

    return-object p0

    :cond_1
    new-instance p0, Lcom/wireguard/crypto/KeyFormatException;

    sget-object v0, Lcom/wireguard/crypto/b$a;->BASE64:Lcom/wireguard/crypto/b$a;

    sget-object v1, Lcom/wireguard/crypto/KeyFormatException$a;->CONTENTS:Lcom/wireguard/crypto/KeyFormatException$a;

    invoke-direct {p0, v0, v1}, Lcom/wireguard/crypto/KeyFormatException;-><init>(Lcom/wireguard/crypto/b$a;Lcom/wireguard/crypto/KeyFormatException$a;)V

    throw p0

    :cond_2
    new-instance p0, Lcom/wireguard/crypto/KeyFormatException;

    sget-object v0, Lcom/wireguard/crypto/KeyFormatException$a;->LENGTH:Lcom/wireguard/crypto/KeyFormatException$a;

    invoke-direct {p0, v6, v0}, Lcom/wireguard/crypto/KeyFormatException;-><init>(Lcom/wireguard/crypto/b$a;Lcom/wireguard/crypto/KeyFormatException$a;)V

    throw p0
.end method

.method public static d(Ljava/lang/String;)Lcom/wireguard/crypto/b;
    .locals 10

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    array-length v0, p0

    sget-object v1, Lcom/wireguard/crypto/b$a;->HEX:Lcom/wireguard/crypto/b$a;

    invoke-static {v1}, Lcom/wireguard/crypto/b$a;->access$000(Lcom/wireguard/crypto/b$a;)I

    move-result v2

    if-ne v0, v2, :cond_2

    sget-object v0, Lcom/wireguard/crypto/b$a;->BINARY:Lcom/wireguard/crypto/b$a;

    invoke-static {v0}, Lcom/wireguard/crypto/b$a;->access$000(Lcom/wireguard/crypto/b$a;)I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v4, v2, 0x2

    aget-char v5, p0, v4

    xor-int/lit8 v6, v5, 0x30

    add-int/lit8 v7, v6, -0xa

    ushr-int/lit8 v7, v7, 0x8

    and-int/lit16 v7, v7, 0xff

    and-int/lit8 v5, v5, -0x21

    add-int/lit8 v8, v5, -0x37

    add-int/lit8 v9, v5, -0x41

    add-int/lit8 v5, v5, -0x47

    xor-int/2addr v5, v9

    ushr-int/lit8 v5, v5, 0x8

    and-int/lit16 v5, v5, 0xff

    or-int v9, v7, v5

    add-int/lit8 v9, v9, -0x1

    ushr-int/lit8 v9, v9, 0x8

    or-int/2addr v3, v9

    and-int/2addr v6, v7

    and-int/2addr v5, v8

    or-int/2addr v5, v6

    mul-int/lit8 v5, v5, 0x10

    add-int/lit8 v4, v4, 0x1

    aget-char v4, p0, v4

    xor-int/lit8 v6, v4, 0x30

    add-int/lit8 v7, v6, -0xa

    ushr-int/lit8 v7, v7, 0x8

    and-int/lit16 v7, v7, 0xff

    and-int/lit8 v4, v4, -0x21

    add-int/lit8 v8, v4, -0x37

    add-int/lit8 v9, v4, -0x41

    add-int/lit8 v4, v4, -0x47

    xor-int/2addr v4, v9

    ushr-int/lit8 v4, v4, 0x8

    and-int/lit16 v4, v4, 0xff

    or-int v9, v7, v4

    add-int/lit8 v9, v9, -0x1

    ushr-int/lit8 v9, v9, 0x8

    or-int/2addr v3, v9

    and-int/2addr v6, v7

    and-int/2addr v4, v8

    or-int/2addr v4, v6

    or-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-nez v3, :cond_1

    new-instance p0, Lcom/wireguard/crypto/b;

    invoke-direct {p0, v1}, Lcom/wireguard/crypto/b;-><init>([B)V

    return-object p0

    :cond_1
    new-instance p0, Lcom/wireguard/crypto/KeyFormatException;

    sget-object v0, Lcom/wireguard/crypto/b$a;->HEX:Lcom/wireguard/crypto/b$a;

    sget-object v1, Lcom/wireguard/crypto/KeyFormatException$a;->CONTENTS:Lcom/wireguard/crypto/KeyFormatException$a;

    invoke-direct {p0, v0, v1}, Lcom/wireguard/crypto/KeyFormatException;-><init>(Lcom/wireguard/crypto/b$a;Lcom/wireguard/crypto/KeyFormatException$a;)V

    throw p0

    :cond_2
    new-instance p0, Lcom/wireguard/crypto/KeyFormatException;

    sget-object v0, Lcom/wireguard/crypto/KeyFormatException$a;->LENGTH:Lcom/wireguard/crypto/KeyFormatException$a;

    invoke-direct {p0, v1, v0}, Lcom/wireguard/crypto/KeyFormatException;-><init>(Lcom/wireguard/crypto/b$a;Lcom/wireguard/crypto/KeyFormatException$a;)V

    throw p0
.end method

.method static e()Lcom/wireguard/crypto/b;
    .locals 3

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sget-object v1, Lcom/wireguard/crypto/b$a;->BINARY:Lcom/wireguard/crypto/b$a;

    invoke-virtual {v1}, Lcom/wireguard/crypto/b$a;->getLength()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 v0, 0x0

    aget-byte v2, v1, v0

    and-int/lit16 v2, v2, 0xf8

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    const/16 v0, 0x1f

    aget-byte v2, v1, v0

    and-int/lit8 v2, v2, 0x7f

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    or-int/lit8 v2, v2, 0x40

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    new-instance v0, Lcom/wireguard/crypto/b;

    invoke-direct {v0, v1}, Lcom/wireguard/crypto/b;-><init>([B)V

    return-object v0
.end method

.method static f(Lcom/wireguard/crypto/b;)Lcom/wireguard/crypto/b;
    .locals 3

    sget-object v0, Lcom/wireguard/crypto/b$a;->BINARY:Lcom/wireguard/crypto/b$a;

    invoke-virtual {v0}, Lcom/wireguard/crypto/b$a;->getLength()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p0}, Lcom/wireguard/crypto/b;->g()[B

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v2, p0, v1}, Lcom/wireguard/crypto/a;->d([BI[B[B)V

    new-instance p0, Lcom/wireguard/crypto/b;

    invoke-direct {p0, v0}, Lcom/wireguard/crypto/b;-><init>([B)V

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/wireguard/crypto/b;

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/wireguard/crypto/b;

    iget-object v0, p0, Lcom/wireguard/crypto/b;->a:[B

    iget-object p1, p1, Lcom/wireguard/crypto/b;->a:[B

    invoke-static {v0, p1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public g()[B
    .locals 2

    iget-object v0, p0, Lcom/wireguard/crypto/b;->a:[B

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x3

    sget-object v2, Lcom/wireguard/crypto/b$a;->BASE64:Lcom/wireguard/crypto/b$a;

    invoke-static {v2}, Lcom/wireguard/crypto/b$a;->access$000(Lcom/wireguard/crypto/b$a;)I

    move-result v2

    new-array v2, v2, [C

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    iget-object v5, p0, Lcom/wireguard/crypto/b;->a:[B

    array-length v6, v5

    div-int/2addr v6, v1

    if-ge v4, v6, :cond_0

    mul-int/lit8 v6, v4, 0x3

    mul-int/lit8 v7, v4, 0x4

    invoke-static {v5, v6, v2, v7}, Lcom/wireguard/crypto/b;->b([BI[CI)V

    add-int/2addr v4, v0

    goto :goto_0

    :cond_0
    mul-int/lit8 v6, v4, 0x3

    aget-byte v7, v5, v6

    add-int/2addr v6, v0

    aget-byte v5, v5, v6

    new-array v1, v1, [B

    aput-byte v7, v1, v3

    aput-byte v5, v1, v0

    const/4 v5, 0x2

    aput-byte v3, v1, v5

    mul-int/lit8 v4, v4, 0x4

    invoke-static {v1, v3, v2, v4}, Lcom/wireguard/crypto/b;->b([BI[CI)V

    sget-object v1, Lcom/wireguard/crypto/b$a;->BASE64:Lcom/wireguard/crypto/b$a;

    invoke-static {v1}, Lcom/wireguard/crypto/b$a;->access$000(Lcom/wireguard/crypto/b$a;)I

    move-result v1

    sub-int/2addr v1, v0

    const/16 v0, 0x3d

    aput-char v0, v2, v1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/wireguard/crypto/b;->a:[B

    array-length v3, v2

    div-int/lit8 v3, v3, 0x4

    if-ge v0, v3, :cond_0

    mul-int/lit8 v3, v0, 0x4

    aget-byte v4, v2, v3

    add-int/lit8 v5, v3, 0x1

    aget-byte v5, v2, v5

    shr-int/lit8 v5, v5, 0x8

    add-int/2addr v4, v5

    add-int/lit8 v5, v3, 0x2

    aget-byte v5, v2, v5

    shr-int/lit8 v5, v5, 0x10

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x3

    aget-byte v2, v2, v3

    shr-int/lit8 v2, v2, 0x18

    add-int/2addr v4, v2

    xor-int/2addr v1, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public i()Ljava/lang/String;
    .locals 6

    sget-object v0, Lcom/wireguard/crypto/b$a;->HEX:Lcom/wireguard/crypto/b$a;

    invoke-static {v0}, Lcom/wireguard/crypto/b$a;->access$000(Lcom/wireguard/crypto/b$a;)I

    move-result v0

    new-array v0, v0, [C

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/wireguard/crypto/b;->a:[B

    array-length v3, v2

    if-ge v1, v3, :cond_0

    mul-int/lit8 v3, v1, 0x2

    aget-byte v2, v2, v1

    shr-int/lit8 v4, v2, 0x4

    and-int/lit8 v4, v4, 0xf

    add-int/lit8 v4, v4, 0x57

    shr-int/lit8 v5, v2, 0x4

    and-int/lit8 v5, v5, 0xf

    add-int/lit8 v5, v5, -0xa

    shr-int/lit8 v5, v5, 0x8

    and-int/lit8 v5, v5, -0x27

    add-int/2addr v4, v5

    int-to-char v4, v4

    aput-char v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    and-int/lit8 v4, v2, 0xf

    add-int/lit8 v4, v4, 0x57

    and-int/lit8 v2, v2, 0xf

    add-int/lit8 v2, v2, -0xa

    shr-int/lit8 v2, v2, 0x8

    and-int/lit8 v2, v2, -0x27

    add-int/2addr v4, v2

    int-to-char v2, v4

    aput-char v2, v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    return-object v1
.end method
