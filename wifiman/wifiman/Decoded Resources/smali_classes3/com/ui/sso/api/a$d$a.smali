.class final Lcom/ui/sso/api/a$d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/sso/api/a;

.field final synthetic b:Lcom/ui/sso/api/UiAccountApi;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/a;Lcom/ui/sso/api/UiAccountApi;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/a$d$a;->a:Lcom/ui/sso/api/a;

    iput-object p2, p0, Lcom/ui/sso/api/a$d$a;->b:Lcom/ui/sso/api/UiAccountApi;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ui/sso/api/a$d$a;->a:Lcom/ui/sso/api/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/ui/sso/api/a$d$a;->b:Lcom/ui/sso/api/UiAccountApi;

    invoke-interface {v1}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "UIAccountManager "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " API emission: $"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/sso/api/a$d$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
