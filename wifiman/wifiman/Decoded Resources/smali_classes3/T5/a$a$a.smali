.class final LT5/a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT5/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:J

.field final synthetic d:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LT5/a$a$a;->d:Lmh/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LT5/a$a$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LT5/a$a$a;->b:Ljava/lang/Object;

    check-cast p1, Lw/r;

    iget-wide v3, p0, LT5/a$a$a;->c:J

    iget-object v1, p0, LT5/a$a$a;->d:Lmh/l;

    invoke-static {v3, v4}, LT5/a;->a(J)J

    move-result-wide v3

    invoke-static {v3, v4}, LD6/a;->a(J)LD6/a;

    move-result-object v3

    invoke-interface {v1, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iput v2, p0, LT5/a$a$a;->a:I

    invoke-interface {p1, p0}, Lw/r;->F1(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, LT5/a$a$a;->d:Lmh/l;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lw/r;JLdh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LT5/a$a$a;

    iget-object v1, p0, LT5/a$a$a;->d:Lmh/l;

    invoke-direct {v0, v1, p4}, LT5/a$a$a;-><init>(Lmh/l;Ldh/e;)V

    iput-object p1, v0, LT5/a$a$a;->b:Ljava/lang/Object;

    iput-wide p2, v0, LT5/a$a$a;->c:J

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, LT5/a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lw/r;

    check-cast p2, Ll0/g;

    invoke-virtual {p2}, Ll0/g;->v()J

    move-result-wide v0

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, v0, v1, p3}, LT5/a$a$a;->n(Lw/r;JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
