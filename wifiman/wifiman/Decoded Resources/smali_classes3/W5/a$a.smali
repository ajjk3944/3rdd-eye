.class public final LW5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lo6/d;

.field private final b:J

.field private final c:J

.field private final d:I

.field private final e:F

.field private final f:F

.field private final g:F

.field private final h:F

.field private final i:F

.field private final j:Landroid/graphics/Typeface;

.field private final k:Landroid/graphics/Paint$Align;

.field private final l:J

.field private final m:F

.field private final n:Lo6/c;

.field private final o:J

.field private final p:F

.field private final q:Lo6/c;

.field private final r:J

.field private final s:F

.field private final t:Lo6/c;

.field private final u:F

.field private final v:LZ5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lo6/d;JJIFFFFFLandroid/graphics/Typeface;Landroid/graphics/Paint$Align;JFLo6/c;JFLo6/c;JFLo6/c;FLZ5/a;)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 3
    iput-object v1, v0, LW5/a$a;->a:Lo6/d;

    move-wide v1, p2

    .line 4
    iput-wide v1, v0, LW5/a$a;->b:J

    move-wide v1, p4

    .line 5
    iput-wide v1, v0, LW5/a$a;->c:J

    move v1, p6

    .line 6
    iput v1, v0, LW5/a$a;->d:I

    move v1, p7

    .line 7
    iput v1, v0, LW5/a$a;->e:F

    move v1, p8

    .line 8
    iput v1, v0, LW5/a$a;->f:F

    move v1, p9

    .line 9
    iput v1, v0, LW5/a$a;->g:F

    move v1, p10

    .line 10
    iput v1, v0, LW5/a$a;->h:F

    move v1, p11

    .line 11
    iput v1, v0, LW5/a$a;->i:F

    move-object v1, p12

    .line 12
    iput-object v1, v0, LW5/a$a;->j:Landroid/graphics/Typeface;

    move-object/from16 v1, p13

    .line 13
    iput-object v1, v0, LW5/a$a;->k:Landroid/graphics/Paint$Align;

    move-wide/from16 v1, p14

    .line 14
    iput-wide v1, v0, LW5/a$a;->l:J

    move/from16 v1, p16

    .line 15
    iput v1, v0, LW5/a$a;->m:F

    move-object/from16 v1, p17

    .line 16
    iput-object v1, v0, LW5/a$a;->n:Lo6/c;

    move-wide/from16 v1, p18

    .line 17
    iput-wide v1, v0, LW5/a$a;->o:J

    move/from16 v1, p20

    .line 18
    iput v1, v0, LW5/a$a;->p:F

    move-object/from16 v1, p21

    .line 19
    iput-object v1, v0, LW5/a$a;->q:Lo6/c;

    move-wide/from16 v1, p22

    .line 20
    iput-wide v1, v0, LW5/a$a;->r:J

    move/from16 v1, p24

    .line 21
    iput v1, v0, LW5/a$a;->s:F

    move-object/from16 v1, p25

    .line 22
    iput-object v1, v0, LW5/a$a;->t:Lo6/c;

    move/from16 v1, p26

    .line 23
    iput v1, v0, LW5/a$a;->u:F

    move-object/from16 v1, p27

    .line 24
    iput-object v1, v0, LW5/a$a;->v:LZ5/a;

    return-void
.end method

