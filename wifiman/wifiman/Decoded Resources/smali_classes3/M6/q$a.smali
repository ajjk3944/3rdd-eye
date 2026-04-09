.class LM6/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothAdapter$LeScanCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/q;->j(Lgg/t;)Landroid/bluetooth/BluetoothAdapter$LeScanCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/t;

.field final synthetic b:LM6/q;


# direct methods
.method constructor <init>(LM6/q;Lgg/t;)V
    .locals 0

    iput-object p1, p0, LM6/q$a;->b:LM6/q;

    iput-object p2, p0, LM6/q$a;->a:Lgg/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLeScan(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 4

    iget-object v0, p0, LM6/q$a;->b:LM6/q;

    iget-object v0, v0, LM6/q;->c:LN6/e;

    invoke-virtual {v0}, LN6/e;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, LI6/q;->l(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LI6/q;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LL6/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p3}, LL6/b;->a([B)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s, name=%s, rssi=%d, data=%s"

    invoke-static {v1, v0}, LI6/q;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LM6/q$a;->b:LM6/q;

    iget-object v0, v0, LM6/q;->b:LN6/f;

    invoke-virtual {v0, p1, p2, p3}, LN6/f;->b(Landroid/bluetooth/BluetoothDevice;I[B)LN6/o;

    move-result-object p1

    iget-object p2, p0, LM6/q$a;->b:LM6/q;

    iget-object p2, p2, LM6/q;->c:LN6/e;

    invoke-virtual {p2, p1}, LN6/e;->b(LN6/o;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, LM6/q$a;->a:Lgg/t;

    invoke-interface {p2, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
