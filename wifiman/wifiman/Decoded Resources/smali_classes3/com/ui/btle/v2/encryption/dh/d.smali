.class public abstract Lcom/ui/btle/v2/encryption/dh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lwj/a;->a()Lwj/b;

    return-void
.end method


# virtual methods
.method protected final a([B[B[B[B)[B
    .locals 6

    const-string/jumbo v0, "privateKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "publicKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "serverPublicKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lwj/b;->h()I

    move-result v0

    new-array v1, v0, [B

    invoke-static {v1, p1, p3}, Lwj/b;->f([B[B[B)I

    move-result p1

    if-nez p1, :cond_1

    invoke-static {}, Lwj/b;->a()I

    move-result p1

    new-array v2, p1, [B

    const/4 v3, 0x0

    new-array v4, v3, [B

    invoke-static {}, Lwj/b;->d()I

    move-result v5

    new-array v5, v5, [B

    invoke-static {v5, v4, v3, p1}, Lwj/b;->c([B[BII)I

    invoke-static {v5, v1, v0}, Lwj/b;->e([B[BI)I

    array-length v0, p2

    invoke-static {v5, p2, v0}, Lwj/b;->e([B[BI)I

    array-length p2, p3

    invoke-static {v5, p3, p2}, Lwj/b;->e([B[BI)I

    if-eqz p4, :cond_0

    array-length p2, p4

    invoke-static {v5, p4, p2}, Lwj/b;->e([B[BI)I

    :cond_0
    invoke-static {v5, v2, p1}, Lwj/b;->b([B[BI)I

    return-object v2

    :cond_1
    new-instance p1, Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$KeyExchange;

    const-string p2, "Cannot prepare DH shared key result container!"

    const/4 p3, 0x2

    const/4 p4, 0x0

    invoke-direct {p1, p2, p4, p3, p4}, Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$KeyExchange;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method protected final b()[B
    .locals 2

    const/16 v0, 0x20

    new-array v1, v0, [B

    invoke-static {v1, v0}, Lwj/b;->k([BI)V

    return-object v1
.end method

.method protected final c([B)[B
    .locals 3

    const-string/jumbo v0, "privateKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x20

    new-array v0, v0, [B

    invoke-static {v0, p1}, Lwj/b;->g([B[B)I

    move-result p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance p1, Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$KeyExchange;

    const-string v0, "Cannot generate DH public key!"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$KeyExchange;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method
