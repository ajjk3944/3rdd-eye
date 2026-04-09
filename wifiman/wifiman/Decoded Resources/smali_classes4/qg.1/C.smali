.class public final Lqg/C;
.super Lng/a;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# instance fields
.field final a:LDj/b;

.field b:Lhg/c;


# direct methods
.method public constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0}, Lng/a;-><init>()V

    iput-object p1, p0, Lqg/C;->a:LDj/b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Lqg/C;->b:Lhg/c;

    iget-object v0, p0, Lqg/C;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lqg/C;->b:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/C;->b:Lhg/c;

    iget-object p1, p0, Lqg/C;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/C;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Lqg/C;->b:Lhg/c;

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Lqg/C;->b:Lhg/c;

    iget-object v0, p0, Lqg/C;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
