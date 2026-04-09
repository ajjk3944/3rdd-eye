.class final Lc7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# instance fields
.field private final a:Lb7/a;

.field private final b:Ljava/lang/Class;


# direct methods
.method constructor <init>(Lb7/a;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/c;->a:Lb7/a;

    iput-object p2, p0, Lc7/c;->b:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p0, p1}, Lc7/c;->b(Lokhttp3/ResponseBody;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lc7/c;->a:Lb7/a;

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->y()Lej/g;

    move-result-object v1

    iget-object v2, p0, Lc7/c;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lb7/a;->a(Lej/g;Ljava/lang/Class;)Ljava/lang/Object;

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
