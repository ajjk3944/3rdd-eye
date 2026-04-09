.class public Lxj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxj/a;->a:[B

    const/16 v0, 0x20

    invoke-static {p1, v0}, Lxj/b;->a([BI)V

    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 3

    const/16 v0, 0x18

    invoke-static {p1, v0}, Lxj/b;->a([BI)V

    const/16 v0, 0x10

    invoke-static {v0, p2}, Lxj/b;->c(I[B)[B

    move-result-object p2

    array-length v0, p2

    invoke-static {v0}, Lxj/b;->e(I)[B

    move-result-object v0

    invoke-static {}, Lwj/a;->a()Lwj/b;

    array-length v1, p2

    iget-object v2, p0, Lxj/a;->a:[B

    invoke-static {v0, p2, v1, p1, v2}, Lwj/b;->j([B[BI[B[B)I

    move-result p1

    const-string p2, "Decryption failed. Ciphertext failed verification"

    invoke-static {p1, p2}, Lxj/b;->b(ILjava/lang/String;)Z

    const/16 p1, 0x20

    invoke-static {p1, v0}, Lxj/b;->d(I[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 3

    const/16 v0, 0x18

    invoke-static {p1, v0}, Lxj/b;->a([BI)V

    const/16 v0, 0x20

    invoke-static {v0, p2}, Lxj/b;->c(I[B)[B

    move-result-object p2

    array-length v0, p2

    invoke-static {v0}, Lxj/b;->e(I)[B

    move-result-object v0

    invoke-static {}, Lwj/a;->a()Lwj/b;

    array-length v1, p2

    iget-object v2, p0, Lxj/a;->a:[B

    invoke-static {v0, p2, v1, p1, v2}, Lwj/b;->i([B[BI[B[B)I

    move-result p1

    const-string/jumbo p2, "Encryption failed"

    invoke-static {p1, p2}, Lxj/b;->b(ILjava/lang/String;)Z

    const/16 p1, 0x10

    invoke-static {p1, v0}, Lxj/b;->d(I[B)[B

    move-result-object p1

    return-object p1
.end method
