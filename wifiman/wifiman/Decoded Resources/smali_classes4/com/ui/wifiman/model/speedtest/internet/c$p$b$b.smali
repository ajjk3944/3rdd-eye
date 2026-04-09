.class final Lcom/ui/wifiman/model/speedtest/internet/c$p$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


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

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$b;->a:Lkotlin/jvm/internal/J;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/internet/c$b;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$b;->a:Lkotlin/jvm/internal/J;

    instance-of p1, p1, Lcom/ui/wifiman/model/speedtest/internet/c$b$a;

    iput-boolean p1, v0, Lkotlin/jvm/internal/J;->a:Z

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/c$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$p$b$b;->a(Lcom/ui/wifiman/model/speedtest/internet/c$b;)V

    return-void
.end method
