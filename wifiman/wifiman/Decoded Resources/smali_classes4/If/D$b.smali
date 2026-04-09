.class final LIf/D$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIf/D;->b(Landroidx/compose/ui/e;LIf/B;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LIf/B;

.field final synthetic d:LE9/f;


# direct methods
.method constructor <init>(LIf/B;LE9/f;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LIf/D$b;->c:LIf/B;

    iput-object p2, p0, LIf/D$b;->d:LE9/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LIf/D$b;

    iget-object v1, p0, LIf/D$b;->c:LIf/B;

    iget-object v2, p0, LIf/D$b;->d:LE9/f;

    invoke-direct {v0, v1, v2, p2}, LIf/D$b;-><init>(LIf/B;LE9/f;Ldh/e;)V

    iput-object p1, v0, LIf/D$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LIf/D$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LIf/D$b;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LIf/D$b;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v0, p0, LIf/D$b;->c:LIf/B;

    invoke-virtual {v0}, LIf/B;->b()LLi/g;

    move-result-object v0

    new-instance v1, LIf/D$b$a;

    iget-object v2, p0, LIf/D$b;->d:LE9/f;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, LIf/D$b$a;-><init>(LE9/f;Ldh/e;)V

    invoke-static {v0, v1}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    invoke-static {v0, p1}, LLi/i;->D(LLi/g;LIi/N;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LIf/D$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LIf/D$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LIf/D$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
