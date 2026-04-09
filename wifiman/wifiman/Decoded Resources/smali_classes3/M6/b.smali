.class public LM6/b;
.super LI6/t;
.source "SourceFile"


# instance fields
.field private final e:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private final f:[B


# direct methods
.method constructor <init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LM6/x;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 1

    sget-object v0, LH6/a;->e:LH6/a;

    invoke-direct {p0, p2, p1, v0, p3}, LI6/t;-><init>(Landroid/bluetooth/BluetoothGatt;LK6/l0;LH6/a;LM6/x;)V

    iput-object p4, p0, LM6/b;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p5, p0, LM6/b;->f:[B

    return-void
.end method


# virtual methods
.method protected d(LK6/l0;)Lgg/z;
    .locals 1

    invoke-virtual {p1}, LK6/l0;->c()Lgg/s;

    move-result-object p1

    iget-object v0, p0, LM6/b;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0}, LP6/f;->a(Ljava/util/UUID;)Lkg/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->P()Lgg/z;

    move-result-object p1

    invoke-static {}, LP6/f;->c()Lkg/n;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method protected g(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 2

    iget-object v0, p0, LM6/b;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v1, p0, LM6/b;->f:[B

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    iget-object v0, p0, LM6/b;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CharacteristicWriteOperation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LI6/t;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", characteristic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, LL6/b$a;

    iget-object v2, p0, LM6/b;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    iget-object v3, p0, LM6/b;->f:[B

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, LL6/b$a;-><init>(Ljava/util/UUID;[BZ)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
