.class public final Lcom/ui/wifiman/model/teleport/j$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j$h;->a(Ll9/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLd/e;


# direct methods
.method public constructor <init>(LLd/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$h$a;->a:LLd/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j$h$a;->a:LLd/e;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoSSOAccount;->a:Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoSSOAccount;

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
