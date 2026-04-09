.class final Lcom/ui/wifiman/model/speedtest/internet/c$p;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$p;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)LDj/a;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$p;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-static {p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->i(Lcom/ui/wifiman/model/speedtest/internet/c;)LZc/f;

    move-result-object p1

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    const-wide/16 v0, 0x1f4

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->O(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$p$a;->a:Lcom/ui/wifiman/model/speedtest/internet/c$p$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$p$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$p;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/c$p$b;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$b$b$b;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/c$b$b$b;-><init>(Ljava/util/List;)V

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$p;->a(LYg/J;)LDj/a;

    move-result-object p1

    return-object p1
.end method
