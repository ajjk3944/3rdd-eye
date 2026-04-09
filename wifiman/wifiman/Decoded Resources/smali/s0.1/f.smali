.class public final Ls0/f;
.super Ls0/k;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Lm0/l0;

.field private d:F

.field private e:Ljava/util/List;

.field private f:I

.field private g:F

.field private h:F

.field private i:Lm0/l0;

.field private j:I

.field private k:I

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Lo0/k;

.field private final t:Lm0/U0;

.field private u:Lm0/U0;

.field private final v:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ls0/k;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v0, ""

    iput-object v0, p0, Ls0/f;->b:Ljava/lang/String;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ls0/f;->d:F

    invoke-static {}, Ls0/n;->d()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ls0/f;->e:Ljava/util/List;

    invoke-static {}, Ls0/n;->a()I

    move-result v1

    iput v1, p0, Ls0/f;->f:I

    iput v0, p0, Ls0/f;->g:F

    invoke-static {}, Ls0/n;->b()I

    move-result v1

    iput v1, p0, Ls0/f;->j:I

    invoke-static {}, Ls0/n;->c()I

    move-result v1

    iput v1, p0, Ls0/f;->k:I

    const/high16 v1, 0x40800000    # 4.0f

    iput v1, p0, Ls0/f;->l:F

    iput v0, p0, Ls0/f;->n:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls0/f;->p:Z

    iput-boolean v0, p0, Ls0/f;->q:Z

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v0

    iput-object v0, p0, Ls0/f;->t:Lm0/U0;

    iput-object v0, p0, Ls0/f;->u:Lm0/U0;

    sget-object v0, LYg/q;->NONE:LYg/q;

    sget-object v1, Ls0/f$a;->a:Ls0/f$a;

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Ls0/f;->v:LYg/m;

    return-void
.end method

.method private final f()Lm0/X0;
    .locals 1

    iget-object v0, p0, Ls0/f;->v:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/X0;

    return-object v0
.end method

.method private final v()V
    .locals 2

    iget-object v0, p0, Ls0/f;->e:Ljava/util/List;

    iget-object v1, p0, Ls0/f;->t:Lm0/U0;

    invoke-static {v0, v1}, Ls0/j;->c(Ljava/util/List;Lm0/U0;)Lm0/U0;

    invoke-direct {p0}, Ls0/f;->w()V

    return-void
.end method

