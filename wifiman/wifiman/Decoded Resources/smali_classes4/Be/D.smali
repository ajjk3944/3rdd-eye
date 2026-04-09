.class public final synthetic LBe/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:J

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;JII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/D;->a:Landroidx/compose/ui/e;

    iput-wide p2, p0, LBe/D;->b:J

    iput p4, p0, LBe/D;->c:I

    iput p5, p0, LBe/D;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LBe/D;->a:Landroidx/compose/ui/e;

    iget-wide v1, p0, LBe/D;->b:J

    iget v3, p0, LBe/D;->c:I

    iget v4, p0, LBe/D;->d:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LBe/E;->a(Landroidx/compose/ui/e;JIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
