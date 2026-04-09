.class public final Lle/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lle/i$a;
    }
.end annotation


# static fields
.field public static final x:Lle/i$a;


# instance fields
.field private final a:Lke/c;

.field private final b:Lh9/a;

.field private final c:Lke/a;

.field private final d:LS8/a;

.field private final e:LS8/e;

.field private final f:LS8/l;

.field private final g:J

.field private final h:LS8/j;

.field private final i:Lcom/ui/wifiman/model/vendor/d;

.field private final j:Ljava/lang/Boolean;

.field private final k:Z

.field private final l:Lcom/ubnt/usurvey/wifi/WifiMcs;

.field private final m:Ljava/lang/Integer;

.field private final n:Ljava/lang/Float;

.field private final o:Ljava/lang/Integer;

.field private final p:LW7/a;

.field private final q:LW7/a;

.field private final r:Ljava/util/Set;

.field private final s:Ljava/lang/String;

.field private final t:La8/b;

.field private final u:Ljava/lang/String;

.field private final v:LS8/l;

.field private final w:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lle/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lle/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lle/i;->x:Lle/i$a;

    return-void
.end method

.method public constructor <init>(Lke/c;Lh9/a;Lke/a;LS8/a;LS8/e;LS8/l;JLS8/j;Lcom/ui/wifiman/model/vendor/d;Ljava/lang/Boolean;ZLcom/ubnt/usurvey/wifi/WifiMcs;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;LW7/a;LW7/a;Ljava/util/Set;)V
    .locals 8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    move-object/from16 v6, p19

    const-string v7, "ssid"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "bssid"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkStatus"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "channel"

    invoke-static {p5, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "strength"

    invoke-static {p6, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "affiliatedMloLinks"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lle/i;->a:Lke/c;

    iput-object v2, v0, Lle/i;->b:Lh9/a;

    iput-object v3, v0, Lle/i;->c:Lke/a;

    move-object v3, p4

    iput-object v3, v0, Lle/i;->d:LS8/a;

    iput-object v4, v0, Lle/i;->e:LS8/e;

    iput-object v5, v0, Lle/i;->f:LS8/l;

    move-wide v3, p7

    iput-wide v3, v0, Lle/i;->g:J

    move-object/from16 v3, p9

    iput-object v3, v0, Lle/i;->h:LS8/j;

    move-object/from16 v3, p10

    iput-object v3, v0, Lle/i;->i:Lcom/ui/wifiman/model/vendor/d;

    move-object/from16 v3, p11

    iput-object v3, v0, Lle/i;->j:Ljava/lang/Boolean;

    move/from16 v3, p12

    iput-boolean v3, v0, Lle/i;->k:Z

    move-object/from16 v3, p13

    iput-object v3, v0, Lle/i;->l:Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-object/from16 v3, p14

    iput-object v3, v0, Lle/i;->m:Ljava/lang/Integer;

    move-object/from16 v3, p15

    iput-object v3, v0, Lle/i;->n:Ljava/lang/Float;

    move-object/from16 v3, p16

    iput-object v3, v0, Lle/i;->o:Ljava/lang/Integer;

    move-object/from16 v3, p17

    iput-object v3, v0, Lle/i;->p:LW7/a;

    move-object/from16 v3, p18

    iput-object v3, v0, Lle/i;->q:LW7/a;

    iput-object v6, v0, Lle/i;->r:Ljava/util/Set;

    const-string v3, ":"

    invoke-virtual {p2, v3}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LS8/k;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lle/i;->s:Ljava/lang/String;

    sget-object v3, La8/b;->c:La8/b$a;

    invoke-virtual {v3, p2}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object v3

    iput-object v3, v0, Lle/i;->t:La8/b;

    instance-of v3, v1, Lke/c$a;

    if-eqz v3, :cond_0

    sget-object v2, LS8/i;->b:LS8/i$a;

    check-cast v1, Lke/c$a;

    invoke-virtual {v1}, Lke/c$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LS8/i$a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v1, Lke/c$b;

    if-eqz v1, :cond_2

    sget-object v1, LS8/i;->b:LS8/i$a;

    invoke-virtual {v1, p2}, LS8/i$a;->a(Lh9/a;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    iput-object v1, v0, Lle/i;->u:Ljava/lang/String;

    invoke-virtual {p0}, Lle/i;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v5

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-object v1, v0, Lle/i;->v:LS8/l;

    new-instance v1, Lle/h;

    invoke-direct {v1, p0}, Lle/h;-><init>(Lle/i;)V

    invoke-static {v1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v1

    iput-object v1, v0, Lle/i;->w:LYg/m;

    return-void

    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public static synthetic a(Lle/i;)D
    .locals 2

    invoke-static {p0}, Lle/i;->b(Lle/i;)D

    move-result-wide v0

    return-wide v0
.end method

.method private static final b(Lle/i;)D
    .locals 4

    const/16 v0, 0x14

    int-to-double v0, v0

    iget-object v2, p0, Lle/i;->e:LS8/e;

    invoke-virtual {v2}, LS8/e;->e()LS8/e$b;

    move-result-object v2

    instance-of v3, v2, LS8/e$b$b;

    if-eqz v3, :cond_0

    check-cast v2, LS8/e$b$b;

    invoke-virtual {v2}, LS8/e$b$b;->a()I

    move-result v2

    goto :goto_0

    :cond_0
    instance-of v3, v2, LS8/e$b$a;

    if-eqz v3, :cond_1

    check-cast v2, LS8/e$b$a;

    invoke-virtual {v2}, LS8/e$b$a;->d()I

    move-result v2

    :goto_0
    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->log10(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    const-wide v2, 0x403b8ccccccccccdL    # 27.55

    sub-double/2addr v2, v0

    iget-object p0, p0, Lle/i;->f:LS8/l;

    invoke-virtual {p0}, LS8/l;->b()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    int-to-double v0, p0

    add-double/2addr v2, v0

    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    div-double/2addr v2, v0

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    return-wide v0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final c()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lle/i;->r:Ljava/util/Set;

    return-object v0
.end method

.method public final d()Z
    .locals 6

    iget-wide v0, p0, Lle/i;->g:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v4, 0x124f8

    sub-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e()Lh9/a;
    .locals 1

    iget-object v0, p0, Lle/i;->b:Lh9/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lle/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lle/i;

    iget-object v1, p0, Lle/i;->a:Lke/c;

    iget-object v3, p1, Lle/i;->a:Lke/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lle/i;->b:Lh9/a;

    iget-object v3, p1, Lle/i;->b:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lle/i;->c:Lke/a;

    iget-object v3, p1, Lle/i;->c:Lke/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lle/i;->d:LS8/a;

    iget-object v3, p1, Lle/i;->d:LS8/a;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lle/i;->e:LS8/e;

    iget-object v3, p1, Lle/i;->e:LS8/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lle/i;->f:LS8/l;

    iget-object v3, p1, Lle/i;->f:LS8/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lle/i;->g:J

    iget-wide v5, p1, Lle/i;->g:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lle/i;->h:LS8/j;

    iget-object v3, p1, Lle/i;->h:LS8/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lle/i;->i:Lcom/ui/wifiman/model/vendor/d;

    iget-object v3, p1, Lle/i;->i:Lcom/ui/wifiman/model/vendor/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lle/i;->j:Ljava/lang/Boolean;

    iget-object v3, p1, Lle/i;->j:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lle/i;->k:Z

    iget-boolean v3, p1, Lle/i;->k:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lle/i;->l:Lcom/ubnt/usurvey/wifi/WifiMcs;

    iget-object v3, p1, Lle/i;->l:Lcom/ubnt/usurvey/wifi/WifiMcs;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lle/i;->m:Ljava/lang/Integer;

    iget-object v3, p1, Lle/i;->m:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lle/i;->n:Ljava/lang/Float;

    iget-object v3, p1, Lle/i;->n:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lle/i;->o:Ljava/lang/Integer;

    iget-object v3, p1, Lle/i;->o:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lle/i;->p:LW7/a;

    iget-object v3, p1, Lle/i;->p:LW7/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lle/i;->q:LW7/a;

    iget-object v3, p1, Lle/i;->q:LW7/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lle/i;->r:Ljava/util/Set;

    iget-object p1, p1, Lle/i;->r:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final f()LS8/e;
    .locals 1

    iget-object v0, p0, Lle/i;->e:LS8/e;

    return-object v0
.end method

.method public final g()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lle/i;->o:Ljava/lang/Integer;

    return-object v0
.end method

.method public final h()LW7/a;
    .locals 1

    iget-object v0, p0, Lle/i;->q:LW7/a;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lle/i;->s:Ljava/lang/String;

    invoke-static {v0}, LS8/k;->e(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final i()La8/b;
    .locals 1

    iget-object v0, p0, Lle/i;->t:La8/b;

    return-object v0
.end method

.method public final j()D
    .locals 2

    iget-object v0, p0, Lle/i;->w:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lle/i;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final l()LS8/a;
    .locals 1

    iget-object v0, p0, Lle/i;->d:LS8/a;

    return-object v0
.end method

.method public final m()Lke/a;
    .locals 1

    iget-object v0, p0, Lle/i;->c:Lke/a;

    return-object v0
.end method

.method public final n()Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 1

    iget-object v0, p0, Lle/i;->l:Lcom/ubnt/usurvey/wifi/WifiMcs;

    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lle/i;->u:Ljava/lang/String;

    return-object v0
.end method

.method public final p()LS8/j;
    .locals 1

    iget-object v0, p0, Lle/i;->h:LS8/j;

    return-object v0
.end method

.method public final q()LS8/l;
    .locals 1

    iget-object v0, p0, Lle/i;->v:LS8/l;

    return-object v0
.end method

.method public final r()Lke/c;
    .locals 1

    iget-object v0, p0, Lle/i;->a:Lke/c;

    return-object v0
.end method

.method public final s()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lle/i;->m:Ljava/lang/Integer;

    return-object v0
.end method

.method public final t()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lle/i;->n:Ljava/lang/Float;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lle/i;->a:Lke/c;

    iget-object v2, v0, Lle/i;->b:Lh9/a;

    iget-object v3, v0, Lle/i;->c:Lke/a;

    iget-object v4, v0, Lle/i;->d:LS8/a;

    iget-object v5, v0, Lle/i;->e:LS8/e;

    iget-object v6, v0, Lle/i;->f:LS8/l;

    iget-wide v7, v0, Lle/i;->g:J

    iget-object v9, v0, Lle/i;->h:LS8/j;

    iget-object v10, v0, Lle/i;->i:Lcom/ui/wifiman/model/vendor/d;

    iget-object v11, v0, Lle/i;->j:Ljava/lang/Boolean;

    iget-boolean v12, v0, Lle/i;->k:Z

    iget-object v13, v0, Lle/i;->l:Lcom/ubnt/usurvey/wifi/WifiMcs;

    iget-object v14, v0, Lle/i;->m:Ljava/lang/Integer;

    iget-object v15, v0, Lle/i;->n:Ljava/lang/Float;

    move-object/from16 v16, v15

    iget-object v15, v0, Lle/i;->o:Ljava/lang/Integer;

    move-object/from16 v17, v15

    iget-object v15, v0, Lle/i;->p:LW7/a;

    move-object/from16 v18, v15

    iget-object v15, v0, Lle/i;->q:LW7/a;

    move-object/from16 v19, v15

    iget-object v15, v0, Lle/i;->r:Ljava/util/Set;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v20, v15

    const-string v15, "WifiSignal(ssid="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bssid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ieeeMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastSeenTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", securityType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", vendor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wifiRTTSupport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", networkLinked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mcs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transmitPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", utilization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dataRateCapability="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dataRateOverallCapability="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", affiliatedMloLinks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, Lle/i;->i:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public final v()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lle/i;->j:Ljava/lang/Boolean;

    return-object v0
.end method
