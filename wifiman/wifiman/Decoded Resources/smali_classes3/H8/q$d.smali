.class final LH8/q$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/q;->o0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/q;


# direct methods
.method constructor <init>(LH8/q;)V
    .locals 0

    iput-object p1, p0, LH8/q$d;->a:LH8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "permissionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LH8/q$d;->a:LH8/q;

    invoke-static {p1}, LH8/q;->t0(LH8/q;)Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/session/TeleportSession;->b()Lgg/b;

    move-result-object p1

    new-instance v0, LH8/q$d$a;

    iget-object v1, p0, LH8/q$d;->a:LH8/q;

    invoke-direct {v0, v1}, LH8/q$d$a;-><init>(LH8/q;)V

    invoke-virtual {p1, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;

    invoke-virtual {p0, p1}, LH8/q$d;->a(Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
