.class public final LE7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/renderscript/RenderScript;

.field private final b:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

.field private c:I

.field private d:[B

.field private e:Landroid/renderscript/Allocation;

.field private f:Landroid/renderscript/Allocation;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object p1

    iput-object p1, p0, LE7/c;->a:Landroid/renderscript/RenderScript;

    invoke-static {p1}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    move-result-object p1

    iput-object p1, p0, LE7/c;->b:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    const/4 p1, -0x1

    iput p1, p0, LE7/c;->c:I

    return-void
.end method

.method private final a(Landroid/media/Image;[B)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getFormat()I

    new-instance v2, Landroid/graphics/Rect;

    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getWidth()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getHeight()I

    move-result v4

    const/4 v5, 0x0

    invoke-direct {v2, v5, v5, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    array-length v4, v3

    move v6, v5

    move v7, v6

    :goto_0
    if-ge v6, v4, :cond_8

    aget-object v8, v3, v6

    add-int/lit8 v9, v7, 0x1

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eqz v7, :cond_2

    if-eq v7, v11, :cond_1

    if-eq v7, v10, :cond_0

    move-object/from16 v19, v2

    move-object/from16 v17, v3

    move/from16 v18, v4

    move v8, v5

    goto/16 :goto_8

    :cond_0
    iget v12, v0, LE7/c;->c:I

    :goto_1
    move v13, v10

    goto :goto_2

    :cond_1
    iget v12, v0, LE7/c;->c:I

    add-int/2addr v12, v11

    goto :goto_1

    :cond_2
    move v12, v5

    move v13, v11

    :goto_2
    invoke-virtual {v8}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v14

    invoke-virtual {v8}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v15

    invoke-virtual {v8}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v5

    if-nez v7, :cond_3

    move-object v7, v2

    move-object/from16 v17, v3

    move/from16 v18, v4

    goto :goto_3

    :cond_3
    new-instance v7, Landroid/graphics/Rect;

    iget v11, v2, Landroid/graphics/Rect;->left:I

    div-int/2addr v11, v10

    iget v0, v2, Landroid/graphics/Rect;->top:I

    div-int/2addr v0, v10

    move-object/from16 v17, v3

    iget v3, v2, Landroid/graphics/Rect;->right:I

    div-int/2addr v3, v10

    move/from16 v18, v4

    iget v4, v2, Landroid/graphics/Rect;->bottom:I

    div-int/2addr v4, v10

    invoke-direct {v7, v11, v0, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    :goto_3
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v3

    invoke-virtual {v8}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v4

    new-array v4, v4, [B

    const/4 v8, 0x1

    if-ne v5, v8, :cond_4

    if-ne v13, v8, :cond_4

    move v10, v0

    goto :goto_4

    :cond_4
    add-int/lit8 v10, v0, -0x1

    mul-int/2addr v10, v5

    add-int/2addr v10, v8

    :goto_4
    const/4 v11, 0x0

    :goto_5
    if-ge v11, v3, :cond_7

    iget v8, v7, Landroid/graphics/Rect;->top:I

    add-int/2addr v8, v11

    mul-int/2addr v8, v15

    move-object/from16 v19, v2

    iget v2, v7, Landroid/graphics/Rect;->left:I

    mul-int/2addr v2, v5

    add-int/2addr v8, v2

    invoke-virtual {v14, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v2, 0x1

    if-ne v5, v2, :cond_5

    if-ne v13, v2, :cond_5

    invoke-virtual {v14, v1, v12, v10}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    add-int/2addr v12, v10

    const/4 v8, 0x0

    goto :goto_7

    :cond_5
    const/4 v8, 0x0

    invoke-virtual {v14, v4, v8, v10}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    move v2, v8

    :goto_6
    if-ge v2, v0, :cond_6

    mul-int v16, v2, v5

    aget-byte v16, v4, v16

    aput-byte v16, v1, v12

    add-int/2addr v12, v13

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_6
    :goto_7
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v19

    const/4 v8, 0x1

    goto :goto_5

    :cond_7
    move-object/from16 v19, v2

    const/4 v8, 0x0

    :goto_8
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    move v5, v8

    move v7, v9

    move-object/from16 v3, v17

    move/from16 v4, v18

    move-object/from16 v2, v19

    goto/16 :goto_0

    :cond_8
    return-void
.end method


# virtual methods
.method public final declared-synchronized b(Landroid/media/Image;Landroid/graphics/Bitmap;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string/jumbo v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "output"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE7/c;->d:[B

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    iput v0, p0, LE7/c;->c:I

    const/16 v0, 0x23

    invoke-static {v0}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v0

    iget v1, p0, LE7/c;->c:I

    mul-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x8

    new-array v0, v1, [B

    iput-object v0, p0, LE7/c;->d:[B

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    :goto_0
    iget-object v0, p0, LE7/c;->d:[B

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const-string/jumbo v0, "yuvBuffer"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-direct {p0, p1, v0}, LE7/c;->a(Landroid/media/Image;[B)V

    iget-object p1, p0, LE7/c;->e:Landroid/renderscript/Allocation;

    if-nez p1, :cond_3

    new-instance p1, Landroid/renderscript/Type$Builder;

    iget-object v0, p0, LE7/c;->a:Landroid/renderscript/RenderScript;

    invoke-static {v0}, Landroid/renderscript/Element;->YUV(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v2

    invoke-direct {p1, v0, v2}, Landroid/renderscript/Type$Builder;-><init>(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)V

    const/16 v0, 0x11

    invoke-virtual {p1, v0}, Landroid/renderscript/Type$Builder;->setYuvFormat(I)Landroid/renderscript/Type$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/renderscript/Type$Builder;->create()Landroid/renderscript/Type;

    move-result-object p1

    iget-object v0, p0, LE7/c;->a:Landroid/renderscript/RenderScript;

    invoke-virtual {p1}, Landroid/renderscript/Type;->getElement()Landroid/renderscript/Element;

    move-result-object p1

    iget-object v2, p0, LE7/c;->d:[B

    if-nez v2, :cond_2

    const-string/jumbo v2, "yuvBuffer"

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v2, v1

    :cond_2
    array-length v2, v2

    invoke-static {v0, p1, v2}, Landroid/renderscript/Allocation;->createSized(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;I)Landroid/renderscript/Allocation;

    move-result-object p1

    iput-object p1, p0, LE7/c;->e:Landroid/renderscript/Allocation;

    :cond_3
    iget-object p1, p0, LE7/c;->f:Landroid/renderscript/Allocation;

    if-nez p1, :cond_4

    iget-object p1, p0, LE7/c;->a:Landroid/renderscript/RenderScript;

    invoke-static {p1, p2}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    move-result-object p1

    iput-object p1, p0, LE7/c;->f:Landroid/renderscript/Allocation;

    :cond_4
    iget-object p1, p0, LE7/c;->e:Landroid/renderscript/Allocation;

    if-nez p1, :cond_5

    const-string/jumbo p1, "inputAllocation"

    invoke-static {p1}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object p1, v1

    :cond_5
    iget-object v0, p0, LE7/c;->d:[B

    if-nez v0, :cond_6

    const-string/jumbo v0, "yuvBuffer"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_6
    invoke-virtual {p1, v0}, Landroid/renderscript/Allocation;->copyFrom([B)V

    iget-object p1, p0, LE7/c;->b:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    iget-object v0, p0, LE7/c;->e:Landroid/renderscript/Allocation;

    if-nez v0, :cond_7

    const-string/jumbo v0, "inputAllocation"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_7
    invoke-virtual {p1, v0}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->setInput(Landroid/renderscript/Allocation;)V

    iget-object p1, p0, LE7/c;->b:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    iget-object v0, p0, LE7/c;->f:Landroid/renderscript/Allocation;

    if-nez v0, :cond_8

    const-string/jumbo v0, "outputAllocation"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_8
    invoke-virtual {p1, v0}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->forEach(Landroid/renderscript/Allocation;)V

    iget-object p1, p0, LE7/c;->f:Landroid/renderscript/Allocation;

    if-nez p1, :cond_9

    const-string/jumbo p1, "outputAllocation"

    invoke-static {p1}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_9
    move-object v1, p1

    :goto_1
    invoke-virtual {v1, p2}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
