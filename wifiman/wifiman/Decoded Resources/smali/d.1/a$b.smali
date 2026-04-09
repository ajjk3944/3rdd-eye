.class final Ld/a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/a;->a(ZLmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/G;

.field final synthetic b:Landroidx/lifecycle/o;

.field final synthetic c:Ld/a$d;


# direct methods
.method constructor <init>(Lc/G;Landroidx/lifecycle/o;Ld/a$d;)V
    .locals 0

    iput-object p1, p0, Ld/a$b;->a:Lc/G;

    iput-object p2, p0, Ld/a$b;->b:Landroidx/lifecycle/o;

    iput-object p3, p0, Ld/a$b;->c:Ld/a$d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 2

    iget-object p1, p0, Ld/a$b;->a:Lc/G;

    iget-object v0, p0, Ld/a$b;->b:Landroidx/lifecycle/o;

    iget-object v1, p0, Ld/a$b;->c:Ld/a$d;

    invoke-virtual {p1, v0, v1}, Lc/G;->h(Landroidx/lifecycle/o;Lc/F;)V

    iget-object p1, p0, Ld/a$b;->c:Ld/a$d;

    new-instance v0, Ld/a$b$a;

    invoke-direct {v0, p1}, Ld/a$b$a;-><init>(Ld/a$d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Ld/a$b;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
