.class final Ltg/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/k$a$a;
    }
.end annotation


# instance fields
.field final a:Llg/e;

.field final b:Lgg/x;

.field c:Z

.field final synthetic d:Ltg/k;


# direct methods
.method constructor <init>(Ltg/k;Llg/e;Lgg/x;)V
    .locals 0

    iput-object p1, p0, Ltg/k$a;->d:Ltg/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ltg/k$a;->a:Llg/e;

    iput-object p3, p0, Ltg/k$a;->b:Lgg/x;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Ltg/k$a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/k$a;->c:Z

    iget-object v0, p0, Ltg/k$a;->d:Ltg/k;

    iget-object v0, v0, Ltg/k;->a:Lgg/v;

    new-instance v1, Ltg/k$a$a;

    invoke-direct {v1, p0}, Ltg/k$a$a;-><init>(Ltg/k$a;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/k$a;->a:Llg/e;

    invoke-virtual {v0, p1}, Llg/e;->c(Lhg/c;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0}, Ltg/k$a;->a()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ltg/k$a;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/k$a;->c:Z

    iget-object v0, p0, Ltg/k$a;->b:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
