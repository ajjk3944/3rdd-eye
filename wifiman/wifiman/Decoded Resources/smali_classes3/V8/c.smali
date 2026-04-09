.class public final synthetic LV8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:LV8/b;

.field public final synthetic b:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic c:[B


# direct methods
.method public synthetic constructor <init>(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV8/c;->a:LV8/b;

    iput-object p2, p0, LV8/c;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p3, p0, LV8/c;->c:[B

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LV8/c;->a:LV8/b;

    iget-object v1, p0, LV8/c;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v2, p0, LV8/c;->c:[B

    invoke-static {v0, v1, v2}, LV8/b$b$a;->a(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    return-void
.end method
