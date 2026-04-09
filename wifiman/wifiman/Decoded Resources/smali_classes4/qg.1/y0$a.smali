.class final Lqg/y0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Lyg/f;


# direct methods
.method constructor <init>(LDj/b;Lyg/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/y0$a;->a:LDj/b;

    iput-object p2, p0, Lqg/y0$a;->b:Lyg/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqg/y0$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqg/y0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/y0$a;->b:Lyg/f;

    invoke-virtual {v0, p1}, Lyg/f;->r(LDj/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/y0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
