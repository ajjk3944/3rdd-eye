.class public final synthetic LS6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lmh/l;

.field public final synthetic c:Landroidx/compose/ui/e;

.field public final synthetic d:LS6/k;

.field public final synthetic e:LU6/a;

.field public final synthetic f:Lmh/r;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lmh/l;Landroidx/compose/ui/e;LS6/k;LU6/a;Lmh/r;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS6/h;->a:Ljava/lang/Object;

    iput-object p2, p0, LS6/h;->b:Lmh/l;

    iput-object p3, p0, LS6/h;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, LS6/h;->d:LS6/k;

    iput-object p5, p0, LS6/h;->e:LU6/a;

    iput-object p6, p0, LS6/h;->f:Lmh/r;

    iput p7, p0, LS6/h;->g:I

    iput p8, p0, LS6/h;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, LS6/h;->a:Ljava/lang/Object;

    iget-object v1, p0, LS6/h;->b:Lmh/l;

    iget-object v2, p0, LS6/h;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, LS6/h;->d:LS6/k;

    iget-object v4, p0, LS6/h;->e:LU6/a;

    iget-object v5, p0, LS6/h;->f:Lmh/r;

    iget v6, p0, LS6/h;->g:I

    iget v7, p0, LS6/h;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, LS6/i;->a(Ljava/lang/Object;Lmh/l;Landroidx/compose/ui/e;LS6/k;LU6/a;Lmh/r;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
