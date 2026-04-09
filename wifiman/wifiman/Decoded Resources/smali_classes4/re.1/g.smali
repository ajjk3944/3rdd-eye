.class public final Lre/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lre/g$a;
    }
.end annotation


# static fields
.field public static final k:Lre/g$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LFg/a;

.field private final c:LFg/a;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/b;

.field private final i:Lgg/b;

.field private final j:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lre/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lre/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lre/g;->k:Lre/g$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/ui/wifiman/model/wmw/WifimanWizard;)V
    .locals 5

    const-string v0, "ssid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wizard"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre/g;->a:Ljava/lang/String;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string v0, "createDefault(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lre/g;->b:LFg/a;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lre/g;->c:LFg/a;

    invoke-interface {p2}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object p2

    sget-object v0, Lre/g$n;->a:Lre/g$n;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string v1, "refCount(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lre/g;->d:Lgg/i;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lre/g;->e:Lgg/i;

    invoke-virtual {p0}, Lre/g;->b()Lgg/i;

    move-result-object p1

    sget-object v2, Lre/g$g;->a:Lre/g$g;

    invoke-virtual {p1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v2, Lre/g$h;->a:Lre/g$h;

    invoke-virtual {p1, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lre/g;->f:Lgg/i;

    sget-object p1, Lre/g$b;->a:Lre/g$b;

    invoke-virtual {p2, p1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v2, Lre/g$c;

    invoke-direct {v2, p0}, Lre/g$c;-><init>(Lre/g;)V

    invoke-virtual {p1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v4, Lre/g$d;->a:Lre/g$d;

    invoke-virtual {p1, v2, v4}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object v2, Lre/g$e;->a:Lre/g$e;

    invoke-virtual {p1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v2, Lre/g$f;->a:Lre/g$f;

    invoke-virtual {p1, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lre/g;->g:Lgg/i;

    new-instance p1, Lre/d;

    invoke-direct {p1}, Lre/d;-><init>()V

    invoke-static {p1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    new-instance v1, Lre/g$k;

    invoke-direct {v1, p0}, Lre/g$k;-><init>(Lre/g;)V

    invoke-virtual {p1, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v1, Lre/e;

    invoke-direct {v1, p0}, Lre/e;-><init>(Lre/g;)V

    invoke-virtual {p1, v1}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->c0()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {p1, v1}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string v1, "ignoreElements(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lre/g;->h:Lgg/b;

    new-instance p1, Lre/g$l;

    invoke-direct {p1, p0}, Lre/g$l;-><init>(Lre/g;)V

    invoke-virtual {p2, p1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object p2, Lre/g$m;->a:Lre/g$m;

    invoke-virtual {p1, p2}, Lgg/b;->Q(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string p2, "retryWhen(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lre/g;->i:Lgg/b;

    invoke-virtual {p0}, Lre/g;->c()Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->E0()Lgg/b;

    move-result-object p2

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    aput-object p2, v2, v3

    aput-object p1, v2, v0

    invoke-static {v2}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->c0()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lre/g;->j:Lgg/b;

    return-void
.end method

.method public static synthetic h(Lgg/c;)V
    .locals 0

    invoke-static {p0}, Lre/g;->o(Lgg/c;)V

    return-void
.end method

.method public static synthetic i(Lre/g;)V
    .locals 0

    invoke-static {p0}, Lre/g;->p(Lre/g;)V

    return-void
.end method

.method public static synthetic j()V
    .locals 0

    invoke-static {}, Lre/g;->n()V

    return-void
.end method

.method public static final synthetic k(Lre/g;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lre/g;->f:Lgg/i;

    return-object p0
.end method

.method public static final synthetic l(Lre/g;)LFg/a;
    .locals 0

    iget-object p0, p0, Lre/g;->b:LFg/a;

    return-object p0
.end method

.method public static final synthetic m(Lre/g;)LFg/a;
    .locals 0

    iget-object p0, p0, Lre/g;->c:LFg/a;

    return-object p0
.end method

.method private static final n()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "APCompare - RESET"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final o(Lgg/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private static final p(Lre/g;)V
    .locals 2

    iget-object p0, p0, Lre/g;->b:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    const/4 p0, 0x0

    const/4 v0, 0x2

    const-string v1, "APCompare - IN BACKGROUND"

    invoke-static {v1, p0, v0, p0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 2

    new-instance v0, Lre/g$i;

    invoke-direct {v0, p0}, Lre/g$i;-><init>(Lre/g;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lre/f;

    invoke-direct {v1}, Lre/f;-><init>()V

    invoke-virtual {v0, v1}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object v0

    const-string v1, "doOnComplete(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lre/g;->e:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lre/g;->g:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/b;
    .locals 1

    iget-object v0, p0, Lre/g;->h:Lgg/b;

    return-object v0
.end method

.method public e()Lgg/b;
    .locals 1

    iget-object v0, p0, Lre/g;->j:Lgg/b;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lre/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g(Ljava/util/Set;)Lgg/b;
    .locals 1

    const-string v0, "aps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lre/g$j;

    invoke-direct {v0, p0, p1}, Lre/g$j;-><init>(Lre/g;Ljava/util/Set;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
