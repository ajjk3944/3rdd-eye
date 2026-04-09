.class final LQ/r$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/r;->b(ILmh/p;Lmh/q;Lmh/p;Lmh/p;Lz/f0;Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lmh/p;

.field final synthetic c:Lmh/q;

.field final synthetic d:Lmh/p;

.field final synthetic e:Lmh/p;

.field final synthetic f:Lz/f0;

.field final synthetic g:Lmh/p;

.field final synthetic h:I


# direct methods
.method constructor <init>(ILmh/p;Lmh/q;Lmh/p;Lmh/p;Lz/f0;Lmh/p;I)V
    .locals 0

    iput p1, p0, LQ/r$e;->a:I

    iput-object p2, p0, LQ/r$e;->b:Lmh/p;

    iput-object p3, p0, LQ/r$e;->c:Lmh/q;

    iput-object p4, p0, LQ/r$e;->d:Lmh/p;

    iput-object p5, p0, LQ/r$e;->e:Lmh/p;

    iput-object p6, p0, LQ/r$e;->f:Lz/f0;

    iput-object p7, p0, LQ/r$e;->g:Lmh/p;

    iput p8, p0, LQ/r$e;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 9

    iget v0, p0, LQ/r$e;->a:I

    iget-object v1, p0, LQ/r$e;->b:Lmh/p;

    iget-object v2, p0, LQ/r$e;->c:Lmh/q;

    iget-object v3, p0, LQ/r$e;->d:Lmh/p;

    iget-object v4, p0, LQ/r$e;->e:Lmh/p;

    iget-object v5, p0, LQ/r$e;->f:Lz/f0;

    iget-object v6, p0, LQ/r$e;->g:Lmh/p;

    iget p2, p0, LQ/r$e;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v8

    move-object v7, p1

    invoke-static/range {v0 .. v8}, LQ/r;->c(ILmh/p;Lmh/q;Lmh/p;Lmh/p;Lz/f0;Lmh/p;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LQ/r$e;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
