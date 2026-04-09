.class public final Lcom/ui/wifiman/model/bluetooth/le/d$e;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/d;->v(Landroid/bluetooth/BluetoothDevice;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field final synthetic b:Lkotlin/jvm/internal/N;

.field final synthetic c:Lgg/t;


# direct methods
.method constructor <init>(Landroid/bluetooth/BluetoothDevice;Lkotlin/jvm/internal/N;Lgg/t;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->a:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->b:Lkotlin/jvm/internal/N;

    iput-object p3, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->c:Lgg/t;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 5

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "characteristic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->c:Lgg/t;

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-nez p3, :cond_0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Read characteristic "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "}"

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance p3, Lcom/ui/wifiman/model/bluetooth/le/d$c$a$b;

    invoke-direct {p3, p2}, Lcom/ui/wifiman/model/bluetooth/le/d$c$a$b;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-interface {p1, p3}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Characteristic read failed for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", error: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance p3, Lcom/ui/wifiman/model/bluetooth/le/d$c$a$a;

    invoke-direct {p3, p2}, Lcom/ui/wifiman/model/bluetooth/le/d$c$a$a;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-interface {p1, p3}, Lgg/h;->h(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 3

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-nez p2, :cond_2

    if-eqz p3, :cond_1

    if-eq p3, v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Successfully connected to "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->b:Lkotlin/jvm/internal/N;

    iput-object p1, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->c:Lgg/t;

    new-instance p3, Lcom/ui/wifiman/model/bluetooth/le/d$c$b;

    invoke-direct {p3, p1}, Lcom/ui/wifiman/model/bluetooth/le/d$c$b;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-interface {p2, p3}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Successfully disconnected from "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->c:Lgg/t;

    invoke-interface {p1}, Lgg/h;->a()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " encountered for "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "! Disconnecting..."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->c:Lgg/t;

    new-instance p2, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ConnectionFailed;

    invoke-direct {p2}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ConnectionFailed;-><init>()V

    invoke-interface {p1, p2}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    if-nez p2, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->c:Lgg/t;

    sget-object p2, Lcom/ui/wifiman/model/bluetooth/le/d$c$c;->a:Lcom/ui/wifiman/model/bluetooth/le/d$c$c;

    invoke-interface {p1, p2}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$e;->c:Lgg/t;

    new-instance p2, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ServicesFetchFailed;

    invoke-direct {p2}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ServicesFetchFailed;-><init>()V

    invoke-interface {p1, p2}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
