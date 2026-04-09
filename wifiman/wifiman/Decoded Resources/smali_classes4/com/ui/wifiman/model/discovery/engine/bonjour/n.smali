.class public final synthetic Lcom/ui/wifiman/model/discovery/engine/bonjour/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

.field public final synthetic b:LKg/a;

.field public final synthetic c:LKg/d;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;LKg/a;LKg/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/n;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/n;->b:LKg/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/n;->c:LKg/d;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/n;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/n;->b:LKg/a;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/n;->c:LKg/d;

    invoke-static {v0, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m$a;->b(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;LKg/a;LKg/d;)V

    return-void
.end method
