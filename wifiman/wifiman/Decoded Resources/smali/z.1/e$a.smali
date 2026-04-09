.class final Lz/e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/e;->a(Landroidx/compose/ui/e;Lf0/c;ZLmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC0/C;

.field final synthetic b:Lmh/q;


# direct methods
.method constructor <init>(LC0/C;Lmh/q;)V
    .locals 0

    iput-object p1, p0, Lz/e$a;->a:LC0/C;

    iput-object p2, p0, Lz/e$a;->b:Lmh/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC0/U;J)LC0/D;
    .locals 4

    new-instance v0, Lz/g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lz/g;-><init>(LY0/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, LYg/J;->a:LYg/J;

    new-instance v2, Lz/e$a$a;

    iget-object v3, p0, Lz/e$a;->b:Lmh/q;

    invoke-direct {v2, v3, v0}, Lz/e$a$a;-><init>(Lmh/q;Lz/g;)V

    const v0, -0x73eea2c7

    const/4 v3, 0x1

    invoke-static {v0, v3, v2}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lz/e$a;->a:LC0/C;

    invoke-interface {v1, p1, v0, p2, p3}, LC0/C;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LC0/U;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lz/e$a;->a(LC0/U;J)LC0/D;

    move-result-object p1

    return-object p1
.end method
