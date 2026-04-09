.class public abstract LW9/e;
.super LR9/a;
.source "SourceFile"

# interfaces
.implements LW9/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW9/e$a;,
        LW9/e$b;,
        LW9/e$c;,
        LW9/e$d;
    }
.end annotation


# static fields
.field public static final p:LW9/e$b;

.field public static final q:I


# instance fields
.field private final e:Landroidx/lifecycle/E;

.field private final f:Lcom/ui/core/ui/sso/c;

.field private final g:LU9/h;

.field private final h:LLi/z;

.field private final i:LLi/z;

.field private final j:LLi/z;

.field private final k:LLi/z;

.field private final l:LLi/z;

.field private m:Z

.field private n:J

.field private o:LW9/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LW9/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW9/e$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LW9/e;->p:LW9/e$b;

    const/16 v0, 0x8

    sput v0, LW9/e;->q:I

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;)V
    .locals 2

    const-string/jumbo v0, "savedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "session"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "activityController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LR9/a;-><init>()V

    iput-object p1, p0, LW9/e;->e:Landroidx/lifecycle/E;

    iput-object p2, p0, LW9/e;->f:Lcom/ui/core/ui/sso/c;

    iput-object p3, p0, LW9/e;->g:LU9/h;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, LW9/e;->h:LLi/z;

    new-instance p3, Ls9/d$b;

    sget v0, LP9/b;->t:I

    invoke-direct {p3, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p3}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, LW9/e;->i:LLi/z;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, LW9/e;->j:LLi/z;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p2

    iput-object p2, p0, LW9/e;->k:LLi/z;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p2

    iput-object p2, p0, LW9/e;->l:LLi/z;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    const/16 v0, 0x2710

    int-to-long v0, v0

    add-long/2addr p2, v0

    iput-wide p2, p0, LW9/e;->n:J

    sget-object p2, LW9/e$a;->IDLE:LW9/e$a;

    iput-object p2, p0, LW9/e;->o:LW9/e$a;

    const-string/jumbo p2, "saved_state_base_mfa_auth"

    invoke-virtual {p1, p2}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LW9/e$c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LW9/e$c;->a()J

    move-result-wide p1

    iput-wide p1, p0, LW9/e;->n:J

    :cond_0
    invoke-virtual {p0}, LW9/e;->E0()V

    invoke-direct {p0}, LW9/e;->u0()V

    invoke-direct {p0}, LW9/e;->s0()V

    return-void
.end method

.method private static final A0(LW9/e;)V
    .locals 1

    sget-object v0, LW9/e$a;->IDLE:LW9/e$a;

    invoke-virtual {p0, v0}, LW9/e;->H0(LW9/e$a;)V

    return-void
.end method

