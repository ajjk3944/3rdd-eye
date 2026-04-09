.class final Lcom/ui/wifiman/model/speedtest/internet/b$B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/b;->w(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/b;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/internet/f;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$B;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/b$B;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LW7/b;)LDj/a;
    .locals 2

    const-string v0, "ratesCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b$B;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/internet/b;->f(Lcom/ui/wifiman/model/speedtest/internet/b;)Lyd/a;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$B;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-interface {v0, v1, p1}, Lyd/a;->b(Lcom/ui/wifiman/model/speedtest/Speedtest$d;LW7/b;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/b$B$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$B;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/b$B$a;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW7/b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$B;->a(LW7/b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
