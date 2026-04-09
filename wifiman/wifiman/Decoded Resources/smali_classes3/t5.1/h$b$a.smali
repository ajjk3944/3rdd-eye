.class Lt5/h$b$a;
.super Lt5/h$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt5/h$b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lt5/h$b;


# direct methods
.method constructor <init>(Lt5/h$b;)V
    .locals 0

    iput-object p1, p0, Lt5/h$b$a;->e:Lt5/h$b;

    iget-object p1, p1, Lt5/h$b;->a:Lt5/h;

    invoke-direct {p0, p1}, Lt5/h$d;-><init>(Lt5/h;)V

    return-void
.end method


# virtual methods
.method public c()Ljava/util/Map$Entry;
    .locals 1

    invoke-virtual {p0}, Lt5/h$d;->a()Lt5/h$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt5/h$b$a;->c()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