.method public synthetic constructor <init>(Lo6/d;JJIFFFFFLandroid/graphics/Typeface;Landroid/graphics/Paint$Align;JFLo6/c;JFLo6/c;JFLo6/c;FLZ5/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 31

    move/from16 v0, p28

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    const/16 v1, 0xc

    .line 25
    invoke-static {v1}, LY0/w;->g(I)J

    move-result-wide v1

    move-wide v6, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    move v8, v1

    goto :goto_2

    :cond_2
    move/from16 v8, p6

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    const/4 v1, 0x2

    int-to-float v1, v1

    .line 26
    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move v9, v1

    goto :goto_3

    :cond_3
    move/from16 v9, p7

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    int-to-float v1, v1

    .line 27
    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move v10, v1

    goto :goto_4

    :cond_4
    move/from16 v10, p8

    :goto_4
    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    int-to-float v1, v2

    .line 28
    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move v11, v1

    goto :goto_5

    :cond_5
    move/from16 v11, p9

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    int-to-float v1, v2

    .line 29
    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move v12, v1

    goto :goto_6

    :cond_6
    move/from16 v12, p10

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    move v13, v1

    goto :goto_7

    :cond_7
    move/from16 v13, p11

    :goto_7
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_8

    .line 30
    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    const-string/jumbo v2, "MONOSPACE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v14, v1

    goto :goto_8

    :cond_8
    move-object/from16 v14, p12

    :goto_8
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_9

    .line 31
    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    move-object v15, v1

    goto :goto_9

    :cond_9
    move-object/from16 v15, p13

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_a

    .line 32
    invoke-static {v2}, LY0/h;->j(F)F

    move-result v1

    move/from16 v18, v1

    goto :goto_a

    :cond_a
    move/from16 v18, p16

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    const/high16 v4, 0x40800000    # 4.0f

    if-eqz v1, :cond_b

    .line 33
    sget-object v1, Lo6/e;->a:Lo6/e;

    .line 34
    invoke-virtual {v1}, Lo6/e;->b()Lo6/c;

    move-result-object v5

    .line 35
    invoke-static {v4}, LY0/h;->j(F)F

    move-result v16

    const/high16 v17, 0x40000000    # 2.0f

    .line 36
    invoke-static/range {v17 .. v17}, LY0/h;->j(F)F

    move-result v17

    const/16 v19, 0x8

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 p4, v1

    move-object/from16 p5, v5

    move/from16 p6, v16

    move/from16 p7, v17

    move-object/from16 p8, v21

    move/from16 p9, v19

    move-object/from16 p10, v20

    .line 37
    invoke-static/range {p4 .. p10}, LQ5/a;->d(Lo6/e;Lo6/c;FFLo6/a$a;ILjava/lang/Object;)Lo6/a;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_b

    :cond_b
    move-object/from16 v19, p17

    :goto_b
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    .line 38
    invoke-static {v2}, LY0/h;->j(F)F

    move-result v1

    move/from16 v22, v1

    goto :goto_c

    :cond_c
    move/from16 v22, p20

    :goto_c
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    .line 39
    sget-object v1, Lo6/e;->a:Lo6/e;

    invoke-virtual {v1}, Lo6/e;->b()Lo6/c;

    move-result-object v1

    move-object/from16 v23, v1

    goto :goto_d

    :cond_d
    move-object/from16 v23, p21

    :goto_d
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-wide/from16 v24, p18

    goto :goto_e

    :cond_e
    move-wide/from16 v24, p22

    :goto_e
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move/from16 v26, v22

    goto :goto_f

    :cond_f
    move/from16 v26, p24

    :goto_f
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    .line 40
    sget-object v1, Lo6/e;->a:Lo6/e;

    invoke-virtual {v1}, Lo6/e;->b()Lo6/c;

    move-result-object v1

    move-object/from16 v27, v1

    goto :goto_10

    :cond_10
    move-object/from16 v27, p25

    :goto_10
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    .line 41
    invoke-static {v4}, LY0/h;->j(F)F

    move-result v1

    move/from16 v28, v1

    goto :goto_11

    :cond_11
    move/from16 v28, p26

    :goto_11
    const/high16 v1, 0x200000

    and-int/2addr v0, v1

    if-eqz v0, :cond_12

    .line 42
    new-instance v0, LZ5/b;

    invoke-direct {v0}, LZ5/b;-><init>()V

    move-object/from16 v29, v0

    goto :goto_12

    :cond_12
    move-object/from16 v29, p27

    :goto_12
    const/16 v30, 0x0

    move-object/from16 v2, p0

    move-wide/from16 v4, p2

    move-wide/from16 v16, p14

    move-wide/from16 v20, p18

    .line 43
    invoke-direct/range {v2 .. v30}, LW5/a$a;-><init>(Lo6/d;JJIFFFFFLandroid/graphics/Typeface;Landroid/graphics/Paint$Align;JFLo6/c;JFLo6/c;JFLo6/c;FLZ5/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lo6/d;JJIFFFFFLandroid/graphics/Typeface;Landroid/graphics/Paint$Align;JFLo6/c;JFLo6/c;JFLo6/c;FLZ5/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p27}, LW5/a$a;-><init>(Lo6/d;JJIFFFFFLandroid/graphics/Typeface;Landroid/graphics/Paint$Align;JFLo6/c;JFLo6/c;JFLo6/c;FLZ5/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lo6/d;
    .locals 1

    iget-object v0, p0, LW5/a$a;->a:Lo6/d;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, LW5/a$a;->b:J

    return-wide v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, LW5/a$a;->h:F

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, LW5/a$a;->f:F

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LW5/a$a;->d:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LW5/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LW5/a$a;

    iget-object v1, p0, LW5/a$a;->a:Lo6/d;

    iget-object v3, p1, LW5/a$a;->a:Lo6/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, LW5/a$a;->b:J

    iget-wide v5, p1, LW5/a$a;->b:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, LW5/a$a;->c:J

    iget-wide v5, p1, LW5/a$a;->c:J

    invoke-static {v3, v4, v5, v6}, LY0/v;->e(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, LW5/a$a;->d:I

    iget v3, p1, LW5/a$a;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, LW5/a$a;->e:F

    iget v3, p1, LW5/a$a;->e:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, LW5/a$a;->f:F

    iget v3, p1, LW5/a$a;->f:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, LW5/a$a;->g:F

    iget v3, p1, LW5/a$a;->g:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, LW5/a$a;->h:F

    iget v3, p1, LW5/a$a;->h:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, LW5/a$a;->i:F

    iget v3, p1, LW5/a$a;->i:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, LW5/a$a;->j:Landroid/graphics/Typeface;

    iget-object v3, p1, LW5/a$a;->j:Landroid/graphics/Typeface;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, LW5/a$a;->k:Landroid/graphics/Paint$Align;

    iget-object v3, p1, LW5/a$a;->k:Landroid/graphics/Paint$Align;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, LW5/a$a;->l:J

    iget-wide v5, p1, LW5/a$a;->l:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, LW5/a$a;->m:F

    iget v3, p1, LW5/a$a;->m:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, LW5/a$a;->n:Lo6/c;

    iget-object v3, p1, LW5/a$a;->n:Lo6/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, LW5/a$a;->o:J

    iget-wide v5, p1, LW5/a$a;->o:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, LW5/a$a;->p:F

    iget v3, p1, LW5/a$a;->p:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, LW5/a$a;->q:Lo6/c;

    iget-object v3, p1, LW5/a$a;->q:Lo6/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-wide v3, p0, LW5/a$a;->r:J

    iget-wide v5, p1, LW5/a$a;->r:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, LW5/a$a;->s:F

    iget v3, p1, LW5/a$a;->s:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, LW5/a$a;->t:Lo6/c;

    iget-object v3, p1, LW5/a$a;->t:Lo6/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget v1, p0, LW5/a$a;->u:F

    iget v3, p1, LW5/a$a;->u:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, LW5/a$a;->v:LZ5/a;

    iget-object p1, p1, LW5/a$a;->v:LZ5/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final f()Landroid/graphics/Paint$Align;
    .locals 1

    iget-object v0, p0, LW5/a$a;->k:Landroid/graphics/Paint$Align;

    return-object v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, LW5/a$a;->c:J

    return-wide v0
.end method

.method public final h()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, LW5/a$a;->j:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LW5/a$a;->a:Lo6/d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LW5/a$a;->b:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LW5/a$a;->c:J

    invoke-static {v1, v2}, LY0/v;->i(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LW5/a$a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LW5/a$a;->e:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LW5/a$a;->f:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LW5/a$a;->g:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LW5/a$a;->h:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LW5/a$a;->i:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LW5/a$a;->j:Landroid/graphics/Typeface;

    invoke-virtual {v1}, Landroid/graphics/Typeface;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LW5/a$a;->k:Landroid/graphics/Paint$Align;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LW5/a$a;->l:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LW5/a$a;->m:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LW5/a$a;->n:Lo6/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LW5/a$a;->o:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LW5/a$a;->p:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LW5/a$a;->q:Lo6/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LW5/a$a;->r:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LW5/a$a;->s:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LW5/a$a;->t:Lo6/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LW5/a$a;->u:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LW5/a$a;->v:LZ5/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, LW5/a$a;->g:F

    return v0
.end method

.method public final j()F
    .locals 1

    iget v0, p0, LW5/a$a;->e:F

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Axis(axisLabelBackground="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a$a;->a:Lo6/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLabelColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LW5/a$a;->b:J

    invoke-static {v1, v2}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLabelTextSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LW5/a$a;->c:J

    invoke-static {v1, v2}, LY0/v;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLabelLineCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LW5/a$a;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", axisLabelVerticalPadding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LW5/a$a;->e:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLabelHorizontalPadding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LW5/a$a;->f:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLabelVerticalMargin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LW5/a$a;->g:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLabelHorizontalMargin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LW5/a$a;->h:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLabelRotationDegrees="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LW5/a$a;->i:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", axisLabelTypeface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a$a;->j:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLabelTextAlign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a$a;->k:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisGuidelineColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LW5/a$a;->l:J

    invoke-static {v1, v2}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisGuidelineWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LW5/a$a;->m:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisGuidelineShape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a$a;->n:Lo6/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLineColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LW5/a$a;->o:J

    invoke-static {v1, v2}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLineWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LW5/a$a;->p:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisLineShape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a$a;->q:Lo6/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisTickColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LW5/a$a;->r:J

    invoke-static {v1, v2}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisTickWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LW5/a$a;->s:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisTickShape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a$a;->t:Lo6/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisTickLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LW5/a$a;->u:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", axisValueFormatter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a$a;->v:LZ5/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
