.class public LM6/q;
.super LM6/p;
.source "SourceFile"


# instance fields
.field final b:LN6/f;

.field final c:LN6/e;


# direct methods
.method public constructor <init>(LP6/G;LN6/f;LN6/e;)V
    .locals 0

    invoke-direct {p0, p1}, LM6/p;-><init>(LP6/G;)V

    iput-object p2, p0, LM6/q;->b:LN6/f;

    iput-object p3, p0, LM6/q;->c:LN6/e;

    return-void
.end method


# virtual methods
.method bridge synthetic d(Lgg/t;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM6/q;->j(Lgg/t;)Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    move-result-object p1

    return-object p1
.end method

.method bridge synthetic g(LP6/G;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {p0, p1, p2}, LM6/q;->l(LP6/G;Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z

    move-result p1

    return p1
.end method

.method bridge synthetic h(LP6/G;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {p0, p1, p2}, LM6/q;->n(LP6/G;Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V

    return-void
.end method

.method j(Lgg/t;)Landroid/bluetooth/BluetoothAdapter$LeScanCallback;
    .locals 1

    new-instance v0, LM6/q$a;

    invoke-direct {v0, p0, p1}, LM6/q$a;-><init>(LM6/q;Lgg/t;)V

    return-object v0
.end method

.method l(LP6/G;Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z
    .locals 2

    iget-object v0, p0, LM6/q;->c:LN6/e;

    invoke-virtual {v0}, LN6/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string/jumbo v1, "No library side filtering \u2014> debug logs of scanned devices disabled"

    invoke-static {v1, v0}, LI6/q;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p1, p2}, LP6/G;->e(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z

    move-result p1

    return p1
.end method

.method n(LP6/G;Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V
    .locals 0

    invoke-virtual {p1, p2}, LP6/G;->g(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "ScanOperationApi18{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM6/q;->c:LN6/e;

    invoke-virtual {v1}, LN6/e;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ANY_MUST_MATCH -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LM6/q;->c:LN6/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
