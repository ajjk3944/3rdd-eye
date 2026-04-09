.class public abstract Lorg/msgpack/core/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field private static final h:Z


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Z

.field protected d:Lorg/msgpack/core/buffer/e;

.field private e:Lorg/msgpack/core/buffer/MessageBuffer;

.field private f:I

.field private g:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "android.os.Build$VERSION"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "SDK_INT"

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v2, 0xe

    if-lt v1, v2, :cond_0

    const/16 v2, 0x15

    if-ge v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_5

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_2

    :catch_3
    move-exception v1

    goto :goto_3

    :catch_4
    move-exception v1

    goto :goto_4

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_5

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_5

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_5

    :goto_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_5

    :goto_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :catch_5
    :cond_0
    :goto_5
    sput-boolean v0, Lorg/msgpack/core/e;->h:Z

    return-void
.end method

.method protected constructor <init>(Lorg/msgpack/core/buffer/e;Lorg/msgpack/core/d$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "MessageBufferOutput is null"

    invoke-static {p1, v0}, Lorg/msgpack/core/g;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/msgpack/core/buffer/e;

    iput-object p1, p0, Lorg/msgpack/core/e;->d:Lorg/msgpack/core/buffer/e;

    invoke-virtual {p2}, Lorg/msgpack/core/d$b;->d()I

    move-result p1

    iput p1, p0, Lorg/msgpack/core/e;->a:I

    invoke-virtual {p2}, Lorg/msgpack/core/d$b;->c()I

    move-result p1

    iput p1, p0, Lorg/msgpack/core/e;->b:I

    invoke-virtual {p2}, Lorg/msgpack/core/d$b;->e()Z

    move-result p1

    iput-boolean p1, p0, Lorg/msgpack/core/e;->c:Z

    const/4 p1, 0x0

    iput p1, p0, Lorg/msgpack/core/e;->f:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lorg/msgpack/core/e;->g:J

    return-void
.end method

.method private Y(B)V
    .locals 3

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/msgpack/core/e;->a(I)V

    iget-object v0, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v1, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {v0, v1, p1}, Lorg/msgpack/core/buffer/MessageBuffer;->putByte(IB)V

    return-void
.end method

.method private a(I)V
    .locals 2

    iget-object v0, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/msgpack/core/e;->d:Lorg/msgpack/core/buffer/e;

    invoke-interface {v0, p1}, Lorg/msgpack/core/buffer/e;->L(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object p1

    iput-object p1, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    goto :goto_0

    :cond_0
    iget v1, p0, Lorg/msgpack/core/e;->f:I

    add-int/2addr v1, p1

    invoke-virtual {v0}, Lorg/msgpack/core/buffer/MessageBuffer;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    invoke-direct {p0}, Lorg/msgpack/core/e;->g()V

    iget-object v0, p0, Lorg/msgpack/core/e;->d:Lorg/msgpack/core/buffer/e;

    invoke-interface {v0, p1}, Lorg/msgpack/core/buffer/e;->L(I)Lorg/msgpack/core/buffer/MessageBuffer;

    move-result-object p1

    iput-object p1, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    :cond_1
    :goto_0
    return-void
.end method

.method private b0(BB)V
    .locals 3

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lorg/msgpack/core/e;->a(I)V

    iget-object v0, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v1, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {v0, v1, p1}, Lorg/msgpack/core/buffer/MessageBuffer;->putByte(IB)V

    iget-object p1, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v0, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {p1, v0, p2}, Lorg/msgpack/core/buffer/MessageBuffer;->putByte(IB)V

    return-void
.end method

.method private d0(BD)V
    .locals 3

    const/16 v0, 0x9

    invoke-direct {p0, v0}, Lorg/msgpack/core/e;->a(I)V

    iget-object v0, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v1, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {v0, v1, p1}, Lorg/msgpack/core/buffer/MessageBuffer;->putByte(IB)V

    iget-object p1, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v0, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {p1, v0, p2, p3}, Lorg/msgpack/core/buffer/MessageBuffer;->putDouble(ID)V

    iget p1, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 p1, p1, 0x8

    iput p1, p0, Lorg/msgpack/core/e;->f:I

    return-void
.end method

.method private f0(BI)V
    .locals 3

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lorg/msgpack/core/e;->a(I)V

    iget-object v0, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v1, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {v0, v1, p1}, Lorg/msgpack/core/buffer/MessageBuffer;->putByte(IB)V

    iget-object p1, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v0, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {p1, v0, p2}, Lorg/msgpack/core/buffer/MessageBuffer;->putInt(II)V

    iget p1, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 p1, p1, 0x4

    iput p1, p0, Lorg/msgpack/core/e;->f:I

    return-void
.end method

.method private g()V
    .locals 4

    iget-object v0, p0, Lorg/msgpack/core/e;->d:Lorg/msgpack/core/buffer/e;

    iget v1, p0, Lorg/msgpack/core/e;->f:I

    invoke-interface {v0, v1}, Lorg/msgpack/core/buffer/e;->B(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget-wide v0, p0, Lorg/msgpack/core/e;->g:J

    iget v2, p0, Lorg/msgpack/core/e;->f:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/msgpack/core/e;->g:J

    const/4 v0, 0x0

    iput v0, p0, Lorg/msgpack/core/e;->f:I

    return-void
.end method

.method private m0(BJ)V
    .locals 3

    const/16 v0, 0x9

    invoke-direct {p0, v0}, Lorg/msgpack/core/e;->a(I)V

    iget-object v0, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v1, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {v0, v1, p1}, Lorg/msgpack/core/buffer/MessageBuffer;->putByte(IB)V

    iget-object p1, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v0, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {p1, v0, p2, p3}, Lorg/msgpack/core/buffer/MessageBuffer;->putLong(IJ)V

    iget p1, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 p1, p1, 0x8

    iput p1, p0, Lorg/msgpack/core/e;->f:I

    return-void
.end method

.method private n0(BS)V
    .locals 3

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lorg/msgpack/core/e;->a(I)V

    iget-object v0, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v1, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {v0, v1, p1}, Lorg/msgpack/core/buffer/MessageBuffer;->putByte(IB)V

    iget-object p1, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    iget v0, p0, Lorg/msgpack/core/e;->f:I

    invoke-virtual {p1, v0, p2}, Lorg/msgpack/core/buffer/MessageBuffer;->putShort(IS)V

    iget p1, p0, Lorg/msgpack/core/e;->f:I

    add-int/lit8 p1, p1, 0x2

    iput p1, p0, Lorg/msgpack/core/e;->f:I

    return-void
.end method


# virtual methods
.method public C(J)Lorg/msgpack/core/e;
    .locals 2

    const-wide/16 v0, -0x20

    cmp-long v0, p1, v0

    if-gez v0, :cond_3

    const-wide/16 v0, -0x8000

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    const-wide/32 v0, -0x80000000

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    const/16 v0, -0x2d

    invoke-direct {p0, v0, p1, p2}, Lorg/msgpack/core/e;->m0(BJ)V

    goto :goto_0

    :cond_0
    const/16 v0, -0x2e

    long-to-int p1, p1

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->f0(BI)V

    goto :goto_0

    :cond_1
    const-wide/16 v0, -0x80

    cmp-long v0, p1, v0

    if-gez v0, :cond_2

    long-to-int p1, p1

    int-to-short p1, p1

    const/16 p2, -0x2f

    invoke-direct {p0, p2, p1}, Lorg/msgpack/core/e;->n0(BS)V

    goto :goto_0

    :cond_2
    long-to-int p1, p1

    int-to-byte p1, p1

    const/16 p2, -0x30

    invoke-direct {p0, p2, p1}, Lorg/msgpack/core/e;->b0(BB)V

    goto :goto_0

    :cond_3
    const-wide/16 v0, 0x80

    cmp-long v0, p1, v0

    if-gez v0, :cond_4

    long-to-int p1, p1

    int-to-byte p1, p1

    invoke-direct {p0, p1}, Lorg/msgpack/core/e;->Y(B)V

    goto :goto_0

    :cond_4
    const-wide/32 v0, 0x10000

    cmp-long v0, p1, v0

    if-gez v0, :cond_6

    const-wide/16 v0, 0x100

    cmp-long v0, p1, v0

    if-gez v0, :cond_5

    long-to-int p1, p1

    int-to-byte p1, p1

    const/16 p2, -0x34

    invoke-direct {p0, p2, p1}, Lorg/msgpack/core/e;->b0(BB)V

    goto :goto_0

    :cond_5
    long-to-int p1, p1

    int-to-short p1, p1

    const/16 p2, -0x33

    invoke-direct {p0, p2, p1}, Lorg/msgpack/core/e;->n0(BS)V

    goto :goto_0

    :cond_6
    const-wide v0, 0x100000000L

    cmp-long v0, p1, v0

    if-gez v0, :cond_7

    const/16 v0, -0x32

    long-to-int p1, p1

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->f0(BI)V

    goto :goto_0

    :cond_7
    const/16 v0, -0x31

    invoke-direct {p0, v0, p1, p2}, Lorg/msgpack/core/e;->m0(BJ)V

    :goto_0
    return-object p0
.end method

.method public J(I)Lorg/msgpack/core/e;
    .locals 1

    if-ltz p1, :cond_2

    const/16 v0, 0x10

    if-ge p1, v0, :cond_0

    or-int/lit8 p1, p1, -0x80

    int-to-byte p1, p1

    invoke-direct {p0, p1}, Lorg/msgpack/core/e;->Y(B)V

    goto :goto_0

    :cond_0
    const/high16 v0, 0x10000

    if-ge p1, v0, :cond_1

    const/16 v0, -0x22

    int-to-short p1, p1

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->n0(BS)V

    goto :goto_0

    :cond_1
    const/16 v0, -0x21

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->f0(BI)V

    :goto_0
    return-object p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "map size must be >= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public P()Lorg/msgpack/core/e;
    .locals 1

    const/16 v0, -0x40

    invoke-direct {p0, v0}, Lorg/msgpack/core/e;->Y(B)V

    return-object p0
.end method

.method public S(I)Lorg/msgpack/core/e;
    .locals 1

    const/16 v0, 0x20

    if-ge p1, v0, :cond_0

    or-int/lit8 p1, p1, -0x60

    int-to-byte p1, p1

    invoke-direct {p0, p1}, Lorg/msgpack/core/e;->Y(B)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lorg/msgpack/core/e;->c:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x100

    if-ge p1, v0, :cond_1

    const/16 v0, -0x27

    int-to-byte p1, p1

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->b0(BB)V

    goto :goto_0

    :cond_1
    const/high16 v0, 0x10000

    if-ge p1, v0, :cond_2

    const/16 v0, -0x26

    int-to-short p1, p1

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->n0(BS)V

    goto :goto_0

    :cond_2
    const/16 v0, -0x25

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->f0(BI)V

    :goto_0
    return-object p0
.end method

.method public T(Lyj/u;)Lorg/msgpack/core/e;
    .locals 0

    invoke-interface {p1, p0}, Lyj/u;->f(Lorg/msgpack/core/e;)V

    return-object p0
.end method

.method public close()V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lorg/msgpack/core/e;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lorg/msgpack/core/e;->d:Lorg/msgpack/core/buffer/e;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lorg/msgpack/core/e;->d:Lorg/msgpack/core/buffer/e;

    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    throw v0
.end method

.method public flush()V
    .locals 1

    iget v0, p0, Lorg/msgpack/core/e;->f:I

    if-lez v0, :cond_0

    invoke-direct {p0}, Lorg/msgpack/core/e;->g()V

    :cond_0
    iget-object v0, p0, Lorg/msgpack/core/e;->d:Lorg/msgpack/core/buffer/e;

    invoke-interface {v0}, Ljava/io/Flushable;->flush()V

    return-void
.end method

.method public h(I)Lorg/msgpack/core/e;
    .locals 1

    if-ltz p1, :cond_2

    const/16 v0, 0x10

    if-ge p1, v0, :cond_0

    or-int/lit8 p1, p1, -0x70

    int-to-byte p1, p1

    invoke-direct {p0, p1}, Lorg/msgpack/core/e;->Y(B)V

    goto :goto_0

    :cond_0
    const/high16 v0, 0x10000

    if-ge p1, v0, :cond_1

    const/16 v0, -0x24

    int-to-short p1, p1

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->n0(BS)V

    goto :goto_0

    :cond_1
    const/16 v0, -0x23

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->f0(BI)V

    :goto_0
    return-object p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "array size must be >= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(Ljava/math/BigInteger;)Lorg/msgpack/core/e;
    .locals 3

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const/16 v1, 0x3f

    if-gt v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/msgpack/core/e;->C(J)Lorg/msgpack/core/e;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/16 v0, -0x31

    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lorg/msgpack/core/e;->m0(BJ)V

    :goto_0
    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "MessagePack cannot serialize BigInteger larger than 2^64-1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o0([B)Lorg/msgpack/core/e;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lorg/msgpack/core/e;->p0([BII)Lorg/msgpack/core/e;

    move-result-object p1

    return-object p1
.end method

.method public p(I)Lorg/msgpack/core/e;
    .locals 1

    const/16 v0, 0x100

    if-ge p1, v0, :cond_0

    const/16 v0, -0x3c

    int-to-byte p1, p1

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->b0(BB)V

    goto :goto_0

    :cond_0
    const/high16 v0, 0x10000

    if-ge p1, v0, :cond_1

    const/16 v0, -0x3b

    int-to-short p1, p1

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->n0(BS)V

    goto :goto_0

    :cond_1
    const/16 v0, -0x3a

    invoke-direct {p0, v0, p1}, Lorg/msgpack/core/e;->f0(BI)V

    :goto_0
    return-object p0
.end method

.method public p0([BII)Lorg/msgpack/core/e;
    .locals 2

    iget-object v0, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/msgpack/core/buffer/MessageBuffer;->size()I

    move-result v0

    iget v1, p0, Lorg/msgpack/core/e;->f:I

    sub-int/2addr v0, v1

    if-lt v0, p3, :cond_1

    iget v0, p0, Lorg/msgpack/core/e;->b:I

    if-le p3, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/msgpack/core/e;->e:Lorg/msgpack/core/buffer/MessageBuffer;

    invoke-virtual {v0, v1, p1, p2, p3}, Lorg/msgpack/core/buffer/MessageBuffer;->putBytes(I[BII)V

    iget p1, p0, Lorg/msgpack/core/e;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Lorg/msgpack/core/e;->f:I

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lorg/msgpack/core/e;->flush()V

    iget-object v0, p0, Lorg/msgpack/core/e;->d:Lorg/msgpack/core/buffer/e;

    invoke-interface {v0, p1, p2, p3}, Lorg/msgpack/core/buffer/e;->write([BII)V

    iget-wide p1, p0, Lorg/msgpack/core/e;->g:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lorg/msgpack/core/e;->g:J

    :goto_1
    return-object p0
.end method

.method public s(Z)Lorg/msgpack/core/e;
    .locals 0

    if-eqz p1, :cond_0

    const/16 p1, -0x3d

    goto :goto_0

    :cond_0
    const/16 p1, -0x3e

    :goto_0
    invoke-direct {p0, p1}, Lorg/msgpack/core/e;->Y(B)V

    return-object p0
.end method

.method public v(D)Lorg/msgpack/core/e;
    .locals 1

    const/16 v0, -0x35

    invoke-direct {p0, v0, p1, p2}, Lorg/msgpack/core/e;->d0(BD)V

    return-object p0
.end method

.method public y(BI)Lorg/msgpack/core/e;
    .locals 2

    const/16 v0, 0x100

    if-ge p2, v0, :cond_6

    const/16 v0, -0x39

    if-lez p2, :cond_5

    add-int/lit8 v1, p2, -0x1

    and-int/2addr v1, p2

    if-nez v1, :cond_5

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    const/16 p2, -0x2c

    invoke-direct {p0, p2, p1}, Lorg/msgpack/core/e;->b0(BB)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    const/16 p2, -0x2b

    invoke-direct {p0, p2, p1}, Lorg/msgpack/core/e;->b0(BB)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    if-ne p2, v1, :cond_2

    const/16 p2, -0x2a

    invoke-direct {p0, p2, p1}, Lorg/msgpack/core/e;->b0(BB)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x8

    if-ne p2, v1, :cond_3

    const/16 p2, -0x29

    invoke-direct {p0, p2, p1}, Lorg/msgpack/core/e;->b0(BB)V

    goto :goto_0

    :cond_3
    const/16 v1, 0x10

    if-ne p2, v1, :cond_4

    const/16 p2, -0x28

    invoke-direct {p0, p2, p1}, Lorg/msgpack/core/e;->b0(BB)V

    goto :goto_0

    :cond_4
    int-to-byte p2, p2

    invoke-direct {p0, v0, p2}, Lorg/msgpack/core/e;->b0(BB)V

    invoke-direct {p0, p1}, Lorg/msgpack/core/e;->Y(B)V

    goto :goto_0

    :cond_5
    int-to-byte p2, p2

    invoke-direct {p0, v0, p2}, Lorg/msgpack/core/e;->b0(BB)V

    invoke-direct {p0, p1}, Lorg/msgpack/core/e;->Y(B)V

    goto :goto_0

    :cond_6
    const/high16 v0, 0x10000

    if-ge p2, v0, :cond_7

    const/16 v0, -0x38

    int-to-short p2, p2

    invoke-direct {p0, v0, p2}, Lorg/msgpack/core/e;->n0(BS)V

    invoke-direct {p0, p1}, Lorg/msgpack/core/e;->Y(B)V

    goto :goto_0

    :cond_7
    const/16 v0, -0x37

    invoke-direct {p0, v0, p2}, Lorg/msgpack/core/e;->f0(BI)V

    invoke-direct {p0, p1}, Lorg/msgpack/core/e;->Y(B)V

    :goto_0
    return-object p0
.end method
