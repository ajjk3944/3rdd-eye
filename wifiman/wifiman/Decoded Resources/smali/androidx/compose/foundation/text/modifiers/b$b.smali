.class final Landroidx/compose/foundation/text/modifiers/b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/modifiers/b;->q(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/text/modifiers/b;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/modifiers/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b$b;->a:Landroidx/compose/foundation/text/modifiers/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/Boolean;
    .locals 37

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/text/modifiers/b$b;->a:Landroidx/compose/foundation/text/modifiers/b;

    invoke-static {v1}, Landroidx/compose/foundation/text/modifiers/b;->D2(Landroidx/compose/foundation/text/modifiers/b;)LL/e;

    move-result-object v1

    invoke-virtual {v1}, LL/e;->b()LL0/M;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v1, LL0/L;

    invoke-virtual {v2}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->j()LL0/d;

    move-result-object v4

    iget-object v3, v0, Landroidx/compose/foundation/text/modifiers/b$b;->a:Landroidx/compose/foundation/text/modifiers/b;

    invoke-static {v3}, Landroidx/compose/foundation/text/modifiers/b;->G2(Landroidx/compose/foundation/text/modifiers/b;)LL0/U;

    move-result-object v5

    iget-object v3, v0, Landroidx/compose/foundation/text/modifiers/b$b;->a:Landroidx/compose/foundation/text/modifiers/b;

    invoke-static {v3}, Landroidx/compose/foundation/text/modifiers/b;->F2(Landroidx/compose/foundation/text/modifiers/b;)Lm0/y0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3}, Lm0/y0;->a()J

    move-result-wide v6

    goto :goto_0

    :cond_0
    sget-object v3, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v3}, Lm0/v0$a;->e()J

    move-result-wide v6

    :goto_0
    const v35, 0xfffffe

    const/16 v36, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-static/range {v5 .. v36}, LL0/U;->L(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LW0/h;IILL0/B;LW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v5

    invoke-virtual {v2}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->g()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v2}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->e()I

    move-result v7

    invoke-virtual {v2}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->h()Z

    move-result v8

    invoke-virtual {v2}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->f()I

    move-result v9

    invoke-virtual {v2}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->b()LY0/d;

    move-result-object v10

    invoke-virtual {v2}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->d()LY0/t;

    move-result-object v11

    invoke-virtual {v2}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->c()LQ0/k$b;

    move-result-object v12

    invoke-virtual {v2}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->a()J

    move-result-wide v13

    const/4 v15, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v15}, LL0/L;-><init>(LL0/d;LL0/U;Ljava/util/List;IZILY0/d;LY0/t;LQ0/k$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, LL0/M;->b(LL0/M;LL0/L;JILjava/lang/Object;)LL0/M;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/modifiers/b$b;->a(Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
