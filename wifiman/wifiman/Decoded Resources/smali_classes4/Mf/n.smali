.class public final LMf/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMf/a$a;
.implements LMf/s;


# instance fields
.field private final a:Lcom/ui/wmw/api/v1/a;

.field private final b:LKf/e;

.field private final c:LFg/a;

.field private final d:Lgg/b;

.field private final e:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/api/v1/a;LKf/e;)V
    .locals 2

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMf/n;->a:Lcom/ui/wmw/api/v1/a;

    iput-object p2, p0, LMf/n;->b:LKf/e;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string p2, "createDefault(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LMf/n;->c:LFg/a;

    new-instance p2, LMf/f;

    invoke-direct {p2, p0}, LMf/f;-><init>(LMf/n;)V

    invoke-static {p2}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lgg/s;->x0(I)LBg/a;

    move-result-object p2

    invoke-virtual {p2}, LBg/a;->l1()Lgg/s;

    move-result-object p2

    invoke-virtual {p2}, Lgg/s;->f0()Lgg/b;

    move-result-object p2

    const-string v1, "ignoreElements(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LMf/n;->d:Lgg/b;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LMf/n;->e:Lgg/i;

    return-void
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    invoke-static {}, LMf/n;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {}, LMf/n;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(LMf/n;)V
    .locals 0

    invoke-static {p0}, LMf/n;->o(LMf/n;)V

    return-void
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    invoke-static {}, LMf/n;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()V
    .locals 0

    invoke-static {}, LMf/n;->w()V

    return-void
.end method

.method public static synthetic h(LMf/n;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1}, LMf/n;->m(LMf/n;Lgg/t;)V

    return-void
.end method

.method public static synthetic i()Ljava/lang/String;
    .locals 1

    invoke-static {}, LMf/n;->p()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()V
    .locals 0

    invoke-static {}, LMf/n;->u()V

    return-void
.end method

.method public static synthetic k()Ljava/lang/String;
    .locals 1

    invoke-static {}, LMf/n;->x()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l()V
    .locals 0

    invoke-static {}, LMf/n;->s()V

    return-void
.end method

.method private static final m(LMf/n;Lgg/t;)V
    .locals 2

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LMf/j;

    invoke-direct {v0}, LMf/j;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    iget-object v0, p0, LMf/n;->c:LFg/a;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    new-instance v0, LMf/k;

    invoke-direct {v0, p0}, LMf/k;-><init>(LMf/n;)V

    invoke-interface {p1, v0}, Lgg/t;->d(Lkg/e;)V

    return-void
.end method

.method private static final n()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW - FW upgrade in process signalled"

    return-object v0
.end method

.method private static final o(LMf/n;)V
    .locals 1

    new-instance v0, LMf/c;

    invoke-direct {v0}, LMf/c;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    iget-object p0, p0, LMf/n;->c:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final p()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW - FW upgrade in finished signalled"

    return-object v0
.end method

.method private final q()Z
    .locals 10

    iget-object v0, p0, LMf/n;->b:LKf/e;

    invoke-virtual {v0}, LKf/e;->m()Lcom/ui/common/semver/SemVer;

    move-result-object v0

    new-instance v9, Lcom/ui/common/semver/SemVer;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lcom/ui/common/semver/SemVer;-><init>(IIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v9}, Lcom/ui/common/semver/SemVer;->a(Lcom/ui/common/semver/SemVer;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final r()Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LMf/n;->b:LKf/e;

    invoke-virtual {v1}, LKf/e;->m()Lcom/ui/common/semver/SemVer;

    move-result-object v1

    new-instance v10, Lcom/ui/common/semver/SemVer;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v10

    invoke-direct/range {v2 .. v9}, Lcom/ui/common/semver/SemVer;-><init>(IIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v10}, Lcom/ui/common/semver/SemVer;->a(Lcom/ui/common/semver/SemVer;)I

    move-result v1

    if-gez v1, :cond_0

    new-instance v1, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    sget-object v2, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings$a;->CUSTOM:Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings$a;

    invoke-virtual {v2}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings$a;->getId()Ljava/lang/String;

    move-result-object v3

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v2, 0x1f4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    sget-object v2, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings$a;->MAX:Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings$a;

    invoke-virtual {v2}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings$a;->getId()Ljava/lang/String;

    move-result-object v10

    const/16 v16, 0x3e

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v9, v1

    invoke-direct/range {v9 .. v17}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object v1
.end method

.method private static final s()V
    .locals 1

    new-instance v0, LMf/e;

    invoke-direct {v0}, LMf/e;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method

.method private static final t()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW FW Upgrade - Bluetooth speed MAX Finished"

    return-object v0
.end method

.method private static final u()V
    .locals 1

    new-instance v0, LMf/d;

    invoke-direct {v0}, LMf/d;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method

.method private static final v()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW FW Upgrade - Upload Completed"

    return-object v0
.end method

.method private static final w()V
    .locals 1

    new-instance v0, LMf/b;

    invoke-direct {v0}, LMf/b;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method

.method private static final x()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW FW Upgrade - Upload Finished"

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LMf/n;->e:Lgg/i;

    return-object v0
.end method

.method public b(LMf/a;)Lgg/i;
    .locals 5

    const-string v0, "firmware"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMf/n;->a:Lcom/ui/wmw/api/v1/a;

    invoke-direct {p0}, LMf/n;->r()Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ui/wmw/api/v1/a;->j(Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)Lgg/b;

    move-result-object v0

    sget-object v1, LMf/n$c;->a:LMf/n$c;

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    sget-object v1, LMf/n$d;->a:LMf/n$d;

    invoke-virtual {v0, v1}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, LMf/g;

    invoke-direct {v1}, LMf/g;-><init>()V

    invoke-virtual {v0, v1}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->c0()Lgg/i;

    move-result-object v0

    iget-object v1, p0, LMf/n;->a:Lcom/ui/wmw/api/v1/a;

    invoke-virtual {p1}, LMf/a;->a()J

    move-result-wide v2

    invoke-virtual {p1}, LMf/a;->b()Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {p0}, LMf/n;->q()Z

    move-result v4

    invoke-interface {v1, v2, v3, p1, v4}, Lcom/ui/wmw/api/v1/a;->g(JLjava/io/InputStream;Z)Lgg/i;

    move-result-object p1

    iget-object v1, p0, LMf/n;->d:Lgg/b;

    invoke-virtual {p1, v1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    sget-object v1, LMf/n$e;->a:LMf/n$e;

    invoke-virtual {p1, v1}, Lgg/i;->R1(Lkg/p;)Lgg/i;

    move-result-object p1

    sget-object v1, LMf/n$f;->a:LMf/n$f;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v1, LMf/n$g;->a:LMf/n$g;

    invoke-virtual {p1, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v1, LMf/h;

    invoke-direct {v1}, LMf/h;-><init>()V

    invoke-virtual {p1, v1}, Lgg/i;->a0(Lkg/a;)Lgg/i;

    move-result-object p1

    sget-object v1, LMf/n$h;->a:LMf/n$h;

    invoke-virtual {p1, v1}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v1, LMf/i;

    invoke-direct {v1}, LMf/i;-><init>()V

    invoke-virtual {p1, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [LDj/a;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {v1}, Lgg/i;->A([LDj/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2}, Lcom/ui/wmw/f;->c(Lgg/i;Z)Lgg/i;

    move-result-object p1

    sget-object v0, LMf/n$a;->a:LMf/n$a;

    invoke-virtual {p1, v0}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object v0, LMf/n$b;->a:LMf/n$b;

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const-string v0, "doOnNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
