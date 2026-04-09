.class public final LK8/e$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e$h;->a(Ljava/lang/RuntimeException;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/RuntimeException;


# direct methods
.method public constructor <init>(Ljava/lang/RuntimeException;)V
    .locals 0

    iput-object p1, p0, LK8/e$h$a;->a:Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    const-string/jumbo v0, "Sending latest Teleport error to crashlytics"

    new-instance v1, Lcom/ubnt/usurvey/ui/teleport/tunnel/TeleportIssueReportException;

    iget-object v2, p0, LK8/e$h$a;->a:Ljava/lang/RuntimeException;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v2, p0, LK8/e$h$a;->a:Ljava/lang/RuntimeException;

    invoke-direct {v1, v2}, Lcom/ubnt/usurvey/ui/teleport/tunnel/TeleportIssueReportException;-><init>(Ljava/lang/Throwable;)V

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
