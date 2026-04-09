.class final LH8/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/j;->w0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/j;


# direct methods
.method constructor <init>(LH8/j;)V
    .locals 0

    iput-object p1, p0, LH8/j$d;->a:LH8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/r;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$ClipboardEmpty;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/n;->i(Ljava/lang/Throwable;)Lgg/n;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, LH8/j$d;->a:LH8/j;

    invoke-static {p1}, LH8/j;->x0(LH8/j;)Li8/a;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Li8/a$b;

    sget-object v1, Li8/a$b$E$c;->a:Li8/a$b$E$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p1, v0}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->i(Lgg/r;)Lgg/n;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LH8/j$d;->a(Ljava/lang/Throwable;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
