.class final Ltg/k$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Ltg/k$a;


# direct methods
.method constructor <init>(Ltg/k$a;)V
    .locals 0

    iput-object p1, p0, Ltg/k$a$a;->a:Ltg/k$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ltg/k$a$a;->a:Ltg/k$a;

    iget-object v0, v0, Ltg/k$a;->b:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/k$a$a;->a:Ltg/k$a;

    iget-object v0, v0, Ltg/k$a;->a:Llg/e;

    invoke-virtual {v0, p1}, Llg/e;->c(Lhg/c;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ltg/k$a$a;->a:Ltg/k$a;

    iget-object v0, v0, Ltg/k$a;->b:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/k$a$a;->a:Ltg/k$a;

    iget-object v0, v0, Ltg/k$a;->b:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
