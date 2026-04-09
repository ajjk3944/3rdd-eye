.class final Lorg/tensorflow/lite/task/vision/core/a;
.super Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:[B


# direct methods
.method constructor <init>(JJ[B)V
    .locals 0

    invoke-direct {p0}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;-><init>()V

    iput-wide p1, p0, Lorg/tensorflow/lite/task/vision/core/a;->a:J

    iput-wide p3, p0, Lorg/tensorflow/lite/task/vision/core/a;->b:J

    if-eqz p5, :cond_0

    iput-object p5, p0, Lorg/tensorflow/lite/task/vision/core/a;->c:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null byteArray"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method b()[B
    .locals 1

    iget-object v0, p0, Lorg/tensorflow/lite/task/vision/core/a;->c:[B

    return-object v0
.end method

.method c()J
    .locals 2

    iget-wide v0, p0, Lorg/tensorflow/lite/task/vision/core/a;->b:J

    return-wide v0
.end method

.method d()J
    .locals 2

    iget-wide v0, p0, Lorg/tensorflow/lite/task/vision/core/a;->a:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;

    iget-wide v3, p0, Lorg/tensorflow/lite/task/vision/core/a;->a:J

    invoke-virtual {p1}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;->d()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Lorg/tensorflow/lite/task/vision/core/a;->b:J

    invoke-virtual {p1}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;->c()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-object v1, p0, Lorg/tensorflow/lite/task/vision/core/a;->c:[B

    instance-of v3, p1, Lorg/tensorflow/lite/task/vision/core/a;

    if-eqz v3, :cond_1

    check-cast p1, Lorg/tensorflow/lite/task/vision/core/a;

    iget-object p1, p1, Lorg/tensorflow/lite/task/vision/core/a;->c:[B

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;->b()[B

    move-result-object p1

    :goto_0
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 7

    iget-wide v0, p0, Lorg/tensorflow/lite/task/vision/core/a;->a:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v0, v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-wide v3, p0, Lorg/tensorflow/lite/task/vision/core/a;->b:J

    ushr-long v5, v3, v2

    xor-long v2, v5, v3

    long-to-int v2, v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lorg/tensorflow/lite/task/vision/core/a;->c:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FrameBufferData{frameBufferHandle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lorg/tensorflow/lite/task/vision/core/a;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", byteArrayHandle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lorg/tensorflow/lite/task/vision/core/a;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", byteArray="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/tensorflow/lite/task/vision/core/a;->c:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
