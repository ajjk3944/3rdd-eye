.class final LN/G$a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G$a;->a(Lz/f;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:LN/H;


# direct methods
.method constructor <init>(FFLN/H;)V
    .locals 0

    iput p1, p0, LN/G$a$c;->a:F

    iput p2, p0, LN/G$a$c;->b:F

    iput-object p3, p0, LN/G$a$c;->c:LN/H;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 3

    iget v0, p0, LN/G$a$c;->a:F

    iget v1, p0, LN/G$a$c;->b:F

    iget-object v2, p0, LN/G$a$c;->c:LN/H;

    invoke-virtual {v2}, LN/H;->g()F

    move-result v2

    invoke-static {v0, v1, v2}, LN/G;->d(FFF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/G$a$c;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
