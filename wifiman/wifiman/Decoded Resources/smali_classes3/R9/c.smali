.class public final synthetic LR9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LR9/a;

.field public final synthetic b:Landroidx/lifecycle/k;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LR9/a;Landroidx/lifecycle/k;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR9/c;->a:LR9/a;

    iput-object p2, p0, LR9/c;->b:Landroidx/lifecycle/k;

    iput p3, p0, LR9/c;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LR9/c;->a:LR9/a;

    iget-object v1, p0, LR9/c;->b:Landroidx/lifecycle/k;

    iget v2, p0, LR9/c;->c:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, LR9/e;->b(LR9/a;Landroidx/lifecycle/k;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
