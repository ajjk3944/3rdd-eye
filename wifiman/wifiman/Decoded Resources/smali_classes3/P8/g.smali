.class public final LP8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/f;


# instance fields
.field private final a:Lcom/ui/wifiman/model/wmw/g;

.field private final b:LFg/a;

.field private final c:LFg/a;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/b;

.field private final i:Lgg/b;

.field private final j:Lgg/b;

.field private final k:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lcom/ui/wifiman/model/wmw/d;Lcom/ui/wifiman/model/wmw/g;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string/jumbo v2, "wifimanWizard"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "discovery"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "fwUpgrade"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, LP8/g;->a:Lcom/ui/wifiman/model/wmw/g;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v2

    const-string/jumbo v5, "createDefault(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, LP8/g;->b:LFg/a;

    sget-object v6, LP8/f$a;->STATUS:LP8/f$a;

    invoke-static {v6}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, LP8/g;->c:LFg/a;

    invoke-interface/range {p2 .. p2}, Lcom/ui/wifiman/model/wmw/d;->a()Lgg/i;

    move-result-object v5

    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sget-object v8, LP8/g$p;->a:LP8/g$p;

    invoke-virtual {v5, v7, v8}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object v5

    sget-object v7, LP8/g$q;->a:LP8/g$q;

    invoke-virtual {v5, v7}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v5

    invoke-virtual {v5}, Lgg/i;->W()Lgg/i;

    move-result-object v5

    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v5

    invoke-virtual {v5}, Ljg/a;->i2()Lgg/i;

    move-result-object v5

    const-string/jumbo v8, "refCount(...)"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, LP8/g;->d:Lgg/i;

    invoke-virtual {v2}, Lgg/i;->e1()Lgg/i;

    move-result-object v2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v5

    const/4 v9, 0x0

    invoke-virtual {v2, v5, v9, v7}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-virtual {v2, v7}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v2

    invoke-virtual {v2}, Ljg/a;->i2()Lgg/i;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, LP8/g;->e:Lgg/i;

    invoke-interface/range {p1 .. p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object v10

    invoke-interface/range {p1 .. p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->d()Lgg/i;

    move-result-object v11

    invoke-interface/range {p1 .. p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->e()Lgg/i;

    move-result-object v12

    invoke-interface/range {p2 .. p2}, Lcom/ui/wifiman/model/wmw/d;->a()Lgg/i;

    move-result-object v3

    sget-object v4, LP8/g$l;->a:LP8/g$l;

    invoke-virtual {v3, v4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-virtual {v3}, Lgg/i;->W()Lgg/i;

    move-result-object v13

    invoke-virtual {v6}, Lgg/i;->e1()Lgg/i;

    move-result-object v3

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    invoke-virtual {v3, v4, v9, v7}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v14

    invoke-interface/range {p3 .. p3}, Lcom/ui/wifiman/model/wmw/g;->getState()Lgg/i;

    move-result-object v15

    invoke-interface/range {p3 .. p3}, Lcom/ui/wifiman/model/wmw/g;->a()Lgg/i;

    move-result-object v16

    invoke-interface/range {p3 .. p3}, Lcom/ui/wifiman/model/wmw/g;->f()Lgg/i;

    move-result-object v17

    sget-object v18, LP8/g$m;->a:LP8/g$m;

    invoke-static/range {v10 .. v18}, Lgg/i;->p(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/l;)Lgg/i;

    move-result-object v3

    invoke-virtual {v3}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    const-string/jumbo v4, "distinctUntilChanged(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v3}, LP8/g;->l(Lgg/i;)Lgg/i;

    move-result-object v3

    invoke-virtual {v3, v7}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v3

    invoke-virtual {v3}, Ljg/a;->i2()Lgg/i;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v0, LP8/g;->f:Lgg/i;

    new-instance v4, LP8/g$n;

    invoke-direct {v4, v0}, LP8/g$n;-><init>(LP8/g;)V

    invoke-virtual {v2, v4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v4

    invoke-virtual {v4}, Lgg/i;->W()Lgg/i;

    move-result-object v4

    sget-object v5, LP8/g$o;->a:LP8/g$o;

    invoke-virtual {v4, v5}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v4

    invoke-virtual {v4, v7}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v4

    invoke-virtual {v4}, Ljg/a;->i2()Lgg/i;

    move-result-object v4

    invoke-static {v4, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, LP8/g;->g:Lgg/i;

    sget-object v4, LP8/g$f;->a:LP8/g$f;

    invoke-static {v2, v3, v4}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v2

    new-instance v4, LP8/g$g;

    invoke-direct {v4, v0}, LP8/g$g;-><init>(LP8/g;)V

    invoke-virtual {v2, v4}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v2

    const-string/jumbo v4, "switchMapCompletable(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, LP8/g;->h:Lgg/b;

    invoke-interface/range {p3 .. p3}, Lcom/ui/wifiman/model/wmw/g;->a()Lgg/i;

    move-result-object v1

    new-instance v5, LP8/g$e;

    invoke-direct {v5, v0}, LP8/g$e;-><init>(LP8/g;)V

    invoke-virtual {v1, v5}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LP8/g;->i:Lgg/b;

    const/4 v4, 0x2

    new-array v4, v4, [Lgg/f;

    aput-object v2, v4, v9

    aput-object v1, v4, v7

    invoke-static {v4}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object v1

    invoke-virtual {v1}, Lgg/b;->c0()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->h1()Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->E0()Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "ignoreElements(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LP8/g;->j:Lgg/b;

    sget-object v1, LP8/g$h;->a:LP8/g$h;

    invoke-virtual {v3, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v7}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LP8/g;->k:Lgg/i;

    return-void
.end method

.method public static final synthetic g(LP8/g;)Lcom/ui/wifiman/model/wmw/g;
    .locals 0

    iget-object p0, p0, LP8/g;->a:Lcom/ui/wifiman/model/wmw/g;

    return-object p0
.end method

.method public static final synthetic h(LP8/g;)Lgg/i;
    .locals 0

    iget-object p0, p0, LP8/g;->f:Lgg/i;

    return-object p0
.end method

.method public static final synthetic i(LP8/g;)Lgg/i;
    .locals 0

    iget-object p0, p0, LP8/g;->d:Lgg/i;

    return-object p0
.end method

.method public static final synthetic j(LP8/g;)LFg/a;
    .locals 0

    iget-object p0, p0, LP8/g;->c:LFg/a;

    return-object p0
.end method

.method public static final synthetic k(LP8/g;)LFg/a;
    .locals 0

    iget-object p0, p0, LP8/g;->b:LFg/a;

    return-object p0
.end method

.method private final l(Lgg/i;)Lgg/i;
    .locals 3

    new-instance v0, LYg/s;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, LP8/g$c;->a:LP8/g$c;

    invoke-virtual {p1, v0, v1}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object v0, LP8/g$d;->a:LP8/g$d;

    invoke-virtual {p1, v0}, Lgg/i;->M1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "switchMapMaybe(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 2

    iget-object v0, p0, LP8/g;->f:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LP8/g$j;

    invoke-direct {v1, p0}, LP8/g$j;-><init>(LP8/g;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(LP8/f$a;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LP8/g$i;

    invoke-direct {v0, p0, p1}, LP8/g$i;-><init>(LP8/g;LP8/f$a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lgg/b;
    .locals 2

    new-instance v0, LP8/g$k;

    invoke-direct {v0, p0}, LP8/g$k;-><init>(LP8/g;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public close()Lgg/b;
    .locals 2

    invoke-virtual {p0}, LP8/g;->e()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, LP8/g$a;->a:LP8/g$a;

    invoke-virtual {v0, v1}, Lgg/z;->r(Lkg/p;)Lgg/n;

    move-result-object v0

    new-instance v1, LP8/g$b;

    invoke-direct {v1, p0}, LP8/g$b;-><init>(LP8/g;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d()Lgg/b;
    .locals 1

    iget-object v0, p0, LP8/g;->j:Lgg/b;

    return-object v0
.end method

.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, LP8/g;->k:Lgg/i;

    return-object v0
.end method

.method public f()Lgg/b;
    .locals 1

    invoke-virtual {p0}, LP8/g;->close()Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, LP8/g;->g:Lgg/i;

    return-object v0
.end method
