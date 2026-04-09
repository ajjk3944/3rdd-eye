.class final Lcom/ui/wifiman/model/speedtest/internet/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/b;->m(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/b;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$d;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/f;
    .locals 4

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b$d;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/internet/b;->d(Lcom/ui/wifiman/model/speedtest/internet/b;)LP7/a;

    move-result-object v0

    invoke-static {p1}, Lcom/ui/wifiman/model/speedtest/internet/g;->a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->d()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const-string v3, "main server must be evaluated when reporting speedtest startup"

    if-eqz v1, :cond_3

    invoke-static {p1}, Lcom/ui/wifiman/model/speedtest/internet/g;->a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->c()Ljava/lang/String;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    new-instance p1, LP7/c$o;

    invoke-direct {p1, v1, v2}, LP7/c$o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$d;->a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
