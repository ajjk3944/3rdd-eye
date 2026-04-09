.class public final LDh/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDh/B;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/Set;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Set;Ljava/util/List;Ljava/util/Set;)V
    .locals 1

    const-string v0, "allDependencies"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modulesWhoseInternalsAreVisible"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directExpectedByDependencies"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allExpectedByDependencies"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDh/C;->a:Ljava/util/List;

    iput-object p2, p0, LDh/C;->b:Ljava/util/Set;

    iput-object p3, p0, LDh/C;->c:Ljava/util/List;

    iput-object p4, p0, LDh/C;->d:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LDh/C;->a:Ljava/util/List;

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LDh/C;->b:Ljava/util/Set;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LDh/C;->c:Ljava/util/List;

    return-object v0
.end method
