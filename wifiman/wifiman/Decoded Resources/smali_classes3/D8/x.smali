.class public final LD8/x;
.super LZe/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/x$a;,
        LD8/x$b;
    }
.end annotation


# static fields
.field public static final C:LD8/x$a;

.field static final synthetic D:[Lth/l;

.field public static final E:I


# instance fields
.field private final A:LLi/N;

.field private final B:LLi/N;

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

.field private final u:Lgg/i;

.field private final v:Lgg/i;

.field private final w:LLi/N;

.field private final x:LLi/N;

.field private final y:LLi/N;

.field private final z:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LD8/x;

    const-string/jumbo v2, "networkConnectionManager"

    const-string/jumbo v3, "getNetworkConnectionManager()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "wifiConnectionService"

    const-string/jumbo v5, "getWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "speedtestServerManager"

    const-string/jumbo v6, "getSpeedtestServerManager()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$ServerService;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "speedtestResultManager"

    const-string/jumbo v7, "getSpeedtestResultManager()Lcom/ui/wifiman/model/speedtest/result/SpeedtestResultManager;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "viewRouter"

    const-string/jumbo v8, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "deviceManager"

    const-string/jumbo v9, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    const-string/jumbo v9, "networkTopologyCardOperator"

    const-string/jumbo v10, "getNetworkTopologyCardOperator()Lcom/ubnt/usurvey/ui/speed/SpeedTabTopologyCardOperator;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/F;

    const-string/jumbo v10, "latencyCardOperator"

    const-string/jumbo v11, "getLatencyCardOperator()Lcom/ubnt/usurvey/ui/speed/SpeedTabLatencyCardOperator;"

    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v9

    new-instance v10, Lkotlin/jvm/internal/F;

    const-string/jumbo v11, "permissionCardOperator"

    const-string/jumbo v12, "getPermissionCardOperator()Lcom/ubnt/usurvey/ui/speed/SpeedTabPermissionCardOperator;"

    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v10

    new-instance v11, Lkotlin/jvm/internal/F;

    const-string/jumbo v12, "advancedSpeedtestAvailabilityService"

    const-string/jumbo v13, "getAdvancedSpeedtestAvailabilityService()Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestAvailabilityService;"

    invoke-direct {v11, v1, v12, v13, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v11}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v11

    new-instance v12, Lkotlin/jvm/internal/F;

    const-string/jumbo v13, "speedtestSettingsManager"

    const-string/jumbo v14, "getSpeedtestSettingsManager()Lcom/ui/wifiman/model/speedtest/settings/SpeedtestSettingsManager;"

    invoke-direct {v12, v1, v13, v14, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v12}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v12

    new-instance v13, Lkotlin/jvm/internal/F;

    const-string/jumbo v14, "speedFactorsCardOperatorWifi"

    const-string/jumbo v15, "getSpeedFactorsCardOperatorWifi()Lcom/ubnt/usurvey/ui/speed/SpeedTabSpeedFactorsCardOperator$Wifi;"

    invoke-direct {v13, v1, v14, v15, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v13}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v13

    new-instance v14, Lkotlin/jvm/internal/F;

    const-string/jumbo v15, "speedFactorsCardOperatorCellular"

    move-object/from16 v16, v13

    const-string/jumbo v13, "getSpeedFactorsCardOperatorCellular()Lcom/ubnt/usurvey/ui/speed/SpeedTabSpeedFactorsCardOperator$Cellular;"

    invoke-direct {v14, v1, v15, v13, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v14}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/16 v13, 0xd

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

    aput-object v1, v13, v2

    sput-object v13, LD8/x;->D:[Lth/l;

    new-instance v1, LD8/x$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LD8/x$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, LD8/x;->C:LD8/x$a;

    sput v0, LD8/x;->E:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 13

    const-string/jumbo v1, "di"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZe/a;-><init>()V

    iput-object p1, p0, LD8/x;->g:Lorg/kodein/di/DI;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LD8/x$o;

    invoke-direct {v1}, LD8/x$o;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LZc/f;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LD8/x;->D:[Lth/l;

    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->h:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LD8/x$p;

    invoke-direct {v4}, LD8/x$p;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lje/u;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x1

    aget-object v5, v3, v4

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->i:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$q;

    invoke-direct {v5}, LD8/x$q;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x2

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->j:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$r;

    invoke-direct {v5}, LD8/x$r;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/speedtest/result/e;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x3

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->k:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$s;

    invoke-direct {v5}, LD8/x$s;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Li8/a;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x4

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->l:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$t;

    invoke-direct {v5}, LD8/x$t;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LCc/n;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x5

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->m:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$u;

    invoke-direct {v5}, LD8/x$u;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LD8/t;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x6

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->n:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$v;

    invoke-direct {v5}, LD8/x$v;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LD8/f;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x7

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->o:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$w;

    invoke-direct {v5}, LD8/x$w;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LD8/h;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/16 v5, 0x8

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->p:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$k;

    invoke-direct {v5}, LD8/x$k;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lsd/a;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/16 v5, 0x9

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->q:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$l;

    invoke-direct {v5}, LD8/x$l;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LDd/b;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/16 v5, 0xa

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->r:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$m;

    invoke-direct {v5}, LD8/x$m;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LD8/j$b;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/16 v5, 0xb

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->s:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/x$n;

    invoke-direct {v5}, LD8/x$n;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LD8/j$a;

    invoke-direct {v0, v5, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/16 v1, 0xc

    aget-object v1, v3, v1

    invoke-interface {v0, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/x;->t:LYg/m;

    sget-object v0, LAg/c;->a:LAg/c;

    invoke-direct {p0}, LD8/x;->O0()LZc/f;

    move-result-object v1

    invoke-interface {v1}, LZc/f;->getState()Lgg/i;

    move-result-object v1

    sget-object v2, LD8/x$e;->a:LD8/x$e;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    const-string/jumbo v2, "map(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LD8/x;->X0()Lje/u;

    move-result-object v3

    invoke-interface {v3}, Lje/u;->a()Lgg/i;

    move-result-object v3

    sget-object v5, LD8/x$f;->a:LD8/x$f;

    invoke-virtual {v3, v5}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, LD8/x$g;

    invoke-direct {v1, p0}, LD8/x$g;-><init>(LD8/x;)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v9

    const-string/jumbo v0, "refCount(...)"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, p0, LD8/x;->u:Lgg/i;

    invoke-direct {p0}, LD8/x;->L0()Lsd/a;

    move-result-object v1

    invoke-interface {v1}, Lsd/a;->a()Lgg/i;

    move-result-object v1

    invoke-direct {p0}, LD8/x;->V0()LDd/b;

    move-result-object v3

    invoke-interface {v3}, Lee/c;->b()Lgg/i;

    move-result-object v3

    sget-object v5, LD8/x$c;->a:LD8/x$c;

    invoke-virtual {v3, v5}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-virtual {v3}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    sget-object v5, LD8/x$d;->a:LD8/x$d;

    invoke-static {v1, v3, v5}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, p0, LD8/x;->v:Lgg/i;

    invoke-direct {p0}, LD8/x;->P0()LD8/t;

    move-result-object v0

    invoke-interface {v0}, LD8/t;->a()Lgg/i;

    move-result-object v0

    sget-object v1, LD8/x$A;->a:LD8/x$A;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Laf/q0$b;->a:Laf/q0$b;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LD8/x;->w:LLi/N;

    invoke-direct {p0}, LD8/x;->O0()LZc/f;

    move-result-object v0

    invoke-interface {v0}, LZc/f;->getState()Lgg/i;

    move-result-object v0

    sget-object v1, LD8/x$x;->a:LD8/x$x;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v7

    invoke-direct {p0}, LD8/x;->U0()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;->d()Lgg/i;

    move-result-object v8

    invoke-direct {p0}, LD8/x;->M0()LCc/n;

    move-result-object v0

    invoke-interface {v0}, LCc/n;->b()Lgg/i;

    move-result-object v0

    sget-object v1, LD8/x$y;->a:LD8/x$y;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v10

    sget-object v12, LD8/x$z;->a:LD8/x$z;

    invoke-static/range {v7 .. v12}, Lgg/i;->s(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/i;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Laf/e0$a$b;->a:Laf/e0$a$b;

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LD8/x;->x:LLi/N;

    invoke-direct {p0}, LD8/x;->N0()LD8/f;

    move-result-object v0

    invoke-interface {v0}, LD8/f;->b()Lgg/i;

    move-result-object v1

    sget-object v2, Laf/B$b;->a:Laf/B$b;

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LD8/x;->y:LLi/N;

    invoke-direct {p0}, LD8/x;->Q0()LD8/h;

    move-result-object v0

    invoke-interface {v0}, LD8/h;->b()Lgg/i;

    move-result-object v1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LD8/x;->z:LLi/N;

    invoke-direct {p0}, LD8/x;->S0()LD8/j$b;

    move-result-object v0

    invoke-interface {v0}, LD8/j;->b()Lgg/i;

    move-result-object v1

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LD8/x;->A:LLi/N;

    invoke-direct {p0}, LD8/x;->R0()LD8/j$a;

    move-result-object v0

    invoke-interface {v0}, LD8/j;->b()Lgg/i;

    move-result-object v1

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LD8/x;->B:LLi/N;

    return-void
.end method

.method public static synthetic G0(ZLDd/a;)LDd/a;
    .locals 0

    invoke-static {p0, p1}, LD8/x;->Y0(ZLDd/a;)LDd/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H0(LD8/x;)Lsd/a;
    .locals 0

    invoke-direct {p0}, LD8/x;->L0()Lsd/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I0(LD8/x;)Lcom/ui/wifiman/model/speedtest/result/e;
    .locals 0

    invoke-direct {p0}, LD8/x;->T0()Lcom/ui/wifiman/model/speedtest/result/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic J0(LD8/x;)Li8/a;
    .locals 0

    invoke-direct {p0}, LD8/x;->W0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic K0(LD8/x;Lcom/ui/wifiman/model/speedtest/result/b;)LD8/x$b;
    .locals 0

    invoke-direct {p0, p1}, LD8/x;->Z0(Lcom/ui/wifiman/model/speedtest/result/b;)LD8/x$b;

    move-result-object p0

    return-object p0
.end method

.method private final L0()Lsd/a;
    .locals 1

    iget-object v0, p0, LD8/x;->q:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsd/a;

    return-object v0
.end method

.method private final M0()LCc/n;
    .locals 1

    iget-object v0, p0, LD8/x;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final N0()LD8/f;
    .locals 1

    iget-object v0, p0, LD8/x;->o:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD8/f;

    return-object v0
.end method

.method private final O0()LZc/f;
    .locals 1

    iget-object v0, p0, LD8/x;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/f;

    return-object v0
.end method

.method private final P0()LD8/t;
    .locals 1

    iget-object v0, p0, LD8/x;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD8/t;

    return-object v0
.end method

.method private final Q0()LD8/h;
    .locals 1

    iget-object v0, p0, LD8/x;->p:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD8/h;

    return-object v0
.end method

.method private final R0()LD8/j$a;
    .locals 1

    iget-object v0, p0, LD8/x;->t:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD8/j$a;

    return-object v0
.end method

.method private final S0()LD8/j$b;
    .locals 1

    iget-object v0, p0, LD8/x;->s:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD8/j$b;

    return-object v0
.end method

.method private final T0()Lcom/ui/wifiman/model/speedtest/result/e;
    .locals 1

    iget-object v0, p0, LD8/x;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/result/e;

    return-object v0
.end method

.method private final U0()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;
    .locals 1

    iget-object v0, p0, LD8/x;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    return-object v0
.end method

.method private final V0()LDd/b;
    .locals 1

    iget-object v0, p0, LD8/x;->r:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDd/b;

    return-object v0
.end method

.method private final W0()Li8/a;
    .locals 1

    iget-object v0, p0, LD8/x;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final X0()Lje/u;
    .locals 1

    iget-object v0, p0, LD8/x;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lje/u;

    return-object v0
.end method

.method private static final Y0(ZLDd/a;)LDd/a;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, p0, v0, v1}, LDd/a;->b(LDd/a;ZZILjava/lang/Object;)LDd/a;

    move-result-object p0

    return-object p0
.end method

.method private final Z0(Lcom/ui/wifiman/model/speedtest/result/b;)LD8/x$b;
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_2

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    move-object v6, v2

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_0

    :cond_2
    move-wide v6, v4

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    goto :goto_1

    :cond_4
    move-wide v9, v4

    :goto_1
    cmp-long v11, v6, v9

    if-lez v11, :cond_5

    move-object v2, v8

    move-wide v6, v9

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_3

    :goto_2
    check-cast v2, Lcom/ui/wifiman/model/speedtest/result/b$c;

    const-string/jumbo v1, "speedtest result without any measurement"

    if-eqz v2, :cond_18

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_6

    move-object v7, v3

    goto :goto_5

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_5

    :cond_7
    move-object v8, v7

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_3

    :cond_8
    move-wide v8, v4

    :cond_9
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v11}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v11

    if-eqz v11, :cond_a

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    goto :goto_4

    :cond_a
    move-wide v11, v4

    :goto_4
    cmp-long v13, v8, v11

    if-lez v13, :cond_b

    move-object v7, v10

    move-wide v8, v11

    :cond_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_9

    :goto_5
    check-cast v7, Lcom/ui/wifiman/model/speedtest/result/b$c;

    if-eqz v7, :cond_17

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->b()Ljava/util/ArrayList;

    move-result-object v4

    const-wide/16 v5, 0x0

    if-eqz v4, :cond_c

    invoke-static {v4}, LZg/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_6

    :cond_c
    move-wide v8, v5

    :goto_6
    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$c;->i()Ljava/util/ArrayList;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-static {v4}, LZg/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :cond_d
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    long-to-float v4, v4

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v9

    sget-object v10, Lpd/s;->INTERNET:Lpd/s;

    if-eq v9, v10, :cond_f

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v8

    sget-object v9, Lpd/s;->CONSOLE:Lpd/s;

    if-ne v8, v9, :cond_e

    :cond_f
    move-object v3, v6

    :cond_10
    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$c;

    if-nez v3, :cond_12

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$c;

    if-eqz v3, :cond_11

    goto :goto_7

    :cond_11
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_12
    :goto_7
    new-instance v1, LD8/x$b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v10

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$c;->f()Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v13

    new-instance v14, Lhf/h;

    sget-object v3, Lff/a;->DOWN:Lff/a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->b()Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_13

    invoke-direct {v0, v2, v4}, LD8/x;->a1(Ljava/util/ArrayList;F)[F

    move-result-object v2

    if-nez v2, :cond_14

    :cond_13
    sget-object v2, Laf/e0;->a:Laf/e0;

    invoke-virtual {v2}, Laf/e0;->a()Lhf/h;

    move-result-object v2

    invoke-virtual {v2}, Lhf/h;->a()[F

    move-result-object v2

    :cond_14
    invoke-direct {v14, v3, v2}, Lhf/h;-><init>(Lff/a;[F)V

    new-instance v15, Lhf/h;

    sget-object v2, Lff/a;->UP:Lff/a;

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$c;->i()Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_15

    invoke-direct {v0, v3, v4}, LD8/x;->a1(Ljava/util/ArrayList;F)[F

    move-result-object v3

    if-nez v3, :cond_16

    :cond_15
    sget-object v3, Laf/e0;->a:Laf/e0;

    invoke-virtual {v3}, Laf/e0;->b()Lhf/h;

    move-result-object v3

    invoke-virtual {v3}, Lhf/h;->a()[F

    move-result-object v3

    :cond_16
    invoke-direct {v15, v2, v3}, Lhf/h;-><init>(Lff/a;[F)V

    move-object v8, v1

    move-object/from16 v9, p1

    invoke-direct/range {v8 .. v15}, LD8/x$b;-><init>(Lcom/ui/wifiman/model/speedtest/result/b;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lhf/h;Lhf/h;)V

    return-object v1

    :cond_17
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_18
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private final a1(Ljava/util/ArrayList;F)[F
    .locals 5

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3e19999a    # 0.15f

    mul-float/2addr v0, v1

    invoke-static {v0}, Loh/b;->e(F)I

    move-result v0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v0

    new-array v2, v1, [F

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    add-int v4, v3, v0

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    div-float/2addr v4, p2

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method


# virtual methods
.method public A0(Z)V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->V0()LDd/b;

    move-result-object v1

    new-instance v2, LD8/w;

    invoke-direct {v2, p1}, LD8/w;-><init>(Z)V

    invoke-interface {v1, v2}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public B0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LD8/x;->u:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, LD8/x$h;->a:LD8/x$h;

    invoke-virtual {v1, v2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v1

    new-instance v2, LD8/x$i;

    invoke-direct {v2, p0}, LD8/x$i;-><init>(LD8/x;)V

    invoke-virtual {v1, v2}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public C0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->W0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$B$b$d;->a:Li8/a$b$B$b$d;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public D0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LD8/x;->v:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LD8/x$j;

    invoke-direct {v2, p0}, LD8/x$j;-><init>(LD8/x;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public E0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->P0()LD8/t;

    move-result-object v1

    invoke-interface {v1, p1}, LD8/t;->c(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public F0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->P0()LD8/t;

    move-result-object v1

    invoke-interface {v1, p1}, LD8/t;->b(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LD8/x;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/x;->y:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/x;->z:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/x;->B:LLi/N;

    return-object v0
.end method

.method public q0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/x;->A:LLi/N;

    return-object v0
.end method

.method public r0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/x;->x:LLi/N;

    return-object v0
.end method

.method public s0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/x;->w:LLi/N;

    return-object v0
.end method

.method public t0()V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->N0()LD8/f;

    move-result-object v1

    invoke-interface {v1}, LD8/f;->a()Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public u0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->Q0()LD8/h;

    move-result-object v1

    invoke-interface {v1, p1}, LD8/h;->a(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public v0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->W0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$B$a;->a:Li8/a$b$B$a;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public w0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->R0()LD8/j$a;

    move-result-object v1

    invoke-interface {v1, p1}, LD8/j;->a(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public x0(LS8/c;)V
    .locals 2

    const-string/jumbo v0, "band"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->S0()LD8/j$b;

    move-result-object v1

    invoke-interface {v1, p1}, LD8/j$b;->d(LS8/c;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public y0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->S0()LD8/j$b;

    move-result-object v1

    invoke-interface {v1, p1}, LD8/j;->a(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public z0()V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/x;->S0()LD8/j$b;

    move-result-object v1

    invoke-interface {v1}, LD8/j$b;->e()Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
