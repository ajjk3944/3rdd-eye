.class public abstract LG6/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# direct methods
.method static a()Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    return-object v0
.end method

.method static b()Lgg/y;
    .locals 1

    new-instance v0, LO6/k;

    invoke-direct {v0}, LO6/k;-><init>()V

    invoke-static {v0}, LEg/a;->f(Ljava/util/concurrent/ThreadFactory;)Lgg/y;

    move-result-object v0

    return-object v0
.end method

.method static c()Ljava/util/concurrent/ExecutorService;
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method static d(Ljava/util/concurrent/ExecutorService;)Lgg/y;
    .locals 0

    invoke-static {p0}, LGg/a;->b(Ljava/util/concurrent/Executor;)Lgg/y;

    move-result-object p0

    return-object p0
.end method

.method static e(Landroid/content/Context;)Landroid/bluetooth/BluetoothManager;
    .locals 1

    const-string/jumbo v0, "bluetooth"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/bluetooth/BluetoothManager;

    return-object p0
.end method

.method static f()Lgg/y;
    .locals 1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    return-object v0
.end method

.method static g()Ljava/util/concurrent/ExecutorService;
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method static h(Landroid/content/Context;)Landroid/content/ContentResolver;
    .locals 0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    return-object p0
.end method

.method static i()I
    .locals 1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    return v0
.end method

.method static j()[B
    .locals 1

    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    return-object v0
.end method

.method static k()[B
    .locals 1

    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    return-object v0
.end method

.method static l()[B
    .locals 1

    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    return-object v0
.end method

.method static m(Ljava/util/concurrent/ExecutorService;Lgg/y;Ljava/util/concurrent/ExecutorService;)LG6/a$b;
    .locals 1

    new-instance v0, LG6/a$c$a;

    invoke-direct {v0, p0, p1, p2}, LG6/a$c$a;-><init>(Ljava/util/concurrent/ExecutorService;Lgg/y;Ljava/util/concurrent/ExecutorService;)V

    return-object v0
.end method

.method static n(Landroid/content/Context;I)Z
    .locals 1

    const/16 v0, 0x14

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string/jumbo p1, "android.hardware.type.watch"

    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static o(ILz2/a;Lz2/a;)LN6/j;
    .locals 1

    const/16 v0, 0x1a

    if-ge p0, v0, :cond_0

    invoke-interface {p1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LN6/j;

    return-object p0

    :cond_0
    invoke-interface {p2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LN6/j;

    return-object p0
.end method

.method static p(Landroid/content/Context;)Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x1000

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    move v1, v0

    :goto_0
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_2

    const-string/jumbo v3, "android.permission.BLUETOOTH_SCAN"

    aget-object v2, v2, v1

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    aget p0, p0, v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/high16 v1, 0x10000

    and-int/2addr p0, v1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :catch_0
    move-exception p0

    const-string v1, "Could not find application PackageInfo"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, LI6/q;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return v0
.end method

.method static q(Landroid/content/Context;)Landroid/location/LocationManager;
    .locals 1

    const-string/jumbo v0, "location"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/location/LocationManager;

    return-object p0
.end method

.method static r(ILP6/v;)Lgg/s;
    .locals 1

    const/16 v0, 0x17

    if-ge p0, v0, :cond_0

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0}, LP6/E;->b(Ljava/lang/Object;)Lgg/s;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LP6/v;->a()Lgg/s;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method static s(ILz2/a;Lz2/a;Lz2/a;)LP6/x;
    .locals 1

    const/16 v0, 0x17

    if-ge p0, v0, :cond_0

    invoke-interface {p1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LP6/x;

    return-object p0

    :cond_0
    const/16 p1, 0x1f

    if-ge p0, p1, :cond_1

    invoke-interface {p2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LP6/x;

    return-object p0

    :cond_1
    invoke-interface {p3}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LP6/x;

    return-object p0
.end method

.method static t(II)[[Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/16 p1, 0x1f

    if-ge p0, p1, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [[Ljava/lang/String;

    return-object p0

    :cond_0
    const-string/jumbo p0, "android.permission.BLUETOOTH_CONNECT"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static u(IIZ)[[Ljava/lang/String;
    .locals 1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/16 p1, 0x17

    if-ge p0, p1, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [[Ljava/lang/String;

    return-object p0

    :cond_0
    const/16 p1, 0x1d

    const-string/jumbo v0, "android.permission.ACCESS_FINE_LOCATION"

    if-ge p0, p1, :cond_1

    const-string/jumbo p0, "android.permission.ACCESS_COARSE_LOCATION"

    filled-new-array {p0, v0}, [Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [[Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 p1, 0x1f

    if-ge p0, p1, :cond_2

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [[Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string/jumbo p0, "android.permission.BLUETOOTH_SCAN"

    if-eqz p2, :cond_3

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [[Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object p1

    filled-new-array {p0, p1}, [[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static v(ILz2/a;Lz2/a;)LN6/q;
    .locals 1

    const/16 v0, 0x18

    if-ge p0, v0, :cond_0

    invoke-interface {p1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LN6/q;

    return-object p0

    :cond_0
    invoke-interface {p2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LN6/q;

    return-object p0
.end method

.method static w(ILz2/a;Lz2/a;Lz2/a;)LN6/B;
    .locals 1

    const/16 v0, 0x15

    if-ge p0, v0, :cond_0

    invoke-interface {p1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LN6/B;

    return-object p0

    :cond_0
    const/16 p1, 0x17

    if-ge p0, p1, :cond_1

    invoke-interface {p2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LN6/B;

    return-object p0

    :cond_1
    invoke-interface {p3}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LN6/B;

    return-object p0
.end method

.method static x(Landroid/content/Context;)I
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget p0, p0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    const p0, 0x7fffffff

    return p0
.end method
