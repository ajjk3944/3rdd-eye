.class public final LE8/h$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/h;->r(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/advanced/b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V
    .locals 0

    iput-object p1, p0, LE8/h$d;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, LE8/h$d;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->w()LVd/c$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LVd/c$a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v2, Ls9/d$c;

    invoke-direct {v2, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    move-object v2, v1

    :goto_0
    new-instance v0, Lnf/f;

    invoke-direct {v0, v1, v2}, Lnf/f;-><init>(Ls9/d;Ls9/d;)V

    move-object v1, v0

    :cond_1
    new-instance v0, Ll9/a;

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
