.class public final Ly8/q;
.super Ly8/f;
.source "SourceFile"

# interfaces
.implements Ly8/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/q$a;
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

.method public constructor <init>(Lje/C;Ly8/a$b;Ljd/b;LCc/n;)V
    .locals 3

    const-string/jumbo v0, "wifiConnectionStateTimelapseService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "markerManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "topologyService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifimanDeviceManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly8/f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1}, Lje/C;->b()Lgg/i;

    move-result-object v0

    sget-object v1, Ly8/q$b;->a:Ly8/q$b;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "distinctUntilChanged(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ly8/q;->d:Lgg/i;

    invoke-interface {p1}, Lje/C;->b()Lgg/i;

    move-result-object v1

    invoke-virtual {p0, v1}, Ly8/f;->g(Lgg/i;)Lgg/i;

    move-result-object v1

    invoke-interface {p2}, Ly8/a$b;->a()Lgg/i;

    move-result-object p2

    new-instance v2, Ly8/q$c;

    invoke-direct {v2, p0}, Ly8/q$c;-><init>(Ly8/q;)V

    invoke-static {v1, p2, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p2

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string/jumbo v2, "refCount(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ly8/q;->e:Lgg/i;

    invoke-interface {p1}, Lje/C;->b()Lgg/i;

    move-result-object p1

    invoke-interface {p3}, Ljd/b;->c()Lgg/i;

    move-result-object p2

    invoke-interface {p4}, LCc/n;->a()Lgg/i;

    move-result-object p3

    new-instance p4, Ly8/q$d;

    invoke-direct {p4, p0}, Ly8/q$d;-><init>(Ly8/q;)V

    invoke-static {p1, p2, v0, p3, p4}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/q;->f:Lgg/i;

    return-void
.end method

.method public static final synthetic i(Ly8/q;LS8/c;Ljava/util/List;Ljava/util/List;)LYg/s;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ly8/q;->l(LS8/c;Ljava/util/List;Ljava/util/List;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Ly8/q;Lje/r;Ljava/util/Set;LCc/a;)LTe/F0;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ly8/q;->p(Lje/r;Ljava/util/Set;LCc/a;)LTe/F0;

    move-result-object p0

    return-object p0
.end method

.method private final k(Lje/q;)LTe/E0;
    .locals 5

    invoke-virtual {p1}, Lje/q;->i()Lke/a;

    move-result-object v0

    instance-of v0, v0, Lke/a$a$a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lje/q;->c()LS8/c;

    move-result-object v0

    invoke-virtual {p1}, Lje/q;->c()LS8/c;

    move-result-object v2

    invoke-direct {p0, v2}, Ly8/q;->o(LS8/c;)LTe/N;

    move-result-object v2

    invoke-virtual {p1}, Lje/q;->i()Lke/a;

    move-result-object v3

    instance-of v4, v3, Lke/a$a$a$b;

    if-eqz v4, :cond_1

    sget-object v1, LAf/p$c;->a:LAf/p$c;

    goto :goto_0

    :cond_1
    instance-of v4, v3, Lke/a$a$a$a;

    if-eqz v4, :cond_2

    sget-object v1, LAf/p$a;->a:LAf/p$a;

    goto :goto_0

    :cond_2
    instance-of v4, v3, Lke/a$a$b;

    if-nez v4, :cond_4

    instance-of v3, v3, Lke/a$b;

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    invoke-virtual {p1}, Lje/q;->h()LS8/l;

    move-result-object p1

    new-instance v3, LTe/E0;

    invoke-direct {v3, v2, v0, v1, p1}, LTe/E0;-><init>(LTe/N;LS8/c;LDe/g;LS8/l;)V

    return-object v3
.end method

.method private final l(LS8/c;Ljava/util/List;Ljava/util/List;)LYg/s;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/N;

    invoke-direct {v5}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/N;

    invoke-direct {v9}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v10, Lkotlin/jvm/internal/N;

    invoke-direct {v10}, Lkotlin/jvm/internal/N;-><init>()V

    const/4 v11, 0x0

    const-wide/16 v12, 0x258

    invoke-static {v11, v12, v13}, Lsh/m;->t(IJ)Lsh/l;

    move-result-object v12

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_1a

    move-object/from16 v17, v12

    check-cast v17, LZg/S;

    invoke-virtual/range {v17 .. v17}, LZg/S;->d()J

    move-result-wide v17

    const-wide/16 v19, 0x7530

    sub-long v19, v6, v19

    const-wide/16 v21, 0x32

    mul-long v17, v17, v21

    move-object/from16 p3, v12

    add-long v11, v19, v17

    :goto_1
    if-eqz v14, :cond_0

    if-eqz v15, :cond_0

    move-object/from16 v17, v15

    check-cast v17, LWc/c;

    invoke-virtual/range {v17 .. v17}, LWc/c;->c()J

    move-result-wide v17

    cmp-long v17, v17, v11

    if-gez v17, :cond_3

    :cond_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v23, v15

    move-object v15, v14

    move-object/from16 v14, v23

    goto :goto_1

    :cond_1
    check-cast v15, LWc/c;

    if-nez v15, :cond_2

    move-object v15, v14

    check-cast v15, LWc/c;

    :cond_2
    move-object v14, v15

    const/4 v15, 0x0

    :cond_3
    move-object/from16 v17, v14

    check-cast v17, LWc/c;

    if-nez v17, :cond_4

    move-object/from16 v17, v15

    check-cast v17, LWc/c;

    :cond_4
    if-eqz v17, :cond_a

    invoke-virtual/range {v17 .. v17}, LWc/c;->c()J

    move-result-wide v18

    cmp-long v18, v18, v11

    if-gez v18, :cond_5

    const/16 v18, 0x1

    goto :goto_2

    :cond_5
    const/16 v18, 0x0

    :goto_2
    if-eqz v18, :cond_6

    goto :goto_3

    :cond_6
    const/16 v17, 0x0

    :goto_3
    if-eqz v17, :cond_a

    invoke-virtual/range {v17 .. v17}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v13, v17

    check-cast v13, Lje/r;

    if-eqz v13, :cond_a

    move-object/from16 v17, v8

    instance-of v8, v13, Lje/r$b$a$b;

    if-eqz v8, :cond_7

    check-cast v13, Lje/r$b$a$b;

    invoke-virtual {v13}, Lje/r$b$a$b;->h()LS8/l;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-virtual {v13}, Lje/r$b$a$b;->b()LS8/c;

    move-result-object v13

    if-ne v13, v1, :cond_b

    goto :goto_5

    :cond_7
    instance-of v8, v13, Lje/r$b$a$a;

    if-eqz v8, :cond_8

    check-cast v13, Lje/r$b$a$a;

    invoke-virtual {v13, v1}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-virtual {v8}, Lje/q;->h()LS8/l;

    move-result-object v8

    goto :goto_5

    :cond_8
    instance-of v8, v13, Lje/r$a;

    if-nez v8, :cond_b

    instance-of v8, v13, Lje/r$b$b;

    if-eqz v8, :cond_9

    goto :goto_4

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_a
    move-object/from16 v17, v8

    :cond_b
    :goto_4
    const/4 v8, 0x0

    :goto_5
    iput-object v8, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v8, :cond_e

    if-eqz v16, :cond_c

    check-cast v16, LS8/l;

    invoke-virtual/range {v16 .. v16}, LS8/l;->h()LW7/f$a;

    move-result-object v8

    iget-object v13, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v13, LS8/l;

    invoke-virtual {v13}, LS8/l;->h()LW7/f$a;

    move-result-object v13

    if-eq v8, v13, :cond_c

    invoke-static {v2, v5, v0, v1}, Ly8/q;->m(Ljava/util/List;Lkotlin/jvm/internal/N;Ly8/q;LS8/c;)V

    :cond_c
    iget-object v8, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v8, :cond_d

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_d
    iget-object v8, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v8, Ljava/util/List;

    new-instance v13, LTe/G;

    invoke-virtual {v0, v6, v7, v11, v12}, Ly8/f;->h(JJ)F

    move-result v11

    iget-object v12, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v12, LS8/l;

    invoke-virtual {v12}, LS8/l;->b()I

    move-result v12

    int-to-float v12, v12

    invoke-direct {v13, v11, v12}, LTe/G;-><init>(FF)V

    invoke-interface {v8, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_e
    iget-object v8, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v8, :cond_f

    invoke-static {v2, v5, v0, v1}, Ly8/q;->m(Ljava/util/List;Lkotlin/jvm/internal/N;Ly8/q;LS8/c;)V

    :cond_f
    :goto_6
    iget-object v8, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :goto_7
    iget-object v11, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v11, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_10

    goto :goto_9

    :cond_10
    :goto_8
    const/4 v11, 0x0

    goto/16 :goto_c

    :cond_11
    :goto_9
    iget-object v11, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v11, :cond_14

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_12

    move-object v11, v3

    goto :goto_a

    :cond_12
    const/4 v11, 0x0

    :goto_a
    if-eqz v11, :cond_10

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly8/a;

    if-nez v11, :cond_13

    goto :goto_8

    :cond_13
    iput-object v11, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_14
    if-eqz v14, :cond_10

    iget-object v11, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v11, :cond_15

    goto :goto_8

    :cond_15
    iget-object v11, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v11, Ly8/a;

    invoke-virtual {v11}, Ly8/a;->a()J

    move-result-wide v11

    move-object v13, v14

    check-cast v13, LWc/c;

    invoke-virtual {v13}, LWc/c;->c()J

    move-result-wide v19

    cmp-long v11, v11, v19

    if-gez v11, :cond_16

    const/4 v11, 0x0

    iput-object v11, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_7

    :cond_16
    if-eqz v15, :cond_17

    iget-object v11, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v11, Ly8/a;

    invoke-virtual {v11}, Ly8/a;->a()J

    move-result-wide v11

    move-object v13, v15

    check-cast v13, LWc/c;

    invoke-virtual {v13}, LWc/c;->c()J

    move-result-wide v19

    cmp-long v11, v11, v19

    if-gtz v11, :cond_10

    :cond_17
    if-eqz v15, :cond_19

    move-object v11, v15

    check-cast v11, LWc/c;

    invoke-virtual {v11}, LWc/c;->c()J

    move-result-wide v11

    iget-object v13, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v13, Ly8/a;

    invoke-virtual {v13}, Ly8/a;->a()J

    move-result-wide v19

    cmp-long v11, v11, v19

    if-ltz v11, :cond_18

    goto :goto_b

    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "Signal Mapper chart marker in illegal state"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_19
    :goto_b
    iget-object v11, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v11, Ly8/a;

    iget-object v12, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v12, LS8/l;

    invoke-virtual {v12}, LS8/l;->b()I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v0, v6, v7, v11, v12}, Ly8/f;->f(JLy8/a;F)LTe/I;

    move-result-object v11

    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x0

    iput-object v11, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto/16 :goto_7

    :goto_c
    move-object/from16 v12, p3

    move-object/from16 v16, v8

    move-object/from16 v8, v17

    const/4 v11, 0x0

    goto/16 :goto_0

    :cond_1a
    iget-object v3, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v3, :cond_1b

    invoke-static {v2, v5, v0, v1}, Ly8/q;->m(Ljava/util/List;Lkotlin/jvm/internal/N;Ly8/q;LS8/c;)V

    :cond_1b
    invoke-static {v2, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    return-object v1
.end method

.method private static final m(Ljava/util/List;Lkotlin/jvm/internal/N;Ly8/q;LS8/c;)V
    .locals 1

    iget-object v0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/List;

    invoke-direct {p2, p3}, Ly8/q;->o(LS8/c;)LTe/N;

    move-result-object p2

    new-instance p3, LTe/H$a;

    invoke-direct {p3, p2, v0}, LTe/H$a;-><init>(LTe/N;Ljava/util/List;)V

    invoke-interface {p0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    iput-object p0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method

.method private final n(LS8/c;)LTe/E0;
    .locals 3

    invoke-direct {p0, p1}, Ly8/q;->o(LS8/c;)LTe/N;

    move-result-object v0

    new-instance v1, LTe/E0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2, v2}, LTe/E0;-><init>(LTe/N;LS8/c;LDe/g;LS8/l;)V

    return-object v1
.end method

.method private final o(LS8/c;)LTe/N;
    .locals 1

    sget-object v0, Ly8/q$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, LTe/N;->COMPARE_3:LTe/N;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LTe/N;->COMPARE_5:LTe/N;

    goto :goto_0

    :cond_2
    sget-object p1, LTe/N;->PRIMARY:LTe/N;

    :goto_0
    return-object p1
.end method

.method private final p(Lje/r;Ljava/util/Set;LCc/a;)LTe/F0;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    instance-of v4, v1, Lje/r$b$a;

    const v5, 0x7f1100bf

    const/4 v6, 0x0

    if-eqz v4, :cond_13

    sget-object v4, LS8/c;->GHZ_2_4:LS8/c;

    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-direct {v0, v4}, Ly8/q;->n(LS8/c;)LTe/E0;

    move-result-object v7

    goto :goto_0

    :cond_0
    move-object v7, v6

    :goto_0
    sget-object v8, LS8/c;->GHZ_5:LS8/c;

    invoke-interface {v2, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-direct {v0, v8}, Ly8/q;->n(LS8/c;)LTe/E0;

    move-result-object v9

    goto :goto_1

    :cond_1
    move-object v9, v6

    :goto_1
    sget-object v10, LS8/c;->GHZ_6:LS8/c;

    invoke-interface {v2, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {v0, v10}, Ly8/q;->n(LS8/c;)LTe/E0;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v6

    :goto_2
    move-object v11, v1

    check-cast v11, Lje/r$b$a;

    instance-of v12, v11, Lje/r$b$a$b;

    if-eqz v12, :cond_a

    move-object v8, v1

    check-cast v8, Lje/r$b$a$b;

    invoke-virtual {v8}, Lje/r$b$a$b;->b()LS8/c;

    move-result-object v10

    if-nez v10, :cond_3

    move-object v10, v4

    :cond_3
    invoke-virtual {v8}, Lje/r$b$a$b;->b()LS8/c;

    move-result-object v12

    if-nez v12, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v12

    :goto_3
    invoke-direct {v0, v4}, Ly8/q;->o(LS8/c;)LTe/N;

    move-result-object v4

    sget-object v12, LAf/p$a;->a:LAf/p$a;

    invoke-virtual {v8}, Lje/r$b$a$b;->h()LS8/l;

    move-result-object v13

    new-instance v14, LTe/E0;

    invoke-direct {v14, v4, v10, v12, v13}, LTe/E0;-><init>(LTe/N;LS8/c;LDe/g;LS8/l;)V

    invoke-virtual {v8}, Lje/r$b$a$b;->b()LS8/c;

    move-result-object v4

    const/4 v8, -0x1

    if-nez v4, :cond_5

    move v4, v8

    goto :goto_4

    :cond_5
    sget-object v10, Ly8/q$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v10, v4

    :goto_4
    if-eq v4, v8, :cond_9

    const/4 v8, 0x1

    if-eq v4, v8, :cond_8

    const/4 v8, 0x2

    if-eq v4, v8, :cond_7

    const/4 v2, 0x3

    if-ne v4, v2, :cond_6

    move-object/from16 v18, v7

    move-object/from16 v19, v9

    move-object/from16 v20, v14

    goto :goto_6

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_7
    move-object/from16 v20, v2

    move-object/from16 v18, v7

    move-object/from16 v19, v14

    goto :goto_6

    :cond_8
    move-object/from16 v20, v2

    move-object/from16 v19, v9

    move-object/from16 v18, v14

    goto :goto_6

    :cond_9
    move-object/from16 v20, v2

    :goto_5
    move-object/from16 v18, v7

    move-object/from16 v19, v9

    goto :goto_6

    :cond_a
    instance-of v12, v11, Lje/r$b$a$a;

    if-eqz v12, :cond_12

    move-object v12, v1

    check-cast v12, Lje/r$b$a$a;

    invoke-virtual {v12, v4}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-direct {v0, v4}, Ly8/q;->k(Lje/q;)LTe/E0;

    move-result-object v4

    if-eqz v4, :cond_b

    move-object v7, v4

    :cond_b
    invoke-virtual {v12, v8}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-direct {v0, v4}, Ly8/q;->k(Lje/q;)LTe/E0;

    move-result-object v4

    if-eqz v4, :cond_c

    move-object v9, v4

    :cond_c
    invoke-virtual {v12, v10}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-direct {v0, v4}, Ly8/q;->k(Lje/q;)LTe/E0;

    move-result-object v4

    if-eqz v4, :cond_9

    move-object/from16 v20, v4

    goto :goto_5

    :goto_6
    if-eqz v3, :cond_d

    invoke-virtual/range {p0 .. p0}, Ly8/f;->d()Lcom/ubnt/usurvey/product/m$c;

    move-result-object v2

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->c()Ls9/b;

    move-result-object v4

    invoke-static {v3, v2, v4}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object v2

    move-object v13, v2

    goto :goto_7

    :cond_d
    move-object v13, v6

    :goto_7
    if-eqz v3, :cond_e

    invoke-interface/range {p3 .. p3}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_e

    new-instance v3, Ls9/d$c;

    invoke-direct {v3, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v14, v3

    goto :goto_8

    :cond_e
    new-instance v2, Ls9/d$b;

    invoke-direct {v2, v5}, Ls9/d$b;-><init>(I)V

    move-object v14, v2

    :goto_8
    invoke-virtual {v11}, Lje/r$b$a;->i()Lke/c;

    move-result-object v2

    instance-of v15, v2, Lke/c$a;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v11}, Lje/r$b$a;->e()LS8/a;

    move-result-object v3

    sget-object v4, LS8/a;->BE:LS8/a;

    if-ne v3, v4, :cond_f

    sget-object v3, LAf/v$a;->a:LAf/v$a;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    instance-of v1, v1, Lje/r$b$a$a;

    if-eqz v1, :cond_10

    sget-object v1, LAf/w;->a:LAf/w;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_10
    sget-object v1, LYg/J;->a:LYg/J;

    invoke-static {v2}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v16

    invoke-virtual {v11}, Lje/r$b$a;->c()Lh9/a;

    move-result-object v1

    if-eqz v1, :cond_11

    new-instance v6, Ls9/d$c;

    invoke-virtual {v1}, Lh9/a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_11
    move-object/from16 v17, v6

    new-instance v1, LTe/F0;

    move-object v12, v1

    invoke-direct/range {v12 .. v20}, LTe/F0;-><init>(Ls9/a;Ls9/d;ZLCi/c;Ls9/d;LTe/E0;LTe/E0;LTe/E0;)V

    goto :goto_a

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_13
    instance-of v2, v1, Lje/r$b$b;

    if-nez v2, :cond_15

    instance-of v1, v1, Lje/r$a;

    if-eqz v1, :cond_14

    goto :goto_9

    :cond_14
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_15
    :goto_9
    new-instance v1, LTe/F0;

    if-eqz v3, :cond_16

    invoke-virtual/range {p0 .. p0}, Ly8/f;->d()Lcom/ubnt/usurvey/product/m$c;

    move-result-object v2

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->c()Ls9/b;

    move-result-object v4

    invoke-static {v3, v2, v4}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object v6

    :cond_16
    move-object v3, v6

    new-instance v4, Ls9/d$b;

    invoke-direct {v4, v5}, Ls9/d$b;-><init>(I)V

    const/16 v11, 0xec

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v12}, LTe/F0;-><init>(Ls9/a;Ls9/d;ZLCi/c;Ls9/d;LTe/E0;LTe/E0;LTe/E0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_a
    return-object v1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/q;->f:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/q;->e:Lgg/i;

    return-object v0
.end method
