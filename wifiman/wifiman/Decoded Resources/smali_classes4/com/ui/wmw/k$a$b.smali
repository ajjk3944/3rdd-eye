.class public final Lcom/ui/wmw/k$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/k$a;->a(Lcom/ui/wmw/api/v1/b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/k;

.field final synthetic b:Lcom/ui/wmw/api/v1/b;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/k;Lcom/ui/wmw/api/v1/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/k$a$b;->a:Lcom/ui/wmw/k;

    iput-object p2, p0, Lcom/ui/wmw/k$a$b;->b:Lcom/ui/wmw/api/v1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wmw/k$a$b;->a:Lcom/ui/wmw/k;

    invoke-virtual {v0}, Lcom/ui/wmw/k;->h()LKf/e;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wmw/k$a$b;->b:Lcom/ui/wmw/api/v1/b;

    check-cast v1, Lcom/ui/wmw/api/v1/b$d;

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/b$d;->a()Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    move-result-object v1

    invoke-virtual {v0, v1}, LKf/e;->w(Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)V

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
