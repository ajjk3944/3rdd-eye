.class public final LKf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lh9/a;

.field private final b:Lcom/ui/common/semver/SemVer;

.field private c:Lcom/ui/wmw/api/ApiVersion;

.field private d:Lcom/ui/wmw/api/v1/ApiV1Device;

.field private e:Lcom/ui/wmw/api/v1/ApiV1Firmware;

.field private f:Lcom/ui/wmw/api/v1/ApiV1Settings;

.field private g:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

.field private h:Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

.field private final i:LFg/a;

.field private final j:Lgg/i;

.field private final k:LFg/a;

.field private final l:Lgg/i;

.field private final m:LFg/a;

.field private final n:Lgg/i;

.field private final o:LFg/a;

.field private final p:Lgg/i;

.field private final q:LFg/a;

.field private final r:Lgg/i;

.field private final s:LFg/a;

.field private final t:Lgg/i;


# direct methods
.method public constructor <init>(Lh9/a;Lcom/ui/common/semver/SemVer;Lcom/ui/wmw/api/ApiVersion;Lcom/ui/wmw/api/v1/ApiV1Device;Lcom/ui/wmw/api/v1/ApiV1Firmware;Lcom/ui/wmw/api/v1/ApiV1Settings;Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)V
    .locals 1

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fwVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_version"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_device"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_fw"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_settings"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_stats"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_ble"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKf/e;->a:Lh9/a;

    iput-object p2, p0, LKf/e;->b:Lcom/ui/common/semver/SemVer;

    iput-object p3, p0, LKf/e;->c:Lcom/ui/wmw/api/ApiVersion;

    iput-object p4, p0, LKf/e;->d:Lcom/ui/wmw/api/v1/ApiV1Device;

    iput-object p5, p0, LKf/e;->e:Lcom/ui/wmw/api/v1/ApiV1Firmware;

    iput-object p6, p0, LKf/e;->f:Lcom/ui/wmw/api/v1/ApiV1Settings;

    iput-object p7, p0, LKf/e;->g:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    iput-object p8, p0, LKf/e;->h:Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    invoke-virtual {p0}, LKf/e;->s()Lcom/ui/wmw/api/ApiVersion;

    move-result-object p1

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string p2, "createDefault(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->i:LFg/a;

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p3

    const/4 p4, 0x0

    const/4 p5, 0x1

    invoke-virtual {p1, p3, p4, p5}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p3, "refCount(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->j:Lgg/i;

    invoke-virtual {p0}, LKf/e;->j()Lcom/ui/wmw/api/v1/ApiV1Device;

    move-result-object p1

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->k:LFg/a;

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p6

    invoke-virtual {p1, p6, p4, p5}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->l:Lgg/i;

    invoke-virtual {p0}, LKf/e;->l()Lcom/ui/wmw/api/v1/ApiV1Firmware;

    move-result-object p1

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->m:LFg/a;

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p6

    invoke-virtual {p1, p6, p4, p5}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->n:Lgg/i;

    invoke-virtual {p0}, LKf/e;->o()Lcom/ui/wmw/api/v1/ApiV1Settings;

    move-result-object p1

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->o:LFg/a;

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p6

    invoke-virtual {p1, p6, p4, p5}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->p:Lgg/i;

    invoke-virtual {p0}, LKf/e;->q()Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    move-result-object p1

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->q:LFg/a;

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p6

    invoke-virtual {p1, p6, p4, p5}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->r:Lgg/i;

    invoke-virtual {p0}, LKf/e;->i()Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    move-result-object p1

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->s:LFg/a;

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2, p4, p5}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKf/e;->t:Lgg/i;

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, LKf/e;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    invoke-static {}, LKf/e;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    invoke-static {}, LKf/e;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {}, LKf/e;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATING Ble Settings"

    return-object v0
.end method

.method private static final f()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATING Firmware Stats"

    return-object v0
.end method

.method private static final g()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATING Device Settings"

    return-object v0
.end method

