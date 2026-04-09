.class public LM6/g;
.super LI6/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM6/g$b;
    }
.end annotation


# instance fields
.field private final a:LK6/l0;

.field private final b:LK6/a;

.field private final c:Ljava/lang/String;

.field private final d:Landroid/bluetooth/BluetoothManager;

.field private final e:Lgg/y;

.field private final f:LM6/x;

.field private final g:LK6/m;


# direct methods
.method constructor <init>(LK6/l0;LK6/a;Ljava/lang/String;Landroid/bluetooth/BluetoothManager;Lgg/y;LM6/x;LK6/m;)V
    .locals 0

    invoke-direct {p0}, LI6/j;-><init>()V

    iput-object p1, p0, LM6/g;->a:LK6/l0;

    iput-object p2, p0, LM6/g;->b:LK6/a;

    iput-object p3, p0, LM6/g;->c:Ljava/lang/String;

    iput-object p4, p0, LM6/g;->d:Landroid/bluetooth/BluetoothManager;

    iput-object p5, p0, LM6/g;->e:Lgg/y;

    iput-object p6, p0, LM6/g;->f:LM6/x;

    iput-object p7, p0, LM6/g;->g:LK6/m;

    return-void
.end method

.method private g(Landroid/bluetooth/BluetoothGatt;)Lgg/z;
    .locals 6

    new-instance v0, LM6/g$b;

    iget-object v1, p0, LM6/g;->a:LK6/l0;

    iget-object v2, p0, LM6/g;->e:Lgg/y;

    invoke-direct {v0, p1, v1, v2}, LM6/g$b;-><init>(Landroid/bluetooth/BluetoothGatt;LK6/l0;Lgg/y;)V

    iget-object v1, p0, LM6/g;->f:LM6/x;

    iget-wide v2, v1, LM6/x;->a:J

    iget-object v4, v1, LM6/x;->b:Ljava/util/concurrent/TimeUnit;

    iget-object v5, v1, LM6/x;->c:Lgg/y;

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    move-wide v1, v2

    move-object v3, v4

    move-object v4, v5

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lgg/z;->R(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method private h(Landroid/bluetooth/BluetoothGatt;)Lgg/z;
    .locals 1

    invoke-direct {p0, p1}, LM6/g;->j(Landroid/bluetooth/BluetoothGatt;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, LM6/g;->g(Landroid/bluetooth/BluetoothGatt;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private j(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 2

    iget-object v0, p0, LM6/g;->d:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const/4 v1, 0x7

    invoke-virtual {v0, p1, v1}, Landroid/bluetooth/BluetoothManager;->getConnectionState(Landroid/bluetooth/BluetoothDevice;I)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method protected b(Lgg/t;LO6/i;)V
    .locals 2

    iget-object v0, p0, LM6/g;->g:LK6/m;

    sget-object v1, LG6/N$b;->DISCONNECTING:LG6/N$b;

    invoke-interface {v0, v1}, LK6/m;->a(LG6/N$b;)V

    iget-object v0, p0, LM6/g;->b:LK6/a;

    invoke-virtual {v0}, LK6/a;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Disconnect operation has been executed but GATT instance was null - considering disconnected."

    invoke-static {v1, v0}, LI6/q;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, LM6/g;->d(Lgg/h;LO6/i;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, v0}, LM6/g;->h(Landroid/bluetooth/BluetoothGatt;)Lgg/z;

    move-result-object v0

    iget-object v1, p0, LM6/g;->e:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object v0

    new-instance v1, LM6/g$a;

    invoke-direct {v1, p0, p1, p2}, LM6/g$a;-><init>(LM6/g;Lgg/t;LO6/i;)V

    invoke-virtual {v0, v1}, Lgg/z;->a(Lgg/B;)V

    :goto_0
    return-void
.end method

.method protected c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble3/exceptions/BleException;
    .locals 3

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;

    iget-object v1, p0, LM6/g;->c:Ljava/lang/String;

    const/4 v2, -0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;I)V

    return-object v0
.end method

.method d(Lgg/h;LO6/i;)V
    .locals 2

    iget-object v0, p0, LM6/g;->g:LK6/m;

    sget-object v1, LG6/N$b;->DISCONNECTED:LG6/N$b;

    invoke-interface {v0, v1}, LK6/m;->a(LG6/N$b;)V

    invoke-interface {p2}, LO6/i;->release()V

    invoke-interface {p1}, Lgg/h;->a()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DisconnectOperation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM6/g;->c:Ljava/lang/String;

    invoke-static {v1}, LL6/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
