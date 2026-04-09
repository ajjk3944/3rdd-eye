.class public final LR0/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/L;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR0/V$a;,
        LR0/V$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/view/View;

.field private final b:LR0/u;

.field private final c:Ljava/util/concurrent/Executor;

.field private d:Z

.field private e:Lmh/l;

.field private f:Lmh/l;

.field private g:LR0/Q;

.field private h:LR0/s;

.field private i:Ljava/util/List;

.field private final j:LYg/m;

.field private k:Landroid/graphics/Rect;

.field private final l:LR0/e;

.field private final m:LV/b;

.field private n:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Ly0/M;)V
    .locals 7

    .line 16
    new-instance v3, LR0/v;

    invoke-direct {v3, p1}, LR0/v;-><init>(Landroid/view/View;)V

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 17
    invoke-direct/range {v0 .. v6}, LR0/V;-><init>(Landroid/view/View;Ly0/M;LR0/u;Ljava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Ly0/M;LR0/u;Ljava/util/concurrent/Executor;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LR0/V;->a:Landroid/view/View;

    .line 3
    iput-object p3, p0, LR0/V;->b:LR0/u;

    .line 4
    iput-object p4, p0, LR0/V;->c:Ljava/util/concurrent/Executor;

    .line 5
    sget-object p1, LR0/V$e;->a:LR0/V$e;

    iput-object p1, p0, LR0/V;->e:Lmh/l;

    .line 6
    sget-object p1, LR0/V$f;->a:LR0/V$f;

    iput-object p1, p0, LR0/V;->f:Lmh/l;

    .line 7
    new-instance p1, LR0/Q;

    sget-object p4, LL0/S;->b:LL0/S$a;

    invoke-virtual {p4}, LL0/S$a;->a()J

    move-result-wide v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, ""

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LR0/V;->g:LR0/Q;

    .line 8
    sget-object p1, LR0/s;->g:LR0/s$a;

    invoke-virtual {p1}, LR0/s$a;->a()LR0/s;

    move-result-object p1

    iput-object p1, p0, LR0/V;->h:LR0/s;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LR0/V;->i:Ljava/util/List;

    .line 10
    sget-object p1, LYg/q;->NONE:LYg/q;

    new-instance p4, LR0/V$c;

    invoke-direct {p4, p0}, LR0/V$c;-><init>(LR0/V;)V

    invoke-static {p1, p4}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LR0/V;->j:LYg/m;

    .line 11
    new-instance p1, LR0/e;

    invoke-direct {p1, p2, p3}, LR0/e;-><init>(Ly0/M;LR0/u;)V

    iput-object p1, p0, LR0/V;->l:LR0/e;

    .line 12
    new-instance p1, LV/b;

    const/16 p2, 0x10

    new-array p2, p2, [LR0/V$a;

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, LV/b;-><init>([Ljava/lang/Object;I)V

    .line 13
    iput-object p1, p0, LR0/V;->m:LV/b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;Ly0/M;LR0/u;Ljava/util/concurrent/Executor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 14
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p4

    invoke-static {p4}, LR0/Y;->d(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;

    move-result-object p4

    .line 15
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LR0/V;-><init>(Landroid/view/View;Ly0/M;LR0/u;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic i(LR0/V;)V
    .locals 0

    invoke-static {p0}, LR0/V;->w(LR0/V;)V

    return-void
.end method

.method public static final synthetic j(LR0/V;)Landroid/view/inputmethod/BaseInputConnection;
    .locals 0

    invoke-direct {p0}, LR0/V;->p()Landroid/view/inputmethod/BaseInputConnection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LR0/V;)LR0/e;
    .locals 0

    iget-object p0, p0, LR0/V;->l:LR0/e;

    return-object p0
.end method

.method public static final synthetic l(LR0/V;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LR0/V;->i:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic m(LR0/V;)Lmh/l;
    .locals 0

    iget-object p0, p0, LR0/V;->e:Lmh/l;

    return-object p0
.end method

.method public static final synthetic n(LR0/V;)Lmh/l;
    .locals 0

    iget-object p0, p0, LR0/V;->f:Lmh/l;

    return-object p0
.end method

.method private final p()Landroid/view/inputmethod/BaseInputConnection;
    .locals 1

    iget-object v0, p0, LR0/V;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/BaseInputConnection;

    return-object v0
.end method

.method private final s()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    iget-object v2, p0, LR0/V;->m:LV/b;

    invoke-virtual {v2}, LV/b;->o()I

    move-result v3

    if-lez v3, :cond_1

    invoke-virtual {v2}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x0

    :cond_0
    aget-object v5, v2, v4

    check-cast v5, LR0/V$a;

    invoke-static {v5, v0, v1}, LR0/V;->t(LR0/V$a;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V

    add-int/lit8 v4, v4, 0x1

    if-lt v4, v3, :cond_0

    :cond_1
    iget-object v2, p0, LR0/V;->m:LV/b;

    invoke-virtual {v2}, LV/b;->h()V

    iget-object v2, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0}, LR0/V;->u()V

    :cond_2
    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-direct {p0, v1}, LR0/V;->x(Z)V

    :cond_3
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, LR0/V;->u()V

    :cond_4
    return-void
.end method

.method private static final t(LR0/V$a;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V
    .locals 3

    sget-object v0, LR0/V$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, LR0/V$a;->ShowKeyboard:LR0/V$a;

    if-ne p0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    iput-object p0, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iput-object p0, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iput-object p0, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_4
    :goto_1
    return-void
.end method

.method private final u()V
    .locals 1

    iget-object v0, p0, LR0/V;->b:LR0/u;

    invoke-interface {v0}, LR0/u;->b()V

    return-void
.end method

.method private final v(LR0/V$a;)V
    .locals 1

    iget-object v0, p0, LR0/V;->m:LV/b;

    invoke-virtual {v0, p1}, LV/b;->b(Ljava/lang/Object;)Z

    iget-object p1, p0, LR0/V;->n:Ljava/lang/Runnable;

    if-nez p1, :cond_0

    new-instance p1, LR0/U;

    invoke-direct {p1, p0}, LR0/U;-><init>(LR0/V;)V

    iget-object v0, p0, LR0/V;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iput-object p1, p0, LR0/V;->n:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method private static final w(LR0/V;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LR0/V;->n:Ljava/lang/Runnable;

    invoke-direct {p0}, LR0/V;->s()V

    return-void
.end method

.method private final x(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, LR0/V;->b:LR0/u;

    invoke-interface {p1}, LR0/u;->f()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LR0/V;->b:LR0/u;

    invoke-interface {p1}, LR0/u;->e()V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(LR0/Q;LR0/s;Lmh/l;Lmh/l;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LR0/V;->d:Z

    iput-object p1, p0, LR0/V;->g:LR0/Q;

    iput-object p2, p0, LR0/V;->h:LR0/s;

    iput-object p3, p0, LR0/V;->e:Lmh/l;

    iput-object p4, p0, LR0/V;->f:Lmh/l;

    sget-object p1, LR0/V$a;->StartInput:LR0/V$a;

    invoke-direct {p0, p1}, LR0/V;->v(LR0/V$a;)V

    return-void
.end method

.method public b()V
    .locals 1

    sget-object v0, LR0/V$a;->StartInput:LR0/V$a;

    invoke-direct {p0, v0}, LR0/V;->v(LR0/V$a;)V

    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, LR0/V$a;->ShowKeyboard:LR0/V$a;

    invoke-direct {p0, v0}, LR0/V;->v(LR0/V$a;)V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LR0/V;->d:Z

    sget-object v0, LR0/V$g;->a:LR0/V$g;

    iput-object v0, p0, LR0/V;->e:Lmh/l;

    sget-object v0, LR0/V$h;->a:LR0/V$h;

    iput-object v0, p0, LR0/V;->f:Lmh/l;

    const/4 v0, 0x0

    iput-object v0, p0, LR0/V;->k:Landroid/graphics/Rect;

    sget-object v0, LR0/V$a;->StopInput:LR0/V$a;

    invoke-direct {p0, v0}, LR0/V;->v(LR0/V$a;)V

    return-void
.end method

.method public e(LR0/Q;LR0/H;LL0/M;Lmh/l;Ll0/i;Ll0/i;)V
    .locals 7

    iget-object v0, p0, LR0/V;->l:LR0/e;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, LR0/e;->d(LR0/Q;LR0/H;LL0/M;Lmh/l;Ll0/i;Ll0/i;)V

    return-void
.end method

.method public f(LR0/Q;LR0/Q;)V
    .locals 6

    iget-object v0, p0, LR0/V;->g:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v0

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LL0/S;->g(JJ)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LR0/V;->g:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->g()LL0/S;

    move-result-object v0

    invoke-virtual {p2}, LR0/Q;->g()LL0/S;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-object p2, p0, LR0/V;->g:LR0/Q;

    iget-object v2, p0, LR0/V;->i:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    move v3, v1

    :goto_2
    if-ge v3, v2, :cond_3

    iget-object v4, p0, LR0/V;->i:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LR0/M;

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v4, p2}, LR0/M;->f(LR0/Q;)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget-object v2, p0, LR0/V;->l:LR0/e;

    invoke-virtual {v2}, LR0/e;->a()V

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v0, :cond_6

    iget-object p1, p0, LR0/V;->b:LR0/u;

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result v0

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result p2

    iget-object v1, p0, LR0/V;->g:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->g()LL0/S;

    move-result-object v1

    const/4 v2, -0x1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LL0/S;->r()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->l(J)I

    move-result v1

    goto :goto_4

    :cond_4
    move v1, v2

    :goto_4
    iget-object v3, p0, LR0/V;->g:LR0/Q;

    invoke-virtual {v3}, LR0/Q;->g()LL0/S;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, LL0/S;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->k(J)I

    move-result v2

    :cond_5
    invoke-interface {p1, v0, p2, v1, v2}, LR0/u;->a(IIII)V

    :cond_6
    return-void

    :cond_7
    if-eqz p1, :cond_9

    invoke-virtual {p1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v2

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LL0/S;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, LR0/Q;->g()LL0/S;

    move-result-object p1

    invoke-virtual {p2}, LR0/Q;->g()LL0/S;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    :cond_8
    invoke-direct {p0}, LR0/V;->u()V

    goto :goto_6

    :cond_9
    iget-object p1, p0, LR0/V;->i:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    :goto_5
    if-ge v1, p1, :cond_b

    iget-object p2, p0, LR0/V;->i:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LR0/M;

    if-eqz p2, :cond_a

    iget-object v0, p0, LR0/V;->g:LR0/Q;

    iget-object v2, p0, LR0/V;->b:LR0/u;

    invoke-virtual {p2, v0, v2}, LR0/M;->g(LR0/Q;LR0/u;)V

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_b
    :goto_6
    return-void
.end method

.method public g()V
    .locals 1

    sget-object v0, LR0/V$a;->HideKeyboard:LR0/V$a;

    invoke-direct {p0, v0}, LR0/V;->v(LR0/V$a;)V

    return-void
.end method

.method public h(Ll0/i;)V
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v1

    invoke-static {v1}, Loh/b;->e(F)I

    move-result v1

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v2

    invoke-static {v2}, Loh/b;->e(F)I

    move-result v2

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v3

    invoke-static {v3}, Loh/b;->e(F)I

    move-result v3

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result p1

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, LR0/V;->k:Landroid/graphics/Rect;

    iget-object p1, p0, LR0/V;->i:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LR0/V;->k:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    iget-object v0, p0, LR0/V;->a:Landroid/view/View;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    :cond_0
    return-void
.end method

.method public final o(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    iget-boolean v0, p0, LR0/V;->d:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LR0/V;->h:LR0/s;

    iget-object v1, p0, LR0/V;->g:LR0/Q;

    invoke-static {p1, v0, v1}, LR0/Y;->h(Landroid/view/inputmethod/EditorInfo;LR0/s;LR0/Q;)V

    invoke-static {p1}, LR0/Y;->c(Landroid/view/inputmethod/EditorInfo;)V

    iget-object p1, p0, LR0/V;->g:LR0/Q;

    iget-object v0, p0, LR0/V;->h:LR0/s;

    invoke-virtual {v0}, LR0/s;->b()Z

    move-result v0

    new-instance v1, LR0/V$d;

    invoke-direct {v1, p0}, LR0/V$d;-><init>(LR0/V;)V

    new-instance v2, LR0/M;

    invoke-direct {v2, p1, v1, v0}, LR0/M;-><init>(LR0/Q;LR0/t;Z)V

    iget-object p1, p0, LR0/V;->i:Ljava/util/List;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v2
.end method

.method public final q()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LR0/V;->a:Landroid/view/View;

    return-object v0
.end method

.method public final r()Z
    .locals 1

    iget-boolean v0, p0, LR0/V;->d:Z

    return v0
.end method
