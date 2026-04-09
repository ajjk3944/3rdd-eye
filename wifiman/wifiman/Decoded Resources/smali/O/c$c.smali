.class final LO/c$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO/c;->b(LO/g;JLandroidx/compose/ui/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LO/g;

.field final synthetic b:J

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:I


# direct methods
.method constructor <init>(LO/g;JLandroidx/compose/ui/e;I)V
    .locals 0

    iput-object p1, p0, LO/c$c;->a:LO/g;

    iput-wide p2, p0, LO/c$c;->b:J

    iput-object p4, p0, LO/c$c;->c:Landroidx/compose/ui/e;

    iput p5, p0, LO/c$c;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 6

    iget-object v0, p0, LO/c$c;->a:LO/g;

    iget-wide v1, p0, LO/c$c;->b:J

    iget-object v3, p0, LO/c$c;->c:Landroidx/compose/ui/e;

    iget p2, p0, LO/c$c;->d:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LO/c;->g(LO/g;JLandroidx/compose/ui/e;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LO/c$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
