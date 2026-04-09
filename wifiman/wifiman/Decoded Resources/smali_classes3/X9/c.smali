.class public abstract LX9/c;
.super LW9/e;
.source "SourceFile"

# interfaces
.implements LX9/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX9/c$a;,
        LX9/c$b;
    }
.end annotation


# static fields
.field public static final H:LX9/c$a;

.field public static final I:I


# instance fields
.field private final A:LLi/y;

.field private final B:LLi/g;

.field private C:J

.field private final D:I

.field private final E:Ls9/d;

.field private F:Z

.field private G:Ljava/lang/String;

.field private final r:Lka/a;

.field private final s:Lha/a;

.field private final t:LLi/z;

.field private final u:LLi/z;

.field private final v:LLi/z;

.field private final w:LLi/z;

.field private final x:LLi/z;

.field private final y:LLi/z;

.field private final z:LLi/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX9/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX9/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LX9/c;->H:LX9/c$a;

    const/16 v0, 0x8

    sput v0, LX9/c;->I:I

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V
    .locals 3

    const-string/jumbo v0, "savedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "session"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "activityController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vibrator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clipboard"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, LW9/e;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;)V

    iput-object p4, p0, LX9/c;->r:Lka/a;

    iput-object p5, p0, LX9/c;->s:Lha/a;

    const/4 p2, 0x0

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, LX9/c;->t:LLi/z;

    new-instance p3, Ls9/d$c;

    const-string p4, ""

    invoke-direct {p3, p4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {p3}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, LX9/c;->u:LLi/z;

    new-instance p3, Ls9/d$c;

    invoke-direct {p3, p4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {p3}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, LX9/c;->v:LLi/z;

    new-instance p3, Ls9/d$b;

    sget p5, LP9/b;->y:I

    invoke-direct {p3, p5}, Ls9/d$b;-><init>(I)V

    invoke-static {p3}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, LX9/c;->w:LLi/z;

    invoke-static {p4}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, LX9/c;->x:LLi/z;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p4

    iput-object p4, p0, LX9/c;->y:LLi/z;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p4

    iput-object p4, p0, LX9/c;->z:LLi/z;

    const/4 p4, 0x1

    const/4 p5, 0x0

    const/4 v0, 0x6

    invoke-static {p4, p5, p2, v0, p2}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p2

    iput-object p2, p0, LX9/c;->A:LLi/y;

    invoke-static {p2}, LLi/i;->a(LLi/y;)LLi/D;

    move-result-object p2

    iput-object p2, p0, LX9/c;->B:LLi/g;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    const/16 p2, 0x2710

    int-to-long v1, p2

    add-long/2addr p4, v1

    iput-wide p4, p0, LX9/c;->C:J

    iput v0, p0, LX9/c;->D:I

    new-instance p2, Ls9/d$b;

    sget p4, LP9/b;->v:I

    invoke-direct {p2, p4}, Ls9/d$b;-><init>(I)V

    iput-object p2, p0, LX9/c;->E:Ls9/d;

    const-string/jumbo p2, "saved_state_base_mfa_code"

    invoke-virtual {p1, p2}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX9/c$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LX9/c$b;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1}, LX9/c$b;->a()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, LX9/c;->G:Ljava/lang/String;

    invoke-virtual {p1}, LX9/c$b;->c()Z

    move-result p1

    iput-boolean p1, p0, LX9/c;->F:Z

    :cond_0
    invoke-direct {p0}, LX9/c;->h1()V

    invoke-virtual {p0}, LW9/e;->E0()V

    return-void
.end method

.method public static synthetic J0(LX9/c;)V
    .locals 0

    invoke-static {p0}, LX9/c;->j1(LX9/c;)V

    return-void
.end method

.method public static synthetic K0(LX9/c;Ljava/lang/Throwable;Ls9/d;)Lgg/b;
    .locals 0

    invoke-static {p0, p1, p2}, LX9/c;->k1(LX9/c;Ljava/lang/Throwable;Ls9/d;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic L0(LX9/c;)V
    .locals 0

    invoke-direct {p0}, LX9/c;->U0()V

    return-void
.end method

.method public static final synthetic M0(LX9/c;)Lha/a;
    .locals 0

    iget-object p0, p0, LX9/c;->s:Lha/a;

    return-object p0
.end method

.method public static final synthetic N0(LX9/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LX9/c;->G:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic O0(LX9/c;)Lcom/ui/core/ui/sso/c;
    .locals 0

    invoke-virtual {p0}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic P0(LX9/c;)Lka/a;
    .locals 0

    iget-object p0, p0, LX9/c;->r:Lka/a;

    return-object p0
.end method

.method public static final synthetic Q0(LX9/c;)LLi/y;
    .locals 0

    iget-object p0, p0, LX9/c;->A:LLi/y;

    return-object p0
.end method

.method public static final synthetic R0(LX9/c;LW9/e$a;)V
    .locals 0

    invoke-virtual {p0, p1}, LW9/e;->H0(LW9/e$a;)V

    return-void
.end method

.method public static final synthetic S0(LX9/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LX9/c;->G:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic T0(LX9/c;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, LX9/c;->l1(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final U0()V
    .locals 2

    iget-object v0, p0, LX9/c;->x:LLi/z;

    const-string v1, ""

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, LX9/c;->y:LLi/z;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, LX9/c;->A:LLi/y;

    sget-object v1, LX9/p$a$a;->a:LX9/p$a$a;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method private final V0()Lgg/b;
    .locals 4

    const-wide/16 v0, 0x7d0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lgg/b;->a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object v0

    new-instance v1, LX9/c$c;

    invoke-direct {v1, p0}, LX9/c$c;-><init>(LX9/c;)V

    invoke-static {v1}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "fromCallable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "concatArray(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final c1()V
    .locals 7

    iget-boolean v0, p0, LX9/c;->F:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v1

    new-instance v4, LX9/c$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, LX9/c$d;-><init>(LX9/c;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    return-void
.end method

.method static synthetic d1(LX9/c;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, LW9/e;->j0()LU9/h;

    move-result-object p0

    sget-object p1, LU9/j;->a:LU9/j;

    invoke-virtual {p0, p1}, LU9/h;->e0(LU9/h$a;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method static synthetic e1(LX9/c;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, LX9/c;->i1()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method static synthetic f1(LX9/c;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object p0

    sget-object p1, LQ9/j$a$a;->a:LQ9/j$a$a;

    invoke-interface {p0, p1}, LQ9/j;->b(LQ9/j$a;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method static synthetic g1(LX9/c;Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object p0

    new-instance p1, LQ9/j$a$e;

    const-string/jumbo v0, "https://play.google.com/store/apps/details?id=com.ui.uid.authenticator"

    invoke-direct {p1, v0}, LQ9/j$a$e;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, LQ9/j;->b(LQ9/j$a;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final h1()V
    .locals 9

    sget-object v0, LP9/n;->a:LP9/n;

    invoke-virtual {v0}, LP9/n;->h()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LW9/e;->w0()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->d()Lcom/ui/core/ui/sso/UiSSO$d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/UiSSO$d;->a()LU9/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LU9/b;->b()LEb/w;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v0, v0, LEb/w$d;

    if-nez v0, :cond_4

    invoke-virtual {p0}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->d()Lcom/ui/core/ui/sso/UiSSO$d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/UiSSO$d;->a()LU9/b;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LU9/b;->a()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LEb/w;

    instance-of v3, v3, LEb/w$d;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    check-cast v2, LEb/w;

    goto :goto_2

    :cond_3
    move-object v2, v1

    :goto_2
    if-nez v2, :cond_4

    iget-object v0, p0, LX9/c;->z:LLi/z;

    new-instance v7, LZ9/a;

    new-instance v8, Ls9/b$a;

    sget v2, LP9/a;->f:I

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v6}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Ls9/d$b;

    sget v1, LP9/b;->Y0:I

    invoke-direct {v5, v1}, Ls9/d$b;-><init>(I)V

    new-instance v6, Ls9/d$b;

    sget v1, LP9/b;->s:I

    invoke-direct {v6, v1}, Ls9/d$b;-><init>(I)V

    const-string v2, ""

    const/4 v4, 0x0

    move-object v1, v7

    move-object v3, v8

    invoke-direct/range {v1 .. v6}, LZ9/a;-><init>(Ljava/lang/String;Ls9/b;ZLs9/d;Ls9/d;)V

    invoke-interface {v0, v7}, LLi/z;->setValue(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget-object v0, p0, LX9/c;->z:LLi/z;

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    :goto_3
    return-void
.end method

.method private final i1()V
    .locals 2

    iget-object v0, p0, LX9/c;->A:LLi/y;

    sget-object v1, LX9/p$a$b;->a:LX9/p$a$b;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    iget-object v1, p0, LX9/c;->x:LLi/z;

    invoke-interface {v1}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, LAb/a;->i(Ljava/lang/String;)Lgg/z;

    move-result-object v0

    new-instance v1, LX9/c$e;

    invoke-direct {v1, p0}, LX9/c$e;-><init>(LX9/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, LX9/c$f;

    invoke-direct {v1, p0}, LX9/c$f;-><init>(LX9/c;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, LX9/a;

    invoke-direct {v1, p0}, LX9/a;-><init>(LX9/c;)V

    invoke-virtual {v0, v1}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "doFinally(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LX9/b;

    invoke-direct {v1, p0}, LX9/b;-><init>(LX9/c;)V

    invoke-virtual {p0, v0, v1}, LW9/e;->r0(Lgg/b;Lmh/p;)Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->S()Lhg/c;

    move-result-object v0

    const-string/jumbo v1, "subscribe(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method private static final j1(LX9/c;)V
    .locals 1

    sget-object v0, LW9/e$a;->IDLE:LW9/e$a;

    invoke-virtual {p0, v0}, LW9/e;->H0(LW9/e$a;)V

    return-void
.end method

.method private static final k1(LX9/c;Ljava/lang/Throwable;Ls9/d;)Lgg/b;
    .locals 2

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "errorString"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    const-string/jumbo v1, "fromCallable(...)"

    if-eqz v0, :cond_0

    new-instance p1, LX9/c$h;

    invoke-direct {p1, p0}, LX9/c$h;-><init>(LX9/c;)V

    invoke-static {p1}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LX9/c;->V0()Lgg/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "andThen(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, LX9/c$i;

    invoke-direct {v0, p1, p0, p2}, LX9/c$i;-><init>(Ljava/lang/Throwable;LX9/c;Ls9/d;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method

.method private final l1(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0}, LX9/c;->X0()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public H(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LX9/c;->f1(LX9/c;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected I0()V
    .locals 0

    invoke-super {p0}, LW9/e;->I0()V

    invoke-direct {p0}, LX9/c;->h1()V

    return-void
.end method

.method public bridge synthetic L()LLi/N;
    .locals 1

    iget-object v0, p0, LX9/c;->v:LLi/z;

    return-object v0
.end method

.method public bridge synthetic N()LLi/N;
    .locals 1

    iget-object v0, p0, LX9/c;->w:LLi/z;

    return-object v0
.end method

.method public O(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX9/c;->x:LLi/z;

    invoke-interface {v0}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LX9/c;->x:LLi/z;

    invoke-interface {v0, p1}, LLi/z;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, LX9/c;->y:LLi/z;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, LW9/e;->E0()V

    invoke-direct {p0, p1}, LX9/c;->l1(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, LX9/c;->i1()V

    :cond_1
    return-void
.end method

.method public bridge synthetic P()LLi/N;
    .locals 1

    iget-object v0, p0, LX9/c;->u:LLi/z;

    return-object v0
.end method

.method public Q(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LX9/c;->g1(LX9/c;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public R(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LX9/c;->d1(LX9/c;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final W0()LLi/z;
    .locals 1

    iget-object v0, p0, LX9/c;->y:LLi/z;

    return-object v0
.end method

.method protected X0()I
    .locals 1

    iget v0, p0, LX9/c;->D:I

    return v0
.end method

.method public final Y0()LLi/z;
    .locals 1

    iget-object v0, p0, LX9/c;->u:LLi/z;

    return-object v0
.end method

.method protected Z0()Ls9/d;
    .locals 1

    iget-object v0, p0, LX9/c;->E:Ls9/d;

    return-object v0
.end method

.method public a0()V
    .locals 5

    invoke-super {p0}, LW9/e;->a0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LX9/c;->F:Z

    invoke-virtual {p0}, LW9/e;->o0()Landroidx/lifecycle/E;

    move-result-object v0

    new-instance v1, LX9/c$b;

    iget-object v2, p0, LX9/c;->x:LLi/z;

    invoke-interface {v2}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, LX9/c;->G:Ljava/lang/String;

    iget-boolean v4, p0, LX9/c;->F:Z

    invoke-direct {v1, v2, v3, v4}, LX9/c$b;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string/jumbo v2, "saved_state_base_mfa_code"

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a1()LLi/z;
    .locals 1

    iget-object v0, p0, LX9/c;->v:LLi/z;

    return-object v0
.end method

.method public b()LLi/g;
    .locals 1

    iget-object v0, p0, LX9/c;->B:LLi/g;

    return-object v0
.end method

.method public final b1()LLi/z;
    .locals 1

    iget-object v0, p0, LX9/c;->t:LLi/z;

    return-object v0
.end method

.method public bridge synthetic c()LLi/N;
    .locals 1

    iget-object v0, p0, LX9/c;->t:LLi/z;

    return-object v0
.end method

.method public e(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LX9/c;->e1(LX9/c;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroidx/lifecycle/o;)V
    .locals 1

    const-string/jumbo v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->g(Landroidx/lifecycle/o;)V

    invoke-direct {p0}, LX9/c;->c1()V

    return-void
.end method

.method public bridge synthetic m()LLi/N;
    .locals 1

    iget-object v0, p0, LX9/c;->y:LLi/z;

    return-object v0
.end method

.method public bridge synthetic n()LLi/N;
    .locals 1

    iget-object v0, p0, LX9/c;->z:LLi/z;

    return-object v0
.end method

.method public bridge synthetic r()LLi/N;
    .locals 1

    iget-object v0, p0, LX9/c;->x:LLi/z;

    return-object v0
.end method
