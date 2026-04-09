.class public LK6/p0;
.super LK6/F;
.source "SourceFile"


# direct methods
.method public constructor <init>(LK6/G;)V
    .locals 0

    invoke-direct {p0, p1}, LK6/F;-><init>(LK6/G;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lcom/polidea/rxandroidble3/internal/BleIllegalOperationException;
    .locals 3

    iget-object v0, p0, LK6/F;->a:LK6/G;

    invoke-virtual {v0, p1, p2}, LK6/G;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/polidea/rxandroidble3/internal/BleIllegalOperationException;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result p1

    invoke-direct {v1, v0, v2, p1, p2}, Lcom/polidea/rxandroidble3/internal/BleIllegalOperationException;-><init>(Ljava/lang/String;Ljava/util/UUID;II)V

    return-object v1
.end method
