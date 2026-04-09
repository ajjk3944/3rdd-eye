.class final LP/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP/o;

.field final synthetic b:LIi/N;


# direct methods
.method constructor <init>(LP/o;LIi/N;)V
    .locals 0

    iput-object p1, p0, LP/f$a$a;->a:LP/o;

    iput-object p2, p0, LP/f$a$a;->b:LIi/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly/j;

    invoke-virtual {p0, p1, p2}, LP/f$a$a;->b(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly/j;Ldh/e;)Ljava/lang/Object;
    .locals 1

    instance-of p2, p1, Ly/o$b;

    if-eqz p2, :cond_0

    iget-object p2, p0, LP/f$a$a;->a:LP/o;

    check-cast p1, Ly/o$b;

    iget-object v0, p0, LP/f$a$a;->b:LIi/N;

    invoke-virtual {p2, p1, v0}, LP/o;->e(Ly/o$b;LIi/N;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Ly/o$c;

    if-eqz p2, :cond_1

    iget-object p2, p0, LP/f$a$a;->a:LP/o;

    check-cast p1, Ly/o$c;

    invoke-virtual {p1}, Ly/o$c;->a()Ly/o$b;

    move-result-object p1

    invoke-virtual {p2, p1}, LP/o;->g(Ly/o$b;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, Ly/o$a;

    if-eqz p2, :cond_2

    iget-object p2, p0, LP/f$a$a;->a:LP/o;

    check-cast p1, Ly/o$a;

    invoke-virtual {p1}, Ly/o$a;->a()Ly/o$b;

    move-result-object p1

    invoke-virtual {p2, p1}, LP/o;->g(Ly/o$b;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, LP/f$a$a;->a:LP/o;

    iget-object v0, p0, LP/f$a$a;->b:LIi/N;

    invoke-virtual {p2, p1, v0}, LP/o;->h(Ly/j;LIi/N;)V

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
