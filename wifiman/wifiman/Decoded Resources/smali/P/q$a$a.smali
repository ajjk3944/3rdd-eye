.class final LP/q$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/q$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP/q;

.field final synthetic b:LIi/N;


# direct methods
.method constructor <init>(LP/q;LIi/N;)V
    .locals 0

    iput-object p1, p0, LP/q$a$a;->a:LP/q;

    iput-object p2, p0, LP/q$a$a;->b:LIi/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly/j;

    invoke-virtual {p0, p1, p2}, LP/q$a$a;->b(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly/j;Ldh/e;)Ljava/lang/Object;
    .locals 1

    instance-of p2, p1, Ly/o;

    if-eqz p2, :cond_1

    iget-object p2, p0, LP/q$a$a;->a:LP/q;

    invoke-static {p2}, LP/q;->D2(LP/q;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LP/q$a$a;->a:LP/q;

    check-cast p1, Ly/o;

    invoke-static {p2, p1}, LP/q;->G2(LP/q;Ly/o;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LP/q$a$a;->a:LP/q;

    invoke-static {p2}, LP/q;->F2(LP/q;)Lo/F;

    move-result-object p2

    invoke-virtual {p2, p1}, Lo/F;->g(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, LP/q$a$a;->a:LP/q;

    iget-object v0, p0, LP/q$a$a;->b:LIi/N;

    invoke-static {p2, p1, v0}, LP/q;->H2(LP/q;Ly/j;LIi/N;)V

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
