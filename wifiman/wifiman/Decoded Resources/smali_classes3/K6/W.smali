.class public final synthetic LK6/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field public final synthetic a:LK6/g0;

.field public final synthetic b:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic c:Z

.field public final synthetic d:LG6/C;


# direct methods
.method public synthetic constructor <init>(LK6/g0;Landroid/bluetooth/BluetoothGattCharacteristic;ZLG6/C;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/W;->a:LK6/g0;

    iput-object p2, p0, LK6/W;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-boolean p3, p0, LK6/W;->c:Z

    iput-object p4, p0, LK6/W;->d:LG6/C;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LK6/W;->a:LK6/g0;

    iget-object v1, p0, LK6/W;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-boolean v2, p0, LK6/W;->c:Z

    iget-object v3, p0, LK6/W;->d:LG6/C;

    invoke-static {v0, v1, v2, v3}, LK6/g0;->c(LK6/g0;Landroid/bluetooth/BluetoothGattCharacteristic;ZLG6/C;)Lgg/v;

    move-result-object v0

    return-object v0
.end method
