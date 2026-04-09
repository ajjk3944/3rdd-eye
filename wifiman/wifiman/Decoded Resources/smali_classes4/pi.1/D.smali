.class public final Lpi/D;
.super Lpi/E0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/D$a;
    }
.end annotation


# static fields
.field public static final e:Lpi/D$a;


# instance fields
.field private final c:Lpi/E0;

.field private final d:Lpi/E0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpi/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpi/D$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpi/D;->e:Lpi/D$a;

    return-void
.end method

.method private constructor <init>(Lpi/E0;Lpi/E0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lpi/E0;-><init>()V

    .line 3
    iput-object p1, p0, Lpi/D;->c:Lpi/E0;

    .line 4
    iput-object p2, p0, Lpi/D;->d:Lpi/E0;

    return-void
.end method

.method public synthetic constructor <init>(Lpi/E0;Lpi/E0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lpi/D;-><init>(Lpi/E0;Lpi/E0;)V

    return-void
.end method

.method public static final i(Lpi/E0;Lpi/E0;)Lpi/E0;
    .locals 1

    sget-object v0, Lpi/D;->e:Lpi/D$a;

    invoke-virtual {v0, p0, p1}, Lpi/D$a;->a(Lpi/E0;Lpi/E0;)Lpi/E0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lpi/D;->c:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lpi/D;->d:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lpi/D;->c:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lpi/D;->d:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public d(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 2

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpi/D;->d:Lpi/E0;

    iget-object v1, p0, Lpi/D;->c:Lpi/E0;

    invoke-virtual {v1, p1}, Lpi/E0;->d(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpi/E0;->d(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    return-object p1
.end method

.method public e(Lpi/S;)Lpi/B0;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpi/D;->c:Lpi/E0;

    invoke-virtual {v0, p1}, Lpi/E0;->e(Lpi/S;)Lpi/B0;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lpi/D;->d:Lpi/E0;

    invoke-virtual {v0, p1}, Lpi/E0;->e(Lpi/S;)Lpi/B0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(Lpi/S;Lpi/N0;)Lpi/S;
    .locals 2

    const-string v0, "topLevelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpi/D;->d:Lpi/E0;

    iget-object v1, p0, Lpi/D;->c:Lpi/E0;

    invoke-virtual {v1, p1, p2}, Lpi/E0;->g(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lpi/E0;->g(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
