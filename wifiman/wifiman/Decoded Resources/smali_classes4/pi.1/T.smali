.class Lpi/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lpi/v0;

.field private final b:Ljava/util/List;

.field private final c:Lpi/r0;

.field private final d:Z


# direct methods
.method public constructor <init>(Lpi/v0;Ljava/util/List;Lpi/r0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/T;->a:Lpi/v0;

    iput-object p2, p0, Lpi/T;->b:Ljava/util/List;

    iput-object p3, p0, Lpi/T;->c:Lpi/r0;

    iput-boolean p4, p0, Lpi/T;->d:Z

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpi/T;->a:Lpi/v0;

    iget-object v1, p0, Lpi/T;->b:Ljava/util/List;

    iget-object v2, p0, Lpi/T;->c:Lpi/r0;

    iget-boolean v3, p0, Lpi/T;->d:Z

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-static {v0, v1, v2, v3, p1}, Lpi/V;->a(Lpi/v0;Ljava/util/List;Lpi/r0;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method
