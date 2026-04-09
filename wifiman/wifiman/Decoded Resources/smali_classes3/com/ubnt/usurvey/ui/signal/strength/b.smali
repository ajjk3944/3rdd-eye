.class public final Lcom/ubnt/usurvey/ui/signal/strength/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/usurvey/ui/signal/strength/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/usurvey/ui/signal/strength/b$a;,
        Lcom/ubnt/usurvey/ui/signal/strength/b$b;,
        Lcom/ubnt/usurvey/ui/signal/strength/b$c;,
        Lcom/ubnt/usurvey/ui/signal/strength/b$d;
    }
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/android/permissions/d;

.field private final b:Ly8/g;

.field private final c:Ly8/k;

.field private final d:Li8/a;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:Ljava/util/List;

.field private final m:Lgg/i;

.field private final n:Lgg/i;

.field private final o:Lgg/i;

.field private final p:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LBc/a;Lde/z;Lcom/ui/wifiman/model/android/permissions/d;Ly8/g;Ly8/k;Ly8/u;Li8/a;)V
    .locals 3

    const-string/jumbo v0, "cellularService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "screenConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "permissionManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chartOperatorCellular"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chartOperatorLatency"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "latencyOperator"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "viewRouter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->a:Lcom/ui/wifiman/model/android/permissions/d;

    iput-object p4, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->b:Ly8/g;

    iput-object p5, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->c:Ly8/k;

    iput-object p7, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->d:Li8/a;

    invoke-interface {p2}, Lee/c;->b()Lgg/i;

    move-result-object p2

    sget-object p3, Lcom/ubnt/usurvey/ui/signal/strength/b$o;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$o;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string/jumbo p4, "refCount(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->e:Lgg/i;

    invoke-interface {p1}, LBc/a;->a()Lgg/i;

    move-result-object p5

    sget-object p7, Lcom/ubnt/usurvey/ui/signal/strength/b$q;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$q;

    invoke-static {p5, p2, p7}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p5

    invoke-virtual {p5}, Lgg/i;->W()Lgg/i;

    move-result-object p5

    invoke-virtual {p5, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p5

    invoke-virtual {p5}, Ljg/a;->i2()Lgg/i;

    move-result-object p5

    invoke-static {p5, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->f:Lgg/i;

    new-instance p7, Lcom/ubnt/usurvey/ui/signal/strength/b$i;

    invoke-direct {p7, p0}, Lcom/ubnt/usurvey/ui/signal/strength/b$i;-><init>(Lcom/ubnt/usurvey/ui/signal/strength/b;)V

    invoke-virtual {p2, p7}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p7

    invoke-virtual {p7}, Lgg/i;->W()Lgg/i;

    move-result-object p7

    invoke-virtual {p7, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p7

    invoke-virtual {p7}, Ljg/a;->i2()Lgg/i;

    move-result-object p7

    invoke-static {p7, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p7, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->g:Lgg/i;

    invoke-virtual {p6}, Ly8/t;->c()Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/b$j;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$j;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {p6}, Ly8/t;->e()Lgg/i;

    move-result-object p6

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/b$k;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$k;

    invoke-virtual {p6, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p6

    invoke-virtual {p6}, Lgg/i;->W()Lgg/i;

    move-result-object p6

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/b$l;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$l;

    invoke-static {p2, v0, p6, v1}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p6

    invoke-virtual {p6}, Lgg/i;->W()Lgg/i;

    move-result-object p6

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p6, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->h:Lgg/i;

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/b$h;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$h;

    invoke-virtual {p6, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p6

    invoke-virtual {p6}, Lgg/i;->W()Lgg/i;

    move-result-object p6

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p6, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->i:Lgg/i;

    new-instance p6, Lcom/ubnt/usurvey/ui/signal/strength/b$g;

    invoke-direct {p6, p0}, Lcom/ubnt/usurvey/ui/signal/strength/b$g;-><init>(Lcom/ubnt/usurvey/ui/signal/strength/b;)V

    invoke-virtual {p5, p6}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p5

    invoke-virtual {p5}, Lgg/i;->W()Lgg/i;

    move-result-object p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->j:Lgg/i;

    sget-object p6, Lcom/ubnt/usurvey/ui/signal/strength/b$m;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$m;

    invoke-virtual {p7, p6}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p6

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/b$n;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$n;

    invoke-virtual {p6, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p6

    invoke-virtual {p6}, Lgg/i;->W()Lgg/i;

    move-result-object p6

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p6, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->k:Lgg/i;

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->SIGNAL:Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    sget-object v2, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->LATENCY:Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    filled-new-array {v1, v2}, [Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->l:Ljava/util/List;

    new-instance v1, Lcom/ubnt/usurvey/ui/signal/strength/b$p;

    invoke-direct {v1, p0}, Lcom/ubnt/usurvey/ui/signal/strength/b$p;-><init>(Lcom/ubnt/usurvey/ui/signal/strength/b;)V

    invoke-virtual {p2, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->m:Lgg/i;

    invoke-interface {p1}, LBc/a;->a()Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$r;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$r;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->n:Lgg/i;

    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$e;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$e;

    invoke-static {p5, p2, p6, p1}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->o:Lgg/i;

    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$f;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$f;

    invoke-virtual {p7, p1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance p2, Ll9/a;

    const/4 p5, 0x0

    invoke-direct {p2, p5}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->p:Lgg/i;

    return-void
.end method

.method public static final synthetic e(Lcom/ubnt/usurvey/ui/signal/strength/b;Lcom/ubnt/usurvey/ui/signal/strength/b$c;)LTe/K0$f;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/b;->k(Lcom/ubnt/usurvey/ui/signal/strength/b$c;)LTe/K0$f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/ubnt/usurvey/ui/signal/strength/b;Lcom/ubnt/usurvey/ui/signal/strength/b$a;)Lgc/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/b;->l(Lcom/ubnt/usurvey/ui/signal/strength/b$a;)Lgc/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ubnt/usurvey/ui/signal/strength/b;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->i:Lgg/i;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ubnt/usurvey/ui/signal/strength/b;)Ly8/g;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->b:Ly8/g;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ubnt/usurvey/ui/signal/strength/b;)Ly8/k;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->c:Ly8/k;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ubnt/usurvey/ui/signal/strength/b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->l:Ljava/util/List;

    return-object p0
.end method

.method private final k(Lcom/ubnt/usurvey/ui/signal/strength/b$c;)LTe/K0$f;
    .locals 4

    new-instance v0, LTe/K0$f;

    invoke-virtual {p1}, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->getTitle()Ls9/d;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->getSubtitle()Ls9/d;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->getButton()Ls9/d;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LTe/K0$f;-><init>(Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;)V

    return-object v0
.end method

.method private final l(Lcom/ubnt/usurvey/ui/signal/strength/b$a;)Lgc/b;
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lgc/b;->LATENCY:Lgc/b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lgc/b;->SIGNAL:Lgc/b;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lgg/b;
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->PERMISSIONS:Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    invoke-virtual {v0}, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->a:Lcom/ui/wifiman/model/android/permissions/d;

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->PHONE_STATE:Lcom/ui/wifiman/model/android/permissions/a;

    sget-object v1, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION_FINE:Lcom/ui/wifiman/model/android/permissions/a;

    filled-new-array {v0, v1}, [Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/android/permissions/d;->a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->LOCATION_DISABLED:Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    invoke-virtual {v0}, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->d:Li8/a;

    const/4 v0, 0x1

    new-array v0, v0, [Li8/a$b;

    sget-object v1, Li8/a$b$D$e;->a:Li8/a$b$D$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p1, v0}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "complete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->p:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->o:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/b;
    .locals 2

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "complete(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b;->n:Lgg/i;

    return-object v0
.end method
