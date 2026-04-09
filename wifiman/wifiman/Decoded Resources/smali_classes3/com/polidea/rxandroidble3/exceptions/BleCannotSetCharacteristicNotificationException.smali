.class public Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;
.super Lcom/polidea/rxandroidble3/exceptions/BleException;
.source "SourceFile"


# instance fields
.field private final a:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private final b:I


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothGattCharacteristic;ILjava/lang/Throwable;)V
    .locals 1

    invoke-static {p1, p2}, Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lcom/polidea/rxandroidble3/exceptions/BleException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;->a:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput p2, p0, Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;->b:I

    return-void
.end method

.method private static a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (code "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") with characteristic UUID "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const-string/jumbo p0, "Unknown error"

    return-object p0

    :cond_0
    const-string p0, "Cannot write client characteristic config descriptor"

    return-object p0

    :cond_1
    const-string p0, "Cannot find client characteristic config descriptor"

    return-object p0

    :cond_2
    const-string p0, "Cannot set local notification"

    return-object p0
.end method
