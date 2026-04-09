.class public final Lm0/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/S0;


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:I

.field private c:Landroid/graphics/Shader;

.field private d:Lm0/w0;

.field private e:Lm0/V0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-static {}, Lm0/S;->j()Landroid/graphics/Paint;

    move-result-object v0

    invoke-direct {p0, v0}, Lm0/Q;-><init>(Landroid/graphics/Paint;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    .line 2
    sget-object p1, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {p1}, Lm0/d0$a;->B()I

    move-result p1

    iput p1, p0, Lm0/Q;->b:I

    return-void
.end method


# virtual methods
.method public A(F)V
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->u(Landroid/graphics/Paint;F)V

    return-void
.end method

.method public B(Lm0/V0;)V
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->q(Landroid/graphics/Paint;Lm0/V0;)V

    iput-object p1, p0, Lm0/Q;->e:Lm0/V0;

    return-void
.end method

.method public C(I)V
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->p(Landroid/graphics/Paint;I)V

    return-void
.end method

.method public D(Lm0/w0;)V
    .locals 1

    iput-object p1, p0, Lm0/Q;->d:Lm0/w0;

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->o(Landroid/graphics/Paint;Lm0/w0;)V

    return-void
.end method

.method public E()I
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lm0/S;->e(Landroid/graphics/Paint;)I

    move-result v0

    return v0
.end method

.method public F()I
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lm0/S;->f(Landroid/graphics/Paint;)I

    move-result v0

    return v0
.end method

.method public G(I)V
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->t(Landroid/graphics/Paint;I)V

    return-void
.end method

.method public H(I)V
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->w(Landroid/graphics/Paint;I)V

    return-void
.end method

.method public I(J)V
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1, p2}, Lm0/S;->n(Landroid/graphics/Paint;J)V

    return-void
.end method

.method public J()Lm0/V0;
    .locals 1

    iget-object v0, p0, Lm0/Q;->e:Lm0/V0;

    return-object v0
.end method

.method public K(F)V
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->v(Landroid/graphics/Paint;F)V

    return-void
.end method

.method public L()F
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lm0/S;->i(Landroid/graphics/Paint;)F

    move-result v0

    return v0
.end method

.method public a(F)V
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->k(Landroid/graphics/Paint;F)V

    return-void
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lm0/S;->c(Landroid/graphics/Paint;)F

    move-result v0

    return v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lm0/S;->d(Landroid/graphics/Paint;)J

    move-result-wide v0

    return-wide v0
.end method

.method public p()Lm0/w0;
    .locals 1

    iget-object v0, p0, Lm0/Q;->d:Lm0/w0;

    return-object v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lm0/Q;->b:I

    return v0
.end method

.method public s()I
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lm0/S;->g(Landroid/graphics/Paint;)I

    move-result v0

    return v0
.end method

.method public t(Z)V
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->l(Landroid/graphics/Paint;Z)V

    return-void
.end method

.method public u(I)V
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->s(Landroid/graphics/Paint;I)V

    return-void
.end method

.method public v(I)V
    .locals 1

    iget v0, p0, Lm0/Q;->b:I

    invoke-static {v0, p1}, Lm0/d0;->E(II)Z

    move-result v0

    if-nez v0, :cond_0

    iput p1, p0, Lm0/Q;->b:I

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->m(Landroid/graphics/Paint;I)V

    :cond_0
    return-void
.end method

.method public w()F
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lm0/S;->h(Landroid/graphics/Paint;)F

    move-result v0

    return v0
.end method

.method public x()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    return-object v0
.end method

.method public y(Landroid/graphics/Shader;)V
    .locals 1

    iput-object p1, p0, Lm0/Q;->c:Landroid/graphics/Shader;

    iget-object v0, p0, Lm0/Q;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lm0/S;->r(Landroid/graphics/Paint;Landroid/graphics/Shader;)V

    return-void
.end method

.method public z()Landroid/graphics/Shader;
    .locals 1

    iget-object v0, p0, Lm0/Q;->c:Landroid/graphics/Shader;

    return-object v0
.end method
