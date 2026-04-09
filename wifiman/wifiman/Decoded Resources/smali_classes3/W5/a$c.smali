.class public final LW5/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LW5/a$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JJJLjava/util/List;J)LW5/a;
    .locals 32

    move-object/from16 v0, p7

    move-wide/from16 v3, p1

    move-wide/from16 v15, p3

    move-wide/from16 v19, p5

    const-string/jumbo v1, "entityColors"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v31, LW5/a$a;

    move-object/from16 v1, v31

    const v29, 0x3fb7fd

    const/16 v30, 0x0

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v1 .. v30}, LW5/a$a;-><init>(Lo6/d;JJIFFFFFLandroid/graphics/Typeface;Landroid/graphics/Paint$Align;JFLo6/c;JFLo6/c;JFLo6/c;FLZ5/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v0, v12}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/v0;

    invoke-virtual {v3}, Lm0/v0;->u()J

    move-result-wide v3

    new-instance v5, Lo6/b;

    invoke-static {v3, v4}, Lm0/x0;->j(J)I

    move-result v14

    sget-object v3, Lo6/e;->a:Lo6/e;

    const/16 v4, 0x28

    invoke-virtual {v3, v4}, Lo6/e;->c(I)Lp6/d;

    move-result-object v16

    const/16 v21, 0x78

    const/16 v22, 0x0

    const/high16 v15, 0x41000000    # 8.0f

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v13, v5

    invoke-direct/range {v13 .. v22}, Lo6/b;-><init>(IFLo6/c;Lr6/b;Lw6/b;FIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v13, LW5/a$b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xfe

    const/4 v11, 0x0

    move-object v1, v13

    invoke-direct/range {v1 .. v11}, LW5/a$b;-><init>(Ljava/util/List;FFLc6/a;Lt6/b;Lt6/c;Lz6/c;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v12}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v11

    new-instance v2, Lh6/a$a;

    invoke-static {v11, v12}, Lm0/x0;->j(J)I

    move-result v15

    sget-object v14, Lr6/c;->a:Lr6/c;

    sget-object v16, Lm0/l0;->b:Lm0/l0$a;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v3, v11

    invoke-static/range {v3 .. v10}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v10

    const/16 v17, 0x0

    const/4 v5, 0x0

    move-wide v3, v11

    move-object v11, v10

    move-object/from16 v10, v17

    invoke-static/range {v3 .. v10}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    filled-new-array {v11, v3}, [Lm0/v0;

    move-result-object v3

    invoke-static {v3}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v4, 0xe

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object/from16 p1, v16

    move-object/from16 p2, v3

    move/from16 p3, v6

    move/from16 p4, v7

    move/from16 p5, v8

    move/from16 p6, v4

    move-object/from16 p7, v5

    invoke-static/range {p1 .. p7}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v3

    invoke-static {v14, v3}, LR5/b;->a(Lr6/c;Lm0/l0;)LR5/a;

    move-result-object v17

    const/16 v26, 0x7fa

    const/16 v27, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object v14, v2

    invoke-direct/range {v14 .. v27}, Lh6/a$a;-><init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v8, LW5/a$d;

    const/4 v0, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v8, v1, v0, v2, v3}, LW5/a$d;-><init>(Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, LW5/a$e;

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 p1, v9

    move/from16 p2, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v0

    move-object/from16 p6, v1

    invoke-direct/range {p1 .. p6}, LW5/a$e;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LW5/a;

    const/4 v12, 0x0

    move-object v5, v0

    move-object/from16 v6, v31

    move-object v7, v13

    move-wide/from16 v10, p8

    invoke-direct/range {v5 .. v12}, LW5/a;-><init>(LW5/a$a;LW5/a$b;LW5/a$d;LW5/a$e;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final b(LX5/a;)LW5/a;
    .locals 12

    const-string/jumbo v0, "defaultColors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LX5/a;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/x0;->d(J)J

    move-result-wide v3

    invoke-interface {p1}, LX5/a;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/x0;->d(J)J

    move-result-wide v5

    invoke-interface {p1}, LX5/a;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/x0;->d(J)J

    move-result-wide v7

    invoke-interface {p1}, LX5/a;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1}, LX5/a;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1}, LX5/a;->f()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/x0;->d(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LX5/a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/x0;->d(J)J

    move-result-wide v10

    move-object v2, p0

    invoke-virtual/range {v2 .. v11}, LW5/a$c;->a(JJJLjava/util/List;J)LW5/a;

    move-result-object p1

    return-object p1
.end method
