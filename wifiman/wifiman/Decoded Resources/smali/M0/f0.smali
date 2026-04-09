.class public final LM0/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/text/TextPaint;

.field private final b:Z

.field private final c:Z

.field private final d:LM0/H;

.field private final e:Z

.field private f:LN0/i;

.field private final g:Landroid/text/Layout;

.field private final h:I

.field private final i:I

.field private final j:I

.field private final k:F

.field private final l:F

.field private final m:Z

.field private final n:Landroid/graphics/Paint$FontMetricsInt;

.field private final o:I

.field private final p:[LO0/h;

.field private final q:Landroid/graphics/Rect;

.field private r:LM0/G;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILM0/H;)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    move-object/from16 v15, p3

    move/from16 v14, p11

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v15, v1, LM0/f0;->a:Landroid/text/TextPaint;

    move/from16 v13, p9

    .line 3
    iput-boolean v13, v1, LM0/f0;->b:Z

    move/from16 v12, p10

    .line 4
    iput-boolean v12, v1, LM0/f0;->c:Z

    move-object/from16 v3, p19

    .line 5
    iput-object v3, v1, LM0/f0;->d:LM0/H;

    .line 6
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, v1, LM0/f0;->q:Landroid/graphics/Rect;

    .line 7
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 8
    invoke-static/range {p6 .. p6}, LM0/h0;->k(I)Landroid/text/TextDirectionHeuristic;

    move-result-object v11

    .line 9
    sget-object v5, LM0/d0;->a:LM0/d0;

    move/from16 v6, p4

    invoke-virtual {v5, v6}, LM0/d0;->a(I)Landroid/text/Layout$Alignment;

    move-result-object v9

    .line 10
    instance-of v5, v0, Landroid/text/Spanned;

    if-eqz v5, :cond_0

    .line 11
    move-object v5, v0

    check-cast v5, Landroid/text/Spanned;

    const/4 v6, -0x1

    const-class v7, LO0/a;

    invoke-interface {v5, v6, v4, v7}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v5

    if-ge v5, v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 12
    :goto_0
    const-string v5, "TextLayout:initLayout"

    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 13
    :try_start_0
    invoke-virtual/range {p19 .. p19}, LM0/H;->a()Landroid/text/BoringLayout$Metrics;

    move-result-object v6

    move-object/from16 p4, v9

    float-to-double v8, v2

    move-object/from16 v16, v11

    .line 14
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-float v5, v10

    float-to-int v11, v5

    if-eqz v6, :cond_1

    .line 15
    invoke-virtual/range {p19 .. p19}, LM0/H;->b()F

    move-result v3

    cmpg-float v2, v3, v2

    if-gtz v2, :cond_1

    if-nez v4, :cond_1

    const/4 v10, 0x1

    .line 16
    iput-boolean v10, v1, LM0/f0;->m:Z

    .line 17
    sget-object v2, LM0/k;->a:LM0/k;

    move-object/from16 v3, p1

    move-object/from16 v4, p3

    move v5, v11

    move-object/from16 v7, p4

    const/4 v9, 0x0

    move/from16 v8, p9

    move v13, v9

    move/from16 v9, p10

    move/from16 v24, v10

    move-object/from16 v10, p5

    move-object/from16 v12, v16

    invoke-virtual/range {v2 .. v11}, LM0/k;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/BoringLayout$Metrics;Landroid/text/Layout$Alignment;ZZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;

    move-result-object v2

    move-object/from16 v26, v12

    move/from16 v25, v13

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    move-object/from16 v10, v16

    const/4 v7, 0x0

    const/16 v24, 0x1

    .line 18
    iput-boolean v7, v1, LM0/f0;->m:Z

    .line 19
    sget-object v2, LM0/a0;->a:LM0/a0;

    .line 20
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v16

    .line 21
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v9, v3

    const/4 v6, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, p3

    move v5, v11

    move/from16 v25, v7

    move/from16 v7, v16

    move-object v8, v10

    move/from16 v16, v9

    move-object/from16 v9, p4

    move-object v11, v10

    move/from16 v10, p11

    move-object/from16 v26, v11

    move-object/from16 v11, p5

    move/from16 v12, v16

    move/from16 v13, p7

    move/from16 v14, p8

    move/from16 v15, p16

    move/from16 v16, p9

    move/from16 v17, p10

    move/from16 v18, p12

    move/from16 v19, p13

    move/from16 v20, p14

    move/from16 v21, p15

    move-object/from16 v22, p17

    move-object/from16 v23, p18

    .line 22
    invoke-virtual/range {v2 .. v23}, LM0/a0;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;IIILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)Landroid/text/StaticLayout;

    move-result-object v2

    .line 23
    :goto_1
    iput-object v2, v1, LM0/f0;->g:Landroid/text/Layout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 25
    invoke-virtual {v2}, Landroid/text/Layout;->getLineCount()I

    move-result v3

    move/from16 v4, p11

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v1, LM0/f0;->h:I

    add-int/lit8 v5, v3, -0x1

    if-ge v3, v4, :cond_3

    :cond_2
    move/from16 v10, v25

    goto :goto_2

    .line 26
    :cond_3
    invoke-virtual {v2, v5}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v3

    if-gtz v3, :cond_4

    .line 27
    invoke-virtual {v2, v5}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v3

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-eq v3, v0, :cond_2

    :cond_4
    move/from16 v10, v24

    .line 28
    :goto_2
    iput-boolean v10, v1, LM0/f0;->e:Z

    .line 29
    invoke-static/range {p0 .. p0}, LM0/h0;->f(LM0/f0;)J

    move-result-wide v3

    .line 30
    invoke-static/range {p0 .. p0}, LM0/h0;->d(LM0/f0;)[LO0/h;

    move-result-object v0

    iput-object v0, v1, LM0/f0;->p:[LO0/h;

    if-eqz v0, :cond_5

    .line 31
    invoke-static {v0}, LM0/h0;->c([LO0/h;)J

    move-result-wide v6

    goto :goto_3

    :cond_5
    invoke-static {}, LM0/h0;->g()J

    move-result-wide v6

    .line 32
    :goto_3
    invoke-static {v3, v4}, LM0/i0;->c(J)I

    move-result v8

    invoke-static {v6, v7}, LM0/i0;->c(J)I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    iput v8, v1, LM0/f0;->i:I

    .line 33
    invoke-static {v3, v4}, LM0/i0;->b(J)I

    move-result v3

    invoke-static {v6, v7}, LM0/i0;->b(J)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v1, LM0/f0;->j:I

    move-object/from16 v3, p3

    move-object/from16 v4, v26

    .line 34
    invoke-static {v1, v3, v4, v0}, LM0/h0;->b(LM0/f0;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[LO0/h;)Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 35
    iget v3, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    invoke-virtual {v1, v5}, LM0/f0;->s(I)F

    move-result v4

    float-to-int v4, v4

    sub-int v8, v3, v4

    goto :goto_4

    :cond_6
    move/from16 v8, v25

    .line 36
    :goto_4
    iput v8, v1, LM0/f0;->o:I

    .line 37
    iput-object v0, v1, LM0/f0;->n:Landroid/graphics/Paint$FontMetricsInt;

    const/4 v0, 0x0

    const/4 v3, 0x2

    .line 38
    invoke-static {v2, v5, v0, v3, v0}, LO0/d;->b(Landroid/text/Layout;ILandroid/graphics/Paint;ILjava/lang/Object;)F

    move-result v4

    iput v4, v1, LM0/f0;->k:F

    .line 39
    invoke-static {v2, v5, v0, v3, v0}, LO0/d;->d(Landroid/text/Layout;ILandroid/graphics/Paint;ILjava/lang/Object;)F

    move-result v0

    iput v0, v1, LM0/f0;->l:F

    return-void

    .line 40
    :goto_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method

.method public synthetic constructor <init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILM0/H;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v7, v2

    goto :goto_0

    :cond_0
    move/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v8, v3

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    move v9, v1

    goto :goto_2

    :cond_2
    move/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    const/high16 v1, 0x3f800000    # 1.0f

    move v10, v1

    goto :goto_3

    :cond_3
    move/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    move v11, v1

    goto :goto_4

    :cond_4
    move/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move v12, v2

    goto :goto_5

    :cond_5
    move/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    move v13, v1

    goto :goto_6

    :cond_6
    move/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    const v1, 0x7fffffff

    move v14, v1

    goto :goto_7

    :cond_7
    move/from16 v14, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    move v15, v2

    goto :goto_8

    :cond_8
    move/from16 v15, p12

    :goto_8
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_9

    move/from16 v16, v2

    goto :goto_9

    :cond_9
    move/from16 v16, p13

    :goto_9
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_a

    move/from16 v17, v2

    goto :goto_a

    :cond_a
    move/from16 v17, p14

    :goto_a
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_b

    move/from16 v18, v2

    goto :goto_b

    :cond_b
    move/from16 v18, p15

    :goto_b
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move/from16 v19, v2

    goto :goto_c

    :cond_c
    move/from16 v19, p16

    :goto_c
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v20, v3

    goto :goto_d

    :cond_d
    move-object/from16 v20, p17

    :goto_d
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v21, v3

    goto :goto_e

    :cond_e
    move-object/from16 v21, p18

    :goto_e
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_f

    .line 41
    new-instance v0, LM0/H;

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    invoke-direct {v0, v1, v2, v9}, LM0/H;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    move-object/from16 v22, v0

    goto :goto_f

    :cond_f
    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v22, p19

    :goto_f
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p3

    .line 42
    invoke-direct/range {v3 .. v22}, LM0/f0;-><init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILM0/H;)V

    return-void
.end method

.method public static synthetic B(LM0/f0;IZILjava/lang/Object;)F
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LM0/f0;->A(IZ)F

    move-result p0

    return p0
.end method

.method public static synthetic E(LM0/f0;IZILjava/lang/Object;)F
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LM0/f0;->D(IZ)F

    move-result p0

    return p0
.end method

.method private final g(I)F
    .locals 1

    iget v0, p0, LM0/f0;->h:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    iget p1, p0, LM0/f0;->k:F

    iget v0, p0, LM0/f0;->l:F

    add-float/2addr p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final j()LM0/G;
    .locals 2

    iget-object v0, p0, LM0/f0;->r:LM0/G;

    if-nez v0, :cond_0

    new-instance v0, LM0/G;

    iget-object v1, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-direct {v0, v1}, LM0/G;-><init>(Landroid/text/Layout;)V

    iput-object v0, p0, LM0/f0;->r:LM0/G;

    return-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final A(IZ)F
    .locals 2

    invoke-direct {p0}, LM0/f0;->j()LM0/G;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, p2}, LM0/G;->c(IZZ)F

    move-result p2

    invoke-virtual {p0, p1}, LM0/f0;->q(I)I

    move-result p1

    invoke-direct {p0, p1}, LM0/f0;->g(I)F

    move-result p1

    add-float/2addr p2, p1

    return p2
.end method

.method public final C(Landroid/graphics/RectF;ILmh/p;)[I
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, LM0/f;->a:LM0/f;

    invoke-virtual {v0, p0, p1, p2, p3}, LM0/f;->c(LM0/f0;Landroid/graphics/RectF;ILmh/p;)[I

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-direct {p0}, LM0/f0;->j()LM0/G;

    move-result-object v2

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, LM0/g0;->d(LM0/f0;Landroid/text/Layout;LM0/G;Landroid/graphics/RectF;ILmh/p;)[I

    move-result-object p1

    return-object p1
.end method

.method public final D(IZ)F
    .locals 2

    invoke-direct {p0}, LM0/f0;->j()LM0/G;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, LM0/G;->c(IZZ)F

    move-result p2

    invoke-virtual {p0, p1}, LM0/f0;->q(I)I

    move-result p1

    invoke-direct {p0, p1}, LM0/f0;->g(I)F

    move-result p1

    add-float/2addr p2, p1

    return p2
.end method

.method public final F(IILandroid/graphics/Path;)V
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1, p2, p3}, Landroid/text/Layout;->getSelectionPath(IILandroid/graphics/Path;)V

    iget p1, p0, LM0/f0;->i:I

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Landroid/graphics/Path;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget p1, p0, LM0/f0;->i:I

    int-to-float p1, p1

    const/4 p2, 0x0

    invoke-virtual {p3, p2, p1}, Landroid/graphics/Path;->offset(FF)V

    :cond_0
    return-void
.end method

.method public final G()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final H()Landroid/text/TextPaint;
    .locals 1

    iget-object v0, p0, LM0/f0;->a:Landroid/text/TextPaint;

    return-object v0
.end method

.method public final I()LN0/i;
    .locals 5

    iget-object v0, p0, LM0/f0;->f:LN0/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LN0/i;

    iget-object v1, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    iget-object v2, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    iget-object v3, p0, LM0/f0;->a:Landroid/text/TextPaint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, LN0/i;-><init>(Ljava/lang/CharSequence;IILjava/util/Locale;)V

    iput-object v0, p0, LM0/f0;->f:LN0/i;

    return-object v0
.end method

.method public final J()Z
    .locals 3

    iget-boolean v0, p0, LM0/f0;->m:Z

    if-eqz v0, :cond_0

    sget-object v0, LM0/k;->a:LM0/k;

    iget-object v1, p0, LM0/f0;->g:Landroid/text/Layout;

    const-string v2, "null cannot be cast to non-null type android.text.BoringLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/text/BoringLayout;

    invoke-virtual {v0, v1}, LM0/k;->b(Landroid/text/BoringLayout;)Z

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, LM0/a0;->a:LM0/a0;

    iget-object v1, p0, LM0/f0;->g:Landroid/text/Layout;

    const-string v2, "null cannot be cast to non-null type android.text.StaticLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/text/StaticLayout;

    iget-boolean v2, p0, LM0/f0;->c:Z

    invoke-virtual {v0, v1, v2}, LM0/a0;->c(Landroid/text/StaticLayout;Z)Z

    move-result v0

    :goto_0
    return v0
.end method

.method public final K(I)Z
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result p1

    return p1
.end method

.method public final L(Landroid/graphics/Canvas;)V
    .locals 3

    iget-object v0, p0, LM0/f0;->q:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, LM0/f0;->i:I

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_1
    invoke-static {}, LM0/h0;->e()LM0/e0;

    move-result-object v0

    invoke-virtual {v0, p1}, LM0/e0;->a(Landroid/graphics/Canvas;)V

    iget-object v2, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v2, v0}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    iget v0, p0, LM0/f0;->i:I

    if-eqz v0, :cond_2

    const/4 v2, -0x1

    int-to-float v2, v2

    int-to-float v0, v0

    mul-float/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_2
    return-void
.end method

.method public final a(II[FI)V
    .locals 10

    invoke-virtual {p0}, LM0/f0;->G()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ltz p1, :cond_a

    if-ge p1, v0, :cond_9

    if-le p2, p1, :cond_8

    if-gt p2, v0, :cond_7

    sub-int v0, p2, p1

    mul-int/lit8 v0, v0, 0x4

    array-length v1, p3

    sub-int/2addr v1, p4

    if-lt v1, v0, :cond_6

    invoke-virtual {p0, p1}, LM0/f0;->q(I)I

    move-result v0

    add-int/lit8 v1, p2, -0x1

    invoke-virtual {p0, v1}, LM0/f0;->q(I)I

    move-result v1

    new-instance v2, LM0/D;

    invoke-direct {v2, p0}, LM0/D;-><init>(LM0/f0;)V

    if-gt v0, v1, :cond_5

    :goto_0
    invoke-virtual {p0, v0}, LM0/f0;->v(I)I

    move-result v3

    invoke-virtual {p0, v0}, LM0/f0;->p(I)I

    move-result v4

    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {p0, v0}, LM0/f0;->w(I)F

    move-result v5

    invoke-virtual {p0, v0}, LM0/f0;->l(I)F

    move-result v6

    invoke-virtual {p0, v0}, LM0/f0;->z(I)I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_0

    goto :goto_1

    :cond_0
    const/4 v8, 0x0

    :goto_1
    if-ge v3, v4, :cond_4

    invoke-virtual {p0, v3}, LM0/f0;->K(I)Z

    move-result v7

    if-eqz v8, :cond_1

    if-nez v7, :cond_1

    invoke-virtual {v2, v3}, LM0/D;->b(I)F

    move-result v7

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v2, v9}, LM0/D;->c(I)F

    move-result v9

    goto :goto_2

    :cond_1
    if-eqz v8, :cond_2

    if-eqz v7, :cond_2

    invoke-virtual {v2, v3}, LM0/D;->d(I)F

    move-result v9

    add-int/lit8 v7, v3, 0x1

    invoke-virtual {v2, v7}, LM0/D;->e(I)F

    move-result v7

    goto :goto_2

    :cond_2
    if-nez v8, :cond_3

    if-eqz v7, :cond_3

    invoke-virtual {v2, v3}, LM0/D;->b(I)F

    move-result v9

    add-int/lit8 v7, v3, 0x1

    invoke-virtual {v2, v7}, LM0/D;->c(I)F

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v2, v3}, LM0/D;->d(I)F

    move-result v7

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v2, v9}, LM0/D;->e(I)F

    move-result v9

    :goto_2
    aput v7, p3, p4

    add-int/lit8 v7, p4, 0x1

    aput v5, p3, v7

    add-int/lit8 v7, p4, 0x2

    aput v9, p3, v7

    add-int/lit8 v7, p4, 0x3

    aput v6, p3, v7

    add-int/lit8 p4, p4, 0x4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eq v0, v1, :cond_5

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "endOffset must be smaller or equal to text length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "endOffset must be greater than startOffset"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startOffset must be less than text length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startOffset must be > 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(I[F)V
    .locals 6

    invoke-virtual {p0, p1}, LM0/f0;->v(I)I

    move-result v0

    invoke-virtual {p0, p1}, LM0/f0;->p(I)I

    move-result v1

    sub-int v2, v1, v0

    mul-int/lit8 v2, v2, 0x2

    array-length v3, p2

    if-lt v3, v2, :cond_5

    new-instance v2, LM0/D;

    invoke-direct {v2, p0}, LM0/D;-><init>(LM0/f0;)V

    invoke-virtual {p0, p1}, LM0/f0;->z(I)I

    move-result p1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne p1, v4, :cond_0

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-ge v0, v1, :cond_4

    invoke-virtual {p0, v0}, LM0/f0;->K(I)Z

    move-result p1

    if-eqz v4, :cond_1

    if-nez p1, :cond_1

    invoke-virtual {v2, v0}, LM0/D;->b(I)F

    move-result p1

    add-int/lit8 v5, v0, 0x1

    invoke-virtual {v2, v5}, LM0/D;->c(I)F

    move-result v5

    goto :goto_1

    :cond_1
    if-eqz v4, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {v2, v0}, LM0/D;->d(I)F

    move-result v5

    add-int/lit8 p1, v0, 0x1

    invoke-virtual {v2, p1}, LM0/D;->e(I)F

    move-result p1

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {v2, v0}, LM0/D;->b(I)F

    move-result v5

    add-int/lit8 p1, v0, 0x1

    invoke-virtual {v2, p1}, LM0/D;->c(I)F

    move-result p1

    goto :goto_1

    :cond_3
    invoke-virtual {v2, v0}, LM0/D;->d(I)F

    move-result p1

    add-int/lit8 v5, v0, 0x1

    invoke-virtual {v2, v5}, LM0/D;->e(I)F

    move-result v5

    :goto_1
    aput p1, p2, v3

    add-int/lit8 p1, v3, 0x1

    aput v5, p2, p1

    add-int/lit8 v3, v3, 0x2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(I)Landroid/graphics/RectF;
    .locals 7

    invoke-virtual {p0, p1}, LM0/f0;->q(I)I

    move-result v0

    invoke-virtual {p0, v0}, LM0/f0;->w(I)F

    move-result v1

    invoke-virtual {p0, v0}, LM0/f0;->l(I)F

    move-result v2

    invoke-virtual {p0, v0}, LM0/f0;->z(I)I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    iget-object v5, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v5, p1}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v5

    if-eqz v0, :cond_1

    if-nez v5, :cond_1

    invoke-virtual {p0, p1, v3}, LM0/f0;->A(IZ)F

    move-result v0

    add-int/2addr p1, v4

    invoke-virtual {p0, p1, v4}, LM0/f0;->A(IZ)F

    move-result p1

    goto :goto_2

    :cond_1
    if-eqz v0, :cond_2

    if-eqz v5, :cond_2

    invoke-virtual {p0, p1, v3}, LM0/f0;->D(IZ)F

    move-result v0

    add-int/2addr p1, v4

    invoke-virtual {p0, p1, v4}, LM0/f0;->D(IZ)F

    move-result p1

    :goto_1
    move v6, v0

    move v0, p1

    move p1, v6

    goto :goto_2

    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {p0, p1, v3}, LM0/f0;->A(IZ)F

    move-result v0

    add-int/2addr p1, v4

    invoke-virtual {p0, p1, v4}, LM0/f0;->A(IZ)F

    move-result p1

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1, v3}, LM0/f0;->D(IZ)F

    move-result v0

    add-int/2addr p1, v4

    invoke-virtual {p0, p1, v4}, LM0/f0;->D(IZ)F

    move-result p1

    :goto_2
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3, v0, v1, p1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v3
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LM0/f0;->e:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LM0/f0;->c:Z

    return v0
