.class final Ly8/o$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/o;-><init>(Ly8/a$b;LCd/f;Ljd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/o;


# direct methods
.method constructor <init>(Ly8/o;)V
    .locals 0

    iput-object p1, p0, Ly8/o$c;->a:Ly8/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;LCd/f$a;)Ll9/a;
    .locals 18

    move-object/from16 v0, p2

    const-string v1, "<destruct>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "speedtestState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd/a$b;

    instance-of v2, v0, LCd/f$a$a$b;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljd/a$b;->b()LCc/a;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object/from16 v4, p0

    iget-object v5, v4, Ly8/o$c;->a:Ly8/o;

    invoke-virtual {v5}, Ly8/f;->d()Lcom/ubnt/usurvey/product/m$c;

    move-result-object v5

    sget-object v6, LPe/a;->a:LPe/a;

    invoke-virtual {v6}, LPe/a;->o()Ls9/b;

    move-result-object v6

    invoke-static {v2, v5, v6}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object v2

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p0

    move-object v8, v3

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljd/a$b;->b()LCc/a;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v9, v5

    goto :goto_1

    :cond_1
    new-instance v2, Ls9/d$b;

    const v5, 0x7f1100cc

    invoke-direct {v2, v5}, Ls9/d$b;-><init>(I)V

    move-object v9, v2

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljd/a$b;->b()LCc/a;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1}, LCc/a;->l()Lh9/a;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Ls9/d$c;

    invoke-virtual {v1}, Lh9/a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v12, v2

    goto :goto_2

    :cond_2
    move-object v12, v3

    :goto_2
    check-cast v0, LCd/f$a$a$b;

    invoke-virtual {v0}, LCd/f$a$a$b;->a()LW7/a;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    invoke-static {v0, v1}, LL8/b;->a(LW7/a;I)Ls9/d;

    move-result-object v3

    :cond_3
    move-object v13, v3

    new-instance v3, LTe/B0;

    const-string/jumbo v6, "currentlyConnected"

    const/4 v7, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x120

    const/16 v17, 0x0

    move-object v5, v3

    invoke-direct/range {v5 .. v17}, LTe/B0;-><init>(Ljava/lang/String;LTe/N;Ls9/a;Ls9/d;ZLDe/a;Ls9/d;Ls9/d;ZLs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_4
    move-object/from16 v4, p0

    instance-of v1, v0, LCd/f$a$a$a;

    if-nez v1, :cond_6

    instance-of v0, v0, LCd/f$a$b;

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    :goto_3
    new-instance v0, Ll9/a;

    invoke-direct {v0, v3}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, LCd/f$a;

    invoke-virtual {p0, p1, p2}, Ly8/o$c;->a(Ll9/a;LCd/f$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
