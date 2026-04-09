.class public final Lx8/a;
.super Lcom/ui/wifiman/ui/signal/m;
.source "SourceFile"


# static fields
.field static final synthetic y:[Lth/l;

.field public static final z:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:LYg/m;

.field private final o:LYg/m;

.field private final p:Landroid/icu/text/DateFormat;

.field private final q:Landroid/icu/text/DateFormat;

.field private final r:Lgg/i;

.field private final s:Lgg/i;

.field private final t:Lgg/i;

.field private final u:Lgg/i;

.field private final v:Lgg/i;

.field private final w:Lgg/i;

.field private final x:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lx8/a;

    const-string/jumbo v2, "viewRouter"

    const-string/jumbo v3, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "analytics"

    const-string/jumbo v5, "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "wifiConnectionService"

    const-string/jumbo v6, "getWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "permissionsService"

    const-string/jumbo v7, "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "locationService"

    const-string/jumbo v8, "getLocationService()Lcom/ui/wifiman/model/android/location/LocationService;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "packageManager"

    const-string/jumbo v9, "getPackageManager()Landroid/content/pm/PackageManager;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    const-string/jumbo v9, "floorplanRecordManager"

    const-string/jumbo v10, "getFloorplanRecordManager()Lcom/ui/wifiman/model/signalmapper/floorplan/FloorplanRecordManager;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/F;

    const-string/jumbo v10, "floorplanViewControllerManager"

    const-string/jumbo v11, "getFloorplanViewControllerManager()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;"

    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/16 v9, 0x8

    new-array v10, v9, [Lth/l;

    aput-object v0, v10, v4

    const/4 v0, 0x1

    aput-object v2, v10, v0

    const/4 v0, 0x2

    aput-object v3, v10, v0

    const/4 v0, 0x3

    aput-object v5, v10, v0

    const/4 v0, 0x4

    aput-object v6, v10, v0

    const/4 v0, 0x5

    aput-object v7, v10, v0

    const/4 v0, 0x6

    aput-object v8, v10, v0

    const/4 v0, 0x7

    aput-object v1, v10, v0

    sput-object v10, Lx8/a;->y:[Lth/l;

    sput v9, Lx8/a;->z:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 12

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/signal/m;-><init>()V

    iput-object p1, p0, Lx8/a;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Lx8/a$j;

    invoke-direct {v0}, Lx8/a$j;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Li8/a;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, Lx8/a;->y:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Lx8/a$k;

    invoke-direct {v3}, Lx8/a$k;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LP7/a;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, Lx8/a$l;

    invoke-direct {v4}, Lx8/a$l;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lje/u;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x2

    aget-object v5, v2, v4

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lx8/a$m;

    invoke-direct {v5}, Lx8/a$m;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x3

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->k:LYg/m;

    invoke-virtual {p0}, Lx8/a;->d()Lorg/kodein/di/DI;

    move-result-object p1

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lx8/a$n;

    invoke-direct {v6}, Lx8/a$n;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lpc/a;

    invoke-direct {v5, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v5, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x4

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->l:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lx8/a$o;

    invoke-direct {v5}, Lx8/a$o;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Landroid/content/pm/PackageManager;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x5

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->m:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lx8/a$p;

    invoke-direct {v5}, Lx8/a$p;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lod/b;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x6

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->n:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lx8/a$q;

    invoke-direct {v5}, Lx8/a$q;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x7

    aget-object v2, v2, v5

    invoke-interface {p1, p0, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->o:LYg/m;

    invoke-static {v4}, Landroid/icu/text/DateFormat;->getDateInstance(I)Landroid/icu/text/DateFormat;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->p:Landroid/icu/text/DateFormat;

    const-string/jumbo p1, "jm"

    invoke-static {p1}, Landroid/icu/text/DateFormat;->getPatternInstance(Ljava/lang/String;)Landroid/icu/text/DateFormat;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->q:Landroid/icu/text/DateFormat;

    sget-object v4, Le7/b;->Companion:Le7/b$a;

    invoke-virtual {p0}, Lx8/a;->d()Lorg/kodein/di/DI;

    move-result-object p1

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v5, Lx8/a$r;

    invoke-direct {v5}, Lx8/a$r;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Landroid/content/Context;

    invoke-direct {v2, v5, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, v2, v0}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Landroid/content/Context;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v9}, Le7/b$a;->c(Le7/b$a;Landroid/content/Context;JILjava/lang/Object;)Lgg/i;

    move-result-object p1

    sget-object v1, Lx8/a$a;->a:Lx8/a$a;

    invoke-virtual {p1, v1}, Lgg/i;->R1(Lkg/p;)Lgg/i;

    move-result-object p1

    const-string/jumbo v1, "takeUntil(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0, v3, v0}, Lfe/h;->e(Lgg/i;Lmh/l;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object v4

    const-string/jumbo p1, "refCount(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, p0, Lx8/a;->r:Lgg/i;

    new-instance v0, Lx8/a$s;

    invoke-direct {v0, p0}, Lx8/a$s;-><init>(Lx8/a;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lgg/z;->W()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, p0, Lx8/a;->s:Lgg/i;

    invoke-direct {p0}, Lx8/a;->J0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object v0

    sget-object v1, Lx8/a$b;->a:Lx8/a$b;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, p0, Lx8/a;->t:Lgg/i;

    invoke-direct {p0}, Lx8/a;->J0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object v0

    sget-object v1, Lx8/a$d;->a:Lx8/a$d;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v7

    invoke-static {v7, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, p0, Lx8/a;->u:Lgg/i;

    invoke-direct {p0}, Lx8/a;->L0()Lje/u;

    move-result-object v0

    invoke-interface {v0}, Lje/u;->a()Lgg/i;

    move-result-object v0

    sget-object v1, Lx8/a$t;->a:Lx8/a$t;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v9

    invoke-static {v9, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, p0, Lx8/a;->v:Lgg/i;

    invoke-direct {p0}, Lx8/a;->H0()Lpc/a;

    move-result-object v0

    invoke-interface {v0}, Lpc/a;->a()Lgg/i;

    move-result-object v8

    invoke-direct {p0}, Lx8/a;->F0()Lod/b;

    move-result-object v0

    invoke-interface {v0}, Lod/b;->c()Lgg/i;

    move-result-object v10

    new-instance v11, Lx8/a$c;

    invoke-direct {v11, p0}, Lx8/a$c;-><init>(Lx8/a;)V

    invoke-static/range {v4 .. v11}, Lgg/i;->q(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/k;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lx8/a;->w:Lgg/i;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v4

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v5

    new-instance p1, Lcom/ui/wifiman/ui/signal/l$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x1

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/ui/wifiman/ui/signal/l$a;-><init>(Ljava/util/List;Ljava/util/List;ZZZ)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lx8/a;->x:LLi/N;

    return-void
.end method

.method public static final synthetic A0(Lx8/a;)Li8/a;
    .locals 0

    invoke-direct {p0}, Lx8/a;->K0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B0(Lx8/a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lx8/a;->M0(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C0(Lx8/a;)Lgg/b;
    .locals 0

    invoke-direct {p0}, Lx8/a;->N0()Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D0(Lx8/a;Lcom/ui/wifiman/ui/signal/l$b$b;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lx8/a;->O0(Lcom/ui/wifiman/ui/signal/l$b$b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private final E0()LP7/a;
    .locals 1

    iget-object v0, p0, Lx8/a;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP7/a;

    return-object v0
.end method

.method private final F0()Lod/b;
    .locals 1

    iget-object v0, p0, Lx8/a;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod/b;

    return-object v0
.end method

.method private final G0()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;
    .locals 1

    iget-object v0, p0, Lx8/a;->o:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    return-object v0
.end method

.method private final H0()Lpc/a;
    .locals 1

    iget-object v0, p0, Lx8/a;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpc/a;

    return-object v0
.end method

.method private final I0()Landroid/content/pm/PackageManager;
    .locals 1

    iget-object v0, p0, Lx8/a;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageManager;

    return-object v0
.end method

.method private final J0()Lcom/ui/wifiman/model/android/permissions/d;
    .locals 1

    iget-object v0, p0, Lx8/a;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/android/permissions/d;

    return-object v0
.end method

.method private final K0()Li8/a;
    .locals 1

    iget-object v0, p0, Lx8/a;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final L0()Lje/u;
    .locals 1

    iget-object v0, p0, Lx8/a;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lje/u;

    return-object v0
.end method

.method private final M0(Ljava/util/List;)Ljava/util/List;
    .locals 11

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lod/a;

    invoke-virtual {v1}, Lod/a;->a()J

    move-result-wide v3

    new-instance v5, Ls9/d$c;

    invoke-virtual {v1}, Lod/a;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-direct {v5, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lod/a;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v6, Ls9/d$c;

    invoke-direct {v6, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    move-object v6, v2

    :goto_1
    new-instance v7, Ls9/d$a;

    invoke-virtual {v1}, Lod/a;->d()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    new-instance v8, Lx8/a$e;

    invoke-direct {v8, p0, v1}, Lx8/a$e;-><init>(Lx8/a;Lod/a;)V

    invoke-direct {v7, v2, v8}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    new-instance v8, Ls9/d$a;

    invoke-virtual {v1}, Lod/a;->d()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    new-instance v9, Lx8/a$f;

    invoke-direct {v9, p0, v1}, Lx8/a$f;-><init>(Lx8/a;Lod/a;)V

    invoke-direct {v8, v2, v9}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    new-instance v1, LTe/p;

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LTe/p;-><init>(JLs9/d;Ls9/d;Ls9/d;Ls9/d;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private final N0()Lgg/b;
    .locals 2

    invoke-direct {p0}, Lx8/a;->L0()Lje/u;

    move-result-object v0

    invoke-interface {v0}, Lje/u;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lx8/a$i;

    invoke-direct {v1, p0}, Lx8/a$i;-><init>(Lx8/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final O0(Lcom/ui/wifiman/ui/signal/l$b$b;)Lgg/b;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    instance-of v2, p1, Lcom/ui/wifiman/ui/signal/l$b$b$d$a;

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lx8/a;->K0()Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$D$g;->a:Li8/a$b$D$g;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v2, p1, Lcom/ui/wifiman/ui/signal/l$b$b$b;

    if-eqz v2, :cond_1

    invoke-direct {p0}, Lx8/a;->J0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->CAMERA:Lcom/ui/wifiman/model/android/permissions/a;

    filled-new-array {v0}, [Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/android/permissions/d;->a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v2, p1, Lcom/ui/wifiman/ui/signal/l$b$b$d$c;

    if-eqz v2, :cond_2

    invoke-direct {p0}, Lx8/a;->K0()Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/l;->a:Li8/l;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v2, p1, Lcom/ui/wifiman/ui/signal/l$b$b$d$b;

    if-eqz v2, :cond_3

    invoke-direct {p0}, Lx8/a;->K0()Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/m;->a:Li8/m;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of v2, p1, Lcom/ui/wifiman/ui/signal/l$b$b$a;

    if-eqz v2, :cond_4

    invoke-direct {p0}, Lx8/a;->K0()Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$d$a;->a:Li8/a$b$d$a;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_4
    instance-of v2, p1, Lcom/ui/wifiman/ui/signal/l$b$b$c;

    if-eqz v2, :cond_5

    invoke-direct {p0}, Lx8/a;->K0()Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$d$b;->a:Li8/a$b$d$b;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_5
    instance-of p1, p1, Lcom/ui/wifiman/ui/signal/l$b$b$e;

    if-eqz p1, :cond_6

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "complete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static final synthetic v0(Lx8/a;)LP7/a;
    .locals 0

    invoke-direct {p0}, Lx8/a;->E0()LP7/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(Lx8/a;)Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;
    .locals 0

    invoke-direct {p0}, Lx8/a;->G0()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x0(Lx8/a;)Landroid/content/pm/PackageManager;
    .locals 0

    invoke-direct {p0}, Lx8/a;->I0()Landroid/content/pm/PackageManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y0(Lx8/a;)Landroid/icu/text/DateFormat;
    .locals 0

    iget-object p0, p0, Lx8/a;->p:Landroid/icu/text/DateFormat;

    return-object p0
.end method

.method public static final synthetic z0(Lx8/a;)Landroid/icu/text/DateFormat;
    .locals 0

    iget-object p0, p0, Lx8/a;->q:Landroid/icu/text/DateFormat;

    return-object p0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lx8/a;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Lx8/a;->x:LLi/N;

    return-object v0
.end method

.method public o0(JLdh/e;)Ljava/lang/Object;
    .locals 2

    sget-object v0, LA8/d;->a:LA8/d;

    invoke-direct {p0}, Lx8/a;->G0()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1, p3}, LA8/d;->a(JLcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public p0()V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lx8/a;->N0()Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public q0(J)V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lx8/a;->K0()Li8/a;

    move-result-object v1

    new-instance v2, Li8/a$b$k$a;

    invoke-direct {v2, p1, p2}, Li8/a$b$k$a;-><init>(J)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 p2, 0x0

    aput-object v2, p1, p2

    invoke-interface {v1, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public r0(J)V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lx8/a;->K0()Li8/a;

    move-result-object v1

    new-instance v2, Li8/a$b$k$b;

    invoke-direct {v2, p1, p2}, Li8/a$b$k$b;-><init>(J)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 p2, 0x0

    aput-object v2, p1, p2

    invoke-interface {v1, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public s0(Lcom/ui/wifiman/ui/signal/l$b$b;)V
    .locals 1

    const-string/jumbo v0, "requirement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0, p1}, Lx8/a;->O0(Lcom/ui/wifiman/ui/signal/l$b$b;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public t0(J)V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v0

    new-instance v3, Lx8/a$g;

    const/4 v1, 0x0

    invoke-direct {v3, p1, p2, p0, v1}, Lx8/a$g;-><init>(JLx8/a;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public u0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Lx8/a;->w:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, Lx8/a$h;

    invoke-direct {v2, p0}, Lx8/a$h;-><init>(Lx8/a;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
