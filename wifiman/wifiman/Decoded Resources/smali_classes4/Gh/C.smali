.class public final LGh/C;
.super LGh/E;
.source "SourceFile"

# interfaces
.implements LQh/v;


# instance fields
.field private final b:Ljava/lang/Class;

.field private final c:Ljava/util/Collection;

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "reflectType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LGh/E;-><init>()V

    iput-object p1, p0, LGh/C;->b:Ljava/lang/Class;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iput-object p1, p0, LGh/C;->c:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public bridge synthetic R()Ljava/lang/reflect/Type;
    .locals 1

    invoke-virtual {p0}, LGh/C;->S()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method protected S()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LGh/C;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public getAnnotations()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LGh/C;->c:Ljava/util/Collection;

    return-object v0
.end method

.method public getType()Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 2

    invoke-virtual {p0}, LGh/C;->S()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LGh/C;->S()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgi/e;->get(Ljava/lang/String;)Lgi/e;

    move-result-object v0

    invoke-virtual {v0}, Lgi/e;->getPrimitiveType()Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, LGh/C;->d:Z

    return v0
.end method
