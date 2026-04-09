.class public final synthetic Laf/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Laf/q0$a;

.field public final synthetic c:Lmh/l;

.field public final synthetic d:Lmh/l;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Laf/q0$a;Lmh/l;Lmh/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/t0;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Laf/t0;->b:Laf/q0$a;

    iput-object p3, p0, Laf/t0;->c:Lmh/l;

    iput-object p4, p0, Laf/t0;->d:Lmh/l;

    iput p5, p0, Laf/t0;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Laf/t0;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Laf/t0;->b:Laf/q0$a;

    iget-object v2, p0, Laf/t0;->c:Lmh/l;

    iget-object v3, p0, Laf/t0;->d:Lmh/l;

    iget v4, p0, Laf/t0;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Laf/u0;->c(Landroidx/compose/ui/e;Laf/q0$a;Lmh/l;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
