.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->b(Ljava/lang/Boolean;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LGb/d;)Lgg/D;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->j(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;LGb/d;)LAb/a;

    move-result-object p1

    invoke-interface {p1}, LAb/a;->g()Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LGb/d;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a;->a(LGb/d;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
