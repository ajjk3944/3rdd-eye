.class LI6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG6/O;


# instance fields
.field final a:Landroid/bluetooth/BluetoothDevice;

.field final b:LK6/o;

.field private final c:LJ5/b;

.field private final d:LP6/j;

.field final e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>(Landroid/bluetooth/BluetoothDevice;LK6/o;LJ5/b;LP6/j;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, LI6/m;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, LI6/m;->a:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, LI6/m;->b:LK6/o;

    iput-object p3, p0, LI6/m;->c:LJ5/b;

    iput-object p4, p0, LI6/m;->d:LP6/j;

    return-void
.end method

.method public static synthetic c(LI6/m;)V
    .locals 0

    invoke-direct {p0}, LI6/m;->g()V

    return-void
.end method

.method public static synthetic d(LI6/m;LG6/z;)Lgg/v;
    .locals 0

    invoke-direct {p0, p1}, LI6/m;->h(LG6/z;)Lgg/v;

    move-result-object p0

    return-object p0
.end method

.method private f(Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, LI6/m;->d:LP6/j;

    invoke-virtual {p1}, LP6/j;->a()Z

    move-result p1

    if-nez p1, :cond_0

    const-string/jumbo p1, "[NO BLUETOOTH_CONNECT PERMISSION]"

    return-object p1

    :cond_0
    iget-object p1, p0, LI6/m;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic g()V
    .locals 2

    iget-object v0, p0, LI6/m;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method private synthetic h(LG6/z;)Lgg/v;
    .locals 3

    iget-object v0, p0, LI6/m;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI6/m;->b:LK6/o;

    invoke-interface {v0, p1}, LK6/o;->a(LG6/z;)Lgg/s;

    move-result-object p1

    new-instance v0, LI6/l;

    invoke-direct {v0, p0}, LI6/l;-><init>(LI6/m;)V

    invoke-virtual {p1, v0}, Lgg/s;->y(Lkg/a;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/polidea/rxandroidble3/exceptions/BleAlreadyConnectedException;

    iget-object v0, p0, LI6/m;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/polidea/rxandroidble3/exceptions/BleAlreadyConnectedException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/s;->L(Ljava/lang/Throwable;)Lgg/s;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Z)Lgg/s;
    .locals 1

    new-instance v0, LG6/z$a;

    invoke-direct {v0}, LG6/z$a;-><init>()V

    invoke-virtual {v0, p1}, LG6/z$a;->b(Z)LG6/z$a;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LG6/z$a;->c(Z)LG6/z$a;

    move-result-object p1

    invoke-virtual {p1}, LG6/z$a;->a()LG6/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LI6/m;->e(LG6/z;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI6/m;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(LG6/z;)Lgg/s;
    .locals 1

    new-instance v0, LI6/k;

    invoke-direct {v0, p0, p1}, LI6/k;-><init>(LI6/m;LG6/z;)V

    invoke-static {v0}, Lgg/s;->r(Lkg/q;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LI6/m;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LI6/m;

    iget-object v0, p0, LI6/m;->a:Landroid/bluetooth/BluetoothDevice;

    iget-object p1, p1, LI6/m;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothDevice;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LI6/m;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "RxBleDeviceImpl{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI6/m;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LL6/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, LI6/m;->f(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
