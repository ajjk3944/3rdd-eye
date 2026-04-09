.class public final LI/M0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lmh/l;

.field private final b:LI/I0;

.field private final c:Ljava/lang/Object;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:LR0/Q;

.field private k:LL0/M;

.field private l:LR0/H;

.field private m:Ll0/i;

.field private n:Ll0/i;

.field private final o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field private final p:[F

.field private final q:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/l;LI/I0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/M0;->a:Lmh/l;

    iput-object p2, p0, LI/M0;->b:LI/I0;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/M0;->c:Ljava/lang/Object;

    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    iput-object p1, p0, LI/M0;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2, p1}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object p1

    iput-object p1, p0, LI/M0;->p:[F

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, LI/M0;->q:Landroid/graphics/Matrix;

    return-void
.end method

.method private final c()V
    .locals 12

    iget-object v0, p0, LI/M0;->b:LI/I0;

    invoke-interface {v0}, LI/I0;->isActive()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LI/M0;->j:LR0/Q;

    if-eqz v0, :cond_1

    iget-object v0, p0, LI/M0;->l:LR0/H;

    if-eqz v0, :cond_1

    iget-object v0, p0, LI/M0;->k:LL0/M;

    if-eqz v0, :cond_1

    iget-object v0, p0, LI/M0;->m:Ll0/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, LI/M0;->n:Ll0/i;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LI/M0;->p:[F

    invoke-static {v0}, Lm0/O0;->h([F)V

    iget-object v0, p0, LI/M0;->a:Lmh/l;

    iget-object v1, p0, LI/M0;->p:[F

    invoke-static {v1}, Lm0/O0;->a([F)Lm0/O0;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LI/M0;->p:[F

    iget-object v1, p0, LI/M0;->n:Ll0/i;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll0/i;->k()F

    move-result v1

    neg-float v1, v1

    iget-object v2, p0, LI/M0;->n:Ll0/i;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ll0/i;->n()F

    move-result v2

    neg-float v2, v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lm0/O0;->p([FFFF)V

    iget-object v0, p0, LI/M0;->q:Landroid/graphics/Matrix;

    iget-object v1, p0, LI/M0;->p:[F

    invoke-static {v0, v1}, Lm0/P;->a(Landroid/graphics/Matrix;[F)V

    iget-object v0, p0, LI/M0;->b:LI/I0;

    iget-object v1, p0, LI/M0;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    iget-object v2, p0, LI/M0;->j:LR0/Q;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v3, p0, LI/M0;->l:LR0/H;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v4, p0, LI/M0;->k:LL0/M;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v5, p0, LI/M0;->q:Landroid/graphics/Matrix;

    iget-object v6, p0, LI/M0;->m:Ll0/i;

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v7, p0, LI/M0;->n:Ll0/i;

    invoke-static {v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-boolean v8, p0, LI/M0;->f:Z

    iget-boolean v9, p0, LI/M0;->g:Z

    iget-boolean v10, p0, LI/M0;->h:Z

    iget-boolean v11, p0, LI/M0;->i:Z

    invoke-static/range {v1 .. v11}, LI/L0;->b(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LR0/Q;LR0/H;LL0/M;Landroid/graphics/Matrix;Ll0/i;Ll0/i;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v1

    invoke-interface {v0, v1}, LI/I0;->c(Landroid/view/inputmethod/CursorAnchorInfo;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LI/M0;->e:Z

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LI/M0;->c:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, LI/M0;->j:LR0/Q;

    iput-object v1, p0, LI/M0;->l:LR0/H;

    iput-object v1, p0, LI/M0;->k:LL0/M;

    iput-object v1, p0, LI/M0;->m:Ll0/i;

    iput-object v1, p0, LI/M0;->n:Ll0/i;

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final b(ZZZZZZ)V
    .locals 1

    iget-object v0, p0, LI/M0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-boolean p3, p0, LI/M0;->f:Z

    iput-boolean p4, p0, LI/M0;->g:Z

    iput-boolean p5, p0, LI/M0;->h:Z

    iput-boolean p6, p0, LI/M0;->i:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LI/M0;->e:Z

    iget-object p1, p0, LI/M0;->j:LR0/Q;

    if-eqz p1, :cond_0

    invoke-direct {p0}, LI/M0;->c()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iput-boolean p2, p0, LI/M0;->d:Z

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final d(LR0/Q;LR0/H;LL0/M;Ll0/i;Ll0/i;)V
    .locals 1

    iget-object v0, p0, LI/M0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, LI/M0;->j:LR0/Q;

    iput-object p2, p0, LI/M0;->l:LR0/H;

    iput-object p3, p0, LI/M0;->k:LL0/M;

    iput-object p4, p0, LI/M0;->m:Ll0/i;

    iput-object p5, p0, LI/M0;->n:Ll0/i;

    iget-boolean p1, p0, LI/M0;->e:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, LI/M0;->d:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-direct {p0}, LI/M0;->c()V

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method
