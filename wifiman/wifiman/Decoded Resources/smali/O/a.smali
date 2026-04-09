.class final LO/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LO/a;->a:F

    iput p2, p0, LO/a;->b:F

    iput p3, p0, LO/a;->c:F

    iput p4, p0, LO/a;->d:F

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, LO/a;->c:F

    return v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, LO/a;->a:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, LO/a;->d:F

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, LO/a;->b:F

    return v0
.end method
