.class final Lcom/ui/core/ui/sso/login/b$a$b$a$a$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/b$a$b$a$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/login/g;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/login/g;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b$a$a;->a:Lcom/ui/core/ui/sso/login/g;

    iput-object p2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b$a$a;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/core/ui/sso/login/g$a;

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b$a$a;->b(Lcom/ui/core/ui/sso/login/g$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/core/ui/sso/login/g$a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    sget-object p2, Lcom/ui/core/ui/sso/login/g$a$a;->a:Lcom/ui/core/ui/sso/login/g$a$a;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b$a$a;->a:Lcom/ui/core/ui/sso/login/g;

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/login/g;->o0()V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lcom/ui/core/ui/sso/login/g$a$b;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b$a$a;->b:Lmh/l;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
