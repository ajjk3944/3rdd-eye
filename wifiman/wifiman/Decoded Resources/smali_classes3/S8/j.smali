.class public final LS8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/j$a;,
        LS8/j$b;
    }
.end annotation


# static fields
.field public static final c:LS8/j$a;


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS8/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS8/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LS8/j;->c:LS8/j$a;

    return-void
.end method

.method private constructor <init>(Ljava/util/Set;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS8/j;->a:Ljava/util/Set;

    .line 3
    new-instance p1, LS8/j$c;

    invoke-direct {p1, p0}, LS8/j$c;-><init>(LS8/j;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LS8/j;->b:LYg/m;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS8/j;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LS8/j;->a:Ljava/util/Set;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, LS8/j;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LS8/j;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, LS8/j;->a:Ljava/util/Set;

    check-cast p1, LS8/j;

    iget-object p1, p1, LS8/j;->a:Ljava/util/Set;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LS8/j;->a:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
