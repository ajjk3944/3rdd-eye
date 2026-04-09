.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d;->a(Ljava/lang/String;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d$a;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d$a;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d$a;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bonjour discovery type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " subscribed"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BonjourDiscoveryEngine"

    invoke-static {p1, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d$a;->a(LDj/c;)V

    return-void
.end method
