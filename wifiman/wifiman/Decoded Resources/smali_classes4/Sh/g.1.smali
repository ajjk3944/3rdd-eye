.class public final LSh/g;
.super LSh/e$a;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1

    const-string v0, "memberAnnotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertyConstants"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationParametersDefaultValues"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LSh/e$a;-><init>()V

    iput-object p1, p0, LSh/g;->a:Ljava/util/Map;

    iput-object p2, p0, LSh/g;->b:Ljava/util/Map;

    iput-object p3, p0, LSh/g;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LSh/g;->a:Ljava/util/Map;

    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LSh/g;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LSh/g;->b:Ljava/util/Map;

    return-object v0
.end method
