.class final Lg2/m$g;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m;->a(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lr/c0;

.field final synthetic c:LT/z1;

.field final synthetic d:LT/m0;


# direct methods
.method constructor <init>(Lr/c0;LT/z1;LT/m0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lg2/m$g;->b:Lr/c0;

    iput-object p2, p0, Lg2/m$g;->c:LT/z1;

    iput-object p3, p0, Lg2/m$g;->d:LT/m0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lg2/m$g;

    iget-object v0, p0, Lg2/m$g;->b:Lr/c0;

    iget-object v1, p0, Lg2/m$g;->c:LT/z1;

    iget-object v2, p0, Lg2/m$g;->d:LT/m0;

    invoke-direct {p1, v0, v1, v2, p2}, Lg2/m$g;-><init>(Lr/c0;LT/z1;LT/m0;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lg2/m$g;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lg2/m$g;->a:I

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

    iget-object p1, p0, Lg2/m$g;->c:LT/z1;

    invoke-static {p1}, Lg2/m;->n(LT/z1;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lg2/m$g;->c:LT/z1;

    invoke-static {v1}, Lg2/m;->n(LT/z1;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/k;

    iget-object v1, p0, Lg2/m$g;->b:Lr/c0;

    iget-object v3, p0, Lg2/m$g;->d:LT/m0;

    invoke-static {v3}, Lg2/m;->o(LT/m0;)F

    move-result v3

    iput v2, p0, Lg2/m$g;->a:I

    invoke-virtual {v1, v3, p1, p0}, Lr/c0;->P(FLjava/lang/Object;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lg2/m$g;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lg2/m$g;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lg2/m$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
