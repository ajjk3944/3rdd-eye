.class LM6/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/c;->h()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/c;


# direct methods
.method constructor <init>(LM6/c;)V
    .locals 0

    iput-object p1, p0, LM6/c$c;->a:LM6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/bluetooth/BluetoothGatt;
    .locals 3

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleGattCallbackTimeoutException;

    iget-object v1, p0, LM6/c$c;->a:LM6/c;

    iget-object v1, v1, LM6/c;->d:LK6/a;

    invoke-virtual {v1}, LK6/a;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    sget-object v2, LH6/a;->b:LH6/a;

    invoke-direct {v0, v1, v2}, Lcom/polidea/rxandroidble3/exceptions/BleGattCallbackTimeoutException;-><init>(Landroid/bluetooth/BluetoothGatt;LH6/a;)V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM6/c$c;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method
