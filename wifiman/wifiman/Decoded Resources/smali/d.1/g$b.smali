.class final Ld/g$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/g;->a(ZLmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/G;

.field final synthetic b:Landroidx/lifecycle/o;

.field final synthetic c:Ld/f;


# direct methods
.method constructor <init>(Lc/G;Landroidx/lifecycle/o;Ld/f;)V
    .locals 0

    iput-object p1, p0, Ld/g$b;->a:Lc/G;

    iput-object p2, p0, Ld/g$b;->b:Landroidx/lifecycle/o;

    iput-object p3, p0, Ld/g$b;->c:Ld/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 2

    iget-object p1, p0, Ld/g$b;->a:Lc/G;

    iget-object v0, p0, Ld/g$b;->b:Landroidx/lifecycle/o;

    iget-object v1, p0, Ld/g$b;->c:Ld/f;

    invoke-virtual {p1, v0, v1}, Lc/G;->h(Landroidx/lifecycle/o;Lc/F;)V

    iget-object p1, p0, Ld/g$b;->c:Ld/f;

    new-instance v0, Ld/g$b$a;

    invoke-direct {v0, p1}, Ld/g$b$a;-><init>(Ld/f;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Ld/g$b;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
