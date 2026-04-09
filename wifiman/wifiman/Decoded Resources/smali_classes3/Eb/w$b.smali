.class public final LEb/w$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEb/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LEb/w$b;-><init>()V

    return-void
.end method

.method private final synthetic a()LVi/b;
    .locals 1

    invoke-static {}, LEb/w;->d()LYg/m;

    move-result-object v0

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVi/b;

    return-object v0
.end method


# virtual methods
.method public final b()Lcj/e;
    .locals 1

    invoke-static {}, LEb/w;->e()Lcj/e;

    move-result-object v0

    return-object v0
.end method

.method public final serializer()LVi/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVi/b;"
        }
    .end annotation

    invoke-direct {p0}, LEb/w$b;->a()LVi/b;

    move-result-object v0

    return-object v0
.end method
