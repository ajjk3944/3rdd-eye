.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/b;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;Lcom/ui/wifiman/model/vendor/d$b;Lgd/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LDj/a;
    .locals 3

    const-string v0, "serviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->d(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;Ljava/lang/String;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-direct {v1, p1, v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d$a;-><init>(Ljava/lang/String;Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d;->a(Ljava/lang/String;)LDj/a;

    move-result-object p1

    return-object p1
.end method
