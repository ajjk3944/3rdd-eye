.class public final Lcom/ubnt/usurvey/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/usurvey/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ubnt/usurvey/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ubnt/usurvey/a$b;
    .locals 1

    invoke-static {}, Lcom/ubnt/usurvey/a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "MANAGER"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Landroid/content/Context;)V
    .locals 1

    const-string/jumbo v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/ubnt/usurvey/b;

    invoke-direct {p1}, Lcom/ubnt/usurvey/b;-><init>()V

    invoke-static {p1}, Lcom/ubnt/usurvey/a;->b(Lcom/ubnt/usurvey/a$b;)V

    return-void
.end method
