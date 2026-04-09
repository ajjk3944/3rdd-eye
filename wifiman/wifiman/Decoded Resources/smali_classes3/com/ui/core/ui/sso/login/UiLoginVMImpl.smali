.class public final Lcom/ui/core/ui/sso/login/UiLoginVMImpl;
.super Lcom/ui/core/ui/sso/login/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/core/ui/sso/login/UiLoginVMImpl$a;,
        Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;,
        Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError;,
        Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;,
        Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d;,
        Lcom/ui/core/ui/sso/login/UiLoginVMImpl$e;
    }
.end annotation


# static fields
.field public static final w:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$a;

.field public static final x:I

.field private static final y:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;


# instance fields
.field private final e:Lcom/ui/core/ui/sso/SSOAccountVM;

.field private final f:Landroidx/lifecycle/E;

.field private final g:Lka/a;

.field private final h:LLi/z;

.field private final i:LH/l;

.field private final j:LLi/z;

.field private final k:LLi/z;

.field private final l:LLi/z;

.field private final m:LH/l;

.field private final n:LLi/z;

.field private final o:LLi/z;

.field private final p:LLi/z;

.field private final q:LLi/z;

.field private final r:LLi/z;

.field private final s:LFg/c;

.field private t:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;

.field private final u:LLi/y;

.field private final v:LLi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->w:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$a;

    const/16 v0, 0x8

    sput v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->x:I

    sget-object v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;->IDLE:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;

    sput-object v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->y:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;

    return-void
.end method

