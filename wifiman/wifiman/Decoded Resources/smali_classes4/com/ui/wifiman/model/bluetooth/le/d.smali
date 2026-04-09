.class public final Lcom/ui/wifiman/model/bluetooth/le/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/bluetooth/le/d$a;,
        Lcom/ui/wifiman/model/bluetooth/le/d$b;,
        Lcom/ui/wifiman/model/bluetooth/le/d$c;
    }
.end annotation


# static fields
.field public static final f:Lcom/ui/wifiman/model/bluetooth/le/d$b;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/bluetooth/BluetoothManager;

.field private final c:LP7/a;

.field private final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final e:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/bluetooth/le/d$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/d;->f:Lcom/ui/wifiman/model/bluetooth/le/d$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothManager;LP7/a;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->b:Landroid/bluetooth/BluetoothManager;

    iput-object p3, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->c:LP7/a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lyc/a;

    invoke-direct {p1, p0}, Lyc/a;-><init>(Lcom/ui/wifiman/model/bluetooth/le/d;)V

    invoke-static {p1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->e:Lgg/b;

    return-void
.end method

.method private static final B(Lcom/ui/wifiman/model/bluetooth/le/d;)V
    .locals 1

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->c:LP7/a;

    new-instance v0, LP7/c$b;

    invoke-direct {v0}, LP7/c$b;-><init>()V

    invoke-interface {p0, v0}, LP7/a;->b(LP7/c;)V

    return-void
.end method

.method public static synthetic b(Lcom/ui/wifiman/model/bluetooth/le/d;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/d;->u(Lcom/ui/wifiman/model/bluetooth/le/d;)V

    return-void
.end method

.method public static synthetic c(Landroid/bluetooth/BluetoothDevice;Lcom/ui/wifiman/model/bluetooth/le/d;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/bluetooth/le/d;->w(Landroid/bluetooth/BluetoothDevice;Lcom/ui/wifiman/model/bluetooth/le/d;Lgg/t;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/internal/N;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/d;->x(Lkotlin/jvm/internal/N;)V

    return-void
.end method

.method public static synthetic e(Lcom/ui/wifiman/model/bluetooth/le/d;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/d;->B(Lcom/ui/wifiman/model/bluetooth/le/d;)V

    return-void
.end method

.method public static synthetic f(Lcom/ui/wifiman/model/bluetooth/le/d;Lgg/c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/d;->t(Lcom/ui/wifiman/model/bluetooth/le/d;Lgg/c;)V

    return-void
.end method

.method public static synthetic g(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/d;->z(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic h(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/d;->y(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/bluetooth/le/d;Landroid/bluetooth/BluetoothGatt;)Ljava/util/Queue;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/d;->o(Landroid/bluetooth/BluetoothGatt;)Ljava/util/Queue;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/bluetooth/le/d;Lgg/s;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/d;->q(Lgg/s;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/bluetooth/le/d;->r(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V

    return-void
.end method

.method public static final synthetic l(Lcom/ui/wifiman/model/bluetooth/le/d;)LP7/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->c:LP7/a;

    return-object p0
.end method

.method public static final synthetic m(Lcom/ui/wifiman/model/bluetooth/le/d;)Landroid/bluetooth/BluetoothManager;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->b:Landroid/bluetooth/BluetoothManager;

    return-object p0
.end method

.method public static final synthetic n(Lcom/ui/wifiman/model/bluetooth/le/d;Landroid/bluetooth/BluetoothDevice;)Lgg/s;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/d;->v(Landroid/bluetooth/BluetoothDevice;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method private final o(Landroid/bluetooth/BluetoothGatt;)Ljava/util/Queue;
    .locals 8

    invoke-static {}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->getEntries()Lfh/a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/ui/wifiman/model/bluetooth/le/i$a;

    sget-object v4, Lcom/ui/wifiman/model/bluetooth/le/i;->a:Lcom/ui/wifiman/model/bluetooth/le/i;

    invoke-virtual {v4, v3}, Lcom/ui/wifiman/model/bluetooth/le/i;->b(Lcom/ui/wifiman/model/bluetooth/le/i$a;)Ljava/util/UUID;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p1

    const-string v1, "getServices(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothGattService;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristics()Ljava/util/List;

    move-result-object v1

    const-string v3, "getCharacteristics(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v3}, Lcom/ui/wifiman/model/bluetooth/le/d;->s(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->c:LP7/a;

    new-instance v5, LP7/c$d;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "toString(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v6}, LP7/c$d;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v5}, LP7/a;->b(LP7/c;)V

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/bluetooth/le/i$a;

    if-eqz v4, :cond_2

    new-instance v5, Lcom/ui/wifiman/model/bluetooth/le/d$a;

    invoke-direct {v5, v4, v3}, Lcom/ui/wifiman/model/bluetooth/le/d$a;-><init>(Lcom/ui/wifiman/model/bluetooth/le/i$a;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-virtual {v0, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method private final p(Landroid/bluetooth/BluetoothGattCharacteristic;I)Z
    .locals 0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final q(Lgg/s;)Lgg/i;
    .locals 7

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/N;

    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/N;

    invoke-direct {v4}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v6, Lcom/ui/wifiman/model/bluetooth/le/d$d;

    move-object v0, v6

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Lcom/ui/wifiman/model/bluetooth/le/d$d;-><init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lcom/ui/wifiman/model/bluetooth/le/d;Lkotlin/jvm/internal/N;Ljava/util/Set;)V

    invoke-virtual {p1, v6}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    sget-object v0, Lgg/a;->LATEST:Lgg/a;

    invoke-virtual {p1, v0}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object p1

    const-string v0, "toFlowable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final r(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V
    .locals 4

    iget-object v0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v0, :cond_4

    iget-object v0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const-string p1, "Requesting service discovery"

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p0, Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "failed to start service discovery"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz p1, :cond_2

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/d$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/bluetooth/le/d$a;->b()Lcom/ui/wifiman/model/bluetooth/le/i$a;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Requesting characteristics fetch "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p0, Landroid/bluetooth/BluetoothGatt;

    iget-object p1, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/d$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/bluetooth/le/d$a;->a()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/bluetooth/BluetoothGatt;->readCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p0, Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    goto :goto_0

    :cond_3
    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p0, Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    :goto_0
    return-void

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "ble gat not initialized"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final s(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lcom/ui/wifiman/model/bluetooth/le/d;->p(Landroid/bluetooth/BluetoothGattCharacteristic;I)Z

    move-result p1

    return p1
.end method

.method private static final t(Lcom/ui/wifiman/model/bluetooth/le/d;Lgg/c;)V
    .locals 3

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$SimultaneousConnection;

    invoke-direct {v1}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$SimultaneousConnection;-><init>()V

    invoke-interface {p1, v1}, Lgg/c;->c(Ljava/lang/Throwable;)Z

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    new-instance v0, Lyc/f;

    invoke-direct {v0, p0}, Lyc/f;-><init>(Lcom/ui/wifiman/model/bluetooth/le/d;)V

    invoke-interface {p1, v0}, Lgg/c;->d(Lkg/e;)V

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method private static final u(Lcom/ui/wifiman/model/bluetooth/le/d;)V
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter v0

    :try_start_0
    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object p0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private final v(Landroid/bluetooth/BluetoothDevice;)Lgg/s;
    .locals 2

    new-instance v0, Lyc/c;

    invoke-direct {v0, p1, p0}, Lyc/c;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/ui/wifiman/model/bluetooth/le/d;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/le/d$f;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/bluetooth/le/d$f;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, v1}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/le/d$g;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/bluetooth/le/d$g;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, v1}, Lgg/s;->D(Lkg/f;)Lgg/s;

    move-result-object v0

    new-instance v1, Lyc/d;

    invoke-direct {v1, p1}, Lyc/d;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, v1}, Lgg/s;->z(Lkg/a;)Lgg/s;

    move-result-object v0

    new-instance v1, Lyc/e;

    invoke-direct {v1, p1}, Lyc/e;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, v1}, Lgg/s;->A(Lkg/a;)Lgg/s;

    move-result-object p1

    const-string v0, "doOnDispose(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final w(Landroid/bluetooth/BluetoothDevice;Lcom/ui/wifiman/model/bluetooth/le/d;Lgg/t;)V
    .locals 4

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/le/d$e;

    invoke-direct {v1, p0, v0, p2}, Lcom/ui/wifiman/model/bluetooth/le/d$e;-><init>(Landroid/bluetooth/BluetoothDevice;Lkotlin/jvm/internal/N;Lgg/t;)V

    new-instance v2, Lyc/g;

    invoke-direct {v2, v0}, Lyc/g;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-interface {p2, v2}, Lgg/t;->d(Lkg/e;)V

    iget-object p1, p1, Lcom/ui/wifiman/model/bluetooth/le/d;->a:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {p0, p1, v2, v1, v3}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;I)Landroid/bluetooth/BluetoothGatt;

    move-result-object p0

    iput-object p0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz p0, :cond_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->connect()Z

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$AndroidRefusedToConnect;

    invoke-direct {p0}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$AndroidRefusedToConnect;-><init>()V

    invoke-interface {p2, p0}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method private static final x(Lkotlin/jvm/internal/N;)V
    .locals 0

    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Landroid/bluetooth/BluetoothGatt;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->close()V

    :cond_0
    return-void
.end method

.method private static final y(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Gatt stream for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " completed"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final z(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Gatt stream for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " disposed"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A(Landroid/bluetooth/BluetoothGattCharacteristic;Lcom/ui/wifiman/model/bluetooth/le/i$a;)Ljava/lang/Object;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "char"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->getDataFormat()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x34

    if-eq v2, v3, :cond_b

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x32

    if-ne v2, v3, :cond_2

    goto :goto_9

    :cond_2
    :goto_1
    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_a

    :goto_2
    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x24

    if-eq v2, v3, :cond_a

    :goto_3
    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x21

    if-eq v2, v3, :cond_a

    :goto_4
    if-nez v0, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x12

    if-eq v2, v3, :cond_a

    :goto_5
    if-nez v0, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x14

    if-eq v2, v3, :cond_a

    :goto_6
    if-nez v0, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x11

    if-ne v0, v2, :cond_9

    goto :goto_8

    :cond_9
    :goto_7
    invoke-virtual {p1, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getStringValue(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_a

    :cond_a
    :goto_8
    invoke-virtual {p2}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->getDataFormat()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getIntValue(II)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_a

    :cond_b
    :goto_9
    invoke-virtual {p2}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->getDataFormat()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getFloatValue(II)Ljava/lang/Float;

    move-result-object p1

    :goto_a
    return-object p1
.end method

.method public a(Lh9/a;)Lgg/i;
    .locals 3

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d;->e:Lgg/b;

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/le/d$h;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/d$h;-><init>(Lcom/ui/wifiman/model/bluetooth/le/d;Lh9/a;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/d$i;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/bluetooth/le/d$i;-><init>(Lcom/ui/wifiman/model/bluetooth/le/d;)V

    invoke-virtual {p1, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-wide/16 v0, 0x1388

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->Z1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/d$j;->a:Lcom/ui/wifiman/model/bluetooth/le/d$j;

    invoke-virtual {p1, v0}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/d$k;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/bluetooth/le/d$k;-><init>(Lcom/ui/wifiman/model/bluetooth/le/d;)V

    invoke-virtual {p1, v0}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v0, Lyc/b;

    invoke-direct {v0, p0}, Lyc/b;-><init>(Lcom/ui/wifiman/model/bluetooth/le/d;)V

    invoke-virtual {p1, v0}, Lgg/i;->a0(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
