.class public final Lnd/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnd/f$a;
    }
.end annotation


# static fields
.field public static final t:Lnd/f$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lh9/a;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:LS8/l;

.field private final h:Ljava/lang/Integer;

.field private final i:LV7/a;

.field private final j:LV7/b;

.field private final k:LV7/a;

.field private final l:LV7/b;

.field private final m:LW7/a;

.field private final n:Lb8/b;

.field private final o:Lb8/b;

.field private final p:Lb8/d;

.field private final q:LS8/c;

.field private final r:LS8/a;

.field private final s:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnd/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnd/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lnd/f;->t:Lnd/f$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh9/a;Ljava/lang/String;Ljava/lang/String;LS8/l;Ljava/lang/Integer;LV7/a;LV7/b;LV7/a;LV7/b;LW7/a;Lb8/b;Lb8/b;Lb8/d;LS8/c;LS8/a;J)V
    .locals 4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    const-string v3, "id"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "name"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lnd/f;->a:Ljava/lang/String;

    iput-object v2, v0, Lnd/f;->b:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lnd/f;->c:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lnd/f;->d:Lh9/a;

    move-object v1, p5

    iput-object v1, v0, Lnd/f;->e:Ljava/lang/String;

    move-object v1, p6

    iput-object v1, v0, Lnd/f;->f:Ljava/lang/String;

    move-object v1, p7

    iput-object v1, v0, Lnd/f;->g:LS8/l;

    move-object v1, p8

    iput-object v1, v0, Lnd/f;->h:Ljava/lang/Integer;

    move-object v1, p9

    iput-object v1, v0, Lnd/f;->i:LV7/a;

    move-object v1, p10

    iput-object v1, v0, Lnd/f;->j:LV7/b;

    move-object v1, p11

    iput-object v1, v0, Lnd/f;->k:LV7/a;

    move-object/from16 v1, p12

    iput-object v1, v0, Lnd/f;->l:LV7/b;

    move-object/from16 v1, p13

    iput-object v1, v0, Lnd/f;->m:LW7/a;

    move-object/from16 v1, p14

    iput-object v1, v0, Lnd/f;->n:Lb8/b;

    move-object/from16 v1, p15

    iput-object v1, v0, Lnd/f;->o:Lb8/b;

    move-object/from16 v1, p16

    iput-object v1, v0, Lnd/f;->p:Lb8/d;

    move-object/from16 v1, p17

    iput-object v1, v0, Lnd/f;->q:LS8/c;

    move-object/from16 v1, p18

    iput-object v1, v0, Lnd/f;->r:LS8/a;

    move-wide/from16 v1, p19

    iput-wide v1, v0, Lnd/f;->s:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnd/f;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnd/f;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final c()LS8/c;
    .locals 1

    iget-object v0, p0, Lnd/f;->q:LS8/c;

    return-object v0
.end method

