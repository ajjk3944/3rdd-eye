.class final Lpg/D$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:Lgg/B;

.field final synthetic b:Lpg/D;


# direct methods
.method constructor <init>(Lpg/D;Lgg/B;)V
    .locals 0

    iput-object p1, p0, Lpg/D$a;->b:Lpg/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpg/D$a;->a:Lgg/B;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lpg/D$a;->b:Lpg/D;

    iget-object v1, v0, Lpg/D;->b:Lkg/q;

    if-eqz v1, :cond_0

    :try_start_0
    invoke-interface {v1}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lpg/D$a;->a:Lgg/B;

    invoke-interface {v1, v0}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, v0, Lpg/D;->c:Ljava/lang/Object;

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lpg/D$a;->a:Lgg/B;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "The value supplied is null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lpg/D$a;->a:Lgg/B;

    invoke-interface {v1, v0}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lpg/D$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->c(Lhg/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lpg/D$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
