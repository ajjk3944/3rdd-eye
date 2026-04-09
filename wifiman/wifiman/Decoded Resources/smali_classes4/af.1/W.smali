.class public final synthetic Laf/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Laf/P;

.field public final synthetic c:Lmh/l;

.field public final synthetic d:Lmh/l;

.field public final synthetic e:Lmh/a;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Laf/P;Lmh/l;Lmh/l;Lmh/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/W;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Laf/W;->b:Laf/P;

    iput-object p3, p0, Laf/W;->c:Lmh/l;

    iput-object p4, p0, Laf/W;->d:Lmh/l;

    iput-object p5, p0, Laf/W;->e:Lmh/a;

    iput p6, p0, Laf/W;->f:I

    iput p7, p0, Laf/W;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Laf/W;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Laf/W;->b:Laf/P;

    iget-object v2, p0, Laf/W;->c:Lmh/l;

    iget-object v3, p0, Laf/W;->d:Lmh/l;

    iget-object v4, p0, Laf/W;->e:Lmh/a;

    iget v5, p0, Laf/W;->f:I

    iget v6, p0, Laf/W;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Laf/d0;->d(Landroidx/compose/ui/e;Laf/P;Lmh/l;Lmh/l;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
