.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;-><init>(Lorg/kodein/di/DI;LLb/b;LNd/c;Llc/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$o;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$o;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$o;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$o;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/sso/api/UiAccountApi;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$a$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$a$a;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$o;->a(Lcom/ui/sso/api/UiAccountApi;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$a;

    move-result-object p1

    return-object p1
.end method
