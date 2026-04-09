.class final Lcom/ui/wifiman/model/speedtest/internet/b$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/b;->u(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$x;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIa/a$c;)V
    .locals 3

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Received token: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b$x;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    invoke-virtual {p1}, LIa/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->l(Lcom/ui/wifiman/model/speedtest/internet/b;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LIa/a$c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$x;->a(LIa/a$c;)V

    return-void
.end method
