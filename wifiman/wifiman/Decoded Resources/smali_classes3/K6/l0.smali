.class public LK6/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK6/l0$c;
    }
.end annotation


# instance fields
.field private final a:Lgg/y;

.field final b:LK6/a;

.field final c:LK6/A;

.field final d:LK6/T;

.field final e:LJ5/c;

.field final f:LK6/l0$c;

.field final g:LK6/l0$c;

.field final h:LK6/l0$c;

.field final i:LJ5/d;

.field final j:LK6/l0$c;

.field final k:LK6/l0$c;

.field final l:LK6/l0$c;

.field final m:LK6/l0$c;

.field final n:LK6/l0$c;

.field final o:LK6/l0$c;

.field final p:LK6/l0$c;

.field private final q:Lkg/n;

.field private final r:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method public constructor <init>(Lgg/y;LK6/a;LK6/A;LK6/T;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LJ5/c;->l1()LJ5/c;

    move-result-object v0

    iput-object v0, p0, LK6/l0;->e:LJ5/c;

    new-instance v0, LK6/l0$c;

    invoke-direct {v0}, LK6/l0$c;-><init>()V

    iput-object v0, p0, LK6/l0;->f:LK6/l0$c;

    new-instance v0, LK6/l0$c;

    invoke-direct {v0}, LK6/l0$c;-><init>()V

    iput-object v0, p0, LK6/l0;->g:LK6/l0$c;

    new-instance v0, LK6/l0$c;

    invoke-direct {v0}, LK6/l0$c;-><init>()V

    iput-object v0, p0, LK6/l0;->h:LK6/l0$c;

    invoke-static {}, LJ5/c;->l1()LJ5/c;

    move-result-object v0

    invoke-virtual {v0}, LJ5/d;->j1()LJ5/d;

    move-result-object v0

    iput-object v0, p0, LK6/l0;->i:LJ5/d;

    new-instance v0, LK6/l0$c;

    invoke-direct {v0}, LK6/l0$c;-><init>()V

    iput-object v0, p0, LK6/l0;->j:LK6/l0$c;

    new-instance v0, LK6/l0$c;

    invoke-direct {v0}, LK6/l0$c;-><init>()V

    iput-object v0, p0, LK6/l0;->k:LK6/l0$c;

    new-instance v0, LK6/l0$c;

    invoke-direct {v0}, LK6/l0$c;-><init>()V

    iput-object v0, p0, LK6/l0;->l:LK6/l0$c;

    new-instance v0, LK6/l0$c;

    invoke-direct {v0}, LK6/l0$c;-><init>()V

    iput-object v0, p0, LK6/l0;->m:LK6/l0$c;

    new-instance v0, LK6/l0$c;

    invoke-direct {v0}, LK6/l0$c;-><init>()V

    iput-object v0, p0, LK6/l0;->n:LK6/l0$c;

    new-instance v0, LK6/l0$c;

    invoke-direct {v0}, LK6/l0$c;-><init>()V

    iput-object v0, p0, LK6/l0;->o:LK6/l0$c;

    new-instance v0, LK6/l0$c;

    invoke-direct {v0}, LK6/l0$c;-><init>()V

    iput-object v0, p0, LK6/l0;->p:LK6/l0$c;

    new-instance v0, LK6/l0$a;

    invoke-direct {v0, p0}, LK6/l0$a;-><init>(LK6/l0;)V

    iput-object v0, p0, LK6/l0;->q:Lkg/n;

    new-instance v0, LK6/l0$b;

    invoke-direct {v0, p0}, LK6/l0$b;-><init>(LK6/l0;)V

    iput-object v0, p0, LK6/l0;->r:Landroid/bluetooth/BluetoothGattCallback;

    iput-object p1, p0, LK6/l0;->a:Lgg/y;

    iput-object p2, p0, LK6/l0;->b:LK6/a;

    iput-object p3, p0, LK6/l0;->c:LK6/A;

    iput-object p4, p0, LK6/l0;->d:LK6/T;

    return-void
.end method

.method private static i(I)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static j(I)LG6/N$b;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    sget-object p0, LG6/N$b;->DISCONNECTED:LG6/N$b;

    return-object p0

    :cond_0
    sget-object p0, LG6/N$b;->DISCONNECTING:LG6/N$b;

    return-object p0

    :cond_1
    sget-object p0, LG6/N$b;->CONNECTED:LG6/N$b;

    return-object p0

    :cond_2
    sget-object p0, LG6/N$b;->CONNECTING:LG6/N$b;

    return-object p0
.end method

.method static l(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;ILH6/a;)Z
    .locals 1

    invoke-static {p2}, LK6/l0;->i(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleGattException;

    invoke-direct {v0, p1, p2, p3}, Lcom/polidea/rxandroidble3/exceptions/BleGattException;-><init>(Landroid/bluetooth/BluetoothGatt;ILH6/a;)V

    invoke-static {p0, v0}, LK6/l0;->o(LK6/l0$c;Lcom/polidea/rxandroidble3/exceptions/BleGattException;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static m(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILH6/a;)Z
    .locals 1

    invoke-static {p3}, LK6/l0;->i(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleGattCharacteristicException;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/polidea/rxandroidble3/exceptions/BleGattCharacteristicException;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILH6/a;)V

    invoke-static {p0, v0}, LK6/l0;->o(LK6/l0$c;Lcom/polidea/rxandroidble3/exceptions/BleGattException;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static n(LK6/l0$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILH6/a;)Z
    .locals 1

    invoke-static {p3}, LK6/l0;->i(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleGattDescriptorException;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/polidea/rxandroidble3/exceptions/BleGattDescriptorException;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILH6/a;)V

    invoke-static {p0, v0}, LK6/l0;->o(LK6/l0$c;Lcom/polidea/rxandroidble3/exceptions/BleGattException;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static o(LK6/l0$c;Lcom/polidea/rxandroidble3/exceptions/BleGattException;)Z
    .locals 0

    iget-object p0, p0, LK6/l0$c;->b:LJ5/c;

    invoke-virtual {p0, p1}, LJ5/c;->accept(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method private p(LK6/l0$c;)Lgg/s;
    .locals 3

    iget-object v0, p0, LK6/l0;->c:LK6/A;

    invoke-virtual {v0}, LK6/A;->b()Lgg/s;

    move-result-object v0

    iget-object v1, p1, LK6/l0$c;->a:LJ5/c;

    iget-object p1, p1, LK6/l0$c;->b:LJ5/c;

    iget-object v2, p0, LK6/l0;->q:Lkg/n;

    invoke-virtual {p1, v2}, Lgg/s;->Q(Lkg/n;)Lgg/s;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lgg/s;->k0(Lgg/v;Lgg/v;Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    iget-object v0, p0, LK6/l0;->r:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method public b()Lgg/s;
    .locals 5

    iget-object v0, p0, LK6/l0;->c:LK6/A;

    invoke-virtual {v0}, LK6/A;->b()Lgg/s;

    move-result-object v0

    iget-object v1, p0, LK6/l0;->i:LJ5/d;

    invoke-static {v0, v1}, Lgg/s;->j0(Lgg/v;Lgg/v;)Lgg/s;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, LK6/l0;->a:Lgg/y;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lgg/s;->s(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public c()Lgg/s;
    .locals 5

    iget-object v0, p0, LK6/l0;->h:LK6/l0$c;

    invoke-direct {p0, v0}, LK6/l0;->p(LK6/l0$c;)Lgg/s;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, LK6/l0;->a:Lgg/y;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lgg/s;->s(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public d()Lgg/s;
    .locals 5

    iget-object v0, p0, LK6/l0;->e:LJ5/c;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, LK6/l0;->a:Lgg/y;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lgg/s;->s(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public e()Lgg/s;
    .locals 5

    iget-object v0, p0, LK6/l0;->k:LK6/l0$c;

    invoke-direct {p0, v0}, LK6/l0;->p(LK6/l0$c;)Lgg/s;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, LK6/l0;->a:Lgg/y;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lgg/s;->s(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public f()Lgg/s;
    .locals 5

    iget-object v0, p0, LK6/l0;->m:LK6/l0$c;

    invoke-direct {p0, v0}, LK6/l0;->p(LK6/l0$c;)Lgg/s;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, LK6/l0;->a:Lgg/y;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lgg/s;->s(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public g()Lgg/s;
    .locals 5

    iget-object v0, p0, LK6/l0;->l:LK6/l0$c;

    invoke-direct {p0, v0}, LK6/l0;->p(LK6/l0$c;)Lgg/s;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, LK6/l0;->a:Lgg/y;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lgg/s;->s(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public h()Lgg/s;
    .locals 5

    iget-object v0, p0, LK6/l0;->f:LK6/l0$c;

    invoke-direct {p0, v0}, LK6/l0;->p(LK6/l0$c;)Lgg/s;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, LK6/l0;->a:Lgg/y;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lgg/s;->s(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public k()Lgg/s;
    .locals 1

    iget-object v0, p0, LK6/l0;->c:LK6/A;

    invoke-virtual {v0}, LK6/A;->b()Lgg/s;

    move-result-object v0

    return-object v0
.end method
