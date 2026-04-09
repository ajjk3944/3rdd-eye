.class final Ly8/i$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/i;-><init>(Ly8/a$b;Ly8/r;Ljd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/i;


# direct methods
.method constructor <init>(Ly8/i;)V
    .locals 0

    iput-object p1, p0, Ly8/i$f;->a:Ly8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final b(Ljava/util/List;Ljava/util/List;LTe/N;)Ljava/util/List;
    .locals 1

    new-instance v0, LTe/H$a;

    invoke-direct {v0, p2, p1}, LTe/H$a;-><init>(LTe/N;Ljava/util/List;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final c(Ljava/util/List;Lkotlin/jvm/internal/N;Ly8/i;JJ)V
    .locals 2

    new-instance v0, LTe/K;

    iget-object v1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {p2, p3, p4, p5, p6}, Ly8/f;->h(JJ)F

    move-result p2

    invoke-direct {v0, v1, p2}, LTe/K;-><init>(FF)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    iput-object p0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ly8/i$b;Ljava/util/List;)LTe/J;
    .locals 44

    move-object/from16 v0, p0

    const-string v1, "<destruct>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "markers"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ly8/i$b;->a()Ldd/i;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ly8/i$b;->b()Ldd/i;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Ly8/i$b;->c()Ldd/i;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Ly8/i$b;->d()Ldd/i;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Ly8/i$b;->e()Ljava/util/List;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Lkotlin/jvm/internal/N;

    invoke-direct {v13}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ldd/i;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ldd/i;->h()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ldd/i;->h()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v6}, Ldd/i;->h()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    new-instance v9, Lkotlin/jvm/internal/N;

    invoke-direct {v9}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v8, Lkotlin/jvm/internal/N;

    invoke-direct {v8}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v7, Lkotlin/jvm/internal/N;

    invoke-direct {v7}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    move-object/from16 p1, v3

    new-instance v3, Lkotlin/jvm/internal/N;

    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    move-object/from16 p2, v10

    new-instance v10, Lkotlin/jvm/internal/N;

    invoke-direct {v10}, Lkotlin/jvm/internal/N;-><init>()V

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v19, v12

    const-wide/16 v11, 0x258

    invoke-static {v10, v11, v12}, Lsh/m;->t(IJ)Lsh/l;

    move-result-object v11

    iget-object v12, v0, Ly8/i$f;->a:Ly8/i;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    move-object/from16 v25, v13

    const/4 v0, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    :goto_2
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v34

    if-eqz v34, :cond_40

    move-object/from16 v34, v21

    check-cast v34, LZg/S;

    invoke-virtual/range {v34 .. v34}, LZg/S;->d()J

    move-result-wide v34

    const-wide/16 v36, 0x7530

    sub-long v36, v14, v36

    const-wide/16 v38, 0x32

    mul-long v34, v34, v38

    move-wide/from16 v38, v14

    add-long v14, v36, v34

    :goto_3
    if-eqz v23, :cond_2

    if-eqz v24, :cond_2

    move-object/from16 v34, v24

    check-cast v34, LWc/c;

    invoke-virtual/range {v34 .. v34}, LWc/c;->c()J

    move-result-wide v34

    cmp-long v34, v34, v14

    if-gez v34, :cond_5

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v34

    if-eqz v34, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v43, v24

    move-object/from16 v24, v23

    move-object/from16 v23, v43

    goto :goto_3

    :cond_3
    check-cast v24, LWc/c;

    if-nez v24, :cond_4

    move-object/from16 v24, v23

    check-cast v24, LWc/c;

    :cond_4
    move-object/from16 v23, v24

    const/16 v24, 0x0

    :cond_5
    :goto_4
    if-eqz v26, :cond_6

    if-eqz v27, :cond_6

    move-object/from16 v34, v27

    check-cast v34, LWc/c;

    invoke-virtual/range {v34 .. v34}, LWc/c;->c()J

    move-result-wide v34

    cmp-long v34, v34, v14

    if-gez v34, :cond_9

    :cond_6
    if-eqz v4, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v34

    if-eqz v34, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    move-object/from16 v43, v27

    move-object/from16 v27, v26

    move-object/from16 v26, v43

    goto :goto_4

    :cond_7
    check-cast v27, LWc/c;

    if-nez v27, :cond_8

    move-object/from16 v27, v26

    check-cast v27, LWc/c;

    :cond_8
    move-object/from16 v26, v27

    const/16 v27, 0x0

    :cond_9
    :goto_5
    if-eqz v28, :cond_a

    if-eqz v29, :cond_a

    move-object/from16 v34, v29

    check-cast v34, LWc/c;

    invoke-virtual/range {v34 .. v34}, LWc/c;->c()J

    move-result-wide v34

    cmp-long v34, v34, v14

    if-gez v34, :cond_d

    :cond_a
    if-eqz v5, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v34

    if-eqz v34, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v28

    move-object/from16 v43, v29

    move-object/from16 v29, v28

    move-object/from16 v28, v43

    goto :goto_5

    :cond_b
    check-cast v29, LWc/c;

    if-nez v29, :cond_c

    move-object/from16 v29, v28

    check-cast v29, LWc/c;

    :cond_c
    move-object/from16 v28, v29

    const/16 v29, 0x0

    :cond_d
    :goto_6
    if-eqz v30, :cond_e

    if-eqz v31, :cond_e

    move-object/from16 v34, v31

    check-cast v34, LWc/c;

    invoke-virtual/range {v34 .. v34}, LWc/c;->c()J

    move-result-wide v34

    cmp-long v34, v34, v14

    if-gez v34, :cond_11

    :cond_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v34

    if-eqz v34, :cond_f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v30

    move-object/from16 v43, v31

    move-object/from16 v31, v30

    move-object/from16 v30, v43

    goto :goto_6

    :cond_f
    check-cast v31, LWc/c;

    if-nez v31, :cond_10

    move-object/from16 v31, v30

    check-cast v31, LWc/c;

    :cond_10
    move-object/from16 v30, v31

    const/16 v31, 0x0

    :cond_11
    :goto_7
    if-eqz v32, :cond_12

    if-eqz v33, :cond_12

    move-object/from16 v34, v33

    check-cast v34, LWc/c;

    invoke-virtual/range {v34 .. v34}, LWc/c;->c()J

    move-result-wide v34

    cmp-long v34, v34, v14

    if-gez v34, :cond_15

    :cond_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v34

    if-eqz v34, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v32

    move-object/from16 v43, v33

    move-object/from16 v33, v32

    move-object/from16 v32, v43

    goto :goto_7

    :cond_13
    check-cast v33, LWc/c;

    if-nez v33, :cond_14

    move-object/from16 v33, v32

    check-cast v33, LWc/c;

    :cond_14
    move-object/from16 v32, v33

    const/16 v33, 0x0

    :cond_15
    move-object/from16 v34, v23

    check-cast v34, LWc/c;

    if-nez v34, :cond_16

    move-object/from16 v34, v24

    check-cast v34, LWc/c;

    :cond_16
    const/16 v35, 0x1

    if-eqz v34, :cond_19

    invoke-virtual/range {v34 .. v34}, LWc/c;->c()J

    move-result-wide v36

    cmp-long v36, v36, v14

    if-gez v36, :cond_17

    move/from16 v36, v35

    goto :goto_8

    :cond_17
    const/16 v36, 0x0

    :goto_8
    if-eqz v36, :cond_18

    goto :goto_9

    :cond_18
    const/16 v34, 0x0

    :goto_9
    if-eqz v34, :cond_19

    invoke-virtual/range {v34 .. v34}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v34

    check-cast v34, Lb8/b;

    move-object/from16 v43, v34

    move-object/from16 v34, v1

    move-object/from16 v1, v43

    goto :goto_a

    :cond_19
    move-object/from16 v34, v1

    const/4 v1, 0x0

    :goto_a
    iput-object v1, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object/from16 v1, v26

    check-cast v1, LWc/c;

    if-nez v1, :cond_1a

    move-object/from16 v1, v27

    check-cast v1, LWc/c;

    :cond_1a
    if-eqz v1, :cond_1d

    invoke-virtual {v1}, LWc/c;->c()J

    move-result-wide v36

    cmp-long v36, v36, v14

    if-gez v36, :cond_1b

    move/from16 v36, v35

    goto :goto_b

    :cond_1b
    const/16 v36, 0x0

    :goto_b
    if-eqz v36, :cond_1c

    goto :goto_c

    :cond_1c
    const/4 v1, 0x0

    :goto_c
    if-eqz v1, :cond_1d

    invoke-virtual {v1}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb8/b;

    goto :goto_d

    :cond_1d
    const/4 v1, 0x0

    :goto_d
    iput-object v1, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object/from16 v1, v28

    check-cast v1, LWc/c;

    if-nez v1, :cond_1e

    move-object/from16 v1, v29

    check-cast v1, LWc/c;

    :cond_1e
    if-eqz v1, :cond_21

    invoke-virtual {v1}, LWc/c;->c()J

    move-result-wide v36

    cmp-long v36, v36, v14

    if-gez v36, :cond_1f

    move/from16 v36, v35

    goto :goto_e

    :cond_1f
    const/16 v36, 0x0

    :goto_e
    if-eqz v36, :cond_20

    goto :goto_f

    :cond_20
    const/4 v1, 0x0

    :goto_f
    if-eqz v1, :cond_21

    invoke-virtual {v1}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb8/b;

    goto :goto_10

    :cond_21
    const/4 v1, 0x0

    :goto_10
    iput-object v1, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object/from16 v1, v30

    check-cast v1, LWc/c;

    if-nez v1, :cond_22

    move-object/from16 v1, v31

    check-cast v1, LWc/c;

    :cond_22
    if-eqz v1, :cond_23

    invoke-virtual {v1}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb8/b;

    goto :goto_11

    :cond_23
    const/4 v1, 0x0

    :goto_11
    move-object/from16 v36, v32

    check-cast v36, LWc/c;

    if-nez v36, :cond_24

    move-object/from16 v36, v33

    check-cast v36, LWc/c;

    :cond_24
    if-eqz v36, :cond_27

    invoke-virtual/range {v36 .. v36}, LWc/c;->c()J

    move-result-wide v40

    cmp-long v37, v40, v14

    if-gez v37, :cond_25

    move/from16 v37, v35

    goto :goto_12

    :cond_25
    const/16 v37, 0x0

    :goto_12
    if-eqz v37, :cond_26

    goto :goto_13

    :cond_26
    const/16 v36, 0x0

    :goto_13
    if-eqz v36, :cond_27

    invoke-virtual/range {v36 .. v36}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v36

    check-cast v36, Lb8/d;

    move-object/from16 v43, v36

    move-object/from16 v36, v2

    move-object/from16 v2, v43

    goto :goto_14

    :cond_27
    move-object/from16 v36, v2

    const/4 v2, 0x0

    :goto_14
    iput-object v2, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v2, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Lb8/b;

    invoke-static {v12, v2, v13}, Ly8/i;->i(Ly8/i;Lb8/b;Lb8/b;)Lb8/b;

    move-result-object v2

    iget-object v13, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v13, Lb8/b;

    invoke-static {v12, v13, v2}, Ly8/i;->i(Ly8/i;Lb8/b;Lb8/b;)Lb8/b;

    move-result-object v2

    iget-object v13, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v13, Lb8/b;

    invoke-static {v12, v13, v2}, Ly8/i;->i(Ly8/i;Lb8/b;Lb8/b;)Lb8/b;

    move-result-object v2

    iget-object v13, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v13, :cond_29

    if-nez v11, :cond_28

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :cond_28
    new-instance v13, LTe/G;

    move-object/from16 v37, v4

    move-object/from16 v40, v5

    move-wide/from16 v4, v38

    move-object/from16 v38, v2

    invoke-virtual {v12, v4, v5, v14, v15}, Ly8/f;->h(JJ)F

    move-result v2

    move-object/from16 v39, v6

    iget-object v6, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v6, Lb8/b;

    invoke-virtual {v6}, Lb8/b;->b()I

    move-result v6

    int-to-float v6, v6

    invoke-direct {v13, v2, v6}, LTe/G;-><init>(FF)V

    invoke-interface {v11, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v11

    move-object/from16 v6, v19

    goto :goto_16

    :cond_29
    move-object/from16 v37, v4

    move-object/from16 v40, v5

    move-wide/from16 v4, v38

    move-object/from16 v38, v2

    move-object/from16 v39, v6

    if-eqz v11, :cond_2a

    invoke-static {}, Ly8/i;->l()LTe/N;

    move-result-object v2

    move-object/from16 v6, v19

    invoke-static {v6, v11, v2}, Ly8/i$f;->b(Ljava/util/List;Ljava/util/List;LTe/N;)Ljava/util/List;

    move-result-object v11

    goto :goto_15

    :cond_2a
    move-object/from16 v6, v19

    :goto_15
    sget-object v2, LYg/J;->a:LYg/J;

    move-object v2, v11

    :goto_16
    iget-object v11, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v11, :cond_2c

    if-nez v10, :cond_2b

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    :cond_2b
    new-instance v11, LTe/G;

    invoke-virtual {v12, v4, v5, v14, v15}, Ly8/f;->h(JJ)F

    move-result v13

    move-object/from16 v19, v2

    iget-object v2, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v2, Lb8/b;

    invoke-virtual {v2}, Lb8/b;->b()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v11, v13, v2}, LTe/G;-><init>(FF)V

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_17
    move-object v2, v10

    goto :goto_18

    :cond_2c
    move-object/from16 v19, v2

    if-eqz v10, :cond_2d

    invoke-static {}, Ly8/i;->k()LTe/N;

    move-result-object v2

    invoke-static {v6, v10, v2}, Ly8/i$f;->b(Ljava/util/List;Ljava/util/List;LTe/N;)Ljava/util/List;

    move-result-object v10

    :cond_2d
    sget-object v2, LYg/J;->a:LYg/J;

    goto :goto_17

    :goto_18
    iget-object v10, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v10, :cond_2f

    if-nez v0, :cond_2e

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_2e
    new-instance v10, LTe/G;

    invoke-virtual {v12, v4, v5, v14, v15}, Ly8/f;->h(JJ)F

    move-result v11

    iget-object v13, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v13, Lb8/b;

    invoke-virtual {v13}, Lb8/b;->b()I

    move-result v13

    int-to-float v13, v13

    invoke-direct {v10, v11, v13}, LTe/G;-><init>(FF)V

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_2f
    if-eqz v0, :cond_30

    invoke-static {}, Ly8/i;->j()LTe/N;

    move-result-object v10

    invoke-static {v6, v0, v10}, Ly8/i$f;->b(Ljava/util/List;Ljava/util/List;LTe/N;)Ljava/util/List;

    move-result-object v0

    :cond_30
    sget-object v10, LYg/J;->a:LYg/J;

    :goto_19
    if-eqz v17, :cond_31

    if-eqz v1, :cond_32

    :cond_31
    iget-object v1, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    instance-of v1, v1, Lb8/d$a;

    if-eqz v1, :cond_33

    :cond_32
    move-object/from16 v1, v25

    goto :goto_1a

    :cond_33
    move-object/from16 v1, v25

    const/16 v35, 0x0

    :goto_1a
    iget-object v10, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v10, :cond_35

    if-eqz v35, :cond_35

    invoke-virtual {v12, v4, v5, v14, v15}, Ly8/f;->h(JJ)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    iput-object v10, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_34
    move-object/from16 v42, p2

    move-object/from16 v41, v1

    move-object/from16 p2, v2

    move-object/from16 v22, v3

    move-object/from16 v25, v7

    move-object/from16 v35, v8

    move-object v3, v9

    move-object v2, v12

    move-object/from16 v1, v18

    const/16 v18, 0x0

    goto :goto_1b

    :cond_35
    if-eqz v10, :cond_34

    if-nez v35, :cond_34

    move-object/from16 v25, v7

    move-object/from16 v7, v16

    move-object/from16 v35, v8

    move-object v8, v1

    move-object v13, v9

    move-object v9, v12

    move-object/from16 v42, p2

    move-object/from16 v41, v1

    move-object/from16 v1, v18

    const/16 v18, 0x0

    move-wide v10, v4

    move-object/from16 p2, v2

    move-object/from16 v22, v3

    move-object v2, v12

    move-object v3, v13

    move-wide v12, v14

    invoke-static/range {v7 .. v13}, Ly8/i$f;->c(Ljava/util/List;Lkotlin/jvm/internal/N;Ly8/i;JJ)V

    :goto_1b
    iget-object v7, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v7, :cond_37

    invoke-interface/range {p1 .. p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_36

    goto :goto_1d

    :cond_36
    :goto_1c
    move-object/from16 v14, v42

    const/4 v7, 0x0

    goto/16 :goto_20

    :cond_37
    :goto_1d
    iget-object v7, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v7, :cond_3a

    invoke-interface/range {p1 .. p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_38

    move-object/from16 v11, p1

    goto :goto_1e

    :cond_38
    const/4 v11, 0x0

    :goto_1e
    if-eqz v11, :cond_36

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly8/a;

    if-nez v7, :cond_39

    goto :goto_1c

    :cond_39
    iput-object v7, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_3a
    if-eqz v23, :cond_36

    iget-object v7, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v7, :cond_3b

    goto :goto_1c

    :cond_3b
    iget-object v7, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v7, Ly8/a;

    invoke-virtual {v7}, Ly8/a;->a()J

    move-result-wide v7

    move-object/from16 v9, v23

    check-cast v9, LWc/c;

    invoke-virtual {v9}, LWc/c;->c()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-gez v7, :cond_3c

    const/4 v7, 0x0

    iput-object v7, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_1b

    :cond_3c
    if-eqz v24, :cond_3d

    iget-object v7, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v7, Ly8/a;

    invoke-virtual {v7}, Ly8/a;->a()J

    move-result-wide v7

    move-object/from16 v9, v24

    check-cast v9, LWc/c;

    invoke-virtual {v9}, LWc/c;->c()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-gtz v7, :cond_36

    :cond_3d
    if-eqz v24, :cond_3f

    move-object/from16 v7, v24

    check-cast v7, LWc/c;

    invoke-virtual {v7}, LWc/c;->c()J

    move-result-wide v7

    iget-object v9, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v9, Ly8/a;

    invoke-virtual {v9}, Ly8/a;->a()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-ltz v7, :cond_3e

    goto :goto_1f

    :cond_3e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Signal Mapper chart marker in illegal state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    :goto_1f
    iget-object v7, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v7, Ly8/a;

    iget-object v8, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v8, Lb8/b;

    invoke-virtual {v8}, Lb8/b;->b()I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v2, v4, v5, v7, v8}, Ly8/f;->f(JLy8/a;F)LTe/I;

    move-result-object v7

    move-object/from16 v14, v42

    invoke-interface {v14, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x0

    iput-object v7, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto/16 :goto_1b

    :goto_20
    move-object/from16 v10, p2

    move-object/from16 v18, v1

    move-object v12, v2

    move-object v9, v3

    move-object/from16 p2, v14

    move-object/from16 v11, v19

    move-object/from16 v3, v22

    move-object/from16 v7, v25

    move-object/from16 v1, v34

    move-object/from16 v8, v35

    move-object/from16 v2, v36

    move-object/from16 v13, v38

    move-object/from16 v25, v41

    move-wide v14, v4

    move-object/from16 v19, v6

    move-object/from16 v4, v37

    move-object/from16 v6, v39

    move-object/from16 v5, v40

    goto/16 :goto_2

    :cond_40
    move-wide v4, v14

    move-object/from16 v6, v19

    move-object/from16 v41, v25

    move-object/from16 v14, p2

    if-eqz v11, :cond_41

    invoke-static {}, Ly8/i;->l()LTe/N;

    move-result-object v1

    invoke-static {v6, v11, v1}, Ly8/i$f;->b(Ljava/util/List;Ljava/util/List;LTe/N;)Ljava/util/List;

    :cond_41
    if-eqz v10, :cond_42

    invoke-static {}, Ly8/i;->k()LTe/N;

    move-result-object v1

    invoke-static {v6, v10, v1}, Ly8/i$f;->b(Ljava/util/List;Ljava/util/List;LTe/N;)Ljava/util/List;

    :cond_42
    if-eqz v0, :cond_43

    invoke-static {}, Ly8/i;->j()LTe/N;

    move-result-object v1

    invoke-static {v6, v0, v1}, Ly8/i$f;->b(Ljava/util/List;Ljava/util/List;LTe/N;)Ljava/util/List;

    :cond_43
    move-object/from16 v0, v41

    iget-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v1, :cond_44

    move-object/from16 v1, p0

    iget-object v9, v1, Ly8/i$f;->a:Ly8/i;

    move-object/from16 v7, v16

    move-object v8, v0

    move-wide v10, v4

    move-object/from16 v20, v13

    move-wide v12, v4

    invoke-static/range {v7 .. v13}, Ly8/i$f;->c(Ljava/util/List;Lkotlin/jvm/internal/N;Ly8/i;JJ)V

    goto :goto_21

    :cond_44
    move-object/from16 v1, p0

    move-object/from16 v20, v13

    :goto_21
    new-instance v0, LTe/J;

    sget-object v8, Lgc/b;->LATENCY:Lgc/b;

    if-nez v20, :cond_45

    sget-object v2, LTe/M$a$b;->a:LTe/M$a$b;

    :goto_22
    move-object v10, v2

    goto :goto_23

    :cond_45
    invoke-virtual/range {v20 .. v20}, Lb8/b;->b()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x423c0000    # 47.0f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_46

    sget-object v2, LTe/M$a$f;->a:LTe/M$a$f;

    goto :goto_22

    :cond_46
    invoke-virtual/range {v20 .. v20}, Lb8/b;->b()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x42be0000    # 95.0f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_47

    sget-object v2, LTe/M$a$b;->a:LTe/M$a$b;

    goto :goto_22

    :cond_47
    invoke-virtual/range {v20 .. v20}, Lb8/b;->b()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x433e0000    # 190.0f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_48

    sget-object v2, LTe/M$a$d;->a:LTe/M$a$d;

    goto :goto_22

    :cond_48
    invoke-virtual/range {v20 .. v20}, Lb8/b;->b()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x43f00000    # 480.0f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_49

    sget-object v2, LTe/M$a$e;->a:LTe/M$a$e;

    goto :goto_22

    :cond_49
    invoke-virtual/range {v20 .. v20}, Lb8/b;->b()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x44750000    # 980.0f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_4a

    sget-object v2, LTe/M$a$a;->a:LTe/M$a$a;

    goto :goto_22

    :cond_4a
    sget-object v2, LTe/M$a$c;->a:LTe/M$a$c;

    goto :goto_22

    :goto_23
    iget-object v2, v1, Ly8/i$f;->a:Ly8/i;

    invoke-virtual {v2}, Ly8/f;->e()LTe/L;

    move-result-object v11

    move-object v7, v0

    move-object v9, v6

    move-object v12, v14

    move-object/from16 v13, v16

    invoke-direct/range {v7 .. v13}, LTe/J;-><init>(Lgc/b;Ljava/util/List;LTe/M;LTe/L;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly8/i$b;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Ly8/i$f;->a(Ly8/i$b;Ljava/util/List;)LTe/J;

    move-result-object p1

    return-object p1
.end method
