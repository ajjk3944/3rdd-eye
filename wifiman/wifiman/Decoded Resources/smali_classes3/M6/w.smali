.class public LM6/w;
.super LI6/t;
.source "SourceFile"


# instance fields
.field final e:Landroid/bluetooth/BluetoothGatt;

.field final f:LL6/c;


# direct methods
.method constructor <init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LL6/c;LM6/x;)V
    .locals 1

    sget-object v0, LH6/a;->c:LH6/a;

    invoke-direct {p0, p2, p1, v0, p4}, LI6/t;-><init>(Landroid/bluetooth/BluetoothGatt;LK6/l0;LH6/a;LM6/x;)V

    iput-object p2, p0, LM6/w;->e:Landroid/bluetooth/BluetoothGatt;

    iput-object p3, p0, LM6/w;->f:LL6/c;

    return-void
.end method

.method public static synthetic j(Landroid/bluetooth/BluetoothGatt;Ljava/lang/Long;)Lgg/z;
    .locals 0

    invoke-static {p0, p1}, LM6/w;->t(Landroid/bluetooth/BluetoothGatt;Ljava/lang/Long;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Landroid/bluetooth/BluetoothGatt;Lgg/y;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LM6/w;->v(Landroid/bluetooth/BluetoothGatt;Lgg/y;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroid/bluetooth/BluetoothGatt;)LG6/P;
    .locals 0

    invoke-static {p0}, LM6/w;->s(Landroid/bluetooth/BluetoothGatt;)LG6/P;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(LM6/w;LG6/P;)V
    .locals 0

    invoke-direct {p0, p1}, LM6/w;->r(LG6/P;)V

    return-void
.end method

.method private synthetic r(LG6/P;)V
    .locals 2

    iget-object v0, p0, LM6/w;->f:LL6/c;

    iget-object v1, p0, LM6/w;->e:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LL6/c;->m(LG6/P;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private static synthetic s(Landroid/bluetooth/BluetoothGatt;)LG6/P;
    .locals 1

    new-instance v0, LG6/P;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, LG6/P;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private static synthetic t(Landroid/bluetooth/BluetoothGatt;Ljava/lang/Long;)Lgg/z;
    .locals 0

    new-instance p1, LM6/v;

    invoke-direct {p1, p0}, LM6/v;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-static {p1}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic v(Landroid/bluetooth/BluetoothGatt;Lgg/y;)Lgg/D;
    .locals 3

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lcom/polidea/rxandroidble3/exceptions/BleGattCallbackTimeoutException;

    sget-object v0, LH6/a;->c:LH6/a;

    invoke-direct {p1, p0, v0}, Lcom/polidea/rxandroidble3/exceptions/BleGattCallbackTimeoutException;-><init>(Landroid/bluetooth/BluetoothGatt;LH6/a;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/16 v0, 0x5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2, p1}, Lgg/z;->V(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/z;

    move-result-object p1

    new-instance v0, LM6/u;

    invoke-direct {v0, p0}, LM6/u;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected d(LK6/l0;)Lgg/z;
    .locals 1

    invoke-virtual {p1}, LK6/l0;->h()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->P()Lgg/z;

    move-result-object p1

    new-instance v0, LM6/s;

    invoke-direct {v0, p0}, LM6/s;-><init>(LM6/w;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method protected g(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    move-result p1

    return p1
.end method

.method protected h(Landroid/bluetooth/BluetoothGatt;LK6/l0;Lgg/y;)Lgg/z;
    .locals 0

    new-instance p2, LM6/t;

    invoke-direct {p2, p1, p3}, LM6/t;-><init>(Landroid/bluetooth/BluetoothGatt;Lgg/y;)V

    invoke-static {p2}, Lgg/z;->j(Lkg/q;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "ServiceDiscoveryOperation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LI6/t;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
