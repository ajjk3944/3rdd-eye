.class public final synthetic LBe/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/t;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LBe/t;->b:Ljava/lang/String;

    iput-wide p3, p0, LBe/t;->c:J

    iput p5, p0, LBe/t;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LBe/t;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LBe/t;->b:Ljava/lang/String;

    iget-wide v2, p0, LBe/t;->c:J

    iget v4, p0, LBe/t;->d:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LBe/u;->a(Landroidx/compose/ui/e;Ljava/lang/String;JILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
