.class public final synthetic LBe/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Landroidx/compose/foundation/o;

.field public final synthetic c:F

.field public final synthetic d:J

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(ZLandroidx/compose/foundation/o;FJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LBe/p;->a:Z

    iput-object p2, p0, LBe/p;->b:Landroidx/compose/foundation/o;

    iput p3, p0, LBe/p;->c:F

    iput-wide p4, p0, LBe/p;->d:J

    iput-boolean p6, p0, LBe/p;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-boolean v0, p0, LBe/p;->a:Z

    iget-object v1, p0, LBe/p;->b:Landroidx/compose/foundation/o;

    iget v2, p0, LBe/p;->c:F

    iget-wide v3, p0, LBe/p;->d:J

    iget-boolean v5, p0, LBe/p;->e:Z

    move-object v6, p1

    check-cast v6, Lo0/c;

    invoke-static/range {v0 .. v6}, LBe/q;->a(ZLandroidx/compose/foundation/o;FJZLo0/c;)LYg/J;

    move-result-object p1

    return-object p1
.end method
