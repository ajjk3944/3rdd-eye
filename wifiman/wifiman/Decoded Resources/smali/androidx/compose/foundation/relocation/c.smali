.class abstract synthetic Landroidx/compose/foundation/relocation/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LD/b;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/relocation/a;

    invoke-direct {v0}, Landroidx/compose/foundation/relocation/a;-><init>()V

    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/e;LD/b;)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;-><init>(LD/b;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
