.class public final synthetic Laf/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Laf/e0$a$a$a;

.field public final synthetic c:Lmh/a;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Lmh/l;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Laf/e0$a$a$a;Lmh/a;Lmh/a;Lmh/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/h0;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Laf/h0;->b:Laf/e0$a$a$a;

    iput-object p3, p0, Laf/h0;->c:Lmh/a;

    iput-object p4, p0, Laf/h0;->d:Lmh/a;

    iput-object p5, p0, Laf/h0;->e:Lmh/l;

    iput p6, p0, Laf/h0;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Laf/h0;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Laf/h0;->b:Laf/e0$a$a$a;

    iget-object v2, p0, Laf/h0;->c:Lmh/a;

    iget-object v3, p0, Laf/h0;->d:Lmh/a;

    iget-object v4, p0, Laf/h0;->e:Lmh/l;

    iget v5, p0, Laf/h0;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Laf/m0;->b(Landroidx/compose/ui/e;Laf/e0$a$a$a;Lmh/a;Lmh/a;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
