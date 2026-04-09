.class public final Lme/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lke/c;

.field private final b:Lh9/a;

.field private final c:LS8/e;

.field private final d:LS8/a;

.field private final e:LS8/j;

.field private final f:LS8/l;

.field private final g:Ljava/lang/Boolean;

.field private final h:Ljava/lang/Integer;

.field private final i:Ljava/lang/Float;

.field private final j:Lcom/ubnt/usurvey/wifi/WifiMcs;

.field private final k:Ljava/lang/Integer;

.field private final l:Ljava/util/Set;

.field private final m:Ljava/util/Set;

.field private final n:Ljava/util/Set;

.field private final o:J


# direct methods
.method public constructor <init>(Lke/c;Lh9/a;LS8/e;LS8/a;LS8/j;LS8/l;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Float;Lcom/ubnt/usurvey/wifi/WifiMcs;Ljava/lang/Integer;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;J)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move-object/from16 v5, p14

    const-string v6, "ssid"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "bssid"

    invoke-static {p2, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "channel"

    invoke-static {p3, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "signal"

    invoke-static {p6, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "affiliatedMloLinks"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lme/k;->a:Lke/c;

    iput-object v2, v0, Lme/k;->b:Lh9/a;

    iput-object v3, v0, Lme/k;->c:LS8/e;

    move-object v1, p4

    iput-object v1, v0, Lme/k;->d:LS8/a;

    move-object v1, p5

    iput-object v1, v0, Lme/k;->e:LS8/j;

    iput-object v4, v0, Lme/k;->f:LS8/l;

    move-object v1, p7

    iput-object v1, v0, Lme/k;->g:Ljava/lang/Boolean;

    move-object v1, p8

    iput-object v1, v0, Lme/k;->h:Ljava/lang/Integer;

    move-object/from16 v1, p9

    iput-object v1, v0, Lme/k;->i:Ljava/lang/Float;

    move-object/from16 v1, p10

    iput-object v1, v0, Lme/k;->j:Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-object/from16 v1, p11

    iput-object v1, v0, Lme/k;->k:Ljava/lang/Integer;

    move-object/from16 v1, p12

    iput-object v1, v0, Lme/k;->l:Ljava/util/Set;

    move-object/from16 v1, p13

    iput-object v1, v0, Lme/k;->m:Ljava/util/Set;

    iput-object v5, v0, Lme/k;->n:Ljava/util/Set;

    move-wide/from16 v1, p15

    iput-wide v1, v0, Lme/k;->o:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lme/k;->n:Ljava/util/Set;

    return-object v0
.end method

.method public final b()Lh9/a;
    .locals 1

    iget-object v0, p0, Lme/k;->b:Lh9/a;

    return-object v0
.end method

.method public final c()LS8/e;
    .locals 1

    iget-object v0, p0, Lme/k;->c:LS8/e;

    return-object v0
.end method

.method public final d()LS8/a;
    .locals 1

    iget-object v0, p0, Lme/k;->d:LS8/a;

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lme/k;->o:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lme/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lme/k;

    iget-object v1, p0, Lme/k;->a:Lke/c;

    iget-object v3, p1, Lme/k;->a:Lke/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lme/k;->b:Lh9/a;

    iget-object v3, p1, Lme/k;->b:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lme/k;->c:LS8/e;

    iget-object v3, p1, Lme/k;->c:LS8/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lme/k;->d:LS8/a;

    iget-object v3, p1, Lme/k;->d:LS8/a;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lme/k;->e:LS8/j;

    iget-object v3, p1, Lme/k;->e:LS8/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lme/k;->f:LS8/l;

    iget-object v3, p1, Lme/k;->f:LS8/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lme/k;->g:Ljava/lang/Boolean;

    iget-object v3, p1, Lme/k;->g:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lme/k;->h:Ljava/lang/Integer;

    iget-object v3, p1, Lme/k;->h:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lme/k;->i:Ljava/lang/Float;

    iget-object v3, p1, Lme/k;->i:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lme/k;->j:Lcom/ubnt/usurvey/wifi/WifiMcs;

    iget-object v3, p1, Lme/k;->j:Lcom/ubnt/usurvey/wifi/WifiMcs;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lme/k;->k:Ljava/lang/Integer;

    iget-object v3, p1, Lme/k;->k:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lme/k;->l:Ljava/util/Set;

    iget-object v3, p1, Lme/k;->l:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lme/k;->m:Ljava/util/Set;

    iget-object v3, p1, Lme/k;->m:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lme/k;->n:Ljava/util/Set;

    iget-object v3, p1, Lme/k;->n:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lme/k;->o:J

    iget-wide v5, p1, Lme/k;->o:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final f()Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 1

    iget-object v0, p0, Lme/k;->j:Lcom/ubnt/usurvey/wifi/WifiMcs;

    return-object v0
.end method

.method public final g()LS8/j;
    .locals 1

    iget-object v0, p0, Lme/k;->e:LS8/j;

    return-object v0
.end method

.method public final h()LS8/l;
    .locals 1

    iget-object v0, p0, Lme/k;->f:LS8/l;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lme/k;->b:Lh9/a;

    invoke-virtual {v0}, Lh9/a;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Lke/c;
    .locals 1

    iget-object v0, p0, Lme/k;->a:Lke/c;

    return-object v0
.end method

.method public final j()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lme/k;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public final k()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lme/k;->m:Ljava/util/Set;

    return-object v0
.end method

.method public final l()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lme/k;->l:Ljava/util/Set;

    return-object v0
.end method

.method public final m()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lme/k;->k:Ljava/lang/Integer;

    return-object v0
.end method

.method public final n()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lme/k;->i:Ljava/lang/Float;

    return-object v0
.end method

.method public final o()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lme/k;->g:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lme/k;->a:Lke/c;

    iget-object v2, v0, Lme/k;->b:Lh9/a;

    iget-object v3, v0, Lme/k;->c:LS8/e;

    iget-object v4, v0, Lme/k;->d:LS8/a;

    iget-object v5, v0, Lme/k;->e:LS8/j;

    iget-object v6, v0, Lme/k;->f:LS8/l;

    iget-object v7, v0, Lme/k;->g:Ljava/lang/Boolean;

    iget-object v8, v0, Lme/k;->h:Ljava/lang/Integer;

    iget-object v9, v0, Lme/k;->i:Ljava/lang/Float;

    iget-object v10, v0, Lme/k;->j:Lcom/ubnt/usurvey/wifi/WifiMcs;

    iget-object v11, v0, Lme/k;->k:Ljava/lang/Integer;

    iget-object v12, v0, Lme/k;->l:Ljava/util/Set;

    iget-object v13, v0, Lme/k;->m:Ljava/util/Set;

    iget-object v14, v0, Lme/k;->n:Ljava/util/Set;

    move-object/from16 v16, v14

    iget-wide v14, v0, Lme/k;->o:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v17, v14

    const-string v14, "AndroidWifiSignal(ssid="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bssid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ieeeMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", securityType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wifiRTTSupport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stationCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", utilization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mcs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transmitPowerDbm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", supportedHtDataRates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", supportedChannelWidths="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", affiliatedMloLinks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastSeenAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v17

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
