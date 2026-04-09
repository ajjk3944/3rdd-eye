.class public final synthetic LIf/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/d;

.field public final synthetic c:I

.field public final synthetic d:Lf0/c$b;

.field public final synthetic e:Lmh/q;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/d;ILf0/c$b;Lmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIf/s;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LIf/s;->b:Ls9/d;

    iput p3, p0, LIf/s;->c:I

    iput-object p4, p0, LIf/s;->d:Lf0/c$b;

    iput-object p5, p0, LIf/s;->e:Lmh/q;

    iput p6, p0, LIf/s;->f:I

    iput p7, p0, LIf/s;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LIf/s;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LIf/s;->b:Ls9/d;

    iget v2, p0, LIf/s;->c:I

    iget-object v3, p0, LIf/s;->d:Lf0/c$b;

    iget-object v4, p0, LIf/s;->e:Lmh/q;

    iget v5, p0, LIf/s;->f:I

    iget v6, p0, LIf/s;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LIf/w;->g(Landroidx/compose/ui/e;Ls9/d;ILf0/c$b;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
