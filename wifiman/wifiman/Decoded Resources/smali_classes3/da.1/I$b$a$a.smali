.class final Lda/I$b$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I$b$a;->a(LEb/s;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field synthetic d:Ljava/lang/Object;

.field synthetic e:Z

.field final synthetic f:Lca/d$a;

.field final synthetic g:LEb/s;


# direct methods
.method constructor <init>(Lca/d$a;LEb/s;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lda/I$b$a$a;->f:Lca/d$a;

    iput-object p2, p0, Lda/I$b$a$a;->g:LEb/s;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic K(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    move-object v2, p2

    check-cast v2, Ljava/lang/CharSequence;

    move-object v3, p3

    check-cast v3, Ljava/lang/CharSequence;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p5

    check-cast v5, Ldh/e;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lda/I$b$a$a;->n(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v1, v0, Lda/I$b$a$a;->a:I

    if-nez v1, :cond_0

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v1, v0, Lda/I$b$a$a;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    iget-object v2, v0, Lda/I$b$a$a;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    iget-object v3, v0, Lda/I$b$a$a;->d:Ljava/lang/Object;

    check-cast v3, Ljava/lang/CharSequence;

    iget-boolean v14, v0, Lda/I$b$a$a;->e:Z

    new-instance v20, LEb/c;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    iget-object v1, v0, Lda/I$b$a$a;->f:Lca/d$a;

    invoke-virtual {v1}, Lca/d$a;->b()Ljava/lang/String;

    move-result-object v10

    iget-object v1, v0, Lda/I$b$a$a;->f:Lca/d$a;

    invoke-virtual {v1}, Lca/d$a;->a()Ljava/lang/String;

    move-result-object v11

    iget-object v1, v0, Lda/I$b$a$a;->g:LEb/s;

    invoke-virtual {v1}, LEb/s;->b()Ljava/lang/String;

    move-result-object v12

    iget-object v1, v0, Lda/I$b$a$a;->g:LEb/s;

    invoke-virtual {v1}, LEb/s;->a()Ljava/lang/String;

    move-result-object v13

    const/16 v18, 0x1c00

    const/16 v19, 0x0

    const-string v8, ""

    const-string v9, ""

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v4, v20

    invoke-direct/range {v4 .. v19}, LEb/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v20

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final n(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLdh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lda/I$b$a$a;

    iget-object v1, p0, Lda/I$b$a$a;->f:Lca/d$a;

    iget-object v2, p0, Lda/I$b$a$a;->g:LEb/s;

    invoke-direct {v0, v1, v2, p5}, Lda/I$b$a$a;-><init>(Lca/d$a;LEb/s;Ldh/e;)V

    iput-object p1, v0, Lda/I$b$a$a;->b:Ljava/lang/Object;

    iput-object p2, v0, Lda/I$b$a$a;->c:Ljava/lang/Object;

    iput-object p3, v0, Lda/I$b$a$a;->d:Ljava/lang/Object;

    iput-boolean p4, v0, Lda/I$b$a$a;->e:Z

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, Lda/I$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
