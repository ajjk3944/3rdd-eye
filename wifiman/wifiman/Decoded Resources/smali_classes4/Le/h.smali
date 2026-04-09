.class public final synthetic LLe/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLe/h;->a:Landroidx/compose/ui/e;

    iput p2, p0, LLe/h;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LLe/h;->a:Landroidx/compose/ui/e;

    iget v1, p0, LLe/h;->b:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, LLe/j;->c(Landroidx/compose/ui/e;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
