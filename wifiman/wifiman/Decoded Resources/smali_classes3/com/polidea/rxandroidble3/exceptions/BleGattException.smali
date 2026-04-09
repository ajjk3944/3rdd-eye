.class public Lcom/polidea/rxandroidble3/exceptions/BleGattException;
.super Lcom/polidea/rxandroidble3/exceptions/BleException;
.source "SourceFile"


# instance fields
.field private final a:Landroid/bluetooth/BluetoothGatt;

.field private final b:I

.field private final c:LH6/a;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothGatt;ILH6/a;)V
    .locals 1

    .line 1
    invoke-static {p1, p2, p3}, Lcom/polidea/rxandroidble3/exceptions/BleGattException;->a(Landroid/bluetooth/BluetoothGatt;ILH6/a;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/polidea/rxandroidble3/exceptions/BleException;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/polidea/rxandroidble3/exceptions/BleGattException;->a:Landroid/bluetooth/BluetoothGatt;

    .line 3
    iput p2, p0, Lcom/polidea/rxandroidble3/exceptions/BleGattException;->b:I

    .line 4
    iput-object p3, p0, Lcom/polidea/rxandroidble3/exceptions/BleGattException;->c:LH6/a;

    return-void
.end method

.method public constructor <init>(Landroid/bluetooth/BluetoothGatt;LH6/a;)V
    .locals 1

    const/4 v0, -0x1

    .line 5
    invoke-direct {p0, p1, v0, p2}, Lcom/polidea/rxandroidble3/exceptions/BleGattException;-><init>(Landroid/bluetooth/BluetoothGatt;ILH6/a;)V

    return-void
.end method

.method private static a(Landroid/bluetooth/BluetoothGatt;ILH6/a;)Ljava/lang/String;
    .locals 6

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    invoke-static {p0}, Lcom/polidea/rxandroidble3/exceptions/BleGattException;->d(Landroid/bluetooth/BluetoothGatt;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0, p2}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo p1, "GATT exception from MAC address %s, with type %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1}, LR6/a;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, LL6/b;->c(Landroid/bluetooth/BluetoothGatt;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string/jumbo v5, "https://cs.android.com/android/platform/superproject/+/master:packages/modules/Bluetooth/system/stack/include/gatt_api.h"

    move-object v3, p2

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo p1, "GATT exception from %s, status %d (%s), type %s. (Look up status 0x%02x here %s)"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static d(Landroid/bluetooth/BluetoothGatt;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public c()LH6/a;
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble3/exceptions/BleGattException;->c:LH6/a;

    return-object v0
.end method
