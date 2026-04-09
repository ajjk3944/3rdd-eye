.class Lpi/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lpi/v0;

.field private final b:Ljava/util/List;

.field private final c:Lpi/r0;

.field private final d:Z

.field private final e:Lii/k;


# direct methods
.method public constructor <init>(Lpi/v0;Ljava/util/List;Lpi/r0;ZLii/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/U;->a:Lpi/v0;

    iput-object p2, p0, Lpi/U;->b:Ljava/util/List;

    iput-object p3, p0, Lpi/U;->c:Lpi/r0;

    iput-boolean p4, p0, Lpi/U;->d:Z

    iput-object p5, p0, Lpi/U;->e:Lii/k;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lpi/U;->a:Lpi/v0;

    iget-object v1, p0, Lpi/U;->b:Ljava/util/List;

    iget-object v2, p0, Lpi/U;->c:Lpi/r0;

    iget-boolean v3, p0, Lpi/U;->d:Z

    iget-object v4, p0, Lpi/U;->e:Lii/k;

    move-object v5, p1

    check-cast v5, Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-static/range {v0 .. v5}, Lpi/V;->b(Lpi/v0;Ljava/util/List;Lpi/r0;ZLii/k;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method
