.class final LC/r$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/r;->h(ILjava/lang/Object;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/r;

.field final synthetic b:I

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:I


# direct methods
.method constructor <init>(LC/r;ILjava/lang/Object;I)V
    .locals 0

    iput-object p1, p0, LC/r$b;->a:LC/r;

    iput p2, p0, LC/r$b;->b:I

    iput-object p3, p0, LC/r$b;->c:Ljava/lang/Object;

    iput p4, p0, LC/r$b;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 3

    iget-object p2, p0, LC/r$b;->a:LC/r;

    iget v0, p0, LC/r$b;->b:I

    iget-object v1, p0, LC/r$b;->c:Ljava/lang/Object;

    iget v2, p0, LC/r$b;->d:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, LT/L0;->a(I)I

    move-result v2

    invoke-virtual {p2, v0, v1, p1, v2}, LC/r;->h(ILjava/lang/Object;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LC/r$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
