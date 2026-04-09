.class final LM/I$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/I;->a(LM/G;Lv/i;)Lmh/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/G;

.field final synthetic b:Lv/i;


# direct methods
.method constructor <init>(LM/G;Lv/i;)V
    .locals 0

    iput-object p1, p0, LM/I$a;->a:LM/G;

    iput-object p2, p0, LM/I$a;->b:Lv/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lv/g;)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LM/I$a;->a:LM/G;

    invoke-virtual {v1}, LM/G;->P()LR0/c0;

    move-result-object v1

    instance-of v1, v1, LR0/J;

    iget-object v2, v0, LM/I$a;->a:LM/G;

    invoke-virtual {v2}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v2

    iget-object v3, v0, LM/I$a;->b:Lv/i;

    sget-object v4, LF/Q;->Cut:LF/Q;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v2, :cond_0

    iget-object v7, v0, LM/I$a;->a:LM/G;

    invoke-virtual {v7}, LM/G;->D()Z

    move-result v7

    if-eqz v7, :cond_0

    if-nez v1, :cond_0

    move v11, v6

    goto :goto_0

    :cond_0
    move v11, v5

    :goto_0
    iget-object v7, v0, LM/I$a;->a:LM/G;

    new-instance v9, LF/l;

    invoke-direct {v9, v4}, LF/l;-><init>(LF/Q;)V

    new-instance v13, LM/I$a$a;

    invoke-direct {v13, v3, v7}, LM/I$a$a;-><init>(Lv/i;LM/G;)V

    const/16 v14, 0xa

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v15}, Lv/g;->d(Lv/g;Lmh/p;Landroidx/compose/ui/e;ZLmh/q;Lmh/a;ILjava/lang/Object;)V

    iget-object v3, v0, LM/I$a;->b:Lv/i;

    sget-object v4, LF/Q;->Copy:LF/Q;

    if-nez v2, :cond_1

    if-nez v1, :cond_1

    move v10, v6

    goto :goto_1

    :cond_1
    move v10, v5

    :goto_1
    iget-object v1, v0, LM/I$a;->a:LM/G;

    new-instance v8, LF/l;

    invoke-direct {v8, v4}, LF/l;-><init>(LF/Q;)V

    new-instance v12, LM/I$a$b;

    invoke-direct {v12, v3, v1}, LM/I$a$b;-><init>(Lv/i;LM/G;)V

    const/16 v13, 0xa

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v14}, Lv/g;->d(Lv/g;Lmh/p;Landroidx/compose/ui/e;ZLmh/q;Lmh/a;ILjava/lang/Object;)V

    iget-object v1, v0, LM/I$a;->b:Lv/i;

    sget-object v2, LF/Q;->Paste:LF/Q;

    iget-object v3, v0, LM/I$a;->a:LM/G;

    invoke-virtual {v3}, LM/G;->D()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v0, LM/I$a;->a:LM/G;

    invoke-virtual {v3}, LM/G;->y()Landroidx/compose/ui/platform/h0;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {v3}, Landroidx/compose/ui/platform/h0;->c()Z

    move-result v3

    if-ne v3, v6, :cond_2

    move v10, v6

    goto :goto_2

    :cond_2
    move v10, v5

    :goto_2
    iget-object v3, v0, LM/I$a;->a:LM/G;

    new-instance v8, LF/l;

    invoke-direct {v8, v2}, LF/l;-><init>(LF/Q;)V

    new-instance v12, LM/I$a$c;

    invoke-direct {v12, v1, v3}, LM/I$a$c;-><init>(Lv/i;LM/G;)V

    const/16 v13, 0xa

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v14}, Lv/g;->d(Lv/g;Lmh/p;Landroidx/compose/ui/e;ZLmh/q;Lmh/a;ILjava/lang/Object;)V

    iget-object v1, v0, LM/I$a;->b:Lv/i;

    sget-object v2, LF/Q;->SelectAll:LF/Q;

    iget-object v3, v0, LM/I$a;->a:LM/G;

    invoke-virtual {v3}, LM/G;->O()LR0/Q;

    move-result-object v3

    invoke-virtual {v3}, LR0/Q;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->j(J)I

    move-result v3

    iget-object v4, v0, LM/I$a;->a:LM/G;

    invoke-virtual {v4}, LM/G;->O()LR0/Q;

    move-result-object v4

    invoke-virtual {v4}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-eq v3, v4, :cond_3

    move v10, v6

    goto :goto_3

    :cond_3
    move v10, v5

    :goto_3
    iget-object v3, v0, LM/I$a;->a:LM/G;

    new-instance v8, LF/l;

    invoke-direct {v8, v2}, LF/l;-><init>(LF/Q;)V

    new-instance v12, LM/I$a$d;

    invoke-direct {v12, v1, v3}, LM/I$a$d;-><init>(Lv/i;LM/G;)V

    const/16 v13, 0xa

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v14}, Lv/g;->d(Lv/g;Lmh/p;Landroidx/compose/ui/e;ZLmh/q;Lmh/a;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv/g;

    invoke-virtual {p0, p1}, LM/I$a;->a(Lv/g;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
