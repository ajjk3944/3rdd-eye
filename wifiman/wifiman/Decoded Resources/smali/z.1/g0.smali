.class public final Lz/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/g0$a;
    }
.end annotation


# static fields
.field private static A:Z

.field public static final x:Lz/g0$a;

.field public static final y:I

.field private static final z:Ljava/util/WeakHashMap;


# instance fields
.field private final a:Lz/b;

.field private final b:Lz/b;

.field private final c:Lz/b;

.field private final d:Lz/b;

.field private final e:Lz/b;

.field private final f:Lz/b;

.field private final g:Lz/b;

.field private final h:Lz/b;

.field private final i:Lz/b;

.field private final j:Lz/d0;

.field private final k:Lz/f0;

.field private final l:Lz/f0;

.field private final m:Lz/f0;

.field private final n:Lz/d0;

.field private final o:Lz/d0;

.field private final p:Lz/d0;

.field private final q:Lz/d0;

.field private final r:Lz/d0;

.field private final s:Lz/d0;

.field private final t:Lz/d0;

.field private final u:Z

.field private v:I

.field private final w:Lz/E;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz/g0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lz/g0;->x:Lz/g0$a;

    const/16 v0, 0x8

    sput v0, Lz/g0;->y:I

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lz/g0;->z:Ljava/util/WeakHashMap;

    return-void
.end method

