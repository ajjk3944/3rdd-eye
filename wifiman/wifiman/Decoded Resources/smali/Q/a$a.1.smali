.class final LQ/a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/a;->b(FFFLT/l;II)LQ/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:F


# direct methods
.method constructor <init>(FFF)V
    .locals 0

    iput p1, p0, LQ/a$a;->a:F

    iput p2, p0, LQ/a$a;->b:F

    iput p3, p0, LQ/a$a;->c:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LQ/A;
    .locals 4

    new-instance v0, LQ/A;

    iget v1, p0, LQ/a$a;->a:F

    iget v2, p0, LQ/a$a;->b:F

    iget v3, p0, LQ/a$a;->c:F

    invoke-direct {v0, v1, v2, v3}, LQ/A;-><init>(FFF)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQ/a$a;->a()LQ/A;

    move-result-object v0

    return-object v0
.end method
