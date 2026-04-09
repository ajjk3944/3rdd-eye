.class LO6/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO6/g$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LO6/g$a;


# direct methods
.method constructor <init>(LO6/g$a;)V
    .locals 0

    iput-object p1, p0, LO6/g$a$a;->a:LO6/g$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LO6/g$a$a;->a:LO6/g$a;

    iget-object v0, v0, LO6/g$a;->c:LO6/g;

    iget-object v0, v0, LO6/g;->c:Lgg/t;

    invoke-interface {v0}, Lgg/h;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, LO6/g$a$a;->a:LO6/g$a;

    iget-object v0, v0, LO6/g$a;->c:LO6/g;

    iget-object v0, v0, LO6/g;->c:Lgg/t;

    invoke-interface {v0, p1}, Lgg/t;->g(Lhg/c;)V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LO6/g$a$a;->a:LO6/g$a;

    iget-object v0, v0, LO6/g$a;->c:LO6/g;

    iget-object v0, v0, LO6/g;->c:Lgg/t;

    invoke-interface {v0, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LO6/g$a$a;->a:LO6/g$a;

    iget-object v0, v0, LO6/g$a;->c:LO6/g;

    iget-object v0, v0, LO6/g;->c:Lgg/t;

    invoke-interface {v0, p1}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    return-void
.end method
