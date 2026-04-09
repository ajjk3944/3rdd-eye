.class final Lpg/z$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/z$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lpg/z$a;


# direct methods
.method constructor <init>(Lpg/z$a;)V
    .locals 0

    iput-object p1, p0, Lpg/z$a$a;->a:Lpg/z$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lpg/z$a$a;->a:Lpg/z$a;

    iget-object v0, v0, Lpg/z$a;->b:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    iget-object v0, p0, Lpg/z$a$a;->a:Lpg/z$a;

    iget-object v0, v0, Lpg/z$a;->c:Lgg/d;

    invoke-interface {v0}, Lgg/d;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lpg/z$a$a;->a:Lpg/z$a;

    iget-object v0, v0, Lpg/z$a;->b:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->a(Lhg/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lpg/z$a$a;->a:Lpg/z$a;

    iget-object v0, v0, Lpg/z$a;->b:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    iget-object v0, p0, Lpg/z$a$a;->a:Lpg/z$a;

    iget-object v0, v0, Lpg/z$a;->c:Lgg/d;

    invoke-interface {v0, p1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
