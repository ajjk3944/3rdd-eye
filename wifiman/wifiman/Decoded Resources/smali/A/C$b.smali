.class final LA/C$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/C;->c(IILT/l;II)LA/B;
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

    iput p1, p0, LA/C$b;->a:I

    iput p2, p0, LA/C$b;->b:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LA/B;
    .locals 3

    new-instance v0, LA/B;

    iget v1, p0, LA/C$b;->a:I

    iget v2, p0, LA/C$b;->b:I

    invoke-direct {v0, v1, v2}, LA/B;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LA/C$b;->a()LA/B;

    move-result-object v0

    return-object v0
.end method
