.class public abstract Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;
.super LKj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;,
        Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$c;
    }
.end annotation


# direct methods
.method protected constructor <init>(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LKj/a;-><init>(J)V

    return-void
.end method

.method private static native createFrameBufferFromByteBuffer(Ljava/nio/ByteBuffer;IIII)J
.end method

.method private static native createFrameBufferFromBytes([BIIII[J)J
.end method

.method private static native createFrameBufferFromPlanes(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII)J
.end method

.method private static native deleteFrameBuffer(JJ[B)V
.end method

.method private static j(Lorg/tensorflow/lite/support/image/e;I)Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;
    .locals 3

    invoke-virtual {p0}, Lorg/tensorflow/lite/support/image/e;->d()Lorg/tensorflow/lite/support/image/b;

    move-result-object v0

    sget-object v1, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Color space type, "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", is unsupported."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    invoke-static {p0, p1}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;->s(Lorg/tensorflow/lite/support/image/e;I)Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;

    move-result-object p0

    return-object p0

    :pswitch_1
    invoke-static {p0, p1}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;->p(Lorg/tensorflow/lite/support/image/e;I)Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static p(Lorg/tensorflow/lite/support/image/e;I)Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;
    .locals 10

    invoke-virtual {p0}, Lorg/tensorflow/lite/support/image/e;->e()Lorg/tensorflow/lite/a;

    move-result-object v0

    sget-object v1, Lorg/tensorflow/lite/a;->UINT8:Lorg/tensorflow/lite/a;

    if-ne v0, v1, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-static {p0, v1}, Lorg/tensorflow/lite/support/image/e;->a(Lorg/tensorflow/lite/support/image/e;Lorg/tensorflow/lite/a;)Lorg/tensorflow/lite/support/image/e;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Lorg/tensorflow/lite/support/image/e;->c()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p0}, Lorg/tensorflow/lite/support/image/e;->d()Lorg/tensorflow/lite/support/image/b;

    move-result-object p0

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lorg/tensorflow/lite/support/image/e;->i()I

    move-result v2

    invoke-virtual {v0}, Lorg/tensorflow/lite/support/image/e;->f()I

    move-result v0

    invoke-virtual {p0}, Lorg/tensorflow/lite/support/image/b;->getValue()I

    move-result p0

    invoke-static {v1, v2, v0, p1, p0}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;->createFrameBufferFromByteBuffer(Ljava/nio/ByteBuffer;IIII)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    new-array v2, v3, [B

    invoke-static {p0, p1, v0, v1, v2}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;->a(JJ[B)Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v2, 0x1

    new-array v2, v2, [J

    invoke-static {v1}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;->v(Ljava/nio/ByteBuffer;)[B

    move-result-object v1

    invoke-virtual {v0}, Lorg/tensorflow/lite/support/image/e;->i()I

    move-result v5

    invoke-virtual {v0}, Lorg/tensorflow/lite/support/image/e;->f()I

    move-result v6

    invoke-virtual {p0}, Lorg/tensorflow/lite/support/image/b;->getValue()I

    move-result v8

    move-object v4, v1

    move v7, p1

    move-object v9, v2

    invoke-static/range {v4 .. v9}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;->createFrameBufferFromBytes([BIIII[J)J

    move-result-wide p0

    aget-wide v3, v2, v3

    invoke-static {p0, p1, v3, v4, v1}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;->a(JJ[B)Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;

    move-result-object p0

    return-object p0
.end method

.method private static s(Lorg/tensorflow/lite/support/image/e;I)Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;
    .locals 13

    invoke-virtual {p0}, Lorg/tensorflow/lite/support/image/e;->g()Landroid/media/Image;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/Image;->getFormat()I

    move-result v0

    const/16 v1, 0x23

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v1, "Only supports loading YUV_420_888 Image."

    invoke-static {v0, v1}, LIj/a;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v0

    array-length v1, v0

    const/4 v4, 0x3

    if-ne v1, v4, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    array-length v4, v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "The input image should have 3 planes, but got %d plane(s)."

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, LIj/a;->b(ZLjava/lang/Object;)V

    array-length v1, v0

    move v4, v2

    :goto_2
    if-ge v4, v1, :cond_2

    aget-object v5, v0, v4

    invoke-virtual {v5}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v5

    const-string v6, "The image buffer is corrupted and the plane is null."

    invoke-static {v5, v6}, LIj/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v6

    const-string v7, "The image plane buffer is not a direct ByteBuffer, and is not supported."

    invoke-static {v6, v7}, LIj/a;->b(ZLjava/lang/Object;)V

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    aget-object v1, v0, v2

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v4

    aget-object v1, v0, v3

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v5

    const/4 v1, 0x2

    aget-object v1, v0, v1

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-virtual {p0}, Landroid/media/Image;->getWidth()I

    move-result v7

    invoke-virtual {p0}, Landroid/media/Image;->getHeight()I

    move-result v8

    aget-object p0, v0, v2

    invoke-virtual {p0}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v9

    aget-object p0, v0, v3

    invoke-virtual {p0}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v10

    aget-object p0, v0, v3

    invoke-virtual {p0}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v11

    move v12, p1

    invoke-static/range {v4 .. v12}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;->createFrameBufferFromPlanes(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    new-array v2, v2, [B

    invoke-static {p0, p1, v0, v1, v2}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;->a(JJ[B)Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;

    move-result-object p0

    return-object p0
.end method

.method private static v(Ljava/nio/ByteBuffer;)[B
    .locals 3

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    return-object v1
.end method


# virtual methods
.method protected y(Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$c;Lorg/tensorflow/lite/support/image/e;LLj/b;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p3}, LLj/b;->b()LLj/b$b;

    move-result-object v0

    invoke-virtual {v0}, LLj/b$b;->getValue()I

    move-result v0

    invoke-static {p2, v0}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;->j(Lorg/tensorflow/lite/support/image/e;I)Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;

    move-result-object v0

    invoke-virtual {v0}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;->d()J

    move-result-wide v2

    invoke-virtual {p2}, Lorg/tensorflow/lite/support/image/e;->i()I

    move-result v4

    invoke-virtual {p2}, Lorg/tensorflow/lite/support/image/e;->f()I

    move-result v5

    move-object v1, p1

    move-object v6, p3

    invoke-interface/range {v1 .. v6}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$c;->a(JIILLj/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;->d()J

    move-result-wide p2

    invoke-virtual {v0}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;->c()J

    move-result-wide v1

    invoke-virtual {v0}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;->b()[B

    move-result-object v0

    invoke-static {p2, p3, v1, v2, v0}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;->deleteFrameBuffer(JJ[B)V

    return-object p1
.end method
