.class public final Lda/I;
.super Lda/u;
.source "SourceFile"


# instance fields
.field private final e:Lcom/ui/core/ui/sso/SSOAccountVM;

.field private final f:Lca/d;

.field private final g:LH/l;

.field private final h:LLi/z;

.field private final i:LH/l;

.field private final j:LLi/z;

.field private final k:LLi/z;

.field private final l:LLi/z;

.field private final m:LH/l;

.field private final n:LLi/z;

.field private final o:LLi/z;

.field private final p:LLi/z;

.field private final q:LLi/y;

.field private final r:LLi/z;

.field private final s:LLi/z;

.field private final t:LLi/y;

.field private final u:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;Lca/d;)V
    .locals 7

    const-string/jumbo v0, "sessionVM"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ssoRecaptchaUseCase"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lda/u;-><init>()V

    iput-object p1, p0, Lda/I;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, Lda/I;->f:Lca/d;

    new-instance p1, LH/l;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, LH/l;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lda/I;->g:LH/l;

    const/4 p1, 0x0

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p2

    iput-object p2, p0, Lda/I;->h:LLi/z;

    new-instance p2, LH/l;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, LH/l;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lda/I;->i:LH/l;

    sget-object p2, Lda/u$a$a;->a:Lda/u$a$a;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p2

    iput-object p2, p0, Lda/I;->j:LLi/z;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lda/I;->k:LLi/z;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lda/I;->l:LLi/z;

    new-instance v0, LH/l;

    const/4 v5, 0x3

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LH/l;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lda/I;->m:LH/l;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lda/I;->n:LLi/z;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lda/I;->o:LLi/z;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lda/I;->p:LLi/z;

    sget-object v0, LKi/a;->DROP_LATEST:LKi/a;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1, p1}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object v0

    iput-object v0, p0, Lda/I;->q:LLi/y;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lda/I;->r:LLi/z;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p2

    iput-object p2, p0, Lda/I;->s:LLi/z;

    const/4 p2, 0x5

    invoke-static {v3, v2, p1, p2, p1}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p1

    iput-object p1, p0, Lda/I;->t:LLi/y;

    const-string/jumbo p1, "^\\w[-_.+A-Za-z\\d]{0,127}$"

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    iput-object p1, p0, Lda/I;->u:Ljava/util/regex/Pattern;

    invoke-direct {p0}, Lda/I;->k1()V

    invoke-direct {p0}, Lda/I;->n1()V

    invoke-direct {p0}, Lda/I;->q1()V

    invoke-direct {p0}, Lda/I;->j1()V

    return-void
.end method

.method public static synthetic A0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lda/I;->s1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic B0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lda/I;->m1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic C0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lda/I;->W0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic D0(Lda/I;)V
    .locals 0

    invoke-static {p0}, Lda/I;->U0(Lda/I;)V

    return-void
.end method

