.class final LG8/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/g;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LG8/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG8/g$b;

    invoke-direct {v0}, LG8/g$b;-><init>()V

    sput-object v0, LG8/g$b;->a:LG8/g$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$a;)Ljava/lang/Boolean;
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$a$a;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$a$b;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$a;

    invoke-virtual {p0, p1}, LG8/g$b;->a(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
