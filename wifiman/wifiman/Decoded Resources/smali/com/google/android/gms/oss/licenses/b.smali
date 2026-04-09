.class public final Lcom/google/android/gms/oss/licenses/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/google/android/gms/oss/licenses/b;


# instance fields
.field private a:Lcom/google/android/gms/oss/licenses/j;

.field private final b:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/b;->b:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/oss/licenses/a;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/oss/licenses/a;

    invoke-direct {v2, v1, p1, v0}, Lcom/google/android/gms/oss/licenses/a;-><init>(Landroid/content/res/Resources;Ljava/lang/String;LK3/f;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to get resources for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", using local resources."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "OssLicenses"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lcom/google/android/gms/oss/licenses/a;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, v1, p0, v0}, Lcom/google/android/gms/oss/licenses/a;-><init>(Landroid/content/res/Resources;Ljava/lang/String;LK3/f;)V

    return-object p1
.end method

.method public static b(Landroid/content/Context;)Lcom/google/android/gms/oss/licenses/b;
    .locals 2

    sget-object v0, Lcom/google/android/gms/oss/licenses/b;->c:Lcom/google/android/gms/oss/licenses/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/oss/licenses/b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/oss/licenses/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/google/android/gms/oss/licenses/b;->c:Lcom/google/android/gms/oss/licenses/b;

    new-instance p0, Lcom/google/android/gms/oss/licenses/j;

    iget-object v1, v0, Lcom/google/android/gms/oss/licenses/b;->b:Landroid/content/Context;

    invoke-direct {p0, v1}, Lcom/google/android/gms/oss/licenses/j;-><init>(Landroid/content/Context;)V

    iput-object p0, v0, Lcom/google/android/gms/oss/licenses/b;->a:Lcom/google/android/gms/oss/licenses/j;

    :cond_0
    sget-object p0, Lcom/google/android/gms/oss/licenses/b;->c:Lcom/google/android/gms/oss/licenses/b;

    return-object p0
.end method

.method public static final d(Lcom/google/android/gms/oss/licenses/a;)I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/a;->a:Landroid/content/res/Resources;

    const-string v1, "layout"

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/a;->b:Ljava/lang/String;

    const-string v2, "libraries_social_licenses_license"

    invoke-virtual {v0, v2, v1, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final e(Lcom/google/android/gms/oss/licenses/a;)I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/a;->a:Landroid/content/res/Resources;

    const-string v1, "id"

    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/a;->b:Ljava/lang/String;

    const-string v2, "license"

    invoke-virtual {v0, v2, v1, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/oss/licenses/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/b;->a:Lcom/google/android/gms/oss/licenses/j;

    return-object v0
.end method
