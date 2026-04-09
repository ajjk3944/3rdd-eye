.class public final synthetic LHc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHc/a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LHc/a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    invoke-static {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->g(Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
