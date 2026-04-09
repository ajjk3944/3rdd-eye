.class final LV6/m$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV6/m;->g(LS6/r;Landroidx/compose/ui/e;LS6/k;LV6/p;ZLS6/r;LS6/r;Lmh/r;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LV6/b;

.field final synthetic c:Lcom/bumptech/glide/j;

.field final synthetic d:LV6/p;

.field final synthetic e:LS6/r;

.field final synthetic f:LS6/r;

.field final synthetic g:LS6/r;

.field final synthetic h:LS6/k;


# direct methods
.method constructor <init>(LV6/b;Lcom/bumptech/glide/j;LV6/p;LS6/r;LS6/r;LS6/r;LS6/k;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LV6/m$d;->b:LV6/b;

    iput-object p2, p0, LV6/m$d;->c:Lcom/bumptech/glide/j;

    iput-object p3, p0, LV6/m$d;->d:LV6/p;

    iput-object p4, p0, LV6/m$d;->e:LS6/r;

    iput-object p5, p0, LV6/m$d;->f:LS6/r;

    iput-object p6, p0, LV6/m$d;->g:LS6/r;

    iput-object p7, p0, LV6/m$d;->h:LS6/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 10

    new-instance v9, LV6/m$d;

    iget-object v1, p0, LV6/m$d;->b:LV6/b;

    iget-object v2, p0, LV6/m$d;->c:Lcom/bumptech/glide/j;

    iget-object v3, p0, LV6/m$d;->d:LV6/p;

    iget-object v4, p0, LV6/m$d;->e:LS6/r;

    iget-object v5, p0, LV6/m$d;->f:LS6/r;

    iget-object v6, p0, LV6/m$d;->g:LS6/r;

    iget-object v7, p0, LV6/m$d;->h:LS6/k;

    move-object v0, v9

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, LV6/m$d;-><init>(LV6/b;Lcom/bumptech/glide/j;LV6/p;LS6/r;LS6/r;LS6/r;LS6/k;Ldh/e;)V

    return-object v9
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, LV6/m$d;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LV6/m$d;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, LV6/m$d$a;

    iget-object v2, p0, LV6/m$d;->b:LV6/b;

    iget-object v3, p0, LV6/m$d;->c:Lcom/bumptech/glide/j;

    iget-object v4, p0, LV6/m$d;->d:LV6/p;

    iget-object v5, p0, LV6/m$d;->e:LS6/r;

    iget-object v6, p0, LV6/m$d;->f:LS6/r;

    iget-object v7, p0, LV6/m$d;->g:LS6/r;

    iget-object v8, p0, LV6/m$d;->h:LS6/k;

    const/4 v9, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, LV6/m$d$a;-><init>(LV6/b;Lcom/bumptech/glide/j;LV6/p;LS6/r;LS6/r;LS6/r;LS6/k;Ldh/e;)V

    invoke-static {p1}, LLi/i;->e(Lmh/p;)LLi/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LV6/m$d;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LV6/m$d;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, LV6/m$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
