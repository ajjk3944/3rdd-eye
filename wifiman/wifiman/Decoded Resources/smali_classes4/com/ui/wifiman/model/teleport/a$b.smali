.class final Lcom/ui/wifiman/model/teleport/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/a;-><init>(Landroid/content/Context;Lcom/ui/wifiman/model/teleport/TeleportConnection;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/a$b;->a:Lcom/ui/wifiman/model/teleport/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "shouldStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/a$b;->a:Lcom/ui/wifiman/model/teleport/a;

    invoke-static {p1}, Lcom/ui/wifiman/model/teleport/a;->b(Lcom/ui/wifiman/model/teleport/a;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/a$b;->a(Ljava/lang/Boolean;)V

    return-void
.end method
