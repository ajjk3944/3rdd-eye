.class public final Lf21;
.super Lm54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final g:Lh21;

.field public final h:Landroid/view/Window$Callback;

.field public final i:Lzs1;

.field public j:Z

.field public k:Z

.field public l:Z

.field public final m:Ljava/util/ArrayList;

.field public final n:La9;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Lb6;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lf21;->m:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, La9;

    .line 12
    .line 13
    const/16 v1, 0x10

    .line 14
    .line 15
    invoke-direct {v0, v1, p0}, La9;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lf21;->n:La9;

    .line 19
    .line 20
    new-instance v0, Lvg0;

    .line 21
    .line 22
    const/4 v1, 0x7

    .line 23
    invoke-direct {v0, v1, p0}, Lvg0;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lh21;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v1, p1, v2}, Lh21;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lf21;->g:Lh21;

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iput-object p3, p0, Lf21;->h:Landroid/view/Window$Callback;

    .line 38
    .line 39
    iput-object p3, v1, Lh21;->k:Landroid/view/Window$Callback;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Ld21;)V

    .line 42
    .line 43
    .line 44
    iget-boolean p3, v1, Lh21;->g:Z

    .line 45
    .line 46
    if-nez p3, :cond_0

    .line 47
    .line 48
    iput-object p2, v1, Lh21;->h:Ljava/lang/CharSequence;

    .line 49
    .line 50
    iget p3, v1, Lh21;->b:I

    .line 51
    .line 52
    and-int/lit8 p3, p3, 0x8

    .line 53
    .line 54
    if-eqz p3, :cond_0

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    iget-boolean p3, v1, Lh21;->g:Z

    .line 60
    .line 61
    if-eqz p3, :cond_0

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1, p2}, Le61;->m(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    new-instance p1, Lzs1;

    .line 71
    .line 72
    const/4 p2, 0x7

    .line 73
    invoke-direct {p1, p2, p0}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lf21;->i:Lzs1;

    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf21;->g:Lh21;

    .line 2
    .line 3
    iget-boolean v1, v0, Lh21;->g:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    iput-object p1, v0, Lh21;->h:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget v2, v0, Lh21;->b:I

    .line 12
    .line 13
    and-int/lit8 v2, v2, 0x8

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    iget-boolean v0, v0, Lh21;->g:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, p1}, Le61;->m(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf21;->g:Lh21;

    .line 2
    .line 3
    iget-object v0, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->y:Ly1;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ly1;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lf21;->g:Lh21;

    .line 2
    .line 3
    iget-object v0, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->R:Lb21;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v1, v0, Lb21;->g:Lsd0;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :cond_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, Lsd0;->collapseActionView()Z

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_2
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final d(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf21;->l:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Lf21;->l:Z

    .line 7
    .line 8
    iget-object p1, p0, Lf21;->m:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-gtz v0, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/lang/ClassCastException;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method public final g()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf21;->g:Lh21;

    .line 2
    .line 3
    iget v0, v0, Lh21;->b:I

    .line 4
    .line 5
    return v0
.end method

.method public final i0()Landroid/view/Menu;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lf21;->k:Z

    .line 2
    .line 3
    iget-object v1, p0, Lf21;->g:Lh21;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Lnb;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lnb;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lz71;

    .line 13
    .line 14
    const/16 v3, 0xa

    .line 15
    .line 16
    invoke-direct {v2, v3, p0}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v3, v1, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 20
    .line 21
    iput-object v0, v3, Landroidx/appcompat/widget/Toolbar;->S:Lnb;

    .line 22
    .line 23
    iput-object v2, v3, Landroidx/appcompat/widget/Toolbar;->T:Lz71;

    .line 24
    .line 25
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->f:Landroidx/appcompat/widget/ActionMenuView;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iput-object v0, v3, Landroidx/appcompat/widget/ActionMenuView;->z:Lnb;

    .line 30
    .line 31
    iput-object v2, v3, Landroidx/appcompat/widget/ActionMenuView;->A:Lmd0;

    .line 32
    .line 33
    :cond_0
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lf21;->k:Z

    .line 35
    .line 36
    :cond_1
    iget-object v0, v1, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public final p()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lf21;->g:Lh21;

    .line 2
    .line 3
    iget-object v0, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final q()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lf21;->g:Lh21;

    .line 2
    .line 3
    iget-object v1, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object v2, p0, Lf21;->n:La9;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 11
    .line 12
    sget-object v1, Le61;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0
.end method

.method public final s()V
    .locals 0

    .line 1
    return-void
.end method

.method public final t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf21;->g:Lh21;

    .line 2
    .line 3
    iget-object v0, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object v1, p0, Lf21;->n:La9;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final u(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lf21;->i0()Landroid/view/Menu;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x1

    .line 21
    if-eq v2, v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v1

    .line 25
    :goto_0
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_1
    return v1
.end method

.method public final v(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lf21;->w()Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return v0
.end method

.method public final w()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf21;->g:Lh21;

    .line 2
    .line 3
    iget-object v0, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final x(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final y(Z)V
    .locals 2

    .line 1
    iget-object p1, p0, Lf21;->g:Lh21;

    .line 2
    .line 3
    iget v0, p1, Lh21;->b:I

    .line 4
    .line 5
    and-int/lit8 v0, v0, -0x5

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    or-int/2addr v0, v1

    .line 9
    invoke-virtual {p1, v0}, Lh21;->a(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final z(Z)V
    .locals 0

    .line 1
    return-void
.end method
