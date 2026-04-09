.class public final Lcom/ui/wmw/api/v1/f$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f$c;->d(Lcom/ui/comm/v4/a;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/api/v1/f;

.field final synthetic b:Lcom/ui/comm/v4/a;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/api/v1/f;Lcom/ui/comm/v4/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f$c$a;->a:Lcom/ui/wmw/api/v1/f;

    iput-object p2, p0, Lcom/ui/wmw/api/v1/f$c$a;->b:Lcom/ui/comm/v4/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$c$a;->a:Lcom/ui/wmw/api/v1/f;

    iget-object v1, p0, Lcom/ui/wmw/api/v1/f$c$a;->b:Lcom/ui/comm/v4/a;

    check-cast v1, Lcom/ui/comm/v4/a$e;

    invoke-static {v0, v1}, Lcom/ui/wmw/api/v1/f;->p(Lcom/ui/wmw/api/v1/f;Lcom/ui/comm/v4/a$e;)Lcom/ui/wmw/api/v1/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
