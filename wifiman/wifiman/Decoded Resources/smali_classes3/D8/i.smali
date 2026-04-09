.class public final LD8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;


# static fields
.field static final synthetic i:[Lth/l;

.field public static final j:I


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;

.field private final c:LYg/m;

.field private final d:LYg/m;

.field private final e:LYg/m;

.field private final f:LYg/m;

.field private final g:Lgg/i;

.field private final h:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LD8/i;

    const-string/jumbo v2, "permissionsService"

    const-string/jumbo v3, "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "locationService"

    const-string/jumbo v5, "getLocationService()Lcom/ui/wifiman/model/android/location/LocationService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "cellularSignalService"

    const-string/jumbo v6, "getCellularSignalService()Lcom/ui/wifiman/model/cellular/CellularSignalService;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "viewRouter"

    const-string/jumbo v7, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "topologyService"

    const-string/jumbo v8, "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "networkApiServiceAvailableService"

    const-string/jumbo v9, "getNetworkApiServiceAvailableService()Lcom/ui/wifiman/model/ubiquiti/unifi/network/wifiman/NetworkApiServiceAvailableService;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v7, 0x6

    new-array v7, v7, [Lth/l;

    aput-object v0, v7, v4

    const/4 v0, 0x1

    aput-object v2, v7, v0

    const/4 v0, 0x2

    aput-object v3, v7, v0

    const/4 v0, 0x3

    aput-object v5, v7, v0

    const/4 v0, 0x4

    aput-object v6, v7, v0

    const/4 v0, 0x5

    aput-object v1, v7, v0

    sput-object v7, LD8/i;->i:[Lth/l;

    const/16 v0, 0x8

    sput v0, LD8/i;->j:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 12

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LD8/i$d;

    invoke-direct {v1}, LD8/i$d;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LD8/i;->i:[Lth/l;

    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/i;->a:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LD8/i$e;

    invoke-direct {v4}, LD8/i$e;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lpc/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x1

    aget-object v5, v3, v4

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/i;->b:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/i$f;

    invoke-direct {v5}, LD8/i$f;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LBc/a;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x2

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/i;->c:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/i$g;

    invoke-direct {v5}, LD8/i$g;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Li8/a;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x3

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/i;->d:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/i$h;

    invoke-direct {v5}, LD8/i$h;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Ljd/b;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x4

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/i;->e:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/i$i;

    invoke-direct {v5}, LD8/i$i;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lbe/a;

    invoke-direct {v0, v5, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x5

    aget-object v0, v3, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/i;->f:LYg/m;

    invoke-direct {p0}, LD8/i;->e()LBc/a;

    move-result-object p1

    invoke-interface {p1}, LBc/a;->e()Lgg/i;

    move-result-object v5

    invoke-direct {p0}, LD8/i;->e()LBc/a;

    move-result-object p1

    invoke-interface {p1}, LBc/a;->d()Lgg/i;

    move-result-object v6

    invoke-direct {p0}, LD8/i;->i()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object p1

    sget-object v0, LD8/i$j;->a:LD8/i$j;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v7

    invoke-direct {p0}, LD8/i;->g()Lpc/a;

    move-result-object p1

    invoke-interface {p1}, Lpc/a;->a()Lgg/i;

    move-result-object v8

    invoke-direct {p0}, LD8/i;->j()Ljd/b;

    move-result-object p1

    invoke-interface {p1}, Ljd/b;->d()Lgg/i;

    move-result-object v9

    invoke-direct {p0}, LD8/i;->h()Lbe/a;

    move-result-object p1

    invoke-interface {p1}, Lbe/a;->a()Lgg/i;

    move-result-object v10

    sget-object v11, LD8/i$k;->a:LD8/i$k;

    invoke-static/range {v5 .. v11}, Lgg/i;->r(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/j;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/i;->g:Lgg/i;

    sget-object v1, LD8/i$a;->a:LD8/i$a;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/i;->h:Lgg/i;

    return-void
.end method

.method public static final synthetic c(LD8/i;Laf/J;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LD8/i;->f(Laf/J;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LD8/i;)Li8/a;
    .locals 0

    invoke-direct {p0}, LD8/i;->k()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final e()LBc/a;
    .locals 1

    iget-object v0, p0, LD8/i;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBc/a;

    return-object v0
.end method

.method private final f(Laf/J;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final g()Lpc/a;
    .locals 1

    iget-object v0, p0, LD8/i;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpc/a;

    return-object v0
.end method

.method private final h()Lbe/a;
    .locals 1

    iget-object v0, p0, LD8/i;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbe/a;

    return-object v0
.end method

.method private final i()Lcom/ui/wifiman/model/android/permissions/d;
    .locals 1

    iget-object v0, p0, LD8/i;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/android/permissions/d;

    return-object v0
.end method

.method private final j()Ljd/b;
    .locals 1

    iget-object v0, p0, LD8/i;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd/b;

    return-object v0
.end method

.method private final k()Li8/a;
    .locals 1

    iget-object v0, p0, LD8/i;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD8/i$b;

    invoke-direct {v0, p0, p1}, LD8/i$b;-><init>(LD8/i;Ljava/lang/String;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD8/i$c;

    invoke-direct {v0, p0}, LD8/i$c;-><init>(LD8/i;)V

    invoke-virtual {p1, v0}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LD8/i;->h:Lgg/i;

    return-object v0
.end method
