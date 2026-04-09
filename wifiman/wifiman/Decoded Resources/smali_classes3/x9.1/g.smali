.class public final synthetic Lx9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LK0/a;

.field public final synthetic b:Lmh/a;

.field public final synthetic c:Landroidx/compose/ui/e;

.field public final synthetic d:Z

.field public final synthetic e:Ly/m;

.field public final synthetic f:Lx9/c;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lx9/c;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/g;->a:LK0/a;

    iput-object p2, p0, Lx9/g;->b:Lmh/a;

    iput-object p3, p0, Lx9/g;->c:Landroidx/compose/ui/e;

    iput-boolean p4, p0, Lx9/g;->d:Z

    iput-object p5, p0, Lx9/g;->e:Ly/m;

    iput-object p6, p0, Lx9/g;->f:Lx9/c;

    iput p7, p0, Lx9/g;->g:I

    iput p8, p0, Lx9/g;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lx9/g;->a:LK0/a;

    iget-object v1, p0, Lx9/g;->b:Lmh/a;

    iget-object v2, p0, Lx9/g;->c:Landroidx/compose/ui/e;

    iget-boolean v3, p0, Lx9/g;->d:Z

    iget-object v4, p0, Lx9/g;->e:Ly/m;

    iget-object v5, p0, Lx9/g;->f:Lx9/c;

    iget v6, p0, Lx9/g;->g:I

    iget v7, p0, Lx9/g;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lx9/h;->c(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lx9/c;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
