.class final LBc/f$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f;->D(I)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LBc/f;

.field final synthetic b:I


# direct methods
.method constructor <init>(LBc/f;I)V
    .locals 0

    iput-object p1, p0, LBc/f$x;->a:LBc/f;

    iput p2, p0, LBc/f$x;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/f$c;)Lgg/D;
    .locals 2

    const-string v0, "requirements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LBc/f$c$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, LBc/f$x;->a:LBc/f;

    iget v0, p0, LBc/f$x;->b:I

    invoke-static {p1, v0}, LBc/f;->p(LBc/f;I)Lgg/z;

    move-result-object p1

    new-instance v0, LBc/f$x$a;

    iget v1, p0, LBc/f$x;->b:I

    invoke-direct {v0, v1}, LBc/f$x$a;-><init>(I)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LBc/f$c$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, LBc/f$x;->a:LBc/f;

    new-instance v1, LBc/f$x$b;

    invoke-direct {v1, v0, p1}, LBc/f$x$b;-><init>(LBc/f;LBc/f$c;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/f$c;

    invoke-virtual {p0, p1}, LBc/f$x;->a(LBc/f$c;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
