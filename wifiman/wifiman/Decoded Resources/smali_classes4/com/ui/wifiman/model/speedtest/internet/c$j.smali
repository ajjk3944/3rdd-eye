.class final Lcom/ui/wifiman/model/speedtest/internet/c$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;-><init>(Ltd/d;LYb/b;Lpc/a;LZc/f;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$j;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)Ll9/a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-virtual {p1}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$j;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-static {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->n(Lcom/ui/wifiman/model/speedtest/internet/c;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$j;->a(LWc/b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
