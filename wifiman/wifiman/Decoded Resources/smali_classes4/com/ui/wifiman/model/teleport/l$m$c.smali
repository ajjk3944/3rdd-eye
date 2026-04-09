.class final Lcom/ui/wifiman/model/teleport/l$m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l$m;->a(Lcom/ui/wifiman/model/teleport/l$c$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/l$c$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/l$c$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$m$c;->a:Lcom/ui/wifiman/model/teleport/l$c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/l$c$b;)Z
    .locals 1

    const-string v0, "stopEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/l$c$b;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l$m$c;->a:Lcom/ui/wifiman/model/teleport/l$c$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/l$c$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ubnt/teleport/TeleportTunnel$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/l$c$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$m$c;->a(Lcom/ui/wifiman/model/teleport/l$c$b;)Z

    move-result p1

    return p1
.end method