.end method

.method public final f()I
    .locals 2

    iget-boolean v0, p0, LM0/f0;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    iget v1, p0, LM0/f0;->h:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    move-result v0

    :goto_0
    iget v1, p0, LM0/f0;->i:I

    add-int/2addr v0, v1

    iget v1, p0, LM0/f0;->j:I

    add-int/2addr v0, v1

    iget v1, p0, LM0/f0;->o:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, LM0/f0;->b:Z

    return v0
.end method

.method public final i()Landroid/text/Layout;
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    return-object v0
.end method

.method public final k(I)F
    .locals 2

    iget v0, p0, LM0/f0;->i:I

    int-to-float v0, v0

    iget v1, p0, LM0/f0;->h:I

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_0

    iget-object v1, p0, LM0/f0;->n:Landroid/graphics/Paint$FontMetricsInt;

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, LM0/f0;->w(I)F

    move-result p1

    iget-object v1, p0, LM0/f0;->n:Landroid/graphics/Paint$FontMetricsInt;

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    int-to-float v1, v1

    sub-float/2addr p1, v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineBaseline(I)I

    move-result p1

    int-to-float p1, p1

    :goto_0
    add-float/2addr v0, p1

    return v0
.end method

.method public final l(I)F
    .locals 2

    iget v0, p0, LM0/f0;->h:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    iget-object v0, p0, LM0/f0;->n:Landroid/graphics/Paint$FontMetricsInt;

    if-eqz v0, :cond_0

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, LM0/f0;->n:Landroid/graphics/Paint$FontMetricsInt;

    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    int-to-float v0, v0

    add-float/2addr p1, v0

    return p1

    :cond_0
    iget v0, p0, LM0/f0;->i:I

    int-to-float v0, v0

    iget-object v1, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget v1, p0, LM0/f0;->h:I

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_1

    iget p1, p0, LM0/f0;->j:I

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    int-to-float p1, p1

    add-float/2addr v0, p1

    return v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, LM0/f0;->h:I

    return v0
