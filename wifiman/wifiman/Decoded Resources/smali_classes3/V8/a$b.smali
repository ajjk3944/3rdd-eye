.class final LV8/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/a;-><init>(LG6/N;Landroid/bluetooth/BluetoothGattCharacteristic;Lgg/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/a;

.field final synthetic b:Landroid/bluetooth/BluetoothGattCharacteristic;


# direct methods
.method constructor <init>(LV8/a;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0

    iput-object p1, p0, LV8/a$b;->a:LV8/a;

    iput-object p2, p0, LV8/a$b;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)V
    .locals 3

    const-string/jumbo v0, "packetFrame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV8/a$b;->a:LV8/a;

    new-instance v1, LV8/a$b$a;

    iget-object v2, p0, LV8/a$b;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-direct {v1, v2, p1}, LV8/a$b$a;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-static {v0, v1}, LV8/a;->c(LV8/a;Lmh/a;)V

    iget-object v0, p0, LV8/a$b;->a:LV8/a;

    invoke-static {v0, p1}, LV8/a;->d(LV8/a;[B)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, LV8/a$b;->a([B)V

    return-void
.end method
