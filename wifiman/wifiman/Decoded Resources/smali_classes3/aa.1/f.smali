.class public final Laa/f;
.super Laa/d;
.source "SourceFile"


# instance fields
.field private final e:Lcom/ui/core/ui/sso/c;

.field private final f:LU9/h;

.field private final g:LU9/b;

.field private final h:LLi/N;

.field private final i:LLi/N;

.field private final j:LLi/N;

.field private final k:LLi/N;

.field private final l:LLi/N;

.field private final m:LLi/N;

.field private final n:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/core/ui/sso/c;LU9/h;)V
    .locals 1

    const-string/jumbo v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "activityController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Laa/d;-><init>()V

    iput-object p1, p0, Laa/f;->e:Lcom/ui/core/ui/sso/c;

    iput-object p2, p0, Laa/f;->f:LU9/h;

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/c;->d()Lcom/ui/core/ui/sso/UiSSO$d;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/UiSSO$d;->a()LU9/b;

    move-result-object p1

    if-eqz p1, :cond_3

    iput-object p1, p0, Laa/f;->g:LU9/b;

    new-instance p2, Ls9/d$b;

    sget v0, LP9/b;->Q:I

    invoke-direct {p2, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p2

    iput-object p2, p0, Laa/f;->h:LLi/N;

    new-instance p2, Ls9/d$b;

    sget v0, LP9/b;->P:I

    invoke-direct {p2, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p2

    iput-object p2, p0, Laa/f;->i:LLi/N;

    invoke-direct {p0, p1}, Laa/f;->o0(LU9/b;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p2

    iput-object p2, p0, Laa/f;->j:LLi/N;

    invoke-virtual {p1}, LU9/b;->a()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, LEb/w;

    instance-of v0, v0, LEb/w$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Laa/f;->k:LLi/N;

    new-instance p1, Ls9/d$b;

    sget p2, LP9/b;->O:I

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Laa/f;->l:LLi/N;

    new-instance p1, Ls9/d$b;

    sget p2, LP9/b;->N:I

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Laa/f;->m:LLi/N;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Laa/f;->n:LLi/N;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "MFA params unavailable."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic m0(Laa/f;LEb/w;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Laa/f;->p0(Laa/f;LEb/w;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final n0(LEb/w;)Ljava/lang/String;
    .locals 3

    instance-of v0, p1, LEb/w$a;

    if-eqz v0, :cond_0

    check-cast p1, LEb/w$a;

    invoke-virtual {p1}, LEb/w$a;->f()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LEb/w$c;

    const-string v1, "-"

    if-eqz v0, :cond_1

    check-cast p1, LEb/w$c;

    invoke-virtual {p1}, LEb/w$c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LEb/w$c;->j()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LEb/w$e;

    if-eqz v0, :cond_2

    check-cast p1, LEb/w$e;

    invoke-virtual {p1}, LEb/w$e;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LEb/w$e;->j()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, p1, LEb/w$d;

    if-eqz v0, :cond_3

    check-cast p1, LEb/w$d;

    invoke-virtual {p1}, LEb/w$d;->f()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of v0, p1, LEb/w$g;

    if-eqz v0, :cond_4

    check-cast p1, LEb/w$g;

    invoke-virtual {p1}, LEb/w$g;->f()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_4
    instance-of v0, p1, LEb/w$h;

    if-eqz v0, :cond_5

    check-cast p1, LEb/w$h;

    invoke-virtual {p1}, LEb/w$h;->f()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final o0(LU9/b;)Ljava/util/List;
    .locals 13

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, LU9/b;->a()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEb/w;

    invoke-virtual {p1}, LU9/b;->b()LEb/w;

    move-result-object v3

    invoke-virtual {v3}, LEb/w;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, LEb/w;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    instance-of v3, v2, LEb/w$d;

    if-eqz v3, :cond_1

    new-instance v3, LZ9/a;

    invoke-direct {p0, v2}, Laa/f;->n0(LEb/w;)Ljava/lang/String;

    move-result-object v5

    new-instance v12, Ls9/b$a;

    sget v7, LP9/a;->f:I

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Ls9/d$b;

    sget v4, LP9/b;->Y0:I

    invoke-direct {v8, v4}, Ls9/d$b;-><init>(I)V

    new-instance v9, Ls9/d$c;

    check-cast v2, LEb/w$d;

    invoke-virtual {v2}, LEb/w$d;->j()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v9, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v7, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, LZ9/a;-><init>(Ljava/lang/String;Ls9/b;ZLs9/d;Ls9/d;)V

    const/4 v2, 0x0

    invoke-interface {v0, v2, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of v3, v2, LEb/w$g;

    if-eqz v3, :cond_2

    new-instance v3, LZ9/a;

    invoke-direct {p0, v2}, Laa/f;->n0(LEb/w;)Ljava/lang/String;

    move-result-object v5

    new-instance v2, Ls9/b$a;

    sget v7, LP9/a;->b:I

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v11}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Ls9/d$b;

    sget v4, LP9/b;->Y:I

    invoke-direct {v8, v4}, Ls9/d$b;-><init>(I)V

    new-instance v9, Ls9/d$c;

    const-string v4, ""

    invoke-direct {v9, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v7, 0x1

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, LZ9/a;-><init>(Ljava/lang/String;Ls9/b;ZLs9/d;Ls9/d;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of v3, v2, LEb/w$c;

    if-eqz v3, :cond_3

    new-instance v3, LZ9/a;

    invoke-direct {p0, v2}, Laa/f;->n0(LEb/w;)Ljava/lang/String;

    move-result-object v5

    new-instance v12, Ls9/b$a;

    sget v7, LP9/a;->c:I

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Ls9/d$b;

    sget v4, LP9/b;->Z:I

    invoke-direct {v8, v4}, Ls9/d$b;-><init>(I)V

    new-instance v9, Ls9/d$c;

    check-cast v2, LEb/w$c;

    invoke-virtual {v2}, LEb/w$c;->j()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v9, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v7, 0x1

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, LZ9/a;-><init>(Ljava/lang/String;Ls9/b;ZLs9/d;Ls9/d;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_3
    instance-of v3, v2, LEb/w$e;

    if-eqz v3, :cond_4

    new-instance v3, LZ9/a;

    invoke-direct {p0, v2}, Laa/f;->n0(LEb/w;)Ljava/lang/String;

    move-result-object v5

    new-instance v12, Ls9/b$a;

    sget v7, LP9/a;->d:I

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Ls9/d$b;

    sget v4, LP9/b;->b0:I

    invoke-direct {v8, v4}, Ls9/d$b;-><init>(I)V

    new-instance v9, Ls9/d$c;

    check-cast v2, LEb/w$e;

    invoke-virtual {v2}, LEb/w$e;->j()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v9, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v7, 0x1

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, LZ9/a;-><init>(Ljava/lang/String;Ls9/b;ZLs9/d;Ls9/d;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    instance-of v3, v2, LEb/w$a;

    if-nez v3, :cond_6

    instance-of v3, v2, LEb/w$h;

    if-eqz v3, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_1
    new-instance v3, Laa/e;

    invoke-direct {v3, p0, v2}, Laa/e;-><init>(Laa/f;LEb/w;)V

    invoke-static {v3}, LS9/a;->d(Lmh/a;)V

    goto/16 :goto_0

    :cond_7
    return-object v0
.end method

.method private static final p0(Laa/f;LEb/w;)Ljava/lang/String;
    .locals 1

    invoke-direct {p0, p1}, Laa/f;->n0(LEb/w;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "MFA method "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " presentation skipped"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final q0(LEb/w;)LU9/f;
    .locals 1

    instance-of v0, p1, LEb/w$d;

    if-eqz v0, :cond_0

    sget-object p1, LU9/f$d;->a:LU9/f$d;

    goto :goto_0

    :cond_0
    instance-of v0, p1, LEb/w$c;

    if-eqz v0, :cond_1

    sget-object p1, LU9/f$b;->a:LU9/f$b;

    goto :goto_0

    :cond_1
    instance-of v0, p1, LEb/w$e;

    if-eqz v0, :cond_2

    sget-object p1, LU9/f$f;->a:LU9/f$f;

    goto :goto_0

    :cond_2
    instance-of v0, p1, LEb/w$g;

    if-eqz v0, :cond_3

    sget-object p1, LU9/f$a;->a:LU9/f$a;

    goto :goto_0

    :cond_3
    instance-of v0, p1, LEb/w$a;

    if-eqz v0, :cond_4

    sget-object p1, LU9/f$e;->a:LU9/f$e;

    :goto_0
    return-object p1

    :cond_4
    instance-of p1, p1, LEb/w$h;

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "Unknown TwoFaAuthenticator method can\'t be routed to any screen"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public H(Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, Laa/f;->f:LU9/h;

    sget-object v0, LU9/i;->a:LU9/i;

    invoke-virtual {p1, v0}, LU9/h;->e0(LU9/h$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public L()LLi/N;
    .locals 1

    iget-object v0, p0, Laa/f;->i:LLi/N;

    return-object v0
.end method

.method public P()LLi/N;
    .locals 1

    iget-object v0, p0, Laa/f;->h:LLi/N;

    return-object v0
.end method

.method public e0()LLi/N;
    .locals 1

    iget-object v0, p0, Laa/f;->n:LLi/N;

    return-object v0
.end method

.method public f0()LLi/N;
    .locals 1

    iget-object v0, p0, Laa/f;->m:LLi/N;

    return-object v0
.end method

.method public g0()LLi/N;
    .locals 1

    iget-object v0, p0, Laa/f;->k:LLi/N;

    return-object v0
.end method

.method public h0()LLi/N;
    .locals 1

    iget-object v0, p0, Laa/f;->l:LLi/N;

    return-object v0
.end method

.method public i0()LLi/N;
    .locals 1

    iget-object v0, p0, Laa/f;->j:LLi/N;

    return-object v0
.end method

.method public j0(Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, Laa/f;->f:LU9/h;

    sget-object v0, LU9/h$a$a$b;->a:LU9/h$a$a$b;

    invoke-virtual {p1, v0}, LU9/h;->e0(LU9/h$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public k0(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 2

    iget-object p2, p0, Laa/f;->g:LU9/b;

    invoke-virtual {p2}, LU9/b;->a()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LEb/w;

    invoke-direct {p0, v1}, Laa/f;->n0(LEb/w;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, LEb/w;

    if-eqz v0, :cond_3

    iget-object p1, p0, Laa/f;->e:Lcom/ui/core/ui/sso/c;

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/c;->d()Lcom/ui/core/ui/sso/UiSSO$d;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/UiSSO$d;->a()LU9/b;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1, v0}, LU9/b;->d(LEb/w;)V

    :cond_2
    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object p1

    new-instance p2, LQ9/j$a$d;

    invoke-direct {p0, v0}, Laa/f;->q0(LEb/w;)LU9/f;

    move-result-object v0

    invoke-direct {p2, v0}, LQ9/j$a$d;-><init>(LQ9/j$b;)V

    invoke-interface {p1, p2}, LQ9/j;->b(LQ9/j$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "Selected method id not found in available methods"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public l0(Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object p1

    new-instance v0, LQ9/j$a$d;

    sget-object v1, LU9/f$e;->a:LU9/f$e;

    invoke-direct {v0, v1}, LQ9/j$a$d;-><init>(LQ9/j$b;)V

    invoke-interface {p1, v0}, LQ9/j;->b(LQ9/j$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
