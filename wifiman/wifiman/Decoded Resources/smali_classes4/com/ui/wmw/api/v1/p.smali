.class public final Lcom/ui/wmw/api/v1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field final synthetic a:Lcom/ui/comm/v4/a$f;


# direct methods
.method public constructor <init>(Lcom/ui/comm/v4/a$f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/api/v1/p;->a:Lcom/ui/comm/v4/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/r;
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_0

    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$RequestTimeout;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/p;->a:Lcom/ui/comm/v4/a$f;

    invoke-virtual {v0}, Lcom/ui/comm/v4/a$f;->h()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Request ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] didn\'t received any response in 60000"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/ui/wmw/WMWizard$Error$Session$RequestTimeout;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/n;->i(Ljava/lang/Throwable;)Lgg/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/n;->i(Ljava/lang/Throwable;)Lgg/n;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/p;->a(Ljava/lang/Throwable;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
