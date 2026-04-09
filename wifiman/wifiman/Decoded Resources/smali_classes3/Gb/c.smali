.class public final LGb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lph/d;


# instance fields
.field private final a:LGb/d;

.field private final b:Ljava/lang/String;

.field private final c:Lmh/l;

.field private final d:Lmh/l;

.field private e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LGb/d;Ljava/lang/String;Lmh/l;Lmh/l;)V
    .locals 1

    const-string/jumbo v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "serialize"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deserialize"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGb/c;->a:LGb/d;

    iput-object p2, p0, LGb/c;->b:Ljava/lang/String;

    iput-object p3, p0, LGb/c;->c:Lmh/l;

    iput-object p4, p0, LGb/c;->d:Lmh/l;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;
    .locals 4

    const-string/jumbo p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LGb/c;->e:Ljava/lang/Object;

    if-nez p1, :cond_1

    iget-object p1, p0, LGb/c;->a:LGb/d;

    iget-object p2, p0, LGb/c;->b:Ljava/lang/String;

    invoke-interface {p1, p2}, LGb/d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, LGb/c;->d:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, LSj/a;->a:LSj/a$b;

    iget-object v1, p0, LGb/c;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Storage value "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " deserialization failed"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1, v2}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    move-object p1, p2

    :cond_1
    :goto_0
    return-object p1
.end method

.method public b(Ljava/lang/Object;Lth/l;Ljava/lang/Object;)V
    .locals 0

    const-string/jumbo p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, LGb/c;->e:Ljava/lang/Object;

    if-eqz p3, :cond_0

    iget-object p1, p0, LGb/c;->c:Lmh/l;

    invoke-interface {p1, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, LGb/c;->a:LGb/d;

    iget-object p3, p0, LGb/c;->b:Ljava/lang/String;

    invoke-interface {p2, p3, p1}, LGb/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
