.class final Lcom/ui/wifiman/model/speedtest/internet/c$t;
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


# static fields
.field public static final a:Lcom/ui/wifiman/model/speedtest/internet/c$t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$t;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/internet/c$t;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$t;->a:Lcom/ui/wifiman/model/speedtest/internet/c$t;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LWc/b;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->b()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;-><init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;Ljava/util/List;)V

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$c;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$c;

    :goto_1
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$t;->a(LWc/b;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a;

    move-result-object p1

    return-object p1
.end method
