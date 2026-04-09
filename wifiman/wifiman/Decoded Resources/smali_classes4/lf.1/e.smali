.class public final synthetic Llf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Llf/k$b;

.field public final synthetic c:Llf/l;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Llf/k$b;Llf/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llf/e;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Llf/e;->b:Llf/k$b;

    iput-object p3, p0, Llf/e;->c:Llf/l;

    iput p4, p0, Llf/e;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Llf/e;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Llf/e;->b:Llf/k$b;

    iget-object v2, p0, Llf/e;->c:Llf/l;

    iget v3, p0, Llf/e;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Llf/f;->a(Landroidx/compose/ui/e;Llf/k$b;Llf/l;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
