.class final Lk2/a$a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk2/a$a;->f(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lk2/a$a;

.field final synthetic c:Landroid/net/Uri;

.field final synthetic d:Landroid/view/InputEvent;


# direct methods
.method constructor <init>(Lk2/a$a;Landroid/net/Uri;Landroid/view/InputEvent;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lk2/a$a$c;->b:Lk2/a$a;

    iput-object p2, p0, Lk2/a$a$c;->c:Landroid/net/Uri;

    iput-object p3, p0, Lk2/a$a$c;->d:Landroid/view/InputEvent;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lk2/a$a$c;

    iget-object v0, p0, Lk2/a$a$c;->b:Lk2/a$a;

    iget-object v1, p0, Lk2/a$a$c;->c:Landroid/net/Uri;

    iget-object v2, p0, Lk2/a$a$c;->d:Landroid/view/InputEvent;

    invoke-direct {p1, v0, v1, v2, p2}, Lk2/a$a$c;-><init>(Lk2/a$a;Landroid/net/Uri;Landroid/view/InputEvent;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lk2/a$a$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lk2/a$a$c;->a:I

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

    iget-object p1, p0, Lk2/a$a$c;->b:Lk2/a$a;

    invoke-static {p1}, Lk2/a$a;->d(Lk2/a$a;)Landroidx/privacysandbox/ads/adservices/measurement/b;

    move-result-object p1

    iget-object v1, p0, Lk2/a$a$c;->c:Landroid/net/Uri;

    iget-object v3, p0, Lk2/a$a$c;->d:Landroid/view/InputEvent;

    iput v2, p0, Lk2/a$a$c;->a:I

    invoke-virtual {p1, v1, v3, p0}, Landroidx/privacysandbox/ads/adservices/measurement/b;->c(Landroid/net/Uri;Landroid/view/InputEvent;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lk2/a$a$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lk2/a$a$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lk2/a$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
