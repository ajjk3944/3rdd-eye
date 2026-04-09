.class public Lorg/msgpack/core/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:B

.field private final b:I


# direct methods
.method public constructor <init>(BI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "length must be >= 0"

    invoke-static {v0, v1}, Lorg/msgpack/core/g;->b(ZLjava/lang/Object;)V

    iput-byte p1, p0, Lorg/msgpack/core/a;->a:B

    iput p2, p0, Lorg/msgpack/core/a;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lorg/msgpack/core/a;->b:I

    return v0
.end method

.method public b()B
    .locals 1

    iget-byte v0, p0, Lorg/msgpack/core/a;->a:B

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lorg/msgpack/core/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lorg/msgpack/core/a;

    iget-byte v0, p0, Lorg/msgpack/core/a;->a:B

    iget-byte v2, p1, Lorg/msgpack/core/a;->a:B

    if-ne v0, v2, :cond_0

    iget v0, p0, Lorg/msgpack/core/a;->b:I

    iget p1, p1, Lorg/msgpack/core/a;->b:I

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-byte v0, p0, Lorg/msgpack/core/a;->a:B

    add-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/msgpack/core/a;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-byte v0, p0, Lorg/msgpack/core/a;->a:B

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    iget v1, p0, Lorg/msgpack/core/a;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "ExtensionTypeHeader(type:%d, length:%,d)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
