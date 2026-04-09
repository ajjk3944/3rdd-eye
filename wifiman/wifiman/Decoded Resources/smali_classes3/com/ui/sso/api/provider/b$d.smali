.class final Lcom/ui/sso/api/provider/b$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/b;->d(LIi/N;Lcom/ui/sso/api/provider/b$a;Ldh/e;)Ljava/lang/Object;
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

.field synthetic e:Ljava/lang/Object;

.field final synthetic f:Lcom/ui/sso/api/provider/b;

.field g:I


# direct methods
.method constructor <init>(Lcom/ui/sso/api/provider/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/b$d;->f:Lcom/ui/sso/api/provider/b;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/ui/sso/api/provider/b$d;->e:Ljava/lang/Object;

    iget p1, p0, Lcom/ui/sso/api/provider/b$d;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/ui/sso/api/provider/b$d;->g:I

    iget-object p1, p0, Lcom/ui/sso/api/provider/b$d;->f:Lcom/ui/sso/api/provider/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/ui/sso/api/provider/b;->d(LIi/N;Lcom/ui/sso/api/provider/b$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
