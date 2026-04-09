.class final LZ2/f$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ2/f;->a(LZ2/h;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LZ2/h;

.field final synthetic c:Landroid/webkit/WebView;


# direct methods
.method constructor <init>(LZ2/h;Landroid/webkit/WebView;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LZ2/f$e;->b:LZ2/h;

    iput-object p2, p0, LZ2/f$e;->c:Landroid/webkit/WebView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LZ2/f$e;

    iget-object v0, p0, LZ2/f$e;->b:LZ2/h;

    iget-object v1, p0, LZ2/f$e;->c:Landroid/webkit/WebView;

    invoke-direct {p1, v0, v1, p2}, LZ2/f$e;-><init>(LZ2/h;Landroid/webkit/WebView;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LZ2/f$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LZ2/f$e;->a:I

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

    new-instance p1, LZ2/f$e$a;

    iget-object v1, p0, LZ2/f$e;->b:LZ2/h;

    invoke-direct {p1, v1}, LZ2/f$e$a;-><init>(LZ2/h;)V

    invoke-static {p1}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object p1

    new-instance v1, LZ2/f$e$b;

    iget-object v3, p0, LZ2/f$e;->c:Landroid/webkit/WebView;

    invoke-direct {v1, v3}, LZ2/f$e$b;-><init>(Landroid/webkit/WebView;)V

    iput v2, p0, LZ2/f$e;->a:I

    invoke-interface {p1, v1, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LZ2/f$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LZ2/f$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LZ2/f$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
