.class public final Ly8/h;
.super Ly8/f;
.source "SourceFile"

# interfaces
.implements Ly8/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/h$a;
    }
.end annotation


# instance fields
.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LBc/a;)V
    .locals 4

    const-string/jumbo v0, "cellularService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly8/f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1}, LBc/a;->e()Lgg/i;

    move-result-object v0

    invoke-interface {p1}, LBc/a;->b()Lgg/i;

    move-result-object v1

    invoke-interface {p1}, LBc/a;->d()Lgg/i;

    move-result-object v2

    invoke-interface {p1}, LBc/a;->c()Lgg/i;

    move-result-object p1

    sget-object v3, Ly8/h$b;->a:Ly8/h$b;

    invoke-static {v0, v1, v2, p1, v3}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "combineLatest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ly8/f;->g(Lgg/i;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v1, "refCount(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/h;->d:Lgg/i;

    new-instance v2, Ly8/h$c;

    invoke-direct {v2, p0}, Ly8/h$c;-><init>(Ly8/h;)V

    invoke-virtual {p1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->e1()Lgg/i;

    move-result-object v2

    const-string/jumbo v3, "onBackpressureLatest(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Ly8/h;->e:Lgg/i;

    new-instance v2, Ly8/h$d;

    invoke-direct {v2, p0}, Ly8/h$d;-><init>(Ly8/h;)V

    invoke-virtual {p1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/h;->f:Lgg/i;

    return-void
.end method

.method public static final synthetic i(Ly8/h;LBc/a$a;ZZ)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ly8/h;->k(LBc/a$a;ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Ly8/h;ILBc/a$a;ZLBc/a$a;)LTe/B0;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ly8/h;->n(ILBc/a$a;ZLBc/a$a;)LTe/B0;

    move-result-object p0

    return-object p0
.end method

.method private final k(LBc/a$a;ZZ)Ljava/util/List;
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/N;

    invoke-direct {v4}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual/range {p1 .. p1}, LBc/a$a;->b()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/N;

    invoke-direct {v8}, Lkotlin/jvm/internal/N;-><init>()V

    const/4 v9, 0x0

    const-wide/16 v10, 0x258

    invoke-static {v9, v10, v11}, Lsh/m;->t(IJ)Lsh/l;

    move-result-object v10

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v11, 0x0

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_c

    move-object v15, v10

    check-cast v15, LZg/S;

    invoke-virtual {v15}, LZg/S;->d()J

    move-result-wide v15

    const-wide/16 v17, 0x7530

    sub-long v17, v5, v17

    const-wide/16 v19, 0x32

    mul-long v15, v15, v19

    move-object/from16 v19, v10

    add-long v9, v17, v15

    :goto_1
    if-eqz v12, :cond_0

    if-eqz v13, :cond_0

    move-object v15, v13

    check-cast v15, LBc/a$a$a;

    invoke-virtual {v15}, LBc/a$a$a;->b()J

    move-result-wide v15

    cmp-long v15, v15, v9

    if-gez v15, :cond_3

    :cond_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v21, v13

    move-object v13, v12

    move-object/from16 v12, v21

    goto :goto_1

    :cond_1
    check-cast v13, LBc/a$a$a;

    if-nez v13, :cond_2

    move-object v13, v12

    check-cast v13, LBc/a$a$a;

    :cond_2
    move-object v12, v13

    move-object v13, v11

    :cond_3
    move-object v15, v12

    check-cast v15, LBc/a$a$a;

    if-nez v15, :cond_4

    move-object v15, v13

    check-cast v15, LBc/a$a$a;

    :cond_4
    if-eqz v15, :cond_7

    invoke-virtual {v15}, LBc/a$a$a;->b()J

    move-result-wide v16

    cmp-long v16, v16, v9

    if-gez v16, :cond_5

    const/16 v16, 0x1

    goto :goto_2

    :cond_5
    const/16 v16, 0x0

    :goto_2
    if-eqz v16, :cond_6

    goto :goto_3

    :cond_6
    move-object v15, v11

    :goto_3
    if-eqz v15, :cond_7

    invoke-virtual {v15}, LBc/a$a$a;->a()LV7/a;

    move-result-object v15

    goto :goto_4

    :cond_7
    move-object v15, v11

    :goto_4
    iput-object v15, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v15, :cond_a

    if-eqz v1, :cond_8

    if-eqz v14, :cond_8

    check-cast v14, LV7/a;

    invoke-virtual {v14}, LW7/f;->h()LW7/f$a;

    move-result-object v14

    iget-object v15, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v15, LV7/a;

    invoke-virtual {v15}, LW7/f;->h()LW7/f$a;

    move-result-object v15

    if-eq v14, v15, :cond_8

    invoke-static {v3, v2, v4, v0, v1}, Ly8/h;->l(Ljava/util/List;ZLkotlin/jvm/internal/N;Ly8/h;Z)V

    :cond_8
    iget-object v14, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v14, :cond_9

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iput-object v14, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_9
    iget-object v14, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v14, Ljava/util/List;

    new-instance v15, LTe/G;

    invoke-virtual {v0, v5, v6, v9, v10}, Ly8/f;->h(JJ)F

    move-result v9

    iget-object v10, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v10, LV7/a;

    invoke-virtual {v10}, LW7/f;->b()I

    move-result v10

    int-to-float v10, v10

    invoke-direct {v15, v9, v10}, LTe/G;-><init>(FF)V

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    iget-object v9, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v9, :cond_b

    invoke-static {v3, v2, v4, v0, v1}, Ly8/h;->l(Ljava/util/List;ZLkotlin/jvm/internal/N;Ly8/h;Z)V

    :cond_b
    :goto_5
    iget-object v14, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object/from16 v10, v19

    const/4 v9, 0x0

    goto/16 :goto_0

    :cond_c
    iget-object v5, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v5, :cond_d

    invoke-static {v3, v2, v4, v0, v1}, Ly8/h;->l(Ljava/util/List;ZLkotlin/jvm/internal/N;Ly8/h;Z)V

    :cond_d
    return-object v3
.end method

.method private static final l(Ljava/util/List;ZLkotlin/jvm/internal/N;Ly8/h;Z)V
    .locals 0

    if-eqz p1, :cond_0

    new-instance p1, LTe/H$b;

    iget-object p3, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p3, Ljava/util/List;

    invoke-direct {p1, p3}, LTe/H$b;-><init>(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    new-instance p1, LTe/H$a;

    invoke-direct {p3, p4}, Ly8/h;->m(Z)LTe/N;

    move-result-object p3

    iget-object p4, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p4, Ljava/util/List;

    invoke-direct {p1, p3, p4}, LTe/H$a;-><init>(LTe/N;Ljava/util/List;)V

    :goto_0
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    iput-object p0, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method

.method private final m(Z)LTe/N;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, LTe/N;->PRIMARY:LTe/N;

    goto :goto_0

    :cond_0
    sget-object p1, LTe/N;->COMPARE_1:LTe/N;

    :goto_0
    return-object p1
.end method

.method private final n(ILBc/a$a;ZLBc/a$a;)LTe/B0;
    .locals 20

    move/from16 v0, p1

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    invoke-virtual/range {p4 .. p4}, LBc/a$a;->a()LV7/a;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "simStats"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v5, p0

    if-nez v2, :cond_2

    move/from16 v6, p3

    invoke-direct {v5, v6}, Ly8/h;->m(Z)LTe/N;

    move-result-object v6

    move-object v9, v6

    goto :goto_2

    :cond_2
    move-object v9, v1

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual/range {p2 .. p2}, LBc/a$a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v2, Ls9/d$c;

    invoke-direct {v2, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :goto_3
    move-object v11, v2

    goto :goto_5

    :cond_3
    new-instance v0, Ls9/d$b;

    const v2, 0x7f11027a

    invoke-direct {v0, v2}, Ls9/d$b;-><init>(I)V

    :goto_4
    move-object v11, v0

    goto :goto_5

    :cond_4
    invoke-virtual/range {p2 .. p2}, LBc/a$a;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    new-instance v0, Ls9/d$c;

    invoke-direct {v0, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_5
    new-instance v2, Ls9/d$b;

    add-int/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const v6, 0x7f11027b

    invoke-direct {v2, v6, v0}, Ls9/d$b;-><init>(ILjava/util/List;)V

    goto :goto_3

    :goto_5
    invoke-virtual/range {p2 .. p2}, LBc/a$a;->d()LV7/b;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, LNe/a;->a(LV7/b;)I

    move-result v0

    new-instance v2, Ls9/d$b;

    invoke-direct {v2, v0}, Ls9/d$b;-><init>(I)V

    move-object v14, v2

    goto :goto_6

    :cond_6
    move-object v14, v1

    :goto_6
    invoke-virtual/range {p2 .. p2}, LBc/a$a;->a()LV7/a;

    move-result-object v0

    if-eqz v0, :cond_8

    const/4 v2, 0x2

    invoke-static {v0, v4, v1, v2, v1}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_8

    :cond_7
    :goto_7
    move-object v15, v0

    goto :goto_9

    :cond_8
    :goto_8
    new-instance v0, Ls9/d$b;

    const v2, 0x7f110279

    invoke-direct {v0, v2}, Ls9/d$b;-><init>(I)V

    goto :goto_7

    :goto_9
    invoke-virtual/range {p2 .. p2}, LBc/a$a;->a()LV7/a;

    move-result-object v0

    if-nez v0, :cond_9

    move/from16 v16, v4

    goto :goto_a

    :cond_9
    move/from16 v16, v3

    :goto_a
    invoke-virtual/range {p2 .. p2}, LBc/a$a;->a()LV7/a;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, LW7/f;->h()LW7/f$a;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-static {v0}, LNe/f;->b(LW7/f$a;)LW7/e;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-static {v0, v3}, LNe/e;->d(LW7/e;Z)Ls9/d;

    move-result-object v1

    :cond_a
    move-object/from16 v17, v1

    new-instance v0, LTe/B0;

    const/4 v10, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/16 v18, 0x20

    const/16 v19, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v19}, LTe/B0;-><init>(Ljava/lang/String;LTe/N;Ls9/a;Ls9/d;ZLDe/a;Ls9/d;Ls9/d;ZLs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/h;->f:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/h;->e:Lgg/i;

    return-object v0
.end method
