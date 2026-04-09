.class public final Lcom/ui/wifiman/support/UiSupport;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/support/UiSupport$a;,
        Lcom/ui/wifiman/support/UiSupport$Error;,
        Lcom/ui/wifiman/support/UiSupport$b;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/support/UiSupport$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/support/UiSupport$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/support/UiSupport$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/support/UiSupport;->a:Lcom/ui/wifiman/support/UiSupport$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/content/Context;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 10

    const-string v0, ""

    const-string v1, "ERROR"

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    const-string v3, "name"

    iget-object v4, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    move-object p1, v1

    :cond_1
    invoke-static {v3, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v4

    const-string p1, "package"

    iget-object v3, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-static {p1, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    const-string p1, "version"

    iget-object v3, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v3, :cond_2

    move-object v3, v0

    :cond_2
    invoke-static {p1, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v6

    const-string p1, "versionCode"

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1c

    if-lt v3, v7, :cond_3

    invoke-static {v2}, Lcom/google/android/recaptcha/internal/e;->a(Landroid/content/pm/PackageInfo;)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    iget v3, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-static {p1, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v7

    const-string p1, "first install time"

    iget-wide v8, v2, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v8

    const-string p1, "last update time"

    iget-wide v2, v2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v9

    filled-new-array/range {v4 .. v9}, [LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, p1

    :goto_3
    invoke-static {v1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object p1

    :goto_4
    new-instance v0, Lcom/ui/wifiman/support/UiSupport$b;

    const-string v1, "APP"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private final b(Ljava/lang/StringBuilder;Lcom/ui/wifiman/support/UiSupport$b;)Ljava/lang/StringBuilder;
    .locals 1

    const-string v0, "\n=================\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-object p1
.end method

.method private final c()Lcom/ui/wifiman/support/UiSupport$b;
    .locals 11

    new-instance v0, Lcom/ui/wifiman/support/UiSupport$b;

    const-string v1, "manufacturer"

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    const-string v1, "model"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v4

    const-string v1, "brand"

    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    const-string v1, "device"

    sget-object v2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v6

    const-string v1, "display"

    sget-object v2, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v7

    const-string v1, "fingerprint"

    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v8

    const-string v1, "product"

    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v9

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "version"

    invoke-static {v2, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v10

    filled-new-array/range {v3 .. v10}, [LYg/s;

    move-result-object v1

    invoke-static {v1}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "DEVICE"

    invoke-direct {v0, v2, v1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private final d(Ljava/lang/String;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 3

    new-instance v0, Lcom/ui/wifiman/support/UiSupport$b;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "timestamp"

    invoke-static {v2, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "userId"

    invoke-static {v2, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    filled-new-array {v1, p1}, [LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "SUPPORT FILE"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private final f(Landroid/content/Context;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 9

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x1000

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :try_start_0
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz v1, :cond_3

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_3

    aget-object v6, v1, v4

    add-int/lit8 v7, v5, 0x1

    iget-object v8, p1, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    if-eqz v8, :cond_0

    aget v5, v8, v5

    and-int/lit8 v5, v5, 0x2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    move v5, v3

    :goto_1
    if-lez v5, :cond_1

    const-string v5, "GRANTED"

    goto :goto_2

    :cond_1
    const-string v5, "REQUESTED"

    :goto_2
    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v4, 0x1

    move v5, v7

    goto :goto_0

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, ""

    :cond_2
    const-string v1, "ERROR"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    new-instance p1, Lcom/ui/wifiman/support/UiSupport$b;

    const-string v1, "PERMISSIONS"

    invoke-direct {p1, v1, v0}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p1
.end method


# virtual methods
.method public final e(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {p0, p2}, Lcom/ui/wifiman/support/UiSupport;->d(Ljava/lang/String;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/wifiman/support/UiSupport$b;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/support/UiSupport;->a(Landroid/content/Context;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p2

    invoke-direct {p0, v0, p2}, Lcom/ui/wifiman/support/UiSupport;->b(Ljava/lang/StringBuilder;Lcom/ui/wifiman/support/UiSupport$b;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-direct {p0, p1}, Lcom/ui/wifiman/support/UiSupport;->f(Landroid/content/Context;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/ui/wifiman/support/UiSupport;->b(Ljava/lang/StringBuilder;Lcom/ui/wifiman/support/UiSupport$b;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-direct {p0}, Lcom/ui/wifiman/support/UiSupport;->c()Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/support/UiSupport;->b(Ljava/lang/StringBuilder;Lcom/ui/wifiman/support/UiSupport$b;)Ljava/lang/StringBuilder;

    move-result-object p1

    if-eqz p3, :cond_0

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ui/wifiman/support/UiSupport$b;

    invoke-direct {p0, p1, p3}, Lcom/ui/wifiman/support/UiSupport;->b(Ljava/lang/StringBuilder;Lcom/ui/wifiman/support/UiSupport$b;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_1
    new-instance p2, Lcom/ui/wifiman/support/UiSupport$Error$SupportTextGenException;

    invoke-direct {p2, p1}, Lcom/ui/wifiman/support/UiSupport$Error$SupportTextGenException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
