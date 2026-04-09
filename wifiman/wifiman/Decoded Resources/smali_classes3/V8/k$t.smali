.class final LV8/k$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;->L(LG6/N;Lgg/b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LG6/N;

.field final synthetic b:Lgg/b;


# direct methods
.method constructor <init>(LG6/N;Lgg/b;)V
    .locals 0

    iput-object p1, p0, LV8/k$t;->a:LG6/N;

    iput-object p2, p0, LV8/k$t;->b:Lgg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothGattCharacteristic;)LV8/a;
    .locals 3

    const-string/jumbo v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV8/a;

    iget-object v1, p0, LV8/k$t;->a:LG6/N;

    iget-object v2, p0, LV8/k$t;->b:Lgg/b;

    invoke-direct {v0, v1, p1, v2}, LV8/a;-><init>(LG6/N;Landroid/bluetooth/BluetoothGattCharacteristic;Lgg/b;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, p1}, LV8/k$t;->a(Landroid/bluetooth/BluetoothGattCharacteristic;)LV8/a;

    move-result-object p1

    return-object p1
.end method
