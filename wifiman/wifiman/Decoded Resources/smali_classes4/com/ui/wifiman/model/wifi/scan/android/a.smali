.class public final Lcom/ui/wifiman/model/wifi/scan/android/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lme/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/wifi/scan/android/a$a;,
        Lcom/ui/wifiman/model/wifi/scan/android/a$b;
    }
.end annotation


# static fields
.field public static final m:Lcom/ui/wifiman/model/wifi/scan/android/a$a;


# instance fields
.field private final a:Landroid/net/wifi/WifiManager;

.field private final b:Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory;

.field private final c:LFg/a;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/b;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/android/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/wifi/scan/android/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->m:Lcom/ui/wifiman/model/wifi/scan/android/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/net/wifi/WifiManager;Ltc/a;Lcom/ui/wifiman/model/android/permissions/d;Lfe/n;Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory;Lfe/u;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    const-string v6, "wifiManager"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "androidOS"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "permissionsService"

    move-object/from16 v7, p3

    invoke-static {v7, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "scanStateManager"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "wifiSignalFactory"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "schedulers"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->a:Landroid/net/wifi/WifiManager;

    iput-object v4, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->b:Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v1

    const-string v4, "createDefault(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->c:LFg/a;

    sget-object v4, LAg/c;->a:LAg/c;

    sget-object v6, Lcom/ubnt/usurvey/a;->r:Lcom/ubnt/usurvey/a$a;

    invoke-virtual {v6}, Lcom/ubnt/usurvey/a$a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object v6

    invoke-interface {v6}, Lcom/ubnt/usurvey/a$b;->b()Lgg/i;

    move-result-object v6

    sget-object v8, Lcom/ui/wifiman/model/wifi/scan/android/a$j;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$j;

    invoke-virtual {v6, v8}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v6

    const-string v8, "map(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v6, v1}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v1

    sget-object v6, Lcom/ui/wifiman/model/wifi/scan/android/a$k;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$k;

    invoke-virtual {v1, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->e1()Lgg/i;

    move-result-object v1

    invoke-interface/range {p6 .. p6}, Lfe/u;->a()Lgg/y;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual {v1, v6, v8, v9}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    const-string v6, "refCount(...)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->d:Lgg/i;

    new-instance v10, Lme/h;

    invoke-direct {v10, v0}, Lme/h;-><init>(Lcom/ui/wifiman/model/wifi/scan/android/a;)V

    sget-object v11, Lgg/a;->LATEST:Lgg/a;

    invoke-static {v10, v11}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object v10

    invoke-interface/range {p6 .. p6}, Lfe/u;->a()Lgg/y;

    move-result-object v11

    invoke-virtual {v10, v11}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object v10

    invoke-virtual {v10, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v10

    invoke-virtual {v10}, Ljg/a;->i2()Lgg/i;

    move-result-object v10

    invoke-static {v10, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->e:Lgg/i;

    invoke-virtual/range {p0 .. p0}, Lcom/ui/wifiman/model/wifi/scan/android/a;->m()Lgg/i;

    move-result-object v10

    sget-object v11, Lcom/ui/wifiman/model/wifi/scan/android/a$i;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$i;

    invoke-virtual {v10, v11}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v10

    invoke-virtual {v10}, Lgg/i;->W()Lgg/i;

    move-result-object v10

    invoke-virtual {v10, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v10

    invoke-virtual {v10}, Ljg/a;->i2()Lgg/i;

    move-result-object v10

    invoke-static {v10, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->f:Lgg/i;

    invoke-virtual/range {p0 .. p0}, Lcom/ui/wifiman/model/wifi/scan/android/a;->m()Lgg/i;

    move-result-object v11

    sget-object v12, Lcom/ui/wifiman/model/wifi/scan/android/a$e;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$e;

    invoke-virtual {v11, v12}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v11

    invoke-virtual {v11}, Lgg/i;->W()Lgg/i;

    move-result-object v11

    invoke-virtual {v11, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v11

    invoke-virtual {v11}, Ljg/a;->i2()Lgg/i;

    move-result-object v11

    invoke-static {v11, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->g:Lgg/i;

    invoke-virtual {v4, v10, v1}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->e1()Lgg/i;

    move-result-object v1

    new-instance v10, Lcom/ui/wifiman/model/wifi/scan/android/a$g;

    invoke-direct {v10, v3, v5}, Lcom/ui/wifiman/model/wifi/scan/android/a$g;-><init>(Lfe/n;Lfe/u;)V

    invoke-virtual {v1, v10}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->e1()Lgg/i;

    move-result-object v1

    invoke-interface/range {p6 .. p6}, Lfe/u;->a()Lgg/y;

    move-result-object v10

    invoke-virtual {v1, v10, v8, v9}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v1

    new-instance v10, Lcom/ui/wifiman/model/wifi/scan/android/a$h;

    invoke-direct {v10, v3, v0}, Lcom/ui/wifiman/model/wifi/scan/android/a$h;-><init>(Lfe/n;Lcom/ui/wifiman/model/wifi/scan/android/a;)V

    invoke-virtual {v1, v10}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string v3, "flatMapCompletable(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->h:Lgg/b;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v3, "android.net.wifi.SCAN_RESULTS"

    invoke-direct {v1, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ltc/a;->a(Landroid/content/IntentFilter;)Lgg/i;

    move-result-object v1

    sget-object v16, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {p6 .. p6}, Lfe/u;->a()Lgg/y;

    move-result-object v17

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x7d0

    invoke-static/range {v12 .. v17}, Lgg/i;->G0(JJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object v2

    invoke-static {v1, v2}, Lgg/i;->Q0(LDj/a;LDj/a;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->e1()Lgg/i;

    move-result-object v1

    invoke-interface/range {p6 .. p6}, Lfe/u;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {v1, v2, v8, v9}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/wifi/scan/android/a$c;

    invoke-direct {v2, v0}, Lcom/ui/wifiman/model/wifi/scan/android/a$c;-><init>(Lcom/ui/wifiman/model/wifi/scan/android/a;)V

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    sget-object v2, Lcom/ui/wifiman/model/wifi/scan/android/a$d;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$d;

    invoke-virtual {v1, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v1

    const-string v2, "doOnNext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->i:Lgg/i;

    invoke-virtual {v4, v1, v11}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v1

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sget-object v4, Lcom/ui/wifiman/model/wifi/scan/android/a$m;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$m;

    invoke-virtual {v1, v3, v4}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object v1

    sget-object v3, Lcom/ui/wifiman/model/wifi/scan/android/a$n;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$n;

    invoke-virtual {v1, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    sget-object v3, Lcom/ui/wifiman/model/wifi/scan/android/a$o;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$o;

    invoke-virtual {v1, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    sget-object v3, Lcom/ui/wifiman/model/wifi/scan/android/a$p;->a:Lcom/ui/wifiman/model/wifi/scan/android/a$p;

    invoke-virtual {v1, v3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->j:Lgg/i;

    invoke-interface/range {p3 .. p3}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/wifi/scan/android/a$l;

    invoke-direct {v2, v0}, Lcom/ui/wifiman/model/wifi/scan/android/a$l;-><init>(Lcom/ui/wifiman/model/wifi/scan/android/a;)V

    invoke-virtual {v1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v9}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->k:Lgg/i;

    new-instance v1, Lme/i;

    invoke-direct {v1}, Lme/i;-><init>()V

    invoke-static {v1}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/wifi/scan/android/a$f;

    invoke-direct {v2, v0}, Lcom/ui/wifiman/model/wifi/scan/android/a$f;-><init>(Lcom/ui/wifiman/model/wifi/scan/android/a;)V

    invoke-virtual {v1, v2}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object v1

    new-instance v2, Lme/j;

    invoke-direct {v2, v0}, Lme/j;-><init>(Lcom/ui/wifiman/model/wifi/scan/android/a;)V

    invoke-virtual {v1, v2}, Lgg/s;->A(Lkg/a;)Lgg/s;

    move-result-object v1

    invoke-virtual {v1, v9}, Lgg/s;->x0(I)LBg/a;

    move-result-object v1

    invoke-virtual {v1}, LBg/a;->l1()Lgg/s;

    move-result-object v1

    invoke-virtual {v1}, Lgg/s;->f0()Lgg/b;

    move-result-object v1

    const-string v2, "ignoreElements(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/ui/wifiman/model/wifi/scan/android/a;->l:Lgg/b;

    return-void
.end method

.method public static synthetic c(Lgg/t;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/wifi/scan/android/a;->k(Lgg/t;)V

    return-void
.end method

.method public static synthetic d(Lcom/ui/wifiman/model/wifi/scan/android/a;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/wifi/scan/android/a;->l(Lcom/ui/wifiman/model/wifi/scan/android/a;)V

    return-void
.end method

.method public static synthetic e(Lcom/ui/wifiman/model/wifi/scan/android/a;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/android/a;->n(Lcom/ui/wifiman/model/wifi/scan/android/a;Lgg/j;)V

    return-void
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/wifi/scan/android/a;)Lgg/b;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a;->h:Lgg/b;

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/wifi/scan/android/a;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a;->j:Lgg/i;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/wifi/scan/android/a;)Landroid/net/wifi/WifiManager;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a;->a:Landroid/net/wifi/WifiManager;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/wifi/scan/android/a;)Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a;->b:Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/wifi/scan/android/a;)LFg/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a;->c:LFg/a;

    return-object p0
.end method

.method private static final k(Lgg/t;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private static final l(Lcom/ui/wifiman/model/wifi/scan/android/a;)V
    .locals 2

    const-string v0, "Scanning ENABLED"

    const-string v1, "WifiScanner"

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a;->c:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final n(Lcom/ui/wifiman/model/wifi/scan/android/a;Lgg/j;)V
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1c

    if-ge v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v3, 0x1e

    if-lt v0, v2, :cond_1

    if-ge v0, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    if-lt v0, v3, :cond_2

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a;->a:Landroid/net/wifi/WifiManager;

    invoke-static {p0}, Lme/g;->a(Landroid/net/wifi/WifiManager;)Z

    move-result v1

    :cond_2
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a;->k:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a;->l:Lgg/b;

    return-object v0
.end method

.method public m()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/android/a;->e:Lgg/i;

    return-object v0
.end method
