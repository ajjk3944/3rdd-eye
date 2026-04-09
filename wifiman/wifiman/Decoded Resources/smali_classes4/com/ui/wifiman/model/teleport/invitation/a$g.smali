.class final Lcom/ui/wifiman/model/teleport/invitation/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/a;->a()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/invitation/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/invitation/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/a$g;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/a$g;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    new-instance v1, Lcom/ui/wifiman/model/teleport/invitation/a$g$a;

    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$g$a;-><init>(Lcom/ui/wifiman/model/teleport/invitation/a;Ljava/lang/Throwable;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$g;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
