.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i;
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


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/UUID;)Lgg/f;
    .locals 2

    const-string v0, "newUserId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->a()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i$a;-><init>(Ljava/util/UUID;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i$b;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->g()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$i;->a(Ljava/util/UUID;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
