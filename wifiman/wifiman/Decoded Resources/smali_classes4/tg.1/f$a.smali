.class final Ltg/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/B;

.field b:Lhg/c;

.field c:J


# direct methods
.method constructor <init>(Lgg/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/f$a;->a:Lgg/B;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Ltg/f$a;->b:Lhg/c;

    iget-object v0, p0, Ltg/f$a;->a:Lgg/B;

    iget-wide v1, p0, Ltg/f$a;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/f$a;->b:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ltg/f$a;->b:Lhg/c;

    iget-object p1, p0, Ltg/f$a;->a:Lgg/B;

    invoke-interface {p1, p0}, Lgg/B;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/f$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Ltg/f$a;->b:Lhg/c;

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Ltg/f$a;->c:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ltg/f$a;->c:J

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/f$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Ltg/f$a;->b:Lhg/c;

    iget-object v0, p0, Ltg/f$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
