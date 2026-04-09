.class final LTe/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:Lm0/V0;


# direct methods
.method public constructor <init>(FFFLm0/V0;)V
    .locals 1

    const-string v0, "linePathEffect"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LTe/f;->a:F

    iput p2, p0, LTe/f;->b:F

    iput p3, p0, LTe/f;->c:F

    iput-object p4, p0, LTe/f;->d:Lm0/V0;

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, LTe/f;->b:F

    return v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, LTe/f;->a:F

    return v0
.end method

.method public final c()Lm0/V0;
    .locals 1

    iget-object v0, p0, LTe/f;->d:Lm0/V0;

    return-object v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, LTe/f;->c:F

    return v0
.end method
