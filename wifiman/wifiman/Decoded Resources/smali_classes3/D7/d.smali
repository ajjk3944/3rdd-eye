.class public final LD7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LE7/c;

.field private final b:LE7/a;

.field private final c:Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;

.field private final d:Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;F)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "modelAssetFile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LE7/c;

    invoke-direct {v0, p1}, LE7/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LD7/d;->a:LE7/c;

    new-instance v0, LE7/a;

    invoke-direct {v0}, LE7/a;-><init>()V

    iput-object v0, p0, LD7/d;->b:LE7/a;

    invoke-static {}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->a()Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->i(F)Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;

    move-result-object p3

    invoke-virtual {p3}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->h()Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;

    move-result-object p3

    iput-object p3, p0, LD7/d;->c:Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;

    invoke-static {p1, p2, p3}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->P(Landroid/content/Context;Ljava/lang/String;Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;)Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;

    move-result-object p1

    iput-object p1, p0, LD7/d;->d:Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;

    return-void
.end method

.method private final b(Landroid/media/Image;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string/jumbo v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LD7/d;->a:LE7/c;

    invoke-virtual {v1, p1, v0}, LE7/c;->b(Landroid/media/Image;Landroid/graphics/Bitmap;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/media/Image;I)Ljava/util/List;
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string/jumbo v2, "image"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p1}, LD7/d;->b(Landroid/media/Image;)Landroid/graphics/Bitmap;

    move-result-object v2

    iget-object v4, v0, LD7/d;->b:LE7/a;

    const/16 v5, 0x280

    invoke-virtual {v4, v2, v5}, LE7/a;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v2

    sget-object v4, LE7/b;->a:LE7/b;

    invoke-virtual {v4, v2, v1}, LE7/b;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v6, v0, LD7/d;->d:Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;

    invoke-static {v2}, Lorg/tensorflow/lite/support/image/e;->b(Landroid/graphics/Bitmap;)Lorg/tensorflow/lite/support/image/e;

    move-result-object v7

    invoke-virtual {v6, v7}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->T(Lorg/tensorflow/lite/support/image/e;)Ljava/util/List;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v4

    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getWidth()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getHeight()I

    move-result v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v5

    check-cast v6, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v6, v10}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const-string/jumbo v15, "getCategories(...)"

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/tensorflow/lite/task/vision/detector/Detection;

    invoke-virtual {v12}, Lorg/tensorflow/lite/task/vision/detector/Detection;->b()Ljava/util/List;

    move-result-object v12

    invoke-static {v12, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v12, v10}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lorg/tensorflow/lite/support/label/Category;

    invoke-virtual {v14}, Lorg/tensorflow/lite/support/label/Category;->c()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14}, Lorg/tensorflow/lite/support/label/Category;->d()F

    move-result v14

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v15, "["

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string/jumbo v14, "]"

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v13, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v10, 0xa

    goto :goto_1

    :cond_0
    const/16 v20, 0x3e

    const/16 v21, 0x0

    const-string v14, ","

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v13 .. v21}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v10, 0xa

    goto :goto_0

    :cond_1
    const/16 v16, 0x3e

    const/16 v17, 0x0

    const-string v10, ";"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    move-object/from16 v22, v15

    move-object/from16 v15, v18

    invoke-static/range {v9 .. v17}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "AR image ("

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "x"

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v3, "px) analysis took "

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo v3, "ms and detected "

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " objects. "

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v5}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/tensorflow/lite/task/vision/detector/Detection;

    invoke-virtual {v6}, Lorg/tensorflow/lite/task/vision/detector/Detection;->b()Ljava/util/List;

    move-result-object v7

    move-object/from16 v8, v22

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    move-object v9, v5

    goto :goto_3

    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_3

    goto :goto_3

    :cond_3
    move-object v10, v9

    check-cast v10, Lorg/tensorflow/lite/support/label/Category;

    invoke-virtual {v10}, Lorg/tensorflow/lite/support/label/Category;->d()F

    move-result v10

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lorg/tensorflow/lite/support/label/Category;

    invoke-virtual {v12}, Lorg/tensorflow/lite/support/label/Category;->d()F

    move-result v12

    invoke-static {v10, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v13

    if-gez v13, :cond_5

    move-object v9, v11

    move v10, v12

    :cond_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_4

    :goto_3
    check-cast v9, Lorg/tensorflow/lite/support/label/Category;

    if-nez v9, :cond_6

    move-object v7, v5

    goto/16 :goto_4

    :cond_6
    sget-object v7, LE7/b;->a:LE7/b;

    invoke-virtual {v6}, Lorg/tensorflow/lite/task/vision/detector/Detection;->a()Landroid/graphics/RectF;

    move-result-object v10

    iget v10, v10, Landroid/graphics/RectF;->left:F

    float-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v6}, Lorg/tensorflow/lite/task/vision/detector/Detection;->a()Landroid/graphics/RectF;

    move-result-object v11

    iget v11, v11, Landroid/graphics/RectF;->top:F

    float-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v10

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    invoke-virtual {v7, v10, v11, v12, v1}, LE7/b;->b(LYg/s;III)LYg/s;

    move-result-object v10

    invoke-virtual {v6}, Lorg/tensorflow/lite/task/vision/detector/Detection;->a()Landroid/graphics/RectF;

    move-result-object v11

    iget v11, v11, Landroid/graphics/RectF;->right:F

    float-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6}, Lorg/tensorflow/lite/task/vision/detector/Detection;->a()Landroid/graphics/RectF;

    move-result-object v6

    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    float-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v11, v6}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v6

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    invoke-virtual {v7, v6, v11, v12, v1}, LE7/b;->b(LYg/s;III)LYg/s;

    move-result-object v6

    new-instance v7, LD7/c;

    invoke-virtual {v9}, Lorg/tensorflow/lite/support/label/Category;->c()Ljava/lang/String;

    move-result-object v11

    const-string/jumbo v12, "getLabel(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Lorg/tensorflow/lite/support/label/Category;->d()F

    move-result v9

    new-instance v12, Landroid/graphics/Rect;

    invoke-virtual {v10}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v13

    invoke-virtual {v10}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-virtual {v6}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-virtual {v6}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-direct {v12, v13, v10, v14, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-direct {v7, v11, v9, v12}, LD7/c;-><init>(Ljava/lang/String;FLandroid/graphics/Rect;)V

    :goto_4
    if-eqz v7, :cond_7

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_7
    move-object/from16 v22, v8

    goto/16 :goto_2

    :cond_8
    return-object v3
.end method
