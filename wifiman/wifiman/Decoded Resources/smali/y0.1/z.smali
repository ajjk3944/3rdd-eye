.class final Ly0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/z$a;
    }
.end annotation


# instance fields
.field private final a:Lo/t;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo/t;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/t;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Ly0/z;->a:Lo/t;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Ly0/z;->a:Lo/t;

    invoke-virtual {v0}, Lo/t;->b()V

    return-void
.end method

.method public final b(Ly0/A;Ly0/M;)Ly0/f;
    .locals 35

    move-object/from16 v0, p0

    new-instance v1, Lo/t;

    invoke-virtual/range {p1 .. p1}, Ly0/A;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Lo/t;-><init>(I)V

    invoke-virtual/range {p1 .. p1}, Ly0/A;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly0/B;

    iget-object v7, v0, Ly0/z;->a:Lo/t;

    invoke-virtual {v6}, Ly0/B;->d()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Lo/t;->e(J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly0/z$a;

    if-nez v7, :cond_0

    invoke-virtual {v6}, Ly0/B;->k()J

    move-result-wide v7

    invoke-virtual {v6}, Ly0/B;->f()J

    move-result-wide v9

    move-wide/from16 v22, v7

    move-wide/from16 v24, v9

    const/16 v26, 0x0

    move-object/from16 v7, p2

    goto :goto_1

    :cond_0
    invoke-virtual {v7}, Ly0/z$a;->c()J

    move-result-wide v8

    invoke-virtual {v7}, Ly0/z$a;->a()Z

    move-result v10

    invoke-virtual {v7}, Ly0/z$a;->b()J

    move-result-wide v11

    move-object/from16 v7, p2

    invoke-interface {v7, v11, v12}, Ly0/M;->r(J)J

    move-result-wide v11

    move-wide/from16 v22, v8

    move/from16 v26, v10

    move-wide/from16 v24, v11

    :goto_1
    invoke-virtual {v6}, Ly0/B;->d()J

    move-result-wide v8

    new-instance v10, Ly0/y;

    move-object v13, v10

    invoke-virtual {v6}, Ly0/B;->d()J

    move-result-wide v14

    invoke-virtual {v6}, Ly0/B;->k()J

    move-result-wide v16

    invoke-virtual {v6}, Ly0/B;->f()J

    move-result-wide v18

    invoke-virtual {v6}, Ly0/B;->b()Z

    move-result v20

    invoke-virtual {v6}, Ly0/B;->h()F

    move-result v21

    invoke-virtual {v6}, Ly0/B;->j()I

    move-result v28

    invoke-virtual {v6}, Ly0/B;->c()Ljava/util/List;

    move-result-object v29

    invoke-virtual {v6}, Ly0/B;->i()J

    move-result-wide v30

    invoke-virtual {v6}, Ly0/B;->e()J

    move-result-wide v32

    const/16 v34, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v13 .. v34}, Ly0/y;-><init>(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v8, v9, v10}, Lo/t;->k(JLjava/lang/Object;)V

    invoke-virtual {v6}, Ly0/B;->b()Z

    move-result v8

    if-eqz v8, :cond_1

    iget-object v8, v0, Ly0/z;->a:Lo/t;

    invoke-virtual {v6}, Ly0/B;->d()J

    move-result-wide v9

    new-instance v14, Ly0/z$a;

    invoke-virtual {v6}, Ly0/B;->k()J

    move-result-wide v12

    invoke-virtual {v6}, Ly0/B;->g()J

    move-result-wide v15

    invoke-virtual {v6}, Ly0/B;->b()Z

    move-result v17

    invoke-virtual {v6}, Ly0/B;->j()I

    move-result v6

    const/16 v18, 0x0

    move-object v11, v14

    move-object v4, v14

    move-wide v14, v15

    move/from16 v16, v17

    move/from16 v17, v6

    invoke-direct/range {v11 .. v18}, Ly0/z$a;-><init>(JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8, v9, v10, v4}, Lo/t;->k(JLjava/lang/Object;)V

    goto :goto_2

    :cond_1
    iget-object v4, v0, Ly0/z;->a:Lo/t;

    invoke-virtual {v6}, Ly0/B;->d()J

    move-result-wide v8

    invoke-virtual {v4, v8, v9}, Lo/t;->m(J)V

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_2
    new-instance v2, Ly0/f;

    move-object/from16 v3, p1

    invoke-direct {v2, v1, v3}, Ly0/f;-><init>(Lo/t;Ly0/A;)V

    return-object v2
.end method
