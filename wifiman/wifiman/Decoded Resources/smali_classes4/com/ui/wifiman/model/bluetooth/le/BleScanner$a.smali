.class public final Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/bluetooth/le/BleScanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;
    }
.end annotation


# instance fields
.field private final a:Lh9/a;

.field private final b:Lh9/a;

.field private final c:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

.field private final d:Z

.field private final e:Z

.field private final f:LU7/a;

.field private final g:Ljava/lang/String;

.field private final h:LCc/b;

.field private final i:Lcom/ui/wifiman/model/vendor/d;

.field private final j:Lxa/a$d;

.field private final k:Ljava/lang/Long;

.field private final l:Ljava/util/Set;

.field private final m:Ljava/lang/Integer;

.field private final n:Ljava/util/List;

.field private final o:Ljava/util/Set;

.field private final p:J


# direct methods
.method public constructor <init>(Lh9/a;Lh9/a;Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;ZZLU7/a;Ljava/lang/String;LCc/b;Lcom/ui/wifiman/model/vendor/d;Lxa/a$d;Ljava/lang/Long;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Set;J)V
    .locals 8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p12

    move-object/from16 v5, p14

    move-object/from16 v6, p15

    const-string v7, "mac"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "bluetoothMac"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "status"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "supportedTypes"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "beacons"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "services"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->a:Lh9/a;

    iput-object v2, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->b:Lh9/a;

    iput-object v3, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->c:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    move v1, p4

    iput-boolean v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->d:Z

    move v1, p5

    iput-boolean v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->e:Z

    move-object v1, p6

    iput-object v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->f:LU7/a;

    move-object v1, p7

    iput-object v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->g:Ljava/lang/String;

    move-object/from16 v1, p8

    iput-object v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->h:LCc/b;

    move-object/from16 v1, p9

    iput-object v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->i:Lcom/ui/wifiman/model/vendor/d;

    move-object/from16 v1, p10

    iput-object v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->j:Lxa/a$d;

    move-object/from16 v1, p11

    iput-object v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->k:Ljava/lang/Long;

    iput-object v4, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->l:Ljava/util/Set;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->m:Ljava/lang/Integer;

    iput-object v5, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->n:Ljava/util/List;

    iput-object v6, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->o:Ljava/util/Set;

    move-wide/from16 v1, p16

    iput-wide v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->p:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->k:Ljava/lang/Long;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->n:Ljava/util/List;

    return-object v0
.end method

.method public final c()Lh9/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->b:Lh9/a;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->e:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->a:Lh9/a;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->a:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->b:Lh9/a;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->b:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->c:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->c:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->d:Z

    iget-boolean v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->e:Z

    iget-boolean v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->f:LU7/a;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->f:LU7/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->h:LCc/b;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->h:LCc/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->i:Lcom/ui/wifiman/model/vendor/d;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->i:Lcom/ui/wifiman/model/vendor/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->j:Lxa/a$d;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->j:Lxa/a$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->k:Ljava/lang/Long;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->k:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->l:Ljava/util/Set;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->l:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->m:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->m:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->n:Ljava/util/List;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->n:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->o:Ljava/util/Set;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->o:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-wide v3, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->p:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->p:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->p:J

    return-wide v0
.end method

.method public final g()Lh9/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->a:Lh9/a;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->g:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->a:Lh9/a;

    invoke-virtual {v0}, Lh9/a;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Lxa/a$d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->j:Lxa/a$d;

    return-object v0
.end method

.method public final j()LU7/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->f:LU7/a;

    return-object v0
.end method

.method public final k()Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->c:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    return-object v0
.end method

.method public final l()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->l:Ljava/util/Set;

    return-object v0
.end method

.method public final m()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->m:Ljava/lang/Integer;

    return-object v0
.end method

.method public final n()LCc/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->h:LCc/b;

    return-object v0
.end method

.method public final o()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->i:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->a:Lh9/a;

    iget-object v2, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->b:Lh9/a;

    iget-object v3, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->c:Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    iget-boolean v4, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->d:Z

    iget-boolean v5, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->e:Z

    iget-object v6, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->f:LU7/a;

    iget-object v7, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->g:Ljava/lang/String;

    iget-object v8, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->h:LCc/b;

    iget-object v9, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->i:Lcom/ui/wifiman/model/vendor/d;

    iget-object v10, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->j:Lxa/a$d;

    iget-object v11, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->k:Ljava/lang/Long;

    iget-object v12, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->l:Ljava/util/Set;

    iget-object v13, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->m:Ljava/lang/Integer;

    iget-object v14, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->n:Ljava/util/List;

    iget-object v15, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->o:Ljava/util/Set;

    move-object/from16 v16, v14

    move-object/from16 v17, v15

    iget-wide v14, v0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->p:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v18, v14

    const-string v14, "Result(mac="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bluetoothMac="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", connectable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", signal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", vendor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", product="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", advertisingIntervalMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", supportedTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", txPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", beacons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", services="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastSeenAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v18

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
