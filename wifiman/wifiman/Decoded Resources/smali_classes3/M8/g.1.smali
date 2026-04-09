.class public final LM8/g;
.super LCf/d;
.source "SourceFile"

# interfaces
.implements LM8/K;


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

.field private final n:Lgg/i;

.field private final o:Lgg/i;

.field private final p:Lgg/i;

.field private final q:Lgg/i;

.field private final r:Lgg/i;

.field private final s:LLi/N;

.field private final t:LLi/N;

.field private final u:LLi/N;

.field private final v:LLi/N;

.field private final w:LLi/N;

.field private final x:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LM8/g;

    const-string/jumbo v2, "wifiSurvey"

    const-string/jumbo v3, "getWifiSurvey()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "screenConfig"

    const-string/jumbo v5, "getScreenConfig()Lcom/ui/wifiman/model/ui/WifiScanHomeConfigManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "deviceManager"

    const-string/jumbo v6, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "wifiSignalStats"

    const-string/jumbo v7, "getWifiSignalStats()Lcom/ui/wifiman/model/wifi/scan/timelapse/WifiSignalTimelapse$Service;"

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

    sput-object v7, LM8/g;->y:[Lth/l;

    const/16 v0, 0x8

    sput v0, LM8/g;->z:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 22

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    const-string/jumbo v1, "di"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, LCf/d;-><init>()V

    iput-object v0, v7, LM8/g;->g:Lorg/kodein/di/DI;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LM8/g$l;

    invoke-direct {v1}, LM8/g$l;-><init>()V

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

    sget-object v3, LM8/g;->y:[Lth/l;

    const/4 v8, 0x0

    aget-object v4, v3, v8

    invoke-interface {v0, v7, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/g;->h:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LM8/g$m;

    invoke-direct {v4}, LM8/g$m;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lde/F;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x1

    aget-object v5, v3, v4

    invoke-interface {v0, v7, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/g;->i:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LM8/g$n;

    invoke-direct {v5}, LM8/g$n;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LCc/n;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x2

    aget-object v5, v3, v5

    invoke-interface {v0, v7, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/g;->j:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LM8/g$o;

    invoke-direct {v5}, LM8/g$o;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lne/a$a;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x3

    aget-object v5, v3, v5

    invoke-interface {v0, v7, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/g;->k:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LM8/g$p;

    invoke-direct {v5}, LM8/g$p;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Li8/a;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x4

    aget-object v5, v3, v5

    invoke-interface {v0, v7, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/g;->l:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LM8/g$q;

    invoke-direct {v5}, LM8/g$q;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lde/C;

    invoke-direct {v0, v5, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v2, 0x5

    aget-object v2, v3, v2

    invoke-interface {v0, v7, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, LM8/g;->m:LYg/m;

    sget-object v0, Lgg/a;->LATEST:Lgg/a;

    new-instance v2, LM8/g$k;

    invoke-direct {v2, v7}, LM8/g$k;-><init>(LM8/g;)V

    invoke-static {v2, v0}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v9

    const-string/jumbo v0, "refCount(...)"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, v7, LM8/g;->n:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/g;->G0()Lle/g;

    move-result-object v2

    invoke-interface {v2}, Lle/g;->c()Lgg/i;

    move-result-object v2

    invoke-direct/range {p0 .. p0}, LM8/g;->C0()Lde/F;

    move-result-object v3

    invoke-interface {v3}, Lee/c;->b()Lgg/i;

    move-result-object v3

    new-instance v5, LM8/g$e;

    invoke-direct {v5, v7}, LM8/g$e;-><init>(LM8/g;)V

    invoke-static {v2, v3, v5}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-virtual {v2, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v2

    invoke-virtual {v2}, Ljg/a;->i2()Lgg/i;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v7, LM8/g;->o:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/g;->G0()Lle/g;

    move-result-object v2

    invoke-interface {v2}, Lle/g;->e()Lgg/i;

    move-result-object v2

    sget-object v3, LM8/g$g;->a:LM8/g$g;

    invoke-static {v9, v2, v3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v2

    new-instance v3, Ll9/a;

    invoke-direct {v3, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v7, LM8/g;->p:Lgg/i;

    invoke-direct/range {p0 .. p0}, LM8/g;->G0()Lle/g;

    move-result-object v1

    invoke-interface {v1}, Lle/g;->e()Lgg/i;

    move-result-object v1

    sget-object v2, LM8/g$b;->a:LM8/g$b;

    invoke-static {v10, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v7, LM8/g;->q:Lgg/i;

    sget-object v1, LM8/g$h;->a:LM8/g$h;

    invoke-static {v10, v11, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v13

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v13, v7, LM8/g;->r:Lgg/i;

    sget-object v0, LM8/g$s;->a:LM8/g$s;

    invoke-virtual {v9, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    const-string/jumbo v0, "map(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls9/d$c;

    const-string v0, ""

    invoke-direct {v2, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/g;->s:LLi/N;

    sget-object v0, LM8/g$f;->a:LM8/g$f;

    invoke-virtual {v11, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo v15, "distinctUntilChanged(...)"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/g;->t:LLi/N;

    sget-object v0, LM8/g$d;->a:LM8/g$d;

    invoke-virtual {v10, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v5, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/g;->u:LLi/N;

    new-instance v0, LM8/g$c;

    invoke-direct {v0, v7}, LM8/g$c;-><init>(LM8/g;)V

    invoke-static {v9, v12, v10, v0}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LS8/c;->GHZ_2_4:LS8/c;

    new-array v0, v8, [Lle/f;

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

    iput-object v0, v7, LM8/g;->v:LLi/N;

    invoke-direct/range {p0 .. p0}, LM8/g;->G0()Lle/g;

    move-result-object v0

    invoke-interface {v0}, Lle/g;->c()Lgg/i;

    move-result-object v0

    sget-object v1, LM8/g$r;->a:LM8/g$r;

    invoke-static {v10, v0, v11, v1}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LAf/B;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v18

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v2

    invoke-direct/range {v16 .. v21}, LAf/B;-><init>(LS8/c;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/g;->w:LLi/N;

    invoke-direct/range {p0 .. p0}, LM8/g;->B0()LCc/n;

    move-result-object v0

    invoke-interface {v0}, LCc/n;->a()Lgg/i;

    move-result-object v12

    invoke-direct/range {p0 .. p0}, LM8/g;->F0()Lne/a$a;

    move-result-object v0

    invoke-interface {v0}, Lge/b;->getAll()Lgg/i;

    move-result-object v0

    invoke-direct/range {p0 .. p0}, LM8/g;->E0()Lde/C;

    move-result-object v1

    invoke-interface {v1}, Lee/c;->b()Lgg/i;

    move-result-object v14

    sget-object v1, LM8/g$a;->a:LM8/g$a;

    move-object v11, v13

    move-object v13, v0

    move-object v0, v15

    move-object v15, v1

    invoke-static/range {v10 .. v15}, Lgg/i;->s(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/i;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LEe/g;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, LEe/g;-><init>(Ljava/util/List;)V

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, LM8/g;->x:LLi/N;

    return-void
.end method

.method private final B0()LCc/n;
    .locals 1

    iget-object v0, p0, LM8/g;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final C0()Lde/F;
    .locals 1

    iget-object v0, p0, LM8/g;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/F;

    return-object v0
.end method

.method private final D0()Li8/a;
    .locals 1

    iget-object v0, p0, LM8/g;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final E0()Lde/C;
    .locals 1

    iget-object v0, p0, LM8/g;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/C;

    return-object v0
.end method

.method private final F0()Lne/a$a;
    .locals 1

    iget-object v0, p0, LM8/g;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lne/a$a;

    return-object v0
.end method

.method private final G0()Lle/g;
    .locals 1

    iget-object v0, p0, LM8/g;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lle/g;

    return-object v0
.end method

.method private static final H0(LM8/g;LS8/c;Lde/E;)Lde/E;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LM8/g;->z0(LS8/c;)Lic/e;

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

.method public static synthetic w0(LM8/g;LS8/c;Lde/E;)Lde/E;
    .locals 0

    invoke-static {p0, p1, p2}, LM8/g;->H0(LM8/g;LS8/c;Lde/E;)Lde/E;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x0(LM8/g;)LCf/c;
    .locals 0

    invoke-virtual {p0}, LCf/d;->r0()LCf/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y0(LM8/g;)Li8/a;
    .locals 0

    invoke-direct {p0}, LM8/g;->D0()Li8/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A0(Lic/e;)LS8/c;
    .locals 0

    invoke-static {p0, p1}, LM8/K$a;->e(LM8/K;Lic/e;)LS8/c;

    move-result-object p1

    return-object p1
.end method

.method public J(LS8/c;Lzi/j;Lmh/l;)LBf/b;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LM8/K$a;->f(LM8/K;LS8/c;Lzi/j;Lmh/l;)LBf/b;

    move-result-object p1

    return-object p1
.end method

.method public c()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/g;->s:LLi/N;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LM8/g;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/g;->x:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/g;->v:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/g;->u:LLi/N;

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

    iget-object v0, p0, LM8/g;->t:LLi/N;

    return-object v0
.end method

.method public s0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/g;->w:LLi/N;

    return-object v0
.end method

.method public t0(Lh9/a;)V
    .locals 3

    const-string/jumbo v0, "bssid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LM8/g;->p:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LM8/g$i;

    invoke-direct {v2, p1}, LM8/g$i;-><init>(Lh9/a;)V

    invoke-virtual {v1, v2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v1, LM8/g$j;

    invoke-direct {v1, p0}, LM8/g$j;-><init>(LM8/g;)V

    invoke-virtual {p1, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public u0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LM8/g;->D0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$J$b;->a:Li8/a$b$J$b;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public v0(LS8/c;)V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LM8/g;->C0()Lde/F;

    move-result-object v1

    new-instance v2, LM8/f;

    invoke-direct {v2, p0, p1}, LM8/f;-><init>(LM8/g;LS8/c;)V

    invoke-interface {v1, v2}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public z0(LS8/c;)Lic/e;
    .locals 0

    invoke-static {p0, p1}, LM8/K$a;->d(LM8/K;LS8/c;)Lic/e;

    move-result-object p1

    return-object p1
.end method
