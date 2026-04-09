.class public LM6/a;
.super LI6/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM6/a$g;
    }
.end annotation


# instance fields
.field private final a:Landroid/bluetooth/BluetoothGatt;

.field private final b:LK6/l0;

.field private final c:Lgg/y;

.field private final d:LM6/x;

.field private final e:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private final f:LK6/i0;

.field private final g:LG6/N$c;

.field private final h:LG6/N$d;

.field final i:[B

.field private j:[B


# direct methods
.method constructor <init>(Landroid/bluetooth/BluetoothGatt;LK6/l0;Lgg/y;LM6/x;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/i0;LG6/N$c;LG6/N$d;[B)V
    .locals 0

    invoke-direct {p0}, LI6/j;-><init>()V

    iput-object p1, p0, LM6/a;->a:Landroid/bluetooth/BluetoothGatt;

    iput-object p2, p0, LM6/a;->b:LK6/l0;

    iput-object p3, p0, LM6/a;->c:Lgg/y;

    iput-object p4, p0, LM6/a;->d:LM6/x;

    iput-object p5, p0, LM6/a;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p6, p0, LM6/a;->f:LK6/i0;

    iput-object p7, p0, LM6/a;->g:LG6/N$c;

    iput-object p8, p0, LM6/a;->h:LG6/N$d;

    iput-object p9, p0, LM6/a;->i:[B

    return-void
.end method

.method static d(LG6/N$c;Ljava/nio/ByteBuffer;LP6/F;)Lkg/n;
    .locals 1

    new-instance v0, LM6/a$e;

    invoke-direct {v0, p2, p1, p0}, LM6/a$e;-><init>(LP6/F;Ljava/nio/ByteBuffer;LG6/N$c;)V

    return-object v0
.end method

.method private static g(LG6/N$d;Ljava/nio/ByteBuffer;ILM6/a$g;)Lkg/n;
    .locals 1

    new-instance v0, LM6/a$f;

    invoke-direct {v0, p0, p3, p2, p1}, LM6/a$f;-><init>(LG6/N$d;LM6/a$g;ILjava/nio/ByteBuffer;)V

    return-object v0
.end method

.method private j(ILjava/nio/ByteBuffer;LM6/a$g;)Lgg/s;
    .locals 7

    iget-object v0, p0, LM6/a;->b:LK6/l0;

    invoke-virtual {v0}, LK6/l0;->c()Lgg/s;

    move-result-object v3

    new-instance v0, LM6/a$c;

    move-object v1, v0

    move-object v2, p0

    move-object v4, p2

    move v5, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, LM6/a$c;-><init>(LM6/a;Lgg/s;Ljava/nio/ByteBuffer;ILM6/a$g;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method private static n(Landroid/bluetooth/BluetoothGattCharacteristic;)Lkg/p;
    .locals 1

    new-instance v0, LM6/a$d;

    invoke-direct {v0, p0}, LM6/a$d;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-object v0
.end method


# virtual methods
.method protected b(Lgg/t;LO6/i;)V
    .locals 10

    iget-object v0, p0, LM6/a;->f:LK6/i0;

    invoke-interface {v0}, LK6/i0;->a()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v1, Lcom/polidea/rxandroidble3/exceptions/BleGattCallbackTimeoutException;

    iget-object v2, p0, LM6/a;->a:Landroid/bluetooth/BluetoothGatt;

    sget-object v3, LH6/a;->f:LH6/a;

    invoke-direct {v1, v2, v3}, Lcom/polidea/rxandroidble3/exceptions/BleGattCallbackTimeoutException;-><init>(Landroid/bluetooth/BluetoothGatt;LH6/a;)V

    invoke-static {v1}, Lgg/s;->L(Ljava/lang/Throwable;)Lgg/s;

    move-result-object v9

    iget-object v1, p0, LM6/a;->i:[B

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    new-instance v2, LP6/F;

    invoke-direct {v2, p1, p2}, LP6/F;-><init>(Lgg/t;LO6/i;)V

    new-instance p1, LM6/a$a;

    invoke-direct {p1, p0, v1, v0}, LM6/a$a;-><init>(LM6/a;Ljava/nio/ByteBuffer;I)V

    invoke-direct {p0, v0, v1, p1}, LM6/a;->j(ILjava/nio/ByteBuffer;LM6/a$g;)Lgg/s;

    move-result-object p2

    iget-object v3, p0, LM6/a;->c:Lgg/y;

    invoke-virtual {p2, v3}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object p2

    iget-object v3, p0, LM6/a;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-static {v3}, LM6/a;->n(Landroid/bluetooth/BluetoothGattCharacteristic;)Lkg/p;

    move-result-object v3

    invoke-virtual {p2, v3}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object p2

    const-wide/16 v3, 0x1

    invoke-virtual {p2, v3, v4}, Lgg/s;->R0(J)Lgg/s;

    move-result-object v4

    iget-object p2, p0, LM6/a;->d:LM6/x;

    iget-wide v5, p2, LM6/x;->a:J

    iget-object v7, p2, LM6/x;->b:Ljava/util/concurrent/TimeUnit;

    iget-object v8, p2, LM6/x;->c:Lgg/y;

    invoke-virtual/range {v4 .. v9}, Lgg/s;->X0(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/v;)Lgg/s;

    move-result-object p2

    iget-object v3, p0, LM6/a;->g:LG6/N$c;

    invoke-static {v3, v1, v2}, LM6/a;->d(LG6/N$c;Ljava/nio/ByteBuffer;LP6/F;)Lkg/n;

    move-result-object v3

    invoke-virtual {p2, v3}, Lgg/s;->v0(Lkg/n;)Lgg/s;

    move-result-object p2

    iget-object v3, p0, LM6/a;->h:LG6/N$d;

    invoke-static {v3, v1, v0, p1}, LM6/a;->g(LG6/N$d;Ljava/nio/ByteBuffer;ILM6/a$g;)Lkg/n;

    move-result-object p1

    invoke-virtual {p2, p1}, Lgg/s;->A0(Lkg/n;)Lgg/s;

    move-result-object p1

    new-instance p2, LM6/a$b;

    invoke-direct {p2, p0, v2}, LM6/a$b;-><init>(LM6/a;LP6/F;)V

    invoke-virtual {p1, p2}, Lgg/s;->d(Lgg/x;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "batchSizeProvider value must be greater than zero (now: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble3/exceptions/BleException;
    .locals 3

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;

    iget-object v1, p0, LM6/a;->a:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;I)V

    return-object v0
.end method

.method h(Ljava/nio/ByteBuffer;I)[B
    .locals 1

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v0, p0, LM6/a;->j:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    if-eq v0, p2, :cond_1

    :cond_0
    new-array p2, p2, [B

    iput-object p2, p0, LM6/a;->j:[B

    :cond_1
    iget-object p2, p0, LM6/a;->j:[B

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    iget-object p1, p0, LM6/a;->j:[B

    return-object p1
.end method

.method l([BLM6/a$g;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, LI6/q;->l(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, LM6/a$g;->get()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1}, LL6/b;->a([B)Ljava/lang/String;

    move-result-object v0

    filled-new-array {p2, v0}, [Ljava/lang/Object;

    move-result-object p2

    const-string/jumbo v0, "Writing batch #%04d: %s"

    invoke-static {v0, p2}, LI6/q;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object p2, p0, LM6/a;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p2, p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    iget-object p1, p0, LM6/a;->a:Landroid/bluetooth/BluetoothGatt;

    iget-object p2, p0, LM6/a;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p1, p2}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Lcom/polidea/rxandroidble3/exceptions/BleGattCannotStartException;

    iget-object p2, p0, LM6/a;->a:Landroid/bluetooth/BluetoothGatt;

    sget-object v0, LH6/a;->f:LH6/a;

    invoke-direct {p1, p2, v0}, Lcom/polidea/rxandroidble3/exceptions/BleGattCannotStartException;-><init>(Landroid/bluetooth/BluetoothGatt;LH6/a;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CharacteristicLongWriteOperation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM6/a;->a:Landroid/bluetooth/BluetoothGatt;

    invoke-static {v1}, LL6/b;->c(Landroid/bluetooth/BluetoothGatt;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", characteristic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM6/a;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v2, 0x0

    invoke-static {v1, v2}, LL6/b;->u(Landroid/bluetooth/BluetoothGattCharacteristic;Z)LL6/b$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxBatchSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM6/a;->f:LK6/i0;

    invoke-interface {v1}, LK6/i0;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
