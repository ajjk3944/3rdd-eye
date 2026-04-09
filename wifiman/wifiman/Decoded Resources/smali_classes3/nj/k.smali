.class public Lnj/k;
.super Lnj/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(B[B)V
    .locals 0

    const/4 p1, 0x4

    .line 1
    invoke-direct {p0, p1}, Lnj/b;-><init>(B)V

    .line 2
    new-instance p1, Ljava/io/ByteArrayInputStream;

    invoke-direct {p1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 3
    new-instance p2, Ljava/io/DataInputStream;

    invoke-direct {p2, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 4
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result p1

    iput p1, p0, Lnj/u;->b:I

    .line 5
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x4

    .line 8
    invoke-direct {p0, v0}, Lnj/b;-><init>(B)V

    .line 9
    iput p1, p0, Lnj/u;->b:I

    return-void
.end method

.method public constructor <init>(Lnj/o;)V
    .locals 1

    const/4 v0, 0x4

    .line 6
    invoke-direct {p0, v0}, Lnj/b;-><init>(B)V

    .line 7
    invoke-virtual {p1}, Lnj/u;->j()I

    move-result p1

    iput p1, p0, Lnj/u;->b:I

    return-void
.end method


# virtual methods
.method protected o()[B
    .locals 1

    invoke-virtual {p0}, Lnj/u;->f()[B

    move-result-object v0

    return-object v0
.end method
