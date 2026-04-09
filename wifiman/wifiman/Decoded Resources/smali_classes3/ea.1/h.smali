.class public final Lea/h;
.super Lea/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lea/h$a;
    }
.end annotation


# static fields
.field public static final j:Lea/h$a;

.field public static final k:I


# instance fields
.field private final e:Lcom/ui/core/ui/sso/SSOAccountVM;

.field private final f:Lca/d;

.field private final g:LLi/z;

.field private final h:LLi/z;

.field private final i:LLi/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lea/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lea/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lea/h;->j:Lea/h$a;

    const/16 v0, 0x8

    sput v0, Lea/h;->k:I

    return-void
.end method

.method public constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;Lca/d;)V
    .locals 1

    const-string/jumbo v0, "sessionVM"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ssoRecaptchaUseCase"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lea/e;-><init>()V

    iput-object p1, p0, Lea/h;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, Lea/h;->f:Lca/d;

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object p1

    invoke-interface {p1}, LGb/f;->v()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lea/h;->g:LLi/z;

    const/16 p1, 0x1e

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lea/h;->h:LLi/z;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lea/h;->i:LLi/z;

    invoke-direct {p0}, Lea/h;->u0()V

    invoke-direct {p0}, Lea/h;->p0()V

    return-void
.end method

.method public static synthetic l0(Lea/h;)V
    .locals 0

    invoke-static {p0}, Lea/h;->t0(Lea/h;)V

    return-void
.end method

.method public static synthetic m0()V
    .locals 0

    invoke-static {}, Lea/h;->q0()V

    return-void
.end method

.method public static final synthetic n0(Lea/h;Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lea/h;->r0(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o0(Lea/h;)Lcom/ui/core/ui/sso/SSOAccountVM;
    .locals 0

    iget-object p0, p0, Lea/h;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    return-object p0
.end method

.method private final p0()V
    .locals 3

    iget-object v0, p0, Lea/h;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-interface {v0}, LAb/a;->g()Lgg/z;

    move-result-object v0

    sget-object v1, Lea/h$b;->a:Lea/h$b;

    invoke-virtual {v0, v1}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, Lea/h$c;->a:Lea/h$c;

    invoke-virtual {v0, v1}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lea/h$d;

    invoke-direct {v1, p0}, Lea/h$d;-><init>(Lea/h;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Lea/h$e;->a:Lea/h$e;

    invoke-virtual {v0, v1}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lea/h$f;

    invoke-direct {v1, p0}, Lea/h$f;-><init>(Lea/h;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, Lea/g;

    invoke-direct {v1}, Lea/g;-><init>()V

    sget-object v2, Lea/h$g;->a:Lea/h$g;

    invoke-virtual {v0, v1, v2}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object v0

    const-string/jumbo v1, "subscribe(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method private static final q0()V
    .locals 0

    return-void
.end method

.method private final r0(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lea/h;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->c()Lcom/ui/core/ui/sso/c$a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ui/core/ui/sso/c$a;->G(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final s0()V
    .locals 3

    iget-object v0, p0, Lea/h;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, LR9/a;->X()LQ9/j;

    move-result-object v0

    new-instance v1, LQ9/j$a$b;

    sget-object v2, Lcom/ui/core/ui/sso/a$a;->a:Lcom/ui/core/ui/sso/a$a;

    invoke-direct {v1, v2}, LQ9/j$a$b;-><init>(LQ9/j$b;)V

    invoke-interface {v0, v1}, LQ9/j;->b(LQ9/j$a;)V

    return-void
.end method

.method private static final t0(Lea/h;)V
    .locals 2

    invoke-virtual {p0}, Lea/h;->g0()LLi/z;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lea/h;->u0()V

    return-void
.end method

.method private final u0()V
    .locals 6

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v5

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x1

    invoke-static/range {v0 .. v5}, Lgg/s;->g0(JJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object v0

    sget-object v1, Lea/h$k;->a:Lea/h$k;

    invoke-virtual {v0, v1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object v0

    sget-object v1, Lea/h$l;->a:Lea/h$l;

    invoke-virtual {v0, v1}, Lgg/s;->U0(Lkg/p;)Lgg/s;

    move-result-object v0

    invoke-virtual {p0}, Lea/h;->h0()LLi/z;

    move-result-object v1

    new-instance v2, Lea/h$m;

    invoke-direct {v2, v1}, Lea/h$m;-><init>(LLi/z;)V

    sget-object v1, Lea/h$n;->a:Lea/h$n;

    invoke-virtual {v0, v2, v1}, Lgg/s;->J0(Lkg/f;Lkg/f;)Lhg/c;

    move-result-object v0

    const-string/jumbo v1, "subscribe(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method


# virtual methods
.method public e0()V
    .locals 4

    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object v0

    new-instance v1, LQ9/j$a$c;

    invoke-virtual {p0}, Lea/h;->f0()LLi/z;

    move-result-object v2

    invoke-interface {v2}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "editEmail"

    invoke-direct {v1, v3, v2}, LQ9/j$a$c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, LQ9/j;->b(LQ9/j$a;)V

    return-void
.end method

.method public f0()LLi/z;
    .locals 1

    iget-object v0, p0, Lea/h;->g:LLi/z;

    return-object v0
.end method

.method public g0()LLi/z;
    .locals 1

    iget-object v0, p0, Lea/h;->i:LLi/z;

    return-object v0
.end method

.method public h0()LLi/z;
    .locals 1

    iget-object v0, p0, Lea/h;->h:LLi/z;

    return-object v0
.end method

.method public i0()V
    .locals 0

    invoke-direct {p0}, Lea/h;->s0()V

    return-void
.end method

.method public j0()V
    .locals 0

    invoke-direct {p0}, Lea/h;->s0()V

    return-void
.end method

.method public k0()V
    .locals 3

    iget-object v0, p0, Lea/h;->f:Lca/d;

    invoke-virtual {v0}, Lca/d;->c()Lgg/z;

    move-result-object v0

    new-instance v1, Lea/h$h;

    invoke-direct {v1, p0}, Lea/h$h;-><init>(Lea/h;)V

    invoke-virtual {v0, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, Lea/h$i;

    invoke-direct {v1, p0}, Lea/h$i;-><init>(Lea/h;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, Lea/f;

    invoke-direct {v1, p0}, Lea/f;-><init>(Lea/h;)V

    new-instance v2, Lea/h$j;

    invoke-direct {v2, p0}, Lea/h$j;-><init>(Lea/h;)V

    invoke-virtual {v0, v1, v2}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object v0

    const-string/jumbo v1, "subscribe(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method
