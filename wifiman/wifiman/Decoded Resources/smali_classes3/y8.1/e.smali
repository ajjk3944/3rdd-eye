.class public final Ly8/e;
.super Ly8/f;
.source "SourceFile"

# interfaces
.implements Ly8/d;


# instance fields
.field private final d:Lgg/i;

.field private final e:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lre/a;Lje/u;LCc/n;)V
    .locals 2

    const-string/jumbo v0, "wmwApComparison"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifiConnectionService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifimanDeviceManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly8/f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1}, Lre/a;->getState()Lgg/i;

    move-result-object v0

    sget-object v1, Ly8/e$a;->a:Ly8/e$a;

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "switchMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ly8/f;->g(Lgg/i;)Lgg/i;

    move-result-object v0

    new-instance v1, Ly8/e$b;

    invoke-direct {v1, p0}, Ly8/e$b;-><init>(Ly8/e;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ly8/e;->d:Lgg/i;

    invoke-interface {p1}, Lre/a;->getState()Lgg/i;

    move-result-object p1

    sget-object v0, Ly8/e$c;->a:Ly8/e$c;

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-interface {p2}, Lje/u;->a()Lgg/i;

    move-result-object p2

    sget-object v0, Ly8/e$d;->a:Ly8/e$d;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-interface {p3}, LCc/n;->a()Lgg/i;

    move-result-object p3

    new-instance v0, Ly8/e$e;

    invoke-direct {v0, p0}, Ly8/e$e;-><init>(Ly8/e;)V

    invoke-static {p1, p2, p3, v0}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "combineLatest(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/e;->e:Lgg/i;

    return-void
.end method

.method public static final synthetic i(Ly8/e;Lre/n$a;LTe/N;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/e;->l(Lre/n$a;LTe/N;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Ly8/e;I)LTe/N;
    .locals 0

    invoke-direct {p0, p1}, Ly8/e;->n(I)LTe/N;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Ly8/e;Lre/a$a;LTe/N;LCc/a;LS8/l;Z)LTe/B0;
    .locals 0

    invoke-direct/range {p0 .. p5}, Ly8/e;->o(Lre/a$a;LTe/N;LCc/a;LS8/l;Z)LTe/B0;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lre/n$a;LTe/N;)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/N;

    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Lre/n$a;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/N;

    invoke-direct {v6}, Lkotlin/jvm/internal/N;-><init>()V

    const/4 v7, 0x0

    const-wide/16 v8, 0x258

    invoke-static {v7, v8, v9}, Lsh/m;->t(IJ)Lsh/l;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x0

    move-object v10, v9

    move-object v11, v10

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_b

    move-object v12, v8

    check-cast v12, LZg/S;

    invoke-virtual {v12}, LZg/S;->d()J

    move-result-wide v12

    const-wide/16 v14, 0x7530

    sub-long v14, v3, v14

    const-wide/16 v16, 0x32

    mul-long v12, v12, v16

    add-long/2addr v14, v12

    :goto_1
    if-eqz v10, :cond_0

    if-eqz v11, :cond_0

    move-object v12, v11

    check-cast v12, LWc/c;

    invoke-virtual {v12}, LWc/c;->c()J

    move-result-wide v12

    cmp-long v12, v12, v14

    if-gez v12, :cond_3

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v18, v11

    move-object v11, v10

    move-object/from16 v10, v18

    goto :goto_1

    :cond_1
    check-cast v11, LWc/c;

    if-nez v11, :cond_2

    move-object v11, v10

    check-cast v11, LWc/c;

    :cond_2
    move-object v10, v11

    move-object v11, v9

    :cond_3
    move-object v12, v10

    check-cast v12, LWc/c;

    if-nez v12, :cond_4

    move-object v12, v11

    check-cast v12, LWc/c;

    :cond_4
    if-eqz v12, :cond_7

    invoke-virtual {v12}, LWc/c;->c()J

    move-result-wide v16

    cmp-long v13, v16, v14

    if-gez v13, :cond_5

    const/4 v13, 0x1

    goto :goto_2

    :cond_5
    move v13, v7

    :goto_2
    if-eqz v13, :cond_6

    goto :goto_3

    :cond_6
    move-object v12, v9

    :goto_3
    if-eqz v12, :cond_7

    invoke-virtual {v12}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LS8/l;

    goto :goto_4

    :cond_7
    move-object v12, v9

    :goto_4
    iput-object v12, v6, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v12, :cond_9

    iget-object v12, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v12, :cond_8

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_8
    iget-object v12, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v12, Ljava/util/List;

    new-instance v13, LTe/G;

    move-object/from16 v7, p0

    invoke-virtual {v7, v3, v4, v14, v15}, Ly8/f;->h(JJ)F

    move-result v14

    iget-object v15, v6, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v15, LS8/l;

    invoke-virtual {v15}, LS8/l;->b()I

    move-result v15

    int-to-float v15, v15

    invoke-direct {v13, v14, v15}, LTe/G;-><init>(FF)V

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    move-object/from16 v7, p0

    iget-object v12, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v12, :cond_a

    invoke-static {v1, v2, v0}, Ly8/e;->m(Ljava/util/List;Lkotlin/jvm/internal/N;LTe/N;)V

    :cond_a
    :goto_5
    const/4 v7, 0x0

    goto/16 :goto_0

    :cond_b
    move-object/from16 v7, p0

    iget-object v3, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v3, :cond_c

    invoke-static {v1, v2, v0}, Ly8/e;->m(Ljava/util/List;Lkotlin/jvm/internal/N;LTe/N;)V

    :cond_c
    return-object v1
