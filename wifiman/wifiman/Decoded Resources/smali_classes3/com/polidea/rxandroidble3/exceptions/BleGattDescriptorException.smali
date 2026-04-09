.class public Lcom/polidea/rxandroidble3/exceptions/BleGattDescriptorException;
.super Lcom/polidea/rxandroidble3/exceptions/BleGattException;
.source "SourceFile"


# instance fields
.field public final d:Landroid/bluetooth/BluetoothGattDescriptor;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILH6/a;)V
    .locals 0

    invoke-direct {p0, p1, p3, p4}, Lcom/polidea/rxandroidble3/exceptions/BleGattException;-><init>(Landroid/bluetooth/BluetoothGatt;ILH6/a;)V

    iput-object p2, p0, Lcom/polidea/rxandroidble3/exceptions/BleGattDescriptorException;->d:Landroid/bluetooth/BluetoothGattDescriptor;

    return-void
.end method
