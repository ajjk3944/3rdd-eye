.class final Ln8/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/h;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/h;


# direct methods
.method constructor <init>(Ln8/h;)V
    .locals 0

    iput-object p1, p0, Ln8/h$b;->a:Ln8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/a$b;LBc/a$b;)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string/jumbo v2, "sim0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "sim1"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    iget-object v11, v2, Ln8/h$b;->a:Ln8/h;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v12

    instance-of v3, v0, LBc/a$b$a$b;

    const/4 v13, 0x0

    if-eqz v3, :cond_0

    check-cast v0, LBc/a$b$a$b;

    goto :goto_0

    :cond_0
    move-object v0, v13

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LBc/a$b$a$b;->b()LV7/a;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v13

    :goto_1
    instance-of v3, v1, LBc/a$b$a$b;

    if-eqz v3, :cond_2

    check-cast v1, LBc/a$b$a$b;

    goto :goto_2

    :cond_2
    move-object v1, v13

    :goto_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, LBc/a$b$a$b;->b()LV7/a;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v13

    :goto_3
    const/4 v14, 0x2

    const/4 v15, 0x1

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    new-instance v5, Ls9/d$b;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const v10, 0x7f11027b

    invoke-direct {v5, v10, v3}, Ls9/d$b;-><init>(ILjava/util/List;)V

    invoke-static {v0, v15, v13, v14, v13}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v7

    const/16 v9, 0x14

    const/4 v0, 0x0

    const-string v4, "0"

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, v11

    move v13, v10

    move-object v10, v0

    invoke-static/range {v3 .. v10}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v5, Ls9/d$b;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v5, v13, v0}, Ls9/d$b;-><init>(ILjava/util/List;)V

    const/4 v0, 0x0

    invoke-static {v1, v15, v0, v14, v0}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v7

    const/4 v10, 0x0

    const-string v4, "1"

    invoke-static/range {v3 .. v10}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    if-nez v0, :cond_5

    move-object v0, v1

    :cond_5
    if-eqz v0, :cond_6

    new-instance v5, Ls9/d$b;

    const v1, 0x7f110274

    invoke-direct {v5, v1}, Ls9/d$b;-><init>(I)V

    const/4 v1, 0x0

    invoke-static {v0, v15, v1, v14, v1}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v7

    const/16 v9, 0x14

    const/4 v10, 0x0

    const-string v4, "0"

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, v11

    invoke-static/range {v3 .. v10}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_4
    invoke-static {v12}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/a$b;

    check-cast p2, LBc/a$b;

    invoke-virtual {p0, p1, p2}, Ln8/h$b;->a(LBc/a$b;LBc/a$b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
