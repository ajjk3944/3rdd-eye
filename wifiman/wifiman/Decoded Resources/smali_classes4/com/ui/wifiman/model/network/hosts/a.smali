.class public final Lcom/ui/wifiman/model/network/hosts/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/network/hosts/a$a;,
        Lcom/ui/wifiman/model/network/hosts/a$b;,
        Lcom/ui/wifiman/model/network/hosts/a$c;
    }
.end annotation


# static fields
.field public static final h:Lcom/ui/wifiman/model/network/hosts/a$a;


# instance fields
.field private final a:LRb/a;

.field private final b:Ldd/a;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/network/hosts/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/network/hosts/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/network/hosts/a;->h:Lcom/ui/wifiman/model/network/hosts/a$a;

    return-void
.end method

.method public constructor <init>(LRb/a;Ldd/a;LZc/f;)V
    .locals 4

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostLatencyStatsService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkConnectionManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a;->a:LRb/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/network/hosts/a;->b:Ldd/a;

    invoke-interface {p1}, LRb/a;->a()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/network/hosts/a$l;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/network/hosts/a$l;-><init>(Lcom/ui/wifiman/model/network/hosts/a;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a;->c:Lgg/i;

    new-instance v1, Lbd/a;

    invoke-direct {v1}, Lbd/a;-><init>()V

    sget-object v2, Lcom/ui/wifiman/model/network/hosts/a$i;->a:Lcom/ui/wifiman/model/network/hosts/a$i;

    invoke-virtual {p1, v1, v2}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object v1

    sget-object v2, Lcom/ui/wifiman/model/network/hosts/a$j;->a:Lcom/ui/wifiman/model/network/hosts/a$j;

    invoke-virtual {v1, v2}, Lgg/i;->B(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->h1()Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/ui/wifiman/model/network/hosts/a;->d:Lgg/i;

    invoke-interface {p3}, LZc/f;->getState()Lgg/i;

    move-result-object p3

    sget-object v2, Lcom/ui/wifiman/model/network/hosts/a$g;->a:Lcom/ui/wifiman/model/network/hosts/a$g;

    invoke-virtual {p3, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-virtual {p3, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/network/hosts/a;->e:Lgg/i;

    const-class p3, Lcom/ui/wifiman/model/network/hosts/a$b$a;

    invoke-virtual {v1, p3}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object p3

    const-string v1, "ofType(R::class.java)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wifiman/model/network/hosts/a$e;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/network/hosts/a$e;-><init>(Lcom/ui/wifiman/model/network/hosts/a;)V

    invoke-virtual {p3, v1}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p3

    new-instance v1, Lbd/b;

    invoke-direct {v1}, Lbd/b;-><init>()V

    sget-object v2, Lcom/ui/wifiman/model/network/hosts/a$f;->a:Lcom/ui/wifiman/model/network/hosts/a$f;

    invoke-virtual {p3, v1, v2}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object p3

    const-wide/16 v1, 0x3e8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, v1, v2, v3}, Lgg/i;->U1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->e1()Lgg/i;

    move-result-object p3

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p3, v1, v2, p2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p3

    const-string v1, "observeOn(...)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Ljava/util/Map;

    invoke-virtual {p3, v1}, Lgg/i;->n(Ljava/lang/Class;)Lgg/i;

    move-result-object p3

    const-string v1, "cast(R::class.java)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/network/hosts/a;->f:Lgg/i;

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p3, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p3

    sget-object v1, Lcom/ui/wifiman/model/network/hosts/a$h;->a:Lcom/ui/wifiman/model/network/hosts/a$h;

    invoke-static {p1, p3, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a;->g:Lgg/i;

    return-void
.end method

.method public static synthetic e()LYg/s;
    .locals 1

    invoke-static {}, Lcom/ui/wifiman/model/network/hosts/a;->n()LYg/s;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    invoke-static {}, Lcom/ui/wifiman/model/network/hosts/a;->l()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/network/hosts/a;)LRb/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/network/hosts/a;->a:LRb/a;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/network/hosts/a;)Ldd/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/network/hosts/a;->b:Ldd/a;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/network/hosts/a;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/network/hosts/a;->d:Lgg/i;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/network/hosts/a;Lcom/ui/wifiman/model/network/hosts/a$b$a;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/network/hosts/a;->m(Lcom/ui/wifiman/model/network/hosts/a$b$a;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/network/hosts/a;)Lgg/b;
    .locals 0

    invoke-direct {p0}, Lcom/ui/wifiman/model/network/hosts/a;->o()Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final l()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-object v0
.end method

.method private final m(Lcom/ui/wifiman/model/network/hosts/a$b$a;)Lgg/i;
    .locals 2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/network/hosts/a$b$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gateway"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a;->e:Lgg/i;

    invoke-static {p1}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/network/hosts/a$b$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method private static final n()LYg/s;
    .locals 2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    return-object v0
.end method

.method private final o()Lgg/b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/network/hosts/a$m;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/network/hosts/a$m;-><init>(Lcom/ui/wifiman/model/network/hosts/a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object v0

    const-string v1, "observeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lgg/b;
    .locals 2

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a;->c:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/network/hosts/a$d;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/network/hosts/a$d;-><init>(Lcom/ui/wifiman/model/network/hosts/a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(JI)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/network/hosts/a$k;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ui/wifiman/model/network/hosts/a$k;-><init>(Lcom/ui/wifiman/model/network/hosts/a;JI)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a;->g:Lgg/i;

    return-object v0
.end method

.method public d(J)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/network/hosts/a$n;

    invoke-direct {v0, p0, p1, p2}, Lcom/ui/wifiman/model/network/hosts/a$n;-><init>(Lcom/ui/wifiman/model/network/hosts/a;J)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
