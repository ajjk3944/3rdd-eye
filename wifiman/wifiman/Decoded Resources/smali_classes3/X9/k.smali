.class public LX9/k;
.super LX9/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX9/k$a;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V
    .locals 1

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

    invoke-direct/range {p0 .. p5}, LX9/c;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    invoke-virtual {p0}, LX9/k;->n1()LEb/w$e;

    move-result-object p1

    invoke-virtual {p0, p1}, LX9/k;->p1(LEb/w$e;)V

    return-void
.end method

.method public static synthetic m1(LX9/k;Ljava/lang/Throwable;Ls9/d;)Lgg/b;
    .locals 0

    invoke-static {p0, p1, p2}, LX9/k;->o1(LX9/k;Ljava/lang/Throwable;Ls9/d;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final o1(LX9/k;Ljava/lang/Throwable;Ls9/d;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "errorString"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LX9/k$c;

    invoke-direct {v0, p1, p0, p2}, LX9/k$c;-><init>(Ljava/lang/Throwable;LX9/k;Ls9/d;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "fromCallable(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method protected G0()Lgg/b;
    .locals 2

    invoke-virtual {p0}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-virtual {p0}, LX9/k;->n1()LEb/w$e;

    move-result-object v1

    invoke-interface {v0, v1}, LAb/a;->l(LEb/w$e;)Lgg/b;

    move-result-object v0

    new-instance v1, LX9/j;

    invoke-direct {v1, p0}, LX9/j;-><init>(LX9/k;)V

    invoke-virtual {p0, v0, v1}, LW9/e;->r0(Lgg/b;Lmh/p;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method protected n1()LEb/w$e;
    .locals 4

    invoke-virtual {p0}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->d()Lcom/ui/core/ui/sso/UiSSO$d;

    move-result-object v0

    const/4 v1, 0x0

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
    instance-of v2, v0, LEb/w$e;

    if-eqz v2, :cond_1

    check-cast v0, LEb/w$e;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_7

    invoke-virtual {p0}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->d()Lcom/ui/core/ui/sso/UiSSO$d;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/UiSSO$d;->a()LU9/b;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LU9/b;->a()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LEb/w;

    instance-of v3, v3, LEb/w$e;

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_3
    move-object v2, v1

    :goto_2
    check-cast v2, LEb/w;

    goto :goto_3

    :cond_4
    move-object v2, v1

    :goto_3
    instance-of v0, v2, LEb/w$e;

    if-eqz v0, :cond_5

    move-object v1, v2

    check-cast v1, LEb/w$e;

    :cond_5
    if-eqz v1, :cond_6

    move-object v0, v1

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Sms MFA Method params not found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_4
    return-object v0
.end method

.method protected final p1(LEb/w$e;)V
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LX9/c;->Y0()LLi/z;

    move-result-object v0

    new-instance v1, Ls9/d$b;

    sget v2, LP9/b;->H:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, LX9/c;->a1()LLi/z;

    move-result-object v0

    new-instance v1, Ls9/d$a;

    invoke-virtual {p1}, LEb/w$e;->j()Ljava/lang/String;

    move-result-object v2

    new-instance v3, LX9/k$d;

    invoke-direct {v3, p1}, LX9/k$d;-><init>(LEb/w$e;)V

    invoke-direct {v1, v2, v3}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, LW9/e;->k0()LLi/z;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
