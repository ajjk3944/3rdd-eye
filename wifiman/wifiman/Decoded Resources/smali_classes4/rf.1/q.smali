.class public final synthetic Lrf/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lz/d;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Ls9/d;

.field public final synthetic e:Ls9/d;

.field public final synthetic f:LT/z1;

.field public final synthetic g:LN/R0;

.field public final synthetic h:Ly/k;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/q;->a:Lz/d;

    iput p2, p0, Lrf/q;->b:F

    iput p3, p0, Lrf/q;->c:F

    iput-object p4, p0, Lrf/q;->d:Ls9/d;

    iput-object p5, p0, Lrf/q;->e:Ls9/d;

    iput-object p6, p0, Lrf/q;->f:LT/z1;

    iput-object p7, p0, Lrf/q;->g:LN/R0;

    iput-object p8, p0, Lrf/q;->h:Ly/k;

    iput p9, p0, Lrf/q;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lrf/q;->a:Lz/d;

    iget v1, p0, Lrf/q;->b:F

    iget v2, p0, Lrf/q;->c:F

    iget-object v3, p0, Lrf/q;->d:Ls9/d;

    iget-object v4, p0, Lrf/q;->e:Ls9/d;

    iget-object v5, p0, Lrf/q;->f:LT/z1;

    iget-object v6, p0, Lrf/q;->g:LN/R0;

    iget-object v7, p0, Lrf/q;->h:Ly/k;

    iget v8, p0, Lrf/q;->i:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lrf/v;->f(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
