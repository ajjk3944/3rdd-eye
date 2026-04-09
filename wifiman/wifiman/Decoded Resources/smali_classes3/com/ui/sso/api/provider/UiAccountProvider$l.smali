.class final Lcom/ui/sso/api/provider/UiAccountProvider$l;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/UiAccountProvider;->I(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field e:Z

.field f:Z

.field synthetic g:Ljava/lang/Object;

.field final synthetic h:Lcom/ui/sso/api/provider/UiAccountProvider;

.field i:I


# direct methods
.method constructor <init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->h:Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->g:Ljava/lang/Object;

    iget p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->i:I

    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->h:Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-static {p1, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->j(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
