.class final Lg2/m$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z1;

.field final synthetic b:LT/q0;

.field final synthetic c:LT/m0;


# direct methods
.method constructor <init>(LT/z1;LT/q0;LT/m0;)V
    .locals 0

    iput-object p1, p0, Lg2/m$d$a;->a:LT/z1;

    iput-object p2, p0, Lg2/m$d$a;->b:LT/q0;

    iput-object p3, p0, Lg2/m$d$a;->c:LT/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc/b;

    invoke-virtual {p0, p1, p2}, Lg2/m$d$a;->b(Lc/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lc/b;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object p2, p0, Lg2/m$d$a;->a:LT/z1;

    invoke-static {p2}, Lg2/m;->n(LT/z1;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x1

    if-le p2, v0, :cond_0

    iget-object p2, p0, Lg2/m$d$a;->b:LT/q0;

    invoke-static {p2, v0}, Lg2/m;->k(LT/q0;Z)V

    iget-object p2, p0, Lg2/m$d$a;->c:LT/m0;

    invoke-virtual {p1}, Lc/b;->a()F

    move-result p1

    invoke-static {p2, p1}, Lg2/m;->p(LT/m0;F)V

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
