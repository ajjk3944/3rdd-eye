.class final LPa/a$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPa/a;->i(Ljava/util/UUID;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
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


# direct methods
.method constructor <init>(LPa/a;Ljava/util/UUID;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LPa/a$f;->b:LPa/a;

    iput-object p2, p0, LPa/a$f;->c:Ljava/util/UUID;

    iput-object p3, p0, LPa/a$f;->d:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, LPa/a$f;

    iget-object v0, p0, LPa/a$f;->b:LPa/a;

    iget-object v1, p0, LPa/a$f;->c:Ljava/util/UUID;

    iget-object v2, p0, LPa/a$f;->d:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, LPa/a$f;-><init>(LPa/a;Ljava/util/UUID;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LPa/a$f;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const-string/jumbo v0, "` of "

    const-string/jumbo v1, "Failed get auth `"

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v2

    iget v3, p0, LPa/a$f;->a:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LPa/a$f;->b:LPa/a;

    iget-object v3, p0, LPa/a$f;->c:Ljava/util/UUID;

    iput v4, p0, LPa/a$f;->a:I

    invoke-static {p1, v3, p0}, LPa/a;->m(LPa/a;Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    :try_start_0
    iget-object p1, p0, LPa/a$f;->b:LPa/a;

    invoke-static {p1}, LPa/a;->p(LPa/a;)Landroid/content/SharedPreferences;

    move-result-object p1

    iget-object v2, p0, LPa/a$f;->b:LPa/a;

    iget-object v3, p0, LPa/a$f;->c:Ljava/util/UUID;

    iget-object v4, p0, LPa/a$f;->d:Ljava/lang/String;

    invoke-static {v2, v3, v4}, LPa/a;->o(LPa/a;Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_1
    new-instance v2, Lcom/ui/sso/account/UIAccountManager$Error$IO;

    iget-object v3, p0, LPa/a$f;->d:Ljava/lang/String;

    iget-object v4, p0, LPa/a$f;->c:Ljava/util/UUID;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, p1}, Lcom/ui/sso/account/UIAccountManager$Error$IO;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :goto_2
    new-instance v2, Lcom/ui/sso/account/UIAccountManager$Error$IO;

    iget-object v3, p0, LPa/a$f;->d:Ljava/lang/String;

    iget-object v4, p0, LPa/a$f;->c:Ljava/util/UUID;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, p1}, Lcom/ui/sso/account/UIAccountManager$Error$IO;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LPa/a$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LPa/a$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LPa/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
