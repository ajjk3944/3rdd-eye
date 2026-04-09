.class public final Lz8/c;
.super Lcom/ui/wifiman/ui/signal/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz8/c$a;
    }
.end annotation


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

.field private final m:LFg/a;

.field private final n:Lgg/i;

.field private final o:Lgg/i;

.field private final p:Ljava/util/Set;

.field private final q:Lgg/i;

.field private final r:Lgg/i;

.field private final s:Lgg/i;

.field private final t:Lgg/i;

.field private final u:LLi/N;

.field private final v:LLi/N;

.field private final w:LLi/N;

.field private final x:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lz8/c;

    const-string/jumbo v2, "wizardApComparison"

    const-string/jumbo v3, "getWizardApComparison()Lcom/ui/wifiman/model/wmw/compare/WifimanWizardApComparison;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "wifimanWizard"

    const-string/jumbo v5, "getWifimanWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "viewRouter"

    const-string/jumbo v6, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "deviceManager"

    const-string/jumbo v7, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "wifiScan"

    const-string/jumbo v8, "getWifiScan()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/D;

    const-string/jumbo v8, "inForegroundStream"

    const-string v9, "<v#0>"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

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

    sput-object v7, Lz8/c;->y:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lz8/c;->z:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 18

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    const-string/jumbo v1, "di"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/ui/wifiman/ui/signal/g;-><init>()V

    iput-object v0, v7, Lz8/c;->g:Lorg/kodein/di/DI;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lz8/c$v;

    invoke-direct {v1}, Lz8/c$v;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lre/a;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v8, 0x0

    invoke-static {v7, v0, v8}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v1, Lz8/c;->y:[Lth/l;

    const/4 v9, 0x0

    aget-object v3, v1, v9

    invoke-interface {v0, v7, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, Lz8/c;->h:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v3, Lz8/c$w;

    invoke-direct {v3}, Lz8/c$w;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/wmw/WifimanWizard;

    invoke-direct {v0, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v8}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v3, 0x1

    aget-object v4, v1, v3

    invoke-interface {v0, v7, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, Lz8/c;->i:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lz8/c$x;

    invoke-direct {v4}, Lz8/c$x;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Li8/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v8}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x2

    aget-object v4, v1, v4

    invoke-interface {v0, v7, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, Lz8/c;->j:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lz8/c$y;

    invoke-direct {v4}, Lz8/c$y;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LCc/n;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v8}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x3

    aget-object v4, v1, v4

    invoke-interface {v0, v7, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, Lz8/c;->k:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lz8/c$z;

    invoke-direct {v4}, Lz8/c$z;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lle/g;

    invoke-direct {v0, v4, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v7, v0, v8}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v0, v7, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, v7, Lz8/c;->l:LYg/m;

    new-instance v0, Ll9/a;

    invoke-direct {v0, v8}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    const-string/jumbo v1, "createDefault(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v7, Lz8/c;->m:LFg/a;

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1, v9, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v14

    const-string/jumbo v0, "refCount(...)"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v14, v7, Lz8/c;->n:Lgg/i;

    invoke-direct/range {p0 .. p0}, Lz8/c;->M0()Lre/a;

    move-result-object v1

    invoke-interface {v1}, Lre/a;->getState()Lgg/i;

    move-result-object v1

    sget-object v2, Lz8/c$j;->a:Lz8/c$j;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v7, Lz8/c;->o:Lgg/i;

    sget-object v1, LS8/c;->GHZ_2_4:LS8/c;

    sget-object v2, LS8/c;->GHZ_5:LS8/c;

    filled-new-array {v1, v2}, [LS8/c;

    move-result-object v1

    invoke-static {v1}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    iput-object v11, v7, Lz8/c;->p:Ljava/util/Set;

    invoke-static {v10}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object v1

    sget-object v2, Lz8/c$t;->a:Lz8/c$t;

    invoke-virtual {v1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    sget-object v2, Lz8/c$u;->a:Lz8/c$u;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v7, Lz8/c;->q:Lgg/i;

    sget-object v1, Lz8/c$s;->a:Lz8/c$s;

    invoke-virtual {v12, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v15

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v15, v7, Lz8/c;->r:Lgg/i;

    invoke-direct/range {p0 .. p0}, Lz8/c;->K0()Lle/g;

    move-result-object v1

    invoke-interface {v1}, Lle/g;->a()Lgg/i;

    move-result-object v1

    sget-object v2, Lz8/c$B;->a:Lz8/c$B;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v13

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v13, v7, Lz8/c;->s:Lgg/i;

    invoke-static {v10}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object v1

    sget-object v2, Lz8/c$b;->a:Lz8/c$b;

    invoke-virtual {v1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    sget-object v2, Lz8/c$c;->a:Lz8/c$c;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v7, Lz8/c;->t:Lgg/i;

    invoke-static {v10}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object v0

    sget-object v1, Lz8/c$A;->a:Lz8/c$A;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo v5, "distinctUntilChanged(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls9/d$c;

    const-string v0, ""

    invoke-direct {v2, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v9, v5

    move/from16 v5, v16

    move-object v8, v6

    move-object/from16 v6, v17

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, Lz8/c;->u:LLi/N;

    invoke-direct/range {p0 .. p0}, Lz8/c;->L0()Lcom/ui/wifiman/model/wmw/WifimanWizard;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object v0

    new-instance v1, Lz8/c$d;

    invoke-direct {v1, v7}, Lz8/c$d;-><init>(Lz8/c;)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lz8/c$e;

    invoke-direct {v1, v7}, Lz8/c$e;-><init>(Lz8/c;)V

    invoke-static {v0, v14, v8, v1}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v7, v11, v2, v0}, Lz8/c;->F0(Ljava/util/Set;LS8/c;Ljava/util/Map;)LJ9/j;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, Lz8/c;->v:LLi/N;

    new-instance v2, Lcom/ui/wifiman/ui/signal/f;

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-direct {v2, v1, v0}, Lcom/ui/wifiman/ui/signal/f;-><init>(II)V

    move-object/from16 v0, p0

    move-object v1, v12

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, Lz8/c;->w:LLi/N;

    invoke-static {v10}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object v0

    sget-object v1, Lz8/c$f;->a:Lz8/c$f;

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-static {v10}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object v1

    sget-object v2, Lz8/c$g;->a:Lz8/c$g;

    invoke-virtual {v1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v11

    invoke-direct/range {p0 .. p0}, Lz8/c;->H0()LCc/n;

    move-result-object v1

    invoke-interface {v1}, LCc/n;->a()Lgg/i;

    move-result-object v1

    new-instance v2, Lz8/c$h;

    invoke-direct {v2, v7}, Lz8/c$h;-><init>(Lz8/c;)V

    move-object v10, v0

    move-object v12, v13

    move-object v13, v1

    move-object/from16 v16, v2

    invoke-static/range {v10 .. v16}, Lgg/i;->r(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/j;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    sget-object v1, Lz8/c$i;->a:Lz8/c$i;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    const-string/jumbo v0, "map(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LEe/g;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, LEe/g;-><init>(Ljava/util/List;)V

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, v7, Lz8/c;->x:LLi/N;

    return-void
.end method

.method public static final synthetic A0(Lz8/c;)Li8/a;
    .locals 0

    invoke-direct {p0}, Lz8/c;->J0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B0(Lz8/c;)LFg/a;
    .locals 0

    iget-object p0, p0, Lz8/c;->m:LFg/a;

    return-object p0
.end method

.method public static final synthetic C0(Lz8/c;LS8/c;)I
    .locals 0

    invoke-direct {p0, p1}, Lz8/c;->Q0(LS8/c;)I

    move-result p0

    return p0
.end method

.method private final D0(Lre/a$a;Ljava/util/Map;La8/a;Ljava/util/Set;Z)LTe/e0;
    .locals 10

    sget-object v0, La8/b;->c:La8/b$a;

    invoke-virtual {p1}, Lre/a$a;->b()Lh9/a;

    move-result-object v1

    invoke-virtual {v0, v1}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object v0

    invoke-virtual {p3, v0}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LCc/a$b;

    invoke-interface {p4, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p1}, Lre/a$a;->b()Lh9/a;

    move-result-object p4

    invoke-interface {p2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lle/i;

    invoke-direct {p0, p1}, Lz8/c;->I0(Lre/a$a;)Ljava/lang/String;

    move-result-object v1

    if-eqz p3, :cond_1

    sget-object p4, Lcom/ubnt/usurvey/product/m$c;->SMALL:Lcom/ubnt/usurvey/product/m$c;

    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->c()Ls9/b;

    move-result-object v0

    invoke-static {p3, p4, v0}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object p4

    if-nez p4, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v3, p4

    goto :goto_2

    :cond_1
    :goto_1
    sget-object p4, LPe/a;->a:LPe/a;

    invoke-virtual {p4}, LPe/a;->c()Ls9/b;

    move-result-object p4

    goto :goto_0

    :goto_2
    if-eqz p3, :cond_2

    invoke-interface {p3}, LCc/a;->getName()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_2

    new-instance p4, LTe/e0$a$a;

    new-instance v0, Ls9/d$c;

    invoke-direct {v0, p3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {p4, v0}, LTe/e0$a$a;-><init>(Ls9/d;)V

    move-object v4, p4

    goto :goto_3

    :cond_2
    sget-object p3, LTe/e0$a$b;->a:LTe/e0$a$b;

    move-object v4, p3

    :goto_3
    invoke-virtual {p1}, Lre/a$a;->b()Lh9/a;

    move-result-object v5

    const/4 p3, 0x0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lle/i;->q()LS8/l;

    move-result-object p4

    move-object v6, p4

    goto :goto_4

    :cond_3
    move-object v6, p3

    :goto_4
    invoke-virtual {p1}, Lre/a$a;->a()LS8/c;

    move-result-object v7

    if-nez v2, :cond_5

    if-eqz p5, :cond_4

    goto :goto_6

    :cond_4
    const/4 p1, 0x0

    :goto_5
    move v8, p1

    goto :goto_7

    :cond_5
    :goto_6
    const/4 p1, 0x1

    goto :goto_5

    :goto_7
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lle/i;->m()Lke/a;

    move-result-object p3

    :cond_6
    instance-of v9, p3, Lke/a$a;

    new-instance p1, LTe/e0;

    move-object v0, p1

    invoke-direct/range {v0 .. v9}, LTe/e0;-><init>(Ljava/lang/String;ZLs9/a;LTe/e0$a;Lh9/a;LS8/l;LS8/c;ZZ)V

    return-object p1
.end method

.method private final E0(LS8/c;ZI)LJ9/a;
    .locals 10

    new-instance v9, LJ9/a;

    invoke-direct {p0, p1}, Lz8/c;->Q0(LS8/c;)I

    move-result v1

    invoke-static {p1, p3}, LNe/h;->g(LS8/c;I)Ls9/d;

    move-result-object v2

    const/16 v7, 0x34

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v9

    move v4, p2

    invoke-direct/range {v0 .. v8}, LJ9/a;-><init>(ILs9/d;Ls9/b;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method private final F0(Ljava/util/Set;LS8/c;Ljava/util/Map;)LJ9/j;
    .locals 6

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p2, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    invoke-static {p3}, LZg/U;->y(Ljava/util/Map;)Lzi/j;

    move-result-object v4

    new-instance v5, Lz8/b;

    invoke-direct {v5}, Lz8/b;-><init>()V

    invoke-static {v4, v5}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v4

    invoke-static {v4}, Lzi/m;->U(Lzi/j;)I

    move-result v4

    const/4 v5, 0x0

    invoke-direct {p0, v5, v3, v4}, Lz8/c;->E0(LS8/c;ZI)LJ9/a;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Lz8/c$k;

    invoke-direct {v3}, Lz8/c$k;-><init>()V

    invoke-static {p1, v3}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LS8/c;

    if-ne p2, v3, :cond_1

    move v4, v1

    goto :goto_2

    :cond_1
    move v4, v2

    :goto_2
    invoke-interface {p3, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    goto :goto_3

    :cond_2
    move v5, v2

    :goto_3
    invoke-direct {p0, v3, v4, v5}, Lz8/c;->E0(LS8/c;ZI)LJ9/a;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    new-instance p2, LJ9/j;

    invoke-direct {p2, p1}, LJ9/j;-><init>(Ljava/util/List;)V

    return-object p2
.end method

.method private static final G0(Ljava/util/Map$Entry;)I
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method private final H0()LCc/n;
    .locals 1

    iget-object v0, p0, Lz8/c;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final I0(Lre/a$a;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lre/a$a;->b()Lh9/a;

    move-result-object p1

    invoke-virtual {p1}, Lh9/a;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final J0()Li8/a;
    .locals 1

    iget-object v0, p0, Lz8/c;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final K0()Lle/g;
    .locals 1

    iget-object v0, p0, Lz8/c;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lle/g;

    return-object v0
.end method

.method private final L0()Lcom/ui/wifiman/model/wmw/WifimanWizard;
    .locals 1

    iget-object v0, p0, Lz8/c;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/WifimanWizard;

    return-object v0
.end method

.method private final M0()Lre/a;
    .locals 1

    iget-object v0, p0, Lz8/c;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lre/a;

    return-object v0
.end method

.method private final N0()V
    .locals 7

    sget-object v6, Lye/d;->a:Lye/d;

    new-instance v3, Lz8/a;

    invoke-direct {v3, p0}, Lz8/a;-><init>(Lz8/c;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object v0

    invoke-static {v0}, Lz8/c;->P0(Lye/d$a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v6, v0, p0}, Lye/d;->e(Lgg/i;Lye/g;)V

    return-void
.end method

.method private static final O0(Lz8/c;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lz8/c;->o:Lgg/i;

    sget-object v1, Lz8/c$l;->a:Lz8/c$l;

    invoke-virtual {v0, v1}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lz8/c$m;

    invoke-direct {v1, p0}, Lz8/c$m;-><init>(Lz8/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p0

    invoke-virtual {p0}, Lgg/b;->c0()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "toFlowable(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final P0(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, Lz8/c;->y:[Lth/l;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final Q0(LS8/c;)I
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public static synthetic u0(Ljava/util/Map$Entry;)I
    .locals 0

    invoke-static {p0}, Lz8/c;->G0(Ljava/util/Map$Entry;)I

    move-result p0

    return p0
.end method

.method public static synthetic v0(Lz8/c;)Lgg/i;
    .locals 0

    invoke-static {p0}, Lz8/c;->O0(Lz8/c;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(Lz8/c;Lre/a$a;Ljava/util/Map;La8/a;Ljava/util/Set;Z)LTe/e0;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lz8/c;->D0(Lre/a$a;Ljava/util/Map;La8/a;Ljava/util/Set;Z)LTe/e0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x0(Lz8/c;Ljava/util/Set;LS8/c;Ljava/util/Map;)LJ9/j;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz8/c;->F0(Ljava/util/Set;LS8/c;Ljava/util/Map;)LJ9/j;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y0(Lz8/c;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lz8/c;->p:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic z0(Lz8/c;Lre/a$a;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lz8/c;->I0(Lre/a$a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()LLi/N;
    .locals 1

    iget-object v0, p0, Lz8/c;->u:LLi/N;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lz8/c;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public l0()V
    .locals 0

    invoke-super {p0}, Lye/g;->l0()V

    invoke-direct {p0}, Lz8/c;->N0()V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Lz8/c;->v:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, Lz8/c;->x:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, Lz8/c;->w:LLi/N;

    return-object v0
.end method

.method public q0(Ljava/lang/String;)V
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Lz8/c;->o:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    const-string/jumbo v2, "firstOrError(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ll9/f;->f(Lgg/z;)Lgg/n;

    move-result-object v1

    new-instance v2, Lz8/c$n;

    invoke-direct {v2, p0, p1}, Lz8/c$n;-><init>(Lz8/c;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public r0(I)V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    new-instance v1, Lz8/c$o;

    invoke-direct {v1, p0, p1}, Lz8/c$o;-><init>(Lz8/c;I)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lz8/c$p;

    invoke-direct {v1, p0}, Lz8/c$p;-><init>(Lz8/c;)V

    invoke-virtual {p1, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public s0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Lz8/c;->o:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    const-string/jumbo v2, "firstOrError(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ll9/f;->f(Lgg/z;)Lgg/n;

    move-result-object v1

    sget-object v2, Lz8/c$r;->a:Lz8/c$r;

    invoke-virtual {v1, v2}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v1

    new-instance v2, Lz8/c$q;

    invoke-direct {v2, p0}, Lz8/c$q;-><init>(Lz8/c;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v2

    const-string/jumbo v3, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x2

    new-array v3, v3, [Lgg/f;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-static {v3}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "concatArray(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public t0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lz8/c;->J0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
