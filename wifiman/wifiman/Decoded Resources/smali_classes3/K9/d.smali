.class public final synthetic LK9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ls9/c;

.field public final synthetic d:Z

.field public final synthetic e:Lmh/a;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK9/d;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LK9/d;->b:Ljava/lang/String;

    iput-object p3, p0, LK9/d;->c:Ls9/c;

    iput-boolean p4, p0, LK9/d;->d:Z

    iput-object p5, p0, LK9/d;->e:Lmh/a;

    iput p6, p0, LK9/d;->f:I

    iput p7, p0, LK9/d;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LK9/d;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LK9/d;->b:Ljava/lang/String;

    iget-object v2, p0, LK9/d;->c:Ls9/c;

    iget-boolean v3, p0, LK9/d;->d:Z

    iget-object v4, p0, LK9/d;->e:Lmh/a;

    iget v5, p0, LK9/d;->f:I

    iget v6, p0, LK9/d;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LK9/g;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
