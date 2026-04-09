.class public final Lfa/q;
.super Lfa/j;
.source "SourceFile"


# instance fields
.field private final e:Lcom/ui/core/ui/sso/SSOAccountVM;

.field private final f:LLi/z;

.field private final g:LFg/a;

.field private final h:Lhg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V
    .locals 10

    const-string/jumbo v0, "sessionVM"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lfa/j;-><init>()V

    iput-object p1, p0, Lfa/q;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    new-instance v0, Lfa/f;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lfa/f;-><init>(ZZLfa/e;)V

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lfa/q;->f:LLi/z;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v1

    const-string/jumbo v2, "createDefault(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lfa/q;->g:LFg/a;

    new-instance v2, Lhg/b;

    invoke-direct {v2}, Lhg/b;-><init>()V

    iput-object v2, p0, Lfa/q;->h:Lhg/b;

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object p1

    invoke-interface {p1}, LAb/a;->a()Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    sget-object v3, Lfa/q$a;->a:Lfa/q$a;

    invoke-static {p1, v1, v3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v4

    const-string/jumbo p1, "combineLatest(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lfa/q$b;

    new-instance p1, Lfa/q$c;

    invoke-direct {p1, v0}, Lfa/q$c;-><init>(Ljava/lang/Object;)V

    invoke-direct {v7, p1}, Lfa/q$b;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lfa/l;

    invoke-direct {v5, p0}, Lfa/l;-><init>(Lfa/q;)V

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LAg/f;->h(Lgg/i;Lmh/l;Lmh/a;Lmh/l;ILjava/lang/Object;)Lhg/c;

    move-result-object p1

    invoke-static {p1, v2}, LAg/a;->a(Lhg/c;Lhg/b;)Lhg/c;

    return-void
.end method

.method public static synthetic h0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lfa/q;->r0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i0(Lfa/q;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lfa/q;->m0(Lfa/q;Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0(Lfa/q;)V
    .locals 0

    invoke-static {p0}, Lfa/q;->s0(Lfa/q;)V

    return-void
.end method

.method public static synthetic k0(Lfa/q;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lfa/q;->t0(Lfa/q;Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lfa/q;->u0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final m0(Lfa/q;Ljava/lang/Throwable;)LYg/J;
    .locals 1

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfa/p;

    invoke-direct {v0}, Lfa/p;-><init>()V

    invoke-static {v0, p1}, LS9/a;->e(Lmh/a;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lfa/q;->q0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic n0(Lfa/q;)V
    .locals 0

    invoke-direct {p0}, Lfa/q;->q0()V

    return-void
.end method

.method public static final synthetic o0(Lfa/q;)Lcom/ui/core/ui/sso/SSOAccountVM;
    .locals 0

    iget-object p0, p0, Lfa/q;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    return-object p0
.end method

.method public static final synthetic p0(Lfa/q;)LFg/a;
    .locals 0

    iget-object p0, p0, Lfa/q;->g:LFg/a;

    return-object p0
.end method

.method private final q0()V
    .locals 7

    iget-object v0, p0, Lfa/q;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->f()Lcom/ui/core/ui/sso/UiSSO$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v1

    new-instance v4, Lfa/q$d;

    const/4 v2, 0x0

    invoke-direct {v4, p0, v0, v2}, Lfa/q$d;-><init>(Lfa/q;Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    return-void
.end method

.method private static final r0()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to load device info, closing trusted device flow"

    return-object v0
.end method

.method private static final s0(Lfa/q;)V
    .locals 1

    iget-object p0, p0, Lfa/q;->g:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t0(Lfa/q;Ljava/lang/Throwable;)LYg/J;
    .locals 1

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfa/o;

    invoke-direct {v0}, Lfa/o;-><init>()V

    invoke-static {v0, p1}, LS9/a;->e(Lmh/a;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lfa/q;->q0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final u0()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to trust device, closing trusted device flow"

    return-object v0
.end method


# virtual methods
.method protected W()V
    .locals 1

    iget-object v0, p0, Lfa/q;->h:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    return-void
.end method

.method public e0()V
    .locals 0

    invoke-direct {p0}, Lfa/q;->q0()V

    return-void
.end method

.method public f0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfa/q;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-interface {v0, p1}, LAb/a;->k(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    new-instance v0, Lfa/q$e;

    invoke-direct {v0, p0}, Lfa/q$e;-><init>(Lfa/q;)V

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, Lfa/m;

    invoke-direct {v0, p0}, Lfa/m;-><init>(Lfa/q;)V

    invoke-virtual {p1, v0}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "doFinally(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfa/q$f;

    invoke-direct {v0, p0}, Lfa/q$f;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lfa/n;

    invoke-direct {v1, p0}, Lfa/n;-><init>(Lfa/q;)V

    invoke-static {p1, v1, v0}, LAg/f;->d(Lgg/b;Lmh/l;Lmh/a;)Lhg/c;

    move-result-object p1

    iget-object v0, p0, Lfa/q;->h:Lhg/b;

    invoke-static {p1, v0}, LAg/a;->a(Lhg/c;Lhg/b;)Lhg/c;

    return-void
.end method

.method public g0()LLi/N;
    .locals 1

    iget-object v0, p0, Lfa/q;->f:LLi/z;

    return-object v0
.end method
