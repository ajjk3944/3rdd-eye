.class public abstract enum Lorg/tensorflow/lite/support/image/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lorg/tensorflow/lite/support/image/b;

.field private static final BATCH_DIM:I = 0x0

.field private static final BATCH_VALUE:I = 0x1

.field private static final CHANNEL_DIM:I = 0x3

.field public static final enum GRAYSCALE:Lorg/tensorflow/lite/support/image/b;

.field private static final HEIGHT_DIM:I = 0x1

.field public static final enum NV12:Lorg/tensorflow/lite/support/image/b;

.field public static final enum NV21:Lorg/tensorflow/lite/support/image/b;

.field public static final enum RGB:Lorg/tensorflow/lite/support/image/b;

.field private static final WIDTH_DIM:I = 0x2

.field public static final enum YUV_420_888:Lorg/tensorflow/lite/support/image/b;

.field public static final enum YV12:Lorg/tensorflow/lite/support/image/b;

.field public static final enum YV21:Lorg/tensorflow/lite/support/image/b;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lorg/tensorflow/lite/support/image/b$a;

    const-string v1, "RGB"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/tensorflow/lite/support/image/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/tensorflow/lite/support/image/b;->RGB:Lorg/tensorflow/lite/support/image/b;

    new-instance v1, Lorg/tensorflow/lite/support/image/b$b;

    const-string v3, "GRAYSCALE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lorg/tensorflow/lite/support/image/b$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/tensorflow/lite/support/image/b;->GRAYSCALE:Lorg/tensorflow/lite/support/image/b;

    new-instance v3, Lorg/tensorflow/lite/support/image/b$c;

    const-string v5, "NV12"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lorg/tensorflow/lite/support/image/b$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lorg/tensorflow/lite/support/image/b;->NV12:Lorg/tensorflow/lite/support/image/b;

    new-instance v5, Lorg/tensorflow/lite/support/image/b$d;

    const-string v7, "NV21"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lorg/tensorflow/lite/support/image/b$d;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lorg/tensorflow/lite/support/image/b;->NV21:Lorg/tensorflow/lite/support/image/b;

    new-instance v7, Lorg/tensorflow/lite/support/image/b$e;

    const-string v9, "YV12"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lorg/tensorflow/lite/support/image/b$e;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lorg/tensorflow/lite/support/image/b;->YV12:Lorg/tensorflow/lite/support/image/b;

    new-instance v9, Lorg/tensorflow/lite/support/image/b$f;

    const-string v11, "YV21"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lorg/tensorflow/lite/support/image/b$f;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lorg/tensorflow/lite/support/image/b;->YV21:Lorg/tensorflow/lite/support/image/b;

    new-instance v11, Lorg/tensorflow/lite/support/image/b$g;

    const-string v13, "YUV_420_888"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Lorg/tensorflow/lite/support/image/b$g;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lorg/tensorflow/lite/support/image/b;->YUV_420_888:Lorg/tensorflow/lite/support/image/b;

    const/4 v13, 0x7

    new-array v13, v13, [Lorg/tensorflow/lite/support/image/b;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lorg/tensorflow/lite/support/image/b;->$VALUES:[Lorg/tensorflow/lite/support/image/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput p3, p0, Lorg/tensorflow/lite/support/image/b;->value:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IILorg/tensorflow/lite/support/image/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lorg/tensorflow/lite/support/image/b;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method static synthetic access$100([III)[I
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/tensorflow/lite/support/image/b;->insertValue([III)[I

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(II)I
    .locals 0

    invoke-static {p0, p1}, Lorg/tensorflow/lite/support/image/b;->getYuv420NumElements(II)I

    move-result p0

    return p0
.end method

.method private assertRgbOrGrayScale(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lorg/tensorflow/lite/support/image/b;->RGB:Lorg/tensorflow/lite/support/image/b;

    if-eq p0, v0, :cond_1

    sget-object v0, Lorg/tensorflow/lite/support/image/b;->GRAYSCALE:Lorg/tensorflow/lite/support/image/b;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " only supports RGB and GRAYSCALE formats, but not "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method static fromBitmapConfig(Landroid/graphics/Bitmap$Config;)Lorg/tensorflow/lite/support/image/b;
    .locals 3

    sget-object v0, Lorg/tensorflow/lite/support/image/b$h;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object p0, Lorg/tensorflow/lite/support/image/b;->GRAYSCALE:Lorg/tensorflow/lite/support/image/b;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bitmap configuration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", is not supported yet."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lorg/tensorflow/lite/support/image/b;->RGB:Lorg/tensorflow/lite/support/image/b;

    return-object p0
.end method

.method static fromImageFormat(I)Lorg/tensorflow/lite/support/image/b;
    .locals 3

    const/16 v0, 0x11

    if-eq p0, v0, :cond_2

    const/16 v0, 0x23

    if-eq p0, v0, :cond_1

    const v0, 0x32315659

    if-ne p0, v0, :cond_0

    sget-object p0, Lorg/tensorflow/lite/support/image/b;->YV12:Lorg/tensorflow/lite/support/image/b;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ImageFormat: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", is not supported yet."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lorg/tensorflow/lite/support/image/b;->YUV_420_888:Lorg/tensorflow/lite/support/image/b;

    return-object p0

    :cond_2
    sget-object p0, Lorg/tensorflow/lite/support/image/b;->NV21:Lorg/tensorflow/lite/support/image/b;

    return-object p0
.end method

.method private static getYuv420NumElements(II)I
    .locals 1

    mul-int v0, p0, p1

    add-int/lit8 p0, p0, 0x1

    div-int/lit8 p0, p0, 0x2

    add-int/lit8 p1, p1, 0x1

    div-int/lit8 p1, p1, 0x2

    mul-int/2addr p0, p1

    mul-int/lit8 p0, p0, 0x2

    add-int/2addr v0, p0

    return v0
.end method

.method private static insertValue([III)[I
    .locals 4

    array-length v0, p0

    add-int/lit8 v0, v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget v3, p0, v2

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    aput p2, v1, p1

    :goto_1
    add-int/lit8 p1, p1, 0x1

    if-ge p1, v0, :cond_1

    add-int/lit8 p2, p1, -0x1

    aget p2, p0, p2

    aput p2, v1, p1

    goto :goto_1

    :cond_1
    return-object v1
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/tensorflow/lite/support/image/b;
    .locals 1

    const-class v0, Lorg/tensorflow/lite/support/image/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/tensorflow/lite/support/image/b;

    return-object p0
.end method

.method public static values()[Lorg/tensorflow/lite/support/image/b;
    .locals 1

    sget-object v0, Lorg/tensorflow/lite/support/image/b;->$VALUES:[Lorg/tensorflow/lite/support/image/b;

    invoke-virtual {v0}, [Lorg/tensorflow/lite/support/image/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/tensorflow/lite/support/image/b;

    return-object v0
.end method


# virtual methods
.method assertNumElements(III)V
    .locals 4

    invoke-virtual {p0, p2, p3}, Lorg/tensorflow/lite/support/image/b;->getNumElements(II)I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0, p2, p3}, Lorg/tensorflow/lite/support/image/b;->getNumElements(II)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, v1, v2, v3, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "The given number of elements (%d) does not match the image (%s) in %d x %d. The expected number of elements should be at least %d."

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LIj/a;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method assertShape([I)V
    .locals 3

    const-string v0, "assertShape()"

    invoke-direct {p0, v0}, Lorg/tensorflow/lite/support/image/b;->assertRgbOrGrayScale(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lorg/tensorflow/lite/support/image/b;->getNormalizedShape([I)[I

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/tensorflow/lite/support/image/b;->isValidNormalizedShape([I)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/tensorflow/lite/support/image/b;->getShapeInfoMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "The provided image shape is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LIj/a;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method convertTensorBufferToBitmap(LJj/a;)Landroid/graphics/Bitmap;
    .locals 2

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "convertTensorBufferToBitmap() is unsupported for the color space type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method getChannelValue()I
    .locals 3

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getChannelValue() is unsupported for the color space type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method getHeight([I)I
    .locals 1

    const-string v0, "getHeight()"

    invoke-direct {p0, v0}, Lorg/tensorflow/lite/support/image/b;->assertRgbOrGrayScale(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lorg/tensorflow/lite/support/image/b;->assertShape([I)V

    invoke-virtual {p0, p1}, Lorg/tensorflow/lite/support/image/b;->getNormalizedShape([I)[I

    move-result-object p1

    const/4 v0, 0x1

    aget p1, p1, v0

    return p1
.end method

.method getNormalizedShape([I)[I
    .locals 2

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getNormalizedShape() is unsupported for the color space type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method abstract getNumElements(II)I
.end method

.method getShapeInfoMessage()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getShapeInfoMessage() is unsupported for the color space type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getValue()I
    .locals 1

    iget v0, p0, Lorg/tensorflow/lite/support/image/b;->value:I

    return v0
.end method

.method getWidth([I)I
    .locals 1

    const-string v0, "getWidth()"

    invoke-direct {p0, v0}, Lorg/tensorflow/lite/support/image/b;->assertRgbOrGrayScale(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lorg/tensorflow/lite/support/image/b;->assertShape([I)V

    invoke-virtual {p0, p1}, Lorg/tensorflow/lite/support/image/b;->getNormalizedShape([I)[I

    move-result-object p1

    const/4 v0, 0x2

    aget p1, p1, v0

    return p1
.end method

.method protected isValidNormalizedShape([I)Z
    .locals 3

    const/4 v0, 0x0

    aget v1, p1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    aget v1, p1, v2

    if-lez v1, :cond_0

    const/4 v1, 0x2

    aget v1, p1, v1

    if-lez v1, :cond_0

    const/4 v1, 0x3

    aget p1, p1, v1

    invoke-virtual {p0}, Lorg/tensorflow/lite/support/image/b;->getChannelValue()I

    move-result v1

    if-ne p1, v1, :cond_0

    move v0, v2

    :cond_0
    return v0
.end method

.method toBitmapConfig()Landroid/graphics/Bitmap$Config;
    .locals 3

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "toBitmapConfig() is unsupported for the color space type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
