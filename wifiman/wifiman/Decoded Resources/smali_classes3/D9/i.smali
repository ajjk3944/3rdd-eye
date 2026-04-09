.class public final synthetic LD9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LD9/o;

.field public final synthetic b:Landroidx/compose/ui/window/r;

.field public final synthetic c:Lmh/a;

.field public final synthetic d:Lmh/p;

.field public final synthetic e:Lmh/q;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;Lmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD9/i;->a:LD9/o;

    iput-object p2, p0, LD9/i;->b:Landroidx/compose/ui/window/r;

    iput-object p3, p0, LD9/i;->c:Lmh/a;

    iput-object p4, p0, LD9/i;->d:Lmh/p;

    iput-object p5, p0, LD9/i;->e:Lmh/q;

    iput p6, p0, LD9/i;->f:I

    iput p7, p0, LD9/i;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LD9/i;->a:LD9/o;

    iget-object v1, p0, LD9/i;->b:Landroidx/compose/ui/window/r;

    iget-object v2, p0, LD9/i;->c:Lmh/a;

    iget-object v3, p0, LD9/i;->d:Lmh/p;

    iget-object v4, p0, LD9/i;->e:Lmh/q;

    iget v5, p0, LD9/i;->f:I

    iget v6, p0, LD9/i;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LD9/k;->a(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
