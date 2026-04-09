.class final Lcom/ui/wifiman/model/teleport/b$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b;-><init>(LI7/a;LFd/D;LFd/C;Lcom/ui/wifiman/model/teleport/session/TeleportSession;LP7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/b$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/b$o;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/b$o;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/b$o;->a:Lcom/ui/wifiman/model/teleport/b$o;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)V
    .locals 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;->b()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;->b()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object p1

    const/4 v0, 0x4

    const-string v1, "Teleport connection failed"

    const/4 v2, 0x0

    invoke-static {v1, p1, v2, v0, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$o;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)V

    return-void
.end method
