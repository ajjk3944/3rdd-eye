.class final LF/d$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/d;->b(LH/l;Landroidx/compose/ui/e;ZLH/b;LL0/U;LF/D;LH/d;Lmh/p;Ly/m;Lm0/l0;LH/j;ICLT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Z

.field final synthetic c:LF/L;


# direct methods
.method constructor <init>(ZLF/L;Ldh/e;)V
    .locals 0

    iput-boolean p1, p0, LF/d$b;->b:Z

    iput-object p2, p0, LF/d$b;->c:LF/L;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LF/d$b;

    iget-boolean v0, p0, LF/d$b;->b:Z

    iget-object v1, p0, LF/d$b;->c:LF/L;

    invoke-direct {p1, v0, v1, p2}, LF/d$b;-><init>(ZLF/L;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LF/d$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LF/d$b;->a:I

    if-nez v0, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, LF/d$b;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, LF/d$b;->c:LF/L;

    invoke-virtual {p1}, LF/L;->f()LF/J;

    move-result-object p1

    invoke-virtual {p1}, LF/J;->d()V

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LF/d$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LF/d$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LF/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
