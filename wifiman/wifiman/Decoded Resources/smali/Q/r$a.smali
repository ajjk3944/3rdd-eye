.class final LQ/r$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/r;->a(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/p;Lmh/p;IJJLz/f0;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LR/b;

.field final synthetic b:Lz/f0;


# direct methods
.method constructor <init>(LR/b;Lz/f0;)V
    .locals 0

    iput-object p1, p0, LQ/r$a;->a:LR/b;

    iput-object p2, p0, LQ/r$a;->b:Lz/f0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz/f0;)V
    .locals 2

    iget-object v0, p0, LQ/r$a;->a:LR/b;

    iget-object v1, p0, LQ/r$a;->b:Lz/f0;

    invoke-static {v1, p1}, Lz/h0;->g(Lz/f0;Lz/f0;)Lz/f0;

    move-result-object p1

    invoke-virtual {v0, p1}, LR/b;->f(Lz/f0;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f0;

    invoke-virtual {p0, p1}, LQ/r$a;->a(Lz/f0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
