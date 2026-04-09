.class final LWa/l$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWa/l;-><init>(Landroid/content/Context;LIi/J;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LWa/l$a;->c:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LWa/l$a;

    iget-object v1, p0, LWa/l$a;->c:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, LWa/l$a;-><init>(Landroid/content/Context;Ldh/e;)V

    iput-object p1, v0, LWa/l$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKi/t;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LWa/l$a;->n(LKi/t;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LWa/l$a;->a:I

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

    iget-object p1, p0, LWa/l$a;->b:Ljava/lang/Object;

    check-cast p1, LKi/t;

    new-instance v1, LWa/l$a$b;

    invoke-direct {v1, p1}, LWa/l$a$b;-><init>(LKi/t;)V

    iget-object v3, p0, LWa/l$a;->c:Landroid/content/Context;

    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    const-string/jumbo v5, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v4, v5}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string/jumbo v5, "android.intent.action.PACKAGE_CHANGED"

    invoke-virtual {v4, v5}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string/jumbo v5, "android.intent.action.PACKAGE_FULLY_REMOVED"

    invoke-virtual {v4, v5}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v5, LYg/J;->a:LYg/J;

    invoke-virtual {v3, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v3, LWa/l$a$a;

    iget-object v4, p0, LWa/l$a;->c:Landroid/content/Context;

    invoke-direct {v3, v4, v1}, LWa/l$a$a;-><init>(Landroid/content/Context;LWa/l$a$b;)V

    iput v2, p0, LWa/l$a;->a:I

    invoke-static {p1, v3, p0}, LKi/r;->a(LKi/t;Lmh/a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LWa/l$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LWa/l$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LWa/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
