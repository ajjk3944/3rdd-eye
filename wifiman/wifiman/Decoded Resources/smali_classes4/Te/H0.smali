.class public final synthetic LTe/H0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/a;

.field public final synthetic c:Ls9/d;

.field public final synthetic d:Z

.field public final synthetic e:LCi/c;

.field public final synthetic f:Ls9/d;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/a;Ls9/d;ZLCi/c;Ls9/d;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/H0;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LTe/H0;->b:Ls9/a;

    iput-object p3, p0, LTe/H0;->c:Ls9/d;

    iput-boolean p4, p0, LTe/H0;->d:Z

    iput-object p5, p0, LTe/H0;->e:LCi/c;

    iput-object p6, p0, LTe/H0;->f:Ls9/d;

    iput p7, p0, LTe/H0;->g:I

    iput p8, p0, LTe/H0;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, LTe/H0;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LTe/H0;->b:Ls9/a;

    iget-object v2, p0, LTe/H0;->c:Ls9/d;

    iget-boolean v3, p0, LTe/H0;->d:Z

    iget-object v4, p0, LTe/H0;->e:LCi/c;

    iget-object v5, p0, LTe/H0;->f:Ls9/d;

    iget v6, p0, LTe/H0;->g:I

    iget v7, p0, LTe/H0;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, LTe/J0;->b(Landroidx/compose/ui/e;Ls9/a;Ls9/d;ZLCi/c;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
