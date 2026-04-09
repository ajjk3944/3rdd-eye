.class final Lib/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib/d;->h(Ljava/lang/String;Ljava/util/List;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lib/d;

.field final synthetic b:Ljava/util/List;


# direct methods
.method constructor <init>(Lib/d;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lib/d$c;->a:Lib/d;

    iput-object p2, p0, Lib/d$c;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "uploadUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lib/d$c;->a:Lib/d;

    invoke-static {v0}, Lib/d;->d(Lib/d;)Lib/e;

    move-result-object v0

    iget-object v1, p0, Lib/d$c;->a:Lib/d;

    iget-object v2, p0, Lib/d$c;->b:Ljava/util/List;

    invoke-static {v1, v2}, Lib/d;->b(Lib/d;Ljava/util/List;)Lokhttp3/MultipartBody$Part;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lib/e;->a(Ljava/lang/String;Lokhttp3/MultipartBody$Part;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lib/d$c;->a(Ljava/lang/String;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
