.class public final synthetic LBe/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Lmh/a;

.field public final synthetic d:J

.field public final synthetic e:Landroidx/compose/foundation/o;

.field public final synthetic f:Lmh/l;

.field public final synthetic g:LCi/c;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZLmh/a;JLandroidx/compose/foundation/o;Lmh/l;LCi/c;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/P;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, LBe/P;->b:Z

    iput-object p3, p0, LBe/P;->c:Lmh/a;

    iput-wide p4, p0, LBe/P;->d:J

    iput-object p6, p0, LBe/P;->e:Landroidx/compose/foundation/o;

    iput-object p7, p0, LBe/P;->f:Lmh/l;

    iput-object p8, p0, LBe/P;->g:LCi/c;

    iput p9, p0, LBe/P;->h:I

    iput p10, p0, LBe/P;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, LBe/P;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, LBe/P;->b:Z

    iget-object v2, p0, LBe/P;->c:Lmh/a;

    iget-wide v3, p0, LBe/P;->d:J

    iget-object v5, p0, LBe/P;->e:Landroidx/compose/foundation/o;

    iget-object v6, p0, LBe/P;->f:Lmh/l;

    iget-object v7, p0, LBe/P;->g:LCi/c;

    iget v8, p0, LBe/P;->h:I

    iget v9, p0, LBe/P;->i:I

    move-object v10, p1

    check-cast v10, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, LBe/U;->c(Landroidx/compose/ui/e;ZLmh/a;JLandroidx/compose/foundation/o;Lmh/l;LCi/c;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
