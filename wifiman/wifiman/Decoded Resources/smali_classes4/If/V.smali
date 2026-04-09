.class public final synthetic LIf/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LIf/U;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LIf/U;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIf/V;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LIf/V;->b:LIf/U;

    iput p3, p0, LIf/V;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LIf/V;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LIf/V;->b:LIf/U;

    iget v2, p0, LIf/V;->c:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, LIf/W;->a(Landroidx/compose/ui/e;LIf/U;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
