.class final Lcom/ui/wifiman/model/speedtest/internet/c$k$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c$k$a;->a(LYg/s;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$b;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LLa/e;)LWc/b;
    .locals 10

    const-string v0, "eval"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWc/b$a$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$b;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    invoke-virtual {p1}, LLa/e;->b()Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object v5, v3

    :goto_0
    invoke-virtual {p1}, LLa/e;->a()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-int p1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    move-object v7, p1

    goto :goto_1

    :cond_1
    move-object v7, v3

    :goto_1
    const/16 v8, 0x17

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->g(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    move-result-object p1

    invoke-direct {v0, p1}, LWc/b$a$b;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLa/e;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$b;->a(LLa/e;)LWc/b;

    move-result-object p1

    return-object p1
.end method
