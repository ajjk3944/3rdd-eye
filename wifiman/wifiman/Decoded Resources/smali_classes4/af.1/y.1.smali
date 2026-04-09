.class public final synthetic Laf/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Laf/z;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:Ls9/d;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Laf/z;Landroidx/compose/ui/e;Ls9/d;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/y;->a:Laf/z;

    iput-object p2, p0, Laf/y;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, Laf/y;->c:Ls9/d;

    iput p4, p0, Laf/y;->d:I

    iput p5, p0, Laf/y;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Laf/y;->a:Laf/z;

    iget-object v1, p0, Laf/y;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Laf/y;->c:Ls9/d;

    iget v3, p0, Laf/y;->d:I

    iget v4, p0, Laf/y;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Laf/z;->a(Laf/z;Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
