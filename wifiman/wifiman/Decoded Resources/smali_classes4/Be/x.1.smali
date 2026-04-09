.class public final synthetic LBe/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:J

.field public final synthetic c:Ls9/b;

.field public final synthetic d:Ls9/d;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;JLs9/b;Ls9/d;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/x;->a:Landroidx/compose/ui/e;

    iput-wide p2, p0, LBe/x;->b:J

    iput-object p4, p0, LBe/x;->c:Ls9/b;

    iput-object p5, p0, LBe/x;->d:Ls9/d;

    iput p6, p0, LBe/x;->e:I

    iput p7, p0, LBe/x;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LBe/x;->a:Landroidx/compose/ui/e;

    iget-wide v1, p0, LBe/x;->b:J

    iget-object v3, p0, LBe/x;->c:Ls9/b;

    iget-object v4, p0, LBe/x;->d:Ls9/d;

    iget v5, p0, LBe/x;->e:I

    iget v6, p0, LBe/x;->f:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LBe/y;->a(Landroidx/compose/ui/e;JLs9/b;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
