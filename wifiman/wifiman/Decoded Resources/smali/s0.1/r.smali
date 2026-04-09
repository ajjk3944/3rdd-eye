.class public final Ls0/r;
.super Ls0/o;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/List;

.field private final c:I

.field private final d:Lm0/l0;

.field private final e:F

.field private final f:Lm0/l0;

.field private final g:F

.field private final h:F

.field private final i:I

.field private final j:I

.field private final k:F

.field private final l:F

.field private final m:F

.field private final n:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/List;ILm0/l0;FLm0/l0;FFIIFFFF)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ls0/o;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Ls0/r;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Ls0/r;->b:Ljava/util/List;

    .line 5
    iput p3, p0, Ls0/r;->c:I

    .line 6
    iput-object p4, p0, Ls0/r;->d:Lm0/l0;

    .line 7
    iput p5, p0, Ls0/r;->e:F

    .line 8
    iput-object p6, p0, Ls0/r;->f:Lm0/l0;

    .line 9
    iput p7, p0, Ls0/r;->g:F

    .line 10
    iput p8, p0, Ls0/r;->h:F

    .line 11
    iput p9, p0, Ls0/r;->i:I

    .line 12
    iput p10, p0, Ls0/r;->j:I

    .line 13
    iput p11, p0, Ls0/r;->k:F

    .line 14
    iput p12, p0, Ls0/r;->l:F

    .line 15
    iput p13, p0, Ls0/r;->m:F

    .line 16
    iput p14, p0, Ls0/r;->n:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;ILm0/l0;FLm0/l0;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p14}, Ls0/r;-><init>(Ljava/lang/String;Ljava/util/List;ILm0/l0;FLm0/l0;FFIIFFFF)V

    return-void
.end method


# virtual methods
.method public final b()Lm0/l0;
    .locals 1

    iget-object v0, p0, Ls0/r;->d:Lm0/l0;

    return-object v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Ls0/r;->e:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ls0/r;

    if-eq v3, v2, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Ls0/r;

    iget-object v2, p0, Ls0/r;->a:Ljava/lang/String;

    iget-object v3, p1, Ls0/r;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Ls0/r;->d:Lm0/l0;

    iget-object v3, p1, Ls0/r;->d:Lm0/l0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget v2, p0, Ls0/r;->e:F

    iget v3, p1, Ls0/r;->e:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget-object v2, p0, Ls0/r;->f:Lm0/l0;

    iget-object v3, p1, Ls0/r;->f:Lm0/l0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget v2, p0, Ls0/r;->g:F

    iget v3, p1, Ls0/r;->g:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Ls0/r;->h:F

    iget v3, p1, Ls0/r;->h:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Ls0/r;->i:I

    iget v3, p1, Ls0/r;->i:I

    invoke-static {v2, v3}, Lm0/k1;->e(II)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget v2, p0, Ls0/r;->j:I

    iget v3, p1, Ls0/r;->j:I

    invoke-static {v2, v3}, Lm0/l1;->e(II)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget v2, p0, Ls0/r;->k:F

    iget v3, p1, Ls0/r;->k:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Ls0/r;->l:F

    iget v3, p1, Ls0/r;->l:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Ls0/r;->m:F

    iget v3, p1, Ls0/r;->m:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Ls0/r;->n:F

    iget v3, p1, Ls0/r;->n:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_9

    iget v2, p0, Ls0/r;->c:I

    iget v3, p1, Ls0/r;->c:I

    invoke-static {v2, v3}, Lm0/W0;->d(II)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Ls0/r;->b:Ljava/util/List;

    iget-object p1, p1, Ls0/r;->b:Ljava/util/List;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v1

    :cond_8
    return v0

    :cond_9
    :goto_0
    return v1
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/r;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ls0/r;->b:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ls0/r;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls0/r;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls0/r;->d:Lm0/l0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/r;->e:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls0/r;->f:Lm0/l0;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/r;->g:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/r;->h:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/r;->i:I

    invoke-static {v1}, Lm0/k1;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/r;->j:I

    invoke-static {v1}, Lm0/l1;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/r;->k:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/r;->l:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/r;->m:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/r;->n:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/r;->c:I

    invoke-static {v1}, Lm0/W0;->e(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Ls0/r;->c:I

    return v0
.end method

.method public final j()Lm0/l0;
    .locals 1

    iget-object v0, p0, Ls0/r;->f:Lm0/l0;

    return-object v0
.end method

.method public final k()F
    .locals 1

    iget v0, p0, Ls0/r;->g:F

    return v0
.end method

.method public final q()I
    .locals 1

    iget v0, p0, Ls0/r;->i:I

    return v0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, Ls0/r;->j:I

    return v0
.end method

.method public final u()F
    .locals 1

    iget v0, p0, Ls0/r;->k:F

    return v0
.end method

.method public final v()F
    .locals 1

    iget v0, p0, Ls0/r;->h:F

    return v0
.end method

.method public final w()F
    .locals 1

    iget v0, p0, Ls0/r;->m:F

    return v0
.end method

.method public final x()F
    .locals 1

    iget v0, p0, Ls0/r;->n:F

    return v0
.end method

.method public final y()F
    .locals 1

    iget v0, p0, Ls0/r;->l:F

    return v0
.end method
