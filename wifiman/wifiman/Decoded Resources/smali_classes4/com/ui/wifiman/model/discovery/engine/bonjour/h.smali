.class public final synthetic Lcom/ui/wifiman/model/discovery/engine/bonjour/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:LKg/a;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:LKg/e;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LKg/a;Ljava/lang/String;LKg/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/h;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/h;->b:LKg/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/h;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/h;->d:LKg/e;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/h;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/h;->b:LKg/a;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/h;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/h;->d:LKg/e;

    invoke-static {v0, v1, v2, v3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d$a;->b(Ljava/lang/String;LKg/a;Ljava/lang/String;LKg/e;)V

    return-void
.end method