.method public final d()Lh9/a;
    .locals 1

    iget-object v0, p0, Lnd/f;->d:Lh9/a;

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lnd/f;->s:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnd/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnd/f;

    iget-object v1, p0, Lnd/f;->a:Ljava/lang/String;

    iget-object v3, p1, Lnd/f;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lnd/f;->b:Ljava/lang/String;

    iget-object v3, p1, Lnd/f;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lnd/f;->c:Ljava/lang/String;

    iget-object v3, p1, Lnd/f;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lnd/f;->d:Lh9/a;

    iget-object v3, p1, Lnd/f;->d:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lnd/f;->e:Ljava/lang/String;

    iget-object v3, p1, Lnd/f;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lnd/f;->f:Ljava/lang/String;

    iget-object v3, p1, Lnd/f;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lnd/f;->g:LS8/l;

    iget-object v3, p1, Lnd/f;->g:LS8/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lnd/f;->h:Ljava/lang/Integer;

    iget-object v3, p1, Lnd/f;->h:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lnd/f;->i:LV7/a;

    iget-object v3, p1, Lnd/f;->i:LV7/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lnd/f;->j:LV7/b;

    iget-object v3, p1, Lnd/f;->j:LV7/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lnd/f;->k:LV7/a;

    iget-object v3, p1, Lnd/f;->k:LV7/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lnd/f;->l:LV7/b;

    iget-object v3, p1, Lnd/f;->l:LV7/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lnd/f;->m:LW7/a;

    iget-object v3, p1, Lnd/f;->m:LW7/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lnd/f;->n:Lb8/b;

    iget-object v3, p1, Lnd/f;->n:Lb8/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lnd/f;->o:Lb8/b;

    iget-object v3, p1, Lnd/f;->o:Lb8/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lnd/f;->p:Lb8/d;

    iget-object v3, p1, Lnd/f;->p:Lb8/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lnd/f;->q:LS8/c;

    iget-object v3, p1, Lnd/f;->q:LS8/c;

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lnd/f;->r:LS8/a;

    iget-object v3, p1, Lnd/f;->r:LS8/a;

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-wide v3, p0, Lnd/f;->s:J

    iget-wide v5, p1, Lnd/f;->s:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final f()Lb8/b;
    .locals 1

    iget-object v0, p0, Lnd/f;->o:Lb8/b;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnd/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final h()LS8/a;
    .locals 1

    iget-object v0, p0, Lnd/f;->r:LS8/a;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lnd/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->c:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->d:Lh9/a;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lh9/a;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->e:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->f:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->g:LS8/l;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, LS8/l;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->h:Ljava/lang/Integer;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->i:LV7/a;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, LW7/f;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->j:LV7/b;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->k:LV7/a;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, LW7/f;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->l:LV7/b;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->m:LW7/a;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, LW7/a;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->n:Lb8/b;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Lb8/b;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->o:Lb8/b;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Lb8/b;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->p:Lb8/d;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Lb8/d;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->q:LS8/c;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnd/f;->r:LS8/a;

    if-nez v1, :cond_f

    goto :goto_f

    :cond_f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lnd/f;->s:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lb8/b;
    .locals 1

    iget-object v0, p0, Lnd/f;->n:Lb8/b;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnd/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Lb8/d;
    .locals 1

    iget-object v0, p0, Lnd/f;->p:Lb8/d;

    return-object v0
.end method

.method public final l()LS8/l;
    .locals 1

    iget-object v0, p0, Lnd/f;->g:LS8/l;

    return-object v0
.end method

.method public final m()LV7/b;
    .locals 1

    iget-object v0, p0, Lnd/f;->j:LV7/b;

    return-object v0
.end method

.method public final n()LV7/a;
    .locals 1

    iget-object v0, p0, Lnd/f;->i:LV7/a;

    return-object v0
.end method

.method public final o()LV7/b;
    .locals 1

    iget-object v0, p0, Lnd/f;->l:LV7/b;

    return-object v0
.end method

.method public final p()LV7/a;
    .locals 1

    iget-object v0, p0, Lnd/f;->k:LV7/a;

    return-object v0
.end method

.method public final q()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lnd/f;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnd/f;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final s()LW7/a;
    .locals 1

    iget-object v0, p0, Lnd/f;->m:LW7/a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lnd/f;->a:Ljava/lang/String;

    iget-object v2, v0, Lnd/f;->b:Ljava/lang/String;

    iget-object v3, v0, Lnd/f;->c:Ljava/lang/String;

    iget-object v4, v0, Lnd/f;->d:Lh9/a;

    iget-object v5, v0, Lnd/f;->e:Ljava/lang/String;

    iget-object v6, v0, Lnd/f;->f:Ljava/lang/String;

    iget-object v7, v0, Lnd/f;->g:LS8/l;

    iget-object v8, v0, Lnd/f;->h:Ljava/lang/Integer;

    iget-object v9, v0, Lnd/f;->i:LV7/a;

    iget-object v10, v0, Lnd/f;->j:LV7/b;

    iget-object v11, v0, Lnd/f;->k:LV7/a;

    iget-object v12, v0, Lnd/f;->l:LV7/b;

    iget-object v13, v0, Lnd/f;->m:LW7/a;

    iget-object v14, v0, Lnd/f;->n:Lb8/b;

    iget-object v15, v0, Lnd/f;->o:Lb8/b;

    move-object/from16 v16, v15

    iget-object v15, v0, Lnd/f;->p:Lb8/d;

    move-object/from16 v17, v15

    iget-object v15, v0, Lnd/f;->q:LS8/c;

    move-object/from16 v18, v15

    iget-object v15, v0, Lnd/f;->r:LS8/a;

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    iget-wide v14, v0, Lnd/f;->s:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v21, v14

    const-string v14, "SignalMapperPlace(id="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ssid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bssid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", apModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", apName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", signalWifi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", simPrimaryIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sim0Signal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sim0Connection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sim1Signal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sim1Connection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", throughput="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", latency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dnsLatency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", packetLoss="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", band="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ieeeMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", created="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v21

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
