.class public abstract LJj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Ljava/nio/ByteBuffer;

.field protected b:[I

.field protected c:I

.field protected final d:Z


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput v0, p0, LJj/a;->c:I

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LJj/a;->d:Z

    const/4 v0, 0x0

    .line 8
    filled-new-array {v0}, [I

    move-result-object v0

    invoke-direct {p0, v0}, LJj/a;->a([I)V

    return-void
.end method

.method protected constructor <init>([I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, LJj/a;->c:I

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, LJj/a;->d:Z

    .line 4
    invoke-direct {p0, p1}, LJj/a;->a([I)V

    return-void
.end method

.method private a([I)V
    .locals 2

    const-string v0, "TensorBuffer shape cannot be null."

    invoke-static {p1, v0}, LIj/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LJj/a;->n([I)Z

    move-result v0

    const-string v1, "Values in TensorBuffer shape should be non-negative."

    invoke-static {v0, v1}, LIj/a;->b(ZLjava/lang/Object;)V

    invoke-static {p1}, LJj/a;->c([I)I

    move-result v0

    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, LJj/a;->b:[I

    iget p1, p0, LJj/a;->c:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput v0, p0, LJj/a;->c:I

    invoke-virtual {p0}, LJj/a;->l()I

    move-result p1

    mul-int/2addr v0, p1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    return-void
.end method

.method private b()V
    .locals 3

    iget-object v0, p0, LJj/a;->b:[I

    invoke-static {v0}, LJj/a;->c([I)I

    move-result v0

    iget-object v1, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-virtual {p0}, LJj/a;->l()I

    move-result v2

    mul-int/2addr v2, v0

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, LJj/a;->b:[I

    invoke-static {v2}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "The size of underlying ByteBuffer (%d) and the shape (%s) do not match. The ByteBuffer may have been changed."

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LIj/a;->d(ZLjava/lang/Object;)V

    return-void
.end method

.method protected static c([I)I
    .locals 4

    const-string v0, "Shape cannot be null."

    invoke-static {p0, v0}, LIj/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget v3, p0, v2

    mul-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static d(Lorg/tensorflow/lite/a;)LJj/a;
    .locals 3

    sget-object v0, LJj/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance p0, LJj/c;

    invoke-direct {p0}, LJj/c;-><init>()V

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TensorBuffer does not support data type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    new-instance p0, LJj/b;

    invoke-direct {p0}, LJj/b;-><init>()V

    return-object p0
.end method

.method public static e([ILorg/tensorflow/lite/a;)LJj/a;
    .locals 2

    sget-object v0, LJj/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance p1, LJj/c;

    invoke-direct {p1, p0}, LJj/c;-><init>([I)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TensorBuffer does not support data type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_1
    new-instance p1, LJj/b;

    invoke-direct {p1, p0}, LJj/b;-><init>([I)V

    return-object p1
.end method

.method public static f(LJj/a;Lorg/tensorflow/lite/a;)LJj/a;
    .locals 3

    const-string v0, "Cannot create a buffer from null"

    invoke-static {p0, v0}, LIj/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, LJj/a;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LJj/a;->d(Lorg/tensorflow/lite/a;)LJj/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LJj/a;->b:[I

    invoke-static {v0, p1}, LJj/a;->e([ILorg/tensorflow/lite/a;)LJj/a;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, LJj/a;->h()Lorg/tensorflow/lite/a;

    move-result-object v1

    sget-object v2, Lorg/tensorflow/lite/a;->FLOAT32:Lorg/tensorflow/lite/a;

    if-ne v1, v2, :cond_1

    if-ne p1, v2, :cond_1

    invoke-virtual {p0}, LJj/a;->i()[F

    move-result-object p1

    iget-object p0, p0, LJj/a;->b:[I

    invoke-virtual {v0, p1, p0}, LJj/a;->o([F[I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LJj/a;->j()[I

    move-result-object p1

    iget-object p0, p0, LJj/a;->b:[I

    invoke-virtual {v0, p1, p0}, LJj/a;->p([I[I)V

    :goto_1
    return-object v0
.end method

.method private static n([I)Z
    .locals 5

    array-length v0, p0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    array-length v0, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    aget v4, p0, v3

    if-gez v4, :cond_1

    return v2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method


# virtual methods
.method public g()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public abstract h()Lorg/tensorflow/lite/a;
.end method

.method public abstract i()[F
.end method

.method public abstract j()[I
.end method

.method public k()[I
    .locals 2

    invoke-direct {p0}, LJj/a;->b()V

    iget-object v0, p0, LJj/a;->b:[I

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    return-object v0
.end method

.method public abstract l()I
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, LJj/a;->d:Z

    return v0
.end method

.method public abstract o([F[I)V
.end method

.method public abstract p([I[I)V
.end method

.method public q(Ljava/nio/ByteBuffer;[I)V
    .locals 3

    const-string v0, "Byte buffer cannot be null."

    invoke-static {p1, v0}, LIj/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LJj/a;->c([I)I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-virtual {p0}, LJj/a;->l()I

    move-result v2

    mul-int/2addr v2, v0

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The size of byte buffer and the shape do not match."

    invoke-static {v0, v1}, LIj/a;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0, p2}, LJj/a;->r([I)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iput-object p1, p0, LJj/a;->a:Ljava/nio/ByteBuffer;

    return-void
.end method

.method protected r([I)V
    .locals 1

    iget-boolean v0, p0, LJj/a;->d:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, LJj/a;->a([I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LJj/a;->b:[I

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v0

    invoke-static {v0}, LIj/a;->a(Z)V

    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, LJj/a;->b:[I

    :goto_0
    return-void
.end method
