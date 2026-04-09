.class public abstract Lbj/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Laj/b;Lbj/o;LVi/o;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbj/F;

    sget-object v1, Lbj/M;->OBJ:Lbj/M;

    invoke-static {}, Lbj/M;->getEntries()Lfh/a;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Laj/t;

    invoke-direct {v0, p1, p0, v1, v2}, Lbj/F;-><init>(Lbj/o;Laj/b;Lbj/M;[Laj/t;)V

    invoke-virtual {v0, p2, p3}, Lbj/F;->z(LVi/o;Ljava/lang/Object;)V

    return-void
.end method
