.class public final Ldv0;
.super Lda;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final D:Lzi;

.field public final E:Lfh;

.field public final F:Lpq;


# direct methods
.method public constructor <init>(Li90;Lf50;Lfh;Lu80;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lda;-><init>(Li90;Lf50;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Ldv0;->E:Lfh;

    .line 5
    .line 6
    new-instance p3, Lav0;

    .line 7
    .line 8
    iget-object p2, p2, Lf50;->a:Ljava/util/List;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const-string v1, "__container"

    .line 12
    .line 13
    invoke-direct {p3, v1, p2, v0}, Lav0;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Lzi;

    .line 17
    .line 18
    invoke-direct {p2, p1, p0, p3, p4}, Lzi;-><init>(Li90;Lda;Lav0;Lu80;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Ldv0;->D:Lzi;

    .line 22
    .line 23
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {p2, p1, p1}, Lzi;->d(Ljava/util/List;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lda;->p:Lf50;

    .line 29
    .line 30
    iget-object p1, p1, Lf50;->x:Lg4;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p2, Lpq;

    .line 35
    .line 36
    invoke-direct {p2, p0, p0, p1}, Lpq;-><init>(Lda;Lda;Lg4;)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Ldv0;->F:Lpq;

    .line 40
    .line 41
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lvq2;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lda;->a(Ljava/lang/Object;Lvq2;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ln90;->a:Landroid/graphics/PointF;

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Ldv0;->F:Lpq;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object p1, v1, Lpq;->c:Lfg;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object v0, Ln90;->B:Ljava/lang/Float;

    .line 24
    .line 25
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, p2}, Lpq;->b(Lvq2;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    sget-object v0, Ln90;->C:Ljava/lang/Float;

    .line 34
    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object p1, v1, Lpq;->e:Lpu;

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    sget-object v0, Ln90;->D:Ljava/lang/Float;

    .line 46
    .line 47
    if-ne p1, v0, :cond_3

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-object p1, v1, Lpq;->f:Lpu;

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    sget-object v0, Ln90;->E:Ljava/lang/Float;

    .line 58
    .line 59
    if-ne p1, v0, :cond_4

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    iget-object p1, v1, Lpq;->g:Lpu;

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    return-void
.end method

.method public final b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lda;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Ldv0;->D:Lzi;

    .line 5
    .line 6
    iget-object v0, p0, Lda;->n:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {p2, p1, v0, p3}, Lzi;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILmq;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldv0;->F:Lpq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2, p3}, Lpq;->a(Landroid/graphics/Matrix;I)Lmq;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    :cond_0
    iget-object v0, p0, Ldv0;->D:Lzi;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, Lzi;->g(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILmq;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final l()Lkf3;
    .locals 1

    .line 1
    iget-object v0, p0, Lda;->p:Lf50;

    .line 2
    .line 3
    iget-object v0, v0, Lf50;->w:Lkf3;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Ldv0;->E:Lfh;

    .line 9
    .line 10
    iget-object v0, v0, Lda;->p:Lf50;

    .line 11
    .line 12
    iget-object v0, v0, Lf50;->w:Lkf3;

    .line 13
    .line 14
    return-object v0
.end method

.method public final p(Lt40;ILjava/util/ArrayList;Lt40;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldv0;->D:Lzi;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lzi;->h(Lt40;ILjava/util/ArrayList;Lt40;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
