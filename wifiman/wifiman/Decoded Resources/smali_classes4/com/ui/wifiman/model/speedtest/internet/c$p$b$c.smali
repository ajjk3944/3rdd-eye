.class final Lcom/ui/wifiman/model/speedtest/internet/c$p$b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c$p$b;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/J;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/J;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$c;->a:Lkotlin/jvm/internal/J;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$c$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$c;->a:Lkotlin/jvm/internal/J;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$c$a;-><init>(Lkotlin/jvm/internal/J;)V

    invoke-virtual {p1, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$c;->a(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
