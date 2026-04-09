.class public abstract LH5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH5/e$a;
    }
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
    invoke-direct {p0}, LH5/e;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(LVi/a;Lokhttp3/ResponseBody;)Ljava/lang/Object;
.end method

.method protected abstract b()LVi/l;
.end method

.method public final c(Ljava/lang/reflect/Type;)LVi/b;
    .locals 1

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LH5/e;->b()LVi/l;

    move-result-object v0

    invoke-interface {v0}, LVi/l;->a()Lcj/e;

    move-result-object v0

    invoke-static {v0, p1}, LVi/w;->b(Lcj/e;Ljava/lang/reflect/Type;)LVi/b;

    move-result-object p1

    return-object p1
.end method

.method public abstract d(Lokhttp3/MediaType;LVi/o;Ljava/lang/Object;)Lokhttp3/RequestBody;
.end method
