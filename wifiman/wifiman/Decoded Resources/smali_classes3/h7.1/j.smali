.class public final Lh7/j;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh7/j$a;
    }
.end annotation


# static fields
.field public static final g:Lh7/j$a;


# instance fields
.field private a:Lh7/g;

.field private final b:Le7/e;

.field private final c:Lk7/d;

.field private d:Lhg/b;

.field private final e:Li7/c;

.field private f:Lm7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh7/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh7/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lh7/j;->g:Lh7/j$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Le7/e;

    invoke-direct {v0}, Le7/e;-><init>()V

    iput-object v0, p0, Lh7/j;->b:Le7/e;

    sget-object v1, Lcom/ubnt/usurvey/a;->r:Lcom/ubnt/usurvey/a$a;

    invoke-virtual {v1}, Lcom/ubnt/usurvey/a$a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object v1

    invoke-interface {v1}, Lcom/ubnt/usurvey/a$b;->getConfig()Lcom/ubnt/usurvey/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/usurvey/a;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lk7/d;

    const v2, 0x3f4ccccd    # 0.8f

    const-wide/16 v3, 0x1f4

    invoke-direct {v1, p1, v2, v3, v4}, Lk7/d;-><init>(Landroid/content/Context;FJ)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Lh7/j;->c:Lk7/d;

    new-instance v2, Li7/c;

    invoke-direct {v2, p1}, Li7/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Li7/c;->setFrameSpacePositionProcessor$ar_floorplan_release(Le7/d;)V

    invoke-virtual {v2, v1}, Li7/c;->setFrameObjectDetector$ar_floorplan_release(Le7/d;)V

    iput-object v2, p0, Lh7/j;->e:Li7/c;

    const/high16 p1, -0x1000000

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    const/4 p1, -0x1

    invoke-virtual {p0, v2, p1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lh7/j;->setupArFrameProcessing$lambda$2(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lh7/j;->j()V

    return-void
.end method

.method public static final synthetic c(Lh7/j;)Lh7/g;
    .locals 0

    invoke-direct {p0}, Lh7/j;->getRequiredController()Lh7/g;

    move-result-object p0

    return-object p0
.end method

.method private final d()Lgg/b;
    .locals 2

    iget-object v0, p0, Lh7/j;->c:Lk7/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk7/d;->i()Lgg/i;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lh7/j$b;

    invoke-direct {v1, p0}, Lh7/j$b;-><init>(Lh7/j;)V

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lgg/i;->E0()Lgg/b;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "complete(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method private final e()Lgg/b;
    .locals 2

    iget-object v0, p0, Lh7/j;->b:Le7/e;

    invoke-virtual {v0}, Le7/e;->b()Lgg/i;

    move-result-object v0

    new-instance v1, Lh7/j$c;

    invoke-direct {v1, p0}, Lh7/j$c;-><init>(Lh7/j;)V

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->E0()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "ignoreElements(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final getRequiredController()Lh7/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh7/g;"
        }
    .end annotation

    iget-object v0, p0, Lh7/j;->a:Lh7/g;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "setup() needs to be called first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final i()V
    .locals 6

    iget-object v0, p0, Lh7/j;->d:Lhg/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhg/b;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lh7/h;

    invoke-direct {v0}, Lh7/h;-><init>()V

    new-instance v1, Lh7/i;

    invoke-direct {v1}, Lh7/i;-><init>()V

    new-instance v2, Lhg/b;

    invoke-direct {p0}, Lh7/j;->e()Lgg/b;

    move-result-object v3

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    invoke-virtual {v3, v4}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object v3

    invoke-direct {p0}, Lh7/j;->d()Lgg/b;

    move-result-object v4

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v5

    invoke-virtual {v4, v5}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lhg/c;

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const/4 v3, 0x1

    aput-object v0, v1, v3

    invoke-direct {v2, v1}, Lhg/b;-><init>([Lhg/c;)V

    iput-object v2, p0, Lh7/j;->d:Lhg/b;

    return-void
.end method

.method private static final j()V
    .locals 0

    return-void
.end method

.method private final k()V
    .locals 1

    iget-object v0, p0, Lh7/j;->d:Lhg/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhg/b;->dispose()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lh7/j;->d:Lhg/b;

    return-void
.end method

.method private static final setupArFrameProcessing$lambda$2(Ljava/lang/Throwable;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final f()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string/jumbo v2, "FloorplanAR Paused"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lh7/j;->e:Li7/c;

    invoke-virtual {v0}, Li7/c;->f()V

    invoke-direct {p0}, Lh7/j;->k()V

    return-void
.end method

.method public final g(Z)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string/jumbo v2, "FloorplanAR View resumed"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lh7/j;->e:Li7/c;

    invoke-virtual {v0, p1}, Li7/c;->g(Z)V

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lh7/j;->i()V

    :cond_0
    return-void
.end method

.method public final getGestureWrapper()Lm7/d;
    .locals 1

    iget-object v0, p0, Lh7/j;->f:Lm7/d;

    return-object v0
.end method

.method public final getSurfaceView()Li7/c;
    .locals 1

    iget-object v0, p0, Lh7/j;->e:Li7/c;

    return-object v0
.end method

.method public final h(Lh7/g;Lm7/e;)V
    .locals 2

    const-string/jumbo v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "renderer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh7/j;->a:Lh7/g;

    iget-object v0, p0, Lh7/j;->e:Li7/c;

    invoke-virtual {p1, v0}, Lh7/g;->P(Li7/a;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lm7/d;

    invoke-direct {v1, v0, p2, p1}, Lm7/d;-><init>(Landroid/content/Context;Lm7/e;Lm7/b;)V

    iput-object v1, p0, Lh7/j;->f:Lm7/d;

    iget-object p1, p0, Lh7/j;->e:Li7/c;

    invoke-virtual {p1, p2}, Li7/c;->setTilesRenderer(Lm7/e;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lh7/j;->e:Li7/c;

    invoke-virtual {v0}, Li7/c;->onDetachedFromWindow()V

    iget-object v0, p0, Lh7/j;->a:Lh7/g;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lh7/j;->e:Li7/c;

    invoke-virtual {v0, v1}, Lh7/g;->P(Li7/a;)V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lh7/j;->f:Lm7/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lm7/d;->l(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final setGestureWrapper(Lm7/d;)V
    .locals 0

    iput-object p1, p0, Lh7/j;->f:Lm7/d;

    return-void
.end method
