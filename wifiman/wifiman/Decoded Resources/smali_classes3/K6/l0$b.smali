.class LK6/l0$b;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK6/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LK6/l0;


# direct methods
.method constructor <init>(LK6/l0;)V
    .locals 0

    iput-object p1, p0, LK6/l0$b;->a:LK6/l0;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method

.method private a(I)Z
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 3

    const-string/jumbo v0, "onCharacteristicChanged"

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, LL6/b;->m(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2}, LK6/T;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    iget-object p1, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p1, p1, LK6/l0;->i:LJ5/d;

    invoke-virtual {p1}, LJ5/d;->i1()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p1, p1, LK6/l0;->i:LJ5/d;

    new-instance v0, LP6/g;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getInstanceId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-direct {v0, v1, v2, p2}, LP6/g;-><init>(Ljava/util/UUID;Ljava/lang/Integer;[B)V

    invoke-virtual {p1, v0}, LJ5/d;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 2

    const-string/jumbo v0, "onCharacteristicRead"

    const/4 v1, 0x1

    invoke-static {v0, p1, p3, p2, v1}, LL6/b;->k(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattCharacteristic;Z)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2, p3}, LK6/T;->i(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->g:LK6/l0$c;

    invoke-virtual {v0}, LK6/l0$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->g:LK6/l0$c;

    sget-object v1, LH6/a;->d:LH6/a;

    invoke-static {v0, p1, p2, p3, v1}, LK6/l0;->m(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILH6/a;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p1, p1, LK6/l0;->g:LK6/l0$c;

    iget-object p1, p1, LK6/l0$c;->a:LJ5/c;

    new-instance p3, LP6/e;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-direct {p3, v0, p2}, LP6/e;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, LJ5/c;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 2

    const-string/jumbo v0, "onCharacteristicWrite"

    const/4 v1, 0x0

    invoke-static {v0, p1, p3, p2, v1}, LL6/b;->k(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattCharacteristic;Z)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2, p3}, LK6/T;->m(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->h:LK6/l0$c;

    invoke-virtual {v0}, LK6/l0$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->h:LK6/l0$c;

    sget-object v1, LH6/a;->e:LH6/a;

    invoke-static {v0, p1, p2, p3, v1}, LK6/l0;->m(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILH6/a;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p1, p1, LK6/l0;->h:LK6/l0$c;

    iget-object p1, p1, LK6/l0$c;->a:LJ5/c;

    new-instance p3, LP6/e;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-direct {p3, v0, p2}, LP6/e;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, LJ5/c;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 3

    const-string/jumbo v0, "onConnectionStateChange"

    invoke-static {v0, p1, p2, p3}, LL6/b;->i(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2, p3}, LK6/T;->b(Landroid/bluetooth/BluetoothGatt;II)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->b:LK6/a;

    invoke-virtual {v0, p1}, LK6/a;->b(Landroid/bluetooth/BluetoothGatt;)V

    invoke-direct {p0, p3}, LK6/l0$b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->c:LK6/A;

    new-instance v1, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, LK6/A;->d(Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->c:LK6/A;

    new-instance v1, Lcom/polidea/rxandroidble3/exceptions/BleGattException;

    sget-object v2, LH6/a;->b:LH6/a;

    invoke-direct {v1, p1, p2, v2}, Lcom/polidea/rxandroidble3/exceptions/BleGattException;-><init>(Landroid/bluetooth/BluetoothGatt;ILH6/a;)V

    invoke-virtual {v0, v1}, LK6/A;->e(Lcom/polidea/rxandroidble3/exceptions/BleGattException;)V

    :cond_1
    :goto_0
    iget-object p1, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p1, p1, LK6/l0;->e:LJ5/c;

    invoke-static {p3}, LK6/l0;->j(I)LG6/N$b;

    move-result-object p2

    invoke-virtual {p1, p2}, LJ5/c;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 7

    const-string/jumbo v0, "onConnectionUpdated"

    move-object v1, p1

    move v2, p5

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, LL6/b;->n(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;IIII)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v1, v0, LK6/l0;->d:LK6/T;

    move-object v2, p1

    move v6, p5

    invoke-virtual/range {v1 .. v6}, LK6/T;->f(Landroid/bluetooth/BluetoothGatt;IIII)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->p:LK6/l0$c;

    invoke-virtual {v0}, LK6/l0$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->p:LK6/l0$c;

    sget-object v1, LH6/a;->o:LH6/a;

    invoke-static {v0, p1, p5, v1}, LK6/l0;->l(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;ILH6/a;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p1, p1, LK6/l0;->p:LK6/l0$c;

    iget-object p1, p1, LK6/l0$c;->a:LJ5/c;

    new-instance p5, LK6/l;

    invoke-direct {p5, p2, p3, p4}, LK6/l;-><init>(III)V

    invoke-virtual {p1, p5}, LJ5/c;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 2

    const-string/jumbo v0, "onDescriptorRead"

    const/4 v1, 0x1

    invoke-static {v0, p1, p3, p2, v1}, LL6/b;->l(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattDescriptor;Z)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2, p3}, LK6/T;->c(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->j:LK6/l0$c;

    invoke-virtual {v0}, LK6/l0$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->j:LK6/l0$c;

    sget-object v1, LH6/a;->h:LH6/a;

    invoke-static {v0, p1, p2, p3, v1}, LK6/l0;->n(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILH6/a;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p1, p1, LK6/l0;->j:LK6/l0$c;

    iget-object p1, p1, LK6/l0$c;->a:LJ5/c;

    new-instance p3, LP6/e;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    invoke-direct {p3, p2, v0}, LP6/e;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, LJ5/c;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 2

    const-string/jumbo v0, "onDescriptorWrite"

    const/4 v1, 0x0

    invoke-static {v0, p1, p3, p2, v1}, LL6/b;->l(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattDescriptor;Z)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2, p3}, LK6/T;->d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->k:LK6/l0$c;

    invoke-virtual {v0}, LK6/l0$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->k:LK6/l0$c;

    sget-object v1, LH6/a;->i:LH6/a;

    invoke-static {v0, p1, p2, p3, v1}, LK6/l0;->n(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILH6/a;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p1, p1, LK6/l0;->k:LK6/l0$c;

    iget-object p1, p1, LK6/l0$c;->a:LJ5/c;

    new-instance p3, LP6/e;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    invoke-direct {p3, p2, v0}, LP6/e;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, LJ5/c;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 2

    const-string/jumbo v0, "onMtuChanged"

    invoke-static {v0, p1, p3, p2}, LL6/b;->i(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2, p3}, LK6/T;->e(Landroid/bluetooth/BluetoothGatt;II)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->m:LK6/l0$c;

    invoke-virtual {v0}, LK6/l0$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->m:LK6/l0$c;

    sget-object v1, LH6/a;->l:LH6/a;

    invoke-static {v0, p1, p3, v1}, LK6/l0;->l(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;ILH6/a;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p1, p1, LK6/l0;->m:LK6/l0$c;

    iget-object p1, p1, LK6/l0$c;->a:LJ5/c;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, LJ5/c;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 2

    const-string/jumbo v0, "onPhyRead"

    invoke-static {v0, p1, p4, p2, p3}, LL6/b;->j(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;III)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2, p3, p4}, LK6/T;->g(Landroid/bluetooth/BluetoothGatt;III)V

    invoke-super {p0, p1, p2, p3, p4}, Landroid/bluetooth/BluetoothGattCallback;->onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->n:LK6/l0$c;

    invoke-virtual {v0}, LK6/l0$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->n:LK6/l0$c;

    sget-object v1, LH6/a;->m:LH6/a;

    invoke-static {v0, p1, p4, v1}, LK6/l0;->l(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;ILH6/a;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p2, p3}, LI6/r;->c(II)LG6/D;

    move-result-object p1

    iget-object p2, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p2, p2, LK6/l0;->n:LK6/l0$c;

    iget-object p2, p2, LK6/l0$c;->a:LJ5/c;

    invoke-virtual {p2, p1}, LJ5/c;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 2

    const-string/jumbo v0, "onPhyUpdate"

    invoke-static {v0, p1, p4, p2, p3}, LL6/b;->j(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;III)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2, p3, p4}, LK6/T;->h(Landroid/bluetooth/BluetoothGatt;III)V

    invoke-super {p0, p1, p2, p3, p4}, Landroid/bluetooth/BluetoothGattCallback;->onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->o:LK6/l0$c;

    invoke-virtual {v0}, LK6/l0$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->o:LK6/l0$c;

    sget-object v1, LH6/a;->n:LH6/a;

    invoke-static {v0, p1, p4, v1}, LK6/l0;->l(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;ILH6/a;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p2, p3}, LI6/r;->c(II)LG6/D;

    move-result-object p1

    iget-object p2, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p2, p2, LK6/l0;->o:LK6/l0$c;

    iget-object p2, p2, LK6/l0$c;->a:LJ5/c;

    invoke-virtual {p2, p1}, LJ5/c;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 2

    const-string/jumbo v0, "onReadRemoteRssi"

    invoke-static {v0, p1, p3, p2}, LL6/b;->i(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2, p3}, LK6/T;->j(Landroid/bluetooth/BluetoothGatt;II)V

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->l:LK6/l0$c;

    invoke-virtual {v0}, LK6/l0$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->l:LK6/l0$c;

    sget-object v1, LH6/a;->k:LH6/a;

    invoke-static {v0, p1, p3, v1}, LK6/l0;->l(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;ILH6/a;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p1, p1, LK6/l0;->l:LK6/l0$c;

    iget-object p1, p1, LK6/l0$c;->a:LJ5/c;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, LJ5/c;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 1

    const-string/jumbo v0, "onReliableWriteCompleted"

    invoke-static {v0, p1, p2}, LL6/b;->h(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;I)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2}, LK6/T;->k(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V

    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 2

    const-string/jumbo v0, "onServicesDiscovered"

    invoke-static {v0, p1, p2}, LL6/b;->h(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;I)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->d:LK6/T;

    invoke-virtual {v0, p1, p2}, LK6/T;->l(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->f:LK6/l0$c;

    invoke-virtual {v0}, LK6/l0$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK6/l0$b;->a:LK6/l0;

    iget-object v0, v0, LK6/l0;->f:LK6/l0$c;

    sget-object v1, LH6/a;->c:LH6/a;

    invoke-static {v0, p1, p2, v1}, LK6/l0;->l(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;ILH6/a;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, LK6/l0$b;->a:LK6/l0;

    iget-object p2, p2, LK6/l0;->f:LK6/l0$c;

    iget-object p2, p2, LK6/l0$c;->a:LJ5/c;

    new-instance v0, LG6/P;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, LG6/P;-><init>(Ljava/util/List;)V

    invoke-virtual {p2, v0}, LJ5/c;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
