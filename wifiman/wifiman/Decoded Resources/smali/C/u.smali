.class public final LC/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/n;
.implements LC0/D;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Lw/q;

.field private final f:I

.field private final g:I

.field private final h:Z

.field private final i:I

.field private final j:LC/e;

.field private final k:LC/e;

.field private l:F

.field private m:I

.field private n:Z

.field private final o:Lx/j;

.field private final p:Z

.field private final q:Ljava/util/List;

.field private final r:Ljava/util/List;

.field private final s:LIi/N;

.field private final synthetic t:LC0/D;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;IIILw/q;IIZILC/e;LC/e;FIZLx/j;LC0/D;ZLjava/util/List;Ljava/util/List;LIi/N;)V
    .locals 2

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 2
    iput-object v1, v0, LC/u;->a:Ljava/util/List;

    move v1, p2

    .line 3
    iput v1, v0, LC/u;->b:I

    move v1, p3

    .line 4
    iput v1, v0, LC/u;->c:I

    move v1, p4

    .line 5
    iput v1, v0, LC/u;->d:I

    move-object v1, p5

    .line 6
    iput-object v1, v0, LC/u;->e:Lw/q;

    move v1, p6

    .line 7
    iput v1, v0, LC/u;->f:I

    move v1, p7

    .line 8
    iput v1, v0, LC/u;->g:I

    move v1, p8

    .line 9
    iput-boolean v1, v0, LC/u;->h:Z

    move v1, p9

    .line 10
    iput v1, v0, LC/u;->i:I

    move-object v1, p10

    .line 11
    iput-object v1, v0, LC/u;->j:LC/e;

    move-object v1, p11

    .line 12
    iput-object v1, v0, LC/u;->k:LC/e;

    move v1, p12

    .line 13
    iput v1, v0, LC/u;->l:F

    move v1, p13

    .line 14
    iput v1, v0, LC/u;->m:I

    move/from16 v1, p14

    .line 15
    iput-boolean v1, v0, LC/u;->n:Z

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, LC/u;->o:Lx/j;

    move/from16 v1, p17

    .line 17
    iput-boolean v1, v0, LC/u;->p:Z

    move-object/from16 v1, p18

    .line 18
    iput-object v1, v0, LC/u;->q:Ljava/util/List;

    move-object/from16 v1, p19

    .line 19
    iput-object v1, v0, LC/u;->r:Ljava/util/List;

    move-object/from16 v1, p20

    .line 20
    iput-object v1, v0, LC/u;->s:LIi/N;

    move-object/from16 v1, p16

    .line 21
    iput-object v1, v0, LC/u;->t:LC0/D;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;IIILw/q;IIZILC/e;LC/e;FIZLx/j;LC0/D;ZLjava/util/List;Ljava/util/List;LIi/N;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    const/high16 v0, 0x20000

    and-int v0, p21, v0

    if-eqz v0, :cond_0

    .line 22
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    move-object/from16 v19, v0

    goto :goto_0

    :cond_0
    move-object/from16 v19, p18

    :goto_0
    const/high16 v0, 0x40000

    and-int v0, p21, v0

    if-eqz v0, :cond_1

    .line 23
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    move-object/from16 v20, v0

    goto :goto_1

    :cond_1
    move-object/from16 v20, p19

    :goto_1
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v21, p20

    .line 24
    invoke-direct/range {v1 .. v21}, LC/u;-><init>(Ljava/util/List;IIILw/q;IIZILC/e;LC/e;FIZLx/j;LC0/D;ZLjava/util/List;Ljava/util/List;LIi/N;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, LC/u;->h:Z

    return v0
.end method

.method public b()J
    .locals 2

    invoke-virtual {p0}, LC/u;->getWidth()I

    move-result v0

    invoke-virtual {p0}, LC/u;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, LY0/s;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LC/u;->d:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LC/u;->g:I

    return v0
.end method

.method public e()Lw/q;
    .locals 1

    iget-object v0, p0, LC/u;->e:Lw/q;

    return-object v0
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, LC/u;->g()I

    move-result v0

    neg-int v0, v0

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LC/u;->f:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, LC/u;->t:LC0/D;

    invoke-interface {v0}, LC0/D;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, LC/u;->t:LC0/D;

    invoke-interface {v0}, LC0/D;->getWidth()I

    move-result v0

    return v0
.end method

.method public h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LC/u;->a:Ljava/util/List;

    return-object v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, LC/u;->b:I

    return v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, LC/u;->c:I

    return v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, LC/u;->i:I

    return v0
.end method

.method public l()Lx/j;
    .locals 1

    iget-object v0, p0, LC/u;->o:Lx/j;

    return-object v0
.end method

.method public final m()Z
    .locals 2

    iget-object v0, p0, LC/u;->j:LC/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LC/e;->getIndex()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget v0, p0, LC/u;->m:I

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, LC/u;->n:Z

    return v0
.end method

.method public final o()LC/e;
    .locals 1

    iget-object v0, p0, LC/u;->k:LC/e;

    return-object v0
.end method

.method public p()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LC/u;->t:LC0/D;

    invoke-interface {v0}, LC0/D;->p()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, LC/u;->t:LC0/D;

    invoke-interface {v0}, LC0/D;->q()V

    return-void
.end method

.method public r()Lmh/l;
    .locals 1

    iget-object v0, p0, LC/u;->t:LC0/D;

    invoke-interface {v0}, LC0/D;->r()Lmh/l;

    move-result-object v0

    return-object v0
.end method

.method public final s()F
    .locals 1

    iget v0, p0, LC/u;->l:F

    return v0
.end method

.method public final t()LC/e;
    .locals 1

    iget-object v0, p0, LC/u;->j:LC/e;

    return-object v0
.end method

.method public final u()I
    .locals 1

    iget v0, p0, LC/u;->m:I

    return v0
.end method

.method public final v(I)Z
    .locals 6

    invoke-virtual {p0}, LC/u;->i()I

    move-result v0

    invoke-virtual {p0}, LC/u;->j()I

    move-result v1

    add-int/2addr v0, v1

    iget-boolean v1, p0, LC/u;->p:Z

    const/4 v2, 0x0

    if-nez v1, :cond_6

    invoke-virtual {p0}, LC/u;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, LC/u;->j:LC/e;

    if-eqz v1, :cond_6

    iget v1, p0, LC/u;->m:I

    sub-int/2addr v1, p1

    if-ltz v1, :cond_6

    if-ge v1, v0, :cond_6

    if-eqz v0, :cond_0

    int-to-float v1, p1

    int-to-float v3, v0

    div-float/2addr v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget v3, p0, LC/u;->l:F

    sub-float/2addr v3, v1

    iget-object v4, p0, LC/u;->k:LC/e;

    if-eqz v4, :cond_6

    const/high16 v4, 0x3f000000    # 0.5f

    cmpl-float v4, v3, v4

    if-gez v4, :cond_6

    const/high16 v4, -0x41000000    # -0.5f

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-virtual {p0}, LC/u;->h()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC/e;

    invoke-virtual {p0}, LC/u;->h()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC/e;

    if-gez p1, :cond_2

    invoke-virtual {v3}, LC/e;->b()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {p0}, LC/u;->g()I

    move-result v5

    sub-int/2addr v3, v5

    invoke-virtual {v4}, LC/e;->b()I

    move-result v4

    add-int/2addr v4, v0

    invoke-virtual {p0}, LC/u;->d()I

    move-result v0

    sub-int/2addr v4, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    neg-int v3, p1

    if-le v0, v3, :cond_6

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, LC/u;->g()I

    move-result v0

    invoke-virtual {v3}, LC/e;->b()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {p0}, LC/u;->d()I

    move-result v3

    invoke-virtual {v4}, LC/e;->b()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-le v0, p1, :cond_6

    :goto_1
    iget v0, p0, LC/u;->l:F

    sub-float/2addr v0, v1

    iput v0, p0, LC/u;->l:F

    iget v0, p0, LC/u;->m:I

    sub-int/2addr v0, p1

    iput v0, p0, LC/u;->m:I

    invoke-virtual {p0}, LC/u;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move v3, v2

    :goto_2
    if-ge v3, v1, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC/e;

    invoke-virtual {v4, p1}, LC/e;->a(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget-object v0, p0, LC/u;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move v3, v2

    :goto_3
    if-ge v3, v1, :cond_4

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC/e;

    invoke-virtual {v4, p1}, LC/e;->a(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    iget-object v0, p0, LC/u;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_4
    if-ge v2, v1, :cond_5

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC/e;

    invoke-virtual {v3, p1}, LC/e;->a(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    iget-boolean v0, p0, LC/u;->n:Z

    const/4 v2, 0x1

    if-nez v0, :cond_6

    if-lez p1, :cond_6

    iput-boolean v2, p0, LC/u;->n:Z

    :cond_6
    :goto_5
    return v2
.end method