.method private constructor <init>(LF1/w0;Landroid/view/View;)V
    .locals 9

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lz/g0;->x:Lz/g0$a;

    invoke-static {}, LF1/w0$l;->a()I

    move-result v1

    const-string v2, "captionBar"

    invoke-static {v0, p1, v1, v2}, Lz/g0$a;->a(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/b;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->a:Lz/b;

    .line 4
    invoke-static {}, LF1/w0$l;->b()I

    move-result v1

    const-string v2, "displayCutout"

    invoke-static {v0, p1, v1, v2}, Lz/g0$a;->a(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/b;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->b:Lz/b;

    .line 5
    invoke-static {}, LF1/w0$l;->c()I

    move-result v2

    const-string v3, "ime"

    invoke-static {v0, p1, v2, v3}, Lz/g0$a;->a(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/b;

    move-result-object v2

    iput-object v2, p0, Lz/g0;->c:Lz/b;

    .line 6
    invoke-static {}, LF1/w0$l;->e()I

    move-result v3

    .line 7
    const-string v4, "mandatorySystemGestures"

    .line 8
    invoke-static {v0, p1, v3, v4}, Lz/g0$a;->a(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/b;

    move-result-object v3

    iput-object v3, p0, Lz/g0;->d:Lz/b;

    .line 9
    invoke-static {}, LF1/w0$l;->f()I

    move-result v4

    const-string v5, "navigationBars"

    invoke-static {v0, p1, v4, v5}, Lz/g0$a;->a(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/b;

    move-result-object v4

    iput-object v4, p0, Lz/g0;->e:Lz/b;

    .line 10
    invoke-static {}, LF1/w0$l;->g()I

    move-result v4

    const-string v5, "statusBars"

    invoke-static {v0, p1, v4, v5}, Lz/g0$a;->a(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/b;

    move-result-object v4

    iput-object v4, p0, Lz/g0;->f:Lz/b;

    .line 11
    invoke-static {}, LF1/w0$l;->h()I

    move-result v4

    const-string v5, "systemBars"

    invoke-static {v0, p1, v4, v5}, Lz/g0$a;->a(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/b;

    move-result-object v4

    iput-object v4, p0, Lz/g0;->g:Lz/b;

    .line 12
    invoke-static {}, LF1/w0$l;->i()I

    move-result v5

    const-string v6, "systemGestures"

    invoke-static {v0, p1, v5, v6}, Lz/g0$a;->a(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/b;

    move-result-object v5

    iput-object v5, p0, Lz/g0;->h:Lz/b;

    .line 13
    invoke-static {}, LF1/w0$l;->j()I

    move-result v6

    const-string v7, "tappableElement"

    invoke-static {v0, p1, v6, v7}, Lz/g0$a;->a(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/b;

    move-result-object v6

    iput-object v6, p0, Lz/g0;->i:Lz/b;

    if-eqz p1, :cond_0

    .line 14
    invoke-virtual {p1}, LF1/w0;->e()LF1/r;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v7}, LF1/r;->e()Lw1/f;

    move-result-object v7

    if-nez v7, :cond_1

    :cond_0
    sget-object v7, Lw1/f;->e:Lw1/f;

    :cond_1
    const-string v8, "waterfall"

    invoke-static {v7, v8}, Lz/k0;->a(Lw1/f;Ljava/lang/String;)Lz/d0;

    move-result-object v7

    iput-object v7, p0, Lz/g0;->j:Lz/d0;

    .line 15
    invoke-static {v4, v2}, Lz/h0;->h(Lz/f0;Lz/f0;)Lz/f0;

    move-result-object v2

    invoke-static {v2, v1}, Lz/h0;->h(Lz/f0;Lz/f0;)Lz/f0;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->k:Lz/f0;

    .line 16
    invoke-static {v6, v3}, Lz/h0;->h(Lz/f0;Lz/f0;)Lz/f0;

    move-result-object v2

    invoke-static {v2, v5}, Lz/h0;->h(Lz/f0;Lz/f0;)Lz/f0;

    move-result-object v2

    invoke-static {v2, v7}, Lz/h0;->h(Lz/f0;Lz/f0;)Lz/f0;

    move-result-object v2

    iput-object v2, p0, Lz/g0;->l:Lz/f0;

    .line 17
    invoke-static {v1, v2}, Lz/h0;->h(Lz/f0;Lz/f0;)Lz/f0;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->m:Lz/f0;

    .line 18
    invoke-static {}, LF1/w0$l;->a()I

    move-result v1

    .line 19
    const-string v2, "captionBarIgnoringVisibility"

    .line 20
    invoke-static {v0, p1, v1, v2}, Lz/g0$a;->b(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/d0;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->n:Lz/d0;

    .line 21
    invoke-static {}, LF1/w0$l;->f()I

    move-result v1

    const-string v2, "navigationBarsIgnoringVisibility"

    .line 22
    invoke-static {v0, p1, v1, v2}, Lz/g0$a;->b(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/d0;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->o:Lz/d0;

    .line 23
    invoke-static {}, LF1/w0$l;->g()I

    move-result v1

    .line 24
    const-string v2, "statusBarsIgnoringVisibility"

    .line 25
    invoke-static {v0, p1, v1, v2}, Lz/g0$a;->b(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/d0;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->p:Lz/d0;

    .line 26
    invoke-static {}, LF1/w0$l;->h()I

    move-result v1

    .line 27
    const-string v2, "systemBarsIgnoringVisibility"

    .line 28
    invoke-static {v0, p1, v1, v2}, Lz/g0$a;->b(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/d0;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->q:Lz/d0;

    .line 29
    invoke-static {}, LF1/w0$l;->j()I

    move-result v1

    .line 30
    const-string v2, "tappableElementIgnoringVisibility"

    .line 31
    invoke-static {v0, p1, v1, v2}, Lz/g0$a;->b(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/d0;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->r:Lz/d0;

    .line 32
    invoke-static {}, LF1/w0$l;->c()I

    move-result v1

    .line 33
    const-string v2, "imeAnimationTarget"

    .line 34
    invoke-static {v0, p1, v1, v2}, Lz/g0$a;->b(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/d0;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->s:Lz/d0;

    .line 35
    invoke-static {}, LF1/w0$l;->c()I

    move-result v1

    .line 36
    const-string v2, "imeAnimationSource"

    .line 37
    invoke-static {v0, p1, v1, v2}, Lz/g0$a;->b(Lz/g0$a;LF1/w0;ILjava/lang/String;)Lz/d0;

    move-result-object p1

    iput-object p1, p0, Lz/g0;->t:Lz/d0;

    .line 38
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p2, p1, Landroid/view/View;

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    check-cast p1, Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_3

    sget p2, Lf0/h;->I:I

    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, v0

    :goto_1
    instance-of p2, p1, Ljava/lang/Boolean;

    if-eqz p2, :cond_4

    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    :cond_4
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_2

    :cond_5
    const/4 p1, 0x1

    :goto_2
    iput-boolean p1, p0, Lz/g0;->u:Z

    .line 39
    new-instance p1, Lz/E;

    invoke-direct {p1, p0}, Lz/E;-><init>(Lz/g0;)V

    iput-object p1, p0, Lz/g0;->w:Lz/E;

    return-void
.end method

.method public synthetic constructor <init>(LF1/w0;Landroid/view/View;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lz/g0;-><init>(LF1/w0;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic a()Ljava/util/WeakHashMap;
    .locals 1

    sget-object v0, Lz/g0;->z:Ljava/util/WeakHashMap;

    return-object v0
.end method

.method public static synthetic j(Lz/g0;LF1/w0;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lz/g0;->i(LF1/w0;I)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lz/g0;->v:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lz/g0;->v:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, LF1/W;->y0(Landroid/view/View;LF1/F;)V

    invoke-static {p1, v0}, LF1/W;->D0(Landroid/view/View;LF1/j0$b;)V

    iget-object v0, p0, Lz/g0;->w:Lz/E;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lz/g0;->u:Z

    return v0
.end method

.method public final d()Lz/b;
    .locals 1

    iget-object v0, p0, Lz/g0;->c:Lz/b;

    return-object v0
.end method

.method public final e()Lz/b;
    .locals 1

    iget-object v0, p0, Lz/g0;->e:Lz/b;

    return-object v0
.end method

.method public final f()Lz/b;
    .locals 1

    iget-object v0, p0, Lz/g0;->f:Lz/b;

    return-object v0
.end method

.method public final g()Lz/b;
    .locals 1

    iget-object v0, p0, Lz/g0;->g:Lz/b;

    return-object v0
.end method

.method public final h(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lz/g0;->v:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lz/g0;->w:Lz/E;

    invoke-static {p1, v0}, LF1/W;->y0(Landroid/view/View;LF1/F;)V

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    :cond_0
    iget-object v0, p0, Lz/g0;->w:Lz/E;

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Lz/g0;->w:Lz/E;

    invoke-static {p1, v0}, LF1/W;->D0(Landroid/view/View;LF1/j0$b;)V

    :cond_1
    iget p1, p0, Lz/g0;->v:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lz/g0;->v:I

    return-void
.end method

.method public final i(LF1/w0;I)V
    .locals 1

    sget-boolean v0, Lz/g0;->A:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LF1/w0;->v()Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1}, LF1/w0;->w(Landroid/view/WindowInsets;)LF1/w0;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lz/g0;->a:Lz/b;

    invoke-virtual {v0, p1, p2}, Lz/b;->h(LF1/w0;I)V

    iget-object v0, p0, Lz/g0;->c:Lz/b;

    invoke-virtual {v0, p1, p2}, Lz/b;->h(LF1/w0;I)V

    iget-object v0, p0, Lz/g0;->b:Lz/b;

    invoke-virtual {v0, p1, p2}, Lz/b;->h(LF1/w0;I)V

    iget-object v0, p0, Lz/g0;->e:Lz/b;

    invoke-virtual {v0, p1, p2}, Lz/b;->h(LF1/w0;I)V

    iget-object v0, p0, Lz/g0;->f:Lz/b;

    invoke-virtual {v0, p1, p2}, Lz/b;->h(LF1/w0;I)V

    iget-object v0, p0, Lz/g0;->g:Lz/b;

    invoke-virtual {v0, p1, p2}, Lz/b;->h(LF1/w0;I)V

    iget-object v0, p0, Lz/g0;->h:Lz/b;

    invoke-virtual {v0, p1, p2}, Lz/b;->h(LF1/w0;I)V

    iget-object v0, p0, Lz/g0;->i:Lz/b;

    invoke-virtual {v0, p1, p2}, Lz/b;->h(LF1/w0;I)V

    iget-object v0, p0, Lz/g0;->d:Lz/b;

    invoke-virtual {v0, p1, p2}, Lz/b;->h(LF1/w0;I)V

    if-nez p2, :cond_1

    iget-object p2, p0, Lz/g0;->n:Lz/d0;

    invoke-static {}, LF1/w0$l;->a()I

    move-result v0

    invoke-virtual {p1, v0}, LF1/w0;->g(I)Lw1/f;

    move-result-object v0

    invoke-static {v0}, Lz/k0;->d(Lw1/f;)Lz/H;

    move-result-object v0

    invoke-virtual {p2, v0}, Lz/d0;->f(Lz/H;)V

    iget-object p2, p0, Lz/g0;->o:Lz/d0;

    invoke-static {}, LF1/w0$l;->f()I

    move-result v0

    invoke-virtual {p1, v0}, LF1/w0;->g(I)Lw1/f;

    move-result-object v0

    invoke-static {v0}, Lz/k0;->d(Lw1/f;)Lz/H;

    move-result-object v0

    invoke-virtual {p2, v0}, Lz/d0;->f(Lz/H;)V

    iget-object p2, p0, Lz/g0;->p:Lz/d0;

    invoke-static {}, LF1/w0$l;->g()I

    move-result v0

    invoke-virtual {p1, v0}, LF1/w0;->g(I)Lw1/f;

    move-result-object v0

    invoke-static {v0}, Lz/k0;->d(Lw1/f;)Lz/H;

    move-result-object v0

    invoke-virtual {p2, v0}, Lz/d0;->f(Lz/H;)V

    iget-object p2, p0, Lz/g0;->q:Lz/d0;

    invoke-static {}, LF1/w0$l;->h()I

    move-result v0

    invoke-virtual {p1, v0}, LF1/w0;->g(I)Lw1/f;

    move-result-object v0

    invoke-static {v0}, Lz/k0;->d(Lw1/f;)Lz/H;

    move-result-object v0

    invoke-virtual {p2, v0}, Lz/d0;->f(Lz/H;)V

    iget-object p2, p0, Lz/g0;->r:Lz/d0;

    invoke-static {}, LF1/w0$l;->j()I

    move-result v0

    invoke-virtual {p1, v0}, LF1/w0;->g(I)Lw1/f;

    move-result-object v0

    invoke-static {v0}, Lz/k0;->d(Lw1/f;)Lz/H;

    move-result-object v0

    invoke-virtual {p2, v0}, Lz/d0;->f(Lz/H;)V

    invoke-virtual {p1}, LF1/w0;->e()LF1/r;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LF1/r;->e()Lw1/f;

    move-result-object p1

    iget-object p2, p0, Lz/g0;->j:Lz/d0;

    invoke-static {p1}, Lz/k0;->d(Lw1/f;)Lz/H;

    move-result-object p1

    invoke-virtual {p2, p1}, Lz/d0;->f(Lz/H;)V

    :cond_1
    sget-object p1, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/g$a;->n()V

    return-void
.end method

.method public final k(LF1/w0;)V
    .locals 2

    iget-object v0, p0, Lz/g0;->t:Lz/d0;

    invoke-static {}, LF1/w0$l;->c()I

    move-result v1

    invoke-virtual {p1, v1}, LF1/w0;->f(I)Lw1/f;

    move-result-object p1

    invoke-static {p1}, Lz/k0;->d(Lw1/f;)Lz/H;

    move-result-object p1

    invoke-virtual {v0, p1}, Lz/d0;->f(Lz/H;)V

    return-void
.end method

.method public final l(LF1/w0;)V
    .locals 2

    iget-object v0, p0, Lz/g0;->s:Lz/d0;

    invoke-static {}, LF1/w0$l;->c()I

    move-result v1

    invoke-virtual {p1, v1}, LF1/w0;->f(I)Lw1/f;

    move-result-object p1

    invoke-static {p1}, Lz/k0;->d(Lw1/f;)Lz/H;

    move-result-object p1

    invoke-virtual {v0, p1}, Lz/d0;->f(Lz/H;)V

    return-void
.end method
