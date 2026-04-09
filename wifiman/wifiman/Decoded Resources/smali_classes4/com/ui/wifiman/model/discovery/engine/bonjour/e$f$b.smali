.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;->b(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$b;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$b;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->b()V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$b;->a(LDj/c;)V

    return-void
.end method
