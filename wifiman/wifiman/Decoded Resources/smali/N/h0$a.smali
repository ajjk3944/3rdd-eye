.class final LN/h0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/h0;->a(Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;

.field final synthetic b:I


# direct methods
.method constructor <init>(Lmh/p;I)V
    .locals 0

    iput-object p1, p0, LN/h0$a;->a:Lmh/p;

    iput p2, p0, LN/h0$a;->b:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 1

    iget-object p2, p0, LN/h0$a;->a:Lmh/p;

    iget v0, p0, LN/h0$a;->b:I

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v0

    invoke-static {p2, p1, v0}, LN/h0;->a(Lmh/p;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/h0$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
