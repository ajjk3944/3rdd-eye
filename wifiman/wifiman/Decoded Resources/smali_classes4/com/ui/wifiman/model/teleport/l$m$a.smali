.class final Lcom/ui/wifiman/model/teleport/l$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


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

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$m$a;->a:Lcom/ui/wifiman/model/teleport/l$c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lgg/r;
    .locals 2

    const-string v0, "tunnels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l$m$a;->a:Lcom/ui/wifiman/model/teleport/l$c$a;

    new-instance v1, Lcom/ui/wifiman/model/teleport/l$m$a$a;

    invoke-direct {v1, p1, v0}, Lcom/ui/wifiman/model/teleport/l$m$a$a;-><init>(Ljava/util/List;Lcom/ui/wifiman/model/teleport/l$c$a;)V

    invoke-static {v1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$m$a;->a(Ljava/util/List;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
