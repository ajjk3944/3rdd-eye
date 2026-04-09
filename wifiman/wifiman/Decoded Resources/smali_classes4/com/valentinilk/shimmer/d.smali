.class final Lcom/valentinilk/shimmer/d;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/r;
.implements LE0/t;


# instance fields
.field private n:LVf/c;

.field private o:LVf/d;


# direct methods
.method public constructor <init>(LVf/c;LVf/d;)V
    .locals 1

    const-string v0, "area"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "effect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Lcom/valentinilk/shimmer/d;->n:LVf/c;

    iput-object p2, p0, Lcom/valentinilk/shimmer/d;->o:LVf/d;

    return-void
.end method


# virtual methods
.method public B(LC0/r;)V
    .locals 1

    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LVf/k;->a(LC0/r;)Ll0/i;

    move-result-object p1

    iget-object v0, p0, Lcom/valentinilk/shimmer/d;->n:LVf/c;

    invoke-virtual {v0, p1}, LVf/c;->h(Ll0/i;)V

    return-void
.end method

.method public final D2(LVf/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/valentinilk/shimmer/d;->n:LVf/c;

    return-void
.end method

.method public final E2(LVf/d;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/valentinilk/shimmer/d;->o:LVf/d;

    return-void
.end method

.method public J(Lo0/c;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/valentinilk/shimmer/d;->o:LVf/d;

    iget-object v1, p0, Lcom/valentinilk/shimmer/d;->n:LVf/c;

    invoke-virtual {v0, p1, v1}, LVf/d;->a(Lo0/c;LVf/c;)V

    return-void
.end method
