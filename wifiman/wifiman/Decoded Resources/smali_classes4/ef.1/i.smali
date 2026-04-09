.class public final synthetic Lef/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ls9/d;

.field public final synthetic d:I

.field public final synthetic e:Lmh/l;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/d;ILmh/l;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lef/i;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lef/i;->b:Ljava/lang/String;

    iput-object p3, p0, Lef/i;->c:Ls9/d;

    iput p4, p0, Lef/i;->d:I

    iput-object p5, p0, Lef/i;->e:Lmh/l;

    iput p6, p0, Lef/i;->f:I

    iput p7, p0, Lef/i;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lef/i;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lef/i;->b:Ljava/lang/String;

    iget-object v2, p0, Lef/i;->c:Ls9/d;

    iget v3, p0, Lef/i;->d:I

    iget-object v4, p0, Lef/i;->e:Lmh/l;

    iget v5, p0, Lef/i;->f:I

    iget v6, p0, Lef/i;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lef/j;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/d;ILmh/l;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
