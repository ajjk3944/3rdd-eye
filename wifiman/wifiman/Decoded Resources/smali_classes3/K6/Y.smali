.class public final synthetic LK6/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:LK6/g0;

.field public final synthetic b:LHg/b;

.field public final synthetic c:LP6/h;

.field public final synthetic d:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic e:LG6/C;


# direct methods
.method public synthetic constructor <init>(LK6/g0;LHg/b;LP6/h;Landroid/bluetooth/BluetoothGattCharacteristic;LG6/C;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/Y;->a:LK6/g0;

    iput-object p2, p0, LK6/Y;->b:LHg/b;

    iput-object p3, p0, LK6/Y;->c:LP6/h;

    iput-object p4, p0, LK6/Y;->d:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p5, p0, LK6/Y;->e:LG6/C;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LK6/Y;->a:LK6/g0;

    iget-object v1, p0, LK6/Y;->b:LHg/b;

    iget-object v2, p0, LK6/Y;->c:LP6/h;

    iget-object v3, p0, LK6/Y;->d:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v4, p0, LK6/Y;->e:LG6/C;

    invoke-static {v0, v1, v2, v3, v4}, LK6/g0;->d(LK6/g0;LHg/b;LP6/h;Landroid/bluetooth/BluetoothGattCharacteristic;LG6/C;)V

    return-void
.end method
