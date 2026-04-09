.class final LN/C0$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/C0;->c(ZILmh/p;Lmh/q;Lmh/p;Lmh/p;Lz/f0;Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:I

.field final synthetic c:Lmh/p;

.field final synthetic d:Lmh/q;

.field final synthetic e:Lmh/p;

.field final synthetic f:Lmh/p;

.field final synthetic g:Lz/f0;

.field final synthetic h:Lmh/p;

.field final synthetic i:I


# direct methods
.method constructor <init>(ZILmh/p;Lmh/q;Lmh/p;Lmh/p;Lz/f0;Lmh/p;I)V
    .locals 0

    iput-boolean p1, p0, LN/C0$g;->a:Z

    iput p2, p0, LN/C0$g;->b:I

    iput-object p3, p0, LN/C0$g;->c:Lmh/p;

    iput-object p4, p0, LN/C0$g;->d:Lmh/q;

    iput-object p5, p0, LN/C0$g;->e:Lmh/p;

    iput-object p6, p0, LN/C0$g;->f:Lmh/p;

    iput-object p7, p0, LN/C0$g;->g:Lz/f0;

    iput-object p8, p0, LN/C0$g;->h:Lmh/p;

    iput p9, p0, LN/C0$g;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    iget-boolean v0, p0, LN/C0$g;->a:Z

    iget v1, p0, LN/C0$g;->b:I

    iget-object v2, p0, LN/C0$g;->c:Lmh/p;

    iget-object v3, p0, LN/C0$g;->d:Lmh/q;

    iget-object v4, p0, LN/C0$g;->e:Lmh/p;

    iget-object v5, p0, LN/C0$g;->f:Lmh/p;

    iget-object v6, p0, LN/C0$g;->g:Lz/f0;

    iget-object v7, p0, LN/C0$g;->h:Lmh/p;

    iget p2, p0, LN/C0$g;->i:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v9

    move-object v8, p1

    invoke-static/range {v0 .. v9}, LN/C0;->d(ZILmh/p;Lmh/q;Lmh/p;Lmh/p;Lz/f0;Lmh/p;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/C0$g;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
