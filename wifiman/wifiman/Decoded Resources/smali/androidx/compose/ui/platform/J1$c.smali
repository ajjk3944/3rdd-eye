.class final Landroidx/compose/ui/platform/J1$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/J1;->e(Landroid/content/Context;)LLi/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:Landroid/content/ContentResolver;

.field final synthetic e:Landroid/net/Uri;

.field final synthetic f:Landroidx/compose/ui/platform/J1$d;

.field final synthetic g:LKi/g;

.field final synthetic h:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;Landroidx/compose/ui/platform/J1$d;LKi/g;Landroid/content/Context;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/J1$c;->d:Landroid/content/ContentResolver;

    iput-object p2, p0, Landroidx/compose/ui/platform/J1$c;->e:Landroid/net/Uri;

    iput-object p3, p0, Landroidx/compose/ui/platform/J1$c;->f:Landroidx/compose/ui/platform/J1$d;

    iput-object p4, p0, Landroidx/compose/ui/platform/J1$c;->g:LKi/g;

    iput-object p5, p0, Landroidx/compose/ui/platform/J1$c;->h:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, Landroidx/compose/ui/platform/J1$c;

    iget-object v1, p0, Landroidx/compose/ui/platform/J1$c;->d:Landroid/content/ContentResolver;

    iget-object v2, p0, Landroidx/compose/ui/platform/J1$c;->e:Landroid/net/Uri;

    iget-object v3, p0, Landroidx/compose/ui/platform/J1$c;->f:Landroidx/compose/ui/platform/J1$d;

    iget-object v4, p0, Landroidx/compose/ui/platform/J1$c;->g:LKi/g;

    iget-object v5, p0, Landroidx/compose/ui/platform/J1$c;->h:Landroid/content/Context;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/platform/J1$c;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Landroidx/compose/ui/platform/J1$d;LKi/g;Landroid/content/Context;Ldh/e;)V

    iput-object p1, v7, Landroidx/compose/ui/platform/J1$c;->c:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/J1$c;->n(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/platform/J1$c;->b:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Landroidx/compose/ui/platform/J1$c;->a:Ljava/lang/Object;

    check-cast v1, LKi/i;

    iget-object v4, p0, Landroidx/compose/ui/platform/J1$c;->c:Ljava/lang/Object;

    check-cast v4, LLi/h;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    move-object p1, v4

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/platform/J1$c;->a:Ljava/lang/Object;

    check-cast v1, LKi/i;

    iget-object v4, p0, Landroidx/compose/ui/platform/J1$c;->c:Ljava/lang/Object;

    check-cast v4, LLi/h;

    :try_start_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/J1$c;->c:Ljava/lang/Object;

    check-cast p1, LLi/h;

    iget-object v1, p0, Landroidx/compose/ui/platform/J1$c;->d:Landroid/content/ContentResolver;

    iget-object v4, p0, Landroidx/compose/ui/platform/J1$c;->e:Landroid/net/Uri;

    const/4 v5, 0x0

    iget-object v6, p0, Landroidx/compose/ui/platform/J1$c;->f:Landroidx/compose/ui/platform/J1$d;

    invoke-virtual {v1, v4, v5, v6}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    :try_start_2
    iget-object v1, p0, Landroidx/compose/ui/platform/J1$c;->g:LKi/g;

    invoke-interface {v1}, LKi/v;->iterator()LKi/i;

    move-result-object v1

    :goto_0
    iput-object p1, p0, Landroidx/compose/ui/platform/J1$c;->c:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/ui/platform/J1$c;->a:Ljava/lang/Object;

    iput v3, p0, Landroidx/compose/ui/platform/J1$c;->b:I

    invoke-interface {v1, p0}, LKi/i;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    return-object v0

    :cond_4
    move-object v7, v4

    move-object v4, p1

    move-object p1, v7

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v1}, LKi/i;->next()Ljava/lang/Object;

    iget-object p1, p0, Landroidx/compose/ui/platform/J1$c;->h:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v5, "animator_duration_scale"

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {p1, v5, v6}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p1

    iput-object v4, p0, Landroidx/compose/ui/platform/J1$c;->c:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/ui/platform/J1$c;->a:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/ui/platform/J1$c;->b:I

    invoke-interface {v4, p1, p0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v0, :cond_0

    return-object v0

    :cond_5
    iget-object p1, p0, Landroidx/compose/ui/platform/J1$c;->d:Landroid/content/ContentResolver;

    iget-object v0, p0, Landroidx/compose/ui/platform/J1$c;->f:Landroidx/compose/ui/platform/J1$d;

    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_2
    iget-object v0, p0, Landroidx/compose/ui/platform/J1$c;->d:Landroid/content/ContentResolver;

    iget-object v1, p0, Landroidx/compose/ui/platform/J1$c;->f:Landroidx/compose/ui/platform/J1$d;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    throw p1
.end method

.method public final n(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/J1$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/J1$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/J1$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
