.class final Lcom/ui/sso/api/a$t;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/a;->o(LIi/N;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/ui/sso/api/provider/a;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/ui/sso/api/provider/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/a$t;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/sso/api/a$t;->b:Lcom/ui/sso/api/provider/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ui/sso/api/a$t;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/sso/api/a$t;->b:Lcom/ui/sso/api/provider/a;

    invoke-virtual {v1}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "UI Account API owner found for authority \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' -> "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/sso/api/a$t;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
