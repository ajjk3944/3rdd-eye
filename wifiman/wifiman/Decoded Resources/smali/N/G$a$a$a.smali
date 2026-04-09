.class final LN/G$a$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G$a$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F


# direct methods
.method constructor <init>(FF)V
    .locals 0

    iput p1, p0, LN/G$a$a$a;->a:F

    iput p2, p0, LN/G$a$a$a;->b:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/E;)V
    .locals 2

    sget-object v0, LN/I;->Closed:LN/I;

    iget v1, p0, LN/G$a$a$a;->a:F

    invoke-virtual {p1, v0, v1}, LN/E;->a(Ljava/lang/Object;F)V

    sget-object v0, LN/I;->Open:LN/I;

    iget v1, p0, LN/G$a$a$a;->b:F

    invoke-virtual {p1, v0, v1}, LN/E;->a(Ljava/lang/Object;F)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/E;

    invoke-virtual {p0, p1}, LN/G$a$a$a;->a(LN/E;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
