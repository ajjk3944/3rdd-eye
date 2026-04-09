.class final LG8/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/h;->n0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LG8/h;


# direct methods
.method constructor <init>(LG8/h;)V
    .locals 0

    iput-object p1, p0, LG8/h$b;->a:LG8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "account"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LG8/h$b;->a:LG8/h;

    invoke-static {v0}, LG8/h;->o0(LG8/h;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->d(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-virtual {p0, p1}, LG8/h$b;->a(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
