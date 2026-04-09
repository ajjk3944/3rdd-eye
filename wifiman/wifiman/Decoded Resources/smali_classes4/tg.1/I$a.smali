.class final Ltg/I$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/I;
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

    iput-object p1, p0, Ltg/I$a;->a:Lgg/d;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ltg/I$a;->a:Lgg/d;

    invoke-interface {v0}, Lgg/d;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    iput-object p1, p0, Ltg/I$a;->b:Lhg/c;

    iget-object p1, p0, Ltg/I$a;->a:Lgg/d;

    invoke-interface {p1, p0}, Lgg/d;->c(Lhg/c;)V

    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/I$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/I$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/I$a;->a:Lgg/d;

    invoke-interface {v0, p1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
