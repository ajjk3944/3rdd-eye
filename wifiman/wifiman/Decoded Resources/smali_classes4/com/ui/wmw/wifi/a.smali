.class public final Lcom/ui/wmw/wifi/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/wifi/a$a;
    }
.end annotation


# instance fields
.field private final a:Lh9/a;

.field private final b:Ljava/lang/String;

.field private final c:LS8/c;

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:Ljava/lang/Integer;

.field private final h:LS8/d;

.field private final i:Ljava/util/Set;

.field private final j:LS8/l;

.field private final k:I

.field private final l:Ljava/lang/Integer;

.field private final m:Ljava/lang/Integer;

.field private final n:Ljava/lang/Boolean;

.field private final o:Ljava/lang/Float;

.field private final p:Ljava/lang/Integer;

.field private final q:LS8/a;

.field private final r:LS8/j;

.field private final s:Ljava/util/Set;

.field private final t:J


# direct methods
.method public constructor <init>(Lh9/a;Ljava/lang/String;LS8/c;IIILjava/lang/Integer;LS8/d;Ljava/util/Set;LS8/l;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;LS8/a;LS8/j;Ljava/util/Set;J)V
    .locals 8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object/from16 v3, p8

    move-object/from16 v4, p9

    move-object/from16 v5, p10

    move-object/from16 v6, p17

    const-string v7, "bssid"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "band"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "bandwidth"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "supportedChannelWidths"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "signal"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "ieeeMode"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/ui/wmw/wifi/a;->a:Lh9/a;

    move-object v1, p2

    iput-object v1, v0, Lcom/ui/wmw/wifi/a;->b:Ljava/lang/String;

    iput-object v2, v0, Lcom/ui/wmw/wifi/a;->c:LS8/c;

    move v1, p4

    iput v1, v0, Lcom/ui/wmw/wifi/a;->d:I

    move v1, p5

    iput v1, v0, Lcom/ui/wmw/wifi/a;->e:I

    move v1, p6

    iput v1, v0, Lcom/ui/wmw/wifi/a;->f:I

    move-object v1, p7

    iput-object v1, v0, Lcom/ui/wmw/wifi/a;->g:Ljava/lang/Integer;

    iput-object v3, v0, Lcom/ui/wmw/wifi/a;->h:LS8/d;

    iput-object v4, v0, Lcom/ui/wmw/wifi/a;->i:Ljava/util/Set;

    iput-object v5, v0, Lcom/ui/wmw/wifi/a;->j:LS8/l;

    move/from16 v1, p11

    iput v1, v0, Lcom/ui/wmw/wifi/a;->k:I

    move-object/from16 v1, p12

    iput-object v1, v0, Lcom/ui/wmw/wifi/a;->l:Ljava/lang/Integer;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/ui/wmw/wifi/a;->m:Ljava/lang/Integer;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/ui/wmw/wifi/a;->n:Ljava/lang/Boolean;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/ui/wmw/wifi/a;->o:Ljava/lang/Float;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/ui/wmw/wifi/a;->p:Ljava/lang/Integer;

    iput-object v6, v0, Lcom/ui/wmw/wifi/a;->q:LS8/a;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/ui/wmw/wifi/a;->r:LS8/j;

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/ui/wmw/wifi/a;->s:Ljava/util/Set;

    move-wide/from16 v1, p20

    iput-wide v1, v0, Lcom/ui/wmw/wifi/a;->t:J

    return-void
.end method


# virtual methods
.method public final a()LS8/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->c:LS8/c;

    return-object v0
.end method

.method public final b()LS8/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->h:LS8/d;

    return-object v0
.end method

.method public final c()Lh9/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->a:Lh9/a;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/ui/wmw/wifi/a;->e:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/ui/wmw/wifi/a;->f:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wmw/wifi/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wmw/wifi/a;

    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->a:Lh9/a;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->a:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->c:LS8/c;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->c:LS8/c;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/ui/wmw/wifi/a;->d:I

    iget v3, p1, Lcom/ui/wmw/wifi/a;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/ui/wmw/wifi/a;->e:I

    iget v3, p1, Lcom/ui/wmw/wifi/a;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/ui/wmw/wifi/a;->f:I

    iget v3, p1, Lcom/ui/wmw/wifi/a;->f:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->g:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->g:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->h:LS8/d;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->h:LS8/d;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->i:Ljava/util/Set;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->i:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->j:LS8/l;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->j:LS8/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/ui/wmw/wifi/a;->k:I

    iget v3, p1, Lcom/ui/wmw/wifi/a;->k:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->l:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->l:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->m:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->m:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->n:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->n:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->o:Ljava/lang/Float;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->o:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->p:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->p:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->q:LS8/a;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->q:LS8/a;

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->r:LS8/j;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->r:LS8/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->s:Ljava/util/Set;

    iget-object v3, p1, Lcom/ui/wmw/wifi/a;->s:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-wide v3, p0, Lcom/ui/wmw/wifi/a;->t:J

    iget-wide v5, p1, Lcom/ui/wmw/wifi/a;->t:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final f()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method public final g()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->o:Ljava/lang/Float;

    return-object v0
.end method

.method public final h()LS8/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->q:LS8/a;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->a:Lh9/a;

    invoke-virtual {v0}, Lh9/a;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->l:Ljava/lang/Integer;

    return-object v0
.end method

.method public final j()LS8/j;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->r:LS8/j;

    return-object v0
.end method

.method public final k()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wmw/wifi/a;->t:J

    return-wide v0
.end method

.method public final l()LS8/l;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->j:LS8/l;

    return-object v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lcom/ui/wmw/wifi/a;->k:I

    return v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final o()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->p:Ljava/lang/Integer;

    return-object v0
.end method

.method public final p()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->i:Ljava/util/Set;

    return-object v0
.end method

.method public final q()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->s:Ljava/util/Set;

    return-object v0
.end method

.method public final r()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->m:Ljava/lang/Integer;

    return-object v0
.end method

.method public final s()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->n:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/ui/wmw/wifi/a;->a:Lh9/a;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wmw/wifi/a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/wmw/wifi/a;->q:LS8/a;

    iget-object v3, p0, Lcom/ui/wmw/wifi/a;->r:LS8/j;

    iget v4, p0, Lcom/ui/wmw/wifi/a;->e:I

    iget v5, p0, Lcom/ui/wmw/wifi/a;->f:I

    iget-object v6, p0, Lcom/ui/wmw/wifi/a;->p:Ljava/lang/Integer;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "WMWResult["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] - ssid: "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ieee: "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sec: "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ch: "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", ch_center "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", sta: "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
