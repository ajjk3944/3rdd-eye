.class LK6/L$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/L;->a()Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LK6/L;


# direct methods
.method constructor <init>(LK6/L;)V
    .locals 0

    iput-object p1, p0, LK6/L$a;->a:LK6/L;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGattCharacteristic;)Lgg/s;
    .locals 8

    iget-object v0, p0, LK6/L$a;->a:LK6/L;

    iget-object v1, v0, LK6/L;->a:LO6/d;

    iget-object v2, v0, LK6/L;->c:LM6/k;

    iget-object v4, v0, LK6/L;->f:LG6/N$c;

    iget-object v5, v0, LK6/L;->g:LG6/N$d;

    iget-object v6, v0, LK6/L;->e:LK6/i0;

    iget-object v7, v0, LK6/L;->h:[B

    move-object v3, p1

    invoke-interface/range {v2 .. v7}, LM6/k;->c(Landroid/bluetooth/BluetoothGattCharacteristic;LG6/N$c;LG6/N$d;LK6/i0;[B)LM6/a;

    move-result-object p1

    invoke-interface {v1, p1}, LO6/a;->a(LM6/j;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, p1}, LK6/L$a;->a(Landroid/bluetooth/BluetoothGattCharacteristic;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
