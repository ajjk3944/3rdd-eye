.class final LN/L0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/L0;->b(Lmh/p;Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;

.field final synthetic b:Lmh/p;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lmh/p;Lmh/p;I)V
    .locals 0

    iput-object p1, p0, LN/L0$c;->a:Lmh/p;

    iput-object p2, p0, LN/L0$c;->b:Lmh/p;

    iput p3, p0, LN/L0$c;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 2

    iget-object p2, p0, LN/L0$c;->a:Lmh/p;

    iget-object v0, p0, LN/L0$c;->b:Lmh/p;

    iget v1, p0, LN/L0$c;->c:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v1

    invoke-static {p2, v0, p1, v1}, LN/L0;->g(Lmh/p;Lmh/p;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/L0$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
