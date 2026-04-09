.class final LV8/k$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;->M(LG6/N;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LG6/N;

.field final synthetic b:LV8/k;


# direct methods
.method constructor <init>(LG6/N;LV8/k;)V
    .locals 0

    iput-object p1, p0, LV8/k$x;->a:LG6/N;

    iput-object p2, p0, LV8/k$x;->b:LV8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothGattCharacteristic;)LV8/b;
    .locals 4

    const-string/jumbo v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV8/b;

    iget-object v1, p0, LV8/k$x;->a:LG6/N;

    iget-object v2, p0, LV8/k$x;->b:LV8/k;

    invoke-static {v2}, LV8/k;->p(LV8/k;)LV8/e$b;

    move-result-object v2

    invoke-virtual {v2}, LV8/e$b;->c()Z

    move-result v2

    iget-object v3, p0, LV8/k$x;->b:LV8/k;

    invoke-static {v3}, LV8/k;->p(LV8/k;)LV8/e$b;

    move-result-object v3

    invoke-virtual {v3}, LV8/e$b;->e()Z

    move-result v3

    invoke-direct {v0, v1, p1, v2, v3}, LV8/b;-><init>(LG6/N;Landroid/bluetooth/BluetoothGattCharacteristic;ZZ)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, p1}, LV8/k$x;->a(Landroid/bluetooth/BluetoothGattCharacteristic;)LV8/b;

    move-result-object p1

    return-object p1
.end method
