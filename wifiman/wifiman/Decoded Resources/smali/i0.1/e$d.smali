.class public final Li0/e$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/e;->G0(Li0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Li0/e;

.field final synthetic c:Li0/b;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/N;Li0/e;Li0/b;)V
    .locals 0

    iput-object p1, p0, Li0/e$d;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Li0/e$d;->b:Li0/e;

    iput-object p3, p0, Li0/e$d;->c:Li0/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/A0;)LE0/z0;
    .locals 3

    move-object v0, p1

    check-cast v0, Li0/e;

    iget-object v1, p0, Li0/e$d;->b:Li0/e;

    invoke-static {v1}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v1

    invoke-interface {v1}, LE0/m0;->getDragAndDropManager()Li0/c;

    move-result-object v1

    invoke-interface {v1, v0}, Li0/c;->a(Li0/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Li0/e$d;->c:Li0/b;

    invoke-static {v1}, Li0/i;->a(Li0/b;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Li0/f;->b(Li0/d;J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li0/e$d;->a:Lkotlin/jvm/internal/N;

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object p1, LE0/z0;->CancelTraversal:LE0/z0;

    return-object p1

    :cond_0
    sget-object p1, LE0/z0;->ContinueTraversal:LE0/z0;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/A0;

    invoke-virtual {p0, p1}, Li0/e$d;->a(LE0/A0;)LE0/z0;

    move-result-object p1

    return-object p1
.end method
