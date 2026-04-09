.class final Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;-><init>(Leb/g$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/r;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    new-instance v2, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;

    invoke-direct {v2, v0, v1, p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;[B)V

    invoke-static {v2}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d;->a(LYg/s;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
