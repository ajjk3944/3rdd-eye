.class public final LM8/A;
.super LFf/e;
.source "SourceFile"

# interfaces
.implements LM8/K;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/A$a;,
        LM8/A$b;,
        LM8/A$c;
    }
.end annotation


# static fields
.field public static final I:LM8/A$a;

.field static final synthetic J:[Lth/l;

.field public static final N:I


# instance fields
.field private final A:LLi/N;

.field private final B:LLi/N;

.field private final C:LLi/N;

.field private final D:LLi/N;

.field private final E:Ljava/util/List;

.field private final F:LLi/N;

.field private final G:LLi/N;

.field private final H:LLi/N;

.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:LYg/m;

.field private final o:LFg/a;

.field private final p:LYg/m;

.field private final q:LYg/m;

.field private final r:Lgg/i;

.field private final s:Lgg/i;

.field private final t:Lgg/i;

.field private final u:Lgg/i;

.field private final v:Lgg/i;

.field private final w:Lgg/i;

.field private final x:Lgg/i;

.field private final y:LLi/N;

.field private final z:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LM8/A;

    const-string/jumbo v2, "screenConfig"

    const-string/jumbo v3, "getScreenConfig()Lcom/ui/wifiman/model/ui/WifiScanHomeConfigManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "viewRouter"

    const-string/jumbo v5, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "wifiNetworks"

    const-string/jumbo v6, "getWifiNetworks()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "locationService"

    const-string/jumbo v7, "getLocationService()Lcom/ui/wifiman/model/android/location/LocationService;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "permissionsService"

    const-string/jumbo v8, "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "wifiConnectionService"

    const-string/jumbo v9, "getWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    const-string/jumbo v9, "searchQueryFilter"

    const-string/jumbo v10, "getSearchQueryFilter()Lcom/ubnt/usurvey/ui/wifi/WifiNetworkSearchFilter;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/F;

    const-string/jumbo v10, "wifimanWizard"

    const-string/jumbo v11, "getWifimanWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;"

    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v9

    new-instance v10, Lkotlin/jvm/internal/F;

    const-string/jumbo v11, "wifiChannelEnvService"

    const-string/jumbo v12, "getWifiChannelEnvService()Lcom/ui/wifiman/model/wifi/channel/WifiEnvironmentService;"

    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/16 v10, 0x9

    new-array v10, v10, [Lth/l;

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

    aput-object v9, v10, v0

    const/16 v0, 0x8

    aput-object v1, v10, v0

    sput-object v10, LM8/A;->J:[Lth/l;

    new-instance v1, LM8/A$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LM8/A$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, LM8/A;->I:LM8/A$a;

    sput v0, LM8/A;->N:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    const-string/jumbo v1, "di"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, LFf/e;-><init>()V

    iput-object v0, v7, LM8/A;->g:Lorg/kodein/di/DI;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LM8/A$E;

    invoke-direct {v1}, LM8/A$E;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lde/F;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LM8/A;->J:[Lth/l;

    const/4 v8, 0x0

    aget-object v4, v3, v8

    invoke-interface {v0, v7, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/A;->h:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LM8/A$F;

    invoke-direct {v4}, LM8/A$F;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Li8/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x1

    aget-object v5, v3, v4

    invoke-interface {v0, v7, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/A;->i:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LM8/A$G;

    invoke-direct {v5}, LM8/A$G;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lle/g;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x2

    aget-object v5, v3, v5

    invoke-interface {v0, v7, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/A;->j:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LM8/A$H;

    invoke-direct {v5}, LM8/A$H;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lpc/a;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x3

    aget-object v5, v3, v5

    invoke-interface {v0, v7, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/A;->k:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LM8/A$I;

    invoke-direct {v5}, LM8/A$I;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x4

    aget-object v5, v3, v5

    invoke-interface {v0, v7, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/A;->l:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LM8/A$J;

    invoke-direct {v5}, LM8/A$J;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lje/u;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x5

    aget-object v5, v3, v5

    invoke-interface {v0, v7, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/A;->m:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LM8/A$K;

    invoke-direct {v5}, LM8/A$K;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LM8/t;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x6

    aget-object v5, v3, v5

    invoke-interface {v0, v7, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/A;->n:LYg/m;

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    const-string/jumbo v5, "createDefault(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v7, LM8/A;->o:LFg/a;

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, LM8/A$L;

    invoke-direct {v6}, LM8/A$L;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v10, Lcom/ui/wifiman/model/wmw/WifimanWizard;

    invoke-direct {v5, v6, v10}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v5, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v5

    const/4 v6, 0x7

    aget-object v6, v3, v6

    invoke-interface {v5, v7, v6}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v5

    iput-object v5, v7, LM8/A;->p:LYg/m;

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, LM8/A$M;

    invoke-direct {v6}, LM8/A$M;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lie/f;

    invoke-direct {v5, v6, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v5, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v1

    const/16 v2, 0x8

    aget-object v2, v3, v2

    invoke-interface {v1, v7, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v1

    iput-object v1, v7, LM8/A;->q:LYg/m;

    invoke-direct/range {p0 .. p0}, LM8/A;->e1()Lle/g;

    move-result-object v1

    invoke-interface {v1}, Lle/g;->c()Lgg/i;

    move-result-object v1

    invoke-direct/range {p0 .. p0}, LM8/A;->Y0()Lde/F;

    move-result-object v2

    invoke-interface {v2}, Lee/c;->b()Lgg/i;

    move-result-object v2

    new-instance v3, LM8/A$o;

    invoke-direct {v3, v7}, LM8/A$o;-><init>(LM8/A;)V

    invoke-static {v1, v2, v3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v6

    const-string/jumbo v1, "refCount(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v7, LM8/A;->r:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {v0, v2, v8, v4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v7, LM8/A;->s:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/A;->e1()Lle/g;

    move-result-object v0

    invoke-interface {v0}, Lle/g;->e()Lgg/i;

    move-result-object v0

    sget-object v2, LM8/A$D;->a:LM8/A$D;

    invoke-virtual {v0, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v10

    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v7, LM8/A;->t:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/A;->Y0()Lde/F;

    move-result-object v0

    invoke-interface {v0}, Lee/c;->b()Lgg/i;

    move-result-object v0

    sget-object v2, LM8/A$n;->a:LM8/A$n;

    invoke-static {v0, v5, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v7, LM8/A;->u:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/A;->e1()Lle/g;

    move-result-object v0

    invoke-interface {v0}, Lle/g;->e()Lgg/i;

    move-result-object v0

    sget-object v2, LM8/A$q;->a:LM8/A$q;

    invoke-static {v6, v0, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v7, LM8/A;->v:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/A;->e1()Lle/g;

    move-result-object v0

    invoke-interface {v0}, Lle/g;->d()Lgg/i;

    move-result-object v0

    sget-object v11, LM8/A$m;->a:LM8/A$m;

    invoke-static {v6, v0, v11}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v7, LM8/A;->w:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/A;->d1()Lje/u;

    move-result-object v0

    invoke-interface {v0}, Lje/u;->a()Lgg/i;

    move-result-object v0

    sget-object v11, LM8/A$h;->a:LM8/A$h;

    invoke-virtual {v0, v11}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v13

    invoke-direct/range {p0 .. p0}, LM8/A;->X0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object v0

    sget-object v11, LM8/A$i;->a:LM8/A$i;

    invoke-virtual {v0, v11}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v14

    invoke-direct/range {p0 .. p0}, LM8/A;->V0()Lpc/a;

    move-result-object v0

    invoke-interface {v0}, Lpc/a;->a()Lgg/i;

    move-result-object v15

    new-instance v0, LM8/A$j;

    invoke-direct {v0, v7}, LM8/A$j;-><init>(LM8/A;)V

    move-object v11, v6

    move-object v12, v3

    move-object/from16 v16, v0

    invoke-static/range {v10 .. v16}, Lgg/i;->r(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/j;)Lgg/i;

    move-result-object v0

    sget-object v10, LM8/A$k;->a:LM8/A$k;

    invoke-virtual {v0, v10}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v15

    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v15, v7, LM8/A;->x:Lgg/i;

    sget-object v0, LM8/A$l;->a:LM8/A$l;

    invoke-virtual {v15, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo v14, "distinctUntilChanged(...)"

    invoke-static {v1, v14}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, LFf/d$b;->a:LFf/d$b;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    move-object v8, v2

    move-object v2, v4

    move-object v4, v3

    move v3, v12

    move-object v12, v4

    move-object v4, v13

    move-object/from16 v16, v5

    move v5, v10

    move-object v13, v6

    move-object v6, v11

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/A;->y:LLi/N;

    sget-object v0, LM8/A$C;->a:LM8/A$C;

    invoke-virtual {v15, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v14}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v2, v9

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/A;->z:LLi/N;

    invoke-direct/range {p0 .. p0}, LM8/A;->e1()Lle/g;

    move-result-object v0

    invoke-interface {v0}, Lle/g;->c()Lgg/i;

    move-result-object v11

    invoke-direct/range {p0 .. p0}, LM8/A;->e1()Lle/g;

    move-result-object v0

    invoke-interface {v0}, Lle/g;->e()Lgg/i;

    move-result-object v0

    invoke-direct/range {p0 .. p0}, LM8/A;->Z0()LM8/t;

    move-result-object v1

    invoke-virtual {v1}, Lk8/m;->f()Lgg/i;

    move-result-object v1

    new-instance v2, LM8/A$N;

    invoke-direct {v2, v7}, LM8/A$N;-><init>(LM8/A;)V

    move-object v10, v13

    move-object v6, v12

    move-object v12, v0

    move-object v5, v13

    move-object/from16 v13, v16

    move-object v4, v14

    move-object v14, v1

    move-object v3, v15

    move-object v15, v2

    invoke-static/range {v10 .. v15}, Lgg/i;->s(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/i;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LAf/B;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v15}, LAf/B;-><init>(LS8/c;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x6

    const/4 v12, 0x0

    move-object/from16 v0, p0

    move-object v14, v3

    move v3, v12

    move-object v12, v4

    move-object v4, v13

    move-object v13, v5

    move v5, v10

    move-object v10, v6

    move-object v6, v11

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/A;->A:LLi/N;

    new-instance v0, LM8/A$d;

    invoke-direct {v0, v7}, LM8/A$d;-><init>(LM8/A;)V

    invoke-static {v8, v13, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LS8/c;->GHZ_2_4:LS8/c;

    const/4 v0, 0x0

    new-array v0, v0, [Lle/f;

    invoke-static {v0}, Lzi/m;->s([Ljava/lang/Object;)Lzi/j;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, LM8/K$a;->j(LM8/K;LS8/c;Lzi/j;Lmh/l;ILjava/lang/Object;)LBf/b;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v6

    move-object v6, v8

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/A;->B:LLi/N;

    sget-object v0, LM8/A$e;->a:LM8/A$e;

    invoke-virtual {v13, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object v2, v9

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/A;->C:LLi/N;

    invoke-direct/range {p0 .. p0}, LM8/A;->d1()Lje/u;

    move-result-object v0

    invoke-interface {v0}, Lje/u;->a()Lgg/i;

    move-result-object v0

    invoke-direct/range {p0 .. p0}, LM8/A;->e1()Lle/g;

    move-result-object v1

    invoke-interface {v1}, Lle/g;->d()Lgg/i;

    move-result-object v1

    new-instance v2, LM8/A$f;

    invoke-direct {v2, v7}, LM8/A$f;-><init>(LM8/A;)V

    invoke-static {v13, v0, v1, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/A;->D:LLi/N;

    sget-object v0, Lic/b;->NETWORKS:Lic/b;

    sget-object v1, Lic/b;->CHANNEL_HEALTH:Lic/b;

    filled-new-array {v0, v1}, [Lic/b;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v7, LM8/A;->E:Ljava/util/List;

    new-instance v2, LM8/A$p;

    invoke-direct {v2, v7}, LM8/A$p;-><init>(LM8/A;)V

    invoke-virtual {v10, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    const-string/jumbo v3, "map(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LGf/h;

    invoke-direct {v3, v0, v1}, LGf/h;-><init>(Lic/b;Ljava/util/List;)V

    const/4 v5, 0x6

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move-object v4, v8

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/A;->F:LLi/N;

    const-class v0, LM8/A$b$c;

    invoke-virtual {v14, v0}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "ofType(R::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, LM8/A;->Y0()Lde/F;

    move-result-object v1

    invoke-interface {v1}, Lee/c;->b()Lgg/i;

    move-result-object v1

    new-instance v2, LM8/A$g;

    invoke-direct {v2, v7}, LM8/A$g;-><init>(LM8/A;)V

    move-object/from16 v3, v16

    invoke-static {v0, v1, v3, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v1

    const-string/jumbo v0, "combineLatest(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LEe/g;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, LEe/g;-><init>(Ljava/util/List;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/A;->G:LLi/N;

    invoke-direct/range {p0 .. p0}, LM8/A;->f1()Lcom/ui/wifiman/model/wmw/WifimanWizard;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object v0

    sget-object v1, LM8/A$O;->a:LM8/A$O;

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LAf/H$c;->a:LAf/H$c;

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/A;->H:LLi/N;

    return-void
.end method

.method public static synthetic H0(Lic/b;Lde/E;)Lde/E;
    .locals 0

    invoke-static {p0, p1}, LM8/A;->h1(Lic/b;Lde/E;)Lde/E;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0(LM8/A;LS8/c;Lde/E;)Lde/E;
    .locals 0

    invoke-static {p0, p1, p2}, LM8/A;->i1(LM8/A;LS8/c;Lde/E;)Lde/E;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic J0(LM8/A;Lic/b;LS8/c;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1, p2}, LM8/A;->U0(Lic/b;LS8/c;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic K0(LM8/A;Lje/r$b$a;LS8/c;Lle/f;)LGf/k;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LM8/A;->W0(Lje/r$b$a;LS8/c;Lle/f;)LGf/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic L0(LM8/A;)Lcom/ui/wifiman/model/android/permissions/d;
    .locals 0

    invoke-direct {p0}, LM8/A;->X0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic M0(LM8/A;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LM8/A;->E:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic N0(LM8/A;)LM8/t;
    .locals 0

    invoke-direct {p0}, LM8/A;->Z0()LM8/t;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O0(LM8/A;)Li8/a;
    .locals 0

    invoke-direct {p0}, LM8/A;->a1()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic P0(LM8/A;Ljava/lang/String;)LYg/s;
    .locals 0

    invoke-direct {p0, p1}, LM8/A;->c1(Ljava/lang/String;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic Q0(LM8/A;LS8/e;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LM8/A;->g1(LS8/e;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic R0(LM8/A;Lle/f;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, LM8/A;->j1(Lle/f;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private final U0(Lic/b;LS8/c;)Lgg/i;
    .locals 1

    sget-object v0, LM8/A$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    invoke-direct {p0, p2}, LM8/A;->k1(LS8/c;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p2}, LM8/A;->l1(LS8/c;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final V0()Lpc/a;
    .locals 1

    iget-object v0, p0, LM8/A;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpc/a;

    return-object v0
.end method

.method private final W0(Lje/r$b$a;LS8/c;Lle/f;)LGf/k;
    .locals 16

    move-object/from16 v9, p2

    if-eqz p3, :cond_0

    invoke-static/range {p3 .. p3}, LM8/r;->n(Lle/f;)J

    move-result-wide v0

    :goto_0
    move-wide v6, v0

    goto :goto_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lje/r$b$a;->i()Lke/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lke/c;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LM8/r;->p(Ljava/lang/String;)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->b()J

    move-result-wide v0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lje/r$b$a;->i()Lke/c;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lke/c;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ls9/d$c;

    invoke-direct {v1, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :goto_2
    move-object v8, v1

    goto :goto_3

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual/range {p3 .. p3}, Lle/f;->c()Lle/i;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lle/i;->r()Lke/c;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lke/c;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v1, Ls9/d$c;

    invoke-direct {v1, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_3
    new-instance v0, Ls9/d$b;

    const v1, 0x7f1103ca

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    move-object v8, v0

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lje/r$b$a;->i()Lke/c;

    move-result-object v0

    instance-of v0, v0, Lke/c$a;

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-nez v0, :cond_5

    if-eqz p3, :cond_4

    invoke-virtual/range {p3 .. p3}, Lle/f;->c()Lle/i;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lle/i;->r()Lke/c;

    move-result-object v0

    goto :goto_4

    :cond_4
    move-object v0, v11

    :goto_4
    if-nez v0, :cond_5

    move v12, v10

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    move v12, v0

    :goto_5
    if-eqz p3, :cond_7

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-static/range {v0 .. v5}, LM8/r;->l(Lle/f;ZZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_7

    :cond_6
    :goto_6
    move-object v13, v0

    goto :goto_8

    :cond_7
    :goto_7
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    goto :goto_6

    :goto_8
    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v9, :cond_8

    invoke-virtual/range {p1 .. p1}, Lje/r$b$a;->b()LS8/c;

    move-result-object v1

    if-ne v1, v9, :cond_9

    :cond_8
    invoke-virtual/range {p1 .. p1}, Lje/r$b$a;->d()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    if-eqz p3, :cond_c

    invoke-virtual/range {p3 .. p3}, Lle/f;->a()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_c

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lle/i;

    if-eqz v9, :cond_b

    invoke-virtual {v2}, Lle/i;->f()LS8/e;

    move-result-object v3

    invoke-virtual {v3}, LS8/e;->a()LS8/c;

    move-result-object v3

    if-ne v9, v3, :cond_a

    :cond_b
    invoke-virtual {v2}, Lle/i;->f()LS8/e;

    move-result-object v2

    invoke-virtual {v2}, LS8/e;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_c
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->g0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->V0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lje/r$b$a;->h()LS8/l;

    move-result-object v0

    if-nez v0, :cond_e

    if-eqz p3, :cond_d

    invoke-virtual/range {p3 .. p3}, Lle/f;->c()Lle/i;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lle/i;->q()LS8/l;

    move-result-object v0

    goto :goto_a

    :cond_d
    move-object v0, v11

    :cond_e
    :goto_a
    const/4 v1, 0x2

    invoke-static {v0, v10, v11, v1, v11}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v10

    new-instance v11, LGf/k;

    const/4 v4, 0x1

    const/4 v15, 0x0

    move-object v0, v11

    move-wide v1, v6

    move-object v3, v8

    move v5, v12

    move-object v6, v14

    move-object v7, v13

    move-object v8, v10

    move-object/from16 v9, p2

    move-object v10, v15

    invoke-direct/range {v0 .. v10}, LGf/k;-><init>(JLs9/d;ZZLjava/util/List;Ljava/util/List;Ls9/d;LS8/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11
.end method

.method private final X0()Lcom/ui/wifiman/model/android/permissions/d;
    .locals 1

    iget-object v0, p0, LM8/A;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/android/permissions/d;

    return-object v0
.end method

.method private final Y0()Lde/F;
    .locals 1

    iget-object v0, p0, LM8/A;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/F;

    return-object v0
.end method

.method private final Z0()LM8/t;
    .locals 1

    iget-object v0, p0, LM8/A;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM8/t;

    return-object v0
.end method

.method private final a1()Li8/a;
    .locals 1

    iget-object v0, p0, LM8/A;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final b1()Lie/f;
    .locals 1

    iget-object v0, p0, LM8/A;->q:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lie/f;

    return-object v0
.end method

.method private final c1(Ljava/lang/String;)LYg/s;
    .locals 7

    const-string v0, "-"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lkotlin/text/t;->Q0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, LS8/c;->valueOf(Ljava/lang/String;)LS8/c;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v2, LYg/s;

    invoke-direct {v2, v0, p1}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    nop

    :catch_0
    :cond_1
    return-object v2
.end method

.method private final d1()Lje/u;
    .locals 1

    iget-object v0, p0, LM8/A;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lje/u;

    return-object v0
.end method

.method private final e1()Lle/g;
    .locals 1

    iget-object v0, p0, LM8/A;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lle/g;

    return-object v0
.end method

.method private final f1()Lcom/ui/wifiman/model/wmw/WifimanWizard;
    .locals 1

    iget-object v0, p0, LM8/A;->p:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/WifimanWizard;

    return-object v0
.end method

.method private final g1(LS8/e;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, LS8/e;->a()LS8/c;

    move-result-object v0

    invoke-virtual {p1}, LS8/e;->d()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static final h1(Lic/b;Lde/E;)Lde/E;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v5, p0

    invoke-static/range {v1 .. v7}, Lde/E;->b(Lde/E;Lic/e;Lic/d;Lic/c;Lic/b;ILjava/lang/Object;)Lde/E;

    move-result-object p0

    return-object p0
.end method

.method private static final i1(LM8/A;LS8/c;Lde/E;)Lde/E;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LM8/A;->S0(LS8/c;)Lic/e;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v7}, Lde/E;->b(Lde/E;Lic/e;Lic/d;Lic/c;Lic/b;ILjava/lang/Object;)Lde/E;

    move-result-object p0

    return-object p0
.end method

.method private final j1(Lle/f;)Lgg/b;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1}, Lle/f;->c()Lle/i;

    move-result-object v2

    invoke-virtual {v2}, Lle/i;->r()Lke/c;

    move-result-object v2

    invoke-virtual {v2}, Lke/c;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-direct {p0}, LM8/A;->a1()Li8/a;

    move-result-object v3

    new-instance v4, Li8/a$b$J$a;

    new-instance v5, LCf/c;

    invoke-direct {v5, v2}, LCf/c;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5}, Li8/a$b$J$a;-><init>(LCf/c;)V

    new-array v2, v1, [Li8/a$b;

    aput-object v4, v2, v0

    invoke-interface {v3, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    invoke-direct {p0}, LM8/A;->a1()Li8/a;

    move-result-object v2

    new-instance v3, Li8/a$b$K;

    new-instance v4, Lxf/d;

    invoke-virtual {p1}, Lle/f;->c()Lle/i;

    move-result-object p1

    invoke-virtual {p1}, Lle/i;->e()Lh9/a;

    move-result-object p1

    invoke-direct {v4, p1}, Lxf/d;-><init>(Lh9/a;)V

    invoke-direct {v3, v4}, Li8/a$b$K;-><init>(Lxf/d;)V

    new-array p1, v1, [Li8/a$b;

    aput-object v3, p1, v0

    invoke-interface {v2, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method private final k1(LS8/c;)Lgg/i;
    .locals 4

    invoke-direct {p0}, LM8/A;->b1()Lie/f;

    move-result-object v0

    invoke-interface {v0}, Lie/f;->a()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LM8/A;->e1()Lle/g;

    move-result-object v1

    invoke-interface {v1}, Lle/g;->c()Lgg/i;

    move-result-object v1

    iget-object v2, p0, LM8/A;->w:Lgg/i;

    new-instance v3, LM8/A$A;

    invoke-direct {v3, p1}, LM8/A$A;-><init>(LS8/c;)V

    invoke-static {v0, v1, v2, v3}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "combineLatest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final l1(LS8/c;)Lgg/i;
    .locals 3

    iget-object v0, p0, LM8/A;->v:Lgg/i;

    invoke-direct {p0}, LM8/A;->Z0()LM8/t;

    move-result-object v1

    invoke-virtual {v1}, Lk8/m;->f()Lgg/i;

    move-result-object v1

    new-instance v2, LM8/A$B;

    invoke-direct {v2, p1, p0}, LM8/A$B;-><init>(LS8/c;LM8/A;)V

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "combineLatest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public A0(Z)V
    .locals 1

    iget-object v0, p0, LM8/A;->o:LFg/a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public B0(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LM8/A;->Z0()LM8/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk8/m;->g(Ljava/lang/String;)V

    return-void
.end method

.method public C0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LM8/A;->u:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LM8/A$v;

    invoke-direct {v2, p0}, LM8/A$v;-><init>(LM8/A;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public D0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LM8/A;->e1()Lle/g;

    move-result-object v1

    invoke-interface {v1}, Lle/g;->d()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, LM8/A$w;->a:LM8/A$w;

    invoke-virtual {v1, v2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v1

    new-instance v2, LM8/A$x;

    invoke-direct {v2, p0}, LM8/A$x;-><init>(LM8/A;)V

    invoke-virtual {v1, v2}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public E0(Ljava/lang/String;)V
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LM8/A;->e1()Lle/g;

    move-result-object v1

    invoke-interface {v1}, Lle/g;->e()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LM8/A$y;

    invoke-direct {v2, p1}, LM8/A$y;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v1, LM8/A$z;

    invoke-direct {v1, p0}, LM8/A$z;-><init>(LM8/A;)V

    invoke-virtual {p1, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public F0(LS8/c;)V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LM8/A;->Y0()Lde/F;

    move-result-object v1

    new-instance v2, LM8/z;

    invoke-direct {v2, p0, p1}, LM8/z;-><init>(LM8/A;LS8/c;)V

    invoke-interface {v1, v2}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public G0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LM8/A;->a1()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$L$a;->a:Li8/a$b$L$a;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public J(LS8/c;Lzi/j;Lmh/l;)LBf/b;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LM8/K$a;->f(LM8/K;LS8/c;Lzi/j;Lmh/l;)LBf/b;

    move-result-object p1

    return-object p1
.end method

.method public S0(LS8/c;)Lic/e;
    .locals 0

    invoke-static {p0, p1}, LM8/K$a;->d(LM8/K;LS8/c;)Lic/e;

    move-result-object p1

    return-object p1
.end method

.method public T0(Lic/e;)LS8/c;
    .locals 0

    invoke-static {p0, p1}, LM8/K$a;->e(LM8/K;Lic/e;)LS8/c;

    move-result-object p1

    return-object p1
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LM8/A;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/A;->B:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/A;->C:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/A;->D:LLi/N;

    return-object v0
.end method

.method public q(LS8/c;Lzi/j;Lmh/l;)LBf/b;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LM8/K$a;->i(LM8/K;LS8/c;Lzi/j;Lmh/l;)LBf/b;

    move-result-object p1

    return-object p1
.end method

.method public q0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/A;->G:LLi/N;

    return-object v0
.end method

.method public r0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/A;->y:LLi/N;

    return-object v0
.end method

.method public s0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/A;->F:LLi/N;

    return-object v0
.end method

.method public t0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/A;->z:LLi/N;

    return-object v0
.end method

.method public u0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/A;->A:LLi/N;

    return-object v0
.end method

.method public v0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/A;->H:LLi/N;

    return-object v0
.end method

.method public w0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    new-instance v1, LM8/A$r;

    invoke-direct {v1, p0, p1}, LM8/A$r;-><init>(LM8/A;Ljava/lang/String;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LM8/A$s;

    invoke-direct {v1, p0}, LM8/A$s;-><init>(LM8/A;)V

    invoke-virtual {p1, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public x0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LM8/A;->x:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LM8/A$t;

    invoke-direct {v2, p0}, LM8/A$t;-><init>(LM8/A;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public y0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LM8/A;->x:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, LM8/A$u;->a:LM8/A$u;

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public z0(Lic/b;)V
    .locals 3

    const-string/jumbo v0, "feature"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LM8/A;->Y0()Lde/F;

    move-result-object v1

    new-instance v2, LM8/y;

    invoke-direct {v2, p1}, LM8/y;-><init>(Lic/b;)V

    invoke-interface {v1, v2}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