.method public static synthetic E0(Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0}, Lda/I;->o1(Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F0(Lda/I;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lda/I;->h1(Lda/I;Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G0(Lda/I;)V
    .locals 0

    invoke-static {p0}, Lda/I;->g1(Lda/I;)V

    return-void
.end method

.method public static synthetic H0(Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0}, Lda/I;->V0(Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0(Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0}, Lda/I;->l1(Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J0(Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0}, Lda/I;->r1(Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lda/I;->p1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic L0(Lda/I;Ljava/lang/String;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lda/I;->R0(Ljava/lang/String;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic M0(Lda/I;)Lgg/b;
    .locals 0

    invoke-direct {p0}, Lda/I;->S0()Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N0(Lda/I;Ljava/lang/String;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lda/I;->X0(Ljava/lang/String;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O0(Lda/I;LEb/m;)Lda/u$a;
    .locals 0

    invoke-direct {p0, p1}, Lda/I;->b1(LEb/m;)Lda/u$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic P0(Lda/I;)Lcom/ui/core/ui/sso/SSOAccountVM;
    .locals 0

    iget-object p0, p0, Lda/I;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    return-object p0
.end method

.method public static final synthetic Q0(Lda/I;)Ljava/util/regex/Pattern;
    .locals 0

    iget-object p0, p0, Lda/I;->u:Ljava/util/regex/Pattern;

    return-object p0
.end method

.method private final R0(Ljava/lang/String;)Lgg/b;
    .locals 5

    iget-object v0, p0, Lda/I;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-virtual {p0}, Lda/I;->i0()LH/l;

    move-result-object v1

    invoke-virtual {v1}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    invoke-virtual {p0}, Lda/I;->p0()LH/l;

    move-result-object v2

    invoke-virtual {v2}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    move-object v3, v2

    :cond_1
    filled-new-array {v1, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZg/v;->q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, LEb/l;

    invoke-direct {v2, p1, v1}, LEb/l;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v2}, LAb/a;->c(LEb/l;)Lgg/z;

    move-result-object p1

    new-instance v0, Lda/I$a;

    invoke-direct {v0, p0}, Lda/I$a;-><init>(Lda/I;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->y()Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->M()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "onErrorComplete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final S0()Lgg/b;
    .locals 2

    iget-object v0, p0, Lda/I;->f:Lca/d;

    invoke-virtual {v0}, Lca/d;->c()Lgg/z;

    move-result-object v0

    new-instance v1, Lda/I$b;

    invoke-direct {v1, p0}, Lda/I$b;-><init>(Lda/I;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final T0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lda/I;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LAb/a;->q(Ljava/lang/String;Ljava/lang/String;)Lgg/z;

    move-result-object p1

    new-instance p2, Lda/I$c;

    invoke-direct {p2, p0}, Lda/I$c;-><init>(Lda/I;)V

    invoke-virtual {p1, p2}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance p2, Lda/I$d;

    invoke-direct {p2, p0}, Lda/I$d;-><init>(Lda/I;)V

    invoke-virtual {p1, p2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    new-instance p2, Lda/A;

    invoke-direct {p2, p0}, Lda/A;-><init>(Lda/I;)V

    invoke-virtual {p1, p2}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "doFinally(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lda/B;

    invoke-direct {p2}, Lda/B;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p2, v0, v1, v0}, LAg/f;->g(Lgg/b;Lmh/l;Lmh/a;ILjava/lang/Object;)Lhg/c;

    move-result-object p1

    invoke-virtual {p0, p1}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method private static final U0(Lda/I;)V
    .locals 1

    invoke-virtual {p0}, Lda/I;->g0()LLi/z;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final V0(Ljava/lang/Throwable;)LYg/J;
    .locals 1

    const-string/jumbo v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lda/D;

    invoke-direct {v0}, Lda/D;-><init>()V

    invoke-static {v0, p0}, LS9/a;->e(Lmh/a;Ljava/lang/Throwable;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final W0()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to process re-create account stream"

    return-object v0
.end method

.method private final X0(Ljava/lang/String;)Lgg/b;
    .locals 1

    iget-object v0, p0, Lda/I;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-interface {v0, p1}, LAb/a;->m(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    new-instance v0, Lda/I$e;

    invoke-direct {v0, p0}, Lda/I$e;-><init>(Lda/I;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->y()Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->M()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "onErrorComplete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final Z0()Z
    .locals 2

    iget-object v0, p0, Lda/I;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v0

    invoke-interface {v0}, LGb/f;->v()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, LGb/f;->j()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, LGb/f;->G()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, LGb/f;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final b1(LEb/m;)Lda/u$a;
    .locals 3

    invoke-virtual {p1}, LEb/m;->b()I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lda/u$a$c;->a:Lda/u$a$c;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LEb/m;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    move-object v2, p1

    :cond_2
    if-eqz v2, :cond_3

    new-instance p1, Lda/u$a$d;

    invoke-direct {p1, v2}, Lda/u$a$d;-><init>(Ljava/lang/String;)V

    move-object v2, p1

    goto :goto_0

    :cond_3
    sget-object v2, Lda/u$a$b;->a:Lda/u$a$b;

    goto :goto_0

    :cond_4
    new-instance v2, Lda/u$a$d;

    invoke-virtual {p1}, LEb/m;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lda/u$a$d;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    new-instance v2, Lda/u$a$g;

    invoke-virtual {p1}, LEb/m;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lda/u$a$g;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    new-instance v2, Lda/u$a$e;

    invoke-virtual {p1}, LEb/m;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lda/u$a$e;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method

.method private final d1()V
    .locals 3

    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object v0

    new-instance v1, LQ9/j$a$d;

    sget-object v2, Lda/t$b;->a:Lda/t$b;

    invoke-direct {v1, v2}, LQ9/j$a$d;-><init>(LQ9/j$b;)V

    invoke-interface {v0, v1}, LQ9/j;->b(LQ9/j$a;)V

    return-void
.end method

.method private final e1()Z
    .locals 3

    iget-object v0, p0, Lda/I;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v0

    invoke-interface {v0}, LGb/f;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lda/I;->i0()LH/l;

    move-result-object v2

    invoke-virtual {v2}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, LGb/f;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lda/I;->k0()LH/l;

    move-result-object v2

    invoke-virtual {v2}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, LGb/f;->G()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lda/I;->p0()LH/l;

    move-result-object v1

    invoke-virtual {v1}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final f1()V
    .locals 4

    invoke-direct {p0}, Lda/I;->S0()Lgg/b;

    move-result-object v0

    new-instance v1, Lda/I$f;

    invoke-direct {v1, p0}, Lda/I$f;-><init>(Lda/I;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, Lda/w;

    invoke-direct {v1, p0}, Lda/w;-><init>(Lda/I;)V

    invoke-virtual {v0, v1}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "doFinally(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lda/z;

    invoke-direct {v1, p0}, Lda/z;-><init>(Lda/I;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, LAg/f;->g(Lgg/b;Lmh/l;Lmh/a;ILjava/lang/Object;)Lhg/c;

    move-result-object v0

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method private static final g1(Lda/I;)V
    .locals 1

    invoke-virtual {p0}, Lda/I;->g0()LLi/z;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final h1(Lda/I;Ljava/lang/Throwable;)LYg/J;
    .locals 2

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lda/C;

    invoke-direct {v0}, Lda/C;-><init>()V

    invoke-static {v0, p1}, LS9/a;->e(Lmh/a;Ljava/lang/Throwable;)V

    instance-of v0, p1, Lcom/ui/unifi/core/sso/exceptions/CreateAccountException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/unifi/core/sso/exceptions/CreateAccountException;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/ui/unifi/core/sso/exceptions/CreateAccountException;->a()LEb/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LEb/b;->b()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lda/I;->j0()LLi/z;

    move-result-object p0

    new-instance p1, Ls9/d$c;

    invoke-direct {p1, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-interface {p0, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    :cond_2
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i1()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to process create account stream"

    return-object v0
.end method

.method private final j1()V
    .locals 7

    invoke-virtual {p0}, Lda/I;->j0()LLi/z;

    move-result-object v0

    invoke-virtual {p0}, Lda/I;->a1()LLi/z;

    move-result-object v1

    invoke-virtual {p0}, Lda/I;->q0()LLi/z;

    move-result-object v2

    invoke-virtual {p0}, Lda/I;->o0()LLi/z;

    move-result-object v3

    invoke-virtual {p0}, Lda/I;->g0()LLi/z;

    move-result-object v4

    const/4 v5, 0x5

    new-array v5, v5, [LLi/g;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v1, 0x2

    aput-object v2, v5, v1

    const/4 v1, 0x3

    aput-object v3, v5, v1

    const/4 v1, 0x4

    aput-object v4, v5, v1

    new-instance v1, Lda/I$g;

    invoke-direct {v1, v5}, Lda/I$g;-><init>([LLi/g;)V

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, LQi/i;->e(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/s;

    move-result-object v0

    invoke-virtual {p0}, Lda/I;->h0()LLi/z;

    move-result-object v1

    new-instance v2, Lda/I$h;

    invoke-direct {v2, v1}, Lda/I$h;-><init>(LLi/z;)V

    sget-object v1, Lda/I$i;->a:Lda/I$i;

    invoke-virtual {v0, v2, v1}, Lgg/s;->J0(Lkg/f;Lkg/f;)Lhg/c;

    move-result-object v0

    const-string/jumbo v1, "subscribe(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method private final k1()V
    .locals 4

    invoke-virtual {p0}, Lda/I;->i0()LH/l;

    move-result-object v0

    invoke-static {v0}, Lja/b;->b(LH/l;)LLi/g;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LQi/i;->e(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/s;

    move-result-object v0

    new-instance v1, Lda/I$j;

    invoke-direct {v1, p0}, Lda/I$j;-><init>(Lda/I;)V

    invoke-virtual {v0, v1}, Lgg/s;->Q0(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "switchMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lda/F;

    invoke-direct {v1}, Lda/F;-><init>()V

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, LAg/f;->g(Lgg/b;Lmh/l;Lmh/a;ILjava/lang/Object;)Lhg/c;

    move-result-object v0

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method private static final l1(Ljava/lang/Throwable;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lda/x;

    invoke-direct {v0}, Lda/x;-><init>()V

    invoke-static {v0, p0}, LS9/a;->e(Lmh/a;Ljava/lang/Throwable;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final m1()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to process email validation stream"

    return-object v0
.end method

.method private final n1()V
    .locals 4

    invoke-virtual {p0}, Lda/I;->k0()LH/l;

    move-result-object v0

    invoke-static {v0}, Lja/b;->b(LH/l;)LLi/g;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LQi/i;->e(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/s;

    move-result-object v0

    new-instance v1, Lda/I$k;

    invoke-direct {v1, p0}, Lda/I$k;-><init>(Lda/I;)V

    invoke-virtual {v0, v1}, Lgg/s;->Q0(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "switchMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lda/G;

    invoke-direct {v1}, Lda/G;-><init>()V

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, LAg/f;->g(Lgg/b;Lmh/l;Lmh/a;ILjava/lang/Object;)Lhg/c;

    move-result-object v0

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method private static final o1(Ljava/lang/Throwable;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lda/H;

    invoke-direct {v0}, Lda/H;-><init>()V

    invoke-static {v0, p0}, LS9/a;->e(Lmh/a;Ljava/lang/Throwable;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final p1()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to process password validation stream"

    return-object v0
.end method

.method private final q1()V
    .locals 5

    invoke-virtual {p0}, Lda/I;->p0()LH/l;

    move-result-object v0

    invoke-static {v0}, Lja/b;->b(LH/l;)LLi/g;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LQi/i;->e(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/s;

    move-result-object v0

    sget-object v1, Lda/I$l;->a:Lda/I$l;

    invoke-virtual {v0, v1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->v()Lgg/s;

    move-result-object v0

    const-wide/16 v3, 0x1f4

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v1}, Lgg/s;->p(JLjava/util/concurrent/TimeUnit;)Lgg/s;

    move-result-object v0

    new-instance v1, Lda/I$m;

    invoke-direct {v1, p0}, Lda/I$m;-><init>(Lda/I;)V

    invoke-virtual {v0, v1}, Lgg/s;->Q0(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "switchMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lda/E;

    invoke-direct {v1}, Lda/E;-><init>()V

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, LAg/f;->g(Lgg/b;Lmh/l;Lmh/a;ILjava/lang/Object;)Lhg/c;

    move-result-object v0

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method private static final r1(Ljava/lang/Throwable;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lda/y;

    invoke-direct {v0}, Lda/y;-><init>()V

    invoke-static {v0, p0}, LS9/a;->e(Lmh/a;Ljava/lang/Throwable;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final s1()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to process username validation stream"

    return-object v0
.end method

.method public static synthetic z0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lda/I;->i1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public Y0()LLi/y;
    .locals 1

    iget-object v0, p0, Lda/I;->t:LLi/y;

    return-object v0
.end method

.method public a1()LLi/z;
    .locals 1

    iget-object v0, p0, Lda/I;->k:LLi/z;

    return-object v0
.end method

.method public c1()LLi/y;
    .locals 1

    iget-object v0, p0, Lda/I;->q:LLi/y;

    return-object v0
.end method

.method public bridge synthetic e0()LLi/g;
    .locals 1

    invoke-virtual {p0}, Lda/I;->Y0()LLi/y;

    move-result-object v0

    return-object v0
.end method

.method public f0()LLi/z;
    .locals 1

    iget-object v0, p0, Lda/I;->o:LLi/z;

    return-object v0
.end method

.method public g0()LLi/z;
    .locals 1

    iget-object v0, p0, Lda/I;->r:LLi/z;

    return-object v0
.end method

.method public h0()LLi/z;
    .locals 1

    iget-object v0, p0, Lda/I;->s:LLi/z;

    return-object v0
.end method

.method public i0()LH/l;
    .locals 1

    iget-object v0, p0, Lda/I;->g:LH/l;

    return-object v0
.end method

.method public j0()LLi/z;
    .locals 1

    iget-object v0, p0, Lda/I;->h:LLi/z;

    return-object v0
.end method

.method public k0()LH/l;
    .locals 1

    iget-object v0, p0, Lda/I;->i:LH/l;

    return-object v0
.end method

.method public l0()LLi/z;
    .locals 1

    iget-object v0, p0, Lda/I;->j:LLi/z;

    return-object v0
.end method

.method public m0()LLi/z;
    .locals 1

    iget-object v0, p0, Lda/I;->l:LLi/z;

    return-object v0
.end method

.method public bridge synthetic n0()LLi/g;
    .locals 1

    invoke-virtual {p0}, Lda/I;->c1()LLi/y;

    move-result-object v0

    return-object v0
.end method

.method public o0()LLi/z;
    .locals 1

    iget-object v0, p0, Lda/I;->p:LLi/z;

    return-object v0
.end method

.method public p0()LH/l;
    .locals 1

    iget-object v0, p0, Lda/I;->m:LH/l;

    return-object v0
.end method

.method public q0()LLi/z;
    .locals 1

    iget-object v0, p0, Lda/I;->n:LLi/z;

    return-object v0
.end method

.method public r0(Z)V
    .locals 1

    invoke-virtual {p0}, Lda/I;->f0()LLi/z;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method public s0(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lda/I;->Z0()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lda/I;->f1()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lda/I;->e1()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lda/I;->d1()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lda/I;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object p1

    invoke-interface {p1}, LGb/f;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p1}, LGb/f;->j()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v0, p1}, Lda/I;->T0(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public t0()V
    .locals 1

    invoke-virtual {p0}, Lda/I;->k0()LH/l;

    move-result-object v0

    invoke-static {v0}, LH/m;->a(LH/l;)V

    return-void
.end method

.method public u0()V
    .locals 3

    iget-object v0, p0, Lda/I;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, LR9/a;->X()LQ9/j;

    move-result-object v0

    new-instance v1, LQ9/j$a$d;

    sget-object v2, Lcom/ui/core/ui/sso/a$a;->a:Lcom/ui/core/ui/sso/a$a;

    invoke-direct {v1, v2}, LQ9/j$a$d;-><init>(LQ9/j$b;)V

    invoke-interface {v0, v1}, LQ9/j;->b(LQ9/j$a;)V

    return-void
.end method

.method public v0()V
    .locals 2

    invoke-virtual {p0}, Lda/I;->c1()LLi/y;

    move-result-object v0

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method public w0(Z)V
    .locals 1

    invoke-virtual {p0}, Lda/I;->o0()LLi/z;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method public x0()V
    .locals 2

    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object v0

    sget-object v1, LQ9/j$a$a;->a:LQ9/j$a$a;

    invoke-interface {v0, v1}, LQ9/j;->b(LQ9/j$a;)V

    return-void
.end method

.method public y0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object v0

    new-instance v1, LQ9/j$a$e;

    invoke-direct {v1, p1}, LQ9/j$a$e;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LQ9/j;->b(LQ9/j$a;)V

    return-void
.end method
