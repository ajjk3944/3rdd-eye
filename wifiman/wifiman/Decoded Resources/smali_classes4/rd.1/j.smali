.class public final Lrd/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrd/j$a;,
        Lrd/j$b;,
        Lrd/j$c;
    }
.end annotation


# static fields
.field public static final p:Lrd/j$a;


# instance fields
.field private final a:Lmc/a;

.field private final b:Lvc/b;

.field private final c:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

.field private final d:Ldc/a;

.field private final e:LFg/b;

.field private final f:Lgg/i;

.field private final g:LFg/b;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/b;

.field private final l:Lgg/i;

.field private final m:Lgg/i;

.field private final n:Lgg/b;

.field private final o:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrd/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrd/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrd/j;->p:Lrd/j$a;

    return-void
.end method

.method public constructor <init>(LZc/f;Lmc/a;Lld/b;Lvc/b;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;Ldc/a;)V
    .locals 3

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appScreenManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bonjour"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildConfig"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrd/j;->a:Lmc/a;

    iput-object p4, p0, Lrd/j;->b:Lvc/b;

    iput-object p5, p0, Lrd/j;->c:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

    iput-object p6, p0, Lrd/j;->d:Ldc/a;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p2

    invoke-virtual {p2}, LFg/b;->h2()LFg/b;

    move-result-object p2

    const-string p4, "toSerialized(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lrd/j;->e:LFg/b;

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p5

    const/4 p6, 0x0

    const/4 v0, 0x1

    invoke-virtual {p2, p5, p6, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string p5, "refCount(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lrd/j;->f:Lgg/i;

    sget-object v1, Lrd/a$a$a;->a:Lrd/a$a$a;

    invoke-static {v1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v1

    invoke-virtual {v1}, LFg/b;->h2()LFg/b;

    move-result-object v1

    invoke-static {v1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lrd/j;->g:LFg/b;

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    sget-object p4, Lrd/j$f;->a:Lrd/j$f;

    invoke-virtual {p1, p4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p4, "distinctUntilChanged(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrd/j;->h:Lgg/i;

    sget-object v2, Lrd/j$l;->a:Lrd/j$l;

    invoke-static {p2, p1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrd/j;->i:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {p2, v1, p6, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lrd/j;->j:Lgg/i;

    invoke-virtual {p0}, Lrd/j;->m()Lgg/i;

    move-result-object p2

    sget-object p6, Lrd/j$d;->a:Lrd/j$d;

    invoke-virtual {p2, p6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    new-instance p6, Lrd/j$e;

    invoke-direct {p6, p0}, Lrd/j$e;-><init>(Lrd/j;)V

    invoke-virtual {p2, p6}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p2

    const-string p6, "switchMapCompletable(...)"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lrd/j;->k:Lgg/b;

    new-instance p6, Lrd/j$m;

    invoke-direct {p6, p0}, Lrd/j$m;-><init>(Lrd/j;)V

    invoke-virtual {p1, p6}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance p6, Lrd/j$n;

    invoke-direct {p6, p0}, Lrd/j$n;-><init>(Lrd/j;)V

    invoke-virtual {p1, p6}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p6, Lrd/j$o;

    invoke-direct {p6, p0}, Lrd/j$o;-><init>(Lrd/j;)V

    invoke-virtual {p1, p6}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object p6, Lrd/j$p;->a:Lrd/j$p;

    invoke-virtual {p1, p6}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrd/j;->l:Lgg/i;

    invoke-interface {p3}, Lld/b;->a()Lgg/i;

    move-result-object p2

    sget-object p3, Lrd/j$q;->a:Lrd/j$q;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lrd/j;->m:Lgg/i;

    new-instance p2, Lrd/i;

    invoke-direct {p2, p0}, Lrd/i;-><init>(Lrd/j;)V

    invoke-static {p2}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p2

    invoke-virtual {p2}, Lgg/s;->r0()LBg/a;

    move-result-object p2

    invoke-virtual {p2}, LBg/a;->l1()Lgg/s;

    move-result-object p2

    invoke-virtual {p2}, Lgg/s;->f0()Lgg/b;

    move-result-object p2

    const-string p3, "ignoreElements(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lrd/j;->n:Lgg/b;

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrd/j;->o:Lgg/b;

    return-void
.end method

.method public static synthetic b(Lrd/j;)V
    .locals 0

    invoke-static {p0}, Lrd/j;->q(Lrd/j;)V

    return-void
.end method

.method public static synthetic c(Lrd/j;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1}, Lrd/j;->p(Lrd/j;Lgg/t;)V

    return-void
.end method

.method public static synthetic d()V
    .locals 0

    invoke-static {}, Lrd/j;->o()V

    return-void
.end method

.method public static final synthetic e(Lrd/j;)Lmc/a;
    .locals 0

    iget-object p0, p0, Lrd/j;->a:Lmc/a;

    return-object p0
.end method

.method public static final synthetic f(Lrd/j;)Lvc/b;
    .locals 0

    iget-object p0, p0, Lrd/j;->b:Lvc/b;

    return-object p0
.end method

.method public static final synthetic g(Lrd/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;
    .locals 0

    iget-object p0, p0, Lrd/j;->c:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

    return-object p0
.end method

.method public static final synthetic h(Lrd/j;)Ldc/a;
    .locals 0

    iget-object p0, p0, Lrd/j;->d:Ldc/a;

    return-object p0
.end method

.method public static final synthetic i(Lrd/j;)LFg/b;
    .locals 0

    iget-object p0, p0, Lrd/j;->g:LFg/b;

    return-object p0
.end method

.method public static final synthetic j(Lrd/j;)Lgg/i;
    .locals 0

    invoke-direct {p0}, Lrd/j;->n()Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lrd/j;Linet/ipaddr/g;I)Lgg/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lrd/j;->r(Linet/ipaddr/g;I)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lrd/j;Lgg/i;Linet/ipaddr/g;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lrd/j;->s(Lgg/i;Linet/ipaddr/g;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private final n()Lgg/i;
    .locals 3

    const-wide/16 v0, 0x3e8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lgg/z;->U(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    sget-object v1, Lrd/j$g;->a:Lrd/j$g;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Lrd/j$h;->a:Lrd/j$h;

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, Lrd/j$i;->a:Lrd/j$i;

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    sget-object v1, Lrd/j$j;->a:Lrd/j$j;

    invoke-virtual {v0, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, Lrd/h;

    invoke-direct {v1}, Lrd/h;-><init>()V

    invoke-virtual {v0, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final o()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Speedtest SERVER Finished"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final p(Lrd/j;Lgg/t;)V
    .locals 1

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrd/g;

    invoke-direct {v0, p0}, Lrd/g;-><init>(Lrd/j;)V

    invoke-interface {p1, v0}, Lgg/t;->d(Lkg/e;)V

    iget-object p0, p0, Lrd/j;->e:LFg/b;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final q(Lrd/j;)V
    .locals 1

    iget-object p0, p0, Lrd/j;->e:LFg/b;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private final r(Linet/ipaddr/g;I)Lgg/b;
    .locals 2

    iget-object v0, p0, Lrd/j;->m:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lrd/j$k;

    invoke-direct {v1, p0, p2, p1}, Lrd/j$k;-><init>(Lrd/j;ILinet/ipaddr/g;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string p2, "flatMapCompletable(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final s(Lgg/i;Linet/ipaddr/g;)Lgg/b;
    .locals 1

    sget-object v0, Lrd/j$r;->a:Lrd/j$r;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance v0, Lrd/j$s;

    invoke-direct {v0, p0, p2}, Lrd/j$s;-><init>(Lrd/j;Linet/ipaddr/g;)V

    invoke-virtual {p1, v0}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object p2, Lrd/j$t;->a:Lrd/j$t;

    invoke-virtual {p1, p2}, Lgg/b;->Q(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string p2, "retryWhen(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 1

    iget-object v0, p0, Lrd/j;->o:Lgg/b;

    return-object v0
.end method

.method public m()Lgg/i;
    .locals 1

    iget-object v0, p0, Lrd/j;->j:Lgg/i;

    return-object v0
.end method
