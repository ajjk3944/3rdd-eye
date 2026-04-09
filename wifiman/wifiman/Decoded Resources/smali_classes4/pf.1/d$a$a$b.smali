.class final Lpf/d$a$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpf/d$a$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lpf/b;

.field final synthetic c:Lpf/b$a;

.field final synthetic d:Lmh/a;


# direct methods
.method constructor <init>(Lpf/b;Lpf/b$a;Lmh/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lpf/d$a$a$b;->b:Lpf/b;

    iput-object p2, p0, Lpf/d$a$a$b;->c:Lpf/b$a;

    iput-object p3, p0, Lpf/d$a$a$b;->d:Lmh/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lpf/d$a$a$b;

    iget-object v0, p0, Lpf/d$a$a$b;->b:Lpf/b;

    iget-object v1, p0, Lpf/d$a$a$b;->c:Lpf/b$a;

    iget-object v2, p0, Lpf/d$a$a$b;->d:Lmh/a;

    invoke-direct {p1, v0, v1, v2, p2}, Lpf/d$a$a$b;-><init>(Lpf/b;Lpf/b$a;Lmh/a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lpf/d$a$a$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lpf/d$a$a$b;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lpf/d$a$a$b;->b:Lpf/b;

    iget-object v0, p0, Lpf/d$a$a$b;->c:Lpf/b$a;

    check-cast v0, Lpf/b$a$a;

    invoke-virtual {p1, v0}, Lpf/b;->n0(Lpf/b$a$a;)V

    iget-object p1, p0, Lpf/d$a$a$b;->d:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lpf/d$a$a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lpf/d$a$a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lpf/d$a$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
