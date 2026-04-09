.class final Lcom/google/ar/core/A;
.super Lcom/google/ar/core/ArCoreApk;
.source "SourceFile"


# static fields
.field private static final m:Lcom/google/ar/core/A;


# instance fields
.field private final a:Landroid/os/Handler;

.field b:Ljava/lang/Exception;

.field private c:Z

.field d:Z

.field private e:I

.field private f:J

.field private g:Lcom/google/ar/core/ArCoreApk$Availability;

.field private h:Z

.field private i:Lcom/google/ar/core/N;

.field private j:Z

.field private k:Z

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/ar/core/A;

    invoke-direct {v0}, Lcom/google/ar/core/A;-><init>()V

    sput-object v0, Lcom/google/ar/core/A;->m:Lcom/google/ar/core/A;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/ar/core/ArCoreApk;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/ar/core/A;->a:Landroid/os/Handler;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ar/core/A;->d:Z

    return-void
.end method

.method public static a()Lcom/google/ar/core/A;
    .locals 1

    sget-object v0, Lcom/google/ar/core/A;->m:Lcom/google/ar/core/A;

    return-object v0
.end method

.method private final h(Landroid/content/Context;Lcom/google/ar/core/x;)V
    .locals 2

    invoke-static {}, Lcom/google/ar/core/A;->j()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/google/ar/core/ArCoreApk$Availability;->UNSUPPORTED_DEVICE_NOT_CAPABLE:Lcom/google/ar/core/ArCoreApk$Availability;

    invoke-interface {p2, p1}, Lcom/google/ar/core/x;->a(Lcom/google/ar/core/ArCoreApk$Availability;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/google/ar/core/A;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/ar/core/A;->c()V
    :try_end_0
    .catch Lcom/google/ar/core/exceptions/FatalException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {p1}, Lcom/google/ar/core/k;->a(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/google/ar/core/ArCoreApk$Availability;->SUPPORTED_APK_TOO_OLD:Lcom/google/ar/core/ArCoreApk$Availability;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/google/ar/core/ArCoreApk$Availability;->SUPPORTED_INSTALLED:Lcom/google/ar/core/ArCoreApk$Availability;
    :try_end_1
    .catch Lcom/google/ar/core/exceptions/UnavailableDeviceNotCompatibleException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/google/ar/core/exceptions/UnavailableUserDeclinedInstallationException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    :try_start_2
    sget-object p1, Lcom/google/ar/core/ArCoreApk$Availability;->UNKNOWN_ERROR:Lcom/google/ar/core/ArCoreApk$Availability;

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    sget-object p1, Lcom/google/ar/core/ArCoreApk$Availability;->UNSUPPORTED_DEVICE_NOT_CAPABLE:Lcom/google/ar/core/ArCoreApk$Availability;

    :goto_0
    invoke-interface {p2, p1}, Lcom/google/ar/core/x;->a(Lcom/google/ar/core/ArCoreApk$Availability;)V

    return-void

    :cond_2
    invoke-static {p1}, Lcom/google/ar/core/A;->k(Landroid/content/Context;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    sget-object p1, Lcom/google/ar/core/ArCoreApk$Availability;->SUPPORTED_APK_TOO_OLD:Lcom/google/ar/core/ArCoreApk$Availability;

    invoke-interface {p2, p1}, Lcom/google/ar/core/x;->a(Lcom/google/ar/core/ArCoreApk$Availability;)V

    return-void

    :cond_3
    invoke-direct {p0, p1}, Lcom/google/ar/core/A;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lcom/google/ar/core/ArCoreApk$Availability;->SUPPORTED_NOT_INSTALLED:Lcom/google/ar/core/ArCoreApk$Availability;

    invoke-interface {p2, p1}, Lcom/google/ar/core/x;->a(Lcom/google/ar/core/ArCoreApk$Availability;)V

    return-void

    :cond_4
    invoke-virtual {p0, p1}, Lcom/google/ar/core/A;->b(Landroid/content/Context;)Lcom/google/ar/core/N;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/ar/core/N;->c(Landroid/content/Context;Lcom/google/ar/core/x;)V
    :try_end_2
    .catch Lcom/google/ar/core/exceptions/FatalException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :goto_1
    const-string v0, "ARCore-ArCoreApk"

    const-string/jumbo v1, "Error while checking app details and ARCore status"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object p1, Lcom/google/ar/core/ArCoreApk$Availability;->UNKNOWN_ERROR:Lcom/google/ar/core/ArCoreApk$Availability;

    invoke-interface {p2, p1}, Lcom/google/ar/core/x;->a(Lcom/google/ar/core/ArCoreApk$Availability;)V

    return-void
.end method

.method private final i(Landroid/content/Context;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/ar/core/A;->l(Landroid/content/Context;)V

    iget-boolean p1, p0, Lcom/google/ar/core/A;->k:Z

    return p1
.end method

.method private static j()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static k(Landroid/content/Context;)I
    .locals 3

    const/4 v0, -0x1

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string/jumbo v1, "com.google.ar.core"

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget v1, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    if-nez v1, :cond_1

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    if-eqz p0, :cond_0

    array-length p0, p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    return v1

    :catch_0
    return v0
.end method

.method private final declared-synchronized l(Landroid/content/Context;)V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/ar/core/A;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v1, 0x80

    :try_start_2
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string/jumbo v2, "com.google.ar.core"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string/jumbo v2, "com.google.ar.core"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v3, "required"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/google/ar/core/A;->k:Z

    const-string/jumbo v2, "com.google.ar.core.min_apk_version"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string/jumbo v2, "com.google.ar.core.min_apk_version"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/google/ar/core/A;->l:I

    const-string v1, "Application manifest must contain activity "
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v2, 0x1

    :try_start_4
    invoke-virtual {v0, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    const-class v0, Lcom/google/ar/core/InstallActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    array-length v3, p1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, p1, v4

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v5, :cond_1

    :try_start_5
    iput-boolean v2, p0, Lcom/google/ar/core/A;->j:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    :try_start_6
    new-instance p1, Lcom/google/ar/core/exceptions/FatalException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2b

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_1
    :try_start_7
    new-instance v0, Lcom/google/ar/core/exceptions/FatalException;

    const-string v1, "Could not load application package info"

    invoke-direct {v0, v1, p1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    new-instance p1, Lcom/google/ar/core/exceptions/FatalException;

    const-string v0, "Application manifest must contain meta-data com.google.ar.core.min_apk_version"

    invoke-direct {p1, v0}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/google/ar/core/exceptions/FatalException;

    const-string v0, "Application manifest must contain meta-data com.google.ar.core"

    invoke-direct {p1, v0}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_1
    move-exception p1

    new-instance v0, Lcom/google/ar/core/exceptions/FatalException;

    const-string v1, "Could not load application package metadata"

    invoke-direct {v0, v1, p1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_2
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1
.end method

.method private static final m(Landroid/app/Activity;)Lcom/google/ar/core/ArCoreApk$InstallStatus;
    .locals 10

    const-string v0, "ARCore-ArCoreApk"

    invoke-static {p0}, Lcom/google/ar/core/k;->a(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    if-eqz v1, :cond_1

    :try_start_0
    const-string/jumbo v2, "Starting setup activity"

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-le v2, v3, :cond_0

    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lcom/google/android/gms/common/api/h;->a(Landroid/app/ActivityOptions;I)Landroid/app/ActivityOptions;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v2

    :goto_0
    move-object v9, v2

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    invoke-virtual/range {v3 .. v9}, Landroid/app/Activity;->startIntentSender(Landroid/content/IntentSender;Landroid/content/Intent;IIILandroid/os/Bundle;)V

    sget-object p0, Lcom/google/ar/core/ArCoreApk$InstallStatus;->INSTALL_REQUESTED:Lcom/google/ar/core/ArCoreApk$InstallStatus;
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :goto_2
    const-string/jumbo v1, "Setup activity launch failed"

    invoke-static {v0, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    sget-object p0, Lcom/google/ar/core/ArCoreApk$InstallStatus;->INSTALLED:Lcom/google/ar/core/ArCoreApk$InstallStatus;

    return-object p0
.end method


# virtual methods
.method final declared-synchronized b(Landroid/content/Context;)Lcom/google/ar/core/N;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ar/core/A;->i:Lcom/google/ar/core/N;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/ar/core/N;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/ar/core/N;-><init>([B)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/ar/core/N;->a(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/ar/core/A;->i:Lcom/google/ar/core/N;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/google/ar/core/A;->i:Lcom/google/ar/core/N;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method final declared-synchronized c()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ar/core/A;->b:Ljava/lang/Exception;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput v1, p0, Lcom/google/ar/core/A;->e:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iput-boolean v1, p0, Lcom/google/ar/core/A;->c:Z

    iget-object v0, p0, Lcom/google/ar/core/A;->i:Lcom/google/ar/core/N;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/ar/core/N;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ar/core/A;->i:Lcom/google/ar/core/N;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final checkAvailability(Landroid/content/Context;)Lcom/google/ar/core/ArCoreApk$Availability;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ar/core/A;->g:Lcom/google/ar/core/ArCoreApk$Availability;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/ar/core/ArCoreApk$Availability;->isUnknown()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/google/ar/core/A;->h:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ar/core/A;->h:Z

    new-instance v0, Lcom/google/ar/core/y;

    invoke-direct {v0, p0}, Lcom/google/ar/core/y;-><init>(Lcom/google/ar/core/A;)V

    invoke-direct {p0, p1, v0}, Lcom/google/ar/core/A;->h(Landroid/content/Context;Lcom/google/ar/core/x;)V

    :cond_1
    iget-object p1, p0, Lcom/google/ar/core/A;->g:Lcom/google/ar/core/ArCoreApk$Availability;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/google/ar/core/ArCoreApk$Availability;->isUnsupported()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ar/core/A;->g:Lcom/google/ar/core/ArCoreApk$Availability;

    :cond_2
    monitor-exit p0

    return-object p1

    :cond_3
    iget-boolean p1, p0, Lcom/google/ar/core/A;->h:Z

    if-eqz p1, :cond_4

    sget-object p1, Lcom/google/ar/core/ArCoreApk$Availability;->UNKNOWN_CHECKING:Lcom/google/ar/core/ArCoreApk$Availability;

    monitor-exit p0

    return-object p1

    :cond_4
    const-string p1, "ARCore-ArCoreApk"

    const-string/jumbo v0, "request not running but result is null?"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/google/ar/core/ArCoreApk$Availability;->UNKNOWN_ERROR:Lcom/google/ar/core/ArCoreApk$Availability;

    monitor-exit p0

    return-object p1

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final checkAvailabilityAsync(Landroid/content/Context;Ljava/util/function/Consumer;)V
    .locals 1

    new-instance v0, Lcom/google/ar/core/z;

    invoke-direct {v0, p0, p2}, Lcom/google/ar/core/z;-><init>(Lcom/google/ar/core/A;Ljava/util/function/Consumer;)V

    invoke-direct {p0, p1, v0}, Lcom/google/ar/core/A;->h(Landroid/content/Context;Lcom/google/ar/core/x;)V

    return-void
.end method

.method final d(Landroid/content/Context;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/ar/core/A;->l(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/google/ar/core/A;->k(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/ar/core/A;->k(Landroid/content/Context;)I

    move-result p1

    iget v0, p0, Lcom/google/ar/core/A;->l:I

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method final synthetic e()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/core/A;->a:Landroid/os/Handler;

    return-object v0
.end method

.method final synthetic f(Lcom/google/ar/core/ArCoreApk$Availability;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/core/A;->g:Lcom/google/ar/core/ArCoreApk$Availability;

    return-void
.end method

.method final synthetic g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/ar/core/A;->h:Z

    return-void
.end method

.method public final requestInstall(Landroid/app/Activity;Z)Lcom/google/ar/core/ArCoreApk$InstallStatus;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/google/ar/core/A;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/ar/core/ArCoreApk$InstallBehavior;->REQUIRED:Lcom/google/ar/core/ArCoreApk$InstallBehavior;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/ar/core/ArCoreApk$InstallBehavior;->OPTIONAL:Lcom/google/ar/core/ArCoreApk$InstallBehavior;

    .line 2
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/ar/core/A;->i(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    sget-object v1, Lcom/google/ar/core/ArCoreApk$UserMessageType;->APPLICATION:Lcom/google/ar/core/ArCoreApk$UserMessageType;

    goto :goto_1

    .line 4
    :cond_1
    sget-object v1, Lcom/google/ar/core/ArCoreApk$UserMessageType;->USER_ALREADY_INFORMED:Lcom/google/ar/core/ArCoreApk$UserMessageType;

    .line 5
    :goto_1
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/ar/core/ArCoreApk;->requestInstall(Landroid/app/Activity;ZLcom/google/ar/core/ArCoreApk$InstallBehavior;Lcom/google/ar/core/ArCoreApk$UserMessageType;)Lcom/google/ar/core/ArCoreApk$InstallStatus;

    move-result-object p1

    return-object p1
.end method

.method public final requestInstall(Landroid/app/Activity;ZLcom/google/ar/core/ArCoreApk$InstallBehavior;Lcom/google/ar/core/ArCoreApk$UserMessageType;)Lcom/google/ar/core/ArCoreApk$InstallStatus;
    .locals 6

    .line 6
    invoke-static {}, Lcom/google/ar/core/A;->j()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 7
    invoke-virtual {p0, p1}, Lcom/google/ar/core/A;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p0}, Lcom/google/ar/core/A;->c()V

    .line 9
    invoke-static {p1}, Lcom/google/ar/core/A;->m(Landroid/app/Activity;)Lcom/google/ar/core/ArCoreApk$InstallStatus;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/ar/core/A;->c:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/ar/core/A;->b:Ljava/lang/Exception;

    if-eqz v0, :cond_5

    const-string v1, "ARCore-ArCoreApk"

    if-eqz p2, :cond_1

    const-string p2, "Clearing previous failure: "

    .line 10
    invoke-static {v1, p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/ar/core/A;->b:Ljava/lang/Exception;

    goto :goto_0

    .line 11
    :cond_1
    instance-of p1, v0, Lcom/google/ar/core/exceptions/UnavailableDeviceNotCompatibleException;

    if-nez p1, :cond_4

    .line 12
    instance-of p1, v0, Lcom/google/ar/core/exceptions/UnavailableUserDeclinedInstallationException;

    if-nez p1, :cond_3

    .line 13
    instance-of p1, v0, Ljava/lang/RuntimeException;

    if-eqz p1, :cond_2

    .line 14
    const-string/jumbo p1, "Throwing RuntimeException."

    .line 15
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 17
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo p2, "Unexpected exception type"

    .line 18
    invoke-direct {p1, p2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 19
    :cond_3
    const-string/jumbo p1, "Throwing UnavailableUserDeclinedInstallationException"

    .line 20
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    check-cast v0, Lcom/google/ar/core/exceptions/UnavailableUserDeclinedInstallationException;

    throw v0

    .line 22
    :cond_4
    const-string/jumbo p1, "Throwing UnavailableDeviceNotCompatibleException"

    .line 23
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    check-cast v0, Lcom/google/ar/core/exceptions/UnavailableDeviceNotCompatibleException;

    throw v0

    .line 25
    :cond_5
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/ar/core/A;->f:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1388

    cmp-long p2, v2, v4

    if-lez p2, :cond_6

    const/4 p2, 0x0

    iput p2, p0, Lcom/google/ar/core/A;->e:I

    :cond_6
    iget p2, p0, Lcom/google/ar/core/A;->e:I

    const/4 v2, 0x1

    add-int/2addr p2, v2

    iput p2, p0, Lcom/google/ar/core/A;->e:I

    iput-wide v0, p0, Lcom/google/ar/core/A;->f:J

    const/4 v0, 0x2

    if-gt p2, v0, :cond_7

    :try_start_0
    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/google/ar/core/InstallActivity;

    .line 26
    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string/jumbo v0, "message"

    .line 27
    invoke-virtual {p2, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p2

    const-string/jumbo p4, "behavior"

    .line 28
    invoke-virtual {p2, p4, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p2

    .line 29
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iput-boolean v2, p0, Lcom/google/ar/core/A;->c:Z

    .line 30
    sget-object p1, Lcom/google/ar/core/ArCoreApk$InstallStatus;->INSTALL_REQUESTED:Lcom/google/ar/core/ArCoreApk$InstallStatus;

    return-object p1

    :catch_0
    move-exception p1

    .line 31
    new-instance p2, Lcom/google/ar/core/exceptions/FatalException;

    const-string/jumbo p3, "Failed to launch InstallActivity."

    .line 32
    invoke-direct {p2, p3, p1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 33
    :cond_7
    new-instance p1, Lcom/google/ar/core/exceptions/FatalException;

    const-string/jumbo p2, "Requesting ARCore installation too rapidly."

    .line 34
    invoke-direct {p1, p2}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 35
    :cond_8
    sget-object p1, Lcom/google/ar/core/ArCoreApk$InstallStatus;->INSTALL_REQUESTED:Lcom/google/ar/core/ArCoreApk$InstallStatus;

    return-object p1

    .line 36
    :cond_9
    new-instance p1, Lcom/google/ar/core/exceptions/UnavailableDeviceNotCompatibleException;

    invoke-direct {p1}, Lcom/google/ar/core/exceptions/UnavailableDeviceNotCompatibleException;-><init>()V

    throw p1
.end method
