.class public final Lp0/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/d;


# instance fields
.field private A:Z

.field private B:I

.field private C:Z

.field private final b:J

.field private final c:Lm0/o0;

.field private final d:Lo0/a;

.field private final e:Landroid/graphics/RenderNode;

.field private f:J

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Matrix;

.field private i:Z

.field private j:F

.field private k:I

.field private l:Lm0/w0;

.field private m:J

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:J

.field private t:J

.field private u:F

.field private v:F

.field private w:F

.field private x:F

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(JLm0/o0;Lo0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lp0/D;->b:J

    .line 3
    iput-object p3, p0, Lp0/D;->c:Lm0/o0;

    .line 4
    iput-object p4, p0, Lp0/D;->d:Lo0/a;

    .line 5
    const-string p1, "graphicsLayer"

    invoke-static {p1}, Ls/p;->a(Ljava/lang/String;)Landroid/graphics/RenderNode;

    move-result-object p1

    iput-object p1, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    .line 6
    sget-object p2, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {p2}, Ll0/m$a;->b()J

    move-result-wide p2

    iput-wide p2, p0, Lp0/D;->f:J

    const/4 p2, 0x0

    .line 7
    invoke-static {p1, p2}, Lp0/B;->a(Landroid/graphics/RenderNode;Z)Z

    .line 8
    sget-object p2, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {p2}, Lp0/b$a;->a()I

    move-result p3

    invoke-direct {p0, p1, p3}, Lp0/D;->P(Landroid/graphics/RenderNode;I)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 9
    iput p1, p0, Lp0/D;->j:F

    .line 10
    sget-object p3, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {p3}, Lm0/d0$a;->B()I

    move-result p3

    iput p3, p0, Lp0/D;->k:I

    .line 11
    sget-object p3, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p3}, Ll0/g$a;->b()J

    move-result-wide p3

    iput-wide p3, p0, Lp0/D;->m:J

    .line 12
    iput p1, p0, Lp0/D;->n:F

    .line 13
    iput p1, p0, Lp0/D;->o:F

    .line 14
    sget-object p1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p1}, Lm0/v0$a;->a()J

    move-result-wide p3

    iput-wide p3, p0, Lp0/D;->s:J

    .line 15
    invoke-virtual {p1}, Lm0/v0$a;->a()J

    move-result-wide p3

    iput-wide p3, p0, Lp0/D;->t:J

    const/high16 p1, 0x41000000    # 8.0f

    .line 16
    iput p1, p0, Lp0/D;->x:F

    .line 17
    invoke-virtual {p2}, Lp0/b$a;->a()I

    move-result p1

    iput p1, p0, Lp0/D;->B:I

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lp0/D;->C:Z

    return-void
.end method

.method public synthetic constructor <init>(JLm0/o0;Lo0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 19
    new-instance p3, Lm0/o0;

    invoke-direct {p3}, Lm0/o0;-><init>()V

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    .line 20
    new-instance p4, Lo0/a;

    invoke-direct {p4}, Lo0/a;-><init>()V

    .line 21
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lp0/D;-><init>(JLm0/o0;Lo0/a;)V

    return-void
.end method

.method private final O()V
    .locals 4

    invoke-virtual {p0}, Lp0/D;->Q()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lp0/D;->i:Z

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Lp0/D;->Q()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-boolean v3, p0, Lp0/D;->i:Z

    if-eqz v3, :cond_1

    move v1, v2

    :cond_1
    iget-boolean v2, p0, Lp0/D;->z:Z

    if-eq v0, v2, :cond_2

    iput-boolean v0, p0, Lp0/D;->z:Z

    iget-object v2, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v2, v0}, Lp0/B;->a(Landroid/graphics/RenderNode;Z)Z

    :cond_2
    iget-boolean v0, p0, Lp0/D;->A:Z

    if-eq v1, v0, :cond_3

    iput-boolean v1, p0, Lp0/D;->A:Z

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, v1}, Lp0/C;->a(Landroid/graphics/RenderNode;Z)Z

    :cond_3
    return-void
.end method

.method private final P(Landroid/graphics/RenderNode;I)V
    .locals 3

    sget-object v0, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v0}, Lp0/b$a;->c()I

    move-result v1

    invoke-static {p2, v1}, Lp0/b;->e(II)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object p2, p0, Lp0/D;->g:Landroid/graphics/Paint;

    invoke-static {p1, v2, p2}, Lp0/n;->a(Landroid/graphics/RenderNode;ZLandroid/graphics/Paint;)Z

    invoke-static {p1, v2}, Lp0/o;->a(Landroid/graphics/RenderNode;Z)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lp0/b$a;->b()I

    move-result v0

    invoke-static {p2, v0}, Lp0/b;->e(II)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    iget-object p2, p0, Lp0/D;->g:Landroid/graphics/Paint;

    invoke-static {p1, v0, p2}, Lp0/n;->a(Landroid/graphics/RenderNode;ZLandroid/graphics/Paint;)Z

    invoke-static {p1, v0}, Lp0/o;->a(Landroid/graphics/RenderNode;Z)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lp0/D;->g:Landroid/graphics/Paint;

    invoke-static {p1, v0, p2}, Lp0/n;->a(Landroid/graphics/RenderNode;ZLandroid/graphics/Paint;)Z

    invoke-static {p1, v2}, Lp0/o;->a(Landroid/graphics/RenderNode;Z)Z

    :goto_0
    return-void
