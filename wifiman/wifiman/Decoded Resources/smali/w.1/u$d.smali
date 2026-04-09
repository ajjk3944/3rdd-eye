.class final Lw/u$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/u;->b(Lw/y;FLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lkotlin/jvm/internal/K;

.field final synthetic d:F


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/K;FLdh/e;)V
    .locals 0

    iput-object p1, p0, Lw/u$d;->c:Lkotlin/jvm/internal/K;

    iput p2, p0, Lw/u$d;->d:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Lw/u$d;

    iget-object v1, p0, Lw/u$d;->c:Lkotlin/jvm/internal/K;

    iget v2, p0, Lw/u$d;->d:F

    invoke-direct {v0, v1, v2, p2}, Lw/u$d;-><init>(Lkotlin/jvm/internal/K;FLdh/e;)V

    iput-object p1, v0, Lw/u$d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/v;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/u$d;->n(Lw/v;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lw/u$d;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lw/u$d;->b:Ljava/lang/Object;

    check-cast p1, Lw/v;

    iget-object v0, p0, Lw/u$d;->c:Lkotlin/jvm/internal/K;

    iget v1, p0, Lw/u$d;->d:F

    invoke-interface {p1, v1}, Lw/v;->a(F)F

    move-result p1

    iput p1, v0, Lkotlin/jvm/internal/K;->a:F

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Lw/v;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/u$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/u$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/u$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
