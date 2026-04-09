.class public final synthetic Laf/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Boolean;

.field public final synthetic d:Ls9/d;

.field public final synthetic e:Lmh/a;

.field public final synthetic f:Lmh/a;

.field public final synthetic g:Lmh/l;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZLjava/lang/Boolean;Ls9/d;Lmh/a;Lmh/a;Lmh/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/g0;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, Laf/g0;->b:Z

    iput-object p3, p0, Laf/g0;->c:Ljava/lang/Boolean;

    iput-object p4, p0, Laf/g0;->d:Ls9/d;

    iput-object p5, p0, Laf/g0;->e:Lmh/a;

    iput-object p6, p0, Laf/g0;->f:Lmh/a;

    iput-object p7, p0, Laf/g0;->g:Lmh/l;

    iput p8, p0, Laf/g0;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Laf/g0;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, Laf/g0;->b:Z

    iget-object v2, p0, Laf/g0;->c:Ljava/lang/Boolean;

    iget-object v3, p0, Laf/g0;->d:Ls9/d;

    iget-object v4, p0, Laf/g0;->e:Lmh/a;

    iget-object v5, p0, Laf/g0;->f:Lmh/a;

    iget-object v6, p0, Laf/g0;->g:Lmh/l;

    iget v7, p0, Laf/g0;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Laf/m0;->c(Landroidx/compose/ui/e;ZLjava/lang/Boolean;Ls9/d;Lmh/a;Lmh/a;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
