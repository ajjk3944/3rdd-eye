.class final LPa/a$i;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPa/a;->h(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LPa/a;

.field final synthetic c:Ljava/util/UUID;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(LPa/a;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LPa/a$i;->b:LPa/a;

    iput-object p2, p0, LPa/a$i;->c:Ljava/util/UUID;

    iput-object p3, p0, LPa/a$i;->d:Ljava/lang/String;

    iput-object p4, p0, LPa/a$i;->e:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, LPa/a$i;

    iget-object v1, p0, LPa/a$i;->b:LPa/a;

    iget-object v2, p0, LPa/a$i;->c:Ljava/util/UUID;

    iget-object v3, p0, LPa/a$i;->d:Ljava/lang/String;

    iget-object v4, p0, LPa/a$i;->e:Ljava/lang/String;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LPa/a$i;-><init>(LPa/a;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LPa/a$i;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LPa/a$i;->a:I

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

    iget-object p1, p0, LPa/a$i;->b:LPa/a;

    iget-object v1, p0, LPa/a$i;->c:Ljava/util/UUID;

    iput v2, p0, LPa/a$i;->a:I

    invoke-static {p1, v1, p0}, LPa/a;->m(LPa/a;Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, LPa/a$i;->b:LPa/a;

    invoke-static {p1}, LPa/a;->p(LPa/a;)Landroid/content/SharedPreferences;

    move-result-object p1

    iget-object v0, p0, LPa/a$i;->b:LPa/a;

    iget-object v1, p0, LPa/a$i;->c:Ljava/util/UUID;

    iget-object v2, p0, LPa/a$i;->d:Ljava/lang/String;

    iget-object v3, p0, LPa/a$i;->e:Ljava/lang/String;

    monitor-enter p1

    :try_start_0
    invoke-static {v0}, LPa/a;->p(LPa/a;)Landroid/content/SharedPreferences;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-static {v0, v1, v2}, LPa/a;->o(LPa/a;Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    if-eqz v0, :cond_3

    iget-object p1, p0, LPa/a$i;->b:LPa/a;

    invoke-static {p1}, LPa/a;->n(LPa/a;)LOa/a;

    move-result-object p1

    iget-object v0, p0, LPa/a$i;->c:Ljava/util/UUID;

    invoke-interface {p1, v0}, LOa/a;->a(Ljava/util/UUID;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_3
    new-instance p1, Lcom/ui/sso/account/UIAccountManager$Error$IO;

    iget-object v0, p0, LPa/a$i;->d:Ljava/lang/String;

    iget-object v1, p0, LPa/a$i;->c:Ljava/util/UUID;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Failed to update auth \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' of "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/sso/account/UIAccountManager$Error$IO;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LPa/a$i;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LPa/a$i;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LPa/a$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
