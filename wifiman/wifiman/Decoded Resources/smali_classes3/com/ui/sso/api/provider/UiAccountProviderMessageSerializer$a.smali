.class public final Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$a;


# instance fields
.field private final a:Lth/p;

.field private final b:Laj/b;

.field private final c:Laj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->d:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$a;

    return-void
.end method

.method public constructor <init>(Lth/p;)V
    .locals 2

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->a:Lth/p;

    sget-object p1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$c;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$c;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, p1, v1, v0}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->b:Laj/b;

    sget-object p1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$b;->a:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a$b;

    invoke-static {v0, p1, v1, v0}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->c:Laj/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    const-string/jumbo v0, "json deserialization failed"

    const-string/jumbo v1, "msgStr"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, p0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->c:Laj/b;

    iget-object v2, p0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->a:Lth/p;

    invoke-static {v2}, LVi/w;->e(Lth/p;)LVi/b;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    new-instance v1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;

    invoke-direct {v1, v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_1
    new-instance v1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;

    invoke-direct {v1, v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_2
    new-instance v1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;

    invoke-direct {v1, v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    const-string/jumbo v0, "json serialization failed"

    :try_start_0
    iget-object v1, p0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->b:Laj/b;

    iget-object v2, p0, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$a;->a:Lth/p;

    invoke-static {v2}, LVi/w;->e(Lth/p;)LVi/b;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Laj/b;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance v1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;

    invoke-direct {v1, v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_1
    new-instance v1, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;

    invoke-direct {v1, v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
