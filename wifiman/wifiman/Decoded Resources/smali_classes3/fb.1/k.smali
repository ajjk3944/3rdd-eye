.class public final Lfb/k;
.super Leb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfb/k$a;
    }
.end annotation


# static fields
.field public static final r:Lfb/k$a;


# instance fields
.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Llb/c;

.field private final h:Lfb/o;

.field private final i:LGb/f;

.field private final j:LAb/a;

.field private final k:LCb/a;

.field private l:Z

.field private final m:Lfb/s;

.field private final n:Lfb/e;

.field private final o:LYg/m;

.field private p:Lgg/j;

.field private final q:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfb/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfb/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfb/k;->r:Lfb/k$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llb/c;Lfb/o;LGb/f;LAb/a;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LCb/a;)V
    .locals 11

    move-object v0, p0

    move-object v2, p1

    move-object v3, p3

    move-object v1, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v8, p10

    const-string/jumbo v7, "host"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "macAddress"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "meta"

    invoke-static {p4, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "options"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "storage"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "ssoClient"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "httpLogLevel"

    move-object/from16 v9, p9

    invoke-static {v9, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "trustedDeviceHelper"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    move-object v10, p2

    invoke-direct {p0, p2, v5, v7}, Leb/c;-><init>(Ljava/lang/String;LGb/f;Leb/g$b;)V

    iput-object v2, v0, Lfb/k;->e:Ljava/lang/String;

    iput-object v3, v0, Lfb/k;->f:Ljava/lang/String;

    iput-object v1, v0, Lfb/k;->g:Llb/c;

    iput-object v4, v0, Lfb/k;->h:Lfb/o;

    iput-object v5, v0, Lfb/k;->i:LGb/f;

    iput-object v6, v0, Lfb/k;->j:LAb/a;

    iput-object v8, v0, Lfb/k;->k:LCb/a;

    new-instance v6, Lfb/s;

    invoke-direct {v6, p3, v5}, Lfb/s;-><init>(Ljava/lang/String;LGb/f;)V

    iput-object v6, v0, Lfb/k;->m:Lfb/s;

    new-instance v10, Lfb/e;

    move-object v1, v10

    move-object/from16 v4, p6

    move-object v5, v6

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    invoke-direct/range {v1 .. v8}, Lfb/e;-><init>(Ljava/lang/String;Ljava/lang/String;LGb/f;Lfb/s;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LCb/a;)V

    iput-object v10, v0, Lfb/k;->n:Lfb/e;

    new-instance v1, Lfb/f;

    invoke-direct {v1, p0}, Lfb/f;-><init>(Lfb/k;)V

    invoke-static {v1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v1

    iput-object v1, v0, Lfb/k;->o:LYg/m;

    new-instance v1, Lfb/g;

    invoke-direct {v1, p0}, Lfb/g;-><init>(Lfb/k;)V

    sget-object v2, Lgg/a;->MISSING:Lgg/a;

    invoke-static {v1, v2}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object v1

    new-instance v2, Lfb/k$d;

    invoke-direct {v2, p0}, Lfb/k$d;-><init>(Lfb/k;)V

    invoke-virtual {v1, v2}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1e

    invoke-static {v3, v4, v2}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v3

    sget-object v4, Lfb/k$e;->a:Lfb/k$e;

    invoke-virtual {v1, v3, v4}, Lgg/i;->a2(LDj/a;Lkg/n;)Lgg/i;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    const-wide/16 v3, 0xa

    invoke-virtual {v1, v3, v4, v2}, Ljg/a;->k2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v1

    const-string/jumbo v2, "refCount(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Leb/g;

    invoke-virtual {v1, v2}, Lgg/i;->n(Ljava/lang/Class;)Lgg/i;

    move-result-object v1

    const-string/jumbo v2, "cast(R::class.java)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lfb/k;->q:Lgg/i;

    return-void
.end method

.method public static final synthetic A(Lfb/k;)V
    .locals 0

    invoke-direct {p0}, Lfb/k;->N()V

    return-void
.end method

.method public static final synthetic B(Lfb/k;Z)V
    .locals 0

    iput-boolean p1, p0, Lfb/k;->l:Z

    return-void
.end method

.method private final C(Lfb/o;)Lgg/b;
    .locals 3

    instance-of v0, p1, Lfb/o$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lfb/k;->j:LAb/a;

    invoke-interface {v0}, LAb/a;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    const-string/jumbo v0, "NCA auth not possible, missing ssoId"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    check-cast p1, Lfb/o$a;

    invoke-virtual {p1}, Lfb/o$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lfb/k;->L(Ljava/lang/String;Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lfb/k;->D(Lgg/b;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final D(Lgg/b;)Lgg/b;
    .locals 2

    new-instance v0, Lfb/h;

    invoke-direct {v0, p0}, Lfb/h;-><init>(Lfb/k;)V

    invoke-static {v0}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object v0

    new-instance v1, Lfb/k$b;

    invoke-direct {v1, p0, p1}, Lfb/k$b;-><init>(Lfb/k;Lgg/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final E(Lfb/k;)Ljava/lang/Boolean;
    .locals 0

    iget-boolean p0, p0, Lfb/k;->l:Z

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final F()Lgg/b;
    .locals 3

    new-instance v0, Lfb/j;

    invoke-direct {v0, p0}, Lfb/j;-><init>(Lfb/k;)V

    invoke-static {v0}, Lgg/b;->E(Lkg/a;)Lgg/b;

    move-result-object v0

    invoke-virtual {p0}, Leb/c;->l()Lgg/z;

    move-result-object v1

    invoke-virtual {v1}, Lgg/z;->y()Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "ignoreElement(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lxb/e;->b(Lgg/b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "andThen(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final G(Lfb/k;)V
    .locals 2

    iget-object p0, p0, Lfb/k;->m:Lfb/s;

    invoke-virtual {p0}, Lfb/s;->a()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p0, v1, v1, v0, v1}, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0
.end method

.method private final H(Lmh/a;)Lgg/b;
    .locals 2

    invoke-direct {p0}, Lfb/k;->F()Lgg/b;

    move-result-object v0

    new-instance v1, Lfb/k$c;

    invoke-direct {v1, p1}, Lfb/k$c;-><init>(Lmh/a;)V

    invoke-virtual {v0, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final I(Lfb/k;Lgg/j;)V
    .locals 1

    const-string/jumbo v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lfb/k;->p:Lgg/j;

    sget-object p0, LYg/J;->a:LYg/J;

    invoke-interface {p1, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final J(Lfb/k;)Lfb/n;
    .locals 19

    move-object/from16 v0, p0

    new-instance v1, Lfb/n;

    iget-object v2, v0, Lfb/k;->n:Lfb/e;

    new-instance v15, Lmb/n;

    const/16 v16, 0x7ff

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v3, v15

    move-object/from16 v18, v15

    move/from16 v15, v16

    move-object/from16 v16, v17

    invoke-direct/range {v3 .. v16}, Lmb/n;-><init>(ZZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Lmb/k;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Lfb/k;->g:Llb/c;

    new-instance v4, Lfb/k$f;

    invoke-direct {v4, v0}, Lfb/k$f;-><init>(Ljava/lang/Object;)V

    move-object/from16 v0, v18

    invoke-direct {v1, v2, v0, v3, v4}, Lfb/n;-><init>(Lfb/e;Lmb/x;Llb/c;Lmh/a;)V

    return-object v1
.end method

.method private final K()Leb/g$c;
    .locals 1

    iget-object v0, p0, Lfb/k;->o:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/g$c;

    return-object v0
.end method

.method private final L(Ljava/lang/String;Ljava/lang/String;)Lgg/b;
    .locals 1

    new-instance v0, Lfb/i;

    invoke-direct {v0, p0, p1, p2}, Lfb/i;-><init>(Lfb/k;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lfb/k;->H(Lmh/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method private static final M(Lfb/k;Ljava/lang/String;Ljava/lang/String;)Lgg/b;
    .locals 1

    iget-object p0, p0, Lfb/k;->n:Lfb/e;

    invoke-virtual {p0}, Lfb/e;->c()Lfb/p;

    move-result-object p0

    new-instance v0, Lgb/c;

    invoke-direct {v0, p1, p2}, Lgb/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lfb/p;->n(Lgb/c;)Lgg/z;

    move-result-object p0

    invoke-static {p0}, Lfb/c;->b(Lgg/z;)Lgg/z;

    move-result-object p0

    invoke-virtual {p0}, Lgg/z;->y()Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "ignoreElement(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final N()V
    .locals 2

    iget-object v0, p0, Lfb/k;->p:Lgg/j;

    if-nez v0, :cond_0

    const-string/jumbo v0, "connectionStreamEmitter"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    new-instance v1, Lcom/ui/unifi/core/base/net/client/http/HttpClientDisconnectedException;

    invoke-direct {v1}, Lcom/ui/unifi/core/base/net/client/http/HttpClientDisconnectedException;-><init>()V

    invoke-interface {v0, v1}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public static synthetic q(Lfb/k;)V
    .locals 0

    invoke-static {p0}, Lfb/k;->G(Lfb/k;)V

    return-void
.end method

.method public static synthetic r(Lfb/k;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1}, Lfb/k;->I(Lfb/k;Lgg/j;)V

    return-void
.end method

.method public static synthetic s(Lfb/k;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lfb/k;->E(Lfb/k;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lfb/k;)Lfb/n;
    .locals 0

    invoke-static {p0}, Lfb/k;->J(Lfb/k;)Lfb/n;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lfb/k;Ljava/lang/String;Ljava/lang/String;)Lgg/b;
    .locals 0

    invoke-static {p0, p1, p2}, Lfb/k;->M(Lfb/k;Ljava/lang/String;Ljava/lang/String;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v(Lfb/k;Lfb/o;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lfb/k;->C(Lfb/o;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w(Lfb/k;)Lfb/e;
    .locals 0

    iget-object p0, p0, Lfb/k;->n:Lfb/e;

    return-object p0
.end method

.method public static final synthetic x(Lfb/k;)Llb/c;
    .locals 0

    iget-object p0, p0, Lfb/k;->g:Llb/c;

    return-object p0
.end method

.method public static final synthetic y(Lfb/k;)Lfb/o;
    .locals 0

    iget-object p0, p0, Lfb/k;->h:Lfb/o;

    return-object p0
.end method

.method public static final synthetic z(Lfb/k;)LGb/f;
    .locals 0

    iget-object p0, p0, Lfb/k;->i:LGb/f;

    return-object p0
.end method


# virtual methods
.method public a(Lmb/j;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Leb/c;->j()Lgg/z;

    move-result-object v0

    new-instance v1, Lfb/k$g;

    invoke-direct {v1, p1}, Lfb/k$g;-><init>(Lmb/j;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, Lfb/k$h;

    invoke-direct {v0, p0}, Lfb/k$h;-><init>(Lfb/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/z;
    .locals 2

    invoke-direct {p0}, Lfb/k;->K()Leb/g$c;

    move-result-object v0

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "just(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c([Ljava/security/cert/Certificate;)V
    .locals 1

    const-string/jumbo v0, "certificates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfb/k;->n:Lfb/e;

    invoke-virtual {v0, p1}, Lfb/e;->g([Ljava/security/cert/Certificate;)V

    return-void
.end method

.method public connect()Lgg/i;
    .locals 1

    iget-object v0, p0, Lfb/k;->q:Lgg/i;

    return-object v0
.end method
