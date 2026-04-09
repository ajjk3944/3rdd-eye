.class public Lorg/tensorflow/lite/support/image/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lorg/tensorflow/lite/a;

.field private b:Lorg/tensorflow/lite/support/image/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/tensorflow/lite/a;->UINT8:Lorg/tensorflow/lite/a;

    invoke-direct {p0, v0}, Lorg/tensorflow/lite/support/image/e;-><init>(Lorg/tensorflow/lite/a;)V

    return-void
.end method

.method public constructor <init>(Lorg/tensorflow/lite/a;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lorg/tensorflow/lite/support/image/e;->b:Lorg/tensorflow/lite/support/image/c;

    .line 4
    sget-object v0, Lorg/tensorflow/lite/a;->UINT8:Lorg/tensorflow/lite/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lorg/tensorflow/lite/a;->FLOAT32:Lorg/tensorflow/lite/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "Illegal data type for TensorImage: Only FLOAT32 and UINT8 are accepted"

    invoke-static {v0, v1}, LIj/a;->b(ZLjava/lang/Object;)V

    .line 5
    iput-object p1, p0, Lorg/tensorflow/lite/support/image/e;->a:Lorg/tensorflow/lite/a;

    return-void
.end method

.method public static a(Lorg/tensorflow/lite/support/image/e;Lorg/tensorflow/lite/a;)Lorg/tensorflow/lite/support/image/e;
    .locals 1

    new-instance v0, Lorg/tensorflow/lite/support/image/e;

    invoke-direct {v0, p1}, Lorg/tensorflow/lite/support/image/e;-><init>(Lorg/tensorflow/lite/a;)V

    iget-object p0, p0, Lorg/tensorflow/lite/support/image/e;->b:Lorg/tensorflow/lite/support/image/c;

    invoke-interface {p0}, Lorg/tensorflow/lite/support/image/c;->clone()Lorg/tensorflow/lite/support/image/c;

    move-result-object p0

    iput-object p0, v0, Lorg/tensorflow/lite/support/image/e;->b:Lorg/tensorflow/lite/support/image/c;

    return-object v0
.end method

.method public static b(Landroid/graphics/Bitmap;)Lorg/tensorflow/lite/support/image/e;
    .locals 1

    new-instance v0, Lorg/tensorflow/lite/support/image/e;

    invoke-direct {v0}, Lorg/tensorflow/lite/support/image/e;-><init>()V

    invoke-virtual {v0, p0}, Lorg/tensorflow/lite/support/image/e;->j(Landroid/graphics/Bitmap;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/nio/ByteBuffer;
    .locals 1

    invoke-virtual {p0}, Lorg/tensorflow/lite/support/image/e;->h()LJj/a;

    move-result-object v0

    invoke-virtual {v0}, LJj/a;->g()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public d()Lorg/tensorflow/lite/support/image/b;
    .locals 2

    iget-object v0, p0, Lorg/tensorflow/lite/support/image/e;->b:Lorg/tensorflow/lite/support/image/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/tensorflow/lite/support/image/c;->c()Lorg/tensorflow/lite/support/image/b;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No image has been loaded yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Lorg/tensorflow/lite/a;
    .locals 1

    iget-object v0, p0, Lorg/tensorflow/lite/support/image/e;->a:Lorg/tensorflow/lite/a;

    return-object v0
.end method

.method public f()I
    .locals 2

    iget-object v0, p0, Lorg/tensorflow/lite/support/image/e;->b:Lorg/tensorflow/lite/support/image/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/tensorflow/lite/support/image/c;->getHeight()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No image has been loaded yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Landroid/media/Image;
    .locals 2

    iget-object v0, p0, Lorg/tensorflow/lite/support/image/e;->b:Lorg/tensorflow/lite/support/image/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/tensorflow/lite/support/image/c;->b()Landroid/media/Image;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No image has been loaded yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()LJj/a;
    .locals 2

    iget-object v0, p0, Lorg/tensorflow/lite/support/image/e;->b:Lorg/tensorflow/lite/support/image/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/tensorflow/lite/support/image/e;->a:Lorg/tensorflow/lite/a;

    invoke-interface {v0, v1}, Lorg/tensorflow/lite/support/image/c;->a(Lorg/tensorflow/lite/a;)LJj/a;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No image has been loaded yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i()I
    .locals 2

    iget-object v0, p0, Lorg/tensorflow/lite/support/image/e;->b:Lorg/tensorflow/lite/support/image/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/tensorflow/lite/support/image/c;->getWidth()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No image has been loaded yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p1}, Lorg/tensorflow/lite/support/image/a;->e(Landroid/graphics/Bitmap;)Lorg/tensorflow/lite/support/image/a;

    move-result-object p1

    iput-object p1, p0, Lorg/tensorflow/lite/support/image/e;->b:Lorg/tensorflow/lite/support/image/c;

    return-void
.end method
