.class public final LM8/d;
.super Lcom/ui/wifiman/ui/wifi/channel/c;
.source "SourceFile"

# interfaces
.implements LM8/K;


# static fields
.field static final synthetic E:[Lth/l;

.field public static final F:I


# instance fields
.field private final A:Lgg/i;

.field private final B:Lgg/i;

.field private final C:LLi/N;

.field private final D:LLi/N;

.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:Lgg/i;

.field private final o:LFg/a;

.field private final p:Lgg/i;

.field private final q:Lgg/i;

.field private final r:Lgg/i;

.field private final s:LLi/N;

.field private final t:LLi/N;

.field private final u:Lgg/i;

.field private final v:LLi/N;

.field private final w:Lgg/i;

.field private final x:Lgg/i;

.field private final y:Lgg/i;

.field private final z:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LM8/d;

    const-string/jumbo v2, "wifiNetworks"

    const-string/jumbo v3, "getWifiNetworks()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "deviceManager"

    const-string/jumbo v5, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "wifiSignalStats"

    const-string/jumbo v6, "getWifiSignalStats()Lcom/ui/wifiman/model/wifi/scan/timelapse/WifiSignalTimelapse$Service;"

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

    const-string/jumbo v7, "wifiChannelEnvService"

    const-string/jumbo v8, "getWifiChannelEnvService()Lcom/ui/wifiman/model/wifi/channel/WifiEnvironmentService;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "wifiNetworkDetailConfig"

    const-string/jumbo v9, "getWifiNetworkDetailConfig()Lcom/ui/wifiman/model/ui/WifiNetworkDetailHomeConfigManager;"

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

    sput-object v7, LM8/d;->E:[Lth/l;

    const/16 v0, 0x8

    sput v0, LM8/d;->F:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    const-string/jumbo v1, "di"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/ui/wifiman/ui/wifi/channel/c;-><init>()V

    iput-object v0, v7, LM8/d;->g:Lorg/kodein/di/DI;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LM8/d$v;

    invoke-direct {v1}, LM8/d$v;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lle/g;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LM8/d;->E:[Lth/l;

    const/4 v8, 0x0

    aget-object v4, v3, v8

    invoke-interface {v0, v7, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/d;->h:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LM8/d$w;

    invoke-direct {v4}, LM8/d$w;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LCc/n;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v9, 0x1

    aget-object v4, v3, v9

    invoke-interface {v0, v7, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/d;->i:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LM8/d$x;

    invoke-direct {v4}, LM8/d$x;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lne/a$a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x2

    aget-object v4, v3, v4

    invoke-interface {v0, v7, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/d;->j:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LM8/d$y;

    invoke-direct {v4}, LM8/d$y;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Li8/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x3

    aget-object v4, v3, v4

    invoke-interface {v0, v7, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/d;->k:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LM8/d$z;

    invoke-direct {v4}, LM8/d$z;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lie/f;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x4

    aget-object v4, v3, v4

    invoke-interface {v0, v7, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/d;->l:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LM8/d$A;

    invoke-direct {v4}, LM8/d$A;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lde/C;

    invoke-direct {v0, v4, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v1, 0x5

    aget-object v1, v3, v1

    invoke-interface {v0, v7, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/d;->m:LYg/m;

    sget-object v0, Lgg/a;->LATEST:Lgg/a;

    new-instance v1, LM8/d$u;

    invoke-direct {v1, v7}, LM8/d$u;-><init>(LM8/d;)V

    invoke-static {v1, v0}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v10

    const-string/jumbo v11, "refCount(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v7, LM8/d;->n:Lgg/i;

    sget-object v12, Lzf/a;->AP:Lzf/a;

    invoke-static {v12}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    const-string/jumbo v1, "createDefault(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v7, LM8/d;->o:LFg/a;

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1, v8, v9}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v13

    invoke-static {v13, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v13, v7, LM8/d;->p:Lgg/i;

    sget-object v0, LM8/d$g;->a:LM8/d$g;

    invoke-virtual {v10, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v14

    invoke-static {v14, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v14, v7, LM8/d;->q:Lgg/i;

    sget-object v0, LM8/d$i;->a:LM8/d$i;

    invoke-virtual {v10, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v15

    invoke-static {v15, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v15, v7, LM8/d;->r:Lgg/i;

    sget-object v0, LM8/d$B;->a:LM8/d$B;

    invoke-virtual {v14, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo v6, "distinctUntilChanged(...)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls9/d$c;

    const-string v0, ""

    invoke-direct {v2, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v5, 0x6

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v8, v6

    move-object/from16 v6, v16

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/d;->s:LLi/N;

    invoke-direct/range {p0 .. p0}, LM8/d;->A0()Lie/f;

    move-result-object v0

    invoke-interface {v0}, Lie/f;->a()Lgg/i;

    move-result-object v0

    invoke-direct/range {p0 .. p0}, LM8/d;->C0()Lle/g;

    move-result-object v1

    invoke-interface {v1}, Lle/g;->d()Lgg/i;

    move-result-object v1

    sget-object v2, LM8/d$h;->a:LM8/d$h;

    invoke-static {v15, v0, v1, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v1

    const-string/jumbo v0, "combineLatest(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v2

    const/4 v6, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/d;->t:LLi/N;

    sget-object v0, LM8/d$e;->a:LM8/d$e;

    invoke-virtual {v10, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-direct/range {p0 .. p0}, LM8/d;->C0()Lle/g;

    move-result-object v1

    invoke-interface {v1}, Lle/g;->a()Lgg/i;

    move-result-object v1

    sget-object v2, LM8/d$f;->a:LM8/d$f;

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v15

    invoke-static {v15, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v15, v7, LM8/d;->u:Lgg/i;

    sget-object v0, LM8/d$j;->a:LM8/d$j;

    invoke-virtual {v10, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-direct/range {p0 .. p0}, LM8/d;->C0()Lle/g;

    move-result-object v1

    invoke-interface {v1}, Lle/g;->a()Lgg/i;

    move-result-object v1

    new-instance v2, LM8/d$k;

    invoke-direct {v2, v7}, LM8/d$k;-><init>(LM8/d;)V

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LS8/c;->GHZ_2_4:LS8/c;

    const/4 v0, 0x0

    new-array v2, v0, [Lle/f;

    invoke-static {v2}, Lzi/m;->s([Ljava/lang/Object;)Lzi/j;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, LM8/K$a;->j(LM8/K;LS8/c;Lzi/j;Lmh/l;ILjava/lang/Object;)LBf/b;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v6

    move-object v6, v10

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/d;->v:LLi/N;

    sget-object v0, LM8/d$t;->a:LM8/d$t;

    invoke-static {v14, v15, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v7, LM8/d;->w:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/d;->y0()LCc/n;

    move-result-object v1

    invoke-interface {v1}, LCc/n;->a()Lgg/i;

    move-result-object v1

    invoke-direct/range {p0 .. p0}, LM8/d;->D0()Lne/a$a;

    move-result-object v2

    invoke-interface {v2}, Lge/b;->getAll()Lgg/i;

    move-result-object v2

    invoke-direct/range {p0 .. p0}, LM8/d;->B0()Lde/C;

    move-result-object v3

    invoke-interface {v3}, Lee/c;->b()Lgg/i;

    move-result-object v3

    sget-object v4, LM8/d$d;->a:LM8/d$d;

    invoke-static {v0, v1, v2, v3, v4}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v7, LM8/d;->x:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/d;->y0()LCc/n;

    move-result-object v1

    invoke-interface {v1}, LCc/n;->a()Lgg/i;

    move-result-object v1

    invoke-direct/range {p0 .. p0}, LM8/d;->D0()Lne/a$a;

    move-result-object v2

    invoke-interface {v2}, Lge/b;->getAll()Lgg/i;

    move-result-object v2

    sget-object v3, LM8/d$a;->a:LM8/d$a;

    invoke-static {v14, v0, v1, v2, v3}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v7, LM8/d;->y:Lgg/i;

    sget-object v1, LM8/d$s;->a:LM8/d$s;

    invoke-static {v14, v15, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v7, LM8/d;->z:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/d;->y0()LCc/n;

    move-result-object v2

    invoke-interface {v2}, LCc/n;->a()Lgg/i;

    move-result-object v2

    invoke-direct/range {p0 .. p0}, LM8/d;->D0()Lne/a$a;

    move-result-object v3

    invoke-interface {v3}, Lge/b;->getAll()Lgg/i;

    move-result-object v3

    invoke-direct/range {p0 .. p0}, LM8/d;->B0()Lde/C;

    move-result-object v4

    invoke-interface {v4}, Lee/c;->b()Lgg/i;

    move-result-object v4

    sget-object v5, LM8/d$b;->a:LM8/d$b;

    invoke-static {v1, v2, v3, v4, v5}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v7, LM8/d;->A:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/d;->y0()LCc/n;

    move-result-object v2

    invoke-interface {v2}, LCc/n;->a()Lgg/i;

    move-result-object v2

    invoke-direct/range {p0 .. p0}, LM8/d;->D0()Lne/a$a;

    move-result-object v3

    invoke-interface {v3}, Lge/b;->getAll()Lgg/i;

    move-result-object v3

    sget-object v4, LM8/d$c;->a:LM8/d$c;

    invoke-static {v14, v1, v2, v3, v4}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v7, LM8/d;->B:Lgg/i;

    sget-object v2, LM8/d$n;->a:LM8/d$n;

    invoke-virtual {v0, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    sget-object v2, LM8/d$o;->a:LM8/d$o;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    sget-object v2, LM8/d$p;->a:LM8/d$p;

    invoke-static {v13, v0, v1, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lzf/a;->getEntries()Lfh/a;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzf/a;

    new-instance v4, Lzf/e;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, Lzf/e;-><init>(Lzf/a;I)V

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Lzf/f;

    invoke-direct {v3, v12, v2}, Lzf/f;-><init>(Lzf/a;Ljava/util/List;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p0

    move-object v2, v3

    move v3, v4

    move-object v4, v8

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/d;->C:LLi/N;

    iget-object v0, v7, LM8/d;->p:Lgg/i;

    new-instance v1, LM8/d$l;

    invoke-direct {v1, v7}, LM8/d$l;-><init>(LM8/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, LM8/d$m;->a:LM8/d$m;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    const-string/jumbo v0, "map(...)"

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

    iput-object v0, v7, LM8/d;->D:LLi/N;

    return-void
.end method

.method private final A0()Lie/f;
    .locals 1

    iget-object v0, p0, LM8/d;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lie/f;

    return-object v0
.end method

.method private final B0()Lde/C;
    .locals 1

    iget-object v0, p0, LM8/d;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/C;

    return-object v0
.end method

.method private final C0()Lle/g;
    .locals 1

    iget-object v0, p0, LM8/d;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lle/g;

    return-object v0
.end method

.method private final D0()Lne/a$a;
    .locals 1

    iget-object v0, p0, LM8/d;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lne/a$a;

    return-object v0
.end method

.method public static final synthetic u0(LM8/d;)Lgg/i;
    .locals 0

    iget-object p0, p0, LM8/d;->y:Lgg/i;

    return-object p0
.end method

.method public static final synthetic v0(LM8/d;)Lgg/i;
    .locals 0

    iget-object p0, p0, LM8/d;->B:Lgg/i;

    return-object p0
.end method

.method public static final synthetic w0(LM8/d;)Lcom/ui/wifiman/ui/wifi/channel/b;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/wifi/channel/c;->r0()Lcom/ui/wifiman/ui/wifi/channel/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x0(LM8/d;)Li8/a;
    .locals 0

    invoke-direct {p0}, LM8/d;->z0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final y0()LCc/n;
    .locals 1

    iget-object v0, p0, LM8/d;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final z0()Li8/a;
    .locals 1

    iget-object v0, p0, LM8/d;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method


# virtual methods
.method public J(LS8/c;Lzi/j;Lmh/l;)LBf/b;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LM8/K$a;->f(LM8/K;LS8/c;Lzi/j;Lmh/l;)LBf/b;

    move-result-object p1

    return-object p1
.end method

.method public c()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/d;->s:LLi/N;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LM8/d;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/d;->t:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/d;->v:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/d;->D:LLi/N;

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

    iget-object v0, p0, LM8/d;->C:LLi/N;

    return-object v0
.end method

.method public s0(Lzf/a;)V
    .locals 1

    const-string/jumbo v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/d;->o:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public t0(Lh9/a;)V
    .locals 3

    const-string/jumbo v0, "bssid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LM8/d;->u:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LM8/d$q;

    invoke-direct {v2, p1}, LM8/d$q;-><init>(Lh9/a;)V

    invoke-virtual {v1, v2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v1, LM8/d$r;

    invoke-direct {v1, p0}, LM8/d$r;-><init>(LM8/d;)V

    invoke-virtual {p1, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
