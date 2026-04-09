.class final LI5/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# instance fields
.field private final a:Lgg/x;

.field private final b:LI5/a$a;


# direct methods
.method constructor <init>(Lgg/x;LI5/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI5/a$d;->a:Lgg/x;

    iput-object p2, p0, LI5/a$d;->b:LI5/a$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LI5/a$d;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, LI5/a$d;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->c(Lhg/c;)V

    iget-object v0, p0, LI5/a$d;->b:LI5/a$a;

    iget-object v0, v0, LI5/a$a;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lhg/c;->isDisposed()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LI5/a$d;->a:Lgg/x;

    invoke-interface {p1, v0}, Lgg/x;->h(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LI5/a$d;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LI5/a$d;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
