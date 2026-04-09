.class final Lug/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/B;

.field final synthetic b:Lug/i;


# direct methods
.method constructor <init>(Lug/i;Lgg/B;)V
    .locals 0

    iput-object p1, p0, Lug/i$a;->b:Lug/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lug/i$a;->a:Lgg/B;

    return-void
.end method


# virtual methods
.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lug/i$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->c(Lhg/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lug/i$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lug/i$a;->b:Lug/i;

    iget-object v0, v0, Lug/i;->b:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lug/i$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lug/i$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
