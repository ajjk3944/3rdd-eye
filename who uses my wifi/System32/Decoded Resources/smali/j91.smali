.class public Lj91;
.super Li91;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public n:Ly20;

.field public o:Ly20;

.field public p:Ly20;


# direct methods
.method public constructor <init>(Lo91;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Li91;-><init>(Lo91;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lj91;->n:Ly20;

    .line 6
    .line 7
    iput-object p1, p0, Lj91;->o:Ly20;

    .line 8
    .line 9
    iput-object p1, p0, Lj91;->p:Ly20;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public g()Ly20;
    .locals 1

    .line 1
    iget-object v0, p0, Lj91;->o:Ly20;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg91;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Li71;->v(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ly20;->c(Landroid/graphics/Insets;)Ly20;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lj91;->o:Ly20;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lj91;->o:Ly20;

    .line 18
    .line 19
    return-object v0
.end method

.method public i()Ly20;
    .locals 1

    .line 1
    iget-object v0, p0, Lj91;->n:Ly20;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg91;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Li71;->z(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ly20;->c(Landroid/graphics/Insets;)Ly20;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lj91;->n:Ly20;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lj91;->n:Ly20;

    .line 18
    .line 19
    return-object v0
.end method

.method public k()Ly20;
    .locals 1

    .line 1
    iget-object v0, p0, Lj91;->p:Ly20;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg91;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Li71;->b(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ly20;->c(Landroid/graphics/Insets;)Ly20;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lj91;->p:Ly20;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lj91;->p:Ly20;

    .line 18
    .line 19
    return-object v0
.end method

.method public l(IIII)Lo91;
    .locals 1

    .line 1
    iget-object v0, p0, Lg91;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Li71;->h(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p2, p1}, Lo91;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lo91;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public q(Ly20;)V
    .locals 0

    .line 1
    return-void
.end method
