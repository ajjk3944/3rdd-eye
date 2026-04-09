.class public Lorg/msgpack/core/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final m:Lorg/msgpack/core/buffer/MessageBuffer;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Ljava/nio/charset/CodingErrorAction;

.field private final d:Ljava/nio/charset/CodingErrorAction;

.field private final e:I

.field private final f:I

.field private g:Lorg/msgpack/core/buffer/d;

.field private h:Lorg/msgpack/core/buffer/MessageBuffer;

.field private i:I

.field private j:J

.field private final k:Lorg/msgpack/core/buffer/MessageBuffer;

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {v0}, Lorg/msgpack/core/buffer/MessageBuffer;->wrap([B)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    sput-object v0, Lorg/msgpack/core/f;->m:Lorg/msgpack/core/buffer/MessageBuffer;

    return-void
.end method

.method protected constructor <init>(Lorg/msgpack/core/buffer/d;Lorg/msgpack/core/d$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lorg/msgpack/core/f;->m:Lorg/msgpack/core/buffer/MessageBuffer;

    iput-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    const/16 v0, 0x8

    invoke-static {v0}, Lorg/msgpack/core/buffer/MessageBuffer;->allocate(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/msgpack/core/f;->k:Lorg/msgpack/core/buffer/MessageBuffer;

    const-string v0, "MessageBufferInput is null"

    invoke-static {p1, v0}, Lorg/msgpack/core/g;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/msgpack/core/buffer/d;

    iput-object p1, p0, Lorg/msgpack/core/f;->g:Lorg/msgpack/core/buffer/d;

    invoke-virtual {p2}, Lorg/msgpack/core/d$c;->f()Z

    move-result p1

    iput-boolean p1, p0, Lorg/msgpack/core/f;->a:Z

    invoke-virtual {p2}, Lorg/msgpack/core/d$c;->e()Z

    move-result p1

    iput-boolean p1, p0, Lorg/msgpack/core/f;->b:Z

    invoke-virtual {p2}, Lorg/msgpack/core/d$c;->c()Ljava/nio/charset/CodingErrorAction;

    move-result-object p1

    iput-object p1, p0, Lorg/msgpack/core/f;->c:Ljava/nio/charset/CodingErrorAction;

    invoke-virtual {p2}, Lorg/msgpack/core/d$c;->d()Ljava/nio/charset/CodingErrorAction;

    move-result-object p1

    iput-object p1, p0, Lorg/msgpack/core/f;->d:Ljava/nio/charset/CodingErrorAction;

    invoke-virtual {p2}, Lorg/msgpack/core/d$c;->i()I

    move-result p1

    iput p1, p0, Lorg/msgpack/core/f;->e:I

    invoke-virtual {p2}, Lorg/msgpack/core/d$c;->h()I

    move-result p1

    iput p1, p0, Lorg/msgpack/core/f;->f:I

    return-void
.end method

.method private C()F
    .locals 2

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->v(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    iget v1, p0, Lorg/msgpack/core/f;->l:I

    invoke-virtual {v0, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->getFloat(I)F

    move-result v0

    return v0
.end method

.method private J()I
    .locals 2

    invoke-direct {p0}, Lorg/msgpack/core/f;->readShort()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0
.end method

.method private P()I
    .locals 1

    invoke-direct {p0}, Lorg/msgpack/core/f;->readInt()I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    :cond_0
    invoke-static {v0}, Lorg/msgpack/core/f;->p(I)Lorg/msgpack/core/MessageSizeException;

    move-result-object v0

    throw v0
.end method

.method private S()I
    .locals 1

    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method private a()Z
    .locals 6

    :goto_0
    iget-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v0}, Lorg/msgpack/core/buffer/MessageBuffer;->size()I

    move-result v0

    iget v1, p0, Lorg/msgpack/core/f;->i:I

    if-gt v0, v1, :cond_1

    iget-object v0, p0, Lorg/msgpack/core/f;->g:Lorg/msgpack/core/buffer/d;

    invoke-interface {v0}, Lorg/msgpack/core/buffer/d;->next()Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-wide v2, p0, Lorg/msgpack/core/f;->j:J

    iget-object v4, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v4}, Lorg/msgpack/core/buffer/MessageBuffer;->size()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lorg/msgpack/core/f;->j:J

    iput-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    iput v1, p0, Lorg/msgpack/core/f;->i:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private d0(B)I
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, -0x1

    return p1

    :pswitch_0
    invoke-direct {p0}, Lorg/msgpack/core/f;->P()I

    move-result p1

    return p1

    :pswitch_1
    invoke-direct {p0}, Lorg/msgpack/core/f;->J()I

    move-result p1

    return p1

    :pswitch_2
    invoke-direct {p0}, Lorg/msgpack/core/f;->S()I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch -0x3c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private f0(B)I
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, -0x1

    return p1

    :pswitch_0
    invoke-direct {p0}, Lorg/msgpack/core/f;->P()I

    move-result p1

    return p1

    :pswitch_1
    invoke-direct {p0}, Lorg/msgpack/core/f;->J()I

    move-result p1

    return p1

    :pswitch_2
    invoke-direct {p0}, Lorg/msgpack/core/f;->S()I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch -0x27
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private g()Lorg/msgpack/core/buffer/MessageBuffer;
    .locals 5

    iget-object v0, p0, Lorg/msgpack/core/f;->g:Lorg/msgpack/core/buffer/d;

    invoke-interface {v0}, Lorg/msgpack/core/buffer/d;->next()Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lorg/msgpack/core/f;->j:J

    iget-object v3, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v3}, Lorg/msgpack/core/buffer/MessageBuffer;->size()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Lorg/msgpack/core/f;->j:J

    return-object v0

    :cond_0
    new-instance v0, Lorg/msgpack/core/MessageInsufficientBufferException;

    invoke-direct {v0}, Lorg/msgpack/core/MessageInsufficientBufferException;-><init>()V

    throw v0
.end method

.method private j()V
    .locals 1

    invoke-direct {p0}, Lorg/msgpack/core/f;->g()Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    const/4 v0, 0x0

    iput v0, p0, Lorg/msgpack/core/f;->i:I

    return-void
.end method

.method private static m0(Ljava/lang/String;B)Lorg/msgpack/core/MessagePackException;
    .locals 4

    invoke-static {p1}, Lorg/msgpack/core/c;->valueOf(B)Lorg/msgpack/core/c;

    move-result-object v0

    sget-object v1, Lorg/msgpack/core/c;->NEVER_USED:Lorg/msgpack/core/c;

    if-ne v0, v1, :cond_0

    new-instance p1, Lorg/msgpack/core/MessageNeverUsedFormatException;

    const-string v0, "Expected %s, but encountered 0xC1 \"NEVER_USED\" byte"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lorg/msgpack/core/MessageNeverUsedFormatException;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-virtual {v0}, Lorg/msgpack/core/c;->getValueType()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lorg/msgpack/core/MessageTypeException;

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    filled-new-array {p0, v0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Expected %s, but got %s (%02x)"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lorg/msgpack/core/MessageTypeException;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method private static p(I)Lorg/msgpack/core/MessageSizeException;
    .locals 4

    const v0, 0x7fffffff

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide v2, 0x80000000L

    add-long/2addr v0, v2

    new-instance p0, Lorg/msgpack/core/MessageSizeException;

    invoke-direct {p0, v0, v1}, Lorg/msgpack/core/MessageSizeException;-><init>(J)V

    return-object p0
.end method

.method private readByte()B
    .locals 3

    iget-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v0}, Lorg/msgpack/core/buffer/MessageBuffer;->size()I

    move-result v0

    iget v1, p0, Lorg/msgpack/core/f;->i:I

    const/4 v2, 0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v0, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->getByte(I)B

    move-result v0

    iget v1, p0, Lorg/msgpack/core/f;->i:I

    add-int/2addr v1, v2

    iput v1, p0, Lorg/msgpack/core/f;->i:I

    return v0

    :cond_0
    invoke-direct {p0}, Lorg/msgpack/core/f;->j()V

    iget-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v0}, Lorg/msgpack/core/buffer/MessageBuffer;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->getByte(I)B

    move-result v0

    iput v2, p0, Lorg/msgpack/core/f;->i:I

    return v0

    :cond_1
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    return v0
.end method

.method private readInt()I
    .locals 2

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->v(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    iget v1, p0, Lorg/msgpack/core/f;->l:I

    invoke-virtual {v0, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->getInt(I)I

    move-result v0

    return v0
.end method

.method private readLong()J
    .locals 2

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->v(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    iget v1, p0, Lorg/msgpack/core/f;->l:I

    invoke-virtual {v0, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method private readShort()S
    .locals 2

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->v(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    iget v1, p0, Lorg/msgpack/core/f;->l:I

    invoke-virtual {v0, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->getShort(I)S

    move-result v0

    return v0
.end method

.method private static s(J)Lorg/msgpack/core/MessageIntegerOverflowException;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    add-long/2addr p0, v0

    invoke-static {p0, p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p0

    const/16 p1, 0x3f

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object p0

    new-instance p1, Lorg/msgpack/core/MessageIntegerOverflowException;

    invoke-direct {p1, p0}, Lorg/msgpack/core/MessageIntegerOverflowException;-><init>(Ljava/math/BigInteger;)V

    return-object p1
.end method

.method private v(I)Lorg/msgpack/core/buffer/MessageBuffer;
    .locals 5

    iget-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v0}, Lorg/msgpack/core/buffer/MessageBuffer;->size()I

    move-result v0

    iget v1, p0, Lorg/msgpack/core/f;->i:I

    sub-int/2addr v0, v1

    if-lt v0, p1, :cond_0

    iput v1, p0, Lorg/msgpack/core/f;->l:I

    add-int/2addr v1, p1

    iput v1, p0, Lorg/msgpack/core/f;->i:I

    iget-object p1, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    return-object p1

    :cond_0
    const/4 v2, 0x0

    if-lez v0, :cond_1

    iget-object v3, p0, Lorg/msgpack/core/f;->k:Lorg/msgpack/core/buffer/MessageBuffer;

    iget-object v4, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v3, v2, v4, v1, v0}, Lorg/msgpack/core/buffer/MessageBuffer;->putMessageBuffer(ILorg/msgpack/core/buffer/MessageBuffer;II)V

    sub-int/2addr p1, v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    invoke-direct {p0}, Lorg/msgpack/core/f;->j()V

    iget-object v1, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v1}, Lorg/msgpack/core/buffer/MessageBuffer;->size()I

    move-result v1

    if-lt v1, p1, :cond_2

    iget-object v1, p0, Lorg/msgpack/core/f;->k:Lorg/msgpack/core/buffer/MessageBuffer;

    iget-object v3, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v1, v0, v3, v2, p1}, Lorg/msgpack/core/buffer/MessageBuffer;->putMessageBuffer(ILorg/msgpack/core/buffer/MessageBuffer;II)V

    iput p1, p0, Lorg/msgpack/core/f;->i:I

    iput v2, p0, Lorg/msgpack/core/f;->l:I

    iget-object p1, p0, Lorg/msgpack/core/f;->k:Lorg/msgpack/core/buffer/MessageBuffer;

    return-object p1

    :cond_2
    iget-object v3, p0, Lorg/msgpack/core/f;->k:Lorg/msgpack/core/buffer/MessageBuffer;

    iget-object v4, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v3, v0, v4, v2, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->putMessageBuffer(ILorg/msgpack/core/buffer/MessageBuffer;II)V

    sub-int/2addr p1, v1

    add-int/2addr v0, v1

    goto :goto_0
.end method

.method private y()D
    .locals 2

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->v(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    iget v1, p0, Lorg/msgpack/core/f;->l:I

    invoke-virtual {v0, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->getDouble(I)D

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public T([B)V
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lorg/msgpack/core/f;->Y([BII)V

    return-void
.end method

.method public Y([BII)V
    .locals 3

    :goto_0
    iget-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v0}, Lorg/msgpack/core/buffer/MessageBuffer;->size()I

    move-result v0

    iget v1, p0, Lorg/msgpack/core/f;->i:I

    sub-int/2addr v0, v1

    if-lt v0, p3, :cond_0

    iget-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v0, v1, p1, p2, p3}, Lorg/msgpack/core/buffer/MessageBuffer;->getBytes(I[BII)V

    iget p1, p0, Lorg/msgpack/core/f;->i:I

    add-int/2addr p1, p3

    iput p1, p0, Lorg/msgpack/core/f;->i:I

    return-void

    :cond_0
    iget-object v2, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v2, v1, p1, p2, v0}, Lorg/msgpack/core/buffer/MessageBuffer;->getBytes(I[BII)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    iget v1, p0, Lorg/msgpack/core/f;->i:I

    add-int/2addr v1, v0

    iput v1, p0, Lorg/msgpack/core/f;->i:I

    invoke-direct {p0}, Lorg/msgpack/core/f;->j()V

    goto :goto_0
.end method

.method public b0(I)[B
    .locals 0

    new-array p1, p1, [B

    invoke-virtual {p0, p1}, Lorg/msgpack/core/f;->T([B)V

    return-object p1
.end method

.method public close()V
    .locals 1

    sget-object v0, Lorg/msgpack/core/f;->m:Lorg/msgpack/core/buffer/MessageBuffer;

    iput-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    const/4 v0, 0x0

    iput v0, p0, Lorg/msgpack/core/f;->i:I

    iget-object v0, p0, Lorg/msgpack/core/f;->g:Lorg/msgpack/core/buffer/d;

    invoke-interface {v0}, Lorg/msgpack/core/buffer/d;->close()V

    return-void
.end method

.method public h()Lorg/msgpack/core/c;
    .locals 2

    invoke-direct {p0}, Lorg/msgpack/core/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/msgpack/core/f;->h:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v1, p0, Lorg/msgpack/core/f;->i:I

    invoke-virtual {v0, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->getByte(I)B

    move-result v0

    invoke-static {v0}, Lorg/msgpack/core/c;->valueOf(B)Lorg/msgpack/core/c;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lorg/msgpack/core/MessageInsufficientBufferException;

    invoke-direct {v0}, Lorg/msgpack/core/MessageInsufficientBufferException;-><init>()V

    throw v0
.end method

.method public n0()I
    .locals 2

    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    invoke-static {v0}, Lorg/msgpack/core/d$a;->c(B)Z

    move-result v1

    if-eqz v1, :cond_0

    and-int/lit8 v0, v0, 0xf

    return v0

    :cond_0
    const/16 v1, -0x24

    if-eq v0, v1, :cond_2

    const/16 v1, -0x23

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lorg/msgpack/core/f;->P()I

    move-result v0

    return v0

    :cond_1
    const-string v1, "Array"

    invoke-static {v1, v0}, Lorg/msgpack/core/f;->m0(Ljava/lang/String;B)Lorg/msgpack/core/MessagePackException;

    move-result-object v0

    throw v0

    :cond_2
    invoke-direct {p0}, Lorg/msgpack/core/f;->J()I

    move-result v0

    return v0
.end method

.method public o0()Ljava/math/BigInteger;
    .locals 4

    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    invoke-static {v0}, Lorg/msgpack/core/d$a;->a(B)Z

    move-result v1

    if-eqz v1, :cond_0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    const-string v1, "Integer"

    invoke-static {v1, v0}, Lorg/msgpack/core/f;->m0(Ljava/lang/String;B)Lorg/msgpack/core/MessagePackException;

    move-result-object v0

    throw v0

    :pswitch_0
    invoke-direct {p0}, Lorg/msgpack/core/f;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-direct {p0}, Lorg/msgpack/core/f;->readInt()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-direct {p0}, Lorg/msgpack/core/f;->readShort()S

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-direct {p0}, Lorg/msgpack/core/f;->readLong()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gez v2, :cond_1

    const-wide/high16 v2, -0x8000000000000000L

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-direct {p0}, Lorg/msgpack/core/f;->readInt()I

    move-result v0

    if-gez v0, :cond_2

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    const-wide v2, 0x80000000L

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :cond_2
    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-direct {p0}, Lorg/msgpack/core/f;->readShort()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch -0x34
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p0()I
    .locals 2

    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    invoke-static {v0}, Lorg/msgpack/core/d$a;->e(B)Z

    move-result v1

    if-eqz v1, :cond_0

    and-int/lit8 v0, v0, 0x1f

    return v0

    :cond_0
    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->d0(B)I

    move-result v1

    if-ltz v1, :cond_1

    return v1

    :cond_1
    iget-boolean v1, p0, Lorg/msgpack/core/f;->a:Z

    if-eqz v1, :cond_2

    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->f0(B)I

    move-result v1

    if-ltz v1, :cond_2

    return v1

    :cond_2
    const-string v1, "Binary"

    invoke-static {v1, v0}, Lorg/msgpack/core/f;->m0(Ljava/lang/String;B)Lorg/msgpack/core/MessagePackException;

    move-result-object v0

    throw v0
.end method

.method public q0()Z
    .locals 2

    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    const/16 v1, -0x3e

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/16 v1, -0x3d

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const-string v1, "boolean"

    invoke-static {v1, v0}, Lorg/msgpack/core/f;->m0(Ljava/lang/String;B)Lorg/msgpack/core/MessagePackException;

    move-result-object v0

    throw v0
.end method

.method public r0()D
    .locals 2

    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    const/16 v1, -0x36

    if-eq v0, v1, :cond_1

    const/16 v1, -0x35

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lorg/msgpack/core/f;->y()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-string v1, "Float"

    invoke-static {v1, v0}, Lorg/msgpack/core/f;->m0(Ljava/lang/String;B)Lorg/msgpack/core/MessagePackException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-direct {p0}, Lorg/msgpack/core/f;->C()F

    move-result v0

    float-to-double v0, v0

    return-wide v0
.end method

.method public s0()Lorg/msgpack/core/a;
    .locals 4

    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x2

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    const-string v1, "Ext"

    invoke-static {v1, v0}, Lorg/msgpack/core/f;->m0(Ljava/lang/String;B)Lorg/msgpack/core/MessagePackException;

    move-result-object v0

    throw v0

    :pswitch_0
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    new-instance v1, Lorg/msgpack/core/a;

    const/16 v2, 0x10

    invoke-direct {v1, v0, v2}, Lorg/msgpack/core/a;-><init>(BI)V

    return-object v1

    :pswitch_1
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    new-instance v1, Lorg/msgpack/core/a;

    const/16 v2, 0x8

    invoke-direct {v1, v0, v2}, Lorg/msgpack/core/a;-><init>(BI)V

    return-object v1

    :pswitch_2
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    new-instance v1, Lorg/msgpack/core/a;

    invoke-direct {v1, v0, v2}, Lorg/msgpack/core/a;-><init>(BI)V

    return-object v1

    :pswitch_3
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    new-instance v1, Lorg/msgpack/core/a;

    invoke-direct {v1, v0, v3}, Lorg/msgpack/core/a;-><init>(BI)V

    return-object v1

    :pswitch_4
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    new-instance v2, Lorg/msgpack/core/a;

    invoke-direct {v2, v0, v1}, Lorg/msgpack/core/a;-><init>(BI)V

    return-object v2

    :pswitch_5
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->v(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    iget v1, p0, Lorg/msgpack/core/f;->l:I

    invoke-virtual {v0, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->getInt(I)I

    move-result v1

    if-ltz v1, :cond_0

    iget v3, p0, Lorg/msgpack/core/f;->l:I

    add-int/2addr v3, v2

    invoke-virtual {v0, v3}, Lorg/msgpack/core/buffer/MessageBuffer;->getByte(I)B

    move-result v0

    new-instance v2, Lorg/msgpack/core/a;

    invoke-direct {v2, v0, v1}, Lorg/msgpack/core/a;-><init>(BI)V

    return-object v2

    :cond_0
    invoke-static {v1}, Lorg/msgpack/core/f;->p(I)Lorg/msgpack/core/MessageSizeException;

    move-result-object v0

    throw v0

    :pswitch_6
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->v(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    iget v1, p0, Lorg/msgpack/core/f;->l:I

    invoke-virtual {v0, v1}, Lorg/msgpack/core/buffer/MessageBuffer;->getShort(I)S

    move-result v1

    const v2, 0xffff

    and-int/2addr v1, v2

    iget v2, p0, Lorg/msgpack/core/f;->l:I

    add-int/2addr v2, v3

    invoke-virtual {v0, v2}, Lorg/msgpack/core/buffer/MessageBuffer;->getByte(I)B

    move-result v0

    new-instance v2, Lorg/msgpack/core/a;

    invoke-direct {v2, v0, v1}, Lorg/msgpack/core/a;-><init>(BI)V

    return-object v2

    :pswitch_7
    invoke-direct {p0, v3}, Lorg/msgpack/core/f;->v(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object v0

    iget v2, p0, Lorg/msgpack/core/f;->l:I

    invoke-virtual {v0, v2}, Lorg/msgpack/core/buffer/MessageBuffer;->getByte(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    iget v3, p0, Lorg/msgpack/core/f;->l:I

    add-int/2addr v3, v1

    invoke-virtual {v0, v3}, Lorg/msgpack/core/buffer/MessageBuffer;->getByte(I)B

    move-result v0

    new-instance v1, Lorg/msgpack/core/a;

    invoke-direct {v1, v0, v2}, Lorg/msgpack/core/a;-><init>(BI)V

    return-object v1

    :pswitch_data_0
    .packed-switch -0x39
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x2c
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public t0()J
    .locals 4

    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    invoke-static {v0}, Lorg/msgpack/core/d$a;->a(B)Z

    move-result v1

    if-eqz v1, :cond_0

    int-to-long v0, v0

    return-wide v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    const-string v1, "Integer"

    invoke-static {v1, v0}, Lorg/msgpack/core/f;->m0(Ljava/lang/String;B)Lorg/msgpack/core/MessagePackException;

    move-result-object v0

    throw v0

    :pswitch_0
    invoke-direct {p0}, Lorg/msgpack/core/f;->readLong()J

    move-result-wide v0

    return-wide v0

    :pswitch_1
    invoke-direct {p0}, Lorg/msgpack/core/f;->readInt()I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    :pswitch_2
    invoke-direct {p0}, Lorg/msgpack/core/f;->readShort()S

    move-result v0

    int-to-long v0, v0

    return-wide v0

    :pswitch_3
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    int-to-long v0, v0

    return-wide v0

    :pswitch_4
    invoke-direct {p0}, Lorg/msgpack/core/f;->readLong()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    return-wide v0

    :cond_1
    invoke-static {v0, v1}, Lorg/msgpack/core/f;->s(J)Lorg/msgpack/core/MessageIntegerOverflowException;

    move-result-object v0

    throw v0

    :pswitch_5
    invoke-direct {p0}, Lorg/msgpack/core/f;->readInt()I

    move-result v0

    if-gez v0, :cond_2

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    const-wide v2, 0x80000000L

    add-long/2addr v0, v2

    return-wide v0

    :cond_2
    int-to-long v0, v0

    return-wide v0

    :pswitch_6
    invoke-direct {p0}, Lorg/msgpack/core/f;->readShort()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0

    :pswitch_7
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-long v0, v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch -0x34
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public u0()I
    .locals 2

    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    invoke-static {v0}, Lorg/msgpack/core/d$a;->d(B)Z

    move-result v1

    if-eqz v1, :cond_0

    and-int/lit8 v0, v0, 0xf

    return v0

    :cond_0
    const/16 v1, -0x22

    if-eq v0, v1, :cond_2

    const/16 v1, -0x21

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lorg/msgpack/core/f;->P()I

    move-result v0

    return v0

    :cond_1
    const-string v1, "Map"

    invoke-static {v1, v0}, Lorg/msgpack/core/f;->m0(Ljava/lang/String;B)Lorg/msgpack/core/MessagePackException;

    move-result-object v0

    throw v0

    :cond_2
    invoke-direct {p0}, Lorg/msgpack/core/f;->J()I

    move-result v0

    return v0
.end method

.method public v0()I
    .locals 2

    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    move-result v0

    invoke-static {v0}, Lorg/msgpack/core/d$a;->e(B)Z

    move-result v1

    if-eqz v1, :cond_0

    and-int/lit8 v0, v0, 0x1f

    return v0

    :cond_0
    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->f0(B)I

    move-result v1

    if-ltz v1, :cond_1

    return v1

    :cond_1
    iget-boolean v1, p0, Lorg/msgpack/core/f;->b:Z

    if-eqz v1, :cond_2

    invoke-direct {p0, v0}, Lorg/msgpack/core/f;->d0(B)I

    move-result v1

    if-ltz v1, :cond_2

    return v1

    :cond_2
    const-string v1, "String"

    invoke-static {v1, v0}, Lorg/msgpack/core/f;->m0(Ljava/lang/String;B)Lorg/msgpack/core/MessagePackException;

    move-result-object v0

    throw v0
.end method

.method public w0()Lyj/o;
    .locals 6

    invoke-virtual {p0}, Lorg/msgpack/core/f;->h()Lorg/msgpack/core/c;

    move-result-object v0

    sget-object v1, Lorg/msgpack/core/f$a;->b:[I

    invoke-virtual {v0}, Lorg/msgpack/core/c;->getValueType()Lyj/w;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v1, :pswitch_data_0

    new-instance v0, Lorg/msgpack/core/MessageNeverUsedFormatException;

    const-string v1, "Unknown value type"

    invoke-direct {v0, v1}, Lorg/msgpack/core/MessageNeverUsedFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {p0}, Lorg/msgpack/core/f;->s0()Lorg/msgpack/core/a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/msgpack/core/a;->b()B

    move-result v1

    invoke-virtual {v0}, Lorg/msgpack/core/a;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lorg/msgpack/core/f;->b0(I)[B

    move-result-object v0

    invoke-static {v1, v0}, Lyj/v;->d(B[B)Lyj/i;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Lorg/msgpack/core/f;->u0()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v1, v0, [Lyj/u;

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0}, Lorg/msgpack/core/f;->w0()Lyj/o;

    move-result-object v4

    aput-object v4, v1, v2

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {p0}, Lorg/msgpack/core/f;->w0()Lyj/o;

    move-result-object v5

    aput-object v5, v1, v4

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_0
    invoke-static {v1, v3}, Lyj/v;->h([Lyj/u;Z)Lyj/l;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual {p0}, Lorg/msgpack/core/f;->n0()I

    move-result v0

    new-array v1, v0, [Lyj/u;

    :goto_1
    if-ge v2, v0, :cond_1

    invoke-virtual {p0}, Lorg/msgpack/core/f;->w0()Lyj/o;

    move-result-object v4

    aput-object v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v1, v3}, Lyj/v;->a([Lyj/u;Z)Lyj/f;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-virtual {p0}, Lorg/msgpack/core/f;->p0()I

    move-result v0

    invoke-virtual {p0, v0}, Lorg/msgpack/core/f;->b0(I)[B

    move-result-object v0

    invoke-static {v0, v3}, Lyj/v;->b([BZ)Lyj/g;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-virtual {p0}, Lorg/msgpack/core/f;->v0()I

    move-result v0

    invoke-virtual {p0, v0}, Lorg/msgpack/core/f;->b0(I)[B

    move-result-object v0

    invoke-static {v0, v3}, Lyj/v;->j([BZ)Lyj/n;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-virtual {p0}, Lorg/msgpack/core/f;->r0()D

    move-result-wide v0

    invoke-static {v0, v1}, Lyj/v;->e(D)Lyj/j;

    move-result-object v0

    return-object v0

    :pswitch_6
    sget-object v1, Lorg/msgpack/core/c;->UINT64:Lorg/msgpack/core/c;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lorg/msgpack/core/f;->o0()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lyj/v;->g(Ljava/math/BigInteger;)Lyj/k;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {p0}, Lorg/msgpack/core/f;->t0()J

    move-result-wide v0

    invoke-static {v0, v1}, Lyj/v;->f(J)Lyj/k;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-virtual {p0}, Lorg/msgpack/core/f;->q0()Z

    move-result v0

    invoke-static {v0}, Lyj/v;->c(Z)Lyj/h;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-direct {p0}, Lorg/msgpack/core/f;->readByte()B

    invoke-static {}, Lyj/v;->i()Lyj/m;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
