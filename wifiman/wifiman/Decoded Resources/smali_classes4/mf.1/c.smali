.class public final synthetic Lmf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/d;

.field public final synthetic c:Ls9/d;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/d;Ls9/d;ZZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf/c;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lmf/c;->b:Ls9/d;

    iput-object p3, p0, Lmf/c;->c:Ls9/d;

    iput-boolean p4, p0, Lmf/c;->d:Z

    iput-boolean p5, p0, Lmf/c;->e:Z

    iput p6, p0, Lmf/c;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lmf/c;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lmf/c;->b:Ls9/d;

    iget-object v2, p0, Lmf/c;->c:Ls9/d;

    iget-boolean v3, p0, Lmf/c;->d:Z

    iget-boolean v4, p0, Lmf/c;->e:Z

    iget v5, p0, Lmf/c;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lmf/d;->b(Landroidx/compose/ui/e;Ls9/d;Ls9/d;ZZILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
