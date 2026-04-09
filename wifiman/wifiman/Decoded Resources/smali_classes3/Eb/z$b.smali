.class public final LEb/z$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEb/z;
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
    invoke-direct {p0}, LEb/z$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LEb/z;
    .locals 2

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LEb/z;->c()Laj/b;

    move-result-object v0

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, LEb/z;->Companion:LEb/z$b;

    invoke-virtual {v1}, LEb/z$b;->serializer()LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEb/z;

    return-object p1
.end method

.method public final serializer()LVi/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVi/b;"
        }
    .end annotation

    sget-object v0, LEb/z$a;->a:LEb/z$a;

    return-object v0
.end method
