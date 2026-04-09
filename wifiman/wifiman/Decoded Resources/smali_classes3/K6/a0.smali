.class public final synthetic LK6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/g;


# instance fields
.field public final synthetic a:LG6/C;

.field public final synthetic b:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic c:LK6/w;

.field public final synthetic d:[B


# direct methods
.method public synthetic constructor <init>(LG6/C;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/a0;->a:LG6/C;

    iput-object p2, p0, LK6/a0;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p3, p0, LK6/a0;->c:LK6/w;

    iput-object p4, p0, LK6/a0;->d:[B

    return-void
.end method


# virtual methods
.method public final a(Lgg/b;)Lgg/f;
    .locals 4

    iget-object v0, p0, LK6/a0;->a:LG6/C;

    iget-object v1, p0, LK6/a0;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v2, p0, LK6/a0;->c:LK6/w;

    iget-object v3, p0, LK6/a0;->d:[B

    invoke-static {v0, v1, v2, v3, p1}, LK6/g0;->a(LG6/C;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[BLgg/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
