.class public abstract Lp1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/m$b;
    }
.end annotation


# instance fields
.field public a:I

.field b:Lo1/e;

.field c:Lp1/k;

.field protected d:Lo1/e$b;

.field e:Lp1/g;

.field public f:I

.field g:Z

.field public h:Lp1/f;

.field public i:Lp1/f;

.field protected j:Lp1/m$b;


# direct methods
.method public constructor <init>(Lo1/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp1/g;

    invoke-direct {v0, p0}, Lp1/g;-><init>(Lp1/m;)V

    iput-object v0, p0, Lp1/m;->e:Lp1/g;

    const/4 v0, 0x0

    iput v0, p0, Lp1/m;->f:I

    iput-boolean v0, p0, Lp1/m;->g:Z

    new-instance v0, Lp1/f;

    invoke-direct {v0, p0}, Lp1/f;-><init>(Lp1/m;)V

    iput-object v0, p0, Lp1/m;->h:Lp1/f;

    new-instance v0, Lp1/f;

    invoke-direct {v0, p0}, Lp1/f;-><init>(Lp1/m;)V

    iput-object v0, p0, Lp1/m;->i:Lp1/f;

    sget-object v0, Lp1/m$b;->NONE:Lp1/m$b;

    iput-object v0, p0, Lp1/m;->j:Lp1/m$b;

    iput-object p1, p0, Lp1/m;->b:Lo1/e;

    return-void
.end method

.method private l(II)V
    .locals 7

    iget v0, p0, Lp1/m;->a:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    iget-object v3, v0, Lo1/e;->e:Lp1/j;

    iget-object v4, v3, Lp1/m;->d:Lo1/e$b;

    sget-object v5, Lo1/e$b;->MATCH_CONSTRAINT:Lo1/e$b;

    if-ne v4, v5, :cond_1

    iget v4, v3, Lp1/m;->a:I

    if-ne v4, p2, :cond_1

    iget-object v4, v0, Lo1/e;->f:Lp1/l;

    iget-object v6, v4, Lp1/m;->d:Lo1/e$b;

    if-ne v6, v5, :cond_1

    iget v4, v4, Lp1/m;->a:I

    if-ne v4, p2, :cond_1

    goto/16 :goto_3

    :cond_1
    if-nez p1, :cond_2

    iget-object v3, v0, Lo1/e;->f:Lp1/l;

    :cond_2
    iget-object p2, v3, Lp1/m;->e:Lp1/g;

    iget-boolean p2, p2, Lp1/f;->j:Z

    if-eqz p2, :cond_9

    invoke-virtual {v0}, Lo1/e;->t()F

    move-result p2

    if-ne p1, v1, :cond_3

    iget-object p1, v3, Lp1/m;->e:Lp1/g;

    iget p1, p1, Lp1/f;->g:I

    int-to-float p1, p1

    div-float/2addr p1, p2

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_0

    :cond_3
    iget-object p1, v3, Lp1/m;->e:Lp1/g;

    iget p1, p1, Lp1/f;->g:I

    int-to-float p1, p1

    mul-float/2addr p2, p1

    add-float/2addr p2, v2

    float-to-int p1, p2

    :goto_0
    iget-object p2, p0, Lp1/m;->e:Lp1/g;

    invoke-virtual {p2, p1}, Lp1/g;->d(I)V

    goto :goto_3

    :cond_4
    iget-object p2, p0, Lp1/m;->b:Lo1/e;

    invoke-virtual {p2}, Lo1/e;->G()Lo1/e;

    move-result-object p2

    if-eqz p2, :cond_9

    if-nez p1, :cond_5

    iget-object p2, p2, Lo1/e;->e:Lp1/j;

    goto :goto_1

    :cond_5
    iget-object p2, p2, Lo1/e;->f:Lp1/l;

    :goto_1
    iget-object p2, p2, Lp1/m;->e:Lp1/g;

    iget-boolean v0, p2, Lp1/f;->j:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Lp1/m;->b:Lo1/e;

    if-nez p1, :cond_6

    iget v0, v0, Lo1/e;->q:F

    goto :goto_2

    :cond_6
    iget v0, v0, Lo1/e;->t:F

    :goto_2
    iget p2, p2, Lp1/f;->g:I

    int-to-float p2, p2

    mul-float/2addr p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    iget-object v0, p0, Lp1/m;->e:Lp1/g;

    invoke-virtual {p0, p2, p1}, Lp1/m;->g(II)I

    move-result p1

    invoke-virtual {v0, p1}, Lp1/g;->d(I)V

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lp1/m;->e:Lp1/g;

    iget v0, v0, Lp1/g;->m:I

    invoke-virtual {p0, v0, p1}, Lp1/m;->g(II)I

    move-result p1

    iget-object v0, p0, Lp1/m;->e:Lp1/g;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v0, p1}, Lp1/g;->d(I)V

    goto :goto_3

    :cond_8
    iget-object v0, p0, Lp1/m;->e:Lp1/g;

    invoke-virtual {p0, p2, p1}, Lp1/m;->g(II)I

    move-result p1

    invoke-virtual {v0, p1}, Lp1/g;->d(I)V

    :cond_9
    :goto_3
    return-void
