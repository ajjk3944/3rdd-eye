.class final Lg2/g$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/g$b;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/runtime/snapshots/k;

.field final synthetic b:Lf2/k;

.field final synthetic c:Lg2/i;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/k;Lf2/k;Lg2/i;)V
    .locals 0

    iput-object p1, p0, Lg2/g$b$a;->a:Landroidx/compose/runtime/snapshots/k;

    iput-object p2, p0, Lg2/g$b$a;->b:Lf2/k;

    iput-object p3, p0, Lg2/g$b$a;->c:Lg2/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 3

    iget-object p1, p0, Lg2/g$b$a;->a:Landroidx/compose/runtime/snapshots/k;

    iget-object v0, p0, Lg2/g$b$a;->b:Lf2/k;

    invoke-virtual {p1, v0}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lg2/g$b$a;->c:Lg2/i;

    iget-object v0, p0, Lg2/g$b$a;->b:Lf2/k;

    iget-object v1, p0, Lg2/g$b$a;->a:Landroidx/compose/runtime/snapshots/k;

    new-instance v2, Lg2/g$b$a$a;

    invoke-direct {v2, p1, v0, v1}, Lg2/g$b$a$a;-><init>(Lg2/i;Lf2/k;Landroidx/compose/runtime/snapshots/k;)V

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Lg2/g$b$a;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
