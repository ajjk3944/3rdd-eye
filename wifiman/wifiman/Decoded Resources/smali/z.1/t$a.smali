.class final Lz/t$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/t;->a(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lz/c$e;

.field final synthetic c:Lz/c$m;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Lz/z;

.field final synthetic g:Lmh/q;

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;II)V
    .locals 0

    iput-object p1, p0, Lz/t$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lz/t$a;->b:Lz/c$e;

    iput-object p3, p0, Lz/t$a;->c:Lz/c$m;

    iput p4, p0, Lz/t$a;->d:I

    iput p5, p0, Lz/t$a;->e:I

    iput-object p6, p0, Lz/t$a;->f:Lz/z;

    iput-object p7, p0, Lz/t$a;->g:Lmh/q;

    iput p8, p0, Lz/t$a;->h:I

    iput p9, p0, Lz/t$a;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    iget-object v0, p0, Lz/t$a;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lz/t$a;->b:Lz/c$e;

    iget-object v2, p0, Lz/t$a;->c:Lz/c$m;

    iget v3, p0, Lz/t$a;->d:I

    iget v4, p0, Lz/t$a;->e:I

    iget-object v5, p0, Lz/t$a;->f:Lz/z;

    iget-object v6, p0, Lz/t$a;->g:Lmh/q;

    iget p2, p0, Lz/t$a;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v8

    iget v9, p0, Lz/t$a;->i:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Lz/t;->a(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lz/t$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
