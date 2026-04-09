.class public abstract Ln8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln8/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8/a$a;,
        Ln8/a$b;,
        Ln8/a$c;
    }
.end annotation


# static fields
.field public static final P:Ln8/a$a;

.field static final synthetic Q:[Lth/l;

.field public static final R:I


# instance fields
.field private final A:Lgg/i;

.field private final B:Lgg/i;

.field private final C:Lgg/i;

.field private final D:Lgg/i;

.field private final E:Lgg/i;

.field private final F:Lgg/i;

.field private final G:Lgg/i;

.field private final H:Lgg/i;

.field private final I:Z

.field private final J:Lgg/i;

.field private final K:Lgg/i;

.field private final L:Lgg/i;

.field private final M:Lgg/i;

.field private final N:Lgg/i;

.field private final O:Lgg/b;

.field private final a:Ln8/a$c;

.field private final b:LYg/m;

.field private final c:LYg/m;

.field private final d:LYg/m;

.field private final e:LYg/m;

.field private final f:LYg/m;

.field private final g:LYg/m;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Ljava/util/Comparator;

.field private final k:Z

.field private final l:Lgg/i;

.field private final m:Z

.field private final n:Lgg/b;

.field private final o:Z

.field private final p:Lgg/b;

.field private final q:Lgg/i;

.field private final r:Lgg/i;

.field private final s:Lgg/i;

.field private final t:Lgg/i;

.field private final u:Lgg/i;

.field private final v:Lgg/i;

.field private final w:Lgg/i;

.field private final x:Lgg/i;

.field private final y:Lgg/i;

.field private final z:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Ln8/a;

    const-string/jumbo v2, "hostnameLatencyService"

    const-string/jumbo v3, "getHostnameLatencyService()Lcom/ui/wifiman/model/network/latency/HostLatencyService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "bleCharacteristics"

    const-string/jumbo v5, "getBleCharacteristics()Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristics;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "bluetoothScanner"

    const-string/jumbo v6, "getBluetoothScanner()Lcom/ui/wifiman/model/bluetooth/BluetoothSurveyManager;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "bluetoothSignalStatsManager"

    const-string/jumbo v7, "getBluetoothSignalStatsManager()Lcom/ui/wifiman/model/bluetooth/BluetoothDeviceSignalStatistics$Manager;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "wifiSignalStatsService"

    const-string/jumbo v8, "getWifiSignalStatsService()Lcom/ui/wifiman/model/wifi/scan/timelapse/WifiSignalTimelapse$Service;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "portScanManager"

    const-string/jumbo v9, "getPortScanManager()Lcom/ubnt/usurvey/ui/device/portscan/DeviceDetailPortScanManager;"

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

    sput-object v7, Ln8/a;->Q:[Lth/l;

    new-instance v0, Ln8/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln8/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ln8/a;->P:Ln8/a$a;

    const/16 v0, 0x8

    sput v0, Ln8/a;->R:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;Ln8/a$c;)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string/jumbo v3, "di"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "deviceProvider"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Ln8/a;->a:Ln8/a$c;

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, Ln8/a$K;

    invoke-direct {v4}, Ln8/a$K;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    const-string/jumbo v5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Ldd/a;

    invoke-direct {v3, v4, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v4, 0x0

    invoke-static {v1, v3, v4}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v3

    sget-object v6, Ln8/a;->Q:[Lth/l;

    const/4 v7, 0x0

    aget-object v8, v6, v7

    invoke-interface {v3, v0, v8}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v3

    iput-object v3, v0, Ln8/a;->b:LYg/m;

    new-instance v3, Lorg/kodein/type/d;

    new-instance v8, Ln8/a$L;

    invoke-direct {v8}, Ln8/a$L;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lcom/ui/wifiman/model/bluetooth/le/a;

    invoke-direct {v3, v8, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v1, v3, v4}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v3

    const/4 v8, 0x1

    aget-object v9, v6, v8

    invoke-interface {v3, v0, v9}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v3

    iput-object v3, v0, Ln8/a;->c:LYg/m;

    new-instance v3, Lorg/kodein/type/d;

    new-instance v9, Ln8/a$M;

    invoke-direct {v9}, Ln8/a$M;-><init>()V

    invoke-virtual {v9}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v9

    invoke-static {v9}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v9

    invoke-static {v9, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v10, Lwc/h;

    invoke-direct {v3, v9, v10}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v1, v3, v4}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v3

    const/4 v9, 0x2

    aget-object v10, v6, v9

    invoke-interface {v3, v0, v10}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v3

    iput-object v3, v0, Ln8/a;->d:LYg/m;

    new-instance v3, Lorg/kodein/type/d;

    new-instance v10, Ln8/a$N;

    invoke-direct {v10}, Ln8/a$N;-><init>()V

    invoke-virtual {v10}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-static {v10}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v11, Lwc/b$a;

    invoke-direct {v3, v10, v11}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v1, v3, v4}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v3

    const/4 v10, 0x3

    aget-object v10, v6, v10

    invoke-interface {v3, v0, v10}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v3

    iput-object v3, v0, Ln8/a;->e:LYg/m;

    new-instance v3, Lorg/kodein/type/d;

    new-instance v10, Ln8/a$O;

    invoke-direct {v10}, Ln8/a$O;-><init>()V

    invoke-virtual {v10}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-static {v10}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v11, Lne/a$a;

    invoke-direct {v3, v10, v11}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v1, v3, v4}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v3

    const/4 v10, 0x4

    aget-object v10, v6, v10

    invoke-interface {v3, v0, v10}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v3

    iput-object v3, v0, Ln8/a;->f:LYg/m;

    new-instance v3, Lorg/kodein/type/d;

    new-instance v10, Ln8/a$P;

    invoke-direct {v10}, Ln8/a$P;-><init>()V

    invoke-virtual {v10}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-static {v10}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lo8/a;

    invoke-direct {v3, v10, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v1, v3, v4}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v1

    const/4 v3, 0x5

    aget-object v3, v6, v3

    invoke-interface {v1, v0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v1

    iput-object v1, v0, Ln8/a;->g:LYg/m;

    invoke-interface/range {p2 .. p2}, Ln8/a$c;->a()Lgg/i;

    move-result-object v1

    iput-object v1, v0, Ln8/a;->h:Lgg/i;

    sget-object v2, Ln8/a$E;->a:Ln8/a$E;

    invoke-virtual {v1, v2}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2, v8}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v2

    invoke-virtual {v2}, Ljg/a;->i2()Lgg/i;

    move-result-object v2

    const-string/jumbo v3, "refCount(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Ln8/a;->i:Lgg/i;

    new-instance v4, Ln8/a$J;

    invoke-direct {v4}, Ln8/a$J;-><init>()V

    new-instance v5, Ln8/a$W;

    invoke-direct {v5, v4}, Ln8/a$W;-><init>(Ljava/util/Comparator;)V

    iput-object v5, v0, Ln8/a;->j:Ljava/util/Comparator;

    iput-boolean v8, v0, Ln8/a;->k:Z

    new-instance v4, Ln8/a$Q;

    invoke-direct {v4, v0}, Ln8/a$Q;-><init>(Ln8/a;)V

    invoke-static {v4}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v4

    const-string/jumbo v5, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ln8/a$A;

    invoke-direct {v6, v0}, Ln8/a$A;-><init>(Ln8/a;)V

    invoke-virtual {v4, v6}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v4

    invoke-virtual {v4, v8}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v4

    invoke-virtual {v4}, Ljg/a;->i2()Lgg/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Ln8/a;->l:Lgg/i;

    iput-boolean v8, v0, Ln8/a;->m:Z

    new-instance v6, Ln8/a$R;

    invoke-direct {v6, v0}, Ln8/a$R;-><init>(Ln8/a;)V

    invoke-static {v6}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ln8/a$X;

    invoke-direct {v10, v0}, Ln8/a$X;-><init>(Ln8/a;)V

    invoke-virtual {v6, v10}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v6

    const-string/jumbo v10, "flatMapCompletable(...)"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, Ln8/a;->n:Lgg/b;

    iput-boolean v8, v0, Ln8/a;->o:Z

    sget-object v10, Ln8/a$y;->a:Ln8/a$y;

    invoke-virtual {v1, v10}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    new-instance v10, Ln8/a$z;

    invoke-direct {v10, v0}, Ln8/a$z;-><init>(Ln8/a;)V

    invoke-virtual {v1, v10}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v10, "switchMapCompletable(...)"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ln8/a;->p:Lgg/b;

    new-instance v10, Ll9/a;

    new-instance v11, Ls9/d$b;

    const v12, 0x7f1100a1

    invoke-direct {v11, v12}, Ls9/d$b;-><init>(I)V

    invoke-direct {v10, v11}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v10}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v10

    const-string/jumbo v11, "just(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v0, Ln8/a;->q:Lgg/i;

    sget-object v10, Ln8/a$v;->a:Ln8/a$v;

    invoke-virtual {v2, v10}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v10

    sget-object v12, LJe/a$c;->a:LJe/a$c;

    invoke-virtual {v10, v12}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v10

    sget-object v12, Ln8/a$w;->a:Ln8/a$w;

    invoke-virtual {v10, v12}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v10

    invoke-virtual {v10}, Lgg/i;->W()Lgg/i;

    move-result-object v10

    const-string/jumbo v12, "distinctUntilChanged(...)"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v0, Ln8/a;->r:Lgg/i;

    sget-object v10, Ln8/a$x;->a:Ln8/a$x;

    invoke-virtual {v2, v10}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v10

    invoke-virtual {v10}, Lgg/i;->W()Lgg/i;

    move-result-object v10

    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v10, v13}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v10

    invoke-virtual {v10}, Lgg/i;->W()Lgg/i;

    move-result-object v10

    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v0, Ln8/a;->s:Lgg/i;

    sget-object v10, Ln8/a$j;->a:Ln8/a$j;

    invoke-virtual {v2, v10}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v10

    invoke-virtual {v10}, Lgg/i;->W()Lgg/i;

    move-result-object v13

    invoke-static {v13, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v13, v0, Ln8/a;->t:Lgg/i;

    sget-object v10, Ln8/a$q;->a:Ln8/a$q;

    invoke-virtual {v2, v10}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v10

    invoke-virtual {v10}, Lgg/i;->W()Lgg/i;

    move-result-object v15

    invoke-static {v15, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v15, v0, Ln8/a;->u:Lgg/i;

    sget-object v10, Ln8/a$k;->a:Ln8/a$k;

    invoke-virtual {v2, v10}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v10

    invoke-virtual {v10}, Lgg/i;->W()Lgg/i;

    move-result-object v10

    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v0, Ln8/a;->v:Lgg/i;

    new-instance v14, Ln8/a$i;

    invoke-direct {v14, v0}, Ln8/a$i;-><init>(Ln8/a;)V

    invoke-virtual {v2, v14}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v14

    invoke-virtual {v14}, Lgg/i;->W()Lgg/i;

    move-result-object v14

    invoke-static {v14, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v14, v0, Ln8/a;->w:Lgg/i;

    new-instance v7, Ln8/a$m;

    invoke-direct {v7, v0}, Ln8/a$m;-><init>(Ln8/a;)V

    invoke-static {v2, v4, v7}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v4

    invoke-virtual {v4}, Lgg/i;->W()Lgg/i;

    move-result-object v4

    invoke-static {v4, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Ln8/a;->x:Lgg/i;

    sget-object v4, Ln8/a$d;->a:Ln8/a$d;

    invoke-virtual {v2, v4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v4

    invoke-virtual {v4}, Lgg/i;->W()Lgg/i;

    move-result-object v4

    new-instance v7, Ln8/a$e;

    invoke-direct {v7, v0}, Ln8/a$e;-><init>(Ln8/a;)V

    invoke-virtual {v4, v7}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v4

    const-string/jumbo v7, "switchMap(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Ln8/a;->y:Lgg/i;

    sget-object v9, Ln8/a$g;->a:Ln8/a$g;

    invoke-static {v2, v4, v9}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v4

    invoke-virtual {v4}, Lgg/i;->W()Lgg/i;

    move-result-object v4

    invoke-static {v4, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Ln8/a;->z:Lgg/i;

    new-instance v9, Ln8/a$f;

    invoke-direct {v9, v0}, Ln8/a$f;-><init>(Ln8/a;)V

    invoke-virtual {v2, v9}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v9

    invoke-virtual {v9}, Lgg/i;->W()Lgg/i;

    move-result-object v9

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, v0, Ln8/a;->A:Lgg/i;

    invoke-direct/range {p0 .. p0}, Ln8/a;->E()Lne/a$a;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Lge/b;->getAll()Lgg/i;

    move-result-object v8

    move-object/from16 p1, v6

    new-instance v6, Ln8/a$t;

    invoke-direct {v6, v0}, Ln8/a$t;-><init>(Ln8/a;)V

    invoke-static {v2, v8, v6}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v6

    invoke-virtual {v6}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, Ln8/a;->B:Lgg/i;

    new-instance v8, Ln8/a$s;

    invoke-direct {v8, v0}, Ln8/a$s;-><init>(Ln8/a;)V

    invoke-virtual {v2, v8}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v8

    invoke-virtual {v8}, Lgg/i;->W()Lgg/i;

    move-result-object v8

    invoke-static {v8, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, v0, Ln8/a;->C:Lgg/i;

    move-object/from16 p2, v1

    new-instance v1, Ln8/a$l;

    invoke-direct {v1, v0}, Ln8/a$l;-><init>(Ln8/a;)V

    invoke-virtual {v2, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ln8/a;->D:Lgg/i;

    move-object/from16 v20, v8

    new-instance v8, Ln8/a$p;

    invoke-direct {v8, v0}, Ln8/a$p;-><init>(Ln8/a;)V

    invoke-virtual {v2, v8}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v8

    invoke-virtual {v8}, Lgg/i;->W()Lgg/i;

    move-result-object v8

    invoke-static {v8, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, v0, Ln8/a;->E:Lgg/i;

    move-object/from16 v19, v6

    new-instance v6, Ln8/a$h;

    invoke-direct {v6, v0}, Ln8/a$h;-><init>(Ln8/a;)V

    invoke-virtual {v2, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v6

    invoke-virtual {v6}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, Ln8/a;->F:Lgg/i;

    new-instance v6, Ln8/a$r;

    invoke-direct {v6, v0}, Ln8/a$r;-><init>(Ln8/a;)V

    invoke-virtual {v2, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v6

    invoke-virtual {v6}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, Ln8/a;->G:Lgg/i;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v16

    move-object/from16 v18, v9

    invoke-static/range {v16 .. v16}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v9

    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, v0, Ln8/a;->H:Lgg/i;

    const/4 v9, 0x1

    iput-boolean v9, v0, Ln8/a;->I:Z

    sget-object v11, Ln8/a$D;->a:Ln8/a$D;

    invoke-virtual {v2, v11}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-virtual {v2, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v2

    invoke-virtual {v2}, Ljg/a;->i2()Lgg/i;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Ln8/a;->J:Lgg/i;

    sget-object v3, LAg/c;->a:LAg/c;

    sget-object v9, Ln8/a$n;->a:Ln8/a$n;

    invoke-virtual {v2, v9}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ln8/a$S;

    invoke-direct {v9, v0}, Ln8/a$S;-><init>(Ln8/a;)V

    invoke-static {v9}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v9

    invoke-static {v9, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Lgg/z;->W()Lgg/i;

    move-result-object v9

    const-string/jumbo v11, "toFlowable(...)"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2, v9}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    new-instance v3, Ln8/a$o;

    invoke-direct {v3, v0}, Ln8/a$o;-><init>(Ln8/a;)V

    invoke-virtual {v2, v3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Ln8/a;->K:Lgg/i;

    invoke-direct/range {p0 .. p0}, Ln8/a;->C()Lo8/a;

    move-result-object v3

    invoke-interface {v3}, Lo8/a;->b()Lgg/i;

    move-result-object v3

    iput-object v3, v0, Ln8/a;->L:Lgg/i;

    new-instance v3, Ln8/a$T;

    invoke-direct {v3, v0}, Ln8/a$T;-><init>(Ln8/a;)V

    invoke-static {v3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ln8/a$F;->a:Ln8/a$F;

    invoke-virtual {v3, v7}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v23

    new-instance v3, Ln8/a$U;

    invoke-direct {v3, v0}, Ln8/a$U;-><init>(Ln8/a;)V

    invoke-static {v3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ln8/a$G;->a:Ln8/a$G;

    invoke-virtual {v3, v7}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v27

    new-instance v3, Ln8/a$V;

    invoke-direct {v3, v0}, Ln8/a$V;-><init>(Ln8/a;)V

    invoke-static {v3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Ln8/a$H;->a:Ln8/a$H;

    invoke-virtual {v3, v5}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v28

    sget-object v30, Ln8/a$I;->a:Ln8/a$I;

    move-object/from16 v24, v1

    move-object/from16 v25, v6

    move-object/from16 v26, v8

    move-object/from16 v29, v2

    invoke-static/range {v23 .. v30}, Lgg/i;->q(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/k;)Lgg/i;

    move-result-object v1

    const-string/jumbo v2, "combineLatest(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ln8/a;->M:Lgg/i;

    sget-object v22, Ln8/a$u;->a:Ln8/a$u;

    move-object/from16 v16, v10

    move-object/from16 v17, v4

    move-object/from16 v21, v1

    invoke-static/range {v13 .. v22}, Lgg/i;->o(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/m;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ln8/a;->N:Lgg/i;

    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v1}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "mergeArray(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ln8/a;->O:Lgg/b;

    return-void
.end method

.method private final C()Lo8/a;
    .locals 1

    iget-object v0, p0, Ln8/a;->g:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo8/a;

    return-object v0
.end method

.method private final D(Ljava/util/List;Ljava/util/Map;)LKe/a$h;
    .locals 11

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lle/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Lle/i;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lle/i;->r()Lke/c;

    move-result-object v2

    instance-of v4, v2, Lke/c$a;

    if-eqz v4, :cond_1

    new-instance v4, Ls9/d$c;

    check-cast v2, Lke/c$a;

    invoke-virtual {v2}, Lke/c$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v5, v4

    goto :goto_0

    :cond_1
    instance-of v2, v2, Lke/c$b;

    if-eqz v2, :cond_e

    new-instance v2, Ls9/d$b;

    const v4, 0x7f110424

    invoke-direct {v2, v4}, Ls9/d$b;-><init>(I)V

    move-object v5, v2

    :goto_0
    invoke-virtual {v0}, Lle/i;->r()Lke/c;

    move-result-object v2

    instance-of v4, v2, Lke/c$a;

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    move v7, v6

    goto :goto_1

    :cond_2
    instance-of v2, v2, Lke/c$b;

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    move v7, v2

    :goto_1
    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lle/i;->c()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-le v0, v6, :cond_3

    sget-object v0, LAf/w;->a:LAf/w;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v2}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lle/i;

    invoke-virtual {v6}, Lle/i;->f()LS8/e;

    move-result-object v6

    invoke-virtual {v6}, LS8/e;->a()LS8/c;

    move-result-object v6

    sget-object v8, LS8/c;->GHZ_2_4:LS8/c;

    if-ne v6, v8, :cond_4

    goto :goto_2

    :cond_5
    move-object v4, v1

    :goto_2
    check-cast v4, Lle/i;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lle/i;->k()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LS8/k;->a(Ljava/lang/String;)LS8/k;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lne/a;

    invoke-static {v4, v2}, LM8/r;->h(Lle/i;Lne/a;)LAf/c$a;

    move-result-object v2

    move-object v8, v2

    goto :goto_3

    :cond_6
    move-object v8, v1

    :goto_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lle/i;

    invoke-virtual {v6}, Lle/i;->f()LS8/e;

    move-result-object v6

    invoke-virtual {v6}, LS8/e;->a()LS8/c;

    move-result-object v6

    sget-object v9, LS8/c;->GHZ_5:LS8/c;

    if-ne v6, v9, :cond_7

    goto :goto_4

    :cond_8
    move-object v4, v1

    :goto_4
    check-cast v4, Lle/i;

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lle/i;->k()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LS8/k;->a(Ljava/lang/String;)LS8/k;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lne/a;

    invoke-static {v4, v2}, LM8/r;->h(Lle/i;Lne/a;)LAf/c$a;

    move-result-object v2

    move-object v9, v2

    goto :goto_5

    :cond_9
    move-object v9, v1

    :goto_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lle/i;

    invoke-virtual {v4}, Lle/i;->f()LS8/e;

    move-result-object v4

    invoke-virtual {v4}, LS8/e;->a()LS8/c;

    move-result-object v4

    sget-object v6, LS8/c;->GHZ_6:LS8/c;

    if-ne v4, v6, :cond_a

    goto :goto_6

    :cond_b
    move-object v2, v1

    :goto_6
    check-cast v2, Lle/i;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lle/i;->k()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LS8/k;->a(Ljava/lang/String;)LS8/k;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne/a;

    invoke-static {v2, p1}, LM8/r;->h(Lle/i;Lne/a;)LAf/c$a;

    move-result-object v1

    :cond_c
    move-object v10, v1

    new-instance p1, LAf/c;

    const/4 v4, 0x0

    move-object v2, p1

    move v6, v7

    move-object v7, v0

    invoke-direct/range {v2 .. v10}, LAf/c;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;ZLjava/util/List;LAf/c$a;LAf/c$a;LAf/c$a;)V

    new-instance p2, LKe/a$h;

    invoke-direct {p2, p1}, LKe/a$h;-><init>(LAf/c;)V

    return-object p2

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final E()Lne/a$a;
    .locals 1

    iget-object v0, p0, Ln8/a;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lne/a$a;

    return-object v0
.end method

.method private final G(LCc/a;)Z
    .locals 2

    invoke-interface {p1}, LCc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    instance-of v1, p1, Lcom/ui/wifiman/model/vendor/d$c;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/ui/wifiman/model/vendor/d$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/vendor/d$c;->c()Lcom/ui/wifiman/model/vendor/d$d;

    move-result-object p1

    sget-object v1, Lcom/ui/wifiman/model/vendor/d$d;->UBIQUITI:Lcom/ui/wifiman/model/vendor/d$d;

    if-ne p1, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public static synthetic I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;
    .locals 6

    if-nez p7, :cond_2

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_1

    const/4 p5, 0x1

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Ln8/a;->H(Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;Z)LKe/a$b;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: newKeyVal"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic k(Ln8/a;)Lcom/ui/wifiman/model/bluetooth/le/a;
    .locals 0

    invoke-direct {p0}, Ln8/a;->r()Lcom/ui/wifiman/model/bluetooth/le/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Ln8/a;)Lwc/h;
    .locals 0

    invoke-direct {p0}, Ln8/a;->t()Lwc/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Ln8/a;)Lwc/b$a;
    .locals 0

    invoke-direct {p0}, Ln8/a;->u()Lwc/b$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Ln8/a;)Ldd/a;
    .locals 0

    invoke-direct {p0}, Ln8/a;->z()Ldd/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Ln8/a;)Lo8/a;
    .locals 0

    invoke-direct {p0}, Ln8/a;->C()Lo8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Ln8/a;Ljava/util/List;Ljava/util/Map;)LKe/a$h;
    .locals 0

    invoke-direct {p0, p1, p2}, Ln8/a;->D(Ljava/util/List;Ljava/util/Map;)LKe/a$h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Ln8/a;LCc/a;)Z
    .locals 0

    invoke-direct {p0, p1}, Ln8/a;->G(LCc/a;)Z

    move-result p0

    return p0
.end method

.method private final r()Lcom/ui/wifiman/model/bluetooth/le/a;
    .locals 1

    iget-object v0, p0, Ln8/a;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/bluetooth/le/a;

    return-object v0
.end method

.method private final t()Lwc/h;
    .locals 1

    iget-object v0, p0, Ln8/a;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc/h;

    return-object v0
.end method

.method private final u()Lwc/b$a;
    .locals 1

    iget-object v0, p0, Ln8/a;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc/b$a;

    return-object v0
.end method

.method private final z()Ldd/a;
    .locals 1

    iget-object v0, p0, Ln8/a;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldd/a;

    return-object v0
.end method


# virtual methods
.method protected final A()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Ln8/a;->j:Ljava/util/Comparator;

    return-object v0
.end method

.method protected B()Z
    .locals 1

    iget-boolean v0, p0, Ln8/a;->k:Z

    return v0
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, Ln8/a;->I:Z

    return v0
.end method

.method protected final H(Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;Z)LKe/a$b;
    .locals 7

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKe/a$b;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LKe/a$b;-><init>(Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;Z)V

    return-object v0
.end method

.method public final a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/a;->h:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/a;->L:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/a;->q:Lgg/i;

    return-object v0
.end method

.method public d(Landroidx/lifecycle/E;)V
    .locals 1

    const-string/jumbo v0, "savedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ln8/a;->C()Lo8/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lo8/a;->d(Landroidx/lifecycle/E;)V

    return-void
.end method

.method public e(Landroidx/lifecycle/E;)V
    .locals 1

    const-string/jumbo v0, "savedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ln8/a;->C()Lo8/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lo8/a;->e(Landroidx/lifecycle/E;)V

    return-void
.end method

.method public f()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/a;->s:Lgg/i;

    return-object v0
.end method

.method public g()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/a;->r:Lgg/i;

    return-object v0
.end method

.method public h()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/a;->N:Lgg/i;

    return-object v0
.end method

.method public i()Lgg/b;
    .locals 2

    iget-object v0, p0, Ln8/a;->J:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, Ln8/a$B;->a:Ln8/a$B;

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v0

    new-instance v1, Ln8/a$C;

    invoke-direct {v1, p0}, Ln8/a$C;-><init>(Ln8/a;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public j()Lgg/b;
    .locals 1

    iget-object v0, p0, Ln8/a;->O:Lgg/b;

    return-object v0
.end method

.method protected s()Z
    .locals 1

    iget-boolean v0, p0, Ln8/a;->m:Z

    return v0
.end method

.method public v()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/a;->F:Lgg/i;

    return-object v0
.end method

.method public w()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/a;->H:Lgg/i;

    return-object v0
.end method

.method protected x()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/a;->x:Lgg/i;

    return-object v0
.end method

.method protected y()Z
    .locals 1

    iget-boolean v0, p0, Ln8/a;->o:Z

    return v0
.end method
