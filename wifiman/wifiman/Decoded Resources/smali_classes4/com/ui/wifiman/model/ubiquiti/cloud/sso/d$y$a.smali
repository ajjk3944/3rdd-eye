.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;->b(Ljava/util/List;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LYg/m;

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

.field final synthetic c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;


# direct methods
.method constructor <init>(LYg/m;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->a:LYg/m;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LYg/m;Ljava/lang/Throwable;)Lgg/b;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->c(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LYg/m;Ljava/lang/Throwable;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LYg/m;Ljava/lang/Throwable;)Lgg/b;
    .locals 2

    const-string v0, "er"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ljava/lang/RuntimeException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/lang/RuntimeException;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, v0

    :cond_2
    :goto_1
    nop

    instance-of v0, p2, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    if-eqz v0, :cond_3

    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$b;

    invoke-direct {p2, p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$b;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LYg/m;)V

    invoke-static {p2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p0

    const-string p1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    instance-of p0, p2, Lretrofit2/HttpException;

    if-nez p0, :cond_5

    instance-of p0, p2, Ljava/io/IOException;

    if-eqz p0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p0

    goto :goto_3

    :cond_5
    :goto_2
    const-string p0, "SSO - IO Error while syncing account token"

    const/4 p1, 0x4

    invoke-static {p0, p2, v1, p1, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    :goto_3
    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->b(Ljava/lang/Boolean;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;)Lgg/D;
    .locals 3

    const-string v0, "isAuthenticated"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->a:LYg/m;

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;->a(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->g()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;->a:LYg/m;

    new-instance v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/f;

    invoke-direct {v2, v0, v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/f;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LYg/m;)V

    invoke-virtual {p1, v2}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method