.method public constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;Landroidx/lifecycle/E;Lka/a;)V
    .locals 6

    const-string/jumbo v0, "sessionVM"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "savedState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vibrator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/core/ui/sso/login/g;-><init>()V

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->f:Landroidx/lifecycle/E;

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->g:Lka/a;

    sget-object p1, Lcom/ui/core/ui/sso/login/g$b;->INITIAL:Lcom/ui/core/ui/sso/login/g$b;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->h:LLi/z;

    new-instance p1, LH/l;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-string v1, ""

    const-wide/16 v2, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, LH/l;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->i:LH/l;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->j:LLi/z;

    new-instance p3, Ls9/d$b;

    sget v0, LP9/b;->h:I

    invoke-direct {p3, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p3}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->k:LLi/z;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->l:LLi/z;

    new-instance p3, LH/l;

    const-string v1, ""

    move-object v0, p3

    invoke-direct/range {v0 .. v5}, LH/l;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->m:LH/l;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p3

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->n:LLi/z;

    const/4 p3, 0x0

    invoke-static {p3}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->o:LLi/z;

    new-instance v0, Ls9/d$b;

    sget v1, LP9/b;->i:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->p:LLi/z;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->q:LLi/z;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->r:LLi/z;

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object p1

    const-string/jumbo v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->s:LFg/c;

    const-string/jumbo p1, "saved_state_login"

    invoke-virtual {p2, p1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->F0()LLi/z;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->b()Lcom/ui/core/ui/sso/login/g$b;

    move-result-object v0

    invoke-interface {p2, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->l0()LH/l;

    move-result-object p2

    invoke-virtual {p2}, LH/l;->r()LH/f;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LH/f;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {p2, v0}, LH/l;->d(LH/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-virtual {p2}, LH/l;->f()V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->k0()LH/l;

    move-result-object p2

    invoke-virtual {p2}, LH/l;->r()LH/f;

    move-result-object v0

    :try_start_1
    invoke-virtual {p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LH/f;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {p2, v0}, LH/l;->d(LH/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p2}, LH/l;->f()V

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, LH/l;->f()V

    throw p1

    :catchall_1
    move-exception p1

    invoke-virtual {p2}, LH/l;->f()V

    throw p1

    :cond_0
    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->l0()LH/l;

    move-result-object p1

    invoke-virtual {p1}, LH/l;->r()LH/f;

    move-result-object v0

    :try_start_2
    const-string/jumbo v1, "username"

    invoke-virtual {p2, v1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    const-string v2, ""

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    :try_start_3
    invoke-virtual {v0, v1}, LH/f;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {p1, v0}, LH/l;->d(LH/f;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    invoke-virtual {p1}, LH/l;->f()V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->k0()LH/l;

    move-result-object p1

    invoke-virtual {p1}, LH/l;->r()LH/f;

    move-result-object v0

    :try_start_4
    const-string/jumbo v1, "password"

    invoke-virtual {p2, v1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, p2

    :goto_0
    invoke-virtual {v0, v2}, LH/f;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {p1, v0}, LH/l;->d(LH/f;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-virtual {p1}, LH/l;->f()V

    :goto_1
    invoke-direct {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->H0()V

    sget-object p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->y:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->t:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;

    invoke-direct {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->K0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;)V

    const/4 p1, 0x1

    const/4 p2, 0x5

    const/4 v0, 0x0

    invoke-static {v0, p1, p3, p2, p3}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->u:LLi/y;

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->v:LLi/g;

    return-void

    :catchall_2
    move-exception p2

    invoke-virtual {p1}, LH/l;->f()V

    throw p2

    :catchall_3
    move-exception p2

    invoke-virtual {p1}, LH/l;->f()V

    throw p2
.end method

.method public static final synthetic A0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Ls9/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->L0(Ls9/d;)V

    return-void
.end method

.method private final B0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;)Lgg/z;
    .locals 8

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;->a()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, LAb/a$a;->b(LAb/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$f;

    invoke-direct {v1, p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$f;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$g;

    invoke-direct {v1, p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$g;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;)V

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final C0()V
    .locals 2

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->j0()LLi/z;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final D0(Lcom/ui/core/ui/sso/UiSSO$a;)Lgg/b;
    .locals 4

    const-wide/16 v0, 0x3e8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lgg/b;->a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$h;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v2, v1, p1, v2}, LQi/g;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/b;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    aput-object v1, v2, p1

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "concatArray(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final H0()V
    .locals 2

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->s:LFg/c;

    new-instance v1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;

    invoke-direct {v1, p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-virtual {v0, v1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$j;

    invoke-direct {v1, p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$j;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->S()Lhg/c;

    move-result-object v0

    const-string/jumbo v1, "subscribe(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LR9/a;->c0(Lhg/c;)V

    return-void
.end method

.method private final I0(Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;

    invoke-direct {v0, p1, p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$k;-><init>(Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "fromCallable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final J0()V
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->t:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;

    invoke-direct {p0, v0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->K0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;)V

    return-void
.end method

.method private final K0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;)V
    .locals 2

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->t:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;

    sget-object v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->E0()LLi/z;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->G0()LLi/z;

    move-result-object p1

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->h0()LLi/z;

    move-result-object p1

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->i0()LLi/z;

    move-result-object p1

    new-instance v0, Ls9/d$c;

    const-string/jumbo v1, "\u2714"

    invoke-direct {v0, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->C0()V

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->E0()LLi/z;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->G0()LLi/z;

    move-result-object p1

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->h0()LLi/z;

    move-result-object p1

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->i0()LLi/z;

    move-result-object p1

    new-instance v0, Ls9/d$b;

    sget v1, LP9/b;->j:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->C0()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->E0()LLi/z;

    move-result-object p1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->G0()LLi/z;

    move-result-object p1

    invoke-interface {p1, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->h0()LLi/z;

    move-result-object p1

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->l0()LH/l;

    move-result-object v1

    invoke-virtual {v1}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->k0()LH/l;

    move-result-object v1

    invoke-virtual {v1}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->i0()LLi/z;

    move-result-object p1

    new-instance v0, Ls9/d$b;

    sget v1, LP9/b;->i:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private final L0(Ls9/d;)V
    .locals 1

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->j0()LLi/z;

    move-result-object v0

    invoke-interface {v0, p1}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic t0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->B0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/UiSSO$a;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->D0(Lcom/ui/core/ui/sso/UiSSO$a;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)LLi/y;
    .locals 0

    iget-object p0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->u:LLi/y;

    return-object p0
.end method

.method public static final synthetic w0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)Lcom/ui/core/ui/sso/SSOAccountVM;
    .locals 0

    iget-object p0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    return-object p0
.end method

.method public static final synthetic x0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)Lka/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->g:Lka/a;

    return-object p0
.end method

.method public static final synthetic y0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->I0(Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic z0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->K0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;)V

    return-void
.end method


# virtual methods
.method public E0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->n:LLi/z;

    return-object v0
.end method

.method public F0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->h:LLi/z;

    return-object v0
.end method

.method public G0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->j:LLi/z;

    return-object v0
.end method

.method public Y()V
    .locals 2

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->F0()LLi/z;

    move-result-object v0

    sget-object v1, Lcom/ui/core/ui/sso/login/g$b;->ANIMATED:Lcom/ui/core/ui/sso/login/g$b;

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public a0()V
    .locals 5

    invoke-super {p0}, LR9/a;->a0()V

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->f:Landroidx/lifecycle/E;

    new-instance v1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->F0()LLi/z;

    move-result-object v2

    invoke-interface {v2}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/core/ui/sso/login/g$b;

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->l0()LH/l;

    move-result-object v3

    invoke-virtual {v3}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->k0()LH/l;

    move-result-object v4

    invoke-virtual {v4}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;-><init>(Lcom/ui/core/ui/sso/login/g$b;Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v2, "saved_state_login"

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b()LLi/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->v:LLi/g;

    return-object v0
.end method

.method public e0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->r:LLi/z;

    return-object v0
.end method

.method public f0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->l:LLi/z;

    return-object v0
.end method

.method public g0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->k:LLi/z;

    return-object v0
.end method

.method public h0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->q:LLi/z;

    return-object v0
.end method

.method public i0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->p:LLi/z;

    return-object v0
.end method

.method public j0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->o:LLi/z;

    return-object v0
.end method

.method public k0()LH/l;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->m:LH/l;

    return-object v0
.end method

.method public l0()LH/l;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->i:LH/l;

    return-object v0
.end method

.method public m0(Ldh/e;)Ljava/lang/Object;
    .locals 2

    iget-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {p1}, LR9/a;->X()LQ9/j;

    move-result-object p1

    new-instance v0, LQ9/j$a$d;

    sget-object v1, Lcom/ui/core/ui/sso/a$c;->a:Lcom/ui/core/ui/sso/a$c;

    invoke-direct {v0, v1}, LQ9/j$a$d;-><init>(LQ9/j$b;)V

    invoke-interface {p1, v0}, LQ9/j;->b(LQ9/j$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public n0()V
    .locals 0

    invoke-direct {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->J0()V

    invoke-direct {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->C0()V

    return-void
.end method

.method public o0()V
    .locals 2

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->u:LLi/y;

    sget-object v1, Lcom/ui/core/ui/sso/login/g$a$a;->a:Lcom/ui/core/ui/sso/login/g$a$a;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method public p0(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->h0()LLi/z;

    move-result-object v0

    invoke-interface {v0}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->r0(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public q0(Ldh/e;)Ljava/lang/Object;
    .locals 2

    iget-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {p1}, LR9/a;->X()LQ9/j;

    move-result-object p1

    new-instance v0, LQ9/j$a$d;

    sget-object v1, Lcom/ui/core/ui/sso/a$d;->a:Lcom/ui/core/ui/sso/a$d;

    invoke-direct {v0, v1}, LQ9/j$a$d;-><init>(LQ9/j$b;)V

    invoke-interface {p1, v0}, LQ9/j;->b(LQ9/j$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public r0(Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->h0()LLi/z;

    move-result-object p1

    invoke-interface {p1}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->s:LFg/c;

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->l0()LH/l;

    move-result-object v1

    invoke-virtual {v1}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->k0()LH/l;

    move-result-object v2

    invoke-virtual {v2}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LFg/c;->h(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public s0()V
    .locals 2

    invoke-virtual {p0}, LR9/a;->X()LQ9/j;

    move-result-object v0

    sget-object v1, LQ9/j$a$a;->a:LQ9/j$a$a;

    invoke-interface {v0, v1}, LQ9/j;->b(LQ9/j$a;)V

    return-void
.end method
