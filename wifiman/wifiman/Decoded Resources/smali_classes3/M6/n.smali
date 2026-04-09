.class public LM6/n;
.super LI6/t;
.source "SourceFile"


# direct methods
.method constructor <init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LM6/x;)V
    .locals 1

    sget-object v0, LH6/a;->k:LH6/a;

    invoke-direct {p0, p2, p1, v0, p3}, LI6/t;-><init>(Landroid/bluetooth/BluetoothGatt;LK6/l0;LH6/a;LM6/x;)V

    return-void
.end method


# virtual methods
.method protected d(LK6/l0;)Lgg/z;
    .locals 0

    invoke-virtual {p1}, LK6/l0;->g()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->P()Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method protected g(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->readRemoteRssi()Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "ReadRssiOperation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LI6/t;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
