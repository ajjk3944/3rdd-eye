.class public final Lcom/ui/wifiman/model/teleport/b$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b$j;->a(Ll9/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/h;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$j$a;->a:Lcom/ui/wifiman/model/teleport/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$j$a;->a:Lcom/ui/wifiman/model/teleport/h;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;->a:Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
