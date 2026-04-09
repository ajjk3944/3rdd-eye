.class public final synthetic LAf/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lf0/c;

.field public final synthetic c:Ls9/b;

.field public final synthetic d:Ls9/d;

.field public final synthetic e:Ls9/d;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lf0/c;Ls9/b;Ls9/d;Ls9/d;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAf/t;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LAf/t;->b:Lf0/c;

    iput-object p3, p0, LAf/t;->c:Ls9/b;

    iput-object p4, p0, LAf/t;->d:Ls9/d;

    iput-object p5, p0, LAf/t;->e:Ls9/d;

    iput p6, p0, LAf/t;->f:I

    iput p7, p0, LAf/t;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LAf/t;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LAf/t;->b:Lf0/c;

    iget-object v2, p0, LAf/t;->c:Ls9/b;

    iget-object v3, p0, LAf/t;->d:Ls9/d;

    iget-object v4, p0, LAf/t;->e:Ls9/d;

    iget v5, p0, LAf/t;->f:I

    iget v6, p0, LAf/t;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LAf/u;->a(Landroidx/compose/ui/e;Lf0/c;Ls9/b;Ls9/d;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
