.class final Ls/F$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/F;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr0/d;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Lf0/c;

.field final synthetic e:LC0/h;

.field final synthetic f:F

.field final synthetic g:Lm0/w0;

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;II)V
    .locals 0

    iput-object p1, p0, Ls/F$b;->a:Lr0/d;

    iput-object p2, p0, Ls/F$b;->b:Ljava/lang/String;

    iput-object p3, p0, Ls/F$b;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, Ls/F$b;->d:Lf0/c;

    iput-object p5, p0, Ls/F$b;->e:LC0/h;

    iput p6, p0, Ls/F$b;->f:F

    iput-object p7, p0, Ls/F$b;->g:Lm0/w0;

    iput p8, p0, Ls/F$b;->h:I

    iput p9, p0, Ls/F$b;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    iget-object v0, p0, Ls/F$b;->a:Lr0/d;

    iget-object v1, p0, Ls/F$b;->b:Ljava/lang/String;

    iget-object v2, p0, Ls/F$b;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Ls/F$b;->d:Lf0/c;

    iget-object v4, p0, Ls/F$b;->e:LC0/h;

    iget v5, p0, Ls/F$b;->f:F

    iget-object v6, p0, Ls/F$b;->g:Lm0/w0;

    iget p2, p0, Ls/F$b;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v8

    iget v9, p0, Ls/F$b;->i:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Ls/F;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ls/F$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
