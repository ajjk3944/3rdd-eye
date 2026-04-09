.class LK6/T;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :cond_0
    return-void
.end method

.method b(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    :cond_0
    return-void
.end method

.method c(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    :cond_0
    return-void
.end method

.method d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    :cond_0
    return-void
.end method

.method e(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    :cond_0
    return-void
.end method

.method f(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 0

    return-void
.end method

.method g(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/bluetooth/BluetoothGattCallback;->onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V

    :cond_0
    return-void
.end method

.method h(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/bluetooth/BluetoothGattCallback;->onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V

    :cond_0
    return-void
.end method

.method i(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    :cond_0
    return-void
.end method

.method j(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V

    :cond_0
    return-void
.end method

.method k(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V

    :cond_0
    return-void
.end method

.method l(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    :cond_0
    return-void
.end method

.method m(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 1

    iget-object v0, p0, LK6/T;->a:Landroid/bluetooth/BluetoothGattCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    :cond_0
    return-void
.end method
