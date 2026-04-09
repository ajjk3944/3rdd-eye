.class public final Lcom/ui/core/ui/sso/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/core/ui/sso/d;
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
    invoke-direct {p0}, Lcom/ui/core/ui/sso/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/core/ui/sso/UiSSO$f;Landroid/os/Bundle;)Lcom/ui/core/ui/sso/d;
    .locals 2

    const-string/jumbo v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/core/ui/sso/d;

    invoke-direct {v1}, Lcom/ui/core/ui/sso/d;-><init>()V

    if-nez p2, :cond_0

    invoke-static {}, LA1/d;->a()Landroid/os/Bundle;

    move-result-object p2

    :cond_0
    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v1, p2}, Landroidx/fragment/app/Fragment;->v1(Landroid/os/Bundle;)V

    return-object v1
.end method
