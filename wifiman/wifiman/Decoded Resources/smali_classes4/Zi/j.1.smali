.class public final LZi/j;
.super LZi/K0;
.source "SourceFile"


# instance fields
.field private a:[B

.field private b:I


# direct methods
.method public constructor <init>([B)V
    .locals 1

    const-string v0, "bufferWithData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZi/K0;-><init>()V

    iput-object p1, p0, LZi/j;->a:[B

    array-length p1, p1

    iput p1, p0, LZi/j;->b:I

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, LZi/j;->b(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZi/j;->f()[B

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 2

    iget-object v0, p0, LZi/j;->a:[B

    array-length v1, v0

    if-ge v1, p1, :cond_0

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {p1, v1}, Lsh/m;->d(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LZi/j;->a:[B

    :cond_0
    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, LZi/j;->b:I

    return v0
.end method

.method public final e(B)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, LZi/K0;->c(LZi/K0;IILjava/lang/Object;)V

    iget-object v0, p0, LZi/j;->a:[B

    invoke-virtual {p0}, LZi/j;->d()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LZi/j;->b:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public f()[B
    .locals 2

    iget-object v0, p0, LZi/j;->a:[B

    invoke-virtual {p0}, LZi/j;->d()I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