.end method


# virtual methods
.method public abstract a(Lp1/d;)V
.end method

.method protected final b(Lp1/f;Lp1/f;I)V
    .locals 1

    iget-object v0, p1, Lp1/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Lp1/f;->f:I

    iget-object p2, p2, Lp1/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final c(Lp1/f;Lp1/f;ILp1/g;)V
    .locals 2

    iget-object v0, p1, Lp1/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lp1/f;->l:Ljava/util/List;

    iget-object v1, p0, Lp1/m;->e:Lp1/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Lp1/f;->h:I

    iput-object p4, p1, Lp1/f;->i:Lp1/g;

    iget-object p2, p2, Lp1/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, p4, Lp1/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method abstract d()V
.end method

.method abstract e()V
.end method

.method abstract f()V
.end method

.method protected final g(II)I
    .locals 1

    if-nez p2, :cond_1

    iget-object p2, p0, Lp1/m;->b:Lo1/e;

    iget v0, p2, Lo1/e;->p:I

    iget p2, p2, Lo1/e;->o:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lp1/m;->b:Lo1/e;

    iget v0, p2, Lo1/e;->s:I

    iget p2, p2, Lo1/e;->r:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    :goto_0
    move p1, p2

    :cond_3
    return p1
.end method

.method protected final h(Lo1/d;)Lp1/f;
    .locals 3

    iget-object p1, p1, Lo1/d;->d:Lo1/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, Lo1/d;->b:Lo1/e;

    iget-object p1, p1, Lo1/d;->c:Lo1/d$b;

    sget-object v2, Lp1/m$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, v1, Lo1/e;->f:Lp1/l;

    iget-object v0, p1, Lp1/m;->i:Lp1/f;

    goto :goto_0

    :cond_2
    iget-object p1, v1, Lo1/e;->f:Lp1/l;

    iget-object v0, p1, Lp1/l;->k:Lp1/f;

    goto :goto_0

    :cond_3
    iget-object p1, v1, Lo1/e;->f:Lp1/l;

    iget-object v0, p1, Lp1/m;->h:Lp1/f;

    goto :goto_0

    :cond_4
    iget-object p1, v1, Lo1/e;->e:Lp1/j;

    iget-object v0, p1, Lp1/m;->i:Lp1/f;

    goto :goto_0

    :cond_5
    iget-object p1, v1, Lo1/e;->e:Lp1/j;

    iget-object v0, p1, Lp1/m;->h:Lp1/f;

    :goto_0
    return-object v0
.end method

