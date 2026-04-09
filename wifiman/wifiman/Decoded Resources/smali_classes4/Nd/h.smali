.class public final synthetic LNd/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNd/h;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNd/h;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->f(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/sso/api/UiAccountApi;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