.end method

.method private static final m(Ljava/util/List;Lkotlin/jvm/internal/N;LTe/N;)V
    .locals 2

    iget-object v0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/List;

    new-instance v1, LTe/H$a;

    invoke-direct {v1, p2, v0}, LTe/H$a;-><init>(LTe/N;Ljava/util/List;)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    iput-object p0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method

.method private final n(I)LTe/N;
    .locals 1

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    sget-object p1, LTe/N;->SECONDARY:LTe/N;

    goto :goto_0

    :cond_0
    sget-object p1, LTe/N;->COMPARE_5:LTe/N;

    goto :goto_0

    :cond_1
    sget-object p1, LTe/N;->COMPARE_4:LTe/N;

    goto :goto_0

    :cond_2
    sget-object p1, LTe/N;->COMPARE_3:LTe/N;

    goto :goto_0

    :cond_3
    sget-object p1, LTe/N;->COMPARE_2:LTe/N;

    goto :goto_0

    :cond_4
    sget-object p1, LTe/N;->COMPARE_1:LTe/N;

    :goto_0
    return-object p1
.end method

.method private final o(Lre/a$a;LTe/N;LCc/a;LS8/l;Z)LTe/B0;
    .locals 16

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    invoke-virtual/range {p1 .. p1}, Lre/a$a;->b()Lh9/a;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "cmp"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Ly8/f;->d()Lcom/ubnt/usurvey/product/m$c;

    move-result-object v3

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->c()Ls9/b;

    move-result-object v4

    invoke-static {v0, v3, v4}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object v3

    move-object v8, v3

    goto :goto_0

    :cond_0
    move-object v8, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface/range {p3 .. p3}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v9, v4

    goto :goto_1

    :cond_1
    new-instance v3, Ls9/d$b;

    const v4, 0x7f1100bf

    invoke-direct {v3, v4}, Ls9/d$b;-><init>(I)V

    move-object v9, v3

    :goto_1
    if-eqz p5, :cond_2

    sget-object v3, LAf/p$a;->a:LAf/p$a;

    move-object v11, v3

    goto :goto_2

    :cond_2
    move-object v11, v2

    :goto_2
    if-eqz v0, :cond_3

    invoke-interface/range {p3 .. p3}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_3
    move-object v0, v2

    :goto_3
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_4

    move v10, v4

    goto :goto_4

    :cond_4
    move v10, v3

    :goto_4
    new-instance v12, Ls9/d$c;

    invoke-virtual/range {p1 .. p1}, Lre/a$a;->b()Lh9/a;

    move-result-object v0

    invoke-virtual {v0}, Lh9/a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_6

    const/4 v0, 0x2

    invoke-static {v1, v4, v2, v0, v2}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_6

    :cond_5
    :goto_5
    move-object v13, v0

    goto :goto_7

    :cond_6
    :goto_6
    new-instance v0, Ls9/d$b;

    const v5, 0x7f110279

    invoke-direct {v0, v5}, Ls9/d$b;-><init>(I)V

    goto :goto_5

    :goto_7
    if-nez v1, :cond_7

    move v14, v4

    goto :goto_8

    :cond_7
    move v14, v3

    :goto_8
    if-eqz v1, :cond_8

    invoke-virtual/range {p4 .. p4}, LS8/l;->h()LW7/f$a;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, LNe/f;->b(LW7/f$a;)LW7/e;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0, v3}, LNe/e;->d(LW7/e;Z)Ls9/d;

    move-result-object v0

    move-object v15, v0

    goto :goto_9

    :cond_8
    move-object v15, v2

    :goto_9
    new-instance v0, LTe/B0;

    move-object v5, v0

    move-object/from16 v7, p2

    invoke-direct/range {v5 .. v15}, LTe/B0;-><init>(Ljava/lang/String;LTe/N;Ls9/a;Ls9/d;ZLDe/a;Ls9/d;Ls9/d;ZLs9/d;)V

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/e;->e:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/e;->d:Lgg/i;

    return-object v0
.end method
