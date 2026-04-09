.class public final Ltg/C;
.super Lng/a;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# instance fields
.field final a:Lgg/x;

.field b:Lhg/c;


# direct methods
.method public constructor <init>(Lgg/x;)V
    .locals 0

    invoke-direct {p0}, Lng/a;-><init>()V

    iput-object p1, p0, Ltg/C;->a:Lgg/x;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Ltg/C;->b:Lhg/c;

    iget-object v0, p0, Ltg/C;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/C;->b:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ltg/C;->b:Lhg/c;

    iget-object p1, p0, Ltg/C;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/C;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Ltg/C;->b:Lhg/c;

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/C;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Ltg/C;->b:Lhg/c;

    iget-object v0, p0, Ltg/C;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
