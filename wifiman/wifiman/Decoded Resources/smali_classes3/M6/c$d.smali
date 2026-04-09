.class LM6/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/c;->g()Lgg/z;
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

    iput-object p1, p0, LM6/c$d;->a:LM6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/A;)V
    .locals 3

    iget-object v0, p0, LM6/c$d;->a:LM6/c;

    invoke-virtual {v0}, LM6/c;->d()Lgg/z;

    move-result-object v0

    iget-object v1, p0, LM6/c$d;->a:LM6/c;

    iget-object v1, v1, LM6/c;->c:LK6/l0;

    invoke-virtual {v1}, LK6/l0;->d()Lgg/s;

    move-result-object v1

    new-instance v2, LM6/c$d$a;

    invoke-direct {v2, p0}, LM6/c$d$a;-><init>(LM6/c$d;)V

    invoke-virtual {v1, v2}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->k(Lgg/v;)Lgg/z;

    move-result-object v0

    iget-object v1, p0, LM6/c$d;->a:LM6/c;

    iget-object v1, v1, LM6/c;->c:LK6/l0;

    invoke-virtual {v1}, LK6/l0;->k()Lgg/s;

    move-result-object v1

    invoke-virtual {v1}, Lgg/s;->P()Lgg/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->D(Lgg/D;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    invoke-static {p1}, LP6/u;->c(Lgg/A;)LCg/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->P(Lgg/B;)Lgg/B;

    move-result-object v0

    check-cast v0, LCg/b;

    invoke-interface {p1, v0}, Lgg/A;->g(Lhg/c;)V

    iget-object p1, p0, LM6/c$d;->a:LM6/c;

    iget-object p1, p1, LM6/c;->g:LK6/m;

    sget-object v0, LG6/N$b;->CONNECTING:LG6/N$b;

    invoke-interface {p1, v0}, LK6/m;->a(LG6/N$b;)V

    iget-object p1, p0, LM6/c$d;->a:LM6/c;

    iget-object v0, p1, LM6/c;->b:LP6/b;

    iget-object v1, p1, LM6/c;->a:Landroid/bluetooth/BluetoothDevice;

    iget-boolean v2, p1, LM6/c;->f:Z

    iget-object p1, p1, LM6/c;->c:LK6/l0;

    invoke-virtual {p1}, LK6/l0;->a()Landroid/bluetooth/BluetoothGattCallback;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, LP6/b;->a(Landroid/bluetooth/BluetoothDevice;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    iget-object v0, p0, LM6/c$d;->a:LM6/c;

    iget-object v0, v0, LM6/c;->d:LK6/a;

    invoke-virtual {v0, p1}, LK6/a;->b(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method
