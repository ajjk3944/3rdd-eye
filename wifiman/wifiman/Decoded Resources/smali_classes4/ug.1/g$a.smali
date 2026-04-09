.class final Lug/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:Lgg/B;

.field final synthetic b:Lug/g;


# direct methods
.method constructor <init>(Lug/g;Lgg/B;)V
    .locals 0

    iput-object p1, p0, Lug/g$a;->b:Lug/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lug/g$a;->a:Lgg/B;

    return-void
.end method


# virtual methods
.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lug/g$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->c(Lhg/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lug/g$a;->b:Lug/g;

    iget-object v0, v0, Lug/g;->b:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v1, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, p1}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    move-object p1, v1

    :goto_0
    iget-object v0, p0, Lug/g$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lug/g$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
