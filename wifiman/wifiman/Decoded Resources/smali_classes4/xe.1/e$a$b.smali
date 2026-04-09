.class final Lxe/e$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/e$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroidx/lifecycle/o;

.field final synthetic c:LYg/m;

.field final synthetic d:LN/n0;

.field final synthetic e:LIi/N;

.field final synthetic f:Lf2/w;

.field final synthetic g:Lf2/w;

.field final synthetic h:LT/z1;


# direct methods
.method constructor <init>(Landroidx/lifecycle/o;LYg/m;LN/n0;LIi/N;Lf2/w;Lf2/w;LT/z1;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lxe/e$a$b;->b:Landroidx/lifecycle/o;

    iput-object p2, p0, Lxe/e$a$b;->c:LYg/m;

    iput-object p3, p0, Lxe/e$a$b;->d:LN/n0;

    iput-object p4, p0, Lxe/e$a$b;->e:LIi/N;

    iput-object p5, p0, Lxe/e$a$b;->f:Lf2/w;

    iput-object p6, p0, Lxe/e$a$b;->g:Lf2/w;

    iput-object p7, p0, Lxe/e$a$b;->h:LT/z1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 9

    new-instance p1, Lxe/e$a$b;

    iget-object v1, p0, Lxe/e$a$b;->b:Landroidx/lifecycle/o;

    iget-object v2, p0, Lxe/e$a$b;->c:LYg/m;

    iget-object v3, p0, Lxe/e$a$b;->d:LN/n0;

    iget-object v4, p0, Lxe/e$a$b;->e:LIi/N;

    iget-object v5, p0, Lxe/e$a$b;->f:Lf2/w;

    iget-object v6, p0, Lxe/e$a$b;->g:Lf2/w;

    iget-object v7, p0, Lxe/e$a$b;->h:LT/z1;

    move-object v0, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lxe/e$a$b;-><init>(Landroidx/lifecycle/o;LYg/m;LN/n0;LIi/N;Lf2/w;Lf2/w;LT/z1;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lxe/e$a$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lxe/e$a$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lxe/e$a$b;->b:Landroidx/lifecycle/o;

    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p1

    sget-object v1, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    new-instance v11, Lxe/e$a$b$a;

    iget-object v4, p0, Lxe/e$a$b;->c:LYg/m;

    iget-object v5, p0, Lxe/e$a$b;->d:LN/n0;

    iget-object v6, p0, Lxe/e$a$b;->e:LIi/N;

    iget-object v7, p0, Lxe/e$a$b;->f:Lf2/w;

    iget-object v8, p0, Lxe/e$a$b;->g:Lf2/w;

    iget-object v9, p0, Lxe/e$a$b;->h:LT/z1;

    const/4 v10, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lxe/e$a$b$a;-><init>(LYg/m;LN/n0;LIi/N;Lf2/w;Lf2/w;LT/z1;Ldh/e;)V

    iput v2, p0, Lxe/e$a$b;->a:I

    invoke-static {p1, v1, v11, p0}, Landroidx/lifecycle/A;->a(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxe/e$a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lxe/e$a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lxe/e$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
