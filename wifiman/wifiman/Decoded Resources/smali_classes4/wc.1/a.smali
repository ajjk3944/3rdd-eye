.class public final Lwc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwc/a$a;
    }
.end annotation


# instance fields
.field private final a:Lh9/a;

.field private final b:Lh9/a;

.field private final c:Z

.field private final d:Lwc/a$a;

.field private final e:LU7/a;

.field private final f:Ljava/lang/String;

.field private final g:LCc/b;

.field private final h:Lcom/ui/wifiman/model/vendor/d;

.field private final i:Lxa/a$d;

.field private final j:Ljava/lang/Long;

.field private final k:Ljava/util/Set;

.field private final l:Ljava/lang/Integer;

.field private final m:Ljava/util/List;

.field private final n:Z

.field private final o:J

.field private final p:La8/b;


# direct methods
.method public constructor <init>(Lh9/a;Lh9/a;ZLwc/a$a;LU7/a;Ljava/lang/String;LCc/b;Lcom/ui/wifiman/model/vendor/d;Lxa/a$d;Ljava/lang/Long;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/List;ZJ)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-object/from16 v4, p11

    move-object/from16 v5, p13

    const-string v6, "mac"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "bluetoothDeviceMac"

    invoke-static {p2, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "status"

    invoke-static {p4, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "supportedTypes"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "bleBeacons"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lwc/a;->a:Lh9/a;

    iput-object v2, v0, Lwc/a;->b:Lh9/a;

    move v1, p3

    iput-boolean v1, v0, Lwc/a;->c:Z

    iput-object v3, v0, Lwc/a;->d:Lwc/a$a;

    move-object v1, p5

    iput-object v1, v0, Lwc/a;->e:LU7/a;

    move-object v1, p6

    iput-object v1, v0, Lwc/a;->f:Ljava/lang/String;

    move-object v1, p7

    iput-object v1, v0, Lwc/a;->g:LCc/b;

    move-object v1, p8

    iput-object v1, v0, Lwc/a;->h:Lcom/ui/wifiman/model/vendor/d;

    move-object/from16 v1, p9

    iput-object v1, v0, Lwc/a;->i:Lxa/a$d;

    move-object/from16 v1, p10

    iput-object v1, v0, Lwc/a;->j:Ljava/lang/Long;

    iput-object v4, v0, Lwc/a;->k:Ljava/util/Set;

    move-object/from16 v1, p12

    iput-object v1, v0, Lwc/a;->l:Ljava/lang/Integer;

    iput-object v5, v0, Lwc/a;->m:Ljava/util/List;

    move/from16 v1, p14

    iput-boolean v1, v0, Lwc/a;->n:Z

    move-wide/from16 v3, p15

    iput-wide v3, v0, Lwc/a;->o:J

    sget-object v1, La8/b;->c:La8/b$a;

    invoke-virtual {v1, p2}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object v1

    iput-object v1, v0, Lwc/a;->p:La8/b;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lwc/a;->j:Ljava/lang/Long;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwc/a;->m:Ljava/util/List;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lwc/a;->n:Z

    return v0
.end method

.method public final d()Lh9/a;
    .locals 1

    iget-object v0, p0, Lwc/a;->b:Lh9/a;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lwc/a;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lwc/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lwc/a;

    iget-object v1, p0, Lwc/a;->a:Lh9/a;

    iget-object v3, p1, Lwc/a;->a:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lwc/a;->b:Lh9/a;

    iget-object v3, p1, Lwc/a;->b:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lwc/a;->c:Z

    iget-boolean v3, p1, Lwc/a;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lwc/a;->d:Lwc/a$a;

    iget-object v3, p1, Lwc/a;->d:Lwc/a$a;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lwc/a;->e:LU7/a;

    iget-object v3, p1, Lwc/a;->e:LU7/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lwc/a;->f:Ljava/lang/String;

    iget-object v3, p1, Lwc/a;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lwc/a;->g:LCc/b;

    iget-object v3, p1, Lwc/a;->g:LCc/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lwc/a;->h:Lcom/ui/wifiman/model/vendor/d;

    iget-object v3, p1, Lwc/a;->h:Lcom/ui/wifiman/model/vendor/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lwc/a;->i:Lxa/a$d;

    iget-object v3, p1, Lwc/a;->i:Lxa/a$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lwc/a;->j:Ljava/lang/Long;

    iget-object v3, p1, Lwc/a;->j:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lwc/a;->k:Ljava/util/Set;

    iget-object v3, p1, Lwc/a;->k:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lwc/a;->l:Ljava/lang/Integer;

    iget-object v3, p1, Lwc/a;->l:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lwc/a;->m:Ljava/util/List;

    iget-object v3, p1, Lwc/a;->m:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lwc/a;->n:Z

    iget-boolean v3, p1, Lwc/a;->n:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lwc/a;->o:J

    iget-wide v5, p1, Lwc/a;->o:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final f()La8/b;
    .locals 1

    iget-object v0, p0, Lwc/a;->p:La8/b;

    return-object v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, Lwc/a;->o:J

    return-wide v0
.end method

.method public final h()Lh9/a;
    .locals 1

    iget-object v0, p0, Lwc/a;->a:Lh9/a;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lwc/a;->a:Lh9/a;

    invoke-virtual {v0}, Lh9/a;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwc/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Lxa/a$d;
    .locals 1

    iget-object v0, p0, Lwc/a;->i:Lxa/a$d;

    return-object v0
.end method

.method public final k()LU7/a;
    .locals 1

    iget-object v0, p0, Lwc/a;->e:LU7/a;

    return-object v0
.end method

.method public final l()Lwc/a$a;
    .locals 1

    iget-object v0, p0, Lwc/a;->d:Lwc/a$a;

    return-object v0
.end method

.method public final m()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lwc/a;->k:Ljava/util/Set;

    return-object v0
.end method

.method public final n()LCc/b;
    .locals 1

    iget-object v0, p0, Lwc/a;->g:LCc/b;

    return-object v0
.end method

.method public final o()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, Lwc/a;->h:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lwc/a;->a:Lh9/a;

    iget-object v2, v0, Lwc/a;->b:Lh9/a;

    iget-boolean v3, v0, Lwc/a;->c:Z

    iget-object v4, v0, Lwc/a;->d:Lwc/a$a;

    iget-object v5, v0, Lwc/a;->e:LU7/a;

    iget-object v6, v0, Lwc/a;->f:Ljava/lang/String;

    iget-object v7, v0, Lwc/a;->g:LCc/b;

    iget-object v8, v0, Lwc/a;->h:Lcom/ui/wifiman/model/vendor/d;

    iget-object v9, v0, Lwc/a;->i:Lxa/a$d;

    iget-object v10, v0, Lwc/a;->j:Ljava/lang/Long;

    iget-object v11, v0, Lwc/a;->k:Ljava/util/Set;

    iget-object v12, v0, Lwc/a;->l:Ljava/lang/Integer;

    iget-object v13, v0, Lwc/a;->m:Ljava/util/List;

    iget-boolean v14, v0, Lwc/a;->n:Z

    move/from16 v16, v14

    iget-wide v14, v0, Lwc/a;->o:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v17, v14

    const-string v14, "BluetoothDevice(mac="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bluetoothDeviceMac="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", vendor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", product="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", advertisingIntervalMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", supportedTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", txPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bleBeacons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bleConnectable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

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
