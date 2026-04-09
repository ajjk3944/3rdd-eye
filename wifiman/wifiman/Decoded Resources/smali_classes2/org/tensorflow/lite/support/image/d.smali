.class abstract Lorg/tensorflow/lite/support/image/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Landroid/graphics/Bitmap;LJj/a;)V
    .locals 12

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    mul-int v10, v8, v9

    new-array v11, v10, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, v11

    move v3, v8

    move v6, v8

    move v7, v9

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    mul-int/lit8 p0, v10, 0x3

    const/4 v0, 0x3

    filled-new-array {v9, v8, v0}, [I

    move-result-object v1

    sget-object v2, Lorg/tensorflow/lite/support/image/d$a;->a:[I

    invoke-virtual {p1}, LJj/a;->h()Lorg/tensorflow/lite/a;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v4, :cond_2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    new-array p0, p0, [F

    move v2, v3

    :goto_0
    if-ge v3, v10, :cond_0

    add-int/lit8 v4, v2, 0x1

    aget v5, v11, v3

    shr-int/lit8 v6, v5, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    aput v6, p0, v2

    add-int/lit8 v6, v2, 0x2

    shr-int/lit8 v7, v5, 0x8

    and-int/lit16 v7, v7, 0xff

    int-to-float v7, v7

    aput v7, p0, v4

    add-int/2addr v2, v0

    and-int/lit16 v4, v5, 0xff

    int-to-float v4, v4

    aput v4, p0, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0, v1}, LJj/a;->o([F[I)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The type of TensorBuffer, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LJj/a;->g()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", is unsupported."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-array v2, p0, [B

    move v4, v3

    :goto_1
    if-ge v3, v10, :cond_3

    add-int/lit8 v5, v4, 0x1

    aget v6, v11, v3

    shr-int/lit8 v7, v6, 0x10

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, v2, v4

    add-int/lit8 v7, v4, 0x2

    shr-int/lit8 v8, v6, 0x8

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v2, v5

    add-int/2addr v4, v0

    and-int/lit16 v5, v6, 0xff

    int-to-byte v5, v5

    aput-byte v5, v2, v7

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p0, v1}, LJj/a;->q(Ljava/nio/ByteBuffer;[I)V

    :goto_2
    return-void
.end method

.method static b(LJj/a;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p0}, LJj/a;->h()Lorg/tensorflow/lite/a;

    move-result-object v0

    sget-object v1, Lorg/tensorflow/lite/a;->UINT8:Lorg/tensorflow/lite/a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, v1}, LJj/a;->f(LJj/a;Lorg/tensorflow/lite/a;)LJj/a;

    move-result-object p0

    :goto_0
    invoke-virtual {p0}, LJj/a;->k()[I

    move-result-object v0

    sget-object v1, Lorg/tensorflow/lite/support/image/b;->GRAYSCALE:Lorg/tensorflow/lite/support/image/b;

    invoke-virtual {v1, v0}, Lorg/tensorflow/lite/support/image/b;->assertShape([I)V

    invoke-virtual {v1, v0}, Lorg/tensorflow/lite/support/image/b;->getWidth([I)I

    move-result v2

    invoke-virtual {v1, v0}, Lorg/tensorflow/lite/support/image/b;->getHeight([I)I

    move-result v0

    invoke-virtual {v1}, Lorg/tensorflow/lite/support/image/b;->toBitmapConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    invoke-static {v2, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0}, LJj/a;->g()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p0}, LJj/a;->g()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    return-object v0
.end method

.method static c(LJj/a;)Landroid/graphics/Bitmap;
    .locals 10

    invoke-virtual {p0}, LJj/a;->k()[I

    move-result-object v0

    sget-object v1, Lorg/tensorflow/lite/support/image/b;->RGB:Lorg/tensorflow/lite/support/image/b;

    invoke-virtual {v1, v0}, Lorg/tensorflow/lite/support/image/b;->assertShape([I)V

    invoke-virtual {v1, v0}, Lorg/tensorflow/lite/support/image/b;->getHeight([I)I

    move-result v9

    invoke-virtual {v1, v0}, Lorg/tensorflow/lite/support/image/b;->getWidth([I)I

    move-result v8

    invoke-virtual {v1}, Lorg/tensorflow/lite/support/image/b;->toBitmapConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    invoke-static {v8, v9, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    mul-int v1, v8, v9

    new-array v3, v1, [I

    invoke-virtual {p0}, LJj/a;->j()[I

    move-result-object p0

    const/4 v2, 0x0

    move v4, v2

    :goto_0
    if-ge v2, v1, :cond_0

    add-int/lit8 v5, v4, 0x1

    aget v6, p0, v4

    add-int/lit8 v7, v4, 0x2

    aget v5, p0, v5

    add-int/lit8 v4, v4, 0x3

    aget v7, p0, v7

    invoke-static {v6, v5, v7}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    move v5, v8

    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v0
.end method
