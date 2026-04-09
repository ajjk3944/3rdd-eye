.class final Lcom/ui/core/ui/sso/d$c$b$a$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/d$c$b$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/d;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$b$a$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/core/ui/sso/UiSSO$a;

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/d$c$b$a$b$a$a;->b(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$b$a$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-static {p2}, Lcom/ui/core/ui/sso/d;->F1(Lcom/ui/core/ui/sso/d;)Lcom/ui/core/ui/sso/d$b;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/ui/core/ui/sso/d$b;->w(Lcom/ui/core/ui/sso/UiSSO$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