.end method

.method private final R()Z
    .locals 2

    invoke-virtual {p0}, Lp0/D;->x()I

    move-result v0

    sget-object v1, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v1}, Lp0/b$a;->c()I

    move-result v1

    invoke-static {v0, v1}, Lp0/b;->e(II)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lp0/D;->S()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp0/D;->t()Lm0/d1;

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method private final S()Z
    .locals 2

    invoke-virtual {p0}, Lp0/D;->r()I

    move-result v0

    sget-object v1, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {v1}, Lm0/d0$a;->B()I

    move-result v1

    invoke-static {v0, v1}, Lm0/d0;->E(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lp0/D;->p()Lm0/w0;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final T()V
    .locals 2

    invoke-direct {p0}, Lp0/D;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    sget-object v1, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v1}, Lp0/b$a;->c()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lp0/D;->P(Landroid/graphics/RenderNode;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-virtual {p0}, Lp0/D;->x()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lp0/D;->P(Landroid/graphics/RenderNode;I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public A()J
    .locals 2

    iget-wide v0, p0, Lp0/D;->s:J

    return-wide v0
.end method

.method public B()J
    .locals 2

    iget-wide v0, p0, Lp0/D;->t:J

    return-wide v0
.end method

.method public C()F
    .locals 1

    iget v0, p0, Lp0/D;->q:F

    return v0
.end method

.method public D(J)V
    .locals 1

    iput-wide p1, p0, Lp0/D;->s:J

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, Lm0/x0;->j(J)I

    move-result p1

    invoke-static {v0, p1}, Lp0/v;->a(Landroid/graphics/RenderNode;I)Z

    return-void
.end method

.method public E()F
    .locals 1

    iget v0, p0, Lp0/D;->x:F

    return v0
.end method

.method public F()F
    .locals 1

    iget v0, p0, Lp0/D;->p:F

    return v0
.end method

.method public G(Z)V
    .locals 0

    iput-boolean p1, p0, Lp0/D;->y:Z

    invoke-direct {p0}, Lp0/D;->O()V

    return-void
.end method

.method public H()F
    .locals 1

    iget v0, p0, Lp0/D;->u:F

    return v0
.end method

.method public I(J)V
    .locals 1

    iput-wide p1, p0, Lp0/D;->t:J

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, Lm0/x0;->j(J)I

    move-result p1

    invoke-static {v0, p1}, Lp0/z;->a(Landroid/graphics/RenderNode;I)Z

    return-void
.end method

.method public J(LY0/d;LY0/t;Lp0/c;Lmh/l;)V
    .locals 4

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0}, Ls/r;->a(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lp0/D;->c:Lm0/o0;

    invoke-virtual {v1}, Lm0/o0;->a()Lm0/G;

    move-result-object v2

    invoke-virtual {v2}, Lm0/G;->a()Landroid/graphics/Canvas;

    move-result-object v2

    invoke-virtual {v1}, Lm0/o0;->a()Lm0/G;

    move-result-object v3

    invoke-virtual {v3, v0}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    invoke-virtual {v1}, Lm0/o0;->a()Lm0/G;

    move-result-object v0

    iget-object v3, p0, Lp0/D;->d:Lo0/a;

    invoke-virtual {v3}, Lo0/a;->k1()Lo0/d;

    move-result-object v3

    invoke-interface {v3, p1}, Lo0/d;->a(LY0/d;)V

    invoke-interface {v3, p2}, Lo0/d;->b(LY0/t;)V

    invoke-interface {v3, p3}, Lo0/d;->h(Lp0/c;)V

    iget-wide p1, p0, Lp0/D;->f:J

    invoke-interface {v3, p1, p2}, Lo0/d;->f(J)V

    invoke-interface {v3, v0}, Lo0/d;->i(Lm0/n0;)V

    iget-object p1, p0, Lp0/D;->d:Lo0/a;

    invoke-interface {p4, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lm0/o0;->a()Lm0/G;

    move-result-object p1

    invoke-virtual {p1, v2}, Lm0/G;->z(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {p1}, Ls/s;->a(Landroid/graphics/RenderNode;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lp0/D;->s(Z)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {p2}, Ls/s;->a(Landroid/graphics/RenderNode;)V

    throw p1
.end method

.method public K()F
    .locals 1

    iget v0, p0, Lp0/D;->o:F

    return v0
.end method

.method public L(I)V
    .locals 0

    iput p1, p0, Lp0/D;->B:I

    invoke-direct {p0}, Lp0/D;->T()V

    return-void
.end method

.method public M()Landroid/graphics/Matrix;
    .locals 2

    iget-object v0, p0, Lp0/D;->h:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lp0/D;->h:Landroid/graphics/Matrix;

    :cond_0
    iget-object v1, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v1, v0}, Lp0/j;->a(Landroid/graphics/RenderNode;Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method public N()F
    .locals 1

    iget v0, p0, Lp0/D;->r:F

    return v0
.end method

.method public Q()Z
    .locals 1

    iget-boolean v0, p0, Lp0/D;->y:Z

    return v0
.end method

.method public a(F)V
    .locals 1

    iput p1, p0, Lp0/D;->j:F

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lp0/i;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lp0/D;->j:F

    return v0
.end method

.method public c(Lm0/n0;)V
    .locals 1

    invoke-static {p1}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object p1

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {p1, v0}, Ls/t;->a(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public d(F)V
    .locals 1

    iput p1, p0, Lp0/D;->v:F

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lp0/x;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public e(F)V
    .locals 1

    iput p1, p0, Lp0/D;->w:F

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lp0/y;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public f(F)V
    .locals 1

    iput p1, p0, Lp0/D;->q:F

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lp0/A;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public g(F)V
    .locals 1

    iput p1, p0, Lp0/D;->o:F

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lp0/g;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lp0/m;->a(Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public i(F)V
    .locals 1

    iput p1, p0, Lp0/D;->n:F

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lp0/l;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public j(F)V
    .locals 1

    iput p1, p0, Lp0/D;->p:F

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lp0/w;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public k(Lm0/d1;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, Lp0/Q;->a:Lp0/Q;

    iget-object v1, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-virtual {v0, v1, p1}, Lp0/Q;->a(Landroid/graphics/RenderNode;Lm0/d1;)V

    :cond_0
    return-void
.end method

.method public l(F)V
    .locals 1

    iput p1, p0, Lp0/D;->x:F

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lp0/u;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public m(F)V
    .locals 1

    iput p1, p0, Lp0/D;->u:F

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lp0/p;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public n()F
    .locals 1

    iget v0, p0, Lp0/D;->n:F

    return v0
.end method

.method public o(F)V
    .locals 1

    iput p1, p0, Lp0/D;->r:F

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lp0/r;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public p()Lm0/w0;
    .locals 1

    iget-object v0, p0, Lp0/D;->l:Lm0/w0;

    return-object v0
.end method

.method public q()Z
    .locals 1

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lp0/h;->a(Landroid/graphics/RenderNode;)Z

    move-result v0

    return v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lp0/D;->k:I

    return v0
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Lp0/D;->C:Z

    return-void
.end method

.method public t()Lm0/d1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public u()F
    .locals 1

    iget v0, p0, Lp0/D;->v:F

    return v0
.end method

.method public v(Landroid/graphics/Outline;J)V
    .locals 0

    iget-object p2, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {p2, p1}, Lp0/k;->a(Landroid/graphics/RenderNode;Landroid/graphics/Outline;)Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lp0/D;->i:Z

    invoke-direct {p0}, Lp0/D;->O()V

    return-void
.end method

.method public w()F
    .locals 1

    iget v0, p0, Lp0/D;->w:F

    return v0
.end method

.method public x()I
    .locals 1

    iget v0, p0, Lp0/D;->B:I

    return v0
.end method

.method public y(IIJ)V
    .locals 3

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result v1

    add-int/2addr v1, p1

    invoke-static {p3, p4}, LY0/r;->f(J)I

    move-result v2

    add-int/2addr v2, p2

    invoke-static {v0, p1, p2, v1, v2}, Ls/q;->a(Landroid/graphics/RenderNode;IIII)Z

    invoke-static {p3, p4}, LY0/s;->d(J)J

    move-result-wide p1

    iput-wide p1, p0, Lp0/D;->f:J

    return-void
.end method

.method public z(J)V
    .locals 2

    iput-wide p1, p0, Lp0/D;->m:J

    invoke-static {p1, p2}, Ll0/h;->d(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {p1}, Lp0/q;->a(Landroid/graphics/RenderNode;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {v0, v1}, Lp0/s;->a(Landroid/graphics/RenderNode;F)Z

    iget-object v0, p0, Lp0/D;->e:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-static {v0, p1}, Lp0/t;->a(Landroid/graphics/RenderNode;F)Z

    :goto_0
    return-void
.end method
