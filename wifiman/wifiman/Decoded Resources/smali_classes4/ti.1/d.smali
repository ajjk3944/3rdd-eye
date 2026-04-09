.class final Lti/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LBh/l0;

.field private final b:Lpi/S;

.field private final c:Lpi/S;


# direct methods
.method public constructor <init>(LBh/l0;Lpi/S;Lpi/S;)V
    .locals 1

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inProjection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outProjection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lti/d;->a:LBh/l0;

    iput-object p2, p0, Lti/d;->b:Lpi/S;

    iput-object p3, p0, Lti/d;->c:Lpi/S;

    return-void
.end method


# virtual methods
.method public final a()Lpi/S;
    .locals 1

    iget-object v0, p0, Lti/d;->b:Lpi/S;

    return-object v0
.end method

.method public final b()Lpi/S;
    .locals 1

    iget-object v0, p0, Lti/d;->c:Lpi/S;

    return-object v0
.end method

.method public final c()LBh/l0;
    .locals 1

    iget-object v0, p0, Lti/d;->a:LBh/l0;

    return-object v0
.end method

.method public final d()Z
    .locals 3

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/e;

    iget-object v1, p0, Lti/d;->b:Lpi/S;

    iget-object v2, p0, Lti/d;->c:Lpi/S;

    invoke-interface {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->c(Lpi/S;Lpi/S;)Z

    move-result v0

    return v0
.end method
