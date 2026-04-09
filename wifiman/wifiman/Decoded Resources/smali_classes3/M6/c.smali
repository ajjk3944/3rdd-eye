.class public LM6/c;
.super LI6/j;
.source "SourceFile"


# instance fields
.field final a:Landroid/bluetooth/BluetoothDevice;

.field final b:LP6/b;

.field final c:LK6/l0;

.field final d:LK6/a;

.field final e:LM6/x;

.field final f:Z

.field final g:LK6/m;


# direct methods
.method constructor <init>(Landroid/bluetooth/BluetoothDevice;LP6/b;LK6/l0;LK6/a;LM6/x;ZLK6/m;)V
    .locals 0

    invoke-direct {p0}, LI6/j;-><init>()V

    iput-object p1, p0, LM6/c;->a:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, LM6/c;->b:LP6/b;

    iput-object p3, p0, LM6/c;->c:LK6/l0;

    iput-object p4, p0, LM6/c;->d:LK6/a;

    iput-object p5, p0, LM6/c;->e:LM6/x;

    iput-boolean p6, p0, LM6/c;->f:Z

    iput-object p7, p0, LM6/c;->g:LK6/m;

    return-void
.end method

.method private g()Lgg/z;
    .locals 1

    new-instance v0, LM6/c$d;

    invoke-direct {v0, p0}, LM6/c$d;-><init>(LM6/c;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method private j()Lgg/E;
    .locals 1

    new-instance v0, LM6/c$b;

    invoke-direct {v0, p0}, LM6/c$b;-><init>(LM6/c;)V

    return-object v0
.end method


# virtual methods
.method protected b(Lgg/t;LO6/i;)V
    .locals 3

    new-instance v0, LM6/c$a;

    invoke-direct {v0, p0, p2}, LM6/c$a;-><init>(LM6/c;LO6/i;)V

    invoke-direct {p0}, LM6/c;->g()Lgg/z;

    move-result-object v1

    invoke-direct {p0}, LM6/c;->j()Lgg/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/z;->h(Lgg/E;)Lgg/z;

    move-result-object v1

    invoke-virtual {v1, v0}, Lgg/z;->l(Lkg/a;)Lgg/z;

    move-result-object v0

    invoke-static {p1}, LP6/u;->b(Lgg/t;)LCg/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->P(Lgg/B;)Lgg/B;

    move-result-object v0

    check-cast v0, LCg/b;

    invoke-interface {p1, v0}, Lgg/t;->g(Lhg/c;)V

    iget-boolean p1, p0, LM6/c;->f:Z

    if-eqz p1, :cond_0

    invoke-interface {p2}, LO6/i;->release()V

    :cond_0
    return-void
.end method

.method protected c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble3/exceptions/BleException;
    .locals 3

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;

    iget-object v1, p0, LM6/c;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;I)V

    return-object v0
.end method

.method d()Lgg/z;
    .locals 1

    new-instance v0, LM6/c$e;

    invoke-direct {v0, p0}, LM6/c$e;-><init>(LM6/c;)V

    invoke-static {v0}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method h()Lgg/z;
    .locals 1

    new-instance v0, LM6/c$c;

    invoke-direct {v0, p0}, LM6/c$c;-><init>(LM6/c;)V

    invoke-static {v0}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectOperation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM6/c;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LL6/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", autoConnect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LM6/c;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
