.class public final synthetic LKe/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/a;

.field public final synthetic c:Ls9/d;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/a;Ls9/d;Lmh/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKe/j;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LKe/j;->b:Ls9/a;

    iput-object p3, p0, LKe/j;->c:Ls9/d;

    iput-object p4, p0, LKe/j;->d:Lmh/a;

    iput p5, p0, LKe/j;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LKe/j;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LKe/j;->b:Ls9/a;

    iget-object v2, p0, LKe/j;->c:Ls9/d;

    iget-object v3, p0, LKe/j;->d:Lmh/a;

    iget v4, p0, LKe/j;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LKe/k;->a(Landroidx/compose/ui/e;Ls9/a;Ls9/d;Lmh/a;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
