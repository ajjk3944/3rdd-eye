.class public final synthetic Lv9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:F

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;FII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv9/c;->a:Landroidx/compose/ui/e;

    iput p2, p0, Lv9/c;->b:F

    iput p3, p0, Lv9/c;->c:I

    iput p4, p0, Lv9/c;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lv9/c;->a:Landroidx/compose/ui/e;

    iget v1, p0, Lv9/c;->b:F

    iget v2, p0, Lv9/c;->c:I

    iget v3, p0, Lv9/c;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lv9/d;->b(Landroidx/compose/ui/e;FIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