.method protected final i(Lo1/d;I)Lp1/f;
    .locals 2

    iget-object p1, p1, Lo1/d;->d:Lo1/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, Lo1/d;->b:Lo1/e;

    if-nez p2, :cond_1

    iget-object p2, v1, Lo1/e;->e:Lp1/j;

    goto :goto_0

    :cond_1
    iget-object p2, v1, Lo1/e;->f:Lp1/l;

    :goto_0
    iget-object p1, p1, Lo1/d;->c:Lo1/d$b;

    sget-object v1, Lp1/m$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p2, Lp1/m;->i:Lp1/f;

    goto :goto_1

    :cond_3
    iget-object v0, p2, Lp1/m;->h:Lp1/f;

    :goto_1
    return-object v0
.end method

.method public j()J
    .locals 2

    iget-object v0, p0, Lp1/m;->e:Lp1/g;

    iget-boolean v1, v0, Lp1/f;->j:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lp1/f;->g:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lp1/m;->g:Z

    return v0
.end method

.method abstract m()Z
.end method

.method protected n(Lp1/d;Lo1/d;Lo1/d;I)V
    .locals 4

    invoke-virtual {p0, p2}, Lp1/m;->h(Lo1/d;)Lp1/f;

    move-result-object p1

    invoke-virtual {p0, p3}, Lp1/m;->h(Lo1/d;)Lp1/f;

    move-result-object v0

    iget-boolean v1, p1, Lp1/f;->j:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, Lp1/f;->j:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p1, Lp1/f;->g:I

    invoke-virtual {p2}, Lo1/d;->c()I

    move-result p2

    add-int/2addr v1, p2

    iget p2, v0, Lp1/f;->g:I

    invoke-virtual {p3}, Lo1/d;->c()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    iget-object v2, p0, Lp1/m;->e:Lp1/g;

    iget-boolean v2, v2, Lp1/f;->j:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lp1/m;->d:Lo1/e$b;

    sget-object v3, Lo1/e$b;->MATCH_CONSTRAINT:Lo1/e$b;

    if-ne v2, v3, :cond_1

    invoke-direct {p0, p4, p3}, Lp1/m;->l(II)V

    :cond_1
    iget-object v2, p0, Lp1/m;->e:Lp1/g;

    iget-boolean v3, v2, Lp1/f;->j:Z

    if-nez v3, :cond_2

    return-void

    :cond_2
    iget v2, v2, Lp1/f;->g:I

    if-ne v2, p3, :cond_3

    iget-object p1, p0, Lp1/m;->h:Lp1/f;

    invoke-virtual {p1, v1}, Lp1/f;->d(I)V

    iget-object p1, p0, Lp1/m;->i:Lp1/f;

    invoke-virtual {p1, p2}, Lp1/f;->d(I)V

    return-void

    :cond_3
    iget-object p3, p0, Lp1/m;->b:Lo1/e;

    if-nez p4, :cond_4

    invoke-virtual {p3}, Lo1/e;->w()F

    move-result p3

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, Lo1/e;->K()F

    move-result p3

    :goto_0
    const/high16 p4, 0x3f000000    # 0.5f

    if-ne p1, v0, :cond_5

    iget v1, p1, Lp1/f;->g:I

    iget p2, v0, Lp1/f;->g:I

    move p3, p4

    :cond_5
    sub-int/2addr p2, v1

    iget-object p1, p0, Lp1/m;->e:Lp1/g;

    iget p1, p1, Lp1/f;->g:I

    sub-int/2addr p2, p1

    iget-object p1, p0, Lp1/m;->h:Lp1/f;

    int-to-float v0, v1

    add-float/2addr v0, p4

    int-to-float p2, p2

    mul-float/2addr p2, p3

    add-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1, p2}, Lp1/f;->d(I)V

    iget-object p1, p0, Lp1/m;->i:Lp1/f;

    iget-object p2, p0, Lp1/m;->h:Lp1/f;

    iget p2, p2, Lp1/f;->g:I

    iget-object p3, p0, Lp1/m;->e:Lp1/g;

    iget p3, p3, Lp1/f;->g:I

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, Lp1/f;->d(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method protected o(Lp1/d;)V
    .locals 0

    return-void
.end method

.method protected p(Lp1/d;)V
    .locals 0

    return-void
.end method
