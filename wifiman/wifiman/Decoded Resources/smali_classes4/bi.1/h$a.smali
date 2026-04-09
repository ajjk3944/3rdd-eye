.class Lbi/h$a;
.super LDh/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbi/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(LBh/e;LBh/g0;Z)V
    .locals 8

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lbi/h$a;->I(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, Lbi/h$a;->I(I)V

    :cond_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    const/4 v5, 0x1

    sget-object v6, LBh/b$a;->DECLARATION:LBh/b$a;

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, LDh/i;-><init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LBh/g0;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p3}, Lbi/i;->k(LBh/e;Z)LBh/u;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, LDh/i;->q1(Ljava/util/List;LBh/u;)LDh/i;

    return-void
.end method

.method private static synthetic I(I)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p0, v2, :cond_0

    const-string p0, "containingClass"

    aput-object p0, v0, v1

    goto :goto_0

    :cond_0
    const-string p0, "source"

    aput-object p0, v0, v1

    :goto_0
    const-string p0, "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor"

    aput-object p0, v0, v2

    const/4 p0, 0x2

    const-string v1, "<init>"

    aput-object v1, v0, p0

    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
