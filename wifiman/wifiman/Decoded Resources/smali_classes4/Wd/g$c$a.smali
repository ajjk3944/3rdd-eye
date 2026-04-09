.class final LWd/g$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWd/g$c;->a(Ll9/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LYg/s;


# direct methods
.method constructor <init>(LYg/s;)V
    .locals 0

    iput-object p1, p0, LWd/g$c$a;->a:LYg/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;)Lgg/D;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LWd/g$c$a;->a:LYg/s;

    invoke-virtual {v0}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->g()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LWd/g$c$a;->a:LYg/s;

    invoke-virtual {v1}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/sso/auth/a;

    invoke-virtual {v1}, Lcom/ui/sso/auth/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;->b(Ljava/lang/String;Ljava/lang/String;)Lgg/z;

    move-result-object p1

    sget-object v0, LWd/g$c$a$a;->a:LWd/g$c$a$a;

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, LWd/g$c$a$b;->a:LWd/g$c$a$b;

    invoke-virtual {p1, v0}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, LWd/g$c$a$c;->a:LWd/g$c$a$c;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;

    invoke-virtual {p0, p1}, LWd/g$c$a;->a(Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