.method private final w()V
    .locals 7

    iget v0, p0, Ls0/f;->m:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v0, :cond_0

    iget v0, p0, Ls0/f;->n:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Ls0/f;->t:Lm0/U0;

    iput-object v0, p0, Ls0/f;->u:Lm0/U0;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ls0/f;->u:Lm0/U0;

    iget-object v3, p0, Ls0/f;->t:Lm0/U0;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v0

    iput-object v0, p0, Ls0/f;->u:Lm0/U0;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ls0/f;->u:Lm0/U0;

    invoke-interface {v0}, Lm0/U0;->l()I

    move-result v0

    iget-object v3, p0, Ls0/f;->u:Lm0/U0;

    invoke-interface {v3}, Lm0/U0;->q()V

    iget-object v3, p0, Ls0/f;->u:Lm0/U0;

    invoke-interface {v3, v0}, Lm0/U0;->h(I)V

    :goto_0
    invoke-direct {p0}, Ls0/f;->f()Lm0/X0;

    move-result-object v0

    iget-object v3, p0, Ls0/f;->t:Lm0/U0;

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Lm0/X0;->a(Lm0/U0;Z)V

    invoke-direct {p0}, Ls0/f;->f()Lm0/X0;

    move-result-object v0

    invoke-interface {v0}, Lm0/X0;->c()F

    move-result v0

    iget v3, p0, Ls0/f;->m:F

    iget v4, p0, Ls0/f;->o:F

    add-float/2addr v3, v4

    rem-float/2addr v3, v2

    mul-float/2addr v3, v0

    iget v5, p0, Ls0/f;->n:F

    add-float/2addr v5, v4

    rem-float/2addr v5, v2

    mul-float/2addr v5, v0

    cmpl-float v2, v3, v5

    const/4 v4, 0x1

    if-lez v2, :cond_2

    invoke-direct {p0}, Ls0/f;->f()Lm0/X0;

    move-result-object v2

    iget-object v6, p0, Ls0/f;->u:Lm0/U0;

    invoke-interface {v2, v3, v0, v6, v4}, Lm0/X0;->b(FFLm0/U0;Z)Z

    invoke-direct {p0}, Ls0/f;->f()Lm0/X0;

    move-result-object v0

    iget-object v2, p0, Ls0/f;->u:Lm0/U0;

    invoke-interface {v0, v1, v5, v2, v4}, Lm0/X0;->b(FFLm0/U0;Z)Z

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Ls0/f;->f()Lm0/X0;

    move-result-object v0

    iget-object v1, p0, Ls0/f;->u:Lm0/U0;

    invoke-interface {v0, v3, v5, v1, v4}, Lm0/X0;->b(FFLm0/U0;Z)Z

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Lo0/f;)V
    .locals 20

    move-object/from16 v0, p0

    iget-boolean v1, v0, Ls0/f;->p:Z

    if-eqz v1, :cond_0

    invoke-direct/range {p0 .. p0}, Ls0/f;->v()V

    goto :goto_0

    :cond_0
    iget-boolean v1, v0, Ls0/f;->r:Z

    if-eqz v1, :cond_1

    invoke-direct/range {p0 .. p0}, Ls0/f;->w()V

    :cond_1
    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, v0, Ls0/f;->p:Z

    iput-boolean v1, v0, Ls0/f;->r:Z

    iget-object v4, v0, Ls0/f;->c:Lm0/l0;

    if-eqz v4, :cond_2

    iget-object v3, v0, Ls0/f;->u:Lm0/U0;

    iget v5, v0, Ls0/f;->d:F

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v10}, Lo0/f;->R0(Lo0/f;Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_2
    iget-object v13, v0, Ls0/f;->i:Lm0/l0;

    if-eqz v13, :cond_5

    iget-object v2, v0, Ls0/f;->s:Lo0/k;

    iget-boolean v3, v0, Ls0/f;->q:Z

    if-nez v3, :cond_4

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v15, v2

    goto :goto_3

    :cond_4
    :goto_2
    new-instance v2, Lo0/k;

    iget v5, v0, Ls0/f;->h:F

    iget v6, v0, Ls0/f;->l:F

    iget v7, v0, Ls0/f;->j:I

    iget v8, v0, Ls0/f;->k:I

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v11}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Ls0/f;->s:Lo0/k;

    iput-boolean v1, v0, Ls0/f;->q:Z

    goto :goto_1

    :goto_3
    iget-object v12, v0, Ls0/f;->u:Lm0/U0;

    iget v14, v0, Ls0/f;->g:F

    const/16 v18, 0x30

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v11, p1

    invoke-static/range {v11 .. v19}, Lo0/f;->R0(Lo0/f;Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public final e()Lm0/l0;
    .locals 1

    iget-object v0, p0, Ls0/f;->c:Lm0/l0;

    return-object v0
.end method

.method public final g()Lm0/l0;
    .locals 1

    iget-object v0, p0, Ls0/f;->i:Lm0/l0;

    return-object v0
.end method

.method public final h(Lm0/l0;)V
    .locals 0

    iput-object p1, p0, Ls0/f;->c:Lm0/l0;

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final i(F)V
    .locals 0

    iput p1, p0, Ls0/f;->d:F

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ls0/f;->b:Ljava/lang/String;

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final k(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Ls0/f;->e:Ljava/util/List;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls0/f;->p:Z

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final l(I)V
    .locals 1

    iput p1, p0, Ls0/f;->f:I

    iget-object v0, p0, Ls0/f;->u:Lm0/U0;

    invoke-interface {v0, p1}, Lm0/U0;->h(I)V

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final m(Lm0/l0;)V
    .locals 0

    iput-object p1, p0, Ls0/f;->i:Lm0/l0;

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final n(F)V
    .locals 0

    iput p1, p0, Ls0/f;->g:F

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final o(I)V
    .locals 0

    iput p1, p0, Ls0/f;->j:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls0/f;->q:Z

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final p(I)V
    .locals 0

    iput p1, p0, Ls0/f;->k:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls0/f;->q:Z

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final q(F)V
    .locals 0

    iput p1, p0, Ls0/f;->l:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls0/f;->q:Z

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final r(F)V
    .locals 0

    iput p1, p0, Ls0/f;->h:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls0/f;->q:Z

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final s(F)V
    .locals 0

    iput p1, p0, Ls0/f;->n:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls0/f;->r:Z

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public final t(F)V
    .locals 0

    iput p1, p0, Ls0/f;->o:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls0/f;->r:Z

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/f;->t:Lm0/U0;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(F)V
    .locals 0

    iput p1, p0, Ls0/f;->m:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls0/f;->r:Z

    invoke-virtual {p0}, Ls0/k;->c()V

    return-void
.end method
