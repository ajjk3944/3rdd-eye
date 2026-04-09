.class public final LJj/b;
.super LJj/a;
.source "SourceFile"


# static fields
.field private static final e:Lorg/tensorflow/lite/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/tensorflow/lite/a;->FLOAT32:Lorg/tensorflow/lite/a;

    sput-object v0, LJj/b;->e:Lorg/tensorflow/lite/a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, LJj/a;-><init>()V

    return-void
.end method

.method constructor <init>([I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LJj/a;-><init>([I)V

    return-void
.end method


# virtual methods
.method public h()Lorg/tensorflow/lite/a;
    .locals 1

    sget-object v0, LJj/b;->e:Lorg/tensorflow/lite/a;

    return-object v0
.end method

.method public i()[F
    .locals 2

    iget-object v0, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iget v0, p0, LJj/a;->c:I

    new-array v0, v0, [F

    iget-object v1, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->get([F)Ljava/nio/FloatBuffer;

    return-object v0
.end method

.method public j()[I
    .locals 4

    iget-object v0, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iget v0, p0, LJj/a;->c:I

    new-array v0, v0, [F

    iget-object v1, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->get([F)Ljava/nio/FloatBuffer;

    iget v1, p0, LJj/a;->c:I

    new-array v1, v1, [I

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, LJj/a;->c:I

    if-ge v2, v3, :cond_0

    aget v3, v0, v2

    float-to-int v3, v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public l()I
    .locals 1

    sget-object v0, LJj/b;->e:Lorg/tensorflow/lite/a;

    invoke-virtual {v0}, Lorg/tensorflow/lite/a;->byteSize()I

    move-result v0

    return v0
.end method

.method public o([F[I)V
    .locals 2

    const-string v0, "The array to be loaded cannot be null."

    invoke-static {p1, v0}, LIj/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p1

    invoke-static {p2}, LJj/a;->c([I)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The size of the array to be loaded does not match the specified shape."

    invoke-static {v0, v1}, LIj/a;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0, p2}, LJj/a;->r([I)V

    iget-object p2, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iget-object p2, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    return-void
.end method

.method public p([I[I)V
    .locals 5

    const-string v0, "The array to be loaded cannot be null."

    invoke-static {p1, v0}, LIj/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p1

    invoke-static {p2}, LJj/a;->c([I)I

    move-result v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v1, "The size of the array to be loaded does not match the specified shape."

    invoke-static {v0, v1}, LIj/a;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0, p2}, LJj/a;->r([I)V

    iget-object p2, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    array-length p2, p1

    new-array p2, p2, [F

    array-length v0, p1

    move v1, v2

    :goto_1
    if-ge v2, v0, :cond_1

    aget v3, p1, v2

    add-int/lit8 v4, v1, 0x1

    int-to-float v3, v3

    aput v3, p2, v1

    add-int/lit8 v2, v2, 0x1

    move v1, v4

    goto :goto_1

    :cond_1
    iget-object p1, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    return-void
.end method
