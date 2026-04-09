.class LK6/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final h:Ljava/util/UUID;


# instance fields
.field final a:[B

.field final b:[B

.field final c:[B

.field final d:Landroid/bluetooth/BluetoothGatt;

.field final e:LK6/l0;

.field final f:LK6/w;

.field final g:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, LK6/g0;->h:Ljava/util/UUID;

    return-void
.end method

.method constructor <init>([B[B[BLandroid/bluetooth/BluetoothGatt;LK6/l0;LK6/w;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LK6/g0;->g:Ljava/util/Map;

    iput-object p1, p0, LK6/g0;->a:[B

    iput-object p2, p0, LK6/g0;->b:[B

    iput-object p3, p0, LK6/g0;->c:[B

    iput-object p4, p0, LK6/g0;->d:Landroid/bluetooth/BluetoothGatt;

    iput-object p5, p0, LK6/g0;->e:LK6/l0;

    iput-object p6, p0, LK6/g0;->f:LK6/w;

    return-void
.end method

.method public static synthetic a(LG6/C;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[BLgg/b;)Lgg/f;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LK6/g0;->s(LG6/C;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[BLgg/b;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LHg/b;Lgg/s;)Lgg/s;
    .locals 0

    invoke-static {p0, p1}, LK6/g0;->p(LHg/b;Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LK6/g0;Landroid/bluetooth/BluetoothGattCharacteristic;ZLG6/C;)Lgg/v;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LK6/g0;->r(Landroid/bluetooth/BluetoothGattCharacteristic;ZLG6/C;)Lgg/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LK6/g0;LHg/b;LP6/h;Landroid/bluetooth/BluetoothGattCharacteristic;LG6/C;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LK6/g0;->q(LHg/b;LP6/h;Landroid/bluetooth/BluetoothGattCharacteristic;LG6/C;)V

    return-void
.end method

.method public static synthetic e(LG6/C;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[BLgg/s;)Lgg/v;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LK6/g0;->o(LG6/C;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[BLgg/s;)Lgg/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/bluetooth/BluetoothGattCharacteristic;Ljava/lang/Throwable;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LK6/g0;->t(Landroid/bluetooth/BluetoothGattCharacteristic;Ljava/lang/Throwable;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LP6/h;LP6/g;)Z
    .locals 0

    invoke-static {p0, p1}, LK6/g0;->k(LP6/h;LP6/g;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, LK6/g0;->m(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    return-void
.end method

.method public static synthetic i(LP6/g;)[B
    .locals 0

    invoke-static {p0}, LK6/g0;->l(LP6/g;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lgg/b;Lgg/s;)Lgg/s;
    .locals 0

    invoke-static {p0, p1}, LK6/g0;->n(Lgg/b;Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic k(LP6/h;LP6/g;)Z
    .locals 0

    invoke-virtual {p1, p0}, LP6/g;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static synthetic l(LP6/g;)[B
    .locals 0

    iget-object p0, p0, LP6/g;->a:[B

    return-object p0
.end method

.method private static synthetic m(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;ILjava/lang/Throwable;)V

    throw p0
.end method

.method private static synthetic n(Lgg/b;Lgg/s;)Lgg/s;
    .locals 0

    invoke-virtual {p0}, Lgg/b;->M()Lgg/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lgg/s;->l0(Lgg/f;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic o(LG6/C;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[BLgg/s;)Lgg/v;
    .locals 1

    sget-object v0, LK6/g0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    invoke-static {p1, p2, p3}, LK6/g0;->z(Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[B)Lgg/b;

    move-result-object p0

    invoke-virtual {p0, p4}, Lgg/b;->j(Lgg/v;)Lgg/s;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1, p2, p3}, LK6/g0;->z(Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[B)Lgg/b;

    move-result-object p0

    invoke-virtual {p0}, Lgg/b;->f0()Lgg/s;

    move-result-object p0

    invoke-virtual {p0}, Lgg/s;->r0()LBg/a;

    move-result-object p0

    invoke-virtual {p0, v0}, LBg/a;->i1(I)Lgg/s;

    move-result-object p0

    invoke-virtual {p0}, Lgg/s;->f0()Lgg/b;

    move-result-object p0

    invoke-virtual {p4, p0}, Lgg/s;->l0(Lgg/f;)Lgg/s;

    move-result-object p1

    new-instance p2, LK6/f0;

    invoke-direct {p2, p0}, LK6/f0;-><init>(Lgg/b;)V

    invoke-virtual {p1, p2}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p4
.end method

.method private static synthetic p(LHg/b;Lgg/s;)Lgg/s;
    .locals 1

    const-class v0, [B

    invoke-virtual {p0, v0}, Lgg/s;->f(Ljava/lang/Class;)Lgg/s;

    move-result-object v0

    invoke-virtual {p1, p0}, Lgg/s;->T0(Lgg/v;)Lgg/s;

    move-result-object p0

    filled-new-array {v0, p0}, [Lgg/s;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lgg/s;->b(Ljava/lang/Iterable;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method private synthetic q(LHg/b;LP6/h;Landroid/bluetooth/BluetoothGattCharacteristic;LG6/C;)V
    .locals 1

    invoke-virtual {p1}, LHg/b;->a()V

    iget-object p1, p0, LK6/g0;->g:Ljava/util/Map;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, LK6/g0;->g:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LK6/g0;->d:Landroid/bluetooth/BluetoothGatt;

    const/4 p2, 0x0

    invoke-static {p1, p3, p2}, LK6/g0;->v(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)Lgg/b;

    move-result-object p1

    iget-object p2, p0, LK6/g0;->f:LK6/w;

    iget-object v0, p0, LK6/g0;->c:[B

    invoke-static {p2, p3, v0, p4}, LK6/g0;->y(LK6/w;Landroid/bluetooth/BluetoothGattCharacteristic;[BLG6/C;)Lgg/g;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->n(Lgg/g;)Lgg/b;

    move-result-object p1

    sget-object p2, Lmg/a;->c:Lkg/a;

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    return-void

    :catchall_0
    move-exception p2

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method private synthetic r(Landroid/bluetooth/BluetoothGattCharacteristic;ZLG6/C;)Lgg/v;
    .locals 11

    iget-object v0, p0, LK6/g0;->g:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    new-instance v7, LP6/h;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getInstanceId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v7, v1, v2}, LP6/h;-><init>(Ljava/util/UUID;Ljava/lang/Integer;)V

    iget-object v1, p0, LK6/g0;->g:Ljava/util/Map;

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP6/a;

    const/4 v8, 0x1

    if-eqz v1, :cond_1

    iget-boolean p3, v1, LP6/a;->b:Z

    if-ne p3, p2, :cond_0

    iget-object p1, v1, LP6/a;->a:Lgg/s;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p3, Lcom/polidea/rxandroidble3/exceptions/BleConflictingNotificationAlreadySetException;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p1

    xor-int/2addr p2, v8

    invoke-direct {p3, p1, p2}, Lcom/polidea/rxandroidble3/exceptions/BleConflictingNotificationAlreadySetException;-><init>(Ljava/util/UUID;Z)V

    invoke-static {p3}, Lgg/s;->L(Ljava/lang/Throwable;)Lgg/s;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_1
    if-eqz p2, :cond_2

    iget-object v1, p0, LK6/g0;->b:[B

    goto :goto_0

    :cond_2
    iget-object v1, p0, LK6/g0;->a:[B

    :goto_0
    invoke-static {}, LHg/b;->k1()LHg/b;

    move-result-object v3

    iget-object v2, p0, LK6/g0;->d:Landroid/bluetooth/BluetoothGatt;

    invoke-static {v2, p1, v8}, LK6/g0;->v(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)Lgg/b;

    move-result-object v2

    iget-object v4, p0, LK6/g0;->e:LK6/l0;

    invoke-static {v4, v7}, LK6/g0;->u(LK6/l0;LP6/h;)Lgg/s;

    move-result-object v4

    invoke-static {v4}, LP6/E;->b(Ljava/lang/Object;)Lgg/s;

    move-result-object v4

    invoke-virtual {v2, v4}, Lgg/b;->j(Lgg/v;)Lgg/s;

    move-result-object v2

    iget-object v4, p0, LK6/g0;->f:LK6/w;

    invoke-static {v4, p1, v1, p3}, LK6/g0;->w(LK6/w;Landroid/bluetooth/BluetoothGattCharacteristic;[BLG6/C;)Lgg/w;

    move-result-object v1

    invoke-virtual {v2, v1}, Lgg/s;->g(Lgg/w;)Lgg/s;

    move-result-object v1

    new-instance v2, LK6/X;

    invoke-direct {v2, v3}, LK6/X;-><init>(LHg/b;)V

    invoke-virtual {v1, v2}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object v9

    new-instance v10, LK6/Y;

    move-object v1, v10

    move-object v2, p0

    move-object v4, v7

    move-object v5, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, LK6/Y;-><init>(LK6/g0;LHg/b;LP6/h;Landroid/bluetooth/BluetoothGattCharacteristic;LG6/C;)V

    invoke-virtual {v9, v10}, Lgg/s;->y(Lkg/a;)Lgg/s;

    move-result-object p1

    iget-object p3, p0, LK6/g0;->e:LK6/l0;

    invoke-virtual {p3}, LK6/l0;->k()Lgg/s;

    move-result-object p3

    invoke-virtual {p1, p3}, Lgg/s;->m0(Lgg/v;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1, v8}, Lgg/s;->x0(I)LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    iget-object p3, p0, LK6/g0;->g:Ljava/util/Map;

    new-instance v1, LP6/a;

    invoke-direct {v1, p1, p2}, LP6/a;-><init>(Lgg/s;Z)V

    invoke-interface {p3, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static synthetic s(LG6/C;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[BLgg/b;)Lgg/f;
    .locals 1

    sget-object v0, LG6/C;->COMPAT:LG6/C;

    if-ne p0, v0, :cond_0

    return-object p4

    :cond_0
    invoke-static {p1, p2, p3}, LK6/g0;->z(Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[B)Lgg/b;

    move-result-object p0

    invoke-virtual {p4, p0}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic t(Landroid/bluetooth/BluetoothGattCharacteristic;Ljava/lang/Throwable;)Lgg/f;
    .locals 2

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1, p1}, Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;ILjava/lang/Throwable;)V

    invoke-static {v0}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method static u(LK6/l0;LP6/h;)Lgg/s;
    .locals 1

    invoke-virtual {p0}, LK6/l0;->b()Lgg/s;

    move-result-object p0

    new-instance v0, LK6/b0;

    invoke-direct {v0, p1}, LK6/b0;-><init>(LP6/h;)V

    invoke-virtual {p0, v0}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object p0

    new-instance p1, LK6/c0;

    invoke-direct {p1}, LK6/c0;-><init>()V

    invoke-virtual {p0, p1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method static v(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)Lgg/b;
    .locals 1

    new-instance v0, LK6/Z;

    invoke-direct {v0, p0, p1, p2}, LK6/Z;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    invoke-static {v0}, Lgg/b;->E(Lkg/a;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method static w(LK6/w;Landroid/bluetooth/BluetoothGattCharacteristic;[BLG6/C;)Lgg/w;
    .locals 1

    new-instance v0, LK6/d0;

    invoke-direct {v0, p3, p1, p0, p2}, LK6/d0;-><init>(LG6/C;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[B)V

    return-object v0
.end method

.method static y(LK6/w;Landroid/bluetooth/BluetoothGattCharacteristic;[BLG6/C;)Lgg/g;
    .locals 1

    new-instance v0, LK6/a0;

    invoke-direct {v0, p3, p1, p0, p2}, LK6/a0;-><init>(LG6/C;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[B)V

    return-object v0
.end method

.method static z(Landroid/bluetooth/BluetoothGattCharacteristic;LK6/w;[B)Lgg/b;
    .locals 1

    sget-object v0, LK6/g0;->h:Ljava/util/UUID;

    invoke-virtual {p0, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lcom/polidea/rxandroidble3/exceptions/BleCannotSetCharacteristicNotificationException;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;ILjava/lang/Throwable;)V

    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p1, v0, p2}, LK6/w;->a(Landroid/bluetooth/BluetoothGattDescriptor;[B)Lgg/b;

    move-result-object p1

    new-instance p2, LK6/e0;

    invoke-direct {p2, p0}, LK6/e0;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-virtual {p1, p2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method x(Landroid/bluetooth/BluetoothGattCharacteristic;LG6/C;Z)Lgg/s;
    .locals 1

    new-instance v0, LK6/W;

    invoke-direct {v0, p0, p1, p3, p2}, LK6/W;-><init>(LK6/g0;Landroid/bluetooth/BluetoothGattCharacteristic;ZLG6/C;)V

    invoke-static {v0}, Lgg/s;->r(Lkg/q;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
