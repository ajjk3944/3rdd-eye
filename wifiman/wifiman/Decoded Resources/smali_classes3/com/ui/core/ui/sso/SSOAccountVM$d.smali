.class final Lcom/ui/core/ui/sso/SSOAccountVM$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/SSOAccountVM;->G(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lcom/ui/core/ui/sso/SSOAccountVM;

.field e:I


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->d:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->e:I

    iget-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->d:Lcom/ui/core/ui/sso/SSOAccountVM;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->G(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
