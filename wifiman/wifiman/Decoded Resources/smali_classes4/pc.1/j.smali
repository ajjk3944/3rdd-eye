.class public final Lpc/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpc/j$a;
    }
.end annotation


# static fields
.field public static final f:Lpc/j$a;


# instance fields
.field private final a:Landroid/location/LocationManager;

.field private final b:Lgg/z;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpc/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpc/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpc/j;->f:Lpc/j$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ltc/a;Landroid/location/LocationManager;Lcom/ui/wifiman/model/android/permissions/d;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidOsIntentreceiver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lpc/j;->a:Landroid/location/LocationManager;

    new-instance p3, Lpc/b;

    invoke-direct {p3, p1}, Lpc/b;-><init>(Landroid/content/Context;)V

    invoke-static {p3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p3

    invoke-virtual {p1, p3}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p3

    invoke-virtual {p1, p3}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string p3, "observeOn(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpc/j;->b:Lgg/z;

    invoke-interface {p4}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object p1

    sget-object p3, Lpc/j$e;->a:Lpc/j$e;

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p3, "distinctUntilChanged(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpc/j;->c:Lgg/i;

    new-instance p3, Landroid/content/IntentFilter;

    invoke-direct {p3}, Landroid/content/IntentFilter;-><init>()V

    const-string p4, "android.location.PROVIDERS_CHANGED"

    invoke-virtual {p3, p4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object p4, LYg/J;->a:LYg/J;

    invoke-interface {p2, p3}, Ltc/a;->a(Landroid/content/IntentFilter;)Lgg/i;

    move-result-object p2

    sget-object p3, Lpc/j$f;->a:Lpc/j$f;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    sget-object p3, LYg/J;->a:LYg/J;

    invoke-virtual {p2, p3}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p2

    new-instance p3, Lpc/j$g;

    invoke-direct {p3, p0}, Lpc/j$g;-><init>(Lpc/j;)V

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string p4, "refCount(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lpc/j;->d:Lgg/i;

    invoke-virtual {p0}, Lpc/j;->a()Lgg/i;

    move-result-object p2

    sget-object v0, Lpc/j$b;->a:Lpc/j$b;

    invoke-static {p2, p1, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, Lpc/j$c;

    invoke-direct {p2, p0}, Lpc/j$c;-><init>(Lpc/j;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, Lpc/j$d;->a:Lpc/j$d;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpc/j;->e:Lgg/i;

    return-void
.end method

.method public static synthetic c(Lgg/A;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lpc/j;->r(Lgg/A;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lgg/A;Landroid/location/Location;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lpc/j;->t(Lgg/A;Landroid/location/Location;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;Lgg/A;)V
    .locals 0

    invoke-static {p0, p1}, Lpc/j;->o(Landroid/content/Context;Lgg/A;)V

    return-void
.end method

.method public static synthetic f(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lpc/j;->u(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Lgg/A;Lcom/google/android/gms/location/LocationAvailability;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lpc/j;->p(Lgg/A;Lcom/google/android/gms/location/LocationAvailability;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lgg/A;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpc/j;->v(Lgg/A;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic i(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0}, Lpc/j;->s(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic j(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lpc/j;->q(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic k(Lpc/j;)Lgg/z;
    .locals 0

    iget-object p0, p0, Lpc/j;->b:Lgg/z;

    return-object p0
.end method

.method public static final synthetic l(Lpc/j;)Landroid/location/LocationManager;
    .locals 0

    iget-object p0, p0, Lpc/j;->a:Landroid/location/LocationManager;

    return-object p0
.end method

.method public static final synthetic m(Lpc/j;Landroid/location/LocationManager;)Z
    .locals 0

    invoke-direct {p0, p1}, Lpc/j;->n(Landroid/location/LocationManager;)Z

    move-result p0

    return p0
.end method

.method private final n(Landroid/location/LocationManager;)Z
    .locals 1

    const-string v0, "gps"

    invoke-virtual {p1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "network"

    invoke-virtual {p1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private static final o(Landroid/content/Context;Lgg/A;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LI3/e;->a(Landroid/content/Context;)LI3/b;

    move-result-object v0

    const-string v1, "getFusedLocationProviderClient(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lr3/e;->n()Lr3/e;

    move-result-object v1

    invoke-virtual {v1, p0}, Lr3/e;->g(Landroid/content/Context;)I

    move-result p0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_0

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    const/4 v1, 0x3

    if-eq p0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "Google play services unavailable"

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lgg/A;->c(Ljava/lang/Throwable;)Z

    :goto_0
    invoke-interface {v0}, LI3/b;->d()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    new-instance v1, Lpc/c;

    invoke-direct {v1, p1}, Lpc/c;-><init>(Lgg/A;)V

    new-instance v2, Lpc/d;

    invoke-direct {v2, v1}, Lpc/d;-><init>(Lmh/l;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    invoke-interface {v0}, LI3/b;->d()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    new-instance v1, Lpc/e;

    invoke-direct {v1, p1}, Lpc/e;-><init>(Lgg/A;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    invoke-interface {v0}, LI3/b;->c()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    const-string v0, "getLastLocation(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpc/f;

    invoke-direct {v0}, Lpc/f;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    new-instance v0, Lpc/g;

    invoke-direct {v0, p1}, Lpc/g;-><init>(Lgg/A;)V

    new-instance v1, Lpc/h;

    invoke-direct {v1, v0}, Lpc/h;-><init>(Lmh/l;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    new-instance v0, Lpc/i;

    invoke-direct {v0, p1}, Lpc/i;-><init>(Lgg/A;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final p(Lgg/A;Lcom/google/android/gms/location/LocationAvailability;)LYg/J;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationAvailability;->b()Z

    move-result p1

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Location services unavailable"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lgg/A;->c(Ljava/lang/Throwable;)Z

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final q(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final r(Lgg/A;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Location unavailable"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p0, v0}, Lgg/A;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private static final s(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private static final t(Lgg/A;Landroid/location/Location;)LYg/J;
    .locals 6

    if-eqz p1, :cond_0

    new-instance v0, LW7/c;

    new-instance v1, LW7/c$a;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, LW7/c$a;-><init>(DD)V

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LW7/c;-><init>(LW7/c$a;Ljava/lang/Double;)V

    invoke-interface {p0, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Location unavailable"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lgg/A;->c(Ljava/lang/Throwable;)Z

    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final u(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final v(Lgg/A;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lgg/A;->c(Ljava/lang/Throwable;)Z

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lpc/j;->d:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lpc/j;->e:Lgg/i;

    return-object v0
.end method