.method private static final h()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATING Device Statistics"

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LKf/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LKf/e;

    iget-object v1, p0, LKf/e;->a:Lh9/a;

    iget-object v3, p1, LKf/e;->a:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LKf/e;->b:Lcom/ui/common/semver/SemVer;

    iget-object v3, p1, LKf/e;->b:Lcom/ui/common/semver/SemVer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LKf/e;->c:Lcom/ui/wmw/api/ApiVersion;

    iget-object v3, p1, LKf/e;->c:Lcom/ui/wmw/api/ApiVersion;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LKf/e;->d:Lcom/ui/wmw/api/v1/ApiV1Device;

    iget-object v3, p1, LKf/e;->d:Lcom/ui/wmw/api/v1/ApiV1Device;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LKf/e;->e:Lcom/ui/wmw/api/v1/ApiV1Firmware;

    iget-object v3, p1, LKf/e;->e:Lcom/ui/wmw/api/v1/ApiV1Firmware;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LKf/e;->f:Lcom/ui/wmw/api/v1/ApiV1Settings;

    iget-object v3, p1, LKf/e;->f:Lcom/ui/wmw/api/v1/ApiV1Settings;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LKf/e;->g:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    iget-object v3, p1, LKf/e;->g:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, LKf/e;->h:Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    iget-object p1, p1, LKf/e;->h:Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LKf/e;->a:Lh9/a;

    invoke-virtual {v0}, Lh9/a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKf/e;->b:Lcom/ui/common/semver/SemVer;

    invoke-virtual {v1}, Lcom/ui/common/semver/SemVer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKf/e;->c:Lcom/ui/wmw/api/ApiVersion;

    invoke-virtual {v1}, Lcom/ui/wmw/api/ApiVersion;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKf/e;->d:Lcom/ui/wmw/api/v1/ApiV1Device;

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1Device;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKf/e;->e:Lcom/ui/wmw/api/v1/ApiV1Firmware;

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1Firmware;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKf/e;->f:Lcom/ui/wmw/api/v1/ApiV1Settings;

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1Settings;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKf/e;->g:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKf/e;->h:Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;
    .locals 1

    iget-object v0, p0, LKf/e;->h:Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    return-object v0
.end method

.method public final j()Lcom/ui/wmw/api/v1/ApiV1Device;
    .locals 1

    iget-object v0, p0, LKf/e;->d:Lcom/ui/wmw/api/v1/ApiV1Device;

    return-object v0
.end method

.method public final k()Lgg/i;
    .locals 1

    iget-object v0, p0, LKf/e;->l:Lgg/i;

    return-object v0
.end method

.method public final l()Lcom/ui/wmw/api/v1/ApiV1Firmware;
    .locals 1

    iget-object v0, p0, LKf/e;->e:Lcom/ui/wmw/api/v1/ApiV1Firmware;

    return-object v0
.end method

.method public final m()Lcom/ui/common/semver/SemVer;
    .locals 1

    iget-object v0, p0, LKf/e;->b:Lcom/ui/common/semver/SemVer;

    return-object v0
.end method

.method public final n()Lh9/a;
    .locals 1

    iget-object v0, p0, LKf/e;->a:Lh9/a;

    return-object v0
.end method

.method public final o()Lcom/ui/wmw/api/v1/ApiV1Settings;
    .locals 1

    iget-object v0, p0, LKf/e;->f:Lcom/ui/wmw/api/v1/ApiV1Settings;

    return-object v0
.end method

.method public final p()Lgg/i;
    .locals 1

    iget-object v0, p0, LKf/e;->p:Lgg/i;

    return-object v0
.end method

.method public final q()Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;
    .locals 1

    iget-object v0, p0, LKf/e;->g:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    return-object v0
.end method

.method public final r()Lgg/i;
    .locals 1

    iget-object v0, p0, LKf/e;->r:Lgg/i;

    return-object v0
.end method

.method public final s()Lcom/ui/wmw/api/ApiVersion;
    .locals 1

    iget-object v0, p0, LKf/e;->c:Lcom/ui/wmw/api/ApiVersion;

    return-object v0
.end method

.method public final t(Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKf/a;

    invoke-direct {v0}, LKf/a;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    iput-object p1, p0, LKf/e;->h:Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    iget-object v0, p0, LKf/e;->s:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, LKf/e;->a:Lh9/a;

    iget-object v1, p0, LKf/e;->b:Lcom/ui/common/semver/SemVer;

    iget-object v2, p0, LKf/e;->c:Lcom/ui/wmw/api/ApiVersion;

    iget-object v3, p0, LKf/e;->d:Lcom/ui/wmw/api/v1/ApiV1Device;

    iget-object v4, p0, LKf/e;->e:Lcom/ui/wmw/api/v1/ApiV1Firmware;

    iget-object v5, p0, LKf/e;->f:Lcom/ui/wmw/api/v1/ApiV1Settings;

    iget-object v6, p0, LKf/e;->g:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    iget-object v7, p0, LKf/e;->h:Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "WmwSessionState(mac="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fwVersion="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _version="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _device="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _fw="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _settings="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _stats="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _ble="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lcom/ui/wmw/api/v1/ApiV1Firmware;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKf/d;

    invoke-direct {v0}, LKf/d;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    iput-object p1, p0, LKf/e;->e:Lcom/ui/wmw/api/v1/ApiV1Firmware;

    iget-object v0, p0, LKf/e;->m:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public final v(Lcom/ui/wmw/api/v1/ApiV1Settings;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKf/c;

    invoke-direct {v0}, LKf/c;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    iput-object p1, p0, LKf/e;->f:Lcom/ui/wmw/api/v1/ApiV1Settings;

    iget-object v0, p0, LKf/e;->o:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public final w(Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKf/b;

    invoke-direct {v0}, LKf/b;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    iput-object p1, p0, LKf/e;->g:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    iget-object v0, p0, LKf/e;->q:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method
