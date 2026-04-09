.class public final Lcom/ui/wifiman/model/bluetooth/le/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/bluetooth/le/BleScanner;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/bluetooth/le/f$a;,
        Lcom/ui/wifiman/model/bluetooth/le/f$b;
    }
.end annotation


# static fields
.field public static final i:Lcom/ui/wifiman/model/bluetooth/le/f$a;


# instance fields
.field private final a:Landroid/bluetooth/BluetoothManager;

.field private final b:Landroid/content/pm/PackageManager;

.field private final c:Lcom/ui/wifiman/model/bluetooth/le/j$a;

.field private final d:J

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/bluetooth/le/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/f;->i:Lcom/ui/wifiman/model/bluetooth/le/f$a;

    return-void
.end method

.method public constructor <init>(Landroid/bluetooth/BluetoothManager;Lwc/d;Lcom/ui/wifiman/model/vendor/d$b;LAc/a;Lxa/o;Landroid/content/pm/PackageManager;Lcom/ui/wifiman/model/bluetooth/le/j$a;Lcom/ui/wifiman/model/android/permissions/d;)V
    .locals 2

    const-string v0, "bluetoothManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothReceiver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "macVendorManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "OUIBluetoothLookup"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productCatalog"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "beaconOperator"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionsService"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->a:Landroid/bluetooth/BluetoothManager;

    iput-object p6, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->b:Landroid/content/pm/PackageManager;

    iput-object p7, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->c:Lcom/ui/wifiman/model/bluetooth/le/j$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr p6, v0

    iput-wide p6, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->d:J

    new-instance p1, Lyc/h;

    invoke-direct {p1, p0}, Lyc/h;-><init>(Lcom/ui/wifiman/model/bluetooth/le/f;)V

    sget-object p6, Lgg/a;->BUFFER:Lgg/a;

    invoke-static {p1, p6}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p6

    invoke-virtual {p1, p6}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p6

    invoke-virtual {p1, p6}, Lgg/i;->g2(Lgg/y;)Lgg/i;

    move-result-object p1

    new-instance p6, Lyc/i;

    invoke-direct {p6}, Lyc/i;-><init>()V

    sget-object p7, Lcom/ui/wifiman/model/bluetooth/le/f$d;->a:Lcom/ui/wifiman/model/bluetooth/le/f$d;

    invoke-virtual {p1, p6, p7}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object p6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p7

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, v0, v1, p6, p7}, Lgg/i;->V1(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p6

    const/4 p7, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p6, p7, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    new-instance p6, Lcom/ui/wifiman/model/bluetooth/le/f$e;

    invoke-direct {p6, p0}, Lcom/ui/wifiman/model/bluetooth/le/f$e;-><init>(Lcom/ui/wifiman/model/bluetooth/le/f;)V

    invoke-virtual {p1, p6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p6, Lcom/ui/wifiman/model/bluetooth/le/f$f;->a:Lcom/ui/wifiman/model/bluetooth/le/f$f;

    invoke-virtual {p1, p6}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p6, Lyc/j;

    invoke-direct {p6}, Lyc/j;-><init>()V

    invoke-virtual {p1, p6}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    const-string p6, "doFinally(...)"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->e:Lgg/i;

    new-instance p6, Lcom/ui/wifiman/model/bluetooth/le/f$i;

    invoke-direct {p6, p0}, Lcom/ui/wifiman/model/bluetooth/le/f$i;-><init>(Lcom/ui/wifiman/model/bluetooth/le/f;)V

    invoke-virtual {p1, p6}, Lgg/i;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-interface {p3}, Lcom/ui/wifiman/model/vendor/d$b;->a()Lgg/z;

    move-result-object p3

    invoke-virtual {p3}, Lgg/z;->W()Lgg/i;

    move-result-object p3

    invoke-interface {p4}, LAc/a;->a()Lgg/z;

    move-result-object p4

    invoke-virtual {p4}, Lgg/z;->W()Lgg/i;

    move-result-object p4

    invoke-interface {p5}, Lxa/o;->b()Lgg/i;

    move-result-object p5

    new-instance p6, Lcom/ui/wifiman/model/bluetooth/le/f$j;

    invoke-direct {p6, p0}, Lcom/ui/wifiman/model/bluetooth/le/f$j;-><init>(Lcom/ui/wifiman/model/bluetooth/le/f;)V

    invoke-static {p1, p3, p4, p5, p6}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object p1

    sget-object p3, Lcom/ui/wifiman/model/bluetooth/le/f$k;->a:Lcom/ui/wifiman/model/bluetooth/le/f$k;

    invoke-virtual {p1, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const-string p3, "doOnNext(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->f:Lgg/i;

    invoke-interface {p2}, Lwc/d;->a()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/bluetooth/le/f$l;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/bluetooth/le/f$l;-><init>(Lcom/ui/wifiman/model/bluetooth/le/f;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "switchMap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->g:Lgg/i;

    invoke-interface {p8}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/bluetooth/le/f$g;->a:Lcom/ui/wifiman/model/bluetooth/le/f$g;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/bluetooth/le/f$h;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/bluetooth/le/f$h;-><init>(Lcom/ui/wifiman/model/bluetooth/le/f;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->h:Lgg/i;

    return-void
.end method

.method private final A(Landroid/bluetooth/le/ScanResult;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanRecord;->getAdvertiseFlags()I

    move-result p1

    if-lez p1, :cond_0

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public static synthetic b(Lcom/ui/wifiman/model/bluetooth/le/f;Lcom/ui/wifiman/model/bluetooth/le/f$c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/f;->m(Lcom/ui/wifiman/model/bluetooth/le/f;Lcom/ui/wifiman/model/bluetooth/le/f$c;)V

    return-void
.end method

.method public static synthetic c()Ljava/util/HashMap;
    .locals 1

    invoke-static {}, Lcom/ui/wifiman/model/bluetooth/le/f;->n()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lcom/ui/wifiman/model/bluetooth/le/f;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/f;->l(Lcom/ui/wifiman/model/bluetooth/le/f;Lgg/j;)V

    return-void
.end method

.method public static synthetic e()V
    .locals 0

    invoke-static {}, Lcom/ui/wifiman/model/bluetooth/le/f;->o()V

    return-void
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/bluetooth/le/f;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/le/ScanResult;Lcom/ui/wifiman/model/vendor/d$a;LAc/a$a;Lwa/a;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/ui/wifiman/model/bluetooth/le/f;->p(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/le/ScanResult;Lcom/ui/wifiman/model/vendor/d$a;LAc/a$a;Lwa/a;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/bluetooth/le/f;)Landroid/bluetooth/BluetoothManager;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->a:Landroid/bluetooth/BluetoothManager;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/bluetooth/le/f;Landroid/bluetooth/le/ScanResult;)J
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/f;->u(Landroid/bluetooth/le/ScanResult;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/bluetooth/le/f;)Landroid/content/pm/PackageManager;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->b:Landroid/content/pm/PackageManager;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/bluetooth/le/f;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->f:Lgg/i;

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/bluetooth/le/f;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->g:Lgg/i;

    return-object p0
.end method

.method private static final l(Lcom/ui/wifiman/model/bluetooth/le/f;Lgg/j;)V
    .locals 6

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lgg/j;->serialize()Lgg/j;

    move-result-object p1

    const-string v0, "serialize(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/f$c;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/bluetooth/le/f$c;-><init>(Lgg/j;)V

    :try_start_0
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->a:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v4

    new-instance v5, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {v5}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    invoke-virtual {v5, v2}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object v5

    invoke-virtual {v5}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object v5

    invoke-virtual {v1, v4, v5, v0}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    const-string v1, "BLeScan - started"

    invoke-static {v1, v3, v2, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    const-string v1, "BLeScan - could not be stopped, because scanner was null"

    invoke-static {v1, v3, v2, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    invoke-interface {p1, v1}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    :goto_1
    new-instance v1, Lyc/k;

    invoke-direct {v1, p0, v0}, Lyc/k;-><init>(Lcom/ui/wifiman/model/bluetooth/le/f;Lcom/ui/wifiman/model/bluetooth/le/f$c;)V

    invoke-interface {p1, v1}, Lgg/j;->d(Lkg/e;)V

    return-void
.end method

.method private static final m(Lcom/ui/wifiman/model/bluetooth/le/f;Lcom/ui/wifiman/model/bluetooth/le/f$c;)V
    .locals 2

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->a:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object p0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V

    const-string p0, "BLeScan - stopped"

    invoke-static {p0, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "BLeScan - could not be stopped"

    const/4 v0, 0x4

    invoke-static {p1, p0, v1, v0, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p0, "BLeScan - could not be stopped, because scanner was null"

    invoke-static {p0, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static final n()Ljava/util/HashMap;
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method private static final o()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "BLeScan - disposed"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final p(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/le/ScanResult;Lcom/ui/wifiman/model/vendor/d$a;LAc/a$a;Lwa/a;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    invoke-virtual/range {p1 .. p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    sget-object v5, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v5, v3}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v3

    move-object v7, v3

    goto :goto_0

    :cond_0
    move-object v7, v4

    :goto_0
    if-nez v7, :cond_1

    return-object v4

    :cond_1
    if-eqz v1, :cond_2

    iget-object v3, v0, Lcom/ui/wifiman/model/bluetooth/le/f;->c:Lcom/ui/wifiman/model/bluetooth/le/j$a;

    invoke-interface {v3, v1}, Lcom/ui/wifiman/model/bluetooth/le/j$a;->a(Landroid/bluetooth/le/ScanResult;)Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :cond_2
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    :goto_1
    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcom/ui/wifiman/model/bluetooth/le/j;

    instance-of v8, v8, Lyc/r;

    if-eqz v8, :cond_3

    goto :goto_2

    :cond_4
    move-object v6, v4

    :goto_2
    check-cast v6, Lcom/ui/wifiman/model/bluetooth/le/j;

    if-eqz v6, :cond_6

    check-cast v6, Lyc/r;

    invoke-virtual {v6}, Lyc/r;->b()Lh9/a;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    move-object v6, v5

    goto :goto_4

    :cond_6
    :goto_3
    move-object v6, v7

    :goto_4
    if-eqz v1, :cond_7

    move-object/from16 v5, p5

    invoke-direct {v0, v5, v1}, Lcom/ui/wifiman/model/bluetooth/le/f;->q(Lwa/a;Landroid/bluetooth/le/ScanResult;)Lxa/a$d;

    move-result-object v5

    move-object v15, v5

    goto :goto_5

    :cond_7
    move-object v15, v4

    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v12

    if-eqz v1, :cond_8

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/bluetooth/le/f;->v(Landroid/bluetooth/le/ScanResult;)LU7/a;

    move-result-object v5

    move-object v11, v5

    goto :goto_6

    :cond_8
    move-object v11, v4

    :goto_6
    invoke-direct {v0, v3}, Lcom/ui/wifiman/model/bluetooth/le/f;->t(Ljava/util/List;)LCc/b;

    move-result-object v5

    if-nez v5, :cond_9

    invoke-static/range {p1 .. p1}, Lzc/a;->a(Landroid/bluetooth/BluetoothDevice;)LCc/b;

    move-result-object v5

    :cond_9
    move-object v13, v5

    if-eqz v1, :cond_b

    invoke-direct {v0, v1, v15, v3}, Lcom/ui/wifiman/model/bluetooth/le/f;->w(Landroid/bluetooth/le/ScanResult;Lxa/a$d;Ljava/util/List;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    move-result-object v5

    if-nez v5, :cond_a

    goto :goto_8

    :cond_a
    :goto_7
    move-object v8, v5

    goto :goto_9

    :cond_b
    :goto_8
    sget-object v5, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->NORMAL:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    goto :goto_7

    :goto_9
    if-eqz v1, :cond_c

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/bluetooth/le/f;->u(Landroid/bluetooth/le/ScanResult;)J

    move-result-wide v9

    :goto_a
    move-wide/from16 v21, v9

    goto :goto_b

    :cond_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    goto :goto_a

    :goto_b
    if-eqz v15, :cond_e

    new-instance v2, Lcom/ui/wifiman/model/vendor/d$c;

    sget-object v5, Lcom/ui/wifiman/model/vendor/d$d;->UBIQUITI:Lcom/ui/wifiman/model/vendor/d$d;

    invoke-direct {v2, v5}, Lcom/ui/wifiman/model/vendor/d$c;-><init>(Lcom/ui/wifiman/model/vendor/d$d;)V

    :cond_d
    :goto_c
    move-object v14, v2

    goto :goto_e

    :cond_e
    if-eqz v1, :cond_f

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/bluetooth/le/f;->s(Landroid/bluetooth/le/ScanResult;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    if-eqz v2, :cond_f

    invoke-interface {v2, v5}, LAc/a$a;->a(I)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v2

    goto :goto_d

    :cond_f
    move-object v2, v4

    :goto_d
    if-nez v2, :cond_d

    move-object/from16 v5, p3

    invoke-interface {v5, v6}, Lcom/ui/wifiman/model/vendor/d$a;->a(Lh9/a;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v2

    goto :goto_c

    :goto_e
    if-eqz v1, :cond_10

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/bluetooth/le/f;->r(Landroid/bluetooth/le/ScanResult;)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_f

    :cond_10
    move-object/from16 v16, v4

    :goto_f
    const/4 v2, 0x1

    if-eqz v1, :cond_11

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/bluetooth/le/f;->y(Landroid/bluetooth/le/ScanResult;)Z

    move-result v5

    move v10, v5

    goto :goto_10

    :cond_11
    move v10, v2

    :goto_10
    if-eqz v1, :cond_12

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/bluetooth/le/f;->z(Landroid/bluetooth/le/ScanResult;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_12
    move-object/from16 v18, v4

    invoke-direct/range {p0 .. p1}, Lcom/ui/wifiman/model/bluetooth/le/f;->x(Landroid/bluetooth/BluetoothDevice;)Ljava/util/Set;

    move-result-object v17

    if-nez v1, :cond_13

    :goto_11
    move v9, v2

    goto :goto_12

    :cond_13
    const/4 v2, 0x0

    goto :goto_11

    :goto_12
    if-eqz v1, :cond_15

    invoke-virtual/range {p2 .. p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Landroid/bluetooth/le/ScanRecord;->getServiceUuids()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_15

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/ParcelUuid;

    invoke-virtual {v4}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_14
    move-object/from16 v20, v2

    goto :goto_14

    :cond_15
    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v1

    move-object/from16 v20, v1

    :goto_14
    new-instance v1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;

    move-object v5, v1

    move-object/from16 v19, v3

    invoke-direct/range {v5 .. v22}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;-><init>(Lh9/a;Lh9/a;Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;ZZLU7/a;Ljava/lang/String;LCc/b;Lcom/ui/wifiman/model/vendor/d;Lxa/a$d;Ljava/lang/Long;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Set;J)V

    return-object v1
.end method

.method private final q(Lwa/a;Landroid/bluetooth/le/ScanResult;)Lxa/a$d;
    .locals 2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanRecord;->getServiceUuids()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/ParcelUuid;

    invoke-virtual {v0}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v0

    const-string v1, "getUuid(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lwa/a;->f(Ljava/util/UUID;)Lua/a;

    move-result-object v0

    check-cast v0, Lxa/a$d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final r(Landroid/bluetooth/le/ScanResult;)Ljava/lang/Long;
    .locals 2

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getPeriodicAdvertisingInterval()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getPeriodicAdvertisingInterval()I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x3fa00000    # 1.25f

    mul-float/2addr p1, v0

    float-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final s(Landroid/bluetooth/le/ScanResult;)Ljava/lang/Integer;
    .locals 2

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanRecord;->getManufacturerSpecificData()Landroid/util/SparseArray;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final t(Ljava/util/List;)LCc/b;
    .locals 3

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/bluetooth/le/j;

    instance-of v2, v0, Lyc/r;

    if-eqz v2, :cond_1

    sget-object p1, LCc/b$g$d;->b:LCc/b$g$d;

    return-object p1

    :cond_1
    instance-of v2, v0, Lcom/ui/wifiman/model/bluetooth/le/l$a;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/ui/wifiman/model/bluetooth/le/l$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/bluetooth/le/l$a;->a()Lcom/ui/wifiman/model/bluetooth/le/l$c;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p1, -0x1

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/f$b;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    packed-switch p1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v1, LCc/e;->b:LCc/e;

    goto :goto_1

    :pswitch_1
    sget-object v1, LCc/f;->b:LCc/f;

    goto :goto_1

    :pswitch_2
    sget-object v1, LCc/b$h;->b:LCc/b$h;

    goto :goto_1

    :pswitch_3
    sget-object v1, LCc/d;->b:LCc/d;

    goto :goto_1

    :pswitch_4
    sget-object v1, LCc/c;->b:LCc/c;

    goto :goto_1

    :pswitch_5
    sget-object v1, LCc/b$a$a;->b:LCc/b$a$a;

    goto :goto_1

    :pswitch_6
    sget-object v1, LCc/b$b$c;->c:LCc/b$b$c;

    goto :goto_1

    :pswitch_7
    sget-object v1, LCc/b$b$d;->c:LCc/b$b$d;

    goto :goto_1

    :pswitch_8
    sget-object v1, LCc/b$d$a;->b:LCc/b$d$a;

    :cond_3
    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final u(Landroid/bluetooth/le/ScanResult;)J
    .locals 5

    iget-wide v0, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->d:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final v(Landroid/bluetooth/le/ScanResult;)LU7/a;
    .locals 3

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/16 v1, -0x7f

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    const/16 v1, 0x7e

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v0, LU7/a;->e:LU7/a$a;

    invoke-virtual {v0, p1}, LU7/a$a;->a(I)LU7/a;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method private final w(Landroid/bluetooth/le/ScanResult;Lxa/a$d;Ljava/util/List;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;
    .locals 2

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/f;->A(Landroid/bluetooth/le/ScanResult;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p2, :cond_3

    :cond_0
    check-cast p3, Ljava/lang/Iterable;

    instance-of v0, p3, Ljava/util/Collection;

    if-eqz v0, :cond_1

    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/bluetooth/le/j;

    instance-of v1, v0, Lyc/r;

    if-eqz v1, :cond_2

    check-cast v0, Lyc/r;

    invoke-virtual {v0}, Lyc/r;->d()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_3
    sget-object p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->BOOTING:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    goto/16 :goto_3

    :cond_4
    :goto_0
    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanRecord;->getServiceUuids()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_a

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/os/ParcelUuid;

    invoke-virtual {p3}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v0

    if-eqz v0, :cond_5

    if-eqz p2, :cond_5

    invoke-interface {p2}, Lua/a;->p0()LEa/c;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, LEa/c;->D()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p3}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object p3

    const-string v1, "getUuid(...)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lva/b;->c(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object p3

    invoke-static {p3}, Lva/b;->a(Ljava/util/UUID;)Lva/b;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LEa/a;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, LEa/a;->c()Lva/c;

    move-result-object p1

    const/4 p2, -0x1

    if-nez p1, :cond_6

    move p1, p2

    goto :goto_1

    :cond_6
    sget-object p3, Lcom/ui/wifiman/model/bluetooth/le/f$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    :goto_1
    if-eq p1, p2, :cond_9

    const/4 p2, 0x1

    if-eq p1, p2, :cond_8

    const/4 p2, 0x2

    if-ne p1, p2, :cond_7

    sget-object p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->FACTORY:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    goto :goto_2

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    sget-object p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->NORMAL:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    goto :goto_2

    :cond_9
    sget-object p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->NORMAL:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    :goto_2
    return-object p1

    :cond_a
    sget-object p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;->NORMAL:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    :goto_3
    return-object p1
.end method

.method private final x(Landroid/bluetooth/BluetoothDevice;)Ljava/util/Set;
    .locals 0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result p1

    invoke-static {p1}, Lzc/a;->b(I)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private final y(Landroid/bluetooth/le/ScanResult;)Z
    .locals 0

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->isConnectable()Z

    move-result p1

    return p1
.end method

.method private final z(Landroid/bluetooth/le/ScanResult;)I
    .locals 0

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getTxPower()I

    move-result p1

    return p1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/f;->h:Lgg/i;

    return-object v0
.end method
