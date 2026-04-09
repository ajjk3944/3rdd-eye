.class public final synthetic LNd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNd/b;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNd/b;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    check-cast p1, LYg/s;

    check-cast p2, LYg/s;

    invoke-static {v0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->c(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;LYg/s;LYg/s;)LYg/s;

    move-result-object p1

    return-object p1
.end method
