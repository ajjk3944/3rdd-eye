.class public final synthetic LHe/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lmh/a;

.field public final synthetic c:Z

.field public final synthetic d:Ls9/d;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lmh/a;ZLs9/d;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHe/h;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LHe/h;->b:Lmh/a;

    iput-boolean p3, p0, LHe/h;->c:Z

    iput-object p4, p0, LHe/h;->d:Ls9/d;

    iput p5, p0, LHe/h;->e:I

    iput p6, p0, LHe/h;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LHe/h;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LHe/h;->b:Lmh/a;

    iget-boolean v2, p0, LHe/h;->c:Z

    iget-object v3, p0, LHe/h;->d:Ls9/d;

    iget v4, p0, LHe/h;->e:I

    iget v5, p0, LHe/h;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LHe/i;->a(Landroidx/compose/ui/e;Lmh/a;ZLs9/d;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
