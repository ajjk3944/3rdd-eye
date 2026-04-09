.class public LP6/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/polidea/rxandroidble3/exceptions/BleException;


# instance fields
.field private final a:Landroid/bluetooth/BluetoothAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleException;

    const-string/jumbo v1, "bluetoothAdapter is null"

    invoke-direct {v0, v1}, Lcom/polidea/rxandroidble3/exceptions/BleException;-><init>(Ljava/lang/String;)V

    sput-object v0, LP6/G;->b:Lcom/polidea/rxandroidble3/exceptions/BleException;

    return-void
.end method

.method public constructor <init>(Landroid/bluetooth/BluetoothAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/G;->a:Landroid/bluetooth/BluetoothAdapter;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, LP6/G;->a:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, LP6/G;->b:Lcom/polidea/rxandroidble3/exceptions/BleException;

    throw p1
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, LP6/G;->a:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, LP6/G;->a:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V
    .locals 1

    iget-object v0, p0, LP6/G;->a:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    return-void

    :cond_0
    sget-object p1, LP6/G;->b:Lcom/polidea/rxandroidble3/exceptions/BleException;

    throw p1
.end method

.method public e(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z
    .locals 1

    iget-object v0, p0, LP6/G;->a:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothAdapter;->startLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z

    move-result p1

    return p1

    :cond_0
    sget-object p1, LP6/G;->b:Lcom/polidea/rxandroidble3/exceptions/BleException;

    throw p1
.end method

.method public f(Landroid/bluetooth/le/ScanCallback;)V
    .locals 1

    iget-object v0, p0, LP6/G;->a:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "BluetoothAdapter is disabled, calling BluetoothLeScanner.stopScan(ScanCallback) may cause IllegalStateException"

    invoke-static {v0, p1}, LI6/q;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, LP6/G;->a:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, LP6/G;->a:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "Cannot call BluetoothLeScanner.stopScan(ScanCallback) on \'null\' reference; BluetoothAdapter.isEnabled() == %b"

    invoke-static {v0, p1}, LI6/q;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {v0, p1}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V

    return-void

    :cond_2
    sget-object p1, LP6/G;->b:Lcom/polidea/rxandroidble3/exceptions/BleException;

    throw p1
.end method

.method public g(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V
    .locals 1

    iget-object v0, p0, LP6/G;->a:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothAdapter;->stopLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V

    return-void

    :cond_0
    sget-object p1, LP6/G;->b:Lcom/polidea/rxandroidble3/exceptions/BleException;

    throw p1
.end method
