.class public abstract Landroidx/compose/ui/viewinterop/c;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements LF1/D;
.implements LT/k;
.implements LE0/n0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/viewinterop/c$b;
    }
.end annotation


# static fields
.field public static final x:Landroidx/compose/ui/viewinterop/c$b;

.field public static final y:I

.field private static final z:Lmh/l;


# instance fields
.field private final a:I

.field private final b:Lx0/b;

.field private final c:Landroid/view/View;

.field private final d:LE0/m0;

.field private e:Lmh/a;

.field private f:Z

.field private g:Lmh/a;

.field private h:Lmh/a;

.field private i:Landroidx/compose/ui/e;

.field private j:Lmh/l;

.field private k:LY0/d;

.field private l:Lmh/l;

.field private m:Landroidx/lifecycle/o;

.field private n:Lq2/f;

.field private final o:Lmh/a;

.field private final p:Lmh/a;

.field private q:Lmh/l;

.field private final r:[I

.field private s:I

.field private t:I

.field private final u:LF1/E;

.field private v:Z

.field private final w:LE0/G;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/viewinterop/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/viewinterop/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/viewinterop/c;->x:Landroidx/compose/ui/viewinterop/c$b;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/viewinterop/c;->y:I

    sget-object v0, Landroidx/compose/ui/viewinterop/c$a;->a:Landroidx/compose/ui/viewinterop/c$a;

    sput-object v0, Landroidx/compose/ui/viewinterop/c;->z:Lmh/l;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LT/q;ILx0/b;Landroid/view/View;LE0/m0;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    iput p3, p0, Landroidx/compose/ui/viewinterop/c;->a:I

    iput-object p4, p0, Landroidx/compose/ui/viewinterop/c;->b:Lx0/b;

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    iput-object p6, p0, Landroidx/compose/ui/viewinterop/c;->d:LE0/m0;

    if-eqz p2, :cond_0

    invoke-static {p0, p2}, Landroidx/compose/ui/platform/J1;->i(Landroid/view/View;LT/q;)V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object p2, Landroidx/compose/ui/viewinterop/c$q;->a:Landroidx/compose/ui/viewinterop/c$q;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c;->e:Lmh/a;

    sget-object p2, Landroidx/compose/ui/viewinterop/c$n;->a:Landroidx/compose/ui/viewinterop/c$n;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c;->g:Lmh/a;

    sget-object p2, Landroidx/compose/ui/viewinterop/c$m;->a:Landroidx/compose/ui/viewinterop/c$m;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c;->h:Lmh/a;

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c;->i:Landroidx/compose/ui/e;

    const/high16 p5, 0x3f800000    # 1.0f

    const/4 p6, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p5, p6, v0, v1}, LY0/f;->b(FFILjava/lang/Object;)LY0/d;

    move-result-object p5

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->k:LY0/d;

    new-instance p5, Landroidx/compose/ui/viewinterop/c$p;

    invoke-direct {p5, p0}, Landroidx/compose/ui/viewinterop/c$p;-><init>(Landroidx/compose/ui/viewinterop/c;)V

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->o:Lmh/a;

    new-instance p5, Landroidx/compose/ui/viewinterop/c$o;

    invoke-direct {p5, p0}, Landroidx/compose/ui/viewinterop/c$o;-><init>(Landroidx/compose/ui/viewinterop/c;)V

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->p:Lmh/a;

    new-array p5, v0, [I

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->r:[I

    const/high16 p5, -0x80000000

    iput p5, p0, Landroidx/compose/ui/viewinterop/c;->s:I

    iput p5, p0, Landroidx/compose/ui/viewinterop/c;->t:I

    new-instance p5, LF1/E;

    invoke-direct {p5, p0}, LF1/E;-><init>(Landroid/view/ViewGroup;)V

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->u:LF1/E;

    new-instance p5, LE0/G;

    const/4 p6, 0x3

    invoke-direct {p5, p1, p1, p6, v1}, LE0/G;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p5, p0}, LE0/G;->C1(Landroidx/compose/ui/viewinterop/c;)V

    invoke-static {}, Landroidx/compose/ui/viewinterop/d;->a()Landroidx/compose/ui/viewinterop/d$a;

    move-result-object p1

    invoke-static {p2, p1, p4}, Landroidx/compose/ui/input/nestedscroll/a;->a(Landroidx/compose/ui/e;Lx0/a;Lx0/b;)Landroidx/compose/ui/e;

    move-result-object p1

    const/4 p2, 0x1

    sget-object p4, Landroidx/compose/ui/viewinterop/c$h;->a:Landroidx/compose/ui/viewinterop/c$h;

    invoke-static {p1, p2, p4}, LJ0/m;->b(Landroidx/compose/ui/e;ZLmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {p1, p0}, Ly0/I;->b(Landroidx/compose/ui/e;Landroidx/compose/ui/viewinterop/c;)Landroidx/compose/ui/e;

    move-result-object p1

    new-instance p2, Landroidx/compose/ui/viewinterop/c$i;

    invoke-direct {p2, p0, p5, p0}, Landroidx/compose/ui/viewinterop/c$i;-><init>(Landroidx/compose/ui/viewinterop/c;LE0/G;Landroidx/compose/ui/viewinterop/c;)V

    invoke-static {p1, p2}, Landroidx/compose/ui/draw/b;->b(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    new-instance p2, Landroidx/compose/ui/viewinterop/c$j;

    invoke-direct {p2, p0, p5}, Landroidx/compose/ui/viewinterop/c$j;-><init>(Landroidx/compose/ui/viewinterop/c;LE0/G;)V

    invoke-static {p1, p2}, Landroidx/compose/ui/layout/o;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-virtual {p5, p3}, LE0/G;->e(I)V

    iget-object p2, p0, Landroidx/compose/ui/viewinterop/c;->i:Landroidx/compose/ui/e;

    invoke-interface {p2, p1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-virtual {p5, p2}, LE0/G;->g(Landroidx/compose/ui/e;)V

    new-instance p2, Landroidx/compose/ui/viewinterop/c$c;

    invoke-direct {p2, p5, p1}, Landroidx/compose/ui/viewinterop/c$c;-><init>(LE0/G;Landroidx/compose/ui/e;)V

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c;->j:Lmh/l;

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c;->k:LY0/d;

    invoke-virtual {p5, p1}, LE0/G;->a(LY0/d;)V

    new-instance p1, Landroidx/compose/ui/viewinterop/c$d;

    invoke-direct {p1, p5}, Landroidx/compose/ui/viewinterop/c$d;-><init>(LE0/G;)V

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->l:Lmh/l;

    new-instance p1, Landroidx/compose/ui/viewinterop/c$e;

    invoke-direct {p1, p0, p5}, Landroidx/compose/ui/viewinterop/c$e;-><init>(Landroidx/compose/ui/viewinterop/c;LE0/G;)V

    invoke-virtual {p5, p1}, LE0/G;->G1(Lmh/l;)V

    new-instance p1, Landroidx/compose/ui/viewinterop/c$f;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/c$f;-><init>(Landroidx/compose/ui/viewinterop/c;)V

    invoke-virtual {p5, p1}, LE0/G;->H1(Lmh/l;)V

    new-instance p1, Landroidx/compose/ui/viewinterop/c$g;

    invoke-direct {p1, p0, p5}, Landroidx/compose/ui/viewinterop/c$g;-><init>(Landroidx/compose/ui/viewinterop/c;LE0/G;)V

    invoke-virtual {p5, p1}, LE0/G;->i(LC0/C;)V

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->w:LE0/G;

    return-void
.end method

.method public static synthetic a(Lmh/a;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/viewinterop/c;->t(Lmh/a;)V

    return-void
.end method

.method public static final synthetic b(Landroidx/compose/ui/viewinterop/c;)Lx0/b;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/c;->b:Lx0/b;

    return-object p0
.end method

.method public static final synthetic c(Landroidx/compose/ui/viewinterop/c;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/viewinterop/c;->f:Z

    return p0
.end method

.method public static final synthetic d()Lmh/l;
    .locals 1

    sget-object v0, Landroidx/compose/ui/viewinterop/c;->z:Lmh/l;

    return-object v0
.end method

.method public static final synthetic e(Landroidx/compose/ui/viewinterop/c;)LE0/m0;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/c;->d:LE0/m0;

    return-object p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/viewinterop/c;)Lmh/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/c;->o:Lmh/a;

    return-object p0
.end method

.method private final getSnapshotObserver()LE0/o0;
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Expected AndroidViewHolder to be attached when observing reads."

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->d:LE0/m0;

    invoke-interface {v0}, LE0/m0;->getSnapshotObserver()LE0/o0;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic i(Landroidx/compose/ui/viewinterop/c;)LE0/o0;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/c;->getSnapshotObserver()LE0/o0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Landroidx/compose/ui/viewinterop/c;III)I
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/viewinterop/c;->u(III)I

    move-result p0

    return p0
.end method

.method public static final synthetic r(Landroidx/compose/ui/viewinterop/c;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/c;->v:Z

    return-void
.end method

.method private static final t(Lmh/a;)V
    .locals 0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final u(III)I
    .locals 2

    const/high16 v0, 0x40000000    # 2.0f

    if-gez p3, :cond_3

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x2

    const v1, 0x7fffffff

    if-ne p3, p1, :cond_1

    if-eq p2, v1, :cond_1

    const/high16 p1, -0x80000000

    invoke-static {p2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, -0x1

    if-ne p3, p1, :cond_2

    if-eq p2, v1, :cond_2

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {p3, p1, p2}, Lsh/m;->k(III)I

    move-result p1

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :goto_1
    return p1
.end method


# virtual methods
.method public f()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->h:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public gatherTransparentRegion(Landroid/graphics/Region;)Z
    .locals 9

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c;->r:[I

    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c;->r:[I

    const/4 v2, 0x0

    aget v4, v1, v2

    aget v5, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int v6, v4, v1

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c;->r:[I

    aget v1, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int v7, v1, v2

    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    return v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDensity()LY0/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->k:LY0/d;

    return-object v0
.end method

.method public final getInteropView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    return-object v0
.end method

.method public final getLayoutNode()LE0/G;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->w:LE0/G;

    return-object v0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_0
    return-object v0
.end method

.method public final getLifecycleOwner()Landroidx/lifecycle/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->m:Landroidx/lifecycle/o;

    return-object v0
.end method

.method public final getModifier()Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->i:Landroidx/compose/ui/e;

    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->u:LF1/E;

    invoke-virtual {v0}, LF1/E;->a()I

    move-result v0

    return v0
.end method

.method public final getOnDensityChanged$ui_release()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->l:Lmh/l;

    return-object v0
.end method

.method public final getOnModifierChanged$ui_release()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->j:Lmh/l;

    return-object v0
.end method

.method public final getOnRequestDisallowInterceptTouchEvent$ui_release()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->q:Lmh/l;

    return-object v0
.end method

.method public final getRelease()Lmh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/a;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->h:Lmh/a;

    return-object v0
.end method

.method public final getReset()Lmh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/a;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->g:Lmh/a;

    return-object v0
.end method

.method public final getSavedStateRegistryOwner()Lq2/f;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->n:Lq2/f;

    return-object v0
.end method

.method public final getUpdate()Lmh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/a;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->e:Lmh/a;

    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    return-object v0
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->g:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    return-void
.end method

.method public h0()Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    return v0
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->s()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result v0

    return v0
.end method

.method public j(Landroid/view/View;IIIII[I)V
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->b:Lx0/b;

    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p1

    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p2

    invoke-static {p1, p2}, Ll0/h;->a(FF)J

    move-result-wide v1

    invoke-static {p4}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p1

    invoke-static {p5}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p2

    invoke-static {p1, p2}, Ll0/h;->a(FF)J

    move-result-wide v3

    invoke-static {p6}, Landroidx/compose/ui/viewinterop/d;->e(I)I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lx0/b;->b(JJI)J

    move-result-wide p1

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p3

    invoke-static {p3}, Landroidx/compose/ui/platform/J0;->b(F)I

    move-result p3

    const/4 p4, 0x0

    aput p3, p7, p4

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/platform/J0;->b(F)I

    move-result p1

    const/4 p2, 0x1

    aput p1, p7, p2

    return-void
.end method

.method public k(Landroid/view/View;IIIII)V
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->b:Lx0/b;

    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p1

    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p2

    invoke-static {p1, p2}, Ll0/h;->a(FF)J

    move-result-wide v1

    invoke-static {p4}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p1

    invoke-static {p5}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p2

    invoke-static {p1, p2}, Ll0/h;->a(FF)J

    move-result-wide v3

    invoke-static {p6}, Landroidx/compose/ui/viewinterop/d;->e(I)I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lx0/b;->b(JJI)J

    return-void
.end method

.method public l(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    and-int/lit8 p1, p3, 0x2

    const/4 p2, 0x1

    if-nez p1, :cond_1

    and-int/lit8 p1, p3, 0x1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :cond_1
    :goto_0
    return p2
.end method

.method public m(Landroid/view/View;Landroid/view/View;II)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->u:LF1/E;

    invoke-virtual {v0, p1, p2, p3, p4}, LF1/E;->c(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public n(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->u:LF1/E;

    invoke-virtual {v0, p1, p2}, LF1/E;->d(Landroid/view/View;I)V

    return-void
.end method

.method public o(Landroid/view/View;II[II)V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c;->b:Lx0/b;

    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p2

    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p3

    invoke-static {p2, p3}, Ll0/h;->a(FF)J

    move-result-wide p2

    invoke-static {p5}, Landroidx/compose/ui/viewinterop/d;->e(I)I

    move-result p5

    invoke-virtual {p1, p2, p3, p5}, Lx0/b;->d(JI)J

    move-result-wide p1

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p3

    invoke-static {p3}, Landroidx/compose/ui/platform/J0;->b(F)I

    move-result p3

    const/4 p5, 0x0

    aput p3, p4, p5

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/platform/J0;->b(F)I

    move-result p1

    const/4 p2, 0x1

    aput p1, p4, p2

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->o:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->s()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/c;->getSnapshotObserver()LE0/o0;

    move-result-object v0

    invoke-virtual {v0, p0}, LE0/o0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    iput p1, p0, Landroidx/compose/ui/viewinterop/c;->s:I

    iput p2, p0, Landroidx/compose/ui/viewinterop/c;->t:I

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 14

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->isNestedScrollingEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    move-result v0

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    move-result v2

    invoke-static {v0, v2}, LY0/z;->a(FF)J

    move-result-wide v6

    move-object v0, p0

    iget-object v2, v0, Landroidx/compose/ui/viewinterop/c;->b:Lx0/b;

    invoke-virtual {v2}, Lx0/b;->e()LIi/N;

    move-result-object v2

    new-instance v11, Landroidx/compose/ui/viewinterop/c$k;

    const/4 v8, 0x0

    move-object v3, v11

    move/from16 v4, p4

    move-object v5, p0

    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/viewinterop/c$k;-><init>(ZLandroidx/compose/ui/viewinterop/c;JLdh/e;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, v2

    invoke-static/range {v8 .. v13}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return v1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 7

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->isNestedScrollingEnabled()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    move-result p1

    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    move-result p2

    invoke-static {p1, p2}, LY0/z;->a(FF)J

    move-result-wide p1

    iget-object p3, p0, Landroidx/compose/ui/viewinterop/c;->b:Lx0/b;

    invoke-virtual {p3}, Lx0/b;->e()LIi/N;

    move-result-object v1

    new-instance v4, Landroidx/compose/ui/viewinterop/c$l;

    const/4 p3, 0x0

    invoke-direct {v4, p0, p1, p2, p3}, Landroidx/compose/ui/viewinterop/c$l;-><init>(Landroidx/compose/ui/viewinterop/c;JLdh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return v0
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->g:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->q:Lmh/l;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public final s()V
    .locals 3

    iget-boolean v0, p0, Landroidx/compose/ui/viewinterop/c;->v:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->c:Landroid/view/View;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c;->p:Lmh/a;

    new-instance v2, Landroidx/compose/ui/viewinterop/a;

    invoke-direct {v2, v1}, Landroidx/compose/ui/viewinterop/a;-><init>(Lmh/a;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->w:LE0/G;

    invoke-virtual {v0}, LE0/G;->D0()V

    :goto_0
    return-void
.end method

.method public final setDensity(LY0/d;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->k:LY0/d;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->k:LY0/d;

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->l:Lmh/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setLifecycleOwner(Landroidx/lifecycle/o;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->m:Landroidx/lifecycle/o;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->m:Landroidx/lifecycle/o;

    invoke-static {p0, p1}, Landroidx/lifecycle/T;->b(Landroid/view/View;Landroidx/lifecycle/o;)V

    :cond_0
    return-void
.end method

.method public final setModifier(Landroidx/compose/ui/e;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->i:Landroidx/compose/ui/e;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->i:Landroidx/compose/ui/e;

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->j:Lmh/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setOnDensityChanged$ui_release(Lmh/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->l:Lmh/l;

    return-void
.end method

.method public final setOnModifierChanged$ui_release(Lmh/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->j:Lmh/l;

    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui_release(Lmh/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->q:Lmh/l;

    return-void
.end method

.method protected final setRelease(Lmh/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->h:Lmh/a;

    return-void
.end method

.method protected final setReset(Lmh/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->g:Lmh/a;

    return-void
.end method

.method public final setSavedStateRegistryOwner(Lq2/f;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->n:Lq2/f;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->n:Lq2/f;

    invoke-static {p0, p1}, Lq2/g;->b(Landroid/view/View;Lq2/f;)V

    :cond_0
    return-void
.end method

.method protected final setUpdate(Lmh/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->e:Lmh/a;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/c;->f:Z

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c;->o:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final v()V
    .locals 3

    iget v0, p0, Landroidx/compose/ui/viewinterop/c;->s:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    iget v2, p0, Landroidx/compose/ui/viewinterop/c;->t:I

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->measure(II)V

    :cond_1
    :goto_0
    return-void
.end method
