.class final Lrg/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/p;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/d;

.field b:Lhg/c;


# direct methods
.method constructor <init>(Lgg/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg/o$a;->a:Lgg/d;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Lrg/o$a;->b:Lhg/c;

    iget-object v0, p0, Lrg/o$a;->a:Lgg/d;

    invoke-interface {v0}, Lgg/d;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lrg/o$a;->b:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lrg/o$a;->b:Lhg/c;

    iget-object p1, p0, Lrg/o$a;->a:Lgg/d;

    invoke-interface {p1, p0}, Lgg/d;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lrg/o$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Lrg/o$a;->b:Lhg/c;

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lrg/o$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Lrg/o$a;->b:Lhg/c;

    iget-object v0, p0, Lrg/o$a;->a:Lgg/d;

    invoke-interface {v0, p1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    sget-object p1, Llg/b;->DISPOSED:Llg/b;

    iput-object p1, p0, Lrg/o$a;->b:Lhg/c;

    iget-object p1, p0, Lrg/o$a;->a:Lgg/d;

    invoke-interface {p1}, Lgg/d;->a()V

    return-void
.end method
