.class final Lg2/m$p;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m;->a(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/w;

.field final synthetic b:Lf2/t;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Lf0/c;

.field final synthetic e:Lmh/l;

.field final synthetic f:Lmh/l;

.field final synthetic g:Lmh/l;

.field final synthetic h:Lmh/l;

.field final synthetic i:Lmh/l;

.field final synthetic j:I

.field final synthetic k:I


# direct methods
.method constructor <init>(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;II)V
    .locals 0

    iput-object p1, p0, Lg2/m$p;->a:Lf2/w;

    iput-object p2, p0, Lg2/m$p;->b:Lf2/t;

    iput-object p3, p0, Lg2/m$p;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, Lg2/m$p;->d:Lf0/c;

    iput-object p5, p0, Lg2/m$p;->e:Lmh/l;

    iput-object p6, p0, Lg2/m$p;->f:Lmh/l;

    iput-object p7, p0, Lg2/m$p;->g:Lmh/l;

    iput-object p8, p0, Lg2/m$p;->h:Lmh/l;

    iput-object p9, p0, Lg2/m$p;->i:Lmh/l;

    iput p10, p0, Lg2/m$p;->j:I

    iput p11, p0, Lg2/m$p;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 12

    iget-object v0, p0, Lg2/m$p;->a:Lf2/w;

    iget-object v1, p0, Lg2/m$p;->b:Lf2/t;

    iget-object v2, p0, Lg2/m$p;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Lg2/m$p;->d:Lf0/c;

    iget-object v4, p0, Lg2/m$p;->e:Lmh/l;

    iget-object v5, p0, Lg2/m$p;->f:Lmh/l;

    iget-object v6, p0, Lg2/m$p;->g:Lmh/l;

    iget-object v7, p0, Lg2/m$p;->h:Lmh/l;

    iget-object v8, p0, Lg2/m$p;->i:Lmh/l;

    iget p2, p0, Lg2/m$p;->j:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v10

    iget v11, p0, Lg2/m$p;->k:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, Lg2/m;->a(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lg2/m$p;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
