.class public final synthetic Lcom/ui/wifiman/model/ubiquiti/cloud/sso/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

.field public final synthetic b:LYg/m;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LYg/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/f;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/f;->b:LYg/m;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/f;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/f;->b:LYg/m;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->a(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LYg/m;Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
