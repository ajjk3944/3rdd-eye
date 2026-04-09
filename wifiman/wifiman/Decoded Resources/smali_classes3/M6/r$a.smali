.class LM6/r$a;
.super Landroid/bluetooth/le/ScanCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/r;->l(Lgg/t;)Landroid/bluetooth/le/ScanCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/r;


# direct methods
.method constructor <init>(LM6/r;)V
    .locals 0

    iput-object p1, p0, LM6/r$a;->a:LM6/r;

    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchScanResults(Ljava/util/List;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/le/ScanResult;

    iget-object v1, p0, LM6/r$a;->a:LM6/r;

    iget-object v1, v1, LM6/r;->b:LN6/f;

    invoke-virtual {v1, v0}, LN6/f;->c(Landroid/bluetooth/le/ScanResult;)LN6/o;

    move-result-object v0

    iget-object v1, p0, LM6/r$a;->a:LM6/r;

    iget-object v1, v1, LM6/r;->e:LN6/e;

    invoke-virtual {v1, v0}, LN6/e;->b(LN6/o;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LM6/r$a;->a:LM6/r;

    invoke-static {v1}, LM6/r;->j(LM6/r;)Lgg/t;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onScanFailed(I)V
    .locals 2

    iget-object v0, p0, LM6/r$a;->a:LM6/r;

    invoke-static {v0}, LM6/r;->j(LM6/r;)Lgg/t;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/polidea/rxandroidble3/exceptions/BleScanException;

    invoke-static {p1}, LM6/r;->n(I)I

    move-result p1

    invoke-direct {v1, p1}, Lcom/polidea/rxandroidble3/exceptions/BleScanException;-><init>(I)V

    invoke-interface {v0, v1}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 4

    iget-object v0, p0, LM6/r$a;->a:LM6/r;

    iget-object v0, v0, LM6/r;->e:LN6/e;

    invoke-virtual {v0}, LN6/e;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x3

    invoke-static {v0}, LI6/q;->l(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LI6/q;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LL6/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LL6/b;->a([B)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v2, v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s, name=%s, rssi=%d, data=%s"

    invoke-static {v1, v0}, LI6/q;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, LM6/r$a;->a:LM6/r;

    iget-object v0, v0, LM6/r;->b:LN6/f;

    invoke-virtual {v0, p1, p2}, LN6/f;->a(ILandroid/bluetooth/le/ScanResult;)LN6/o;

    move-result-object p1

    iget-object p2, p0, LM6/r$a;->a:LM6/r;

    iget-object p2, p2, LM6/r;->e:LN6/e;

    invoke-virtual {p2, p1}, LN6/e;->b(LN6/o;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, LM6/r$a;->a:LM6/r;

    invoke-static {p2}, LM6/r;->j(LM6/r;)Lgg/t;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-interface {p2, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
