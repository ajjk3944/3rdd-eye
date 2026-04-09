.class final LG8/g$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/g;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field synthetic d:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ldh/e;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LG8/g$a;->a:I

    if-nez v0, :cond_3

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG8/g$a;->b:Ljava/lang/Object;

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v0, p0, LG8/g$a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    iget-object v1, p0, LG8/g$a;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p1, Lof/a$a;->ERROR:Lof/a$a;

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lof/a$a;->NO_ACCOUNT:Lof/a$a;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Lof/a$a;->UNAUTHENTICATED:Lof/a$a;

    goto :goto_0

    :cond_2
    sget-object p1, Lof/a$a;->LOGGED_IN:Lof/a$a;

    :goto_0
    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ldh/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, LG8/g$a;

    invoke-direct {v0, p4}, LG8/g$a;-><init>(Ldh/e;)V

    iput-object p1, v0, LG8/g$a;->b:Ljava/lang/Object;

    iput-object p2, v0, LG8/g$a;->c:Ljava/lang/Object;

    iput-object p3, v0, LG8/g$a;->d:Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, LG8/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Boolean;

    check-cast p4, Ldh/e;

    invoke-virtual {p0, p1, p2, p3, p4}, LG8/g$a;->n(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