.end method

.method public final n(I)I
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result p1

    return p1
.end method

.method public final o(I)I
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result p1

    return p1
.end method

.method public final p(I)I
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {p1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final q(I)I
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    return p1
.end method

.method public final r(I)I
    .locals 2

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    iget v1, p0, LM0/f0;->i:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result p1

    return p1
.end method

.method public final s(I)F
    .locals 1

    invoke-virtual {p0, p1}, LM0/f0;->l(I)F

    move-result v0

    invoke-virtual {p0, p1}, LM0/f0;->w(I)F

    move-result p1

    sub-float/2addr v0, p1

    return v0
.end method

.method public final t(I)F
    .locals 2

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v0

    iget v1, p0, LM0/f0;->h:I

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_0

    iget p1, p0, LM0/f0;->k:F

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-float/2addr v0, p1

    return v0
.end method

.method public final u(I)F
    .locals 2

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineRight(I)F

    move-result v0

    iget v1, p0, LM0/f0;->h:I

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_0

    iget p1, p0, LM0/f0;->l:F

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-float/2addr v0, p1

    return v0
.end method

.method public final v(I)I
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result p1

    return p1
.end method

.method public final w(I)F
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineTop(I)I

    move-result v0

    int-to-float v0, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p0, LM0/f0;->i:I

    :goto_0
    int-to-float p1, p1

    add-float/2addr v0, p1

    return v0
.end method

.method public final x(I)I
    .locals 2

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, LM0/f0;->j()LM0/G;

    move-result-object v0

    invoke-virtual {v0, p1}, LM0/G;->e(I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result v0

    iget-object v1, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result p1

    add-int/2addr p1, v0

    :goto_0
    return p1
.end method

.method public final y(IF)I
    .locals 3

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    const/4 v1, -0x1

    int-to-float v1, v1

    invoke-direct {p0, p1}, LM0/f0;->g(I)F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result p1

    return p1
.end method

.method public final z(I)I
    .locals 1

    iget-object v0, p0, LM0/f0;->g:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result p1

    return p1
.end method
