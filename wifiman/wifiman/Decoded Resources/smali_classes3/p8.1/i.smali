.class public final Lp8/i;
.super LLe/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp8/i$a;,
        Lp8/i$b;,
        Lp8/i$c;
    }
.end annotation


# static fields
.field public static final J:Lp8/i$a;

.field static final synthetic N:[Lth/l;

.field public static final X:I


# instance fields
.field private final A:Lgg/i;

.field private final B:Lgg/i;

.field private final C:Lgg/i;

.field private final D:Lgg/i;

.field private final E:LLi/N;

.field private final F:LLi/N;

.field private final G:LLi/N;

.field private final H:LLi/N;

.field private final I:LLi/N;

.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:LYg/m;

.field private final o:LYg/m;

.field private final p:LYg/m;

.field private final q:LYg/m;

.field private final r:LYg/m;

.field private final s:LYg/m;

.field private final t:LYg/m;

.field private final u:LYg/m;

.field private final v:Ljava/util/Comparator;

.field private final w:Ljava/util/Comparator;

.field private final x:Ljava/util/Comparator;

.field private final y:Ljava/util/Comparator;

.field private final z:Ljava/util/Comparator;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lp8/i;

    const-string/jumbo v2, "screenConfig"

    const-string/jumbo v3, "getScreenConfig()Lcom/ui/wifiman/model/ui/DiscoveryHomeConfigManager;"

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

    const-string/jumbo v5, "appScreenManager"

    const-string/jumbo v6, "getAppScreenManager()Lcom/ui/wifiman/model/android/window/AppWindowService;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "networkConnection"

    const-string/jumbo v7, "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "networkDiscovery"

    const-string/jumbo v8, "getNetworkDiscovery()Lcom/ui/wifiman/model/discovery/NetworkDiscovery;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "lanConfigManager"

    const-string/jumbo v9, "getLanConfigManager()Lcom/ui/wifiman/model/ui/DiscoveryLanListConfigManager;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    const-string/jumbo v9, "lanDiscoveryFilter"

    const-string/jumbo v10, "getLanDiscoveryFilter()Lcom/ubnt/usurvey/ui/discovery/lan/NetworkDiscoveryDeviceSearchFilter;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/F;

    const-string/jumbo v10, "bluetoothReceiver"

    const-string/jumbo v11, "getBluetoothReceiver()Lcom/ui/wifiman/model/bluetooth/BluetoothReceiver;"

    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v9

    new-instance v10, Lkotlin/jvm/internal/F;

    const-string/jumbo v11, "bluetoothScanner"

    const-string/jumbo v12, "getBluetoothScanner()Lcom/ui/wifiman/model/bluetooth/BluetoothSurveyManager;"

    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v10

    new-instance v11, Lkotlin/jvm/internal/F;

    const-string/jumbo v12, "bluetoothConfigManager"

    const-string/jumbo v13, "getBluetoothConfigManager()Lcom/ui/wifiman/model/ui/DiscoveryBluetoothListConfigManager;"

    invoke-direct {v11, v1, v12, v13, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v11}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v11

    new-instance v12, Lkotlin/jvm/internal/F;

    const-string/jumbo v13, "bluetoothDiscoveryFilter"

    const-string/jumbo v14, "getBluetoothDiscoveryFilter()Lcom/ubnt/usurvey/ui/discovery/bluetooth/BluetoothDeviceSearchFilter;"

    invoke-direct {v12, v1, v13, v14, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v12}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v12

    new-instance v13, Lkotlin/jvm/internal/F;

    const-string/jumbo v14, "permissionsService"

    const-string/jumbo v15, "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;"

    invoke-direct {v13, v1, v14, v15, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v13}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v13

    new-instance v14, Lkotlin/jvm/internal/F;

    const-string/jumbo v15, "locationService"

    move-object/from16 v16, v13

    const-string/jumbo v13, "getLocationService()Lcom/ui/wifiman/model/android/location/LocationService;"

    invoke-direct {v14, v1, v15, v13, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v14}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v13

    new-instance v14, Lkotlin/jvm/internal/F;

    const-string/jumbo v15, "deviceManager"

    move-object/from16 v17, v13

    const-string/jumbo v13, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    invoke-direct {v14, v1, v15, v13, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v14}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v13

    new-instance v14, Lkotlin/jvm/internal/D;

    const-string/jumbo v15, "discoveredDeviceStream"

    move-object/from16 v18, v13

    const-string v13, "<v#0>"

    invoke-direct {v14, v1, v15, v13, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v14}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v1

    const/16 v13, 0xf

    new-array v13, v13, [Lth/l;

    aput-object v0, v13, v4

    const/4 v0, 0x1

    aput-object v2, v13, v0

    const/4 v0, 0x2

    aput-object v3, v13, v0

    const/4 v0, 0x3

    aput-object v5, v13, v0

    const/4 v0, 0x4

    aput-object v6, v13, v0

    const/4 v0, 0x5

    aput-object v7, v13, v0

    const/4 v0, 0x6

    aput-object v8, v13, v0

    const/4 v0, 0x7

    aput-object v9, v13, v0

    const/16 v0, 0x8

    aput-object v10, v13, v0

    const/16 v2, 0x9

    aput-object v11, v13, v2

    const/16 v2, 0xa

    aput-object v12, v13, v2

    const/16 v2, 0xb

    aput-object v16, v13, v2

    const/16 v2, 0xc

    aput-object v17, v13, v2

    const/16 v2, 0xd

    aput-object v18, v13, v2

    const/16 v2, 0xe

    aput-object v1, v13, v2

    sput-object v13, Lp8/i;->N:[Lth/l;

    new-instance v1, Lp8/i$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lp8/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lp8/i;->J:Lp8/i$a;

    sput v0, Lp8/i;->X:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 14

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LLe/d;-><init>()V

    iput-object p1, p0, Lp8/i;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Lp8/i$M;

    invoke-direct {v0}, Lp8/i$M;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lde/t;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, Lp8/i;->N:[Lth/l;

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, Lp8/i$N;

    invoke-direct {v4}, Lp8/i$N;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Li8/a;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x1

    aget-object v5, v2, v4

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$O;

    invoke-direct {v5}, Lp8/i$O;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lvc/b;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x2

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$P;

    invoke-direct {v5}, Lp8/i$P;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LZc/f;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x3

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->k:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$Q;

    invoke-direct {v5}, Lp8/i$Q;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LDc/e;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x4

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->l:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$R;

    invoke-direct {v5}, Lp8/i$R;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lde/w;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x5

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->m:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$S;

    invoke-direct {v5}, Lp8/i$S;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lr8/c;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x6

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->n:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$T;

    invoke-direct {v5}, Lp8/i$T;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lwc/d;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x7

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->o:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$U;

    invoke-direct {v5}, Lp8/i$U;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lwc/h;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v5, 0x8

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->p:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$H;

    invoke-direct {v5}, Lp8/i$H;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lde/q;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v5, 0x9

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->q:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$I;

    invoke-direct {v5}, Lp8/i$I;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lq8/c;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v5, 0xa

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->r:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$J;

    invoke-direct {v5}, Lp8/i$J;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v5, 0xb

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->s:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$K;

    invoke-direct {v5}, Lp8/i$K;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lpc/a;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v5, 0xc

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->t:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lp8/i$L;

    invoke-direct {v5}, Lp8/i$L;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, LCc/n;

    invoke-direct {p1, v5, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v0, 0xd

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->u:LYg/m;

    new-instance p1, Lp8/i$B;

    invoke-direct {p1, v3}, Lp8/i$B;-><init>(Z)V

    new-instance v0, Lp8/i$C;

    invoke-direct {v0, v3}, Lp8/i$C;-><init>(Z)V

    invoke-interface {p1, v0}, Ljava/util/Comparator;->thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p1

    const-string/jumbo v0, "thenComparing(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lp8/i;->v:Ljava/util/Comparator;

    new-instance v1, Lp8/i$D;

    invoke-direct {v1, v3}, Lp8/i$D;-><init>(Z)V

    invoke-interface {v1, p1}, Ljava/util/Comparator;->thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lp8/i;->w:Ljava/util/Comparator;

    new-instance v1, Lp8/i$G;

    invoke-direct {v1, v3, v4}, Lp8/i$G;-><init>(ZZ)V

    invoke-interface {v1, p1}, Ljava/util/Comparator;->thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lp8/i;->x:Ljava/util/Comparator;

    new-instance v1, Lp8/i$E;

    invoke-direct {v1, v3}, Lp8/i$E;-><init>(Z)V

    invoke-interface {v1}, Ljava/util/Comparator;->reversed()Ljava/util/Comparator;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Comparator;->thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lp8/i;->y:Ljava/util/Comparator;

    new-instance v1, Lp8/i$F;

    invoke-direct {v1, v3}, Lp8/i$F;-><init>(Z)V

    invoke-interface {v1, p1}, Ljava/util/Comparator;->thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lp8/i;->z:Ljava/util/Comparator;

    invoke-direct {p0}, Lp8/i;->a1()Lde/t;

    move-result-object p1

    invoke-interface {p1}, Lee/c;->b()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, Lp8/i;->R0()Lwc/d;

    move-result-object v0

    invoke-interface {v0}, Lwc/d;->a()Lgg/i;

    move-result-object v0

    sget-object v1, Lp8/i$o;->a:Lp8/i$o;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, Lp8/i$p;->a:Lp8/i$p;

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lp8/i;->A:Lgg/i;

    new-instance v1, Lp8/i$d;

    invoke-direct {v1, p0}, Lp8/i$d;-><init>(Lp8/i;)V

    invoke-virtual {p1, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lp8/i;->B:Lgg/i;

    invoke-direct {p0}, Lp8/i;->Y0()LDc/e;

    move-result-object v2

    invoke-interface {v2}, LDc/e;->b()Lgg/i;

    move-result-object v5

    invoke-direct {p0}, Lp8/i;->V0()Lr8/c;

    move-result-object v2

    invoke-virtual {v2}, Lk8/m;->f()Lgg/i;

    move-result-object v6

    invoke-direct {p0}, Lp8/i;->X0()LZc/f;

    move-result-object v2

    invoke-interface {v2}, LZc/f;->getState()Lgg/i;

    move-result-object v2

    sget-object v3, Lp8/i$l;->a:Lp8/i$l;

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v7

    invoke-direct {p0}, Lp8/i;->U0()Lde/w;

    move-result-object v2

    invoke-interface {v2}, Lee/c;->b()Lgg/i;

    move-result-object v8

    invoke-direct {p0}, Lp8/i;->T0()LCc/n;

    move-result-object v2

    invoke-interface {v2}, LCc/n;->a()Lgg/i;

    move-result-object v9

    new-instance v10, Lp8/i$m;

    invoke-direct {v10, p0}, Lp8/i$m;-><init>(Lp8/i;)V

    invoke-static/range {v5 .. v10}, Lgg/i;->s(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/i;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v2

    invoke-virtual {v2}, Ljg/a;->i2()Lgg/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lp8/i;->C:Lgg/i;

    invoke-direct {p0}, Lp8/i;->R0()Lwc/d;

    move-result-object v2

    invoke-interface {v2}, Lwc/d;->a()Lgg/i;

    move-result-object v2

    sget-object v3, Lp8/i$e;->a:Lp8/i$e;

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v5

    invoke-direct {p0}, Lp8/i;->S0()Lwc/h;

    move-result-object v2

    sget-object v3, Lwc/f;->BLE_AND_CLASSIC:Lwc/f;

    invoke-interface {v2, v3}, Lwc/h;->a(Lwc/f;)Lgg/i;

    move-result-object v6

    invoke-direct {p0}, Lp8/i;->Q0()Lq8/c;

    move-result-object v2

    invoke-virtual {v2}, Lk8/m;->f()Lgg/i;

    move-result-object v7

    invoke-direct {p0}, Lp8/i;->Z0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object v2

    invoke-interface {v2}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object v2

    sget-object v3, Lp8/i$f;->a:Lp8/i$f;

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v8

    invoke-direct {p0}, Lp8/i;->Z0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object v2

    invoke-interface {v2}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object v2

    sget-object v3, Lp8/i$g;->a:Lp8/i$g;

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v9

    invoke-direct {p0}, Lp8/i;->W0()Lpc/a;

    move-result-object v2

    invoke-interface {v2}, Lpc/a;->a()Lgg/i;

    move-result-object v10

    invoke-direct {p0}, Lp8/i;->P0()Lde/q;

    move-result-object v2

    invoke-interface {v2}, Lee/c;->b()Lgg/i;

    move-result-object v11

    invoke-direct {p0}, Lp8/i;->T0()LCc/n;

    move-result-object v2

    invoke-interface {v2}, LCc/n;->a()Lgg/i;

    move-result-object v12

    new-instance v13, Lp8/i$h;

    invoke-direct {v13, p0}, Lp8/i$h;-><init>(Lp8/i;)V

    invoke-static/range {v5 .. v13}, Lgg/i;->p(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/l;)Lgg/i;

    move-result-object v2

    sget-object v3, Lp8/i$i;->a:Lp8/i$i;

    invoke-virtual {v2, v3}, Lgg/i;->X(Lkg/c;)Lgg/i;

    move-result-object v2

    sget-object v3, Lp8/i$j;->a:Lp8/i$j;

    invoke-virtual {v2, v3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v2

    invoke-virtual {v2}, Ljg/a;->i2()Lgg/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lp8/i;->D:Lgg/i;

    invoke-direct {p0}, Lp8/i;->X0()LZc/f;

    move-result-object v0

    invoke-interface {v0}, LZc/f;->getState()Lgg/i;

    move-result-object v0

    sget-object v2, Lp8/i$v;->a:Lp8/i$v;

    invoke-virtual {v0, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lb8/c;->WIFI:Lb8/c;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v2

    iput-object v2, p0, Lp8/i;->E:LLi/N;

    invoke-direct {p0}, Lp8/i;->R0()Lwc/d;

    move-result-object v2

    invoke-interface {v2}, Lwc/d;->a()Lgg/i;

    move-result-object v2

    sget-object v3, Lp8/i$V;->a:Lp8/i$V;

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    sget-object v3, Lp8/i$W;->a:Lp8/i$W;

    invoke-static {p1, v2, v3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v5

    const-string/jumbo p1, "combineLatest(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LLe/c;->LAN:LLe/c;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v9}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->F:LLi/N;

    sget-object p1, Lp8/i$n;->a:Lp8/i$n;

    invoke-virtual {v1, p1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, LLe/a$c;->a:LLe/a$c;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->G:LLi/N;

    new-instance p1, Lp8/i$k;

    invoke-direct {p1, p0}, Lp8/i$k;-><init>(Lp8/i;)V

    invoke-virtual {v1, p1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LEe/g;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-direct {v3, p1}, LEe/g;-><init>(Ljava/util/List;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->H:LLi/N;

    invoke-direct {p0}, Lp8/i;->Y0()LDc/e;

    move-result-object p1

    invoke-interface {p1}, LDc/e;->a()Lgg/i;

    move-result-object p1

    sget-object v0, Lp8/i$q;->a:Lp8/i$q;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v2, LLe/b$a;->a:LLe/b$a;

    invoke-static {v2, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    sget-object v1, Lp8/i$r;->a:Lp8/i$r;

    invoke-virtual {p1, v0, v1}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v0, Lp8/i$s;->a:Lp8/i$s;

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    const-string/jumbo p1, "switchMap(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lp8/i;->I:LLi/N;

    return-void
.end method

.method public static synthetic A0(LLe/c;Lde/s;)Lde/s;
    .locals 0

    invoke-static {p0, p1}, Lp8/i;->f1(LLe/c;Lde/s;)Lde/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B0(Lp8/i;Lp8/i$b$c;LLe/c;ZLjava/util/Comparator;Lmh/l;)LEe/g;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lp8/i;->N0(Lp8/i$b$c;LLe/c;ZLjava/util/Comparator;Lmh/l;)LEe/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C0(Lp8/i;)Lvc/b;
    .locals 0

    invoke-direct {p0}, Lp8/i;->O0()Lvc/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D0(Lp8/i;)Lq8/c;
    .locals 0

    invoke-direct {p0}, Lp8/i;->Q0()Lq8/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E0(Lp8/i;)Ljava/util/Comparator;
    .locals 0

    iget-object p0, p0, Lp8/i;->z:Ljava/util/Comparator;

    return-object p0
.end method

.method public static final synthetic F0(Lp8/i;)Ljava/util/Comparator;
    .locals 0

    iget-object p0, p0, Lp8/i;->y:Ljava/util/Comparator;

    return-object p0
.end method

.method public static final synthetic G0(Lp8/i;)Ljava/util/Comparator;
    .locals 0

    iget-object p0, p0, Lp8/i;->w:Ljava/util/Comparator;

    return-object p0
.end method

.method public static final synthetic H0(Lp8/i;)Ljava/util/Comparator;
    .locals 0

    iget-object p0, p0, Lp8/i;->x:Ljava/util/Comparator;

    return-object p0
.end method

.method public static final synthetic I0(Lp8/i;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lp8/i;->D:Lgg/i;

    return-object p0
.end method

.method public static final synthetic J0(Lp8/i;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lp8/i;->C:Lgg/i;

    return-object p0
.end method

.method public static final synthetic K0(Lp8/i;)Lr8/c;
    .locals 0

    invoke-direct {p0}, Lp8/i;->V0()Lr8/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic L0(Lp8/i;)Lcom/ui/wifiman/model/android/permissions/d;
    .locals 0

    invoke-direct {p0}, Lp8/i;->Z0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic M0(Lp8/i;)Li8/a;
    .locals 0

    invoke-direct {p0}, Lp8/i;->b1()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final N0(Lp8/i$b$c;LLe/c;ZLjava/util/Comparator;Lmh/l;)LEe/g;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lp8/i$b$c;->b()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCc/a;

    if-eqz p3, :cond_0

    invoke-interface {v2}, LCc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v3

    instance-of v4, v3, Lcom/ui/wifiman/model/vendor/d$c;

    if-eqz v4, :cond_0

    check-cast v3, Lcom/ui/wifiman/model/vendor/d$c;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/vendor/d$c;->c()Lcom/ui/wifiman/model/vendor/d$d;

    move-result-object v3

    sget-object v4, Lcom/ui/wifiman/model/vendor/d$d;->UBIQUITI:Lcom/ui/wifiman/model/vendor/d$d;

    if-ne v3, v4, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0, p4}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v1, p4}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_4

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "ubnt"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    new-instance v2, Ls9/d$b;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const v4, 0x7f1100ef

    invoke-direct {v2, v4, v3}, Ls9/d$b;-><init>(ILjava/util/List;)V

    new-instance v3, LEe/g$a$a$a$a;

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->s()Ls9/b;

    move-result-object v4

    invoke-direct {v3, v4}, LEe/g$a$a$a$a;-><init>(Ls9/b;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {p5, v6}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v5, LEe/g$a$a;

    invoke-direct {v5, p4, v2, v3, v4}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;)V

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_9

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "other"

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p4, Ls9/d$b;

    if-eqz p3, :cond_5

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_5

    const p3, 0x7f1100ee

    goto :goto_2

    :cond_5
    const p3, 0x7f1100ed

    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {p4, p3, v2}, Ls9/d$b;-><init>(ILjava/util/List;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_6

    new-instance p3, LEe/g$a$a$a$a;

    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->s()Ls9/b;

    move-result-object v0

    invoke-direct {p3, v0}, LEe/g$a$a$a$a;-><init>(Ls9/b;)V

    goto :goto_3

    :cond_6
    const/4 p3, 0x0

    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p5, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    new-instance p5, LEe/g$a$a;

    invoke-direct {p5, p2, p4, p3, v0}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;)V

    invoke-interface {p1, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    new-instance p2, LEe/g;

    invoke-direct {p2, p1}, LEe/g;-><init>(Ljava/util/List;)V

    return-object p2
.end method

.method private final O0()Lvc/b;
    .locals 1

    iget-object v0, p0, Lp8/i;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvc/b;

    return-object v0
.end method

.method private final P0()Lde/q;
    .locals 1

    iget-object v0, p0, Lp8/i;->q:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/q;

    return-object v0
.end method

.method private final Q0()Lq8/c;
    .locals 1

    iget-object v0, p0, Lp8/i;->r:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq8/c;

    return-object v0
.end method

.method private final R0()Lwc/d;
    .locals 1

    iget-object v0, p0, Lp8/i;->o:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc/d;

    return-object v0
.end method

.method private final S0()Lwc/h;
    .locals 1

    iget-object v0, p0, Lp8/i;->p:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc/h;

    return-object v0
.end method

.method private final T0()LCc/n;
    .locals 1

    iget-object v0, p0, Lp8/i;->u:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final U0()Lde/w;
    .locals 1

    iget-object v0, p0, Lp8/i;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/w;

    return-object v0
.end method

.method private final V0()Lr8/c;
    .locals 1

    iget-object v0, p0, Lp8/i;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr8/c;

    return-object v0
.end method

.method private final W0()Lpc/a;
    .locals 1

    iget-object v0, p0, Lp8/i;->t:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpc/a;

    return-object v0
.end method

.method private final X0()LZc/f;
    .locals 1

    iget-object v0, p0, Lp8/i;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/f;

    return-object v0
.end method

.method private final Y0()LDc/e;
    .locals 1

    iget-object v0, p0, Lp8/i;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDc/e;

    return-object v0
.end method

.method private final Z0()Lcom/ui/wifiman/model/android/permissions/d;
    .locals 1

    iget-object v0, p0, Lp8/i;->s:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/android/permissions/d;

    return-object v0
.end method

.method private final a1()Lde/t;
    .locals 1

    iget-object v0, p0, Lp8/i;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/t;

    return-object v0
.end method

.method private final b1()Li8/a;
    .locals 1

    iget-object v0, p0, Lp8/i;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final c1()V
    .locals 7

    sget-object v6, Lye/d;->a:Lye/d;

    new-instance v3, Lp8/g;

    invoke-direct {v3, p0}, Lp8/g;-><init>(Lp8/i;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object v0

    invoke-static {v0}, Lp8/i;->d1(Lye/d$a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v6, v0, p0}, Lye/d;->e(Lgg/i;Lye/g;)V

    return-void
.end method

.method private static final d1(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, Lp8/i;->N:[Lth/l;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private static final e1(Lp8/i;)Lgg/i;
    .locals 2

    invoke-direct {p0}, Lp8/i;->Y0()LDc/e;

    move-result-object v0

    invoke-interface {v0}, LDc/e;->a()Lgg/i;

    move-result-object v0

    sget-object v1, Lp8/i$t;->a:Lp8/i$t;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, Lp8/i$u;

    invoke-direct {v1, p0}, Lp8/i$u;-><init>(Lp8/i;)V

    invoke-virtual {v0, v1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p0

    invoke-virtual {p0}, Lgg/b;->c0()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "toFlowable(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final f1(LLe/c;Lde/s;)Lde/s;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lp8/i$c;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lfc/c;->BLUETOOTH:Lfc/c;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lfc/c;->LAN:Lfc/c;

    :goto_0
    invoke-virtual {p1, p0}, Lde/s;->a(Lfc/c;)Lde/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0(Lp8/i;)Lgg/i;
    .locals 0

    invoke-static {p0}, Lp8/i;->e1(Lp8/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lp8/i;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public l0()V
    .locals 0

    invoke-direct {p0}, Lp8/i;->c1()V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Lp8/i;->H:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, Lp8/i;->G:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, Lp8/i;->I:LLi/N;

    return-object v0
.end method

.method public q0()LLi/N;
    .locals 1

    iget-object v0, p0, Lp8/i;->E:LLi/N;

    return-object v0
.end method

.method public r0()LLi/N;
    .locals 1

    iget-object v0, p0, Lp8/i;->F:LLi/N;

    return-object v0
.end method

.method public s0(LLe/c;)V
    .locals 3

    const-string/jumbo v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lp8/i;->a1()Lde/t;

    move-result-object v1

    new-instance v2, Lp8/h;

    invoke-direct {v2, p1}, Lp8/h;-><init>(LLe/c;)V

    invoke-interface {v1, v2}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public t0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lye/d;->a:Lye/d;

    iget-object v0, p0, Lp8/i;->A:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lp8/i$w;

    invoke-direct {v1, p0}, Lp8/i$w;-><init>(Lp8/i;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public u0(Ljava/lang/String;)V
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Discovery Home - device clicked "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Lp8/i;->B:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, Lp8/i$x;

    invoke-direct {v2, p1}, Lp8/i$x;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v1, Lp8/i$y;

    invoke-direct {v1, p0}, Lp8/i$y;-><init>(Lp8/i;)V

    invoke-virtual {p1, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public v0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Lp8/i;->B:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, Lp8/i$z;

    invoke-direct {v2, p0}, Lp8/i$z;-><init>(Lp8/i;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public w0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Lp8/i;->B:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, Lp8/i$A;->a:Lp8/i$A;

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public x0()V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lp8/i;->Y0()LDc/e;

    move-result-object v1

    invoke-interface {v1}, LDc/e;->clear()Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public y0(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lp8/i;->V0()Lr8/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk8/m;->g(Ljava/lang/String;)V

    invoke-direct {p0}, Lp8/i;->Q0()Lq8/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk8/m;->g(Ljava/lang/String;)V

    return-void
.end method
