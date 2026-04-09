.class public final synthetic Lcom/ui/wifiman/model/discovery/engine/bonjour/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:LKg/a;

.field public final synthetic b:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;


# direct methods
.method public synthetic constructor <init>(LKg/a;Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/k;->a:LKg/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/k;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/k;->a:LKg/a;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/k;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;->b(LKg/a;Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;)V

    return-void
.end method
