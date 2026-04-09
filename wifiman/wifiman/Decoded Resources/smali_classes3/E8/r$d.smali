.class final LE8/r$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/r;->p0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/r;


# direct methods
.method constructor <init>(LE8/r;)V
    .locals 0

    iput-object p1, p0, LE8/r$d;->a:LE8/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llf/k;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llf/k$c;

    if-nez v0, :cond_2

    instance-of v0, p1, Llf/k$a;

    if-nez v0, :cond_2

    instance-of v0, p1, Llf/k$b$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, Llf/k$b$b;

    if-eqz p1, :cond_1

    iget-object p1, p0, LE8/r$d;->a:LE8/r;

    invoke-static {p1}, LE8/r;->v0(LE8/r;)Li8/a;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Li8/a$b;

    sget-object v1, Li8/a$b$D$g;->a:Li8/a$b$D$g;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p1, v0}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llf/k;

    invoke-virtual {p0, p1}, LE8/r$d;->a(Llf/k;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
