.class public final synthetic Lbf/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/runtime/snapshots/k;

.field public final synthetic b:Lbf/k;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/snapshots/k;Lbf/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/s;->a:Landroidx/compose/runtime/snapshots/k;

    iput-object p2, p0, Lbf/s;->b:Lbf/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lbf/s;->a:Landroidx/compose/runtime/snapshots/k;

    iget-object v1, p0, Lbf/s;->b:Lbf/k;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lbf/q$b;->a(Landroidx/compose/runtime/snapshots/k;Lbf/k;II)LYg/J;

    move-result-object p1

    return-object p1
.end method