.method static synthetic B0(LW9/e;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, LW9/e;->j:LLi/z;

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-direct {p0}, LW9/e;->F0()Lgg/b;

    move-result-object p1

    new-instance v0, LW9/a;

    invoke-direct {v0, p0}, LW9/a;-><init>(LW9/e;)V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "doOnComplete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW9/b;

    invoke-direct {v0}, LW9/b;-><init>()V

    invoke-virtual {p0, p1, v0}, LW9/e;->r0(Lgg/b;Lmh/p;)Lgg/b;

    move-result-object p1

    new-instance v0, LW9/e$o;

    invoke-direct {v0, p0}, LW9/e$o;-><init>(LW9/e;)V

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, LW9/c;

    invoke-direct {v0, p0}, LW9/c;-><init>(LW9/e;)V

    invoke-virtual {p1, v0}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->S()Lhg/c;

    move-result-object p1

    const-string/jumbo v0, "subscribe(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LR9/a;->c0(Lhg/c;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method static synthetic D0(LW9/e;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object p0

    sget-object p1, LQ9/j$a$a;->a:LQ9/j$a$a;

    invoke-interface {p0, p1}, LQ9/j;->b(LQ9/j$a;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final F0()Lgg/b;
    .locals 1

    invoke-virtual {p0}, LW9/e;->G0()Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e0(LW9/e;)V
    .locals 0

    invoke-static {p0}, LW9/e;->A0(LW9/e;)V

    return-void
.end method

.method public static synthetic f0(Ljava/lang/Throwable;Ls9/d;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, LW9/e;->z0(Ljava/lang/Throwable;Ls9/d;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Ljava/lang/Throwable;Ls9/d;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, LW9/e;->t0(Ljava/lang/Throwable;Ls9/d;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(LW9/e;)V
    .locals 0

    invoke-static {p0}, LW9/e;->y0(LW9/e;)V

    return-void
.end method

.method public static final synthetic i0(LW9/e;)J
    .locals 2

    iget-wide v0, p0, LW9/e;->n:J

    return-wide v0
.end method

.method private final s0()V
    .locals 2

    new-instance v0, LW9/e$h;

    invoke-direct {v0, p0}, LW9/e$h;-><init>(LW9/e;)V

    invoke-static {v0}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "fromCallable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LW9/e$i;->a:LW9/e$i;

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LW9/d;

    invoke-direct {v1}, LW9/d;-><init>()V

    invoke-virtual {p0, v0, v1}, LW9/e;->r0(Lgg/b;Lmh/p;)Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->S()Lhg/c;

    move-result-object v0

    const-string/jumbo v1, "subscribe(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method private static final t0(Ljava/lang/Throwable;Ls9/d;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LW9/e$k;

    invoke-direct {p1, p0}, LW9/e$k;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "fromCallable(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final u0()V
    .locals 5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 v2, 0x2710

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LW9/e;->n:J

    const-wide/16 v0, 0xc8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v0, v1, v2}, Lgg/i;->F0(JJLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v0

    new-instance v1, LW9/e$l;

    invoke-direct {v1, p0}, LW9/e$l;-><init>(LW9/e;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, LW9/e$m;

    invoke-direct {v1, p0}, LW9/e$m;-><init>(LW9/e;)V

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->A1()Lhg/c;

    move-result-object v0

    const-string/jumbo v1, "subscribe(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method static synthetic x0(LW9/e;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LW9/e;->g:LU9/h;

    sget-object p1, LU9/j;->a:LU9/j;

    invoke-virtual {p0, p1}, LU9/h;->e0(LU9/h$a;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final y0(LW9/e;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 v2, 0x2710

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LW9/e;->n:J

    return-void
.end method

.method private static final z0(Ljava/lang/Throwable;Ls9/d;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LW9/e$p;

    invoke-direct {p1, p0}, LW9/e$p;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "fromCallable(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public C0(Lcom/ui/core/ui/sso/UiSSO$a;)V
    .locals 2

    const-string/jumbo v0, "authResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LW9/e;->g:LU9/h;

    new-instance v1, LU9/k;

    invoke-direct {v1, p1}, LU9/k;-><init>(Lcom/ui/core/ui/sso/UiSSO$a;)V

    invoke-virtual {v0, v1}, LU9/h;->e0(LU9/h$a;)V

    return-void
.end method

.method public bridge synthetic D()LLi/N;
    .locals 1

    iget-object v0, p0, LW9/e;->l:LLi/z;

    return-object v0
.end method

.method public bridge synthetic E()LLi/N;
    .locals 1

    iget-object v0, p0, LW9/e;->k:LLi/z;

    return-object v0
.end method

.method protected final E0()V
    .locals 2

    iget-object v0, p0, LW9/e;->o:LW9/e$a;

    sget-object v1, LW9/e$d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LW9/e;->h:LLi/z;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, LW9/e;->h:LLi/z;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LW9/e;->h:LLi/z;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic F()LLi/N;
    .locals 1

    iget-object v0, p0, LW9/e;->h:LLi/z;

    return-object v0
.end method

.method protected abstract G0()Lgg/b;
.end method

.method public H(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LW9/e;->D0(LW9/e;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final H0(LW9/e$a;)V
    .locals 1

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LW9/e;->o:LW9/e$a;

    invoke-virtual {p0}, LW9/e;->E0()V

    return-void
.end method

.method protected I0()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LW9/e;->m:Z

    iget-object v0, p0, LW9/e;->l:LLi/z;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic M()LLi/N;
    .locals 1

    iget-object v0, p0, LW9/e;->i:LLi/z;

    return-object v0
.end method

.method public R(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LW9/e;->x0(LW9/e;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a0()V
    .locals 4

    invoke-super {p0}, LR9/a;->a0()V

    iget-object v0, p0, LW9/e;->e:Landroidx/lifecycle/E;

    new-instance v1, LW9/e$c;

    iget-wide v2, p0, LW9/e;->n:J

    invoke-direct {v1, v2, v3}, LW9/e$c;-><init>(J)V

    const-string/jumbo v2, "saved_state_base_mfa_auth"

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method protected final j0()LU9/h;
    .locals 1

    iget-object v0, p0, LW9/e;->g:LU9/h;

    return-object v0
.end method

.method public k(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LW9/e;->B0(LW9/e;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k0()LLi/z;
    .locals 1

    iget-object v0, p0, LW9/e;->k:LLi/z;

    return-object v0
.end method

.method public final l0()LLi/z;
    .locals 1

    iget-object v0, p0, LW9/e;->j:LLi/z;

    return-object v0
.end method

.method public final m0()LLi/z;
    .locals 1

    iget-object v0, p0, LW9/e;->i:LLi/z;

    return-object v0
.end method

.method protected n0(J)Ls9/d;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    new-instance v0, Ls9/d$a;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LW9/e$e;

    invoke-direct {v2, p1, p2}, LW9/e$e;-><init>(J)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ls9/d$b;

    sget p1, LP9/b;->t:I

    invoke-direct {v0, p1}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object v0
.end method

.method protected final o0()Landroidx/lifecycle/E;
    .locals 1

    iget-object v0, p0, LW9/e;->e:Landroidx/lifecycle/E;

    return-object v0
.end method

.method protected final p0()Lcom/ui/core/ui/sso/c;
    .locals 1

    iget-object v0, p0, LW9/e;->f:Lcom/ui/core/ui/sso/c;

    return-object v0
.end method

.method public final q0(Lcom/ui/core/ui/sso/UiSSO$a;)V
    .locals 7

    const-string/jumbo v0, "authResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP9/n;->a:LP9/n;

    invoke-virtual {v0}, LP9/n;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LW9/e;->C0(Lcom/ui/core/ui/sso/UiSSO$a;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v1

    new-instance v4, LW9/e$f;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, LW9/e$f;-><init>(LW9/e;Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :goto_0
    return-void
.end method

.method protected final r0(Lgg/b;Lmh/p;)Lgg/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "errorHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW9/e$g;

    invoke-direct {v0, p2}, LW9/e$g;-><init>(Lmh/p;)V

    invoke-virtual {p1, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "onErrorResumeNext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic v()LLi/N;
    .locals 1

    iget-object v0, p0, LW9/e;->j:LLi/z;

    return-object v0
.end method

.method protected v0()Lgg/b;
    .locals 2

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "complete(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method protected final w0()Z
    .locals 1

    iget-boolean v0, p0, LW9/e;->m:Z

    return v0
.end method
