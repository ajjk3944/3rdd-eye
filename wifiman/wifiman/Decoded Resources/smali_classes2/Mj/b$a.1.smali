.class final LMj/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field static final a:LMj/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMj/b$a;

    invoke-direct {v0}, LMj/b$a;-><init>()V

    sput-object v0, LMj/b$a;->a:LMj/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p0, p1}, LMj/b$a;->b(Lokhttp3/ResponseBody;)Lokhttp3/ResponseBody;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)Lokhttp3/ResponseBody;
    .locals 1

    :try_start_0
    invoke-static {p1}, LMj/B;->a(Lokhttp3/ResponseBody;)Lokhttp3/ResponseBody;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    throw v0
.end method
