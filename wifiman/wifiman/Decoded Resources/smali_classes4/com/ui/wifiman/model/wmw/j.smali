.class public final Lcom/ui/wifiman/model/wmw/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/wmw/WifimanWizard;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/wmw/j$a;,
        Lcom/ui/wifiman/model/wmw/j$b;
    }
.end annotation


# static fields
.field public static final o:Lcom/ui/wifiman/model/wmw/j$b;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lmc/a;

.field private final c:Lcom/ui/wifiman/model/wmw/d;

.field private final d:Lcom/ui/wifiman/model/wmw/b$d;

.field private final e:LP7/a;

.field private final f:LFg/a;

.field private final g:LFg/a;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:Lgg/i;

.field private final m:Lgg/i;

.field private final n:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/wmw/j$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/wmw/j$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/wmw/j;->o:Lcom/ui/wifiman/model/wmw/j$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lmc/a;Lcom/ui/wifiman/model/wmw/d;Lcom/ui/wifiman/model/wmw/b$d;LP7/a;LT8/a;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "discovery"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adoptionManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "btle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/j;->b:Lmc/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/wmw/j;->c:Lcom/ui/wifiman/model/wmw/d;

    iput-object p4, p0, Lcom/ui/wifiman/model/wmw/j;->d:Lcom/ui/wifiman/model/wmw/b$d;

    iput-object p5, p0, Lcom/ui/wifiman/model/wmw/j;->e:LP7/a;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string p2, "createDefault(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j;->f:LFg/a;

    new-instance p3, Ll9/a;

    const/4 p5, 0x0

    invoke-direct {p3, p5}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p3}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p3

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/wmw/j;->g:LFg/a;

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 p5, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p5, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j;->h:Lgg/i;

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p3

    invoke-virtual {p2, p3}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string p3, "refCount(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/j;->i:Lgg/i;

    sget-object p2, LAg/c;->a:LAg/c;

    invoke-interface {p4}, Lcom/ui/wifiman/model/wmw/b$d;->a()Lgg/i;

    move-result-object v1

    sget-object v2, Lcom/ui/wifiman/model/wmw/j$c;->a:Lcom/ui/wifiman/model/wmw/j$c;

    invoke-virtual {v1, v2}, Lgg/i;->X(Lkg/c;)Lgg/i;

    move-result-object v1

    const-string v2, "distinctUntilChanged(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1, v1}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance v1, Lcom/ui/wifiman/model/wmw/j$d;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/wmw/j$d;-><init>(Lcom/ui/wifiman/model/wmw/j;)V

    invoke-virtual {p1, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v1, "switchMap(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j;->j:Lgg/i;

    invoke-interface {p6}, LT8/a;->getState()Lgg/i;

    move-result-object p1

    new-instance p6, Lcom/ui/wifiman/model/wmw/j$t;

    invoke-direct {p6, p0}, Lcom/ui/wifiman/model/wmw/j$t;-><init>(Lcom/ui/wifiman/model/wmw/j;)V

    invoke-virtual {p1, p6}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p6

    invoke-virtual {p1, p6}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    new-instance p6, Lcom/ui/wifiman/model/wmw/j$u;

    invoke-direct {p6, p0}, Lcom/ui/wifiman/model/wmw/j$u;-><init>(Lcom/ui/wifiman/model/wmw/j;)V

    invoke-virtual {p1, p6}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p6, Lcom/ui/wifiman/model/wmw/j$v;->a:Lcom/ui/wifiman/model/wmw/j$v;

    invoke-virtual {p1, p6}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p6, Lqe/l;

    invoke-direct {p6}, Lqe/l;-><init>()V

    invoke-virtual {p1, p6}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j;->k:Lgg/i;

    invoke-interface {p4}, Lcom/ui/wifiman/model/wmw/b$d;->a()Lgg/i;

    move-result-object p1

    sget-object p6, Lcom/ui/wifiman/model/wmw/j$g;->a:Lcom/ui/wifiman/model/wmw/j$g;

    invoke-virtual {p1, p6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p6, Lcom/ui/wifiman/model/wmw/j$h;->a:Lcom/ui/wifiman/model/wmw/j$h;

    invoke-virtual {p1, p6}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j;->l:Lgg/i;

    invoke-interface {p4}, Lcom/ui/wifiman/model/wmw/b$d;->a()Lgg/i;

    move-result-object p4

    invoke-virtual {p0}, Lcom/ui/wifiman/model/wmw/j;->getState()Lgg/i;

    move-result-object p6

    invoke-virtual {p2, p4, p6, p1}, LAg/c;->b(Lgg/i;Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/wmw/j$e;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/wmw/j$e;-><init>(Lcom/ui/wifiman/model/wmw/j;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wmw/j;->t(Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/wmw/j$f;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/wmw/j$f;-><init>(Lcom/ui/wifiman/model/wmw/j;)V

    invoke-virtual {p1, p2}, Lgg/i;->I(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j;->m:Lgg/i;

    new-instance p1, Lqe/m;

    invoke-direct {p1, p0}, Lqe/m;-><init>(Lcom/ui/wifiman/model/wmw/j;)V

    invoke-static {p1}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/wmw/j;->getState()Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->E0()Lgg/b;

    move-result-object p2

    invoke-virtual {p0}, Lcom/ui/wifiman/model/wmw/j;->d()Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->E0()Lgg/b;

    move-result-object p3

    const/4 p4, 0x2

    new-array p4, p4, [Lgg/f;

    aput-object p2, p4, p5

    aput-object p3, p4, v0

    invoke-static {p4}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/s;->l0(Lgg/f;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/s;->x0(I)LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    const-string p2, "ignoreElements(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j;->n:Lgg/b;

    return-void
.end method

.method private final A(Lcom/ui/wmw/g;)Lgg/z;
    .locals 3

    sget-object v0, LAg/e;->a:LAg/e;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j;->d:Lcom/ui/wifiman/model/wmw/b$d;

    invoke-interface {v1}, Lcom/ui/wifiman/model/wmw/b$d;->a()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    const-string v2, "firstOrError(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/ui/wmw/g;->c()LOf/a$a;

    move-result-object p1

    invoke-interface {p1}, LOf/a$a;->c()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, LAg/e;->a(Lgg/D;Lgg/D;)Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/wmw/j$r;->a:Lcom/ui/wifiman/model/wmw/j$r;

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final B(Lcom/ui/wifiman/model/wmw/j;Lgg/t;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "WMW Bonded Connection Enabled"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j;->f:LFg/a;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    new-instance v0, Lqe/n;

    invoke-direct {v0, p0}, Lqe/n;-><init>(Lcom/ui/wifiman/model/wmw/j;)V

    invoke-interface {p1, v0}, Lgg/t;->d(Lkg/e;)V

    return-void
.end method

.method private static final C(Lcom/ui/wifiman/model/wmw/j;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "WMW Bonded Connection Disabled"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/j;->f:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private final D(Lcom/ui/wifiman/model/wmw/b$c$c;)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/j$s;

    invoke-direct {v0, p0, p1}, Lcom/ui/wifiman/model/wmw/j$s;-><init>(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/b$c$c;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final E()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "WMW Bonded connection processor FINISHED"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic f()V
    .locals 0

    invoke-static {}, Lcom/ui/wifiman/model/wmw/j;->E()V

    return-void
.end method

.method public static synthetic g(Lcom/ui/wifiman/model/wmw/j;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/wmw/j;->B(Lcom/ui/wifiman/model/wmw/j;Lgg/t;)V

    return-void
.end method

.method public static synthetic h(Lcom/ui/wifiman/model/wmw/j;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/wmw/j;->C(Lcom/ui/wifiman/model/wmw/j;)V

    return-void
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wmw/WMWizard$a$a;Lcom/ui/wifiman/model/wmw/b$a;)Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/wmw/j;->u(Lcom/ui/wmw/WMWizard$a$a;Lcom/ui/wifiman/model/wmw/b$a;)Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wmw/g;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wmw/j;->v(Lcom/ui/wmw/g;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/wmw/j;)Lgg/b;
    .locals 0

    invoke-direct {p0}, Lcom/ui/wifiman/model/wmw/j;->w()Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/ui/wifiman/model/wmw/j;Lh9/a;Lh9/a;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/wmw/j;->x(Lh9/a;Lh9/a;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/b$a;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wmw/j;->y(Lcom/ui/wifiman/model/wmw/b$a;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/ui/wifiman/model/wmw/j;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/j;->j:Lgg/i;

    return-object p0
.end method

.method public static final synthetic o(Lcom/ui/wifiman/model/wmw/j;)Lcom/ui/wifiman/model/wmw/b$d;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/j;->d:Lcom/ui/wifiman/model/wmw/b$d;

    return-object p0
.end method

.method public static final synthetic p(Lcom/ui/wifiman/model/wmw/j;)LP7/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/j;->e:LP7/a;

    return-object p0
.end method

.method public static final synthetic q(Lcom/ui/wifiman/model/wmw/j;)LFg/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/j;->g:LFg/a;

    return-object p0
.end method

.method public static final synthetic r(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wmw/g;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wmw/j;->A(Lcom/ui/wmw/g;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/b$c$c;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wmw/j;->D(Lcom/ui/wifiman/model/wmw/b$c$c;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private final t(Lgg/i;)Lgg/i;
    .locals 3

    new-instance v0, Lcom/ui/wifiman/model/wmw/j$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2}, Lcom/ui/wifiman/model/wmw/j$a;-><init>(Lcom/ui/wifiman/model/wmw/b$c;Lcom/ui/wifiman/model/wmw/b$c;Z)V

    sget-object v1, Lcom/ui/wifiman/model/wmw/j$i;->a:Lcom/ui/wifiman/model/wmw/j$i;

    invoke-virtual {p1, v0, v1}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    const-string v0, "scan(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final u(Lcom/ui/wmw/WMWizard$a$a;Lcom/ui/wifiman/model/wmw/b$a;)Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a;
    .locals 3

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$a$a$b;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/ui/wmw/WMWizard$a$a$b;

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$a$a$b$a;

    if-eqz v0, :cond_0

    new-instance p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    const v0, 0x3e99999a    # 0.3f

    invoke-direct {p1, p2, v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;-><init>(Lcom/ui/wifiman/model/wmw/b$a;F)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wmw/WMWizard$a$a$b$b;

    if-eqz v0, :cond_1

    new-instance p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-direct {p1, p2, v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;-><init>(Lcom/ui/wifiman/model/wmw/b$a;F)V

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lcom/ui/wmw/WMWizard$a$a$b$c;

    if-eqz p1, :cond_2

    new-instance p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    const v0, 0x3f4ccccd    # 0.8f

    invoke-direct {p1, p2, v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;-><init>(Lcom/ui/wifiman/model/wmw/b$a;F)V

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    instance-of v0, p1, Lcom/ui/wmw/WMWizard$a$a$a;

    if-eqz v0, :cond_4

    new-instance v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    check-cast p1, Lcom/ui/wmw/WMWizard$a$a$a;

    invoke-virtual {p1}, Lcom/ui/wmw/WMWizard$a$a$a;->a()Lcom/ui/wmw/g;

    move-result-object p1

    invoke-direct {v0, p2, v1, v2, p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;-><init>(Lcom/ui/wifiman/model/wmw/b$a;JLcom/ui/wmw/g;)V

    move-object p1, v0

    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final v(Lcom/ui/wmw/g;)Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j;->d:Lcom/ui/wifiman/model/wmw/b$d;

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/b$d;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/j$j;

    invoke-direct {v1, p1, p0}, Lcom/ui/wifiman/model/wmw/j$j;-><init>(Lcom/ui/wmw/g;Lcom/ui/wifiman/model/wmw/j;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final w()Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j;->d:Lcom/ui/wifiman/model/wmw/b$d;

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/b$d;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/j$l;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/wmw/j$l;-><init>(Lcom/ui/wifiman/model/wmw/j;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final x(Lh9/a;Lh9/a;)Lgg/i;
    .locals 2

    sget-object v0, Lcom/ui/wmw/WMWizard;->a:Lcom/ui/wmw/WMWizard;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, p2}, Lcom/ui/wmw/WMWizard;->c(Landroid/content/Context;Lh9/a;Lh9/a;)Lgg/z;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/wmw/j$m;->a:Lcom/ui/wifiman/model/wmw/j$m;

    invoke-virtual {p1, p2}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "flatMapPublisher(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final y(Lcom/ui/wifiman/model/wmw/b$a;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j;->c:Lcom/ui/wifiman/model/wmw/d;

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/d;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/j$n;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/wmw/j$n;-><init>(Lcom/ui/wifiman/model/wmw/b$a;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/j$o;

    invoke-direct {v1, p1, p0}, Lcom/ui/wifiman/model/wmw/j$o;-><init>(Lcom/ui/wifiman/model/wmw/b$a;Lcom/ui/wifiman/model/wmw/j;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/j$p;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/wmw/j$p;-><init>(Lcom/ui/wifiman/model/wmw/b$a;)V

    invoke-virtual {v0, v1}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/wmw/j$q;->a:Lcom/ui/wifiman/model/wmw/j$q;

    invoke-virtual {p1, v0}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "repeatWhen(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final z()Ljava/lang/String;
    .locals 1

    const-string v0, "WiFiman Wizard"

    return-object v0
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/wmw/j$k;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/wmw/j$k;-><init>(Lcom/ui/wifiman/model/wmw/j;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    const-string v1, "subscribeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Lh9/a;)Lgg/b;
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wifiman/model/wmw/j;->a()Lgg/b;

    move-result-object v0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/wmw/j;->d:Lcom/ui/wifiman/model/wmw/b$d;

    sget-object v1, Lcom/ui/wifiman/model/wmw/b$b;->a:Lcom/ui/wifiman/model/wmw/b$b;

    invoke-interface {p1, v1}, Lcom/ui/wifiman/model/wmw/b$d;->b(Lcom/ui/wifiman/model/wmw/b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j;->d:Lcom/ui/wifiman/model/wmw/b$d;

    invoke-direct {p0}, Lcom/ui/wifiman/model/wmw/j;->z()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/ui/wifiman/model/wmw/b$a$b;

    invoke-direct {v3, v2, p1}, Lcom/ui/wifiman/model/wmw/b$a$b;-><init>(Ljava/lang/String;Lh9/a;)V

    invoke-interface {v1, v3}, Lcom/ui/wifiman/model/wmw/b$d;->b(Lcom/ui/wifiman/model/wmw/b;)Lgg/b;

    move-result-object p1

    :goto_0
    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {v1}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string v0, "concatArray(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lgg/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j;->n:Lgg/b;

    return-object v0
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j;->m:Lgg/i;

    return-object v0
.end method

.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j;->i:Lgg/i;

    return-object v0
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j;->k:Lgg/i;

    return-object v0
.end method
