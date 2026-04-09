.class public final LE0/G$c;
.super LE0/G$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const-string v0, "Undefined intrinsics block and it is required"

    invoke-direct {p0, v0}, LE0/G$f;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LE0/G$c;->j(Landroidx/compose/ui/layout/m;Ljava/util/List;J)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, LC0/D;

    return-object p1
.end method

.method public j(Landroidx/compose/ui/layout/m;Ljava/util/List;J)Ljava/lang/Void;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Undefined measure and it is required"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
