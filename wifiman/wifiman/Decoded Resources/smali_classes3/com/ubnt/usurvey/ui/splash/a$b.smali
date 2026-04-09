.class final Lcom/ubnt/usurvey/ui/splash/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/splash/a;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/splash/a;


# direct methods
.method constructor <init>(Lcom/ubnt/usurvey/ui/splash/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/splash/a$b;->a:Lcom/ubnt/usurvey/ui/splash/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lgg/f;
    .locals 3

    const/4 v0, 0x1

    const-string/jumbo v1, "wizardRequired"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/ubnt/usurvey/ui/splash/a$b;->a:Lcom/ubnt/usurvey/ui/splash/a;

    invoke-static {p1}, Lcom/ubnt/usurvey/ui/splash/a;->d(Lcom/ubnt/usurvey/ui/splash/a;)Li8/a;

    move-result-object p1

    new-instance v1, Li8/a$b$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0, v2}, Li8/a$b$c;-><init>(LQe/c$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v0, v0, [Li8/a$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p1, v0}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/splash/a$b;->a(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
