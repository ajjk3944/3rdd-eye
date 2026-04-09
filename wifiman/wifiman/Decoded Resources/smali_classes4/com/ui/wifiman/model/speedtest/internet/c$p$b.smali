.class final Lcom/ui/wifiman/model/speedtest/internet/c$p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c$p;->a(LYg/J;)LDj/a;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$p$b;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 3

    const-string v0, "connected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lkotlin/jvm/internal/J;

    invoke-direct {p1}, Lkotlin/jvm/internal/J;-><init>()V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c$p$b;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/internet/c;->h(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/internet/c$p$b;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$a;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$b;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$b;-><init>(Lkotlin/jvm/internal/J;)V

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$c;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$c;-><init>(Lkotlin/jvm/internal/J;)V

    invoke-virtual {v0, v1}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ui/wifiman/model/speedtest/internet/c$b$a;

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "No Network Connection"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/speedtest/internet/c$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$p$b;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
