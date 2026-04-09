.class public final Lod/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lod/g$a;,
        Lod/g$b;
    }
.end annotation


# static fields
.field public static final c:Lod/g$a;

.field private static final d:I


# instance fields
.field private final a:LW7/d;

.field private b:Lod/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lod/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lod/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lod/g;->c:Lod/g$a;

    const/16 v0, 0xff

    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lod/g;->d:I

    return-void
.end method

.method public constructor <init>(LW7/d;Lod/g$b;)V
    .locals 1

    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stats"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod/g;->a:LW7/d;

    iput-object p2, p0, Lod/g;->b:Lod/g$b;

    return-void
.end method

.method public static final synthetic g()I
    .locals 1

    sget v0, Lod/g;->d:I

    return v0
.end method


# virtual methods
.method public bridge synthetic a()Ll7/c$b;
    .locals 1

    invoke-virtual {p0}, Lod/g;->h()Lod/g$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    invoke-static {p0}, Ll7/c$a;->a(Ll7/c;)I

    move-result v0

    return v0
.end method

.method public c()LW7/d;
    .locals 1

    iget-object v0, p0, Lod/g;->a:LW7/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lod/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lod/g;

    iget-object v1, p0, Lod/g;->a:LW7/d;

    iget-object v3, p1, Lod/g;->a:LW7/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lod/g;->b:Lod/g$b;

    iget-object p1, p1, Lod/g;->b:Lod/g$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public h()Lod/g$b;
    .locals 1

    iget-object v0, p0, Lod/g;->b:Lod/g$b;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lod/g;->a:LW7/d;

    invoke-virtual {v0}, LW7/d;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lod/g;->b:Lod/g$b;

    invoke-virtual {v1}, Lod/g$b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lod/g;->a:LW7/d;

    iget-object v1, p0, Lod/g;->b:Lod/g$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Floor(coordinates="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stats="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
