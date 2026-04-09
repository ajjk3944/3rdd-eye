.class final LE0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:F

.field private h:F

.field private i:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LE0/z;->a:F

    iput v0, p0, LE0/z;->b:F

    const/high16 v0, 0x41000000    # 8.0f

    iput v0, p0, LE0/z;->h:F

    sget-object v0, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LE0/z;->i:J

    return-void
.end method


# virtual methods
.method public final a(LE0/z;)V
    .locals 2

    iget v0, p1, LE0/z;->a:F

    iput v0, p0, LE0/z;->a:F

    iget v0, p1, LE0/z;->b:F

    iput v0, p0, LE0/z;->b:F

    iget v0, p1, LE0/z;->c:F

    iput v0, p0, LE0/z;->c:F

    iget v0, p1, LE0/z;->d:F

    iput v0, p0, LE0/z;->d:F

    iget v0, p1, LE0/z;->e:F

    iput v0, p0, LE0/z;->e:F

    iget v0, p1, LE0/z;->f:F

    iput v0, p0, LE0/z;->f:F

    iget v0, p1, LE0/z;->g:F

    iput v0, p0, LE0/z;->g:F

    iget v0, p1, LE0/z;->h:F

    iput v0, p0, LE0/z;->h:F

    iget-wide v0, p1, LE0/z;->i:J

    iput-wide v0, p0, LE0/z;->i:J

    return-void
.end method

.method public final b(Landroidx/compose/ui/graphics/c;)V
    .locals 2

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->n()F

    move-result v0

    iput v0, p0, LE0/z;->a:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->K()F

    move-result v0

    iput v0, p0, LE0/z;->b:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->F()F

    move-result v0

    iput v0, p0, LE0/z;->c:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->C()F

    move-result v0

    iput v0, p0, LE0/z;->d:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->H()F

    move-result v0

    iput v0, p0, LE0/z;->e:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->u()F

    move-result v0

    iput v0, p0, LE0/z;->f:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->w()F

    move-result v0

    iput v0, p0, LE0/z;->g:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->E()F

    move-result v0

    iput v0, p0, LE0/z;->h:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->t1()J

    move-result-wide v0

    iput-wide v0, p0, LE0/z;->i:J

    return-void
.end method

.method public final c(LE0/z;)Z
    .locals 4

    iget v0, p0, LE0/z;->a:F

    iget v1, p1, LE0/z;->a:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LE0/z;->b:F

    iget v1, p1, LE0/z;->b:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LE0/z;->c:F

    iget v1, p1, LE0/z;->c:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LE0/z;->d:F

    iget v1, p1, LE0/z;->d:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LE0/z;->e:F

    iget v1, p1, LE0/z;->e:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LE0/z;->f:F

    iget v1, p1, LE0/z;->f:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LE0/z;->g:F

    iget v1, p1, LE0/z;->g:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LE0/z;->h:F

    iget v1, p1, LE0/z;->h:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget-wide v0, p0, LE0/z;->i:J

    iget-wide v2, p1, LE0/z;->i:J

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/f;->e(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
