.class final Lr/a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/a;->t(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lr/a;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lr/a;Ljava/lang/Object;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/a$b;->b:Lr/a;

    iput-object p2, p0, Lr/a$b;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Lr/a$b;

    iget-object v1, p0, Lr/a$b;->b:Lr/a;

    iget-object v2, p0, Lr/a$b;->c:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p1}, Lr/a$b;-><init>(Lr/a;Ljava/lang/Object;Ldh/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, Lr/a$b;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lr/a$b;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/a$b;->b:Lr/a;

    invoke-static {p1}, Lr/a;->b(Lr/a;)V

    iget-object p1, p0, Lr/a$b;->b:Lr/a;

    iget-object v0, p0, Lr/a$b;->c:Ljava/lang/Object;

    invoke-static {p1, v0}, Lr/a;->a(Lr/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lr/a$b;->b:Lr/a;

    invoke-virtual {v0}, Lr/a;->j()Lr/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lr/k;->v(Ljava/lang/Object;)V

    iget-object v0, p0, Lr/a$b;->b:Lr/a;

    invoke-static {v0, p1}, Lr/a;->d(Lr/a;Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lr/a$b;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/a$b;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, Lr/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
