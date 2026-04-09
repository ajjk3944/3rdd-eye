.class public final synthetic LV6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LS6/r;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:LS6/k;

.field public final synthetic d:LV6/p;

.field public final synthetic e:Z

.field public final synthetic f:LS6/r;

.field public final synthetic g:LS6/r;

.field public final synthetic h:Lmh/r;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(LS6/r;Landroidx/compose/ui/e;LS6/k;LV6/p;ZLS6/r;LS6/r;Lmh/r;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV6/h;->a:LS6/r;

    iput-object p2, p0, LV6/h;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LV6/h;->c:LS6/k;

    iput-object p4, p0, LV6/h;->d:LV6/p;

    iput-boolean p5, p0, LV6/h;->e:Z

    iput-object p6, p0, LV6/h;->f:LS6/r;

    iput-object p7, p0, LV6/h;->g:LS6/r;

    iput-object p8, p0, LV6/h;->h:Lmh/r;

    iput p9, p0, LV6/h;->i:I

    iput p10, p0, LV6/h;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, LV6/h;->a:LS6/r;

    iget-object v1, p0, LV6/h;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LV6/h;->c:LS6/k;

    iget-object v3, p0, LV6/h;->d:LV6/p;

    iget-boolean v4, p0, LV6/h;->e:Z

    iget-object v5, p0, LV6/h;->f:LS6/r;

    iget-object v6, p0, LV6/h;->g:LS6/r;

    iget-object v7, p0, LV6/h;->h:Lmh/r;

    iget v8, p0, LV6/h;->i:I

    iget v9, p0, LV6/h;->j:I

    move-object v10, p1

    check-cast v10, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, LV6/m;->b(LS6/r;Landroidx/compose/ui/e;LS6/k;LV6/p;ZLS6/r;LS6/r;Lmh/r;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
