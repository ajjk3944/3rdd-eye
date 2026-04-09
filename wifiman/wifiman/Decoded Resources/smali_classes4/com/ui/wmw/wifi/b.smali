.class public final Lcom/ui/wmw/wifi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wmw/wifi/a$a;


# instance fields
.field private final a:Lcom/ui/wmw/api/v1/a;

.field private final b:Lgg/b;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:LFg/a;

.field private final g:Lgg/i;

.field private final h:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V
    .locals 2

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fwUploadState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/wifi/b;->a:Lcom/ui/wmw/api/v1/a;

    invoke-interface {p3}, LMf/s;->a()Lgg/i;

    move-result-object p3

    new-instance v0, Lcom/ui/wmw/wifi/b$e;

    invoke-direct {v0, p2, p0}, Lcom/ui/wmw/wifi/b$e;-><init>(LKf/e;Lcom/ui/wmw/wifi/b;)V

    invoke-virtual {p3, v0}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p3

    sget-object v0, Lcom/ui/wmw/wifi/b$f;->a:Lcom/ui/wmw/wifi/b$f;

    invoke-virtual {p3, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p3

    new-instance v0, LQf/a;

    invoke-direct {v0}, LQf/a;-><init>()V

    invoke-virtual {p3, v0}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p3

    const-string v0, "doFinally(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wmw/wifi/b;->b:Lgg/b;

    invoke-interface {p1}, Lcom/ui/wmw/api/v1/a;->b()Lgg/s;

    move-result-object p1

    sget-object v0, Lgg/a;->LATEST:Lgg/a;

    invoke-virtual {p1, v0}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object p1

    const-string v0, "toFlowable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/ui/wmw/api/v1/b$e;

    invoke-virtual {p1, v0}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object p1

    const-string v0, "ofType(R::class.java)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wmw/wifi/b$b;->a:Lcom/ui/wmw/wifi/b$b;

    invoke-virtual {p1, v0}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/wifi/b$c;

    invoke-direct {v0, p0, p2}, Lcom/ui/wmw/wifi/b$c;-><init>(Lcom/ui/wmw/wifi/b;LKf/e;)V

    invoke-virtual {p1, v0}, Lgg/i;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "concatMapSingle(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/ui/wmw/f;->c(Lgg/i;Z)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wmw/wifi/b$d;->a:Lcom/ui/wmw/wifi/b$d;

    invoke-virtual {p1, v0}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object p1

    const-string v0, "doOnError(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/wifi/b;->c:Lgg/i;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sget-object v1, Lcom/ui/wmw/wifi/b$i;->a:Lcom/ui/wmw/wifi/b$i;

    invoke-virtual {p1, v0, v1}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wmw/wifi/b$j;->a:Lcom/ui/wmw/wifi/b$j;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wmw/wifi/b$k;->a:Lcom/ui/wmw/wifi/b$k;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wmw/wifi/b$l;->a:Lcom/ui/wmw/wifi/b$l;

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const-string v0, "doOnNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/wifi/b;->d:Lgg/i;

    sget-object v0, Lcom/ui/wmw/wifi/b$a;->a:Lcom/ui/wmw/wifi/b$a;

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    const-string p3, "mergeWith(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/ui/wmw/f;->c(Lgg/i;Z)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p3, "refCount(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/wifi/b;->e:Lgg/i;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string v0, "createDefault(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/wifi/b;->f:LFg/a;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/wifi/b;->g:Lgg/i;

    sget-object p1, LS8/c;->GHZ_2_4:LS8/c;

    sget-object p2, LS8/c;->GHZ_5:LS8/c;

    filled-new-array {p1, p2}, [LS8/c;

    move-result-object p1

    invoke-static {p1}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string p2, "just(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/wifi/b;->h:Lgg/i;

    return-void
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/wmw/wifi/b;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()V
    .locals 0

    invoke-static {}, Lcom/ui/wmw/wifi/b;->j()V

    return-void
.end method

.method public static final synthetic f(Lcom/ui/wmw/wifi/b;Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)Lcom/ui/wmw/wifi/a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wmw/wifi/b;->i(Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)Lcom/ui/wmw/wifi/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wmw/wifi/b;)Lcom/ui/wmw/api/v1/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/wifi/b;->a:Lcom/ui/wmw/api/v1/a;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wmw/wifi/b;)LFg/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/wifi/b;->f:LFg/a;

    return-object p0
.end method

.method private final i(Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)Lcom/ui/wmw/wifi/a;
    .locals 24

    new-instance v0, Lcom/ui/wmw/wifi/o;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/ui/wmw/wifi/o;-><init>(Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)V

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->f()LS8/c;

    move-result-object v4

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->i()I

    move-result v6

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->g()I

    move-result v2

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->j()LS8/d;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_8

    sget-object v5, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v5, v3}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->o()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->k()I

    move-result v7

    sget-object v8, LS8/c;->GHZ_2_4:LS8/c;

    if-ne v4, v8, :cond_0

    sget-object v10, LS8/d;->MHZ_40:LS8/d;

    if-ne v9, v10, :cond_0

    move v10, v6

    goto :goto_0

    :cond_0
    move v10, v2

    :goto_0
    if-ne v4, v8, :cond_2

    sget-object v8, LS8/d;->MHZ_40:LS8/d;

    if-ne v9, v8, :cond_2

    if-ge v6, v2, :cond_1

    add-int/lit8 v2, v6, 0x4

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v6, -0x4

    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_2
    move-object v8, v2

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->h()Ljava/lang/Integer;

    move-result-object v2

    goto :goto_2

    :goto_3
    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->v()Ljava/util/Set;

    move-result-object v11

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->s()LS8/l;

    move-result-object v12

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->t()I

    move-result v13

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->n()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->s()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v16

    if-lez v16, :cond_3

    move-object/from16 v16, v2

    goto :goto_4

    :cond_3
    const/16 v16, 0x0

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->u()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v15, 0x1

    if-ne v2, v15, :cond_4

    goto :goto_5

    :cond_4
    const/4 v15, 0x0

    :goto_5
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object v15, v2

    goto :goto_6

    :cond_5
    const/4 v15, 0x0

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->g()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {v2}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    int-to-float v2, v2

    const/high16 v18, 0x42c80000    # 100.0f

    div-float v2, v2, v18

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    move-object/from16 v23, v2

    goto :goto_7

    :cond_6
    const/16 v23, 0x0

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->p()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v17, v1

    goto :goto_8

    :cond_7
    const/16 v17, 0x0

    :goto_8
    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->m()LS8/a;

    move-result-object v18

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->p()LS8/j;

    move-result-object v19

    invoke-virtual {v0}, Lcom/ui/wmw/wifi/o;->w()Ljava/util/Set;

    move-result-object v20

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v21

    new-instance v0, Lcom/ui/wmw/wifi/a;

    move-object v1, v0

    move-object v2, v3

    move-object v3, v5

    move v5, v7

    move v7, v10

    move-object v10, v11

    move-object v11, v12

    move v12, v13

    move-object v13, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v23

    invoke-direct/range {v1 .. v22}, Lcom/ui/wmw/wifi/a;-><init>(Lh9/a;Ljava/lang/String;LS8/c;IIILjava/lang/Integer;LS8/d;Ljava/util/Set;LS8/l;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;LS8/a;LS8/j;Ljava/util/Set;J)V

    return-object v0

    :cond_8
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WMW Wifi scan result - invalid mac "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final j()V
    .locals 1

    new-instance v0, LQf/b;

    invoke-direct {v0}, LQf/b;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method

.method private static final k()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW Wifi scan trigger finished"

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/b;->h:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/b;->e:Lgg/i;

    return-object v0
.end method

.method public c(Ljava/util/Set;)Lgg/b;
    .locals 3

    const-string v0, "channels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wmw/wifi/b;->a:Lcom/ui/wmw/api/v1/a;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ui/wmw/api/v1/a;->e(Ljava/util/List;)Lgg/b;

    move-result-object v0

    invoke-static {v0}, Lcom/ui/wmw/f;->b(Lgg/b;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/wifi/b$g;

    invoke-direct {v1, p0, p1}, Lcom/ui/wmw/wifi/b$g;-><init>(Lcom/ui/wmw/wifi/b;Ljava/util/Set;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/wifi/b$h;

    invoke-direct {v1, p1}, Lcom/ui/wmw/wifi/b$h;-><init>(Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    const-string v0, "doOnError(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
