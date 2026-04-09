.class final Lcom/ui/sso/api/a$x;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/a;->q(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:Ljava/lang/Object;

.field synthetic g:Ljava/lang/Object;

.field final synthetic h:Lcom/ui/sso/api/a;

.field i:I


# direct methods
.method constructor <init>(Lcom/ui/sso/api/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/a$x;->h:Lcom/ui/sso/api/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/ui/sso/api/a$x;->g:Ljava/lang/Object;

    iget p1, p0, Lcom/ui/sso/api/a$x;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/ui/sso/api/a$x;->i:I

    iget-object p1, p0, Lcom/ui/sso/api/a$x;->h:Lcom/ui/sso/api/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/ui/sso/api/a;->g(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
