.class final LPa/a$h;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPa/a;->b(LNa/b;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LPa/a;

.field final synthetic c:LNa/b;


# direct methods
.method constructor <init>(LPa/a;LNa/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LPa/a$h;->b:LPa/a;

    iput-object p2, p0, LPa/a$h;->c:LNa/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LPa/a$h;

    iget-object v0, p0, LPa/a$h;->b:LPa/a;

    iget-object v1, p0, LPa/a$h;->c:LNa/b;

    invoke-direct {p1, v0, v1, p2}, LPa/a$h;-><init>(LPa/a;LNa/b;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LPa/a$h;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LPa/a$h;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error$NotFound; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, LPa/a$h;->b:LPa/a;

    iget-object v1, p0, LPa/a$h;->c:LNa/b;

    invoke-virtual {v1}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v1

    iput v2, p0, LPa/a$h;->a:I

    invoke-static {p1, v1, p0}, LPa/a;->m(LPa/a;Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, LNa/b;
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error$NotFound; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-object p1, v3

    :goto_1
    iget-object v0, p0, LPa/a$h;->c:LNa/b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_3
    iget-object p1, p0, LPa/a$h;->b:LPa/a;

    invoke-static {p1}, LPa/a;->p(LPa/a;)Landroid/content/SharedPreferences;

    move-result-object p1

    iget-object v0, p0, LPa/a$h;->b:LPa/a;

    iget-object v1, p0, LPa/a$h;->c:LNa/b;

    monitor-enter p1

    :try_start_2
    invoke-static {v0}, LPa/a;->p(LPa/a;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-virtual {v1}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v4

    invoke-static {v0, v4}, LPa/a;->l(LPa/a;Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Laj/b;->d:Laj/b$a;

    invoke-static {v0, v1}, LPa/a;->a(LPa/a;LNa/b;)LPa/a$b;

    move-result-object v0

    invoke-interface {v5}, LVi/l;->a()Lcj/e;

    move-result-object v1

    const-class v6, LPa/a$b;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v6

    invoke-static {v1, v6}, LVi/w;->c(Lcj/e;Lth/p;)LVi/b;

    move-result-object v1

    invoke-interface {v5, v1, v0}, LVi/A;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v4, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p1

    if-eqz v0, :cond_4

    iget-object p1, p0, LPa/a$h;->b:LPa/a;

    invoke-static {p1}, LPa/a;->n(LPa/a;)LOa/a;

    move-result-object p1

    invoke-interface {p1}, LOa/a;->b()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_4
    new-instance p1, Lcom/ui/sso/account/UIAccountManager$Error$IO;

    iget-object v0, p0, LPa/a$h;->c:LNa/b;

    invoke-virtual {v0}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Failed to update account "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p1, v0, v3, v1, v3}, Lcom/ui/sso/account/UIAccountManager$Error$IO;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LPa/a$h;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LPa/a$h;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LPa/a$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
