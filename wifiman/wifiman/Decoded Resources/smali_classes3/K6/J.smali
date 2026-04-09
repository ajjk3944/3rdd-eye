.class public LK6/J;
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
    .locals 1

    iget-object v0, p0, LK6/F;->a:LK6/G;

    invoke-virtual {v0, p1, p2}, LK6/G;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, LI6/q;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method
