.class final Ltg/H$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/x;

.field b:Lhg/c;


# direct methods
.method constructor <init>(Lgg/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/H$a;->a:Lgg/x;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ltg/H$a;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    iput-object p1, p0, Ltg/H$a;->b:Lhg/c;

    iget-object p1, p0, Ltg/H$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/H$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/H$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/H$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
