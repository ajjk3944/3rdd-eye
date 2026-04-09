.class final LI/Z0$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/Z0;->deleteSurroundingTextInCodePoints(II)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    iput p1, p0, LI/Z0$d;->a:I

    iput p2, p0, LI/Z0$d;->b:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LI/I;)V
    .locals 2

    iget v0, p0, LI/Z0$d;->a:I

    iget v1, p0, LI/Z0$d;->b:I

    invoke-static {p1, v0, v1}, LI/H;->d(LI/I;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI/I;

    invoke-virtual {p0, p1}, LI/Z0$d;->a(LI/I;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
