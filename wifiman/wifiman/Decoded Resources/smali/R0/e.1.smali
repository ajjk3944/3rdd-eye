.class public final LR0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ly0/M;

.field private final b:LR0/u;

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

.field private m:Lmh/l;

.field private n:Ll0/i;

.field private o:Ll0/i;

.field private final p:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field private final q:[F

.field private final r:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly0/M;LR0/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/e;->a:Ly0/M;

    iput-object p2, p0, LR0/e;->b:LR0/u;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/e;->c:Ljava/lang/Object;

    sget-object p1, LR0/e$b;->a:LR0/e$b;

    iput-object p1, p0, LR0/e;->m:Lmh/l;

    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    iput-object p1, p0, LR0/e;->p:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2, p1}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object p1

    iput-object p1, p0, LR0/e;->q:[F

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, LR0/e;->r:Landroid/graphics/Matrix;

    return-void
.end method

.method private final c()V
    .locals 12

    iget-object v0, p0, LR0/e;->b:LR0/u;

    invoke-interface {v0}, LR0/u;->isActive()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LR0/e;->m:Lmh/l;

    iget-object v1, p0, LR0/e;->q:[F

    invoke-static {v1}, Lm0/O0;->a([F)Lm0/O0;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LR0/e;->a:Ly0/M;

    iget-object v1, p0, LR0/e;->q:[F

    invoke-interface {v0, v1}, Ly0/M;->t([F)V

    iget-object v0, p0, LR0/e;->r:Landroid/graphics/Matrix;

    iget-object v1, p0, LR0/e;->q:[F

    invoke-static {v0, v1}, Lm0/P;->a(Landroid/graphics/Matrix;[F)V

    iget-object v0, p0, LR0/e;->b:LR0/u;

    iget-object v1, p0, LR0/e;->p:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    iget-object v2, p0, LR0/e;->j:LR0/Q;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v3, p0, LR0/e;->l:LR0/H;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v4, p0, LR0/e;->k:LL0/M;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v5, p0, LR0/e;->r:Landroid/graphics/Matrix;

    iget-object v6, p0, LR0/e;->n:Ll0/i;

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v7, p0, LR0/e;->o:Ll0/i;

    invoke-static {v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-boolean v8, p0, LR0/e;->f:Z

    iget-boolean v9, p0, LR0/e;->g:Z

    iget-boolean v10, p0, LR0/e;->h:Z

    iget-boolean v11, p0, LR0/e;->i:Z

    invoke-static/range {v1 .. v11}, LR0/d;->b(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LR0/Q;LR0/H;LL0/M;Landroid/graphics/Matrix;Ll0/i;Ll0/i;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v1

    invoke-interface {v0, v1}, LR0/u;->c(Landroid/view/inputmethod/CursorAnchorInfo;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LR0/e;->e:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LR0/e;->c:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, LR0/e;->j:LR0/Q;

    iput-object v1, p0, LR0/e;->l:LR0/H;

    iput-object v1, p0, LR0/e;->k:LL0/M;

    sget-object v2, LR0/e$a;->a:LR0/e$a;

    iput-object v2, p0, LR0/e;->m:Lmh/l;

    iput-object v1, p0, LR0/e;->n:Ll0/i;

    iput-object v1, p0, LR0/e;->o:Ll0/i;

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

    iget-object v0, p0, LR0/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-boolean p3, p0, LR0/e;->f:Z

    iput-boolean p4, p0, LR0/e;->g:Z

    iput-boolean p5, p0, LR0/e;->h:Z

    iput-boolean p6, p0, LR0/e;->i:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LR0/e;->e:Z

    iget-object p1, p0, LR0/e;->j:LR0/Q;

    if-eqz p1, :cond_0

    invoke-direct {p0}, LR0/e;->c()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iput-boolean p2, p0, LR0/e;->d:Z

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final d(LR0/Q;LR0/H;LL0/M;Lmh/l;Ll0/i;Ll0/i;)V
    .locals 1

    iget-object v0, p0, LR0/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, LR0/e;->j:LR0/Q;

    iput-object p2, p0, LR0/e;->l:LR0/H;

    iput-object p3, p0, LR0/e;->k:LL0/M;

    iput-object p4, p0, LR0/e;->m:Lmh/l;

    iput-object p5, p0, LR0/e;->n:Ll0/i;

    iput-object p6, p0, LR0/e;->o:Ll0/i;

    iget-boolean p1, p0, LR0/e;->e:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, LR0/e;->d:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-direct {p0}, LR0/e;->c()V

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
