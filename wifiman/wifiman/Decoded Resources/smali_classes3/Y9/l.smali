.class public LY9/l;
.super LW9/e;
.source "SourceFile"

# interfaces
.implements LY9/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY9/l$a;,
        LY9/l$b;,
        LY9/l$c;
    }
.end annotation


# static fields
.field public static final u:LY9/l$a;

.field public static final v:I

.field private static final w:Ljava/lang/String;


# instance fields
.field private final r:Lka/a;

.field private final s:LLi/z;

.field private final t:LFg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LY9/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY9/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LY9/l;->u:LY9/l$a;

    const/16 v0, 0x8

    sput v0, LY9/l;->v:I

    const-string/jumbo v0, "saved_state_base_mfa_push"

    sput-object v0, LY9/l;->w:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;)V
    .locals 1

    const-string/jumbo v0, "savedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "session"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "activityController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vibrator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, LW9/e;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;)V

    iput-object p4, p0, LY9/l;->r:Lka/a;

    sget-object p2, LY9/k$a;->AUTH:LY9/k$a;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, LY9/l;->s:LLi/z;

    sget-object p3, LYg/J;->a:LYg/J;

    invoke-static {p3}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p3

    const-string/jumbo p4, "createDefault(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, LY9/l;->t:LFg/a;

    sget-object p3, LY9/l;->w:Ljava/lang/String;

    invoke-virtual {p1, p3}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY9/l$c;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LY9/l;->M0()LLi/z;

    move-result-object p3

    invoke-virtual {p1}, LY9/l$c;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p2, LY9/k$a;->DENIED:LY9/k$a;

    :cond_0
    invoke-interface {p3, p2}, LLi/z;->setValue(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0}, LW9/e;->k0()LLi/z;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, LW9/e;->E0()V

    invoke-direct {p0}, LY9/l;->N0()V

    return-void
.end method

.method public static final synthetic J0(LY9/l;)LFg/a;
    .locals 0

    iget-object p0, p0, LY9/l;->t:LFg/a;

    return-object p0
.end method

.method public static final synthetic K0(LY9/l;)Lcom/ui/core/ui/sso/c;
    .locals 0

    invoke-virtual {p0}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic L0(LY9/l;)Lka/a;
    .locals 0

    iget-object p0, p0, LY9/l;->r:Lka/a;

    return-object p0
.end method

.method private final N0()V
    .locals 2

    iget-object v0, p0, LY9/l;->t:LFg/a;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    new-instance v1, LY9/l$e;

    invoke-direct {v1, p0}, LY9/l$e;-><init>(LY9/l;)V

    invoke-virtual {v0, v1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->S()Lhg/c;

    move-result-object v0

    const-string/jumbo v1, "subscribe(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method static synthetic O0(LY9/l;Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object p1

    invoke-virtual {p0}, LW9/e;->w0()Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, LQ9/j$a$d;

    sget-object v0, LU9/f$g;->a:LU9/f$g;

    invoke-direct {p0, v0}, LQ9/j$a$d;-><init>(LQ9/j$b;)V

    goto :goto_0

    :cond_0
    new-instance p0, LQ9/j$a$d;

    sget-object v0, LU9/f$g;->a:LU9/f$g;

    invoke-direct {p0, v0}, LQ9/j$a$d;-><init>(LQ9/j$b;)V

    :goto_0
    invoke-interface {p1, p0}, LQ9/j;->b(LQ9/j$a;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public A(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LY9/l;->O0(LY9/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected G0()Lgg/b;
    .locals 3

    invoke-virtual {p0}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-interface {v0}, LAb/a;->p()Lgg/b;

    move-result-object v0

    new-instance v1, LY9/l$f;

    invoke-direct {v1, p0}, LY9/l$f;-><init>(LY9/l;)V

    invoke-static {v1}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "fromCallable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "andThen(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic K()LLi/N;
    .locals 1

    invoke-virtual {p0}, LY9/l;->M0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public M0()LLi/z;
    .locals 1

    iget-object v0, p0, LY9/l;->s:LLi/z;

    return-object v0
.end method

.method public a0()V
    .locals 5

    invoke-super {p0}, LW9/e;->a0()V

    invoke-virtual {p0}, LW9/e;->o0()Landroidx/lifecycle/E;

    move-result-object v0

    sget-object v1, LY9/l;->w:Ljava/lang/String;

    new-instance v2, LY9/l$c;

    invoke-virtual {p0}, LY9/l;->M0()LLi/z;

    move-result-object v3

    invoke-interface {v3}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LY9/k$a;->DENIED:LY9/k$a;

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-direct {v2, v3}, LY9/l$c;-><init>(Z)V

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method protected n0(J)Ls9/d;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    new-instance v0, Ls9/d$a;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LY9/l$d;

    invoke-direct {v2, p1, p2}, LY9/l$d;-><init>(J)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ls9/d$b;

    sget p1, LP9/b;->S:I

    invoke-direct {v0, p1}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object v0
.end method
