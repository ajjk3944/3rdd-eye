.class public final synthetic Lzf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lzf/f;

.field public final synthetic c:Lmh/l;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lzf/f;Lmh/l;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzf/c;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lzf/c;->b:Lzf/f;

    iput-object p3, p0, Lzf/c;->c:Lmh/l;

    iput p4, p0, Lzf/c;->d:I

    iput p5, p0, Lzf/c;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lzf/c;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lzf/c;->b:Lzf/f;

    iget-object v2, p0, Lzf/c;->c:Lmh/l;

    iget v3, p0, Lzf/c;->d:I

    iget v4, p0, Lzf/c;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lzf/d;->a(Landroidx/compose/ui/e;Lzf/f;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
