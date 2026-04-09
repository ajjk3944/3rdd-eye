.class public final Lj6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj6/c;->a(FFLa6/a;)Lj6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:F

.field private final b:F

.field private final c:La6/a;


# direct methods
.method constructor <init>(FFLa6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj6/c$a;->a:F

    iput p2, p0, Lj6/c$a;->b:F

    iput-object p3, p0, Lj6/c$a;->c:La6/a;

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    invoke-static {p0}, Lj6/b$a;->c(Lj6/b;)F

    move-result v0

    return v0
.end method

.method public b()F
    .locals 1

    invoke-static {p0}, Lj6/b$a;->b(Lj6/b;)F

    move-result v0

    return v0
.end method

.method public c(F)Lj6/b;
    .locals 0

    invoke-static {p0, p1}, Lj6/b$a;->d(Lj6/b;F)Lj6/b;

    move-result-object p1

    return-object p1
.end method

.method public d()La6/a;
    .locals 1

    iget-object v0, p0, Lj6/c$a;->c:La6/a;

    return-object v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lj6/c$a;->b:F

    return v0
.end method

.method public f()F
    .locals 1

    invoke-static {p0}, Lj6/b$a;->a(Lj6/b;)F

    move-result v0

    return v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lj6/c$a;->a:F

    return v0
.end method
