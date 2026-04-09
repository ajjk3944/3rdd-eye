.class public abstract Ld9;
.super Ldh;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public f:Lxm;

.field public final g:I

.field public final h:F

.field public i:I

.field public final j:F

.field public k:[F

.field public l:I

.field public m:I

.field public n:I

.field public o:Z

.field public p:Z

.field public final q:Z

.field public final r:Z

.field public final s:Ljava/util/ArrayList;

.field public final t:Z

.field public u:Z

.field public v:F

.field public w:F

.field public x:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldh;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, -0x777778

    .line 5
    .line 6
    .line 7
    iput v0, p0, Ld9;->g:I

    .line 8
    .line 9
    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iput v1, p0, Ld9;->h:F

    .line 12
    .line 13
    iput v0, p0, Ld9;->i:I

    .line 14
    .line 15
    iput v1, p0, Ld9;->j:F

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    new-array v1, v0, [F

    .line 19
    .line 20
    iput-object v1, p0, Ld9;->k:[F

    .line 21
    .line 22
    const/4 v1, 0x6

    .line 23
    iput v1, p0, Ld9;->n:I

    .line 24
    .line 25
    iput-boolean v0, p0, Ld9;->o:Z

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    iput-boolean v1, p0, Ld9;->p:Z

    .line 29
    .line 30
    iput-boolean v1, p0, Ld9;->q:Z

    .line 31
    .line 32
    iput-boolean v1, p0, Ld9;->r:Z

    .line 33
    .line 34
    iput-boolean v1, p0, Ld9;->t:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Ld9;->u:Z

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput v0, p0, Ld9;->v:F

    .line 40
    .line 41
    iput v0, p0, Ld9;->w:F

    .line 42
    .line 43
    iput v0, p0, Ld9;->x:F

    .line 44
    .line 45
    const/high16 v0, 0x41200000    # 10.0f

    .line 46
    .line 47
    invoke-static {v0}, Lk41;->c(F)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iput v0, p0, Ldh;->d:F

    .line 52
    .line 53
    const/high16 v0, 0x40a00000    # 5.0f

    .line 54
    .line 55
    invoke-static {v0}, Lk41;->c(F)F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iput v1, p0, Ldh;->b:F

    .line 60
    .line 61
    invoke-static {v0}, Lk41;->c(F)F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iput v0, p0, Ldh;->c:F

    .line 66
    .line 67
    new-instance v0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Ld9;->s:Ljava/util/ArrayList;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public a(FF)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ld9;->u:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget p1, p0, Ld9;->w:F

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sub-float/2addr p1, v1

    .line 10
    :goto_0
    add-float/2addr p2, v1

    .line 11
    sub-float v0, p2, p1

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    cmpl-float v0, v0, v1

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const/high16 v0, 0x3f800000    # 1.0f

    .line 22
    .line 23
    add-float/2addr p2, v0

    .line 24
    sub-float/2addr p1, v0

    .line 25
    :cond_1
    iput p1, p0, Ld9;->w:F

    .line 26
    .line 27
    iput p2, p0, Ld9;->v:F

    .line 28
    .line 29
    sub-float/2addr p2, p1

    .line 30
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput p1, p0, Ld9;->x:F

    .line 35
    .line 36
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v2, v0

    .line 5
    :goto_0
    iget-object v3, p0, Ld9;->k:[F

    .line 6
    .line 7
    array-length v4, v3

    .line 8
    if-ge v1, v4, :cond_3

    .line 9
    .line 10
    if-ltz v1, :cond_1

    .line 11
    .line 12
    array-length v3, v3

    .line 13
    if-lt v1, v3, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p0}, Ld9;->c()Ln41;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, p0, Ld9;->k:[F

    .line 21
    .line 22
    aget v4, v4, v1

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Ln41;->a(F)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    goto :goto_2

    .line 29
    :cond_1
    :goto_1
    move-object v3, v0

    .line 30
    :goto_2
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-ge v4, v5, :cond_2

    .line 41
    .line 42
    move-object v2, v3

    .line 43
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    return-object v2
.end method

.method public final c()Ln41;
    .locals 5

    .line 1
    iget-object v0, p0, Ld9;->f:Lxm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Lxm;->b:I

    .line 6
    .line 7
    iget v1, p0, Ld9;->m:I

    .line 8
    .line 9
    if-eq v0, v1, :cond_3

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lxm;

    .line 12
    .line 13
    iget v1, p0, Ld9;->m:I

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput v1, v0, Lxm;->b:I

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuffer;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    :goto_0
    if-ge v3, v1, :cond_2

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    const-string v4, "."

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 33
    .line 34
    .line 35
    :cond_1
    const-string v4, "0"

    .line 36
    .line 37
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 38
    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    new-instance v1, Ljava/text/DecimalFormat;

    .line 44
    .line 45
    new-instance v3, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v4, "###,###,###,##0"

    .line 48
    .line 49
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object v1, v0, Lxm;->a:Ljava/text/DecimalFormat;

    .line 67
    .line 68
    iput-object v0, p0, Ld9;->f:Lxm;

    .line 69
    .line 70
    :cond_3
    iget-object v0, p0, Ld9;->f:Lxm;

    .line 71
    .line 72
    return-object v0
.end method

.method public final d()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ld9;->u:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ld9;->w:F

    .line 6
    .line 7
    iget v1, p0, Ld9;->v:F

    .line 8
    .line 9
    sub-float/2addr v1, v0

    .line 10
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Ld9;->x:F

    .line 15
    .line 16
    return-void
.end method
