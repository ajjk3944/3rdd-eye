.class final LE0/c0$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/c0;->N2(Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/c0;

.field final synthetic b:Landroidx/compose/ui/e$c;

.field final synthetic c:LE0/c0$f;

.field final synthetic d:J

.field final synthetic e:LE0/u;

.field final synthetic f:Z

.field final synthetic g:Z


# direct methods
.method constructor <init>(LE0/c0;Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZ)V
    .locals 0

    iput-object p1, p0, LE0/c0$h;->a:LE0/c0;

    iput-object p2, p0, LE0/c0$h;->b:Landroidx/compose/ui/e$c;

    iput-object p3, p0, LE0/c0$h;->c:LE0/c0$f;

    iput-wide p4, p0, LE0/c0$h;->d:J

    iput-object p6, p0, LE0/c0$h;->e:LE0/u;

    iput-boolean p7, p0, LE0/c0$h;->f:Z

    iput-boolean p8, p0, LE0/c0$h;->g:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget-object v0, p0, LE0/c0$h;->a:LE0/c0;

    iget-object v1, p0, LE0/c0$h;->b:Landroidx/compose/ui/e$c;

    iget-object v2, p0, LE0/c0$h;->c:LE0/c0$f;

    invoke-interface {v2}, LE0/c0$f;->b()I

    move-result v2

    const/4 v3, 0x2

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    invoke-static {v1, v2, v3}, LE0/d0;->a(LE0/j;II)Landroidx/compose/ui/e$c;

    move-result-object v1

    iget-object v2, p0, LE0/c0$h;->c:LE0/c0$f;

    iget-wide v3, p0, LE0/c0$h;->d:J

    iget-object v5, p0, LE0/c0$h;->e:LE0/u;

    iget-boolean v6, p0, LE0/c0$h;->f:Z

    iget-boolean v7, p0, LE0/c0$h;->g:Z

    invoke-static/range {v0 .. v7}, LE0/c0;->g2(LE0/c0;Landroidx/compose/ui/e$c;LE0/c0$f;JLE0/u;ZZ)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/c0$h;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
