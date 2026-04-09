.class final Lcom/ui/sso/account/local/a$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/account/local/a;->b(Landroid/content/Context;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:J

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcom/ui/sso/account/local/a;

.field d:I


# direct methods
.method constructor <init>(Lcom/ui/sso/account/local/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/account/local/a$b;->c:Lcom/ui/sso/account/local/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/ui/sso/account/local/a$b;->b:Ljava/lang/Object;

    iget p1, p0, Lcom/ui/sso/account/local/a$b;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/ui/sso/account/local/a$b;->d:I

    iget-object p1, p0, Lcom/ui/sso/account/local/a$b;->c:Lcom/ui/sso/account/local/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/ui/sso/account/local/a;->b(Landroid/content/Context;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
