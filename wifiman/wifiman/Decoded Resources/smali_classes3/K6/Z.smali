.class public final synthetic LK6/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothGatt;

.field public final synthetic b:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/Z;->a:Landroid/bluetooth/BluetoothGatt;

    iput-object p2, p0, LK6/Z;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-boolean p3, p0, LK6/Z;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LK6/Z;->a:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, LK6/Z;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-boolean v2, p0, LK6/Z;->c:Z

    invoke-static {v0, v1, v2}, LK6/g0;->h(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    return-void
.end method
