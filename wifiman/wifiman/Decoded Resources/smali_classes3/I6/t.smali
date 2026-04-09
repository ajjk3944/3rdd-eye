.class public abstract LI6/t;
.super LI6/j;
.source "SourceFile"


# instance fields
.field private final a:Landroid/bluetooth/BluetoothGatt;

.field private final b:LK6/l0;

.field private final c:LH6/a;

.field private final d:LM6/x;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothGatt;LK6/l0;LH6/a;LM6/x;)V
    .locals 0

    invoke-direct {p0}, LI6/j;-><init>()V

    iput-object p1, p0, LI6/t;->a:Landroid/bluetooth/BluetoothGatt;

    iput-object p2, p0, LI6/t;->b:LK6/l0;

    iput-object p3, p0, LI6/t;->c:LH6/a;

    iput-object p4, p0, LI6/t;->d:LM6/x;

    return-void
.end method


# virtual methods
.method protected final b(Lgg/t;LO6/i;)V
    .locals 7

    new-instance v0, LP6/F;

    invoke-direct {v0, p1, p2}, LP6/F;-><init>(Lgg/t;LO6/i;)V

    iget-object p1, p0, LI6/t;->b:LK6/l0;

    invoke-virtual {p0, p1}, LI6/t;->d(LK6/l0;)Lgg/z;

    move-result-object v1

    iget-object p1, p0, LI6/t;->d:LM6/x;

    iget-wide v2, p1, LM6/x;->a:J

    iget-object v4, p1, LM6/x;->b:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p1, LM6/x;->c:Lgg/y;

    iget-object p1, p0, LI6/t;->a:Landroid/bluetooth/BluetoothGatt;

    iget-object p2, p0, LI6/t;->b:LK6/l0;

    invoke-virtual {p0, p1, p2, v5}, LI6/t;->h(Landroid/bluetooth/BluetoothGatt;LK6/l0;Lgg/y;)Lgg/z;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Lgg/z;->R(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/D;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->Y()Lgg/s;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/s;->d(Lgg/x;)V

    iget-object p1, p0, LI6/t;->a:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p0, p1}, LI6/t;->g(Landroid/bluetooth/BluetoothGatt;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, LP6/F;->cancel()V

    new-instance p1, Lcom/polidea/rxandroidble3/exceptions/BleGattCannotStartException;

    iget-object p2, p0, LI6/t;->a:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, LI6/t;->c:LH6/a;

    invoke-direct {p1, p2, v1}, Lcom/polidea/rxandroidble3/exceptions/BleGattCannotStartException;-><init>(Landroid/bluetooth/BluetoothGatt;LH6/a;)V

    invoke-virtual {v0, p1}, LP6/F;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method protected c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble3/exceptions/BleException;
    .locals 3

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;

    iget-object v1, p0, LI6/t;->a:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;I)V

    return-object v0
.end method

.method protected abstract d(LK6/l0;)Lgg/z;
.end method

.method protected abstract g(Landroid/bluetooth/BluetoothGatt;)Z
.end method

.method protected h(Landroid/bluetooth/BluetoothGatt;LK6/l0;Lgg/y;)Lgg/z;
    .locals 0

    new-instance p1, Lcom/polidea/rxandroidble3/exceptions/BleGattCallbackTimeoutException;

    iget-object p2, p0, LI6/t;->a:Landroid/bluetooth/BluetoothGatt;

    iget-object p3, p0, LI6/t;->c:LH6/a;

    invoke-direct {p1, p2, p3}, Lcom/polidea/rxandroidble3/exceptions/BleGattCallbackTimeoutException;-><init>(Landroid/bluetooth/BluetoothGatt;LH6/a;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI6/t;->a:Landroid/bluetooth/BluetoothGatt;

    invoke-static {v0}, LL6/b;->c(Landroid/bluetooth/BluetoothGatt;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
