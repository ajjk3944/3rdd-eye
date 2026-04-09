.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->g(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/i;

.field final synthetic b:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;


# direct methods
.method constructor <init>(Lgg/i;Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b;->a:Lgg/i;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/vendor/d$a;)LDj/a;
    .locals 4

    const-string v0, "vendorDirectory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b;->a:Lgg/i;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b$a;

    iget-object v3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-direct {v2, v3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b$a;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V

    invoke-virtual {v0, v1, v2}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->U1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b$b;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b$b;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;Lcom/ui/wifiman/model/vendor/d$a;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/vendor/d$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b;->a(Lcom/ui/wifiman/model/vendor/d$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
