.class public final synthetic LTe/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LTe/p;

.field public final synthetic c:Lmh/a;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Lmh/a;

.field public final synthetic f:Lmh/a;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LTe/p;Lmh/a;Lmh/a;Lmh/a;Lmh/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/q;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LTe/q;->b:LTe/p;

    iput-object p3, p0, LTe/q;->c:Lmh/a;

    iput-object p4, p0, LTe/q;->d:Lmh/a;

    iput-object p5, p0, LTe/q;->e:Lmh/a;

    iput-object p6, p0, LTe/q;->f:Lmh/a;

    iput p7, p0, LTe/q;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LTe/q;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LTe/q;->b:LTe/p;

    iget-object v2, p0, LTe/q;->c:Lmh/a;

    iget-object v3, p0, LTe/q;->d:Lmh/a;

    iget-object v4, p0, LTe/q;->e:Lmh/a;

    iget-object v5, p0, LTe/q;->f:Lmh/a;

    iget v6, p0, LTe/q;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LTe/t;->a(Landroidx/compose/ui/e;LTe/p;Lmh/a;Lmh/a;Lmh/a;Lmh/a;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
