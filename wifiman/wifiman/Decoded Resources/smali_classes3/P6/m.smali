.class public LP6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/ContentResolver;

.field private final b:Landroid/location/LocationManager;


# direct methods
.method constructor <init>(Landroid/content/ContentResolver;Landroid/location/LocationManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/m;->a:Landroid/content/ContentResolver;

    iput-object p2, p0, LP6/m;->b:Landroid/location/LocationManager;

    return-void
.end method

.method private b()Z
    .locals 2

    iget-object v0, p0, LP6/m;->b:Landroid/location/LocationManager;

    const-string/jumbo v1, "network"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LP6/m;->b:Landroid/location/LocationManager;

    const-string/jumbo v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private c()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LP6/m;->a:Landroid/content/ContentResolver;

    const-string/jumbo v2, "location_mode"

    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :catch_0
    move-exception v1

    const-string v2, "Could not use LOCATION_MODE check. Falling back to a legacy/heuristic function."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, LI6/q;->r(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, LP6/m;->b()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LP6/m;->b:Landroid/location/LocationManager;

    invoke-static {v0}, LP6/l;->a(Landroid/location/LocationManager;)Z

    move-result v0

    return v0

    :cond_0
    invoke-direct {p0}, LP6/m;->c()Z

    move-result v0

    return v0
.end method
